// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns;

import com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverInboundEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverInboundEndpointArgs Empty = new ResolverInboundEndpointArgs();

    /**
     * One `ip_configurations` block as defined below. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    @Import(name="ipConfigurations", required=true)
    private Output<ResolverInboundEndpointIpConfigurationsArgs> ipConfigurations;

    /**
     * @return One `ip_configurations` block as defined below. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    public Output<ResolverInboundEndpointIpConfigurationsArgs> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    @Import(name="privateDnsResolverId", required=true)
    private Output<String> privateDnsResolverId;

    /**
     * @return Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
     * 
     */
    public Output<String> privateDnsResolverId() {
        return this.privateDnsResolverId;
    }

    /**
     * A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ResolverInboundEndpointArgs() {}

    private ResolverInboundEndpointArgs(ResolverInboundEndpointArgs $) {
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.name = $.name;
        this.privateDnsResolverId = $.privateDnsResolverId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverInboundEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverInboundEndpointArgs $;

        public Builder() {
            $ = new ResolverInboundEndpointArgs();
        }

        public Builder(ResolverInboundEndpointArgs defaults) {
            $ = new ResolverInboundEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipConfigurations One `ip_configurations` block as defined below. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(Output<ResolverInboundEndpointIpConfigurationsArgs> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations One `ip_configurations` block as defined below. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(ResolverInboundEndpointIpConfigurationsArgs ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param location Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateDnsResolverId Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsResolverId(Output<String> privateDnsResolverId) {
            $.privateDnsResolverId = privateDnsResolverId;
            return this;
        }

        /**
         * @param privateDnsResolverId Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsResolverId(String privateDnsResolverId) {
            return privateDnsResolverId(Output.of(privateDnsResolverId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ResolverInboundEndpointArgs build() {
            if ($.ipConfigurations == null) {
                throw new MissingRequiredPropertyException("ResolverInboundEndpointArgs", "ipConfigurations");
            }
            if ($.privateDnsResolverId == null) {
                throw new MissingRequiredPropertyException("ResolverInboundEndpointArgs", "privateDnsResolverId");
            }
            return $;
        }
    }

}
