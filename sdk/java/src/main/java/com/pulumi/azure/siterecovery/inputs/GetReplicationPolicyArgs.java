// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationPolicyArgs Empty = new GetReplicationPolicyArgs();

    /**
     * Specifies the name of the Azure Site Recovery replication policy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Azure Site Recovery replication policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Recovery Services Vault that the Azure Site Recovery replication policy is associated witth.
     * 
     */
    @Import(name="recoveryVaultName", required=true)
    private Output<String> recoveryVaultName;

    /**
     * @return The name of the Recovery Services Vault that the Azure Site Recovery replication policy is associated witth.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }

    /**
     * The name of the resource group in which the associated Azure Site Recovery replication policy resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the associated Azure Site Recovery replication policy resides.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetReplicationPolicyArgs() {}

    private GetReplicationPolicyArgs(GetReplicationPolicyArgs $) {
        this.name = $.name;
        this.recoveryVaultName = $.recoveryVaultName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationPolicyArgs $;

        public Builder() {
            $ = new GetReplicationPolicyArgs();
        }

        public Builder(GetReplicationPolicyArgs defaults) {
            $ = new GetReplicationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Azure Site Recovery replication policy.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Azure Site Recovery replication policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recoveryVaultName The name of the Recovery Services Vault that the Azure Site Recovery replication policy is associated witth.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(Output<String> recoveryVaultName) {
            $.recoveryVaultName = recoveryVaultName;
            return this;
        }

        /**
         * @param recoveryVaultName The name of the Recovery Services Vault that the Azure Site Recovery replication policy is associated witth.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(String recoveryVaultName) {
            return recoveryVaultName(Output.of(recoveryVaultName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the associated Azure Site Recovery replication policy resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the associated Azure Site Recovery replication policy resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetReplicationPolicyArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetReplicationPolicyArgs", "name");
            }
            if ($.recoveryVaultName == null) {
                throw new MissingRequiredPropertyException("GetReplicationPolicyArgs", "recoveryVaultName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetReplicationPolicyArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
