// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetPolicyRuleActionVersion {
    /**
     * @return The age in days after creation to tier blob version to archive storage.
     * 
     */
    private Integer changeTierToArchiveAfterDaysSinceCreation;
    /**
     * @return The age in days after creation to tier blob version to cool storage.
     * 
     */
    private Integer changeTierToCoolAfterDaysSinceCreation;
    /**
     * @return The age in days after creation to delete the blob version.
     * 
     */
    private Integer deleteAfterDaysSinceCreation;

    private GetPolicyRuleActionVersion() {}
    /**
     * @return The age in days after creation to tier blob version to archive storage.
     * 
     */
    public Integer changeTierToArchiveAfterDaysSinceCreation() {
        return this.changeTierToArchiveAfterDaysSinceCreation;
    }
    /**
     * @return The age in days after creation to tier blob version to cool storage.
     * 
     */
    public Integer changeTierToCoolAfterDaysSinceCreation() {
        return this.changeTierToCoolAfterDaysSinceCreation;
    }
    /**
     * @return The age in days after creation to delete the blob version.
     * 
     */
    public Integer deleteAfterDaysSinceCreation() {
        return this.deleteAfterDaysSinceCreation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyRuleActionVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer changeTierToArchiveAfterDaysSinceCreation;
        private Integer changeTierToCoolAfterDaysSinceCreation;
        private Integer deleteAfterDaysSinceCreation;
        public Builder() {}
        public Builder(GetPolicyRuleActionVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeTierToArchiveAfterDaysSinceCreation = defaults.changeTierToArchiveAfterDaysSinceCreation;
    	      this.changeTierToCoolAfterDaysSinceCreation = defaults.changeTierToCoolAfterDaysSinceCreation;
    	      this.deleteAfterDaysSinceCreation = defaults.deleteAfterDaysSinceCreation;
        }

        @CustomType.Setter
        public Builder changeTierToArchiveAfterDaysSinceCreation(Integer changeTierToArchiveAfterDaysSinceCreation) {
            this.changeTierToArchiveAfterDaysSinceCreation = Objects.requireNonNull(changeTierToArchiveAfterDaysSinceCreation);
            return this;
        }
        @CustomType.Setter
        public Builder changeTierToCoolAfterDaysSinceCreation(Integer changeTierToCoolAfterDaysSinceCreation) {
            this.changeTierToCoolAfterDaysSinceCreation = Objects.requireNonNull(changeTierToCoolAfterDaysSinceCreation);
            return this;
        }
        @CustomType.Setter
        public Builder deleteAfterDaysSinceCreation(Integer deleteAfterDaysSinceCreation) {
            this.deleteAfterDaysSinceCreation = Objects.requireNonNull(deleteAfterDaysSinceCreation);
            return this;
        }
        public GetPolicyRuleActionVersion build() {
            final var o = new GetPolicyRuleActionVersion();
            o.changeTierToArchiveAfterDaysSinceCreation = changeTierToArchiveAfterDaysSinceCreation;
            o.changeTierToCoolAfterDaysSinceCreation = changeTierToCoolAfterDaysSinceCreation;
            o.deleteAfterDaysSinceCreation = deleteAfterDaysSinceCreation;
            return o;
        }
    }
}