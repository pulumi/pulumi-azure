// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterExtensionAksAssignedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterExtensionAksAssignedIdentityArgs Empty = new KubernetesClusterExtensionAksAssignedIdentityArgs();

    /**
     * The principal ID of resource identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The principal ID of resource identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant ID of resource.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The identity type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private KubernetesClusterExtensionAksAssignedIdentityArgs() {}

    private KubernetesClusterExtensionAksAssignedIdentityArgs(KubernetesClusterExtensionAksAssignedIdentityArgs $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterExtensionAksAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterExtensionAksAssignedIdentityArgs $;

        public Builder() {
            $ = new KubernetesClusterExtensionAksAssignedIdentityArgs();
        }

        public Builder(KubernetesClusterExtensionAksAssignedIdentityArgs defaults) {
            $ = new KubernetesClusterExtensionAksAssignedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The principal ID of resource identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal ID of resource identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The tenant ID of resource.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant ID of resource.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public KubernetesClusterExtensionAksAssignedIdentityArgs build() {
            return $;
        }
    }

}
