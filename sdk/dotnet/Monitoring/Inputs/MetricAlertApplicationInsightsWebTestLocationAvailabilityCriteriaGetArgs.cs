// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Application Insights Resource.
        /// </summary>
        [Input("componentId", required: true)]
        public Input<string> ComponentId { get; set; } = null!;

        /// <summary>
        /// The number of failed locations.
        /// </summary>
        [Input("failedLocationCount", required: true)]
        public Input<int> FailedLocationCount { get; set; } = null!;

        /// <summary>
        /// The ID of the Application Insights Web Test.
        /// </summary>
        [Input("webTestId", required: true)]
        public Input<string> WebTestId { get; set; } = null!;

        public MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaGetArgs()
        {
        }
        public static new MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaGetArgs Empty => new MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaGetArgs();
    }
}
