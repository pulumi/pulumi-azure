// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp
{
    /// <summary>
    /// Manages a Container App Environment.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("exampleAnalyticsWorkspace", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Sku = "PerGB2018",
    ///         RetentionInDays = 30,
    ///     });
    /// 
    ///     var exampleEnvironment = new Azure.ContainerApp.Environment("exampleEnvironment", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsWorkspace.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A Container App Environment can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:containerapp/environment:Environment example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.App/managedEnvironments/myEnvironment"
    /// ```
    /// </summary>
    [AzureResourceType("azure:containerapp/environment:Environment")]
    public partial class Environment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The default, publicly resolvable, name of this Container App Environment.
        /// </summary>
        [Output("defaultDomain")]
        public Output<string> DefaultDomain { get; private set; } = null!;

        /// <summary>
        /// The network addressing in which the Container Apps in this Container App Environment will reside in CIDR notation.
        /// </summary>
        [Output("dockerBridgeCidr")]
        public Output<string> DockerBridgeCidr { get; private set; } = null!;

        /// <summary>
        /// The existing Subnet to use for the Container Apps Control Plane. Changing this forces a new resource to be created.
        /// </summary>
        [Output("infrastructureSubnetId")]
        public Output<string?> InfrastructureSubnetId { get; private set; } = null!;

        /// <summary>
        /// Should the Container Environment operate in Internal Load Balancing Mode? Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("internalLoadBalancerEnabled")]
        public Output<bool?> InternalLoadBalancerEnabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the Container App Environment is to exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The ID for the Log Analytics Workspace to link this Container Apps Managed Environment to. Changing this forces a new resource to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// The name of the Container Apps Managed Environment. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The IP range, in CIDR notation, that is reserved for environment infrastructure IP addresses.
        /// </summary>
        [Output("platformReservedCidr")]
        public Output<string> PlatformReservedCidr { get; private set; } = null!;

        /// <summary>
        /// The IP address from the IP range defined by `platform_reserved_cidr` that is reserved for the internal DNS server.
        /// </summary>
        [Output("platformReservedDnsIpAddress")]
        public Output<string> PlatformReservedDnsIpAddress { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which the Container App Environment is to be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The Static IP of the Environment.
        /// </summary>
        [Output("staticIpAddress")]
        public Output<string> StaticIpAddress { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Environment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Environment(string name, EnvironmentArgs args, CustomResourceOptions? options = null)
            : base("azure:containerapp/environment:Environment", name, args ?? new EnvironmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Environment(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
            : base("azure:containerapp/environment:Environment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Environment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Environment Get(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
        {
            return new Environment(name, id, state, options);
        }
    }

    public sealed class EnvironmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The existing Subnet to use for the Container Apps Control Plane. Changing this forces a new resource to be created.
        /// </summary>
        [Input("infrastructureSubnetId")]
        public Input<string>? InfrastructureSubnetId { get; set; }

        /// <summary>
        /// Should the Container Environment operate in Internal Load Balancing Mode? Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("internalLoadBalancerEnabled")]
        public Input<bool>? InternalLoadBalancerEnabled { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the Container App Environment is to exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID for the Log Analytics Workspace to link this Container Apps Managed Environment to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// The name of the Container Apps Managed Environment. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which the Container App Environment is to be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EnvironmentArgs()
        {
        }
        public static new EnvironmentArgs Empty => new EnvironmentArgs();
    }

    public sealed class EnvironmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default, publicly resolvable, name of this Container App Environment.
        /// </summary>
        [Input("defaultDomain")]
        public Input<string>? DefaultDomain { get; set; }

        /// <summary>
        /// The network addressing in which the Container Apps in this Container App Environment will reside in CIDR notation.
        /// </summary>
        [Input("dockerBridgeCidr")]
        public Input<string>? DockerBridgeCidr { get; set; }

        /// <summary>
        /// The existing Subnet to use for the Container Apps Control Plane. Changing this forces a new resource to be created.
        /// </summary>
        [Input("infrastructureSubnetId")]
        public Input<string>? InfrastructureSubnetId { get; set; }

        /// <summary>
        /// Should the Container Environment operate in Internal Load Balancing Mode? Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("internalLoadBalancerEnabled")]
        public Input<bool>? InternalLoadBalancerEnabled { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the Container App Environment is to exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID for the Log Analytics Workspace to link this Container Apps Managed Environment to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// The name of the Container Apps Managed Environment. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The IP range, in CIDR notation, that is reserved for environment infrastructure IP addresses.
        /// </summary>
        [Input("platformReservedCidr")]
        public Input<string>? PlatformReservedCidr { get; set; }

        /// <summary>
        /// The IP address from the IP range defined by `platform_reserved_cidr` that is reserved for the internal DNS server.
        /// </summary>
        [Input("platformReservedDnsIpAddress")]
        public Input<string>? PlatformReservedDnsIpAddress { get; set; }

        /// <summary>
        /// The name of the resource group in which the Container App Environment is to be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The Static IP of the Environment.
        /// </summary>
        [Input("staticIpAddress")]
        public Input<string>? StaticIpAddress { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EnvironmentState()
        {
        }
        public static new EnvironmentState Empty => new EnvironmentState();
    }
}