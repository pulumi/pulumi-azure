// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementPolicyRuleActionsSnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyRuleActionsSnapshotArgs Empty = new ManagementPolicyRuleActionsSnapshotArgs();

    /**
     * The age in days after creation to tier blob snapshot to archive storage. Must be between 0 and 99999.
     * 
     */
    @Import(name="changeTierToArchiveAfterDaysSinceCreation")
    private @Nullable Output<Integer> changeTierToArchiveAfterDaysSinceCreation;

    /**
     * @return The age in days after creation to tier blob snapshot to archive storage. Must be between 0 and 99999.
     * 
     */
    public Optional<Output<Integer>> changeTierToArchiveAfterDaysSinceCreation() {
        return Optional.ofNullable(this.changeTierToArchiveAfterDaysSinceCreation);
    }

    /**
     * The age in days after creation to tier blob snapshot to cool storage. Must be between 0 and 99999.
     * 
     */
    @Import(name="changeTierToCoolAfterDaysSinceCreation")
    private @Nullable Output<Integer> changeTierToCoolAfterDaysSinceCreation;

    /**
     * @return The age in days after creation to tier blob snapshot to cool storage. Must be between 0 and 99999.
     * 
     */
    public Optional<Output<Integer>> changeTierToCoolAfterDaysSinceCreation() {
        return Optional.ofNullable(this.changeTierToCoolAfterDaysSinceCreation);
    }

    /**
     * The age in days after creation to delete the blob snapshot. Must be between 0 and 99999.
     * 
     */
    @Import(name="deleteAfterDaysSinceCreationGreaterThan")
    private @Nullable Output<Integer> deleteAfterDaysSinceCreationGreaterThan;

    /**
     * @return The age in days after creation to delete the blob snapshot. Must be between 0 and 99999.
     * 
     */
    public Optional<Output<Integer>> deleteAfterDaysSinceCreationGreaterThan() {
        return Optional.ofNullable(this.deleteAfterDaysSinceCreationGreaterThan);
    }

    private ManagementPolicyRuleActionsSnapshotArgs() {}

    private ManagementPolicyRuleActionsSnapshotArgs(ManagementPolicyRuleActionsSnapshotArgs $) {
        this.changeTierToArchiveAfterDaysSinceCreation = $.changeTierToArchiveAfterDaysSinceCreation;
        this.changeTierToCoolAfterDaysSinceCreation = $.changeTierToCoolAfterDaysSinceCreation;
        this.deleteAfterDaysSinceCreationGreaterThan = $.deleteAfterDaysSinceCreationGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyRuleActionsSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyRuleActionsSnapshotArgs $;

        public Builder() {
            $ = new ManagementPolicyRuleActionsSnapshotArgs();
        }

        public Builder(ManagementPolicyRuleActionsSnapshotArgs defaults) {
            $ = new ManagementPolicyRuleActionsSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeTierToArchiveAfterDaysSinceCreation The age in days after creation to tier blob snapshot to archive storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToArchiveAfterDaysSinceCreation(@Nullable Output<Integer> changeTierToArchiveAfterDaysSinceCreation) {
            $.changeTierToArchiveAfterDaysSinceCreation = changeTierToArchiveAfterDaysSinceCreation;
            return this;
        }

        /**
         * @param changeTierToArchiveAfterDaysSinceCreation The age in days after creation to tier blob snapshot to archive storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToArchiveAfterDaysSinceCreation(Integer changeTierToArchiveAfterDaysSinceCreation) {
            return changeTierToArchiveAfterDaysSinceCreation(Output.of(changeTierToArchiveAfterDaysSinceCreation));
        }

        /**
         * @param changeTierToCoolAfterDaysSinceCreation The age in days after creation to tier blob snapshot to cool storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToCoolAfterDaysSinceCreation(@Nullable Output<Integer> changeTierToCoolAfterDaysSinceCreation) {
            $.changeTierToCoolAfterDaysSinceCreation = changeTierToCoolAfterDaysSinceCreation;
            return this;
        }

        /**
         * @param changeTierToCoolAfterDaysSinceCreation The age in days after creation to tier blob snapshot to cool storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToCoolAfterDaysSinceCreation(Integer changeTierToCoolAfterDaysSinceCreation) {
            return changeTierToCoolAfterDaysSinceCreation(Output.of(changeTierToCoolAfterDaysSinceCreation));
        }

        /**
         * @param deleteAfterDaysSinceCreationGreaterThan The age in days after creation to delete the blob snapshot. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDaysSinceCreationGreaterThan(@Nullable Output<Integer> deleteAfterDaysSinceCreationGreaterThan) {
            $.deleteAfterDaysSinceCreationGreaterThan = deleteAfterDaysSinceCreationGreaterThan;
            return this;
        }

        /**
         * @param deleteAfterDaysSinceCreationGreaterThan The age in days after creation to delete the blob snapshot. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDaysSinceCreationGreaterThan(Integer deleteAfterDaysSinceCreationGreaterThan) {
            return deleteAfterDaysSinceCreationGreaterThan(Output.of(deleteAfterDaysSinceCreationGreaterThan));
        }

        public ManagementPolicyRuleActionsSnapshotArgs build() {
            return $;
        }
    }

}