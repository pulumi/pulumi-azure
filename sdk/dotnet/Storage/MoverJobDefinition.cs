// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage
{
    /// <summary>
    /// Manages a Storage Mover Job Definition.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleMover = new Azure.Storage.Mover("example", new()
    ///     {
    ///         Name = "example-ssm",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleMoverAgent = new Azure.Storage.MoverAgent("example", new()
    ///     {
    ///         Name = "example-agent",
    ///         StorageMoverId = exampleMover.Id,
    ///         ArcVirtualMachineId = example.Id.Apply(id =&gt; $"{id}/providers/Microsoft.HybridCompute/machines/examples-hybridComputeName"),
    ///         ArcVirtualMachineUuid = "3bb2c024-eba9-4d18-9e7a-1d772fcc5fe9",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplesa",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///         AllowNestedItemsToBePublic = true,
    ///     });
    /// 
    ///     var exampleContainer = new Azure.Storage.Container("example", new()
    ///     {
    ///         Name = "acccontainer",
    ///         StorageAccountName = exampleAccount.Name,
    ///         ContainerAccessType = "blob",
    ///     });
    /// 
    ///     var exampleMoverTargetEndpoint = new Azure.Storage.MoverTargetEndpoint("example", new()
    ///     {
    ///         Name = "example-smte",
    ///         StorageMoverId = exampleMover.Id,
    ///         StorageAccountId = exampleAccount.Id,
    ///         StorageContainerName = exampleContainer.Name,
    ///     });
    /// 
    ///     var exampleMoverSourceEndpoint = new Azure.Storage.MoverSourceEndpoint("example", new()
    ///     {
    ///         Name = "example-smse",
    ///         StorageMoverId = exampleMover.Id,
    ///         Host = "192.168.0.1",
    ///     });
    /// 
    ///     var exampleMoverProject = new Azure.Storage.MoverProject("example", new()
    ///     {
    ///         Name = "example-sp",
    ///         StorageMoverId = exampleMover.Id,
    ///     });
    /// 
    ///     var exampleMoverJobDefinition = new Azure.Storage.MoverJobDefinition("example", new()
    ///     {
    ///         Name = "example-sjd",
    ///         StorageMoverProjectId = exampleMoverProject.Id,
    ///         AgentName = exampleMoverAgent.Name,
    ///         CopyMode = "Additive",
    ///         SourceName = exampleMoverSourceEndpoint.Name,
    ///         SourceSubPath = "/",
    ///         TargetName = exampleMoverTargetEndpoint.Name,
    ///         TargetSubPath = "/",
    ///         Description = "Example Job Definition Description",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.StorageMover`: 2023-03-01
    /// 
    /// ## Import
    /// 
    /// Storage Mover Job Definition can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:storage/moverJobDefinition:MoverJobDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/projects/project1/jobDefinitions/jobDefinition1
    /// ```
    /// </summary>
    [AzureResourceType("azure:storage/moverJobDefinition:MoverJobDefinition")]
    public partial class MoverJobDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        /// </summary>
        [Output("agentName")]
        public Output<string?> AgentName { get; private set; } = null!;

        /// <summary>
        /// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        /// </summary>
        [Output("copyMode")]
        public Output<string> CopyMode { get; private set; } = null!;

        /// <summary>
        /// Specifies a description for this Storage Mover Job Definition.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sourceName")]
        public Output<string> SourceName { get; private set; } = null!;

        /// <summary>
        /// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sourceSubPath")]
        public Output<string?> SourceSubPath { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        /// </summary>
        [Output("storageMoverProjectId")]
        public Output<string> StorageMoverProjectId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetName")]
        public Output<string> TargetName { get; private set; } = null!;

        /// <summary>
        /// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetSubPath")]
        public Output<string?> TargetSubPath { get; private set; } = null!;


        /// <summary>
        /// Create a MoverJobDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MoverJobDefinition(string name, MoverJobDefinitionArgs args, CustomResourceOptions? options = null)
            : base("azure:storage/moverJobDefinition:MoverJobDefinition", name, args ?? new MoverJobDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MoverJobDefinition(string name, Input<string> id, MoverJobDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("azure:storage/moverJobDefinition:MoverJobDefinition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MoverJobDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MoverJobDefinition Get(string name, Input<string> id, MoverJobDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new MoverJobDefinition(name, id, state, options);
        }
    }

    public sealed class MoverJobDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        /// </summary>
        [Input("agentName")]
        public Input<string>? AgentName { get; set; }

        /// <summary>
        /// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        /// </summary>
        [Input("copyMode", required: true)]
        public Input<string> CopyMode { get; set; } = null!;

        /// <summary>
        /// Specifies a description for this Storage Mover Job Definition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceName", required: true)]
        public Input<string> SourceName { get; set; } = null!;

        /// <summary>
        /// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceSubPath")]
        public Input<string>? SourceSubPath { get; set; }

        /// <summary>
        /// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageMoverProjectId", required: true)]
        public Input<string> StorageMoverProjectId { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetName", required: true)]
        public Input<string> TargetName { get; set; } = null!;

        /// <summary>
        /// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetSubPath")]
        public Input<string>? TargetSubPath { get; set; }

        public MoverJobDefinitionArgs()
        {
        }
        public static new MoverJobDefinitionArgs Empty => new MoverJobDefinitionArgs();
    }

    public sealed class MoverJobDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        /// </summary>
        [Input("agentName")]
        public Input<string>? AgentName { get; set; }

        /// <summary>
        /// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        /// </summary>
        [Input("copyMode")]
        public Input<string>? CopyMode { get; set; }

        /// <summary>
        /// Specifies a description for this Storage Mover Job Definition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceName")]
        public Input<string>? SourceName { get; set; }

        /// <summary>
        /// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceSubPath")]
        public Input<string>? SourceSubPath { get; set; }

        /// <summary>
        /// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageMoverProjectId")]
        public Input<string>? StorageMoverProjectId { get; set; }

        /// <summary>
        /// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetName")]
        public Input<string>? TargetName { get; set; }

        /// <summary>
        /// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetSubPath")]
        public Input<string>? TargetSubPath { get; set; }

        public MoverJobDefinitionState()
        {
        }
        public static new MoverJobDefinitionState Empty => new MoverJobDefinitionState();
    }
}
