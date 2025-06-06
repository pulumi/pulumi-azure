// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

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
 */
export class Socketio extends pulumi.CustomResource {
    /**
     * Get an existing Socketio resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SocketioState, opts?: pulumi.CustomResourceOptions): Socketio {
        return new Socketio(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:webpubsub/socketio:Socketio';

    /**
     * Returns true if the given object is an instance of Socketio.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Socketio {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Socketio.__pulumiType;
    }

    /**
     * Whether Azure Active Directory authentication is enabled. Defaults to `true`.
     */
    public readonly aadAuthEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The publicly accessible IP address of the Web PubSub Service.
     */
    public /*out*/ readonly externalIp!: pulumi.Output<string>;
    /**
     * The FQDN of the Web PubSub Service.
     */
    public /*out*/ readonly hostname!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.webpubsub.SocketioIdentity | undefined>;
    /**
     * Whether the connectivity log category for live trace is enabled. Defaults to `true`.
     */
    public readonly liveTraceConnectivityLogsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the live trace tool is enabled. Defaults to `true`.
     */
    public readonly liveTraceEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
     */
    public readonly liveTraceHttpRequestLogsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the messaging log category for live trace is enabled. Defaults to `true`.
     */
    public readonly liveTraceMessagingLogsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether local authentication using an access key is enabled. Defaults to `true`.
     */
    public readonly localAuthEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The primary access key for the Web PubSub Service.
     */
    public /*out*/ readonly primaryAccessKey!: pulumi.Output<string>;
    /**
     * The primary connection string for the Web PubSub Service.
     */
    public /*out*/ readonly primaryConnectionString!: pulumi.Output<string>;
    /**
     * Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
     *
     * > **Note:** `publicNetworkAccess` cannot be set to `Disabled` when `sku` is `Free_F1`.
     */
    public readonly publicNetworkAccess!: pulumi.Output<string | undefined>;
    /**
     * The publicly accessible port for client-side usage of the Web PubSub Service.
     */
    public /*out*/ readonly publicPort!: pulumi.Output<number>;
    /**
     * The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The secondary access key for the Web PubSub Service.
     */
    public /*out*/ readonly secondaryAccessKey!: pulumi.Output<string>;
    /**
     * The secondary connection string for the Web PubSub Service.
     */
    public /*out*/ readonly secondaryConnectionString!: pulumi.Output<string>;
    /**
     * The publicly accessible port for server-side usage of the Web PubSub Service.
     */
    public /*out*/ readonly serverPort!: pulumi.Output<number>;
    /**
     * The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
     */
    public readonly serviceMode!: pulumi.Output<string | undefined>;
    /**
     * The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
     */
    public readonly sku!: pulumi.Output<outputs.webpubsub.SocketioSku>;
    /**
     * A mapping of tags which should be assigned to the Web PubSub Service.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
     *
     * > **Note:** `tlsClientCertEnabled` cannot be set to `true` when `sku` is `Free_F1`.
     */
    public readonly tlsClientCertEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Socketio resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SocketioArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SocketioArgs | SocketioState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SocketioState | undefined;
            resourceInputs["aadAuthEnabled"] = state ? state.aadAuthEnabled : undefined;
            resourceInputs["externalIp"] = state ? state.externalIp : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["liveTraceConnectivityLogsEnabled"] = state ? state.liveTraceConnectivityLogsEnabled : undefined;
            resourceInputs["liveTraceEnabled"] = state ? state.liveTraceEnabled : undefined;
            resourceInputs["liveTraceHttpRequestLogsEnabled"] = state ? state.liveTraceHttpRequestLogsEnabled : undefined;
            resourceInputs["liveTraceMessagingLogsEnabled"] = state ? state.liveTraceMessagingLogsEnabled : undefined;
            resourceInputs["localAuthEnabled"] = state ? state.localAuthEnabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryAccessKey"] = state ? state.primaryAccessKey : undefined;
            resourceInputs["primaryConnectionString"] = state ? state.primaryConnectionString : undefined;
            resourceInputs["publicNetworkAccess"] = state ? state.publicNetworkAccess : undefined;
            resourceInputs["publicPort"] = state ? state.publicPort : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["secondaryAccessKey"] = state ? state.secondaryAccessKey : undefined;
            resourceInputs["secondaryConnectionString"] = state ? state.secondaryConnectionString : undefined;
            resourceInputs["serverPort"] = state ? state.serverPort : undefined;
            resourceInputs["serviceMode"] = state ? state.serviceMode : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tlsClientCertEnabled"] = state ? state.tlsClientCertEnabled : undefined;
        } else {
            const args = argsOrState as SocketioArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            resourceInputs["aadAuthEnabled"] = args ? args.aadAuthEnabled : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["liveTraceConnectivityLogsEnabled"] = args ? args.liveTraceConnectivityLogsEnabled : undefined;
            resourceInputs["liveTraceEnabled"] = args ? args.liveTraceEnabled : undefined;
            resourceInputs["liveTraceHttpRequestLogsEnabled"] = args ? args.liveTraceHttpRequestLogsEnabled : undefined;
            resourceInputs["liveTraceMessagingLogsEnabled"] = args ? args.liveTraceMessagingLogsEnabled : undefined;
            resourceInputs["localAuthEnabled"] = args ? args.localAuthEnabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicNetworkAccess"] = args ? args.publicNetworkAccess : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serviceMode"] = args ? args.serviceMode : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tlsClientCertEnabled"] = args ? args.tlsClientCertEnabled : undefined;
            resourceInputs["externalIp"] = undefined /*out*/;
            resourceInputs["hostname"] = undefined /*out*/;
            resourceInputs["primaryAccessKey"] = undefined /*out*/;
            resourceInputs["primaryConnectionString"] = undefined /*out*/;
            resourceInputs["publicPort"] = undefined /*out*/;
            resourceInputs["secondaryAccessKey"] = undefined /*out*/;
            resourceInputs["secondaryConnectionString"] = undefined /*out*/;
            resourceInputs["serverPort"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["primaryAccessKey", "primaryConnectionString", "secondaryAccessKey", "secondaryConnectionString"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Socketio.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Socketio resources.
 */
export interface SocketioState {
    /**
     * Whether Azure Active Directory authentication is enabled. Defaults to `true`.
     */
    aadAuthEnabled?: pulumi.Input<boolean>;
    /**
     * The publicly accessible IP address of the Web PubSub Service.
     */
    externalIp?: pulumi.Input<string>;
    /**
     * The FQDN of the Web PubSub Service.
     */
    hostname?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.webpubsub.SocketioIdentity>;
    /**
     * Whether the connectivity log category for live trace is enabled. Defaults to `true`.
     */
    liveTraceConnectivityLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the live trace tool is enabled. Defaults to `true`.
     */
    liveTraceEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
     */
    liveTraceHttpRequestLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the messaging log category for live trace is enabled. Defaults to `true`.
     */
    liveTraceMessagingLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether local authentication using an access key is enabled. Defaults to `true`.
     */
    localAuthEnabled?: pulumi.Input<boolean>;
    /**
     * The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The primary access key for the Web PubSub Service.
     */
    primaryAccessKey?: pulumi.Input<string>;
    /**
     * The primary connection string for the Web PubSub Service.
     */
    primaryConnectionString?: pulumi.Input<string>;
    /**
     * Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
     *
     * > **Note:** `publicNetworkAccess` cannot be set to `Disabled` when `sku` is `Free_F1`.
     */
    publicNetworkAccess?: pulumi.Input<string>;
    /**
     * The publicly accessible port for client-side usage of the Web PubSub Service.
     */
    publicPort?: pulumi.Input<number>;
    /**
     * The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The secondary access key for the Web PubSub Service.
     */
    secondaryAccessKey?: pulumi.Input<string>;
    /**
     * The secondary connection string for the Web PubSub Service.
     */
    secondaryConnectionString?: pulumi.Input<string>;
    /**
     * The publicly accessible port for server-side usage of the Web PubSub Service.
     */
    serverPort?: pulumi.Input<number>;
    /**
     * The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
     */
    serviceMode?: pulumi.Input<string>;
    /**
     * The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
     */
    sku?: pulumi.Input<inputs.webpubsub.SocketioSku>;
    /**
     * A mapping of tags which should be assigned to the Web PubSub Service.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
     *
     * > **Note:** `tlsClientCertEnabled` cannot be set to `true` when `sku` is `Free_F1`.
     */
    tlsClientCertEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Socketio resource.
 */
export interface SocketioArgs {
    /**
     * Whether Azure Active Directory authentication is enabled. Defaults to `true`.
     */
    aadAuthEnabled?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.webpubsub.SocketioIdentity>;
    /**
     * Whether the connectivity log category for live trace is enabled. Defaults to `true`.
     */
    liveTraceConnectivityLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the live trace tool is enabled. Defaults to `true`.
     */
    liveTraceEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
     */
    liveTraceHttpRequestLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the messaging log category for live trace is enabled. Defaults to `true`.
     */
    liveTraceMessagingLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether local authentication using an access key is enabled. Defaults to `true`.
     */
    localAuthEnabled?: pulumi.Input<boolean>;
    /**
     * The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
     *
     * > **Note:** `publicNetworkAccess` cannot be set to `Disabled` when `sku` is `Free_F1`.
     */
    publicNetworkAccess?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
     */
    serviceMode?: pulumi.Input<string>;
    /**
     * The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
     */
    sku: pulumi.Input<inputs.webpubsub.SocketioSku>;
    /**
     * A mapping of tags which should be assigned to the Web PubSub Service.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
     *
     * > **Note:** `tlsClientCertEnabled` cannot be set to `true` when `sku` is `Free_F1`.
     */
    tlsClientCertEnabled?: pulumi.Input<boolean>;
}
