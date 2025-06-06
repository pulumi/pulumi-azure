// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class ManagedDatabaseLongTermRetentionPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("immutableBackupsEnabled")]
        public Input<bool>? ImmutableBackupsEnabled { get; set; }

        /// <summary>
        /// The monthly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 120 months. e.g. `P1Y`, `P1M`, `P4W` or `P30D`. Defaults to `PT0S`.
        /// </summary>
        [Input("monthlyRetention")]
        public Input<string>? MonthlyRetention { get; set; }

        /// <summary>
        /// The week of year to take the yearly backup. Value has to be between `1` and `52`.
        /// </summary>
        [Input("weekOfYear")]
        public Input<int>? WeekOfYear { get; set; }

        /// <summary>
        /// The weekly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 520 weeks. e.g. `P1Y`, `P1M`, `P1W` or `P7D`. Defaults to `PT0S`.
        /// </summary>
        [Input("weeklyRetention")]
        public Input<string>? WeeklyRetention { get; set; }

        /// <summary>
        /// The yearly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 10 years. e.g. `P1Y`, `P12M`, `P52W` or `P365D`. Defaults to `PT0S`.
        /// </summary>
        [Input("yearlyRetention")]
        public Input<string>? YearlyRetention { get; set; }

        public ManagedDatabaseLongTermRetentionPolicyGetArgs()
        {
        }
        public static new ManagedDatabaseLongTermRetentionPolicyGetArgs Empty => new ManagedDatabaseLongTermRetentionPolicyGetArgs();
    }
}
