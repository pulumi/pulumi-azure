// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WebPubSub
{
    /// <summary>
    /// Manages a Web PubSub Service for Socket.IO.
    /// 
    /// ## Import
    /// 
    /// Web PubSub Service for Socket.IOs can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:webpubsub/socketio:Socketio example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/webPubSub/pubsub1
    /// ```
    /// </summary>
    [AzureResourceType("azure:webpubsub/socketio:Socketio")]
    public partial class Socketio : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether Azure Active Directory authentication is enabled. Defaults to `true`.
        /// </summary>
        [Output("aadAuthEnabled")]
        public Output<bool?> AadAuthEnabled { get; private set; } = null!;

        /// <summary>
        /// The publicly accessible IP address of the Web PubSub Service.
        /// </summary>
        [Output("externalIp")]
        public Output<string> ExternalIp { get; private set; } = null!;

        /// <summary>
        /// The FQDN of the Web PubSub Service.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.SocketioIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// Whether the connectivity log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Output("liveTraceConnectivityLogsEnabled")]
        public Output<bool?> LiveTraceConnectivityLogsEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether the live trace tool is enabled. Defaults to `true`.
        /// </summary>
        [Output("liveTraceEnabled")]
        public Output<bool?> LiveTraceEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Output("liveTraceHttpRequestLogsEnabled")]
        public Output<bool?> LiveTraceHttpRequestLogsEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether the messaging log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Output("liveTraceMessagingLogsEnabled")]
        public Output<bool?> LiveTraceMessagingLogsEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether local authentication using an access key is enabled. Defaults to `true`.
        /// </summary>
        [Output("localAuthEnabled")]
        public Output<bool?> LocalAuthEnabled { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The primary access key for the Web PubSub Service.
        /// </summary>
        [Output("primaryAccessKey")]
        public Output<string> PrimaryAccessKey { get; private set; } = null!;

        /// <summary>
        /// The primary connection string for the Web PubSub Service.
        /// </summary>
        [Output("primaryConnectionString")]
        public Output<string> PrimaryConnectionString { get; private set; } = null!;

        /// <summary>
        /// Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
        /// 
        /// &gt; **Note:** `public_network_access` cannot be set to `Disabled` when `sku` is `Free_F1`.
        /// </summary>
        [Output("publicNetworkAccess")]
        public Output<string?> PublicNetworkAccess { get; private set; } = null!;

        /// <summary>
        /// The publicly accessible port for client-side usage of the Web PubSub Service.
        /// </summary>
        [Output("publicPort")]
        public Output<int> PublicPort { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The secondary access key for the Web PubSub Service.
        /// </summary>
        [Output("secondaryAccessKey")]
        public Output<string> SecondaryAccessKey { get; private set; } = null!;

        /// <summary>
        /// The secondary connection string for the Web PubSub Service.
        /// </summary>
        [Output("secondaryConnectionString")]
        public Output<string> SecondaryConnectionString { get; private set; } = null!;

        /// <summary>
        /// The publicly accessible port for server-side usage of the Web PubSub Service.
        /// </summary>
        [Output("serverPort")]
        public Output<int> ServerPort { get; private set; } = null!;

        /// <summary>
        /// The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
        /// </summary>
        [Output("serviceMode")]
        public Output<string?> ServiceMode { get; private set; } = null!;

        /// <summary>
        /// The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
        /// </summary>
        [Output("sku")]
        public Output<Outputs.SocketioSku> Sku { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Web PubSub Service.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
        /// 
        /// &gt; **Note:** `tls_client_cert_enabled` cannot be set to `true` when `sku` is `Free_F1`.
        /// </summary>
        [Output("tlsClientCertEnabled")]
        public Output<bool?> TlsClientCertEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a Socketio resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Socketio(string name, SocketioArgs args, CustomResourceOptions? options = null)
            : base("azure:webpubsub/socketio:Socketio", name, args ?? new SocketioArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Socketio(string name, Input<string> id, SocketioState? state = null, CustomResourceOptions? options = null)
            : base("azure:webpubsub/socketio:Socketio", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "primaryAccessKey",
                    "primaryConnectionString",
                    "secondaryAccessKey",
                    "secondaryConnectionString",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Socketio resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Socketio Get(string name, Input<string> id, SocketioState? state = null, CustomResourceOptions? options = null)
        {
            return new Socketio(name, id, state, options);
        }
    }

    public sealed class SocketioArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether Azure Active Directory authentication is enabled. Defaults to `true`.
        /// </summary>
        [Input("aadAuthEnabled")]
        public Input<bool>? AadAuthEnabled { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.SocketioIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// Whether the connectivity log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceConnectivityLogsEnabled")]
        public Input<bool>? LiveTraceConnectivityLogsEnabled { get; set; }

        /// <summary>
        /// Whether the live trace tool is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceEnabled")]
        public Input<bool>? LiveTraceEnabled { get; set; }

        /// <summary>
        /// Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceHttpRequestLogsEnabled")]
        public Input<bool>? LiveTraceHttpRequestLogsEnabled { get; set; }

        /// <summary>
        /// Whether the messaging log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceMessagingLogsEnabled")]
        public Input<bool>? LiveTraceMessagingLogsEnabled { get; set; }

        /// <summary>
        /// Whether local authentication using an access key is enabled. Defaults to `true`.
        /// </summary>
        [Input("localAuthEnabled")]
        public Input<bool>? LocalAuthEnabled { get; set; }

        /// <summary>
        /// The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
        /// 
        /// &gt; **Note:** `public_network_access` cannot be set to `Disabled` when `sku` is `Free_F1`.
        /// </summary>
        [Input("publicNetworkAccess")]
        public Input<string>? PublicNetworkAccess { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
        /// </summary>
        [Input("serviceMode")]
        public Input<string>? ServiceMode { get; set; }

        /// <summary>
        /// The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
        /// </summary>
        [Input("sku", required: true)]
        public Input<Inputs.SocketioSkuArgs> Sku { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Web PubSub Service.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
        /// 
        /// &gt; **Note:** `tls_client_cert_enabled` cannot be set to `true` when `sku` is `Free_F1`.
        /// </summary>
        [Input("tlsClientCertEnabled")]
        public Input<bool>? TlsClientCertEnabled { get; set; }

        public SocketioArgs()
        {
        }
        public static new SocketioArgs Empty => new SocketioArgs();
    }

    public sealed class SocketioState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether Azure Active Directory authentication is enabled. Defaults to `true`.
        /// </summary>
        [Input("aadAuthEnabled")]
        public Input<bool>? AadAuthEnabled { get; set; }

        /// <summary>
        /// The publicly accessible IP address of the Web PubSub Service.
        /// </summary>
        [Input("externalIp")]
        public Input<string>? ExternalIp { get; set; }

        /// <summary>
        /// The FQDN of the Web PubSub Service.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.SocketioIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// Whether the connectivity log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceConnectivityLogsEnabled")]
        public Input<bool>? LiveTraceConnectivityLogsEnabled { get; set; }

        /// <summary>
        /// Whether the live trace tool is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceEnabled")]
        public Input<bool>? LiveTraceEnabled { get; set; }

        /// <summary>
        /// Whether the HTTP request log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceHttpRequestLogsEnabled")]
        public Input<bool>? LiveTraceHttpRequestLogsEnabled { get; set; }

        /// <summary>
        /// Whether the messaging log category for live trace is enabled. Defaults to `true`.
        /// </summary>
        [Input("liveTraceMessagingLogsEnabled")]
        public Input<bool>? LiveTraceMessagingLogsEnabled { get; set; }

        /// <summary>
        /// Whether local authentication using an access key is enabled. Defaults to `true`.
        /// </summary>
        [Input("localAuthEnabled")]
        public Input<bool>? LocalAuthEnabled { get; set; }

        /// <summary>
        /// The Azure Region where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Web PubSub Service. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("primaryAccessKey")]
        private Input<string>? _primaryAccessKey;

        /// <summary>
        /// The primary access key for the Web PubSub Service.
        /// </summary>
        public Input<string>? PrimaryAccessKey
        {
            get => _primaryAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _primaryAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("primaryConnectionString")]
        private Input<string>? _primaryConnectionString;

        /// <summary>
        /// The primary connection string for the Web PubSub Service.
        /// </summary>
        public Input<string>? PrimaryConnectionString
        {
            get => _primaryConnectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _primaryConnectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether public network access is enabled. Defaults to `Enabled`. Possible values are `Enabled` and `Disabled`.
        /// 
        /// &gt; **Note:** `public_network_access` cannot be set to `Disabled` when `sku` is `Free_F1`.
        /// </summary>
        [Input("publicNetworkAccess")]
        public Input<string>? PublicNetworkAccess { get; set; }

        /// <summary>
        /// The publicly accessible port for client-side usage of the Web PubSub Service.
        /// </summary>
        [Input("publicPort")]
        public Input<int>? PublicPort { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Web PubSub Service should exist. Changing this forces a new Web PubSub Service to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("secondaryAccessKey")]
        private Input<string>? _secondaryAccessKey;

        /// <summary>
        /// The secondary access key for the Web PubSub Service.
        /// </summary>
        public Input<string>? SecondaryAccessKey
        {
            get => _secondaryAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secondaryAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("secondaryConnectionString")]
        private Input<string>? _secondaryConnectionString;

        /// <summary>
        /// The secondary connection string for the Web PubSub Service.
        /// </summary>
        public Input<string>? SecondaryConnectionString
        {
            get => _secondaryConnectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secondaryConnectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The publicly accessible port for server-side usage of the Web PubSub Service.
        /// </summary>
        [Input("serverPort")]
        public Input<int>? ServerPort { get; set; }

        /// <summary>
        /// The service mode of this Web PubSub Service. Defaults to `Default`. Possible values are `Default` and `Serverless`.
        /// </summary>
        [Input("serviceMode")]
        public Input<string>? ServiceMode { get; set; }

        /// <summary>
        /// The SKU to use for this Web PubSub Service. Possible values are `Free_F1`, `Standard_S1`, `Premium_P1`, and `Premium_P2`.
        /// </summary>
        [Input("sku")]
        public Input<Inputs.SocketioSkuGetArgs>? Sku { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Web PubSub Service.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether the service should request a client certificate during a TLS handshake. Defaults to `false`.
        /// 
        /// &gt; **Note:** `tls_client_cert_enabled` cannot be set to `true` when `sku` is `Free_F1`.
        /// </summary>
        [Input("tlsClientCertEnabled")]
        public Input<bool>? TlsClientCertEnabled { get; set; }

        public SocketioState()
        {
        }
        public static new SocketioState Empty => new SocketioState();
    }
}
