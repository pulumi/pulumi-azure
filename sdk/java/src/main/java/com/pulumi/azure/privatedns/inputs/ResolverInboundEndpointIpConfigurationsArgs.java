// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverInboundEndpointIpConfigurationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverInboundEndpointIpConfigurationsArgs Empty = new ResolverInboundEndpointIpConfigurationsArgs();

    /**
     * Private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return Private IP address of the IP configuration.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * Private IP address allocation method. Allowed value is `Dynamic` and `Static`. Defaults to `Dynamic`.
     * 
     */
    @Import(name="privateIpAllocationMethod")
    private @Nullable Output<String> privateIpAllocationMethod;

    /**
     * @return Private IP address allocation method. Allowed value is `Dynamic` and `Static`. Defaults to `Dynamic`.
     * 
     */
    public Optional<Output<String>> privateIpAllocationMethod() {
        return Optional.ofNullable(this.privateIpAllocationMethod);
    }

    /**
     * The subnet ID of the IP configuration.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The subnet ID of the IP configuration.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private ResolverInboundEndpointIpConfigurationsArgs() {}

    private ResolverInboundEndpointIpConfigurationsArgs(ResolverInboundEndpointIpConfigurationsArgs $) {
        this.privateIpAddress = $.privateIpAddress;
        this.privateIpAllocationMethod = $.privateIpAllocationMethod;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverInboundEndpointIpConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverInboundEndpointIpConfigurationsArgs $;

        public Builder() {
            $ = new ResolverInboundEndpointIpConfigurationsArgs();
        }

        public Builder(ResolverInboundEndpointIpConfigurationsArgs defaults) {
            $ = new ResolverInboundEndpointIpConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateIpAddress Private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress Private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param privateIpAllocationMethod Private IP address allocation method. Allowed value is `Dynamic` and `Static`. Defaults to `Dynamic`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAllocationMethod(@Nullable Output<String> privateIpAllocationMethod) {
            $.privateIpAllocationMethod = privateIpAllocationMethod;
            return this;
        }

        /**
         * @param privateIpAllocationMethod Private IP address allocation method. Allowed value is `Dynamic` and `Static`. Defaults to `Dynamic`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAllocationMethod(String privateIpAllocationMethod) {
            return privateIpAllocationMethod(Output.of(privateIpAllocationMethod));
        }

        /**
         * @param subnetId The subnet ID of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The subnet ID of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public ResolverInboundEndpointIpConfigurationsArgs build() {
            if ($.subnetId == null) {
                throw new MissingRequiredPropertyException("ResolverInboundEndpointIpConfigurationsArgs", "subnetId");
            }
            return $;
        }
    }

}
