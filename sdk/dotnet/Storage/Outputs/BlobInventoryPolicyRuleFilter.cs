// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class BlobInventoryPolicyRuleFilter
    {
        /// <summary>
        /// A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn't support `pageBlob`.
        /// 
        /// &gt; **Note:** The `rules.*.schema_fields` for this rule has to include `BlobType` so that you can specify the `blob_types`.
        /// </summary>
        public readonly ImmutableArray<string> BlobTypes;
        /// <summary>
        /// A set of strings for blob prefixes to be excluded. Maximum of 10 blob prefixes.
        /// </summary>
        public readonly ImmutableArray<string> ExcludePrefixes;
        /// <summary>
        /// Includes blob versions in blob inventory or not? Defaults to `false`.
        /// 
        /// &gt; **Note:** The `rules.*.schema_fields` for this rule has to include `IsCurrentVersion` and `VersionId` so that you can specify the `include_blob_versions`.
        /// </summary>
        public readonly bool? IncludeBlobVersions;
        /// <summary>
        /// Includes deleted blobs in blob inventory or not? Defaults to `false`.
        /// 
        /// &gt; **Note:** If `rules.*.scope` is `Container`, the `rules.*.schema_fields` for this rule must include `Deleted`, `Version`, `DeletedTime`, and `RemainingRetentionDays` so that you can specify the `include_deleted`. If `rules.*.scope` is `Blob`, the `rules.*.schema_fields` must include `Deleted` and `RemainingRetentionDays` so that you can specify the `include_deleted`. If `rules.*.scope` is `Blob` and the storage account specified by `storage_account_id` has hierarchical namespaces enabled (`is_hns_enabled` is `true` on the storage account), the `rules.*.schema_fields` for this rule must include `Deleted`, `Version`, `DeletedTime`, and `RemainingRetentionDays` so that you can specify the `include_deleted`.
        /// </summary>
        public readonly bool? IncludeDeleted;
        /// <summary>
        /// Includes blob snapshots in blob inventory or not? Defaults to `false`.
        /// 
        /// &gt; **Note:** The `rules.*.schema_fields` for this rule has to include `Snapshot` so that you can specify the `include_snapshots`.
        /// </summary>
        public readonly bool? IncludeSnapshots;
        /// <summary>
        /// A set of strings for blob prefixes to be matched. Maximum of 10 blob prefixes.
        /// </summary>
        public readonly ImmutableArray<string> PrefixMatches;

        [OutputConstructor]
        private BlobInventoryPolicyRuleFilter(
            ImmutableArray<string> blobTypes,

            ImmutableArray<string> excludePrefixes,

            bool? includeBlobVersions,

            bool? includeDeleted,

            bool? includeSnapshots,

            ImmutableArray<string> prefixMatches)
        {
            BlobTypes = blobTypes;
            ExcludePrefixes = excludePrefixes;
            IncludeBlobVersions = includeBlobVersions;
            IncludeDeleted = includeDeleted;
            IncludeSnapshots = includeSnapshots;
            PrefixMatches = prefixMatches;
        }
    }
}
