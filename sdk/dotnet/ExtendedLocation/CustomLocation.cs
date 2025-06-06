// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ExtendedLocation
{
    /// <summary>
    /// Manages a Custom Location within an Extended Location.
    /// 
    /// &gt; **Note:** Installing and configuring the Azure Arc Agent on your Kubernetes Cluster to establish connectivity is outside the scope of this document. For more details refer to [Deploy agents to your cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/conceptual-agent-overview#deploy-agents-to-your-cluster) and [Connect an existing Kubernetes Cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/quickstart-connect-cluster?tabs=azure-cli#connect-an-existing-kubernetes-cluster). If you encounter issues connecting your Kubernetes Cluster to Azure Arc, we'd recommend opening a ticket with Microsoft Support.
    /// 
    /// ## Import
    /// 
    /// Custom Locations can be imported using the resource id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:extendedlocation/customLocation:CustomLocation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.ExtendedLocation/customLocations/example-custom-location
    /// ```
    /// </summary>
    [AzureResourceType("azure:extendedlocation/customLocation:CustomLocation")]
    public partial class CustomLocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An `authentication` block as defined below.
        /// </summary>
        [Output("authentication")]
        public Output<Outputs.CustomLocationAuthentication?> Authentication { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of Cluster Extension IDs.
        /// </summary>
        [Output("clusterExtensionIds")]
        public Output<ImmutableArray<string>> ClusterExtensionIds { get; private set; } = null!;

        /// <summary>
        /// Specifies the display name of the Custom Location.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Specifies the host resource ID.
        /// </summary>
        [Output("hostResourceId")]
        public Output<string> HostResourceId { get; private set; } = null!;

        /// <summary>
        /// Specifies the host type of the Custom Location. The only possible values is `KubernetesCluster`.
        /// </summary>
        [Output("hostType")]
        public Output<string?> HostType { get; private set; } = null!;

        /// <summary>
        /// Specifies the Azure location where the Custom Location should exist. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Custom Location. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the namespace of the Custom Location. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Output("namespace")]
        public Output<string> Namespace { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the Custom Location should exist. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a CustomLocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomLocation(string name, CustomLocationArgs args, CustomResourceOptions? options = null)
            : base("azure:extendedlocation/customLocation:CustomLocation", name, args ?? new CustomLocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomLocation(string name, Input<string> id, CustomLocationState? state = null, CustomResourceOptions? options = null)
            : base("azure:extendedlocation/customLocation:CustomLocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomLocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomLocation Get(string name, Input<string> id, CustomLocationState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomLocation(name, id, state, options);
        }
    }

    public sealed class CustomLocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `authentication` block as defined below.
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.CustomLocationAuthenticationArgs>? Authentication { get; set; }

        [Input("clusterExtensionIds", required: true)]
        private InputList<string>? _clusterExtensionIds;

        /// <summary>
        /// Specifies the list of Cluster Extension IDs.
        /// </summary>
        public InputList<string> ClusterExtensionIds
        {
            get => _clusterExtensionIds ?? (_clusterExtensionIds = new InputList<string>());
            set => _clusterExtensionIds = value;
        }

        /// <summary>
        /// Specifies the display name of the Custom Location.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Specifies the host resource ID.
        /// </summary>
        [Input("hostResourceId", required: true)]
        public Input<string> HostResourceId { get; set; } = null!;

        /// <summary>
        /// Specifies the host type of the Custom Location. The only possible values is `KubernetesCluster`.
        /// </summary>
        [Input("hostType")]
        public Input<string>? HostType { get; set; }

        /// <summary>
        /// Specifies the Azure location where the Custom Location should exist. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Custom Location. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the namespace of the Custom Location. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the Custom Location should exist. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public CustomLocationArgs()
        {
        }
        public static new CustomLocationArgs Empty => new CustomLocationArgs();
    }

    public sealed class CustomLocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `authentication` block as defined below.
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.CustomLocationAuthenticationGetArgs>? Authentication { get; set; }

        [Input("clusterExtensionIds")]
        private InputList<string>? _clusterExtensionIds;

        /// <summary>
        /// Specifies the list of Cluster Extension IDs.
        /// </summary>
        public InputList<string> ClusterExtensionIds
        {
            get => _clusterExtensionIds ?? (_clusterExtensionIds = new InputList<string>());
            set => _clusterExtensionIds = value;
        }

        /// <summary>
        /// Specifies the display name of the Custom Location.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Specifies the host resource ID.
        /// </summary>
        [Input("hostResourceId")]
        public Input<string>? HostResourceId { get; set; }

        /// <summary>
        /// Specifies the host type of the Custom Location. The only possible values is `KubernetesCluster`.
        /// </summary>
        [Input("hostType")]
        public Input<string>? HostType { get; set; }

        /// <summary>
        /// Specifies the Azure location where the Custom Location should exist. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Custom Location. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the namespace of the Custom Location. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group where the Custom Location should exist. Changing this forces a new Custom Location to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public CustomLocationState()
        {
        }
        public static new CustomLocationState Empty => new CustomLocationState();
    }
}
