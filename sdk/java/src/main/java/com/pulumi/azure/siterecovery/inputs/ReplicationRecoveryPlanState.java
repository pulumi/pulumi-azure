// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.inputs;

import com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs;
import com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs;
import com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs;
import com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationRecoveryPlanState extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationRecoveryPlanState Empty = new ReplicationRecoveryPlanState();

    /**
     * An `azure_to_azure_settings` block as defined below.
     * 
     */
    @Import(name="azureToAzureSettings")
    private @Nullable Output<ReplicationRecoveryPlanAzureToAzureSettingsArgs> azureToAzureSettings;

    /**
     * @return An `azure_to_azure_settings` block as defined below.
     * 
     */
    public Optional<Output<ReplicationRecoveryPlanAzureToAzureSettingsArgs>> azureToAzureSettings() {
        return Optional.ofNullable(this.azureToAzureSettings);
    }

    /**
     * One or more `boot_recovery_group` blocks as defined below.
     * 
     */
    @Import(name="bootRecoveryGroups")
    private @Nullable Output<List<ReplicationRecoveryPlanBootRecoveryGroupArgs>> bootRecoveryGroups;

    /**
     * @return One or more `boot_recovery_group` blocks as defined below.
     * 
     */
    public Optional<Output<List<ReplicationRecoveryPlanBootRecoveryGroupArgs>>> bootRecoveryGroups() {
        return Optional.ofNullable(this.bootRecoveryGroups);
    }

    /**
     * One `failover_recovery_group` block as defined below.
     * 
     */
    @Import(name="failoverRecoveryGroup")
    private @Nullable Output<ReplicationRecoveryPlanFailoverRecoveryGroupArgs> failoverRecoveryGroup;

    /**
     * @return One `failover_recovery_group` block as defined below.
     * 
     */
    public Optional<Output<ReplicationRecoveryPlanFailoverRecoveryGroupArgs>> failoverRecoveryGroup() {
        return Optional.ofNullable(this.failoverRecoveryGroup);
    }

    /**
     * The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the vault that should be updated. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="recoveryVaultId")
    private @Nullable Output<String> recoveryVaultId;

    /**
     * @return The ID of the vault that should be updated. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> recoveryVaultId() {
        return Optional.ofNullable(this.recoveryVaultId);
    }

    /**
     * One `shutdown_recovery_group` block as defined below.
     * 
     */
    @Import(name="shutdownRecoveryGroup")
    private @Nullable Output<ReplicationRecoveryPlanShutdownRecoveryGroupArgs> shutdownRecoveryGroup;

    /**
     * @return One `shutdown_recovery_group` block as defined below.
     * 
     */
    public Optional<Output<ReplicationRecoveryPlanShutdownRecoveryGroupArgs>> shutdownRecoveryGroup() {
        return Optional.ofNullable(this.shutdownRecoveryGroup);
    }

    /**
     * ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     * 
     */
    @Import(name="sourceRecoveryFabricId")
    private @Nullable Output<String> sourceRecoveryFabricId;

    /**
     * @return ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     * 
     */
    public Optional<Output<String>> sourceRecoveryFabricId() {
        return Optional.ofNullable(this.sourceRecoveryFabricId);
    }

    /**
     * ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     * 
     */
    @Import(name="targetRecoveryFabricId")
    private @Nullable Output<String> targetRecoveryFabricId;

    /**
     * @return ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     * 
     */
    public Optional<Output<String>> targetRecoveryFabricId() {
        return Optional.ofNullable(this.targetRecoveryFabricId);
    }

    private ReplicationRecoveryPlanState() {}

    private ReplicationRecoveryPlanState(ReplicationRecoveryPlanState $) {
        this.azureToAzureSettings = $.azureToAzureSettings;
        this.bootRecoveryGroups = $.bootRecoveryGroups;
        this.failoverRecoveryGroup = $.failoverRecoveryGroup;
        this.name = $.name;
        this.recoveryVaultId = $.recoveryVaultId;
        this.shutdownRecoveryGroup = $.shutdownRecoveryGroup;
        this.sourceRecoveryFabricId = $.sourceRecoveryFabricId;
        this.targetRecoveryFabricId = $.targetRecoveryFabricId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationRecoveryPlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationRecoveryPlanState $;

        public Builder() {
            $ = new ReplicationRecoveryPlanState();
        }

        public Builder(ReplicationRecoveryPlanState defaults) {
            $ = new ReplicationRecoveryPlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureToAzureSettings An `azure_to_azure_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureToAzureSettings(@Nullable Output<ReplicationRecoveryPlanAzureToAzureSettingsArgs> azureToAzureSettings) {
            $.azureToAzureSettings = azureToAzureSettings;
            return this;
        }

        /**
         * @param azureToAzureSettings An `azure_to_azure_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureToAzureSettings(ReplicationRecoveryPlanAzureToAzureSettingsArgs azureToAzureSettings) {
            return azureToAzureSettings(Output.of(azureToAzureSettings));
        }

        /**
         * @param bootRecoveryGroups One or more `boot_recovery_group` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder bootRecoveryGroups(@Nullable Output<List<ReplicationRecoveryPlanBootRecoveryGroupArgs>> bootRecoveryGroups) {
            $.bootRecoveryGroups = bootRecoveryGroups;
            return this;
        }

        /**
         * @param bootRecoveryGroups One or more `boot_recovery_group` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder bootRecoveryGroups(List<ReplicationRecoveryPlanBootRecoveryGroupArgs> bootRecoveryGroups) {
            return bootRecoveryGroups(Output.of(bootRecoveryGroups));
        }

        /**
         * @param bootRecoveryGroups One or more `boot_recovery_group` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder bootRecoveryGroups(ReplicationRecoveryPlanBootRecoveryGroupArgs... bootRecoveryGroups) {
            return bootRecoveryGroups(List.of(bootRecoveryGroups));
        }

        /**
         * @param failoverRecoveryGroup One `failover_recovery_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder failoverRecoveryGroup(@Nullable Output<ReplicationRecoveryPlanFailoverRecoveryGroupArgs> failoverRecoveryGroup) {
            $.failoverRecoveryGroup = failoverRecoveryGroup;
            return this;
        }

        /**
         * @param failoverRecoveryGroup One `failover_recovery_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder failoverRecoveryGroup(ReplicationRecoveryPlanFailoverRecoveryGroupArgs failoverRecoveryGroup) {
            return failoverRecoveryGroup(Output.of(failoverRecoveryGroup));
        }

        /**
         * @param name The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recoveryVaultId The ID of the vault that should be updated. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(@Nullable Output<String> recoveryVaultId) {
            $.recoveryVaultId = recoveryVaultId;
            return this;
        }

        /**
         * @param recoveryVaultId The ID of the vault that should be updated. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(String recoveryVaultId) {
            return recoveryVaultId(Output.of(recoveryVaultId));
        }

        /**
         * @param shutdownRecoveryGroup One `shutdown_recovery_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder shutdownRecoveryGroup(@Nullable Output<ReplicationRecoveryPlanShutdownRecoveryGroupArgs> shutdownRecoveryGroup) {
            $.shutdownRecoveryGroup = shutdownRecoveryGroup;
            return this;
        }

        /**
         * @param shutdownRecoveryGroup One `shutdown_recovery_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder shutdownRecoveryGroup(ReplicationRecoveryPlanShutdownRecoveryGroupArgs shutdownRecoveryGroup) {
            return shutdownRecoveryGroup(Output.of(shutdownRecoveryGroup));
        }

        /**
         * @param sourceRecoveryFabricId ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceRecoveryFabricId(@Nullable Output<String> sourceRecoveryFabricId) {
            $.sourceRecoveryFabricId = sourceRecoveryFabricId;
            return this;
        }

        /**
         * @param sourceRecoveryFabricId ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceRecoveryFabricId(String sourceRecoveryFabricId) {
            return sourceRecoveryFabricId(Output.of(sourceRecoveryFabricId));
        }

        /**
         * @param targetRecoveryFabricId ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetRecoveryFabricId(@Nullable Output<String> targetRecoveryFabricId) {
            $.targetRecoveryFabricId = targetRecoveryFabricId;
            return this;
        }

        /**
         * @param targetRecoveryFabricId ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetRecoveryFabricId(String targetRecoveryFabricId) {
            return targetRecoveryFabricId(Output.of(targetRecoveryFabricId));
        }

        public ReplicationRecoveryPlanState build() {
            return $;
        }
    }

}
