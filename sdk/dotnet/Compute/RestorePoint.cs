// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    /// <summary>
    /// Manages a Virtual Machine Restore Point.
    /// 
    /// ## Import
    /// 
    /// Virtual Machine Restore Point can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:compute/restorePoint:RestorePoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/restorePointCollections/collection1/restorePoints/restorePoint1
    /// ```
    /// </summary>
    [AzureResourceType("azure:compute/restorePoint:RestorePoint")]
    public partial class RestorePoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("crashConsistencyModeEnabled")]
        public Output<bool?> CrashConsistencyModeEnabled { get; private set; } = null!;

        /// <summary>
        /// A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
        /// </summary>
        [Output("excludedDisks")]
        public Output<ImmutableArray<string>> ExcludedDisks { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("virtualMachineRestorePointCollectionId")]
        public Output<string> VirtualMachineRestorePointCollectionId { get; private set; } = null!;


        /// <summary>
        /// Create a RestorePoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RestorePoint(string name, RestorePointArgs args, CustomResourceOptions? options = null)
            : base("azure:compute/restorePoint:RestorePoint", name, args ?? new RestorePointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RestorePoint(string name, Input<string> id, RestorePointState? state = null, CustomResourceOptions? options = null)
            : base("azure:compute/restorePoint:RestorePoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RestorePoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RestorePoint Get(string name, Input<string> id, RestorePointState? state = null, CustomResourceOptions? options = null)
        {
            return new RestorePoint(name, id, state, options);
        }
    }

    public sealed class RestorePointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("crashConsistencyModeEnabled")]
        public Input<bool>? CrashConsistencyModeEnabled { get; set; }

        [Input("excludedDisks")]
        private InputList<string>? _excludedDisks;

        /// <summary>
        /// A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> ExcludedDisks
        {
            get => _excludedDisks ?? (_excludedDisks = new InputList<string>());
            set => _excludedDisks = value;
        }

        /// <summary>
        /// Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("virtualMachineRestorePointCollectionId", required: true)]
        public Input<string> VirtualMachineRestorePointCollectionId { get; set; } = null!;

        public RestorePointArgs()
        {
        }
        public static new RestorePointArgs Empty => new RestorePointArgs();
    }

    public sealed class RestorePointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("crashConsistencyModeEnabled")]
        public Input<bool>? CrashConsistencyModeEnabled { get; set; }

        [Input("excludedDisks")]
        private InputList<string>? _excludedDisks;

        /// <summary>
        /// A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> ExcludedDisks
        {
            get => _excludedDisks ?? (_excludedDisks = new InputList<string>());
            set => _excludedDisks = value;
        }

        /// <summary>
        /// Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("virtualMachineRestorePointCollectionId")]
        public Input<string>? VirtualMachineRestorePointCollectionId { get; set; }

        public RestorePointState()
        {
        }
        public static new RestorePointState Empty => new RestorePointState();
    }
}
