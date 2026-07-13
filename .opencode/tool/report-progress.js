/**
 * This file ships verbatim into the sandbox image and cannot import from the
 * workspace. The response envelope mirrors the control plane's
 * /sessions/:id/report-progress route by hand.
 */
import { tool } from "@opencode-ai/plugin";
import { z } from "zod";
import { bridgeFetch } from "/app/sandbox_runtime/tools/_bridge-client.js";

export default tool({
  name: "report-progress",
  description:
    "Report a progress checkpoint to the user on the surface that triggered this task (e.g. the GitHub PR/issue progress comment). Call this at meaningful milestones — after finishing investigation, after landing a significant change, when you hit a blocker — NOT after every step or tool call. One or two sentences, plain language, present tense. The server owns the comment formatting and the View-session footer; send only the note text. A response of delivered:false is normal (throttled, or the session's surface takes no progress updates) — do not retry.",
  args: {
    message: z
      .string()
      .describe(
        'The checkpoint note (1-2 sentences, max 500 characters). Example: "Root cause found: stale cache key in the D1 index — writing the fix now."'
      ),
  },
  async execute(args) {
    let response;
    try {
      response = await bridgeFetch("/report-progress", {
        method: "POST",
        body: JSON.stringify({ message: args.message }),
      });
    } catch (error) {
      const message = error instanceof Error ? error.message : String(error);
      return JSON.stringify({
        ok: false,
        reason: "bridge_error",
        agentMessage: `Could not reach the control plane to report progress. (${message}) Continue working; do not retry.`,
      });
    }

    try {
      const result = await response.json();
      return JSON.stringify(result);
    } catch {
      return JSON.stringify({
        ok: false,
        reason: "bridge_error",
        agentMessage: "Control plane returned a non-JSON response. Continue working; do not retry.",
      });
    }
  },
});
