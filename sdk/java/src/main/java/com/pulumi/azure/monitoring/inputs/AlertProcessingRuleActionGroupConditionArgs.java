// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertContextArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleIdArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleNameArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionDescriptionArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorConditionArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorServiceArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSeverityArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSignalTypeArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs;
import com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertProcessingRuleActionGroupConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertProcessingRuleActionGroupConditionArgs Empty = new AlertProcessingRuleActionGroupConditionArgs();

    /**
     * A `alert_context` block as defined above.
     * 
     */
    @Import(name="alertContext")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionAlertContextArgs> alertContext;

    /**
     * @return A `alert_context` block as defined above.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionAlertContextArgs>> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }

    /**
     * A `alert_rule_id` block as defined above.
     * 
     */
    @Import(name="alertRuleId")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionAlertRuleIdArgs> alertRuleId;

    /**
     * @return A `alert_rule_id` block as defined above.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionAlertRuleIdArgs>> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }

    /**
     * A `alert_rule_name` block as defined above.
     * 
     */
    @Import(name="alertRuleName")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionAlertRuleNameArgs> alertRuleName;

    /**
     * @return A `alert_rule_name` block as defined above.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionAlertRuleNameArgs>> alertRuleName() {
        return Optional.ofNullable(this.alertRuleName);
    }

    /**
     * A `description` block as defined below.
     * 
     */
    @Import(name="description")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionDescriptionArgs> description;

    /**
     * @return A `description` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionDescriptionArgs>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A `monitor_condition` block as defined below.
     * 
     */
    @Import(name="monitorCondition")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionMonitorConditionArgs> monitorCondition;

    /**
     * @return A `monitor_condition` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionMonitorConditionArgs>> monitorCondition() {
        return Optional.ofNullable(this.monitorCondition);
    }

    /**
     * A `monitor_service` block as defined below.
     * 
     */
    @Import(name="monitorService")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionMonitorServiceArgs> monitorService;

    /**
     * @return A `monitor_service` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionMonitorServiceArgs>> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }

    /**
     * A `severity` block as defined below.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionSeverityArgs> severity;

    /**
     * @return A `severity` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionSeverityArgs>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * A `signal_type` block as defined below.
     * 
     */
    @Import(name="signalType")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionSignalTypeArgs> signalType;

    /**
     * @return A `signal_type` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionSignalTypeArgs>> signalType() {
        return Optional.ofNullable(this.signalType);
    }

    /**
     * A `target_resource` block as defined below.
     * 
     */
    @Import(name="targetResource")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionTargetResourceArgs> targetResource;

    /**
     * @return A `target_resource` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionTargetResourceArgs>> targetResource() {
        return Optional.ofNullable(this.targetResource);
    }

    /**
     * A `target_resource_group` block as defined below.
     * 
     */
    @Import(name="targetResourceGroup")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs> targetResourceGroup;

    /**
     * @return A `target_resource_group` block as defined below.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs>> targetResourceGroup() {
        return Optional.ofNullable(this.targetResourceGroup);
    }

    /**
     * A `target_resource_type` block as defined below.
     * 
     * &gt; **Note:** At least one of the `alert_context`, `alert_rule_id`, `alert_rule_name`, `description`, `monitor_condition`, `monitor_service`, `severity`, `signal_type`, `target_resource`, `target_resource_group`, `target_resource_type` must be specified.
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable Output<AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs> targetResourceType;

    /**
     * @return A `target_resource_type` block as defined below.
     * 
     * &gt; **Note:** At least one of the `alert_context`, `alert_rule_id`, `alert_rule_name`, `description`, `monitor_condition`, `monitor_service`, `severity`, `signal_type`, `target_resource`, `target_resource_group`, `target_resource_type` must be specified.
     * 
     */
    public Optional<Output<AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs>> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    private AlertProcessingRuleActionGroupConditionArgs() {}

    private AlertProcessingRuleActionGroupConditionArgs(AlertProcessingRuleActionGroupConditionArgs $) {
        this.alertContext = $.alertContext;
        this.alertRuleId = $.alertRuleId;
        this.alertRuleName = $.alertRuleName;
        this.description = $.description;
        this.monitorCondition = $.monitorCondition;
        this.monitorService = $.monitorService;
        this.severity = $.severity;
        this.signalType = $.signalType;
        this.targetResource = $.targetResource;
        this.targetResourceGroup = $.targetResourceGroup;
        this.targetResourceType = $.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertProcessingRuleActionGroupConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertProcessingRuleActionGroupConditionArgs $;

        public Builder() {
            $ = new AlertProcessingRuleActionGroupConditionArgs();
        }

        public Builder(AlertProcessingRuleActionGroupConditionArgs defaults) {
            $ = new AlertProcessingRuleActionGroupConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContext A `alert_context` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder alertContext(@Nullable Output<AlertProcessingRuleActionGroupConditionAlertContextArgs> alertContext) {
            $.alertContext = alertContext;
            return this;
        }

        /**
         * @param alertContext A `alert_context` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder alertContext(AlertProcessingRuleActionGroupConditionAlertContextArgs alertContext) {
            return alertContext(Output.of(alertContext));
        }

        /**
         * @param alertRuleId A `alert_rule_id` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(@Nullable Output<AlertProcessingRuleActionGroupConditionAlertRuleIdArgs> alertRuleId) {
            $.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * @param alertRuleId A `alert_rule_id` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(AlertProcessingRuleActionGroupConditionAlertRuleIdArgs alertRuleId) {
            return alertRuleId(Output.of(alertRuleId));
        }

        /**
         * @param alertRuleName A `alert_rule_name` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleName(@Nullable Output<AlertProcessingRuleActionGroupConditionAlertRuleNameArgs> alertRuleName) {
            $.alertRuleName = alertRuleName;
            return this;
        }

        /**
         * @param alertRuleName A `alert_rule_name` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleName(AlertProcessingRuleActionGroupConditionAlertRuleNameArgs alertRuleName) {
            return alertRuleName(Output.of(alertRuleName));
        }

        /**
         * @param description A `description` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<AlertProcessingRuleActionGroupConditionDescriptionArgs> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A `description` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder description(AlertProcessingRuleActionGroupConditionDescriptionArgs description) {
            return description(Output.of(description));
        }

        /**
         * @param monitorCondition A `monitor_condition` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorCondition(@Nullable Output<AlertProcessingRuleActionGroupConditionMonitorConditionArgs> monitorCondition) {
            $.monitorCondition = monitorCondition;
            return this;
        }

        /**
         * @param monitorCondition A `monitor_condition` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorCondition(AlertProcessingRuleActionGroupConditionMonitorConditionArgs monitorCondition) {
            return monitorCondition(Output.of(monitorCondition));
        }

        /**
         * @param monitorService A `monitor_service` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorService(@Nullable Output<AlertProcessingRuleActionGroupConditionMonitorServiceArgs> monitorService) {
            $.monitorService = monitorService;
            return this;
        }

        /**
         * @param monitorService A `monitor_service` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitorService(AlertProcessingRuleActionGroupConditionMonitorServiceArgs monitorService) {
            return monitorService(Output.of(monitorService));
        }

        /**
         * @param severity A `severity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<AlertProcessingRuleActionGroupConditionSeverityArgs> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity A `severity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder severity(AlertProcessingRuleActionGroupConditionSeverityArgs severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param signalType A `signal_type` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder signalType(@Nullable Output<AlertProcessingRuleActionGroupConditionSignalTypeArgs> signalType) {
            $.signalType = signalType;
            return this;
        }

        /**
         * @param signalType A `signal_type` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder signalType(AlertProcessingRuleActionGroupConditionSignalTypeArgs signalType) {
            return signalType(Output.of(signalType));
        }

        /**
         * @param targetResource A `target_resource` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResource(@Nullable Output<AlertProcessingRuleActionGroupConditionTargetResourceArgs> targetResource) {
            $.targetResource = targetResource;
            return this;
        }

        /**
         * @param targetResource A `target_resource` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResource(AlertProcessingRuleActionGroupConditionTargetResourceArgs targetResource) {
            return targetResource(Output.of(targetResource));
        }

        /**
         * @param targetResourceGroup A `target_resource_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceGroup(@Nullable Output<AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs> targetResourceGroup) {
            $.targetResourceGroup = targetResourceGroup;
            return this;
        }

        /**
         * @param targetResourceGroup A `target_resource_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceGroup(AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs targetResourceGroup) {
            return targetResourceGroup(Output.of(targetResourceGroup));
        }

        /**
         * @param targetResourceType A `target_resource_type` block as defined below.
         * 
         * &gt; **Note:** At least one of the `alert_context`, `alert_rule_id`, `alert_rule_name`, `description`, `monitor_condition`, `monitor_service`, `severity`, `signal_type`, `target_resource`, `target_resource_group`, `target_resource_type` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable Output<AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs> targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        /**
         * @param targetResourceType A `target_resource_type` block as defined below.
         * 
         * &gt; **Note:** At least one of the `alert_context`, `alert_rule_id`, `alert_rule_name`, `description`, `monitor_condition`, `monitor_service`, `severity`, `signal_type`, `target_resource`, `target_resource_group`, `target_resource_type` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs targetResourceType) {
            return targetResourceType(Output.of(targetResourceType));
        }

        public AlertProcessingRuleActionGroupConditionArgs build() {
            return $;
        }
    }

}
