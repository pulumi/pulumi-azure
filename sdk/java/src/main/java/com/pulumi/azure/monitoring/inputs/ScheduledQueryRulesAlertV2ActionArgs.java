// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledQueryRulesAlertV2ActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryRulesAlertV2ActionArgs Empty = new ScheduledQueryRulesAlertV2ActionArgs();

    /**
     * List of Action Group resource IDs to invoke when the alert fires.
     * 
     */
    @Import(name="actionGroups")
    private @Nullable Output<List<String>> actionGroups;

    /**
     * @return List of Action Group resource IDs to invoke when the alert fires.
     * 
     */
    public Optional<Output<List<String>>> actionGroups() {
        return Optional.ofNullable(this.actionGroups);
    }

    /**
     * Specifies the properties of an alert payload.
     * 
     */
    @Import(name="customProperties")
    private @Nullable Output<Map<String,String>> customProperties;

    /**
     * @return Specifies the properties of an alert payload.
     * 
     */
    public Optional<Output<Map<String,String>>> customProperties() {
        return Optional.ofNullable(this.customProperties);
    }

    private ScheduledQueryRulesAlertV2ActionArgs() {}

    private ScheduledQueryRulesAlertV2ActionArgs(ScheduledQueryRulesAlertV2ActionArgs $) {
        this.actionGroups = $.actionGroups;
        this.customProperties = $.customProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryRulesAlertV2ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryRulesAlertV2ActionArgs $;

        public Builder() {
            $ = new ScheduledQueryRulesAlertV2ActionArgs();
        }

        public Builder(ScheduledQueryRulesAlertV2ActionArgs defaults) {
            $ = new ScheduledQueryRulesAlertV2ActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionGroups List of Action Group resource IDs to invoke when the alert fires.
         * 
         * @return builder
         * 
         */
        public Builder actionGroups(@Nullable Output<List<String>> actionGroups) {
            $.actionGroups = actionGroups;
            return this;
        }

        /**
         * @param actionGroups List of Action Group resource IDs to invoke when the alert fires.
         * 
         * @return builder
         * 
         */
        public Builder actionGroups(List<String> actionGroups) {
            return actionGroups(Output.of(actionGroups));
        }

        /**
         * @param actionGroups List of Action Group resource IDs to invoke when the alert fires.
         * 
         * @return builder
         * 
         */
        public Builder actionGroups(String... actionGroups) {
            return actionGroups(List.of(actionGroups));
        }

        /**
         * @param customProperties Specifies the properties of an alert payload.
         * 
         * @return builder
         * 
         */
        public Builder customProperties(@Nullable Output<Map<String,String>> customProperties) {
            $.customProperties = customProperties;
            return this;
        }

        /**
         * @param customProperties Specifies the properties of an alert payload.
         * 
         * @return builder
         * 
         */
        public Builder customProperties(Map<String,String> customProperties) {
            return customProperties(Output.of(customProperties));
        }

        public ScheduledQueryRulesAlertV2ActionArgs build() {
            return $;
        }
    }

}
