// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch
{
    /// <summary>
    /// Manages a Batch Job.
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
    ///         Name = "example-rg",
    ///         Location = "west europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Batch.Account("example", new()
    ///     {
    ///         Name = "exampleaccount",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var examplePool = new Azure.Batch.Pool("example", new()
    ///     {
    ///         Name = "examplepool",
    ///         ResourceGroupName = example.Name,
    ///         AccountName = exampleAccount.Name,
    ///         NodeAgentSkuId = "batch.node.ubuntu 16.04",
    ///         VmSize = "STANDARD_A1_V2",
    ///         FixedScale = new Azure.Batch.Inputs.PoolFixedScaleArgs
    ///         {
    ///             TargetDedicatedNodes = 1,
    ///         },
    ///         StorageImageReference = new Azure.Batch.Inputs.PoolStorageImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///     });
    /// 
    ///     var exampleJob = new Azure.Batch.Job("example", new()
    ///     {
    ///         Name = "examplejob",
    ///         BatchPoolId = examplePool.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Batch Jobs can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:batch/job:Job example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Batch/batchAccounts/account1/pools/pool1/jobs/job1
    /// ```
    /// </summary>
    [AzureResourceType("azure:batch/job:Job")]
    public partial class Job : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Batch Pool. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Output("batchPoolId")]
        public Output<string> BatchPoolId { get; private set; } = null!;

        /// <summary>
        /// Specifies a map of common environment settings applied to this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Output("commonEnvironmentProperties")]
        public Output<ImmutableDictionary<string, string>?> CommonEnvironmentProperties { get; private set; } = null!;

        /// <summary>
        /// The display name of this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The priority of this Batch Job, possible values can range from -1000 (lowest) to 1000 (highest). Defaults to `0`.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The number of retries to each Batch Task belongs to this Batch Job. If this is set to `0`, the Batch service does not retry Tasks. If this is set to `-1`, the Batch service retries Batch Tasks without limit.
        /// </summary>
        [Output("taskRetryMaximum")]
        public Output<int?> TaskRetryMaximum { get; private set; } = null!;


        /// <summary>
        /// Create a Job resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Job(string name, JobArgs args, CustomResourceOptions? options = null)
            : base("azure:batch/job:Job", name, args ?? new JobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Job(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
            : base("azure:batch/job:Job", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Job resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Job Get(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
        {
            return new Job(name, id, state, options);
        }
    }

    public sealed class JobArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Batch Pool. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Input("batchPoolId", required: true)]
        public Input<string> BatchPoolId { get; set; } = null!;

        [Input("commonEnvironmentProperties")]
        private InputMap<string>? _commonEnvironmentProperties;

        /// <summary>
        /// Specifies a map of common environment settings applied to this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        public InputMap<string> CommonEnvironmentProperties
        {
            get => _commonEnvironmentProperties ?? (_commonEnvironmentProperties = new InputMap<string>());
            set => _commonEnvironmentProperties = value;
        }

        /// <summary>
        /// The display name of this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name which should be used for this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of this Batch Job, possible values can range from -1000 (lowest) to 1000 (highest). Defaults to `0`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The number of retries to each Batch Task belongs to this Batch Job. If this is set to `0`, the Batch service does not retry Tasks. If this is set to `-1`, the Batch service retries Batch Tasks without limit.
        /// </summary>
        [Input("taskRetryMaximum")]
        public Input<int>? TaskRetryMaximum { get; set; }

        public JobArgs()
        {
        }
        public static new JobArgs Empty => new JobArgs();
    }

    public sealed class JobState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Batch Pool. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Input("batchPoolId")]
        public Input<string>? BatchPoolId { get; set; }

        [Input("commonEnvironmentProperties")]
        private InputMap<string>? _commonEnvironmentProperties;

        /// <summary>
        /// Specifies a map of common environment settings applied to this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        public InputMap<string> CommonEnvironmentProperties
        {
            get => _commonEnvironmentProperties ?? (_commonEnvironmentProperties = new InputMap<string>());
            set => _commonEnvironmentProperties = value;
        }

        /// <summary>
        /// The display name of this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name which should be used for this Batch Job. Changing this forces a new Batch Job to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of this Batch Job, possible values can range from -1000 (lowest) to 1000 (highest). Defaults to `0`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The number of retries to each Batch Task belongs to this Batch Job. If this is set to `0`, the Batch service does not retry Tasks. If this is set to `-1`, the Batch service retries Batch Tasks without limit.
        /// </summary>
        [Input("taskRetryMaximum")]
        public Input<int>? TaskRetryMaximum { get; set; }

        public JobState()
        {
        }
        public static new JobState Empty => new JobState();
    }
}
