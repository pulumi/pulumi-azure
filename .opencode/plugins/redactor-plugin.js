/**
 * Value-preserving secret redaction plugin for Open-Inspect sandboxes.
 *
 * Fetches the redaction ruleset from the control plane (single source of
 * truth, shared with the DO-side SecretRedactor) and masks secrets with
 * reversible `[REDACTED:<rule-id>:<hash10>]` tokens in everything the model
 * and transcript see, restoring real values into write/shell tool args at the
 * execution boundary so workflows are not disrupted.
 *
 * Auto-loaded from .opencode/plugins/ — deployed only when the control plane
 * sets AGENT_REDACTOR_ENABLED. Thin wrapper by design: all logic lives in
 * _redactor-core.js, which stays at the image path (never copied into
 * .opencode/plugins/, where OpenCode would load it as a second plugin) and is
 * imported absolutely, mirroring how tools import _bridge-client.js.
 *
 * Fails open at every layer: a missing core, missing env, or failed rules
 * fetch yields no hooks and an unchanged agent.
 */

export const OpenInspectRedactor = async () => {
  try {
    const core = await import("/app/sandbox_runtime/plugins/_redactor-core.js");
    return await core.createRedactorHooks();
  } catch (error) {
    try {
      console.log(
        JSON.stringify({
          tag: "redactor.init_failed",
          error: error instanceof Error ? error.message : String(error),
        })
      );
    } catch {
      // Nothing left to do — fail open.
    }
    return {};
  }
};
