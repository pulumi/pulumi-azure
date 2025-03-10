// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleAnomalyBuiltInArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleAnomalyBuiltInArgs Empty = new AlertRuleAnomalyBuiltInArgs();

    /**
     * The Display Name of the built-in Anomaly Alert Rule.
     * 
     * &gt; **Note:** One of `name` or `display_name` block must be specified.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The Display Name of the built-in Anomaly Alert Rule.
     * 
     * &gt; **Note:** One of `name` or `display_name` block must be specified.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Should the Built-in Anomaly Alert Rule be enabled?
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Should the Built-in Anomaly Alert Rule be enabled?
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The Name of the built-in Anomaly Alert Rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name of the built-in Anomaly Alert Rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AlertRuleAnomalyBuiltInArgs() {}

    private AlertRuleAnomalyBuiltInArgs(AlertRuleAnomalyBuiltInArgs $) {
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.mode = $.mode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleAnomalyBuiltInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleAnomalyBuiltInArgs $;

        public Builder() {
            $ = new AlertRuleAnomalyBuiltInArgs();
        }

        public Builder(AlertRuleAnomalyBuiltInArgs defaults) {
            $ = new AlertRuleAnomalyBuiltInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The Display Name of the built-in Anomaly Alert Rule.
         * 
         * &gt; **Note:** One of `name` or `display_name` block must be specified.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The Display Name of the built-in Anomaly Alert Rule.
         * 
         * &gt; **Note:** One of `name` or `display_name` block must be specified.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Should the Built-in Anomaly Alert Rule be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the Built-in Anomaly Alert Rule be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param mode mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The Name of the built-in Anomaly Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the built-in Anomaly Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AlertRuleAnomalyBuiltInArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("AlertRuleAnomalyBuiltInArgs", "enabled");
            }
            if ($.logAnalyticsWorkspaceId == null) {
                throw new MissingRequiredPropertyException("AlertRuleAnomalyBuiltInArgs", "logAnalyticsWorkspaceId");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("AlertRuleAnomalyBuiltInArgs", "mode");
            }
            return $;
        }
    }

}
