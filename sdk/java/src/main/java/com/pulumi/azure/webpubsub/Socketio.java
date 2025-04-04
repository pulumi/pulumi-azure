// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.webpubsub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.webpubsub.SocketioArgs;
import com.pulumi.azure.webpubsub.inputs.SocketioState;
import com.pulumi.azure.webpubsub.outputs.SocketioIdentity;
import com.pulumi.azure.webpubsub.outputs.SocketioSku;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Web PubSub Service for Socket.IO.
 * 
 * ## Import
 * 
 * Web PubSub Service for Socket.IOs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:webpubsub/socketio:Socketio example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/webPubSub/pubsub1
 * ```
 * 
 */
@ResourceType(type="azure:webpubsub/socketio:Socketio")
public class Socketio extends com.pulumi.resources.CustomResource {
    /**
     * Whether Azure Active Directory authentication is enabled. Defaults to `true`.
     * 
     */
    @Export(name="aadAuthEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> aadAuthEnabled;

    /**
     * @return Whether Azure Active Directory authentication is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> aadAuthEnabled() {
        return Codegen.optional(this.aadAuthEnabled);
    }
    /**
     * The publicly accessible IP address of the Web PubSub Service.
     * 
     */
    @Export(name="externalIp", refs={String.class}, tree="[0]")
    private Output<String> externalIp;

    /**
     * @return The publicly accessible IP address of the Web PubSub Service.
     * 
     */
    public Output<String> externalIp() {
        return this.externalIp;
    }
    /**
     * The FQDN of the Web PubSub Service.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return The FQDN of the Web PubSub Service.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", refs={SocketioIdentity.class}, tree="[0]")
    private Output</* @Nullable */ SocketioIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<SocketioIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Whether the connectivity log category for live trace is enabled. Defaults to `true`.
     * 
     */
    @Export(name="liveTraceConnectivityLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> liveTraceConnectivityLogsEnabled;

    /**
     * @return Whether the connectivity log category for live trace is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> liveTraceConnectivityLogsEnabled() {
        return Codegen.optional(this.liveTraceConnectivityLogsEnabled);
    }
    /**
     * Whether the live trace tool is enabled. Defaults to `true`.
     * 
     */
    @Export(name="liveTraceEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> liveTraceEnabled;

    /**
     * @return Whether the live trace tool is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> liveTraceEnabled() {
        return Codegen.optional(this.liveTraceEnabled);
    }
    /**
     * Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
     * 
     */
    @Export(name="liveTraceHttpRequestLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> liveTraceHttpRequestLogsEnabled;

    /**
     * @return Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> liveTraceHttpRequestLogsEnabled() {
        return Codegen.optional(this.liveTraceHttpRequestLogsEnabled);
    }
    /**
     * Whether the messaging log category for live trace is enabled. Defaults to `true`.
     * 
     */
    @Export(name="liveTraceMessagingLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> liveTraceMessagingLogsEnabled;

    /**
     * @return Whether the messaging log category for live trace is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> liveTraceMessagingLogsEnabled() {
        return Codegen.optional(this.liveTraceMessagingLogsEnabled);
    }
    /**
     * Whether local authentication using an access key is enabled. Defaults to `true`.
     * 
     */
    @Export(name="localAuthEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> localAuthEnabled;

    /**
     * @return Whether local authentication using an access key is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> localAuthEnabled() {
        return Codegen.optional(this.localAuthEnabled);
    }
    /**
     * The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The primary access key for the Web PubSub Service.
     * 
     */
    @Export(name="primaryAccessKey", refs={String.class}, tree="[0]")
    private Output<String> primaryAccessKey;

    /**
     * @return The primary access key for the Web PubSub Service.
     * 
     */
    public Output<String> primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * The primary connection string for the Web PubSub Service.
     * 
     */
    @Export(name="primaryConnectionString", refs={String.class}, tree="[0]")
    private Output<String> primaryConnectionString;

    /**
     * @return The primary connection string for the Web PubSub Service.
     * 
     */
    public Output<String> primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
     * 
     * &gt; **Note:** `public_network_access` cannot be set to `Disabled` when `sku` is `Free_F1`.
     * 
     */
    @Export(name="publicNetworkAccess", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
     * 
     * &gt; **Note:** `public_network_access` cannot be set to `Disabled` when `sku` is `Free_F1`.
     * 
     */
    public Output<Optional<String>> publicNetworkAccess() {
        return Codegen.optional(this.publicNetworkAccess);
    }
    /**
     * The publicly accessible port for client-side usage of the Web PubSub Service.
     * 
     */
    @Export(name="publicPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> publicPort;

    /**
     * @return The publicly accessible port for client-side usage of the Web PubSub Service.
     * 
     */
    public Output<Integer> publicPort() {
        return this.publicPort;
    }
    /**
     * The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The secondary access key for the Web PubSub Service.
     * 
     */
    @Export(name="secondaryAccessKey", refs={String.class}, tree="[0]")
    private Output<String> secondaryAccessKey;

    /**
     * @return The secondary access key for the Web PubSub Service.
     * 
     */
    public Output<String> secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    /**
     * The secondary connection string for the Web PubSub Service.
     * 
     */
    @Export(name="secondaryConnectionString", refs={String.class}, tree="[0]")
    private Output<String> secondaryConnectionString;

    /**
     * @return The secondary connection string for the Web PubSub Service.
     * 
     */
    public Output<String> secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * The publicly accessible port for server-side usage of the Web PubSub Service.
     * 
     */
    @Export(name="serverPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> serverPort;

    /**
     * @return The publicly accessible port for server-side usage of the Web PubSub Service.
     * 
     */
    public Output<Integer> serverPort() {
        return this.serverPort;
    }
    /**
     * The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
     * 
     */
    @Export(name="serviceMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceMode;

    /**
     * @return The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
     * 
     */
    public Output<Optional<String>> serviceMode() {
        return Codegen.optional(this.serviceMode);
    }
    /**
     * The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
     * 
     */
    @Export(name="sku", refs={SocketioSku.class}, tree="[0]")
    private Output<SocketioSku> sku;

    /**
     * @return The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
     * 
     */
    public Output<SocketioSku> sku() {
        return this.sku;
    }
    /**
     * A mapping of tags which should be assigned to the Web PubSub Service.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Web PubSub Service.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
     * 
     * &gt; **Note:** `tls_client_cert_enabled` cannot be set to `true` when `sku` is `Free_F1`.
     * 
     */
    @Export(name="tlsClientCertEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tlsClientCertEnabled;

    /**
     * @return Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
     * 
     * &gt; **Note:** `tls_client_cert_enabled` cannot be set to `true` when `sku` is `Free_F1`.
     * 
     */
    public Output<Optional<Boolean>> tlsClientCertEnabled() {
        return Codegen.optional(this.tlsClientCertEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Socketio(java.lang.String name) {
        this(name, SocketioArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Socketio(java.lang.String name, SocketioArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Socketio(java.lang.String name, SocketioArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:webpubsub/socketio:Socketio", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Socketio(java.lang.String name, Output<java.lang.String> id, @Nullable SocketioState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:webpubsub/socketio:Socketio", name, state, makeResourceOptions(options, id), false);
    }

    private static SocketioArgs makeArgs(SocketioArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SocketioArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "primaryAccessKey",
                "primaryConnectionString",
                "secondaryAccessKey",
                "secondaryConnectionString"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Socketio get(java.lang.String name, Output<java.lang.String> id, @Nullable SocketioState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Socketio(name, id, state, options);
    }
}
