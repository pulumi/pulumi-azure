// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab
{
    /// <summary>
    /// Manages a Lab Service Schedule.
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
    ///     var exampleLab = new Azure.Lab.Lab("exampleLab", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Title = "Test Title",
    ///         Security = new Azure.Lab.Inputs.LabSecurityArgs
    ///         {
    ///             OpenAccessEnabled = false,
    ///         },
    ///         VirtualMachine = new Azure.Lab.Inputs.LabVirtualMachineArgs
    ///         {
    ///             AdminUser = new Azure.Lab.Inputs.LabVirtualMachineAdminUserArgs
    ///             {
    ///                 Username = "testadmin",
    ///                 Password = "Password1234!",
    ///             },
    ///             ImageReference = new Azure.Lab.Inputs.LabVirtualMachineImageReferenceArgs
    ///             {
    ///                 Offer = "0001-com-ubuntu-server-focal",
    ///                 Publisher = "canonical",
    ///                 Sku = "20_04-lts",
    ///                 Version = "latest",
    ///             },
    ///             Sku = new Azure.Lab.Inputs.LabVirtualMachineSkuArgs
    ///             {
    ///                 Name = "Classic_Fsv2_2_4GB_128_S_SSD",
    ///                 Capacity = 1,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleSchedule = new Azure.Lab.Schedule("exampleSchedule", new()
    ///     {
    ///         LabId = exampleLab.Id,
    ///         StopTime = "2022-11-28T00:00:00Z",
    ///         TimeZone = "America/Los_Angeles",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Lab Service Schedules can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:lab/schedule:Schedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.LabServices/labs/lab1/schedules/schedule1
    /// ```
    /// </summary>
    [AzureResourceType("azure:lab/schedule:Schedule")]
    public partial class Schedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resource ID of the Lab Service Schedule. Changing this forces a new resource to be created.
        /// </summary>
        [Output("labId")]
        public Output<string> LabId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Lab Service Schedule. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The notes for the Schedule.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// A `recurrence` block as defined below.
        /// </summary>
        [Output("recurrence")]
        public Output<Outputs.ScheduleRecurrence?> Recurrence { get; private set; } = null!;

        /// <summary>
        /// When Lab User Virtual Machines will be started in RFC-3339 format.
        /// </summary>
        [Output("startTime")]
        public Output<string?> StartTime { get; private set; } = null!;

        /// <summary>
        /// When Lab User Virtual Machines will be stopped in RFC-3339 format.
        /// </summary>
        [Output("stopTime")]
        public Output<string> StopTime { get; private set; } = null!;

        /// <summary>
        /// The IANA Time Zone ID for the Schedule.
        /// </summary>
        [Output("timeZone")]
        public Output<string> TimeZone { get; private set; } = null!;


        /// <summary>
        /// Create a Schedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Schedule(string name, ScheduleArgs args, CustomResourceOptions? options = null)
            : base("azure:lab/schedule:Schedule", name, args ?? new ScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Schedule(string name, Input<string> id, ScheduleState? state = null, CustomResourceOptions? options = null)
            : base("azure:lab/schedule:Schedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Schedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Schedule Get(string name, Input<string> id, ScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new Schedule(name, id, state, options);
        }
    }

    public sealed class ScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the Lab Service Schedule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labId", required: true)]
        public Input<string> LabId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Lab Service Schedule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The notes for the Schedule.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// A `recurrence` block as defined below.
        /// </summary>
        [Input("recurrence")]
        public Input<Inputs.ScheduleRecurrenceArgs>? Recurrence { get; set; }

        /// <summary>
        /// When Lab User Virtual Machines will be started in RFC-3339 format.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// When Lab User Virtual Machines will be stopped in RFC-3339 format.
        /// </summary>
        [Input("stopTime", required: true)]
        public Input<string> StopTime { get; set; } = null!;

        /// <summary>
        /// The IANA Time Zone ID for the Schedule.
        /// </summary>
        [Input("timeZone", required: true)]
        public Input<string> TimeZone { get; set; } = null!;

        public ScheduleArgs()
        {
        }
        public static new ScheduleArgs Empty => new ScheduleArgs();
    }

    public sealed class ScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the Lab Service Schedule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labId")]
        public Input<string>? LabId { get; set; }

        /// <summary>
        /// The name which should be used for this Lab Service Schedule. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The notes for the Schedule.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// A `recurrence` block as defined below.
        /// </summary>
        [Input("recurrence")]
        public Input<Inputs.ScheduleRecurrenceGetArgs>? Recurrence { get; set; }

        /// <summary>
        /// When Lab User Virtual Machines will be started in RFC-3339 format.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// When Lab User Virtual Machines will be stopped in RFC-3339 format.
        /// </summary>
        [Input("stopTime")]
        public Input<string>? StopTime { get; set; }

        /// <summary>
        /// The IANA Time Zone ID for the Schedule.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public ScheduleState()
        {
        }
        public static new ScheduleState Empty => new ScheduleState();
    }
}