// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arckubernetes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterIdentityArgs Empty = new ClusterIdentityArgs();

    /**
     * The Principal ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity assigned to this Arc Kubernetes Cluster. At this time the only possible value is `SystemAssigned`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity assigned to this Arc Kubernetes Cluster. At this time the only possible value is `SystemAssigned`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ClusterIdentityArgs() {}

    private ClusterIdentityArgs(ClusterIdentityArgs $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIdentityArgs $;

        public Builder() {
            $ = new ClusterIdentityArgs();
        }

        public Builder(ClusterIdentityArgs defaults) {
            $ = new ClusterIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity assigned to this Arc Kubernetes Cluster. At this time the only possible value is `SystemAssigned`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity assigned to this Arc Kubernetes Cluster. At this time the only possible value is `SystemAssigned`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ClusterIdentityArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ClusterIdentityArgs", "type");
            }
            return $;
        }
    }

}
