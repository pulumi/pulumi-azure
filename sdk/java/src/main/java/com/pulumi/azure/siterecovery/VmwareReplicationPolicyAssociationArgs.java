// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmwareReplicationPolicyAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmwareReplicationPolicyAssociationArgs Empty = new VmwareReplicationPolicyAssociationArgs();

    /**
     * The name of the replication policy association. Changing this forces a new association to be
     * created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the replication policy association. Changing this forces a new association to be
     * created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the VMWare replication policy which to be associated. Changing this forces a new
     * association to be created.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return The ID of the VMWare replication policy which to be associated. Changing this forces a new
     * association to be created.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * The ID of the Recovery Service Vault to which the policy should be associated.
     * Changing this forces a new association to be created.
     * 
     */
    @Import(name="recoveryVaultId", required=true)
    private Output<String> recoveryVaultId;

    /**
     * @return The ID of the Recovery Service Vault to which the policy should be associated.
     * Changing this forces a new association to be created.
     * 
     */
    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }

    private VmwareReplicationPolicyAssociationArgs() {}

    private VmwareReplicationPolicyAssociationArgs(VmwareReplicationPolicyAssociationArgs $) {
        this.name = $.name;
        this.policyId = $.policyId;
        this.recoveryVaultId = $.recoveryVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmwareReplicationPolicyAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmwareReplicationPolicyAssociationArgs $;

        public Builder() {
            $ = new VmwareReplicationPolicyAssociationArgs();
        }

        public Builder(VmwareReplicationPolicyAssociationArgs defaults) {
            $ = new VmwareReplicationPolicyAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the replication policy association. Changing this forces a new association to be
         * created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the replication policy association. Changing this forces a new association to be
         * created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyId The ID of the VMWare replication policy which to be associated. Changing this forces a new
         * association to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the VMWare replication policy which to be associated. Changing this forces a new
         * association to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param recoveryVaultId The ID of the Recovery Service Vault to which the policy should be associated.
         * Changing this forces a new association to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(Output<String> recoveryVaultId) {
            $.recoveryVaultId = recoveryVaultId;
            return this;
        }

        /**
         * @param recoveryVaultId The ID of the Recovery Service Vault to which the policy should be associated.
         * Changing this forces a new association to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(String recoveryVaultId) {
            return recoveryVaultId(Output.of(recoveryVaultId));
        }

        public VmwareReplicationPolicyAssociationArgs build() {
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.recoveryVaultId = Objects.requireNonNull($.recoveryVaultId, "expected parameter 'recoveryVaultId' to be non-null");
            return $;
        }
    }

}