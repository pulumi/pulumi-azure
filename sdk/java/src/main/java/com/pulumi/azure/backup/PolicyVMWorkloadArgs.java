// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup;

import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyVMWorkloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyVMWorkloadArgs Empty = new PolicyVMWorkloadArgs();

    /**
     * The name of the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `protection_policy` blocks as defined below.
     * 
     */
    @Import(name="protectionPolicies", required=true)
    private Output<List<PolicyVMWorkloadProtectionPolicyArgs>> protectionPolicies;

    /**
     * @return One or more `protection_policy` blocks as defined below.
     * 
     */
    public Output<List<PolicyVMWorkloadProtectionPolicyArgs>> protectionPolicies() {
        return this.protectionPolicies;
    }

    /**
     * The name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="recoveryVaultName", required=true)
    private Output<String> recoveryVaultName;

    /**
     * @return The name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }

    /**
     * The name of the resource group in which to create the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the VM Workload Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `settings` block as defined below.
     * 
     */
    @Import(name="settings", required=true)
    private Output<PolicyVMWorkloadSettingsArgs> settings;

    /**
     * @return A `settings` block as defined below.
     * 
     */
    public Output<PolicyVMWorkloadSettingsArgs> settings() {
        return this.settings;
    }

    /**
     * The VM Workload type for the Backup Policy. Possible values are `SQLDataBase` and `SAPHanaDatabase`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="workloadType", required=true)
    private Output<String> workloadType;

    /**
     * @return The VM Workload type for the Backup Policy. Possible values are `SQLDataBase` and `SAPHanaDatabase`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> workloadType() {
        return this.workloadType;
    }

    private PolicyVMWorkloadArgs() {}

    private PolicyVMWorkloadArgs(PolicyVMWorkloadArgs $) {
        this.name = $.name;
        this.protectionPolicies = $.protectionPolicies;
        this.recoveryVaultName = $.recoveryVaultName;
        this.resourceGroupName = $.resourceGroupName;
        this.settings = $.settings;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyVMWorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyVMWorkloadArgs $;

        public Builder() {
            $ = new PolicyVMWorkloadArgs();
        }

        public Builder(PolicyVMWorkloadArgs defaults) {
            $ = new PolicyVMWorkloadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the VM Workload Backup Policy. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the VM Workload Backup Policy. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protectionPolicies One or more `protection_policy` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder protectionPolicies(Output<List<PolicyVMWorkloadProtectionPolicyArgs>> protectionPolicies) {
            $.protectionPolicies = protectionPolicies;
            return this;
        }

        /**
         * @param protectionPolicies One or more `protection_policy` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder protectionPolicies(List<PolicyVMWorkloadProtectionPolicyArgs> protectionPolicies) {
            return protectionPolicies(Output.of(protectionPolicies));
        }

        /**
         * @param protectionPolicies One or more `protection_policy` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder protectionPolicies(PolicyVMWorkloadProtectionPolicyArgs... protectionPolicies) {
            return protectionPolicies(List.of(protectionPolicies));
        }

        /**
         * @param recoveryVaultName The name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(Output<String> recoveryVaultName) {
            $.recoveryVaultName = recoveryVaultName;
            return this;
        }

        /**
         * @param recoveryVaultName The name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(String recoveryVaultName) {
            return recoveryVaultName(Output.of(recoveryVaultName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the VM Workload Backup Policy. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the VM Workload Backup Policy. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param settings A `settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder settings(Output<PolicyVMWorkloadSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings A `settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder settings(PolicyVMWorkloadSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param workloadType The VM Workload type for the Backup Policy. Possible values are `SQLDataBase` and `SAPHanaDatabase`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workloadType(Output<String> workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        /**
         * @param workloadType The VM Workload type for the Backup Policy. Possible values are `SQLDataBase` and `SAPHanaDatabase`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workloadType(String workloadType) {
            return workloadType(Output.of(workloadType));
        }

        public PolicyVMWorkloadArgs build() {
            if ($.protectionPolicies == null) {
                throw new MissingRequiredPropertyException("PolicyVMWorkloadArgs", "protectionPolicies");
            }
            if ($.recoveryVaultName == null) {
                throw new MissingRequiredPropertyException("PolicyVMWorkloadArgs", "recoveryVaultName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("PolicyVMWorkloadArgs", "resourceGroupName");
            }
            if ($.settings == null) {
                throw new MissingRequiredPropertyException("PolicyVMWorkloadArgs", "settings");
            }
            if ($.workloadType == null) {
                throw new MissingRequiredPropertyException("PolicyVMWorkloadArgs", "workloadType");
            }
            return $;
        }
    }

}
