// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersMatchBlobIndexTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementPolicyRuleFiltersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyRuleFiltersArgs Empty = new ManagementPolicyRuleFiltersArgs();

    /**
     * An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
     * 
     */
    @Import(name="blobTypes", required=true)
    private Output<List<String>> blobTypes;

    /**
     * @return An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
     * 
     */
    public Output<List<String>> blobTypes() {
        return this.blobTypes;
    }

    /**
     * A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
     * 
     * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
     * 
     */
    @Import(name="matchBlobIndexTags")
    private @Nullable Output<List<ManagementPolicyRuleFiltersMatchBlobIndexTagArgs>> matchBlobIndexTags;

    /**
     * @return A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
     * 
     * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
     * 
     */
    public Optional<Output<List<ManagementPolicyRuleFiltersMatchBlobIndexTagArgs>>> matchBlobIndexTags() {
        return Optional.ofNullable(this.matchBlobIndexTags);
    }

    /**
     * An array of strings for prefixes to be matched.
     * 
     */
    @Import(name="prefixMatches")
    private @Nullable Output<List<String>> prefixMatches;

    /**
     * @return An array of strings for prefixes to be matched.
     * 
     */
    public Optional<Output<List<String>>> prefixMatches() {
        return Optional.ofNullable(this.prefixMatches);
    }

    private ManagementPolicyRuleFiltersArgs() {}

    private ManagementPolicyRuleFiltersArgs(ManagementPolicyRuleFiltersArgs $) {
        this.blobTypes = $.blobTypes;
        this.matchBlobIndexTags = $.matchBlobIndexTags;
        this.prefixMatches = $.prefixMatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyRuleFiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyRuleFiltersArgs $;

        public Builder() {
            $ = new ManagementPolicyRuleFiltersArgs();
        }

        public Builder(ManagementPolicyRuleFiltersArgs defaults) {
            $ = new ManagementPolicyRuleFiltersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobTypes An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
         * 
         * @return builder
         * 
         */
        public Builder blobTypes(Output<List<String>> blobTypes) {
            $.blobTypes = blobTypes;
            return this;
        }

        /**
         * @param blobTypes An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
         * 
         * @return builder
         * 
         */
        public Builder blobTypes(List<String> blobTypes) {
            return blobTypes(Output.of(blobTypes));
        }

        /**
         * @param blobTypes An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
         * 
         * @return builder
         * 
         */
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }

        /**
         * @param matchBlobIndexTags A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
         * 
         * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
         * 
         * @return builder
         * 
         */
        public Builder matchBlobIndexTags(@Nullable Output<List<ManagementPolicyRuleFiltersMatchBlobIndexTagArgs>> matchBlobIndexTags) {
            $.matchBlobIndexTags = matchBlobIndexTags;
            return this;
        }

        /**
         * @param matchBlobIndexTags A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
         * 
         * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
         * 
         * @return builder
         * 
         */
        public Builder matchBlobIndexTags(List<ManagementPolicyRuleFiltersMatchBlobIndexTagArgs> matchBlobIndexTags) {
            return matchBlobIndexTags(Output.of(matchBlobIndexTags));
        }

        /**
         * @param matchBlobIndexTags A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
         * 
         * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
         * 
         * @return builder
         * 
         */
        public Builder matchBlobIndexTags(ManagementPolicyRuleFiltersMatchBlobIndexTagArgs... matchBlobIndexTags) {
            return matchBlobIndexTags(List.of(matchBlobIndexTags));
        }

        /**
         * @param prefixMatches An array of strings for prefixes to be matched.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatches(@Nullable Output<List<String>> prefixMatches) {
            $.prefixMatches = prefixMatches;
            return this;
        }

        /**
         * @param prefixMatches An array of strings for prefixes to be matched.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatches(List<String> prefixMatches) {
            return prefixMatches(Output.of(prefixMatches));
        }

        /**
         * @param prefixMatches An array of strings for prefixes to be matched.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatches(String... prefixMatches) {
            return prefixMatches(List.of(prefixMatches));
        }

        public ManagementPolicyRuleFiltersArgs build() {
            if ($.blobTypes == null) {
                throw new MissingRequiredPropertyException("ManagementPolicyRuleFiltersArgs", "blobTypes");
            }
            return $;
        }
    }

}
