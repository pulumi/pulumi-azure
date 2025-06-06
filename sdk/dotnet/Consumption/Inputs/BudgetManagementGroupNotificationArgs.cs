// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Consumption.Inputs
{

    public sealed class BudgetManagementGroupNotificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("contactEmails", required: true)]
        private InputList<string>? _contactEmails;

        /// <summary>
        /// Specifies a list of email addresses to send the budget notification to when the threshold is exceeded.
        /// </summary>
        public InputList<string> ContactEmails
        {
            get => _contactEmails ?? (_contactEmails = new InputList<string>());
            set => _contactEmails = value;
        }

        /// <summary>
        /// Should the notification be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The comparison operator for the notification. Must be one of `EqualTo`, `GreaterThan`, or `GreaterThanOrEqualTo`.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        /// <summary>
        /// The type of threshold for the notification. This determines whether the notification is triggered by forecasted costs or actual costs. The allowed values are `Actual` and `Forecasted`. Default is `Actual`.
        /// </summary>
        [Input("thresholdType")]
        public Input<string>? ThresholdType { get; set; }

        public BudgetManagementGroupNotificationArgs()
        {
        }
        public static new BudgetManagementGroupNotificationArgs Empty => new BudgetManagementGroupNotificationArgs();
    }
}
