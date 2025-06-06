// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NewRelic.Outputs
{

    [OutputType]
    public sealed class MonitorPlan
    {
        /// <summary>
        /// Specifies the billing cycles. Possible values are `MONTHLY`, `WEEKLY` and `YEARLY`. Defaults to `MONTHLY`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public readonly string? BillingCycle;
        /// <summary>
        /// Specifies the date when plan was applied. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public readonly string EffectiveDate;
        /// <summary>
        /// Specifies the plan id published by NewRelic. The only possible value is `newrelic-pay-as-you-go-free-live`. Defaults to `newrelic-pay-as-you-go-free-live`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public readonly string? PlanId;
        /// <summary>
        /// Specifies the usage type. Possible values are `COMMITTED` and `PAYG`. Defaults to `PAYG`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public readonly string? UsageType;

        [OutputConstructor]
        private MonitorPlan(
            string? billingCycle,

            string effectiveDate,

            string? planId,

            string? usageType)
        {
            BillingCycle = billingCycle;
            EffectiveDate = effectiveDate;
            PlanId = planId;
            UsageType = usageType;
        }
    }
}
