// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetApp
{
    public static class GetSnapshotPolicy
    {
        /// <summary>
        /// Uses this data source to access information about an existing NetApp Snapshot Policy.
        /// 
        /// ## NetApp Snapshot Policy Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.NetApp.GetSnapshotPolicy.Invoke(new()
        ///     {
        ///         ResourceGroupName = "acctestRG",
        ///         AccountName = "acctestnetappaccount",
        ///         Name = "example-snapshot-policy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Id),
        ///         ["name"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Name),
        ///         ["enabled"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Enabled),
        ///         ["hourlySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.HourlySchedules),
        ///         ["dailySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.DailySchedules),
        ///         ["weeklySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.WeeklySchedules),
        ///         ["monthlySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.MonthlySchedules),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.NetApp`: 2025-01-01
        /// </summary>
        public static Task<GetSnapshotPolicyResult> InvokeAsync(GetSnapshotPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnapshotPolicyResult>("azure:netapp/getSnapshotPolicy:getSnapshotPolicy", args ?? new GetSnapshotPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing NetApp Snapshot Policy.
        /// 
        /// ## NetApp Snapshot Policy Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.NetApp.GetSnapshotPolicy.Invoke(new()
        ///     {
        ///         ResourceGroupName = "acctestRG",
        ///         AccountName = "acctestnetappaccount",
        ///         Name = "example-snapshot-policy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Id),
        ///         ["name"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Name),
        ///         ["enabled"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Enabled),
        ///         ["hourlySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.HourlySchedules),
        ///         ["dailySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.DailySchedules),
        ///         ["weeklySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.WeeklySchedules),
        ///         ["monthlySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.MonthlySchedules),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.NetApp`: 2025-01-01
        /// </summary>
        public static Output<GetSnapshotPolicyResult> Invoke(GetSnapshotPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotPolicyResult>("azure:netapp/getSnapshotPolicy:getSnapshotPolicy", args ?? new GetSnapshotPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing NetApp Snapshot Policy.
        /// 
        /// ## NetApp Snapshot Policy Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.NetApp.GetSnapshotPolicy.Invoke(new()
        ///     {
        ///         ResourceGroupName = "acctestRG",
        ///         AccountName = "acctestnetappaccount",
        ///         Name = "example-snapshot-policy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Id),
        ///         ["name"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Name),
        ///         ["enabled"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.Enabled),
        ///         ["hourlySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.HourlySchedules),
        ///         ["dailySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.DailySchedules),
        ///         ["weeklySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.WeeklySchedules),
        ///         ["monthlySchedule"] = example.Apply(getSnapshotPolicyResult =&gt; getSnapshotPolicyResult.MonthlySchedules),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.NetApp`: 2025-01-01
        /// </summary>
        public static Output<GetSnapshotPolicyResult> Invoke(GetSnapshotPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotPolicyResult>("azure:netapp/getSnapshotPolicy:getSnapshotPolicy", args ?? new GetSnapshotPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnapshotPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the NetApp account where the NetApp Snapshot Policy exists.
        /// </summary>
        [Input("accountName", required: true)]
        public string AccountName { get; set; } = null!;

        /// <summary>
        /// The name of the NetApp Snapshot Policy.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the NetApp Snapshot Policy exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetSnapshotPolicyArgs()
        {
        }
        public static new GetSnapshotPolicyArgs Empty => new GetSnapshotPolicyArgs();
    }

    public sealed class GetSnapshotPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the NetApp account where the NetApp Snapshot Policy exists.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        /// <summary>
        /// The name of the NetApp Snapshot Policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the NetApp Snapshot Policy exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetSnapshotPolicyInvokeArgs()
        {
        }
        public static new GetSnapshotPolicyInvokeArgs Empty => new GetSnapshotPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnapshotPolicyResult
    {
        /// <summary>
        /// The name of the NetApp Account in which the NetApp Snapshot Policy was created.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// Daily snapshot schedule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotPolicyDailyScheduleResult> DailySchedules;
        /// <summary>
        /// Defines that the NetApp Snapshot Policy is enabled or not.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Hourly snapshot schedule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotPolicyHourlyScheduleResult> HourlySchedules;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specifies the supported Azure location where the resource exists.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// List of the days of the month when the snapshots will be created.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotPolicyMonthlyScheduleResult> MonthlySchedules;
        /// <summary>
        /// The name of the NetApp Snapshot Policy.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the resource group where the NetApp Snapshot Policy should be created.
        /// </summary>
        public readonly string ResourceGroupName;
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Weekly snapshot schedule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotPolicyWeeklyScheduleResult> WeeklySchedules;

        [OutputConstructor]
        private GetSnapshotPolicyResult(
            string accountName,

            ImmutableArray<Outputs.GetSnapshotPolicyDailyScheduleResult> dailySchedules,

            bool enabled,

            ImmutableArray<Outputs.GetSnapshotPolicyHourlyScheduleResult> hourlySchedules,

            string id,

            string location,

            ImmutableArray<Outputs.GetSnapshotPolicyMonthlyScheduleResult> monthlySchedules,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<Outputs.GetSnapshotPolicyWeeklyScheduleResult> weeklySchedules)
        {
            AccountName = accountName;
            DailySchedules = dailySchedules;
            Enabled = enabled;
            HourlySchedules = hourlySchedules;
            Id = id;
            Location = location;
            MonthlySchedules = monthlySchedules;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
            WeeklySchedules = weeklySchedules;
        }
    }
}
