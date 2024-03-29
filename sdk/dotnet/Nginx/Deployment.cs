// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx
{
    /// <summary>
    /// Manages a Nginx Deployment.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-rg",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var examplePublicIp = new Azure.Network.PublicIp("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AllocationMethod = "Static",
    ///         Sku = "Standard",
    ///         Tags = 
    ///         {
    ///             { "environment", "Production" },
    ///         },
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-vnet",
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "example-subnet",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///         Delegations = new[]
    ///         {
    ///             new Azure.Network.Inputs.SubnetDelegationArgs
    ///             {
    ///                 Name = "delegation",
    ///                 ServiceDelegation = new Azure.Network.Inputs.SubnetDelegationServiceDelegationArgs
    ///                 {
    ///                     Name = "NGINX.NGINXPLUS/nginxDeployments",
    ///                     Actions = new[]
    ///                     {
    ///                         "Microsoft.Network/virtualNetworks/subnets/join/action",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var configContent = Std.Base64encode.Invoke(new()
    ///     {
    ///         Input = @"http {
    ///     server {
    ///         listen 80;
    ///         location / {
    ///             auth_basic ""Protected Area"";
    ///             auth_basic_user_file /opt/.htpasswd;
    ///             default_type text/html;
    ///         }
    ///         include site/*.conf;
    ///     }
    /// }
    /// ",
    ///     }).Apply(invoke =&gt; invoke.Result);
    /// 
    ///     var protectedContent = Std.Base64encode.Invoke(new()
    ///     {
    ///         Input = @"user:$apr1$VeUA5kt.$IjjRk//8miRxDsZvD4daF1
    /// ",
    ///     }).Apply(invoke =&gt; invoke.Result);
    /// 
    ///     var subConfigContent = Std.Base64encode.Invoke(new()
    ///     {
    ///         Input = @"location /bbb {
    /// 	default_type text/html;
    /// 	return 200 '&lt;!doctype html&gt;&lt;html lang=""en""&gt;&lt;head&gt;&lt;/head&gt;&lt;body&gt;
    /// 		&lt;div&gt;this one will be updated&lt;/div&gt;
    /// 		&lt;div&gt;at 10:38 am&lt;/div&gt;
    /// 	&lt;/body&gt;&lt;/html&gt;';
    /// }
    /// ",
    ///     }).Apply(invoke =&gt; invoke.Result);
    /// 
    ///     var exampleDeployment = new Azure.Nginx.Deployment("example", new()
    ///     {
    ///         Name = "example-nginx",
    ///         ResourceGroupName = example.Name,
    ///         Sku = "publicpreview_Monthly_gmz7xq9ge3py",
    ///         Location = example.Location,
    ///         ManagedResourceGroup = "example",
    ///         DiagnoseSupportEnabled = true,
    ///         AutomaticUpgradeChannel = "stable",
    ///         FrontendPublic = new Azure.Nginx.Inputs.DeploymentFrontendPublicArgs
    ///         {
    ///             IpAddresses = new[]
    ///             {
    ///                 examplePublicIp.Id,
    ///             },
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Azure.Nginx.Inputs.DeploymentNetworkInterfaceArgs
    ///             {
    ///                 SubnetId = exampleSubnet.Id,
    ///             },
    ///         },
    ///         Capacity = 20,
    ///         Email = "user@test.com",
    ///         Configuration = new Azure.Nginx.Inputs.DeploymentConfigurationArgs
    ///         {
    ///             RootFile = "/etc/nginx/nginx.conf",
    ///             ConfigFiles = new[]
    ///             {
    ///                 new Azure.Nginx.Inputs.DeploymentConfigurationConfigFileArgs
    ///                 {
    ///                     Content = configContent,
    ///                     VirtualPath = "/etc/nginx/nginx.conf",
    ///                 },
    ///                 new Azure.Nginx.Inputs.DeploymentConfigurationConfigFileArgs
    ///                 {
    ///                     Content = subConfigContent,
    ///                     VirtualPath = "/etc/nginx/site/b.conf",
    ///                 },
    ///             },
    ///             ProtectedFiles = new[]
    ///             {
    ///                 new Azure.Nginx.Inputs.DeploymentConfigurationProtectedFileArgs
    ///                 {
    ///                     Content = protectedContent,
    ///                     VirtualPath = "/opt/.htpasswd",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Nginx Deployments can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:nginx/deployment:Deployment example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/dep1
    /// ```
    /// </summary>
    [AzureResourceType("azure:nginx/deployment:Deployment")]
    public partial class Deployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An `auto_scale_profile` block as defined below.
        /// </summary>
        [Output("autoScaleProfiles")]
        public Output<ImmutableArray<Outputs.DeploymentAutoScaleProfile>> AutoScaleProfiles { get; private set; } = null!;

        /// <summary>
        /// Specify the automatic upgrade channel for the NGINX deployment. Defaults to `stable`. The possible values are `stable` and `preview`.
        /// </summary>
        [Output("automaticUpgradeChannel")]
        public Output<string?> AutomaticUpgradeChannel { get; private set; } = null!;

        /// <summary>
        /// Specify the number of NGINX capacity units for this NGINX deployment. Defaults to `20`.
        /// 
        /// &gt; **Note** For more information on NGINX capacity units, please refer to the [NGINX scaling guidance documentation](https://docs.nginx.com/nginxaas/azure/quickstart/scaling/)
        /// </summary>
        [Output("capacity")]
        public Output<int?> Capacity { get; private set; } = null!;

        /// <summary>
        /// Specify a custom `configuration` block as defined below.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.DeploymentConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// Should the diagnosis support be enabled?
        /// </summary>
        [Output("diagnoseSupportEnabled")]
        public Output<bool?> DiagnoseSupportEnabled { get; private set; } = null!;

        /// <summary>
        /// Specify the preferred support contact email address of the user used for sending alerts and notification.
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// One or more `frontend_private` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("frontendPrivates")]
        public Output<ImmutableArray<Outputs.DeploymentFrontendPrivate>> FrontendPrivates { get; private set; } = null!;

        /// <summary>
        /// A `frontend_public` block as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("frontendPublic")]
        public Output<Outputs.DeploymentFrontendPublic?> FrontendPublic { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.DeploymentIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// Specify the IP Address of this private IP.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// One or more `logging_storage_account` blocks as defined below.
        /// </summary>
        [Output("loggingStorageAccounts")]
        public Output<ImmutableArray<Outputs.DeploymentLoggingStorageAccount>> LoggingStorageAccounts { get; private set; } = null!;

        /// <summary>
        /// Specify the managed resource group to deploy VNet injection related network resources. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("managedResourceGroup")]
        public Output<string> ManagedResourceGroup { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Nginx Deployment. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// One or more `network_interface` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.DeploymentNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        /// <summary>
        /// The version of deployed nginx.
        /// </summary>
        [Output("nginxVersion")]
        public Output<string> NginxVersion { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Specify the Name of Nginx deployment SKU. The possible value are `publicpreview_Monthly_gmz7xq9ge3py` and `standard_Monthly`. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Output("sku")]
        public Output<string> Sku { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Nginx Deployment.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Deployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Deployment(string name, DeploymentArgs args, CustomResourceOptions? options = null)
            : base("azure:nginx/deployment:Deployment", name, args ?? new DeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Deployment(string name, Input<string> id, DeploymentState? state = null, CustomResourceOptions? options = null)
            : base("azure:nginx/deployment:Deployment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Deployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Deployment Get(string name, Input<string> id, DeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new Deployment(name, id, state, options);
        }
    }

    public sealed class DeploymentArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoScaleProfiles")]
        private InputList<Inputs.DeploymentAutoScaleProfileArgs>? _autoScaleProfiles;

        /// <summary>
        /// An `auto_scale_profile` block as defined below.
        /// </summary>
        public InputList<Inputs.DeploymentAutoScaleProfileArgs> AutoScaleProfiles
        {
            get => _autoScaleProfiles ?? (_autoScaleProfiles = new InputList<Inputs.DeploymentAutoScaleProfileArgs>());
            set => _autoScaleProfiles = value;
        }

        /// <summary>
        /// Specify the automatic upgrade channel for the NGINX deployment. Defaults to `stable`. The possible values are `stable` and `preview`.
        /// </summary>
        [Input("automaticUpgradeChannel")]
        public Input<string>? AutomaticUpgradeChannel { get; set; }

        /// <summary>
        /// Specify the number of NGINX capacity units for this NGINX deployment. Defaults to `20`.
        /// 
        /// &gt; **Note** For more information on NGINX capacity units, please refer to the [NGINX scaling guidance documentation](https://docs.nginx.com/nginxaas/azure/quickstart/scaling/)
        /// </summary>
        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// Specify a custom `configuration` block as defined below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.DeploymentConfigurationArgs>? Configuration { get; set; }

        /// <summary>
        /// Should the diagnosis support be enabled?
        /// </summary>
        [Input("diagnoseSupportEnabled")]
        public Input<bool>? DiagnoseSupportEnabled { get; set; }

        /// <summary>
        /// Specify the preferred support contact email address of the user used for sending alerts and notification.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("frontendPrivates")]
        private InputList<Inputs.DeploymentFrontendPrivateArgs>? _frontendPrivates;

        /// <summary>
        /// One or more `frontend_private` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        public InputList<Inputs.DeploymentFrontendPrivateArgs> FrontendPrivates
        {
            get => _frontendPrivates ?? (_frontendPrivates = new InputList<Inputs.DeploymentFrontendPrivateArgs>());
            set => _frontendPrivates = value;
        }

        /// <summary>
        /// A `frontend_public` block as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("frontendPublic")]
        public Input<Inputs.DeploymentFrontendPublicArgs>? FrontendPublic { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.DeploymentIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("loggingStorageAccounts")]
        private InputList<Inputs.DeploymentLoggingStorageAccountArgs>? _loggingStorageAccounts;

        /// <summary>
        /// One or more `logging_storage_account` blocks as defined below.
        /// </summary>
        public InputList<Inputs.DeploymentLoggingStorageAccountArgs> LoggingStorageAccounts
        {
            get => _loggingStorageAccounts ?? (_loggingStorageAccounts = new InputList<Inputs.DeploymentLoggingStorageAccountArgs>());
            set => _loggingStorageAccounts = value;
        }

        /// <summary>
        /// Specify the managed resource group to deploy VNet injection related network resources. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("managedResourceGroup")]
        public Input<string>? ManagedResourceGroup { get; set; }

        /// <summary>
        /// The name which should be used for this Nginx Deployment. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.DeploymentNetworkInterfaceArgs>? _networkInterfaces;

        /// <summary>
        /// One or more `network_interface` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        public InputList<Inputs.DeploymentNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.DeploymentNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// The name of the Resource Group where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specify the Name of Nginx deployment SKU. The possible value are `publicpreview_Monthly_gmz7xq9ge3py` and `standard_Monthly`. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("sku", required: true)]
        public Input<string> Sku { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Nginx Deployment.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DeploymentArgs()
        {
        }
        public static new DeploymentArgs Empty => new DeploymentArgs();
    }

    public sealed class DeploymentState : global::Pulumi.ResourceArgs
    {
        [Input("autoScaleProfiles")]
        private InputList<Inputs.DeploymentAutoScaleProfileGetArgs>? _autoScaleProfiles;

        /// <summary>
        /// An `auto_scale_profile` block as defined below.
        /// </summary>
        public InputList<Inputs.DeploymentAutoScaleProfileGetArgs> AutoScaleProfiles
        {
            get => _autoScaleProfiles ?? (_autoScaleProfiles = new InputList<Inputs.DeploymentAutoScaleProfileGetArgs>());
            set => _autoScaleProfiles = value;
        }

        /// <summary>
        /// Specify the automatic upgrade channel for the NGINX deployment. Defaults to `stable`. The possible values are `stable` and `preview`.
        /// </summary>
        [Input("automaticUpgradeChannel")]
        public Input<string>? AutomaticUpgradeChannel { get; set; }

        /// <summary>
        /// Specify the number of NGINX capacity units for this NGINX deployment. Defaults to `20`.
        /// 
        /// &gt; **Note** For more information on NGINX capacity units, please refer to the [NGINX scaling guidance documentation](https://docs.nginx.com/nginxaas/azure/quickstart/scaling/)
        /// </summary>
        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// Specify a custom `configuration` block as defined below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.DeploymentConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Should the diagnosis support be enabled?
        /// </summary>
        [Input("diagnoseSupportEnabled")]
        public Input<bool>? DiagnoseSupportEnabled { get; set; }

        /// <summary>
        /// Specify the preferred support contact email address of the user used for sending alerts and notification.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("frontendPrivates")]
        private InputList<Inputs.DeploymentFrontendPrivateGetArgs>? _frontendPrivates;

        /// <summary>
        /// One or more `frontend_private` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        public InputList<Inputs.DeploymentFrontendPrivateGetArgs> FrontendPrivates
        {
            get => _frontendPrivates ?? (_frontendPrivates = new InputList<Inputs.DeploymentFrontendPrivateGetArgs>());
            set => _frontendPrivates = value;
        }

        /// <summary>
        /// A `frontend_public` block as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("frontendPublic")]
        public Input<Inputs.DeploymentFrontendPublicGetArgs>? FrontendPublic { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.DeploymentIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// Specify the IP Address of this private IP.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The Azure Region where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("loggingStorageAccounts")]
        private InputList<Inputs.DeploymentLoggingStorageAccountGetArgs>? _loggingStorageAccounts;

        /// <summary>
        /// One or more `logging_storage_account` blocks as defined below.
        /// </summary>
        public InputList<Inputs.DeploymentLoggingStorageAccountGetArgs> LoggingStorageAccounts
        {
            get => _loggingStorageAccounts ?? (_loggingStorageAccounts = new InputList<Inputs.DeploymentLoggingStorageAccountGetArgs>());
            set => _loggingStorageAccounts = value;
        }

        /// <summary>
        /// Specify the managed resource group to deploy VNet injection related network resources. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("managedResourceGroup")]
        public Input<string>? ManagedResourceGroup { get; set; }

        /// <summary>
        /// The name which should be used for this Nginx Deployment. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.DeploymentNetworkInterfaceGetArgs>? _networkInterfaces;

        /// <summary>
        /// One or more `network_interface` blocks as defined below. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        public InputList<Inputs.DeploymentNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.DeploymentNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// The version of deployed nginx.
        /// </summary>
        [Input("nginxVersion")]
        public Input<string>? NginxVersion { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Nginx Deployment should exist. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Specify the Name of Nginx deployment SKU. The possible value are `publicpreview_Monthly_gmz7xq9ge3py` and `standard_Monthly`. Changing this forces a new Nginx Deployment to be created.
        /// </summary>
        [Input("sku")]
        public Input<string>? Sku { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Nginx Deployment.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DeploymentState()
        {
        }
        public static new DeploymentState Empty => new DeploymentState();
    }
}
