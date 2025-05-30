// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.ManagementPolicyRuleFiltersMatchBlobIndexTag;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagementPolicyRuleFilters {
    /**
     * @return An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
     * 
     */
    private List<String> blobTypes;
    /**
     * @return A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
     * 
     * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
     * 
     */
    private @Nullable List<ManagementPolicyRuleFiltersMatchBlobIndexTag> matchBlobIndexTags;
    /**
     * @return An array of strings for prefixes to be matched.
     * 
     */
    private @Nullable List<String> prefixMatches;

    private ManagementPolicyRuleFilters() {}
    /**
     * @return An array of predefined values. Valid options are `blockBlob` and `appendBlob`.
     * 
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }
    /**
     * @return A `match_blob_index_tag` block as defined below. The block defines the blob index tag based filtering for blob objects.
     * 
     * &gt; **Note:** The `match_blob_index_tag` property requires enabling the `blobIndex` feature with [PSH or CLI commands](https://azure.microsoft.com/en-us/blog/manage-and-find-data-with-blob-index-for-azure-storage-now-in-preview/).
     * 
     */
    public List<ManagementPolicyRuleFiltersMatchBlobIndexTag> matchBlobIndexTags() {
        return this.matchBlobIndexTags == null ? List.of() : this.matchBlobIndexTags;
    }
    /**
     * @return An array of strings for prefixes to be matched.
     * 
     */
    public List<String> prefixMatches() {
        return this.prefixMatches == null ? List.of() : this.prefixMatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRuleFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> blobTypes;
        private @Nullable List<ManagementPolicyRuleFiltersMatchBlobIndexTag> matchBlobIndexTags;
        private @Nullable List<String> prefixMatches;
        public Builder() {}
        public Builder(ManagementPolicyRuleFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobTypes = defaults.blobTypes;
    	      this.matchBlobIndexTags = defaults.matchBlobIndexTags;
    	      this.prefixMatches = defaults.prefixMatches;
        }

        @CustomType.Setter
        public Builder blobTypes(List<String> blobTypes) {
            if (blobTypes == null) {
              throw new MissingRequiredPropertyException("ManagementPolicyRuleFilters", "blobTypes");
            }
            this.blobTypes = blobTypes;
            return this;
        }
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }
        @CustomType.Setter
        public Builder matchBlobIndexTags(@Nullable List<ManagementPolicyRuleFiltersMatchBlobIndexTag> matchBlobIndexTags) {

            this.matchBlobIndexTags = matchBlobIndexTags;
            return this;
        }
        public Builder matchBlobIndexTags(ManagementPolicyRuleFiltersMatchBlobIndexTag... matchBlobIndexTags) {
            return matchBlobIndexTags(List.of(matchBlobIndexTags));
        }
        @CustomType.Setter
        public Builder prefixMatches(@Nullable List<String> prefixMatches) {

            this.prefixMatches = prefixMatches;
            return this;
        }
        public Builder prefixMatches(String... prefixMatches) {
            return prefixMatches(List.of(prefixMatches));
        }
        public ManagementPolicyRuleFilters build() {
            final var _resultValue = new ManagementPolicyRuleFilters();
            _resultValue.blobTypes = blobTypes;
            _resultValue.matchBlobIndexTags = matchBlobIndexTags;
            _resultValue.prefixMatches = prefixMatches;
            return _resultValue;
        }
    }
}
