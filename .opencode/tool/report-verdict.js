/**
 * This file ships verbatim into the sandbox image and cannot import from the
 * workspace. The decision enum mirrors VERDICT_DECISIONS in
 * @open-inspect/shared by hand.
 */
import { tool } from "@opencode-ai/plugin";
import { z } from "zod";
import { bridgeFetch } from "/app/sandbox_runtime/tools/_bridge-client.js";

export default tool({
  name: "report-verdict",
  description:
    "Report the decision of a PR review you just submitted. Call this exactly once, immediately AFTER GitHub accepts your review submission (gh api .../reviews) — never before, and never for reviews you did not submit. The decision must match the review event you actually submitted. The rationale (1-3 sentences) must name the specific signal behind the decision — never a category label like 'touches infra' — and is shown to the requester on the progress comment.",
  args: {
    decision: z
      .enum(["approve", "request_changes", "comment"])
      .describe("The review event you submitted: approve, request_changes, or comment."),
    rationale: z
      .string()
      .describe(
        "1-3 sentences naming the specific signal behind the decision (max 1000 characters). For approvals, note that this is an automated low-risk assessment."
      ),
  },
  async execute(args) {
    let response;
    try {
      response = await bridgeFetch("/report-verdict", {
        method: "POST",
        body: JSON.stringify({ decision: args.decision, rationale: args.rationale }),
      });
    } catch (error) {
      const message = error instanceof Error ? error.message : String(error);
      return JSON.stringify({
        ok: false,
        reason: "bridge_error",
        agentMessage: `Could not reach the control plane to report the verdict. (${message}) Continue; do not retry.`,
      });
    }

    try {
      const result = await response.json();
      return JSON.stringify(result);
    } catch {
      return JSON.stringify({
        ok: false,
        reason: "bridge_error",
        agentMessage: "Control plane returned a non-JSON response. Continue; do not retry.",
      });
    }
  },
});
