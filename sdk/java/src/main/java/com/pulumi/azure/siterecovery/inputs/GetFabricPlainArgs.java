// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFabricPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFabricPlainArgs Empty = new GetFabricPlainArgs();

    /**
     * Specifies the name of the Site Recovery Replication Fabric.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Site Recovery Replication Fabric.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Recovery Services Vault that the Site Recovery Replication Fabric is associated witth.
     * 
     */
    @Import(name="recoveryVaultName", required=true)
    private String recoveryVaultName;

    /**
     * @return The name of the Recovery Services Vault that the Site Recovery Replication Fabric is associated witth.
     * 
     */
    public String recoveryVaultName() {
        return this.recoveryVaultName;
    }

    /**
     * The name of the resource group in which the associated Recovery Services Vault resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the associated Recovery Services Vault resides.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFabricPlainArgs() {}

    private GetFabricPlainArgs(GetFabricPlainArgs $) {
        this.name = $.name;
        this.recoveryVaultName = $.recoveryVaultName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFabricPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFabricPlainArgs $;

        public Builder() {
            $ = new GetFabricPlainArgs();
        }

        public Builder(GetFabricPlainArgs defaults) {
            $ = new GetFabricPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Site Recovery Replication Fabric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param recoveryVaultName The name of the Recovery Services Vault that the Site Recovery Replication Fabric is associated witth.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(String recoveryVaultName) {
            $.recoveryVaultName = recoveryVaultName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the associated Recovery Services Vault resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFabricPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetFabricPlainArgs", "name");
            }
            if ($.recoveryVaultName == null) {
                throw new MissingRequiredPropertyException("GetFabricPlainArgs", "recoveryVaultName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetFabricPlainArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
