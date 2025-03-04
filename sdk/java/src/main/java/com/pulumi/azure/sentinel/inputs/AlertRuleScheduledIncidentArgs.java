// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentGroupingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class AlertRuleScheduledIncidentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleScheduledIncidentArgs Empty = new AlertRuleScheduledIncidentArgs();

    /**
     * Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    @Import(name="createIncidentEnabled", required=true)
    private Output<Boolean> createIncidentEnabled;

    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    public Output<Boolean> createIncidentEnabled() {
        return this.createIncidentEnabled;
    }

    /**
     * A `grouping` block as defined below.
     * 
     */
    @Import(name="grouping", required=true)
    private Output<AlertRuleScheduledIncidentGroupingArgs> grouping;

    /**
     * @return A `grouping` block as defined below.
     * 
     */
    public Output<AlertRuleScheduledIncidentGroupingArgs> grouping() {
        return this.grouping;
    }

    private AlertRuleScheduledIncidentArgs() {}

    private AlertRuleScheduledIncidentArgs(AlertRuleScheduledIncidentArgs $) {
        this.createIncidentEnabled = $.createIncidentEnabled;
        this.grouping = $.grouping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleScheduledIncidentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleScheduledIncidentArgs $;

        public Builder() {
            $ = new AlertRuleScheduledIncidentArgs();
        }

        public Builder(AlertRuleScheduledIncidentArgs defaults) {
            $ = new AlertRuleScheduledIncidentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createIncidentEnabled Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
         * 
         * @return builder
         * 
         */
        public Builder createIncidentEnabled(Output<Boolean> createIncidentEnabled) {
            $.createIncidentEnabled = createIncidentEnabled;
            return this;
        }

        /**
         * @param createIncidentEnabled Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
         * 
         * @return builder
         * 
         */
        public Builder createIncidentEnabled(Boolean createIncidentEnabled) {
            return createIncidentEnabled(Output.of(createIncidentEnabled));
        }

        /**
         * @param grouping A `grouping` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder grouping(Output<AlertRuleScheduledIncidentGroupingArgs> grouping) {
            $.grouping = grouping;
            return this;
        }

        /**
         * @param grouping A `grouping` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder grouping(AlertRuleScheduledIncidentGroupingArgs grouping) {
            return grouping(Output.of(grouping));
        }

        public AlertRuleScheduledIncidentArgs build() {
            if ($.createIncidentEnabled == null) {
                throw new MissingRequiredPropertyException("AlertRuleScheduledIncidentArgs", "createIncidentEnabled");
            }
            if ($.grouping == null) {
                throw new MissingRequiredPropertyException("AlertRuleScheduledIncidentArgs", "grouping");
            }
            return $;
        }
    }

}
