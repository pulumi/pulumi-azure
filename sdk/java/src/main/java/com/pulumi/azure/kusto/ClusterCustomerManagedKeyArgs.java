// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCustomerManagedKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCustomerManagedKeyArgs Empty = new ClusterCustomerManagedKeyArgs();

    /**
     * The ID of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The name of Key Vault Key.
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    /**
     * @return The name of Key Vault Key.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * The ID of the Key Vault.
     * 
     */
    @Import(name="keyVaultId", required=true)
    private Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * The version of Key Vault Key.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    /**
     * @return The version of Key Vault Key.
     * 
     */
    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    /**
     * The user assigned identity that has access to the Key Vault Key. If not specified, system assigned identity will be used.
     * 
     */
    @Import(name="userIdentity")
    private @Nullable Output<String> userIdentity;

    /**
     * @return The user assigned identity that has access to the Key Vault Key. If not specified, system assigned identity will be used.
     * 
     */
    public Optional<Output<String>> userIdentity() {
        return Optional.ofNullable(this.userIdentity);
    }

    private ClusterCustomerManagedKeyArgs() {}

    private ClusterCustomerManagedKeyArgs(ClusterCustomerManagedKeyArgs $) {
        this.clusterId = $.clusterId;
        this.keyName = $.keyName;
        this.keyVaultId = $.keyVaultId;
        this.keyVersion = $.keyVersion;
        this.userIdentity = $.userIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCustomerManagedKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCustomerManagedKeyArgs $;

        public Builder() {
            $ = new ClusterCustomerManagedKeyArgs();
        }

        public Builder(ClusterCustomerManagedKeyArgs defaults) {
            $ = new ClusterCustomerManagedKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param keyName The name of Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyVaultId The ID of the Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param keyVersion The version of Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        /**
         * @param keyVersion The version of Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        /**
         * @param userIdentity The user assigned identity that has access to the Key Vault Key. If not specified, system assigned identity will be used.
         * 
         * @return builder
         * 
         */
        public Builder userIdentity(@Nullable Output<String> userIdentity) {
            $.userIdentity = userIdentity;
            return this;
        }

        /**
         * @param userIdentity The user assigned identity that has access to the Key Vault Key. If not specified, system assigned identity will be used.
         * 
         * @return builder
         * 
         */
        public Builder userIdentity(String userIdentity) {
            return userIdentity(Output.of(userIdentity));
        }

        public ClusterCustomerManagedKeyArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("ClusterCustomerManagedKeyArgs", "clusterId");
            }
            if ($.keyName == null) {
                throw new MissingRequiredPropertyException("ClusterCustomerManagedKeyArgs", "keyName");
            }
            if ($.keyVaultId == null) {
                throw new MissingRequiredPropertyException("ClusterCustomerManagedKeyArgs", "keyVaultId");
            }
            return $;
        }
    }

}
