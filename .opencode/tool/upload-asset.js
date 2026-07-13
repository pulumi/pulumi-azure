/**
 * Upload Asset Tool — upload a local file to the session and get a public URL.
 *
 * Useful for including screenshots in GitHub PR descriptions. The returned URL
 * is publicly accessible (no auth required) because the unguessable session +
 * asset ID combination serves as the access control.
 */
import { tool } from "@opencode-ai/plugin";
import { z } from "zod";
import { readFileSync } from "fs";
import { basename, extname } from "path";
import { bridgeFetch, extractError } from "/app/sandbox_runtime/tools/_bridge-client.js";

const CONTENT_TYPES = {
  ".png": "image/png",
  ".jpg": "image/jpeg",
  ".jpeg": "image/jpeg",
  ".gif": "image/gif",
  ".webp": "image/webp",
  // SVG is intentionally excluded: SVG files can contain <script> tags that
  // execute in the browser context of the serving origin, which would allow XSS.
};

export default tool({
  name: "upload-asset",
  description:
    "Upload a local file (e.g. a screenshot) and get back a PUBLICLY-reachable URL for embedding as an inline image in a GitHub PR description. Prefer the `upload-media` command for sharing screenshots in the session (private, rendered in the session timeline) — use this tool only when a public PR-embedded image is clearly useful or specifically requested. Caution: on public-visibility repositories the URL becomes world-visible once it is in a public PR or issue, so never upload images showing customer names, real user data, or sensitive internal UI.",
  args: {
    filePath: z
      .string()
      .describe("Absolute or relative path to the file to upload (e.g. /tmp/screenshot.png)."),
  },
  async execute(args) {
    let fileData;
    let filename;
    try {
      fileData = readFileSync(args.filePath);
      filename = basename(args.filePath);
    } catch (err) {
      return `Failed to read file: ${err instanceof Error ? err.message : String(err)}`;
    }

    const ext = extname(filename).toLowerCase();
    const contentType = CONTENT_TYPES[ext] || "image/png";

    try {
      const response = await bridgeFetch("/assets", {
        method: "POST",
        headers: {
          "Content-Type": contentType,
          "Content-Length": String(fileData.length),
          "X-Filename": filename,
        },
        body: fileData,
      });

      if (!response.ok) {
        const errorMessage = await extractError(response);
        return `Failed to upload asset: ${errorMessage} (HTTP ${response.status})`;
      }

      const result = await response.json();
      const url = result.url;
      if (!url) {
        return `Upload succeeded but no URL was returned: ${JSON.stringify(result)}`;
      }

      return [
        `Asset uploaded successfully.`,
        ``,
        `  Filename: ${result.filename || filename}`,
        `  URL:      ${url}`,
        ``,
        `Markdown image tag (paste into PR description):`,
        `  ![${result.filename || filename}](${url})`,
      ].join("\n");
    } catch (err) {
      return `Failed to upload asset: ${err instanceof Error ? err.message : String(err)}`;
    }
  },
});
