// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory
{
    /// <summary>
    /// Manages a Trigger Schedule inside a Azure Data Factory.
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
    ///     var exampleFactory = new Azure.DataFactory.Factory("example", new()
    ///     {
    ///         Name = "example",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var examplePipeline = new Azure.DataFactory.Pipeline("example", new()
    ///     {
    ///         Name = "example",
    ///         DataFactoryId = exampleFactory.Id,
    ///     });
    /// 
    ///     var exampleTriggerSchedule = new Azure.DataFactory.TriggerSchedule("example", new()
    ///     {
    ///         Name = "example",
    ///         DataFactoryId = exampleFactory.Id,
    ///         PipelineName = examplePipeline.Name,
    ///         Interval = 5,
    ///         Frequency = "Day",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Factory Schedule Trigger can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:datafactory/triggerSchedule:TriggerSchedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/triggers/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:datafactory/triggerSchedule:TriggerSchedule")]
    public partial class TriggerSchedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies if the Data Factory Schedule Trigger is activated. Defaults to `true`.
        /// </summary>
        [Output("activated")]
        public Output<bool?> Activated { get; private set; } = null!;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Schedule Trigger.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableArray<string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Output("dataFactoryId")]
        public Output<string> DataFactoryId { get; private set; } = null!;

        /// <summary>
        /// The Schedule Trigger's description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The time the Schedule Trigger should end. The time will be represented in UTC.
        /// </summary>
        [Output("endTime")]
        public Output<string?> EndTime { get; private set; } = null!;

        /// <summary>
        /// The trigger frequency. Valid values include `Minute`, `Hour`, `Day`, `Week`, `Month`. Defaults to `Minute`.
        /// </summary>
        [Output("frequency")]
        public Output<string?> Frequency { get; private set; } = null!;

        /// <summary>
        /// The interval for how often the trigger occurs. This defaults to `1`.
        /// </summary>
        [Output("interval")]
        public Output<int?> Interval { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Data Factory Schedule Trigger. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Data Factory Pipeline name that the trigger will act on.
        /// </summary>
        [Output("pipelineName")]
        public Output<string> PipelineName { get; private set; } = null!;

        /// <summary>
        /// The pipeline parameters that the trigger will act upon.
        /// </summary>
        [Output("pipelineParameters")]
        public Output<ImmutableDictionary<string, string>> PipelineParameters { get; private set; } = null!;

        /// <summary>
        /// A `pipeline` block as defined below.
        /// </summary>
        [Output("pipelines")]
        public Output<ImmutableArray<Outputs.TriggerSchedulePipeline>> Pipelines { get; private set; } = null!;

        /// <summary>
        /// A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
        /// </summary>
        [Output("schedule")]
        public Output<Outputs.TriggerScheduleSchedule?> Schedule { get; private set; } = null!;

        /// <summary>
        /// The time the Schedule Trigger will start. This defaults to the current time. The time will be represented in UTC.
        /// </summary>
        [Output("startTime")]
        public Output<string> StartTime { get; private set; } = null!;

        /// <summary>
        /// The timezone of the start/end time.
        /// </summary>
        [Output("timeZone")]
        public Output<string?> TimeZone { get; private set; } = null!;


        /// <summary>
        /// Create a TriggerSchedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TriggerSchedule(string name, TriggerScheduleArgs args, CustomResourceOptions? options = null)
            : base("azure:datafactory/triggerSchedule:TriggerSchedule", name, args ?? new TriggerScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TriggerSchedule(string name, Input<string> id, TriggerScheduleState? state = null, CustomResourceOptions? options = null)
            : base("azure:datafactory/triggerSchedule:TriggerSchedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TriggerSchedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TriggerSchedule Get(string name, Input<string> id, TriggerScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new TriggerSchedule(name, id, state, options);
        }
    }

    public sealed class TriggerScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if the Data Factory Schedule Trigger is activated. Defaults to `true`.
        /// </summary>
        [Input("activated")]
        public Input<bool>? Activated { get; set; }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Schedule Trigger.
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId", required: true)]
        public Input<string> DataFactoryId { get; set; } = null!;

        /// <summary>
        /// The Schedule Trigger's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The time the Schedule Trigger should end. The time will be represented in UTC.
        /// </summary>
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        /// <summary>
        /// The trigger frequency. Valid values include `Minute`, `Hour`, `Day`, `Week`, `Month`. Defaults to `Minute`.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The interval for how often the trigger occurs. This defaults to `1`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// Specifies the name of the Data Factory Schedule Trigger. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Data Factory Pipeline name that the trigger will act on.
        /// </summary>
        [Input("pipelineName")]
        public Input<string>? PipelineName { get; set; }

        [Input("pipelineParameters")]
        private InputMap<string>? _pipelineParameters;

        /// <summary>
        /// The pipeline parameters that the trigger will act upon.
        /// </summary>
        public InputMap<string> PipelineParameters
        {
            get => _pipelineParameters ?? (_pipelineParameters = new InputMap<string>());
            set => _pipelineParameters = value;
        }

        [Input("pipelines")]
        private InputList<Inputs.TriggerSchedulePipelineArgs>? _pipelines;

        /// <summary>
        /// A `pipeline` block as defined below.
        /// </summary>
        public InputList<Inputs.TriggerSchedulePipelineArgs> Pipelines
        {
            get => _pipelines ?? (_pipelines = new InputList<Inputs.TriggerSchedulePipelineArgs>());
            set => _pipelines = value;
        }

        /// <summary>
        /// A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.TriggerScheduleScheduleArgs>? Schedule { get; set; }

        /// <summary>
        /// The time the Schedule Trigger will start. This defaults to the current time. The time will be represented in UTC.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The timezone of the start/end time.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public TriggerScheduleArgs()
        {
        }
        public static new TriggerScheduleArgs Empty => new TriggerScheduleArgs();
    }

    public sealed class TriggerScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if the Data Factory Schedule Trigger is activated. Defaults to `true`.
        /// </summary>
        [Input("activated")]
        public Input<bool>? Activated { get; set; }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Schedule Trigger.
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId")]
        public Input<string>? DataFactoryId { get; set; }

        /// <summary>
        /// The Schedule Trigger's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The time the Schedule Trigger should end. The time will be represented in UTC.
        /// </summary>
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        /// <summary>
        /// The trigger frequency. Valid values include `Minute`, `Hour`, `Day`, `Week`, `Month`. Defaults to `Minute`.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The interval for how often the trigger occurs. This defaults to `1`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// Specifies the name of the Data Factory Schedule Trigger. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Data Factory Pipeline name that the trigger will act on.
        /// </summary>
        [Input("pipelineName")]
        public Input<string>? PipelineName { get; set; }

        [Input("pipelineParameters")]
        private InputMap<string>? _pipelineParameters;

        /// <summary>
        /// The pipeline parameters that the trigger will act upon.
        /// </summary>
        public InputMap<string> PipelineParameters
        {
            get => _pipelineParameters ?? (_pipelineParameters = new InputMap<string>());
            set => _pipelineParameters = value;
        }

        [Input("pipelines")]
        private InputList<Inputs.TriggerSchedulePipelineGetArgs>? _pipelines;

        /// <summary>
        /// A `pipeline` block as defined below.
        /// </summary>
        public InputList<Inputs.TriggerSchedulePipelineGetArgs> Pipelines
        {
            get => _pipelines ?? (_pipelines = new InputList<Inputs.TriggerSchedulePipelineGetArgs>());
            set => _pipelines = value;
        }

        /// <summary>
        /// A `schedule` block as defined below, which further specifies the recurrence schedule for the trigger. A schedule is capable of limiting or increasing the number of trigger executions specified by the `frequency` and `interval` properties.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.TriggerScheduleScheduleGetArgs>? Schedule { get; set; }

        /// <summary>
        /// The time the Schedule Trigger will start. This defaults to the current time. The time will be represented in UTC.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The timezone of the start/end time.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public TriggerScheduleState()
        {
        }
        public static new TriggerScheduleState Empty => new TriggerScheduleState();
    }
}
