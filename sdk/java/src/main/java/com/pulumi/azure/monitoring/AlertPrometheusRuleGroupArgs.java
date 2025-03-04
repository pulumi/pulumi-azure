// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPrometheusRuleGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPrometheusRuleGroupArgs Empty = new AlertPrometheusRuleGroupArgs();

    /**
     * Specifies the name of the Managed Kubernetes Cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Specifies the name of the Managed Kubernetes Cluster.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The description of the Alert Management Prometheus Rule Group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Alert Management Prometheus Rule Group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the interval in which to run the Alert Management Prometheus Rule Group represented in ISO 8601 duration format. Possible values are between `PT1M` and `PT15M`.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return Specifies the interval in which to run the Alert Management Prometheus Rule Group represented in ISO 8601 duration format. Possible values are between `PT1M` and `PT15M`.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Specifies the Azure Region where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name which should be used for this Alert Management Prometheus Rule Group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Alert Management Prometheus Rule Group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Resource Group where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Is this Alert Management Prometheus Rule Group enabled? Possible values are `true` and `false`.
     * 
     */
    @Import(name="ruleGroupEnabled")
    private @Nullable Output<Boolean> ruleGroupEnabled;

    /**
     * @return Is this Alert Management Prometheus Rule Group enabled? Possible values are `true` and `false`.
     * 
     */
    public Optional<Output<Boolean>> ruleGroupEnabled() {
        return Optional.ofNullable(this.ruleGroupEnabled);
    }

    /**
     * One or more `rule` blocks as defined below.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<AlertPrometheusRuleGroupRuleArgs>> rules;

    /**
     * @return One or more `rule` blocks as defined below.
     * 
     */
    public Output<List<AlertPrometheusRuleGroupRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * Specifies the resource ID of the Azure Monitor Workspace.
     * 
     */
    @Import(name="scopes", required=true)
    private Output<List<String>> scopes;

    /**
     * @return Specifies the resource ID of the Azure Monitor Workspace.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }

    /**
     * A mapping of tags to assign to the Alert Management Prometheus Rule Group.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Alert Management Prometheus Rule Group.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AlertPrometheusRuleGroupArgs() {}

    private AlertPrometheusRuleGroupArgs(AlertPrometheusRuleGroupArgs $) {
        this.clusterName = $.clusterName;
        this.description = $.description;
        this.interval = $.interval;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleGroupEnabled = $.ruleGroupEnabled;
        this.rules = $.rules;
        this.scopes = $.scopes;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPrometheusRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPrometheusRuleGroupArgs $;

        public Builder() {
            $ = new AlertPrometheusRuleGroupArgs();
        }

        public Builder(AlertPrometheusRuleGroupArgs defaults) {
            $ = new AlertPrometheusRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Specifies the name of the Managed Kubernetes Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Specifies the name of the Managed Kubernetes Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param description The description of the Alert Management Prometheus Rule Group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Alert Management Prometheus Rule Group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param interval Specifies the interval in which to run the Alert Management Prometheus Rule Group represented in ISO 8601 duration format. Possible values are between `PT1M` and `PT15M`.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Specifies the interval in which to run the Alert Management Prometheus Rule Group represented in ISO 8601 duration format. Possible values are between `PT1M` and `PT15M`.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param location Specifies the Azure Region where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name which should be used for this Alert Management Prometheus Rule Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Alert Management Prometheus Rule Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Alert Management Prometheus Rule Group should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param ruleGroupEnabled Is this Alert Management Prometheus Rule Group enabled? Possible values are `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupEnabled(@Nullable Output<Boolean> ruleGroupEnabled) {
            $.ruleGroupEnabled = ruleGroupEnabled;
            return this;
        }

        /**
         * @param ruleGroupEnabled Is this Alert Management Prometheus Rule Group enabled? Possible values are `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupEnabled(Boolean ruleGroupEnabled) {
            return ruleGroupEnabled(Output.of(ruleGroupEnabled));
        }

        /**
         * @param rules One or more `rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<AlertPrometheusRuleGroupRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules One or more `rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<AlertPrometheusRuleGroupRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules One or more `rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(AlertPrometheusRuleGroupRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param scopes Specifies the resource ID of the Azure Monitor Workspace.
         * 
         * @return builder
         * 
         */
        public Builder scopes(Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Specifies the resource ID of the Azure Monitor Workspace.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Specifies the resource ID of the Azure Monitor Workspace.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param tags A mapping of tags to assign to the Alert Management Prometheus Rule Group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Alert Management Prometheus Rule Group.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AlertPrometheusRuleGroupArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("AlertPrometheusRuleGroupArgs", "resourceGroupName");
            }
            if ($.rules == null) {
                throw new MissingRequiredPropertyException("AlertPrometheusRuleGroupArgs", "rules");
            }
            if ($.scopes == null) {
                throw new MissingRequiredPropertyException("AlertPrometheusRuleGroupArgs", "scopes");
            }
            return $;
        }
    }

}
