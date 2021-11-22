// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring
{
    /// <summary>
    /// Manages a logz Tag Rule.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleLogzMonitor = new Azure.Monitoring.LogzMonitor("exampleLogzMonitor", new Azure.Monitoring.LogzMonitorArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             Plan = new Azure.Monitoring.Inputs.LogzMonitorPlanArgs
    ///             {
    ///                 BillingCycle = "Monthly",
    ///                 EffectiveDate = "2022-06-06T00:00:00Z",
    ///                 PlanId = "100gb14days",
    ///                 UsageType = "Committed",
    ///             },
    ///             User = new Azure.Monitoring.Inputs.LogzMonitorUserArgs
    ///             {
    ///                 Email = "user@example.com",
    ///                 FirstName = "Example",
    ///                 LastName = "User",
    ///                 PhoneNumber = "+12313803556",
    ///             },
    ///         });
    ///         var exampleLogzTagRule = new Azure.Monitoring.LogzTagRule("exampleLogzTagRule", new Azure.Monitoring.LogzTagRuleArgs
    ///         {
    ///             LogzMonitorId = exampleLogzMonitor.Id,
    ///             TagFilters = 
    ///             {
    ///                 new Azure.Monitoring.Inputs.LogzTagRuleTagFilterArgs
    ///                 {
    ///                     Name = "name1",
    ///                     Action = "Include",
    ///                     Value = "value1",
    ///                 },
    ///                 new Azure.Monitoring.Inputs.LogzTagRuleTagFilterArgs
    ///                 {
    ///                     Name = "name2",
    ///                     Action = "Exclude",
    ///                     Value = "value2",
    ///                 },
    ///             },
    ///             SendAadLogs = true,
    ///             SendActivityLogs = true,
    ///             SendSubscriptionLogs = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// logz Tag Rules can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:monitoring/logzTagRule:LogzTagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/tagRules/ruleSet1
    /// ```
    /// </summary>
    [AzureResourceType("azure:monitoring/logzTagRule:LogzTagRule")]
    public partial class LogzTagRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
        /// </summary>
        [Output("logzMonitorId")]
        public Output<string> LogzMonitorId { get; private set; } = null!;

        /// <summary>
        /// Whether AAD logs should be sent to the Monitor resource?
        /// </summary>
        [Output("sendAadLogs")]
        public Output<bool?> SendAadLogs { get; private set; } = null!;

        /// <summary>
        /// Whether activity logs from Azure resources should be sent to the Monitor resource?
        /// </summary>
        [Output("sendActivityLogs")]
        public Output<bool?> SendActivityLogs { get; private set; } = null!;

        /// <summary>
        /// Whether subscription logs should be sent to the Monitor resource?
        /// </summary>
        [Output("sendSubscriptionLogs")]
        public Output<bool?> SendSubscriptionLogs { get; private set; } = null!;

        /// <summary>
        /// One or more (up to 10) `tag_filter` blocks as defined below.
        /// </summary>
        [Output("tagFilters")]
        public Output<ImmutableArray<Outputs.LogzTagRuleTagFilter>> TagFilters { get; private set; } = null!;


        /// <summary>
        /// Create a LogzTagRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogzTagRule(string name, LogzTagRuleArgs args, CustomResourceOptions? options = null)
            : base("azure:monitoring/logzTagRule:LogzTagRule", name, args ?? new LogzTagRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogzTagRule(string name, Input<string> id, LogzTagRuleState? state = null, CustomResourceOptions? options = null)
            : base("azure:monitoring/logzTagRule:LogzTagRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogzTagRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogzTagRule Get(string name, Input<string> id, LogzTagRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new LogzTagRule(name, id, state, options);
        }
    }

    public sealed class LogzTagRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
        /// </summary>
        [Input("logzMonitorId", required: true)]
        public Input<string> LogzMonitorId { get; set; } = null!;

        /// <summary>
        /// Whether AAD logs should be sent to the Monitor resource?
        /// </summary>
        [Input("sendAadLogs")]
        public Input<bool>? SendAadLogs { get; set; }

        /// <summary>
        /// Whether activity logs from Azure resources should be sent to the Monitor resource?
        /// </summary>
        [Input("sendActivityLogs")]
        public Input<bool>? SendActivityLogs { get; set; }

        /// <summary>
        /// Whether subscription logs should be sent to the Monitor resource?
        /// </summary>
        [Input("sendSubscriptionLogs")]
        public Input<bool>? SendSubscriptionLogs { get; set; }

        [Input("tagFilters")]
        private InputList<Inputs.LogzTagRuleTagFilterArgs>? _tagFilters;

        /// <summary>
        /// One or more (up to 10) `tag_filter` blocks as defined below.
        /// </summary>
        public InputList<Inputs.LogzTagRuleTagFilterArgs> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<Inputs.LogzTagRuleTagFilterArgs>());
            set => _tagFilters = value;
        }

        public LogzTagRuleArgs()
        {
        }
    }

    public sealed class LogzTagRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
        /// </summary>
        [Input("logzMonitorId")]
        public Input<string>? LogzMonitorId { get; set; }

        /// <summary>
        /// Whether AAD logs should be sent to the Monitor resource?
        /// </summary>
        [Input("sendAadLogs")]
        public Input<bool>? SendAadLogs { get; set; }

        /// <summary>
        /// Whether activity logs from Azure resources should be sent to the Monitor resource?
        /// </summary>
        [Input("sendActivityLogs")]
        public Input<bool>? SendActivityLogs { get; set; }

        /// <summary>
        /// Whether subscription logs should be sent to the Monitor resource?
        /// </summary>
        [Input("sendSubscriptionLogs")]
        public Input<bool>? SendSubscriptionLogs { get; set; }

        [Input("tagFilters")]
        private InputList<Inputs.LogzTagRuleTagFilterGetArgs>? _tagFilters;

        /// <summary>
        /// One or more (up to 10) `tag_filter` blocks as defined below.
        /// </summary>
        public InputList<Inputs.LogzTagRuleTagFilterGetArgs> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<Inputs.LogzTagRuleTagFilterGetArgs>());
            set => _tagFilters = value;
        }

        public LogzTagRuleState()
        {
        }
    }
}