// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr.inputs;

import com.pulumi.azure.signalr.inputs.ServiceNetworkAclPrivateEndpointArgs;
import com.pulumi.azure.signalr.inputs.ServiceNetworkAclPublicNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNetworkAclState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkAclState Empty = new ServiceNetworkAclState();

    /**
     * The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<String> defaultAction;

    /**
     * @return The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
     * 
     */
    public Optional<Output<String>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * A `private_endpoint` block as defined below.
     * 
     */
    @Import(name="privateEndpoints")
    private @Nullable Output<List<ServiceNetworkAclPrivateEndpointArgs>> privateEndpoints;

    /**
     * @return A `private_endpoint` block as defined below.
     * 
     */
    public Optional<Output<List<ServiceNetworkAclPrivateEndpointArgs>>> privateEndpoints() {
        return Optional.ofNullable(this.privateEndpoints);
    }

    /**
     * A `public_network` block as defined below.
     * 
     */
    @Import(name="publicNetwork")
    private @Nullable Output<ServiceNetworkAclPublicNetworkArgs> publicNetwork;

    /**
     * @return A `public_network` block as defined below.
     * 
     */
    public Optional<Output<ServiceNetworkAclPublicNetworkArgs>> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    /**
     * The ID of the SignalR service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="signalrServiceId")
    private @Nullable Output<String> signalrServiceId;

    /**
     * @return The ID of the SignalR service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> signalrServiceId() {
        return Optional.ofNullable(this.signalrServiceId);
    }

    private ServiceNetworkAclState() {}

    private ServiceNetworkAclState(ServiceNetworkAclState $) {
        this.defaultAction = $.defaultAction;
        this.privateEndpoints = $.privateEndpoints;
        this.publicNetwork = $.publicNetwork;
        this.signalrServiceId = $.signalrServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNetworkAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNetworkAclState $;

        public Builder() {
            $ = new ServiceNetworkAclState();
        }

        public Builder(ServiceNetworkAclState defaults) {
            $ = new ServiceNetworkAclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultAction The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(@Nullable Output<String> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        /**
         * @param privateEndpoints A `private_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoints(@Nullable Output<List<ServiceNetworkAclPrivateEndpointArgs>> privateEndpoints) {
            $.privateEndpoints = privateEndpoints;
            return this;
        }

        /**
         * @param privateEndpoints A `private_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoints(List<ServiceNetworkAclPrivateEndpointArgs> privateEndpoints) {
            return privateEndpoints(Output.of(privateEndpoints));
        }

        /**
         * @param privateEndpoints A `private_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoints(ServiceNetworkAclPrivateEndpointArgs... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }

        /**
         * @param publicNetwork A `public_network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(@Nullable Output<ServiceNetworkAclPublicNetworkArgs> publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        /**
         * @param publicNetwork A `public_network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(ServiceNetworkAclPublicNetworkArgs publicNetwork) {
            return publicNetwork(Output.of(publicNetwork));
        }

        /**
         * @param signalrServiceId The ID of the SignalR service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signalrServiceId(@Nullable Output<String> signalrServiceId) {
            $.signalrServiceId = signalrServiceId;
            return this;
        }

        /**
         * @param signalrServiceId The ID of the SignalR service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signalrServiceId(String signalrServiceId) {
            return signalrServiceId(Output.of(signalrServiceId));
        }

        public ServiceNetworkAclState build() {
            return $;
        }
    }

}
