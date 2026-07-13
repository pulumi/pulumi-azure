/**
 * Anthropic Auth Broker Plugin for Open-Inspect.
 *
 * Overrides OpenCode's built-in anthropic provider auth to source the credential from the control
 * plane's broker endpoint instead of a static env var. The token is cached in memory and refreshed
 * only within an expiry buffer, so a short-lived WIF token rotates mid-session WITHOUT re-exchanging
 * on every request (mirrors codex-auth-plugin).
 *
 * Auto-loaded from .opencode/plugins/ — OpenCode discovers project plugins and deduplicates by
 * provider ID (last wins), so this replaces the built-in. Deployed only when the control plane sets
 * ANTHROPIC_WIF_ENABLED (i.e. the repo has a brokered Anthropic OIDC provider).
 *
 * The fetch wrapper also logs the Anthropic request-id + rate-limit headers per call, so
 * upstream/SSE failures are traceable in Modal logs (the request-id lives in HTTP response headers,
 * which never cross OpenCode's event bus). This is folded in here rather than a separate
 * unconditional plugin because WIF is becoming the global path. See docs/anthropic-credential-broker.md.
 */

const REFRESH_BUFFER_MS = 5 * 60 * 1000; // refresh 5 minutes before expiry
const DUMMY_KEY = "opencode-brokered-dummy-key";

// Client-side retry for the control-plane token fetch.
const TOKEN_FETCH_RETRY_DELAYS_MS = [500, 1500]; // 2 retries after the first attempt (3 total)
const TOKEN_FETCH_MAX_ATTEMPTS = TOKEN_FETCH_RETRY_DELAYS_MS.length + 1;
const RETRYABLE_HTTP_STATUSES = new Set([408, 429, 500, 502, 503, 504]);

function sleep(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

// In-memory cache (reset on sandbox restart — fresh fetch via the broker).
let cachedToken = null;
let cachedTokenType = "api_key"; // "api_key" → x-api-key; "bearer" → Authorization: Bearer
let cachedExpiresAt = 0;

function getSessionId() {
  try {
    const config = JSON.parse(process.env.SESSION_CONFIG || "{}");
    return config.sessionId || config.session_id || "";
  } catch {
    return "";
  }
}

async function requestTokenOnce(controlPlaneUrl, authToken, sessionId) {
  const response = await fetch(`${controlPlaneUrl}/sessions/${sessionId}/anthropic-token-refresh`, {
    method: "POST",
    headers: { Authorization: `Bearer ${authToken}` },
  });

  if (!response.ok) {
    const body = (await response.text()).slice(0, 200);
    const error = new Error(`Anthropic token fetch failed (${response.status}): ${body}`);
    // Tag HTTP failures with whether a retry could plausibly help, decided by status.
    error.retryable = RETRYABLE_HTTP_STATUSES.has(response.status);
    throw error;
  }

  return response.json();
}

async function fetchFromControlPlane() {
  const controlPlaneUrl = process.env.CONTROL_PLANE_URL;
  const authToken = process.env.SANDBOX_AUTH_TOKEN;
  const sessionId = getSessionId();

  if (!controlPlaneUrl || !authToken || !sessionId) {
    throw new Error(
      "Missing environment for Anthropic token fetch: " +
        [
          !controlPlaneUrl && "CONTROL_PLANE_URL",
          !authToken && "SANDBOX_AUTH_TOKEN",
          !sessionId && "SESSION_CONFIG.sessionId",
        ]
          .filter(Boolean)
          .join(", ")
    );
  }

  for (let attempt = 1; attempt <= TOKEN_FETCH_MAX_ATTEMPTS; attempt++) {
    try {
      return await requestTokenOnce(controlPlaneUrl, authToken, sessionId);
    } catch (error) {
      const retryable = error?.retryable ?? true;
      if (!retryable || attempt === TOKEN_FETCH_MAX_ATTEMPTS) {
        throw error;
      }

      const delayMs = TOKEN_FETCH_RETRY_DELAYS_MS[attempt - 1];
      console.log(
        JSON.stringify({
          tag: "anthropic.token_refresh_retry",
          session_id: sessionId,
          attempt,
          max_attempts: TOKEN_FETCH_MAX_ATTEMPTS,
          delay_ms: delayMs,
          error: error instanceof Error ? error.message : String(error),
        })
      );
      await sleep(delayMs);
    }
  }

  // Unreachable: the loop returns on success or throws on the final attempt.
  throw new Error("Anthropic token fetch retry loop exited unexpectedly");
}

async function ensureToken() {
  const now = Date.now();
  if (cachedToken && cachedExpiresAt - now > REFRESH_BUFFER_MS) {
    return { token: cachedToken, tokenType: cachedTokenType };
  }

  const result = await fetchFromControlPlane();
  cachedToken = result.access_token;
  cachedTokenType = result.token_type === "bearer" ? "bearer" : "api_key";
  cachedExpiresAt = now + (result.expires_in ?? 3600) * 1000;
  return { token: cachedToken, tokenType: cachedTokenType };
}

export const AnthropicAuthProxy = async () => {
  return {
    auth: {
      provider: "anthropic",
      methods: [],
      async loader() {
        return {
          // Dummy key so the SDK constructs; the real credential is set per request below.
          apiKey: DUMMY_KEY,
          async fetch(requestInput, init) {
            const { token, tokenType } = await ensureToken();

            const headers = new Headers(init?.headers);
            // Strip whatever the SDK set from the dummy key, then set the real credential.
            headers.delete("authorization");
            headers.delete("Authorization");
            headers.delete("x-api-key");
            headers.delete("X-Api-Key");
            if (tokenType === "bearer") {
              headers.set("authorization", `Bearer ${token}`);
            } else {
              headers.set("x-api-key", token);
            }

            const startedAt = Date.now();
            try {
              const res = await fetch(requestInput, { ...init, headers });
              // Log the request-id + rate-limit headers for upstream/SSE tracing. Reading headers
              // does NOT consume the streaming body, so this is pass-through.
              console.log(
                JSON.stringify({
                  tag: "anthropic.request",
                  session_id: getSessionId(),
                  request_id: res.headers.get("request-id"),
                  status: res.status,
                  ttfb_ms: Date.now() - startedAt,
                  ratelimit_input_remaining: res.headers.get(
                    "anthropic-ratelimit-input-tokens-remaining"
                  ),
                  ratelimit_output_remaining: res.headers.get(
                    "anthropic-ratelimit-output-tokens-remaining"
                  ),
                })
              );
              return res;
            } catch (e) {
              console.log(
                JSON.stringify({
                  tag: "anthropic.request_error",
                  session_id: getSessionId(),
                  error: e instanceof Error ? e.message : String(e),
                  elapsed_ms: Date.now() - startedAt,
                })
              );
              throw e;
            }
          },
        };
      },
    },
  };
};
