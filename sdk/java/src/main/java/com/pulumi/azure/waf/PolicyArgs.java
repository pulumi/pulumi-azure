// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf;

import com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs;
import com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs;
import com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * One or more `custom_rules` blocks as defined below.
     * 
     */
    @Import(name="customRules")
    private @Nullable Output<List<PolicyCustomRuleArgs>> customRules;

    /**
     * @return One or more `custom_rules` blocks as defined below.
     * 
     */
    public Optional<Output<List<PolicyCustomRuleArgs>>> customRules() {
        return Optional.ofNullable(this.customRules);
    }

    /**
     * Resource location. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `managed_rules` blocks as defined below.
     * 
     */
    @Import(name="managedRules", required=true)
    private Output<PolicyManagedRulesArgs> managedRules;

    /**
     * @return A `managed_rules` blocks as defined below.
     * 
     */
    public Output<PolicyManagedRulesArgs> managedRules() {
        return this.managedRules;
    }

    /**
     * The name of the policy. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `policy_settings` block as defined below.
     * 
     */
    @Import(name="policySettings")
    private @Nullable Output<PolicyPolicySettingsArgs> policySettings;

    /**
     * @return A `policy_settings` block as defined below.
     * 
     */
    public Optional<Output<PolicyPolicySettingsArgs>> policySettings() {
        return Optional.ofNullable(this.policySettings);
    }

    /**
     * The name of the resource group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the Web Application Firewall Policy.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Web Application Firewall Policy.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.customRules = $.customRules;
        this.location = $.location;
        this.managedRules = $.managedRules;
        this.name = $.name;
        this.policySettings = $.policySettings;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRules One or more `custom_rules` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customRules(@Nullable Output<List<PolicyCustomRuleArgs>> customRules) {
            $.customRules = customRules;
            return this;
        }

        /**
         * @param customRules One or more `custom_rules` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customRules(List<PolicyCustomRuleArgs> customRules) {
            return customRules(Output.of(customRules));
        }

        /**
         * @param customRules One or more `custom_rules` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customRules(PolicyCustomRuleArgs... customRules) {
            return customRules(List.of(customRules));
        }

        /**
         * @param location Resource location. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedRules A `managed_rules` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedRules(Output<PolicyManagedRulesArgs> managedRules) {
            $.managedRules = managedRules;
            return this;
        }

        /**
         * @param managedRules A `managed_rules` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder managedRules(PolicyManagedRulesArgs managedRules) {
            return managedRules(Output.of(managedRules));
        }

        /**
         * @param name The name of the policy. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policySettings A `policy_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder policySettings(@Nullable Output<PolicyPolicySettingsArgs> policySettings) {
            $.policySettings = policySettings;
            return this;
        }

        /**
         * @param policySettings A `policy_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder policySettings(PolicyPolicySettingsArgs policySettings) {
            return policySettings(Output.of(policySettings));
        }

        /**
         * @param resourceGroupName The name of the resource group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the Web Application Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Web Application Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PolicyArgs build() {
            if ($.managedRules == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "managedRules");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
