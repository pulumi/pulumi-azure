// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementPolicyRuleActionsVersion {
    /**
     * @return The age in days after creation to tier blob version to archive storage. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    private @Nullable Integer changeTierToArchiveAfterDaysSinceCreation;
    /**
     * @return The age in days creation create to tier blob version to cool storage. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    private @Nullable Integer changeTierToCoolAfterDaysSinceCreation;
    /**
     * @return The age in days after creation to delete the blob version. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    private @Nullable Integer deleteAfterDaysSinceCreation;
    /**
     * @return The age in days after last tier change to the blobs to skip to be archived. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    private @Nullable Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
    /**
     * @return The age in days after creation to cold storage. Supports blob currently at Hot tier. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    private @Nullable Integer tierToColdAfterDaysSinceCreationGreaterThan;

    private ManagementPolicyRuleActionsVersion() {}
    /**
     * @return The age in days after creation to tier blob version to archive storage. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    public Optional<Integer> changeTierToArchiveAfterDaysSinceCreation() {
        return Optional.ofNullable(this.changeTierToArchiveAfterDaysSinceCreation);
    }
    /**
     * @return The age in days creation create to tier blob version to cool storage. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    public Optional<Integer> changeTierToCoolAfterDaysSinceCreation() {
        return Optional.ofNullable(this.changeTierToCoolAfterDaysSinceCreation);
    }
    /**
     * @return The age in days after creation to delete the blob version. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    public Optional<Integer> deleteAfterDaysSinceCreation() {
        return Optional.ofNullable(this.deleteAfterDaysSinceCreation);
    }
    /**
     * @return The age in days after last tier change to the blobs to skip to be archived. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    public Optional<Integer> tierToArchiveAfterDaysSinceLastTierChangeGreaterThan() {
        return Optional.ofNullable(this.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan);
    }
    /**
     * @return The age in days after creation to cold storage. Supports blob currently at Hot tier. Must be between `0` and `99999`. Defaults to `-1`.
     * 
     */
    public Optional<Integer> tierToColdAfterDaysSinceCreationGreaterThan() {
        return Optional.ofNullable(this.tierToColdAfterDaysSinceCreationGreaterThan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRuleActionsVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer changeTierToArchiveAfterDaysSinceCreation;
        private @Nullable Integer changeTierToCoolAfterDaysSinceCreation;
        private @Nullable Integer deleteAfterDaysSinceCreation;
        private @Nullable Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
        private @Nullable Integer tierToColdAfterDaysSinceCreationGreaterThan;
        public Builder() {}
        public Builder(ManagementPolicyRuleActionsVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeTierToArchiveAfterDaysSinceCreation = defaults.changeTierToArchiveAfterDaysSinceCreation;
    	      this.changeTierToCoolAfterDaysSinceCreation = defaults.changeTierToCoolAfterDaysSinceCreation;
    	      this.deleteAfterDaysSinceCreation = defaults.deleteAfterDaysSinceCreation;
    	      this.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan = defaults.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
    	      this.tierToColdAfterDaysSinceCreationGreaterThan = defaults.tierToColdAfterDaysSinceCreationGreaterThan;
        }

        @CustomType.Setter
        public Builder changeTierToArchiveAfterDaysSinceCreation(@Nullable Integer changeTierToArchiveAfterDaysSinceCreation) {

            this.changeTierToArchiveAfterDaysSinceCreation = changeTierToArchiveAfterDaysSinceCreation;
            return this;
        }
        @CustomType.Setter
        public Builder changeTierToCoolAfterDaysSinceCreation(@Nullable Integer changeTierToCoolAfterDaysSinceCreation) {

            this.changeTierToCoolAfterDaysSinceCreation = changeTierToCoolAfterDaysSinceCreation;
            return this;
        }
        @CustomType.Setter
        public Builder deleteAfterDaysSinceCreation(@Nullable Integer deleteAfterDaysSinceCreation) {

            this.deleteAfterDaysSinceCreation = deleteAfterDaysSinceCreation;
            return this;
        }
        @CustomType.Setter
        public Builder tierToArchiveAfterDaysSinceLastTierChangeGreaterThan(@Nullable Integer tierToArchiveAfterDaysSinceLastTierChangeGreaterThan) {

            this.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan = tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
            return this;
        }
        @CustomType.Setter
        public Builder tierToColdAfterDaysSinceCreationGreaterThan(@Nullable Integer tierToColdAfterDaysSinceCreationGreaterThan) {

            this.tierToColdAfterDaysSinceCreationGreaterThan = tierToColdAfterDaysSinceCreationGreaterThan;
            return this;
        }
        public ManagementPolicyRuleActionsVersion build() {
            final var _resultValue = new ManagementPolicyRuleActionsVersion();
            _resultValue.changeTierToArchiveAfterDaysSinceCreation = changeTierToArchiveAfterDaysSinceCreation;
            _resultValue.changeTierToCoolAfterDaysSinceCreation = changeTierToCoolAfterDaysSinceCreation;
            _resultValue.deleteAfterDaysSinceCreation = deleteAfterDaysSinceCreation;
            _resultValue.tierToArchiveAfterDaysSinceLastTierChangeGreaterThan = tierToArchiveAfterDaysSinceLastTierChangeGreaterThan;
            _resultValue.tierToColdAfterDaysSinceCreationGreaterThan = tierToColdAfterDaysSinceCreationGreaterThan;
            return _resultValue;
        }
    }
}
