// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class GetDataCollectionRuleDataSourcePerformanceCounterResult
    {
        /// <summary>
        /// Specifies a list of specifier names of the performance counters you want to collect. Use a wildcard `*` to collect counters for all instances. To get a list of performance counters on Windows, run the command `typeperf`.
        /// </summary>
        public readonly ImmutableArray<string> CounterSpecifiers;
        /// <summary>
        /// Specifies the name of the Data Collection Rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The number of seconds between consecutive counter measurements (samples). The value should be integer between `1` and `300` inclusive.
        /// </summary>
        public readonly int SamplingFrequencyInSeconds;
        /// <summary>
        /// Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible values are `Microsoft-Event`,and `Microsoft-WindowsEvent`.
        /// </summary>
        public readonly ImmutableArray<string> Streams;

        [OutputConstructor]
        private GetDataCollectionRuleDataSourcePerformanceCounterResult(
            ImmutableArray<string> counterSpecifiers,

            string name,

            int samplingFrequencyInSeconds,

            ImmutableArray<string> streams)
        {
            CounterSpecifiers = counterSpecifiers;
            Name = name;
            SamplingFrequencyInSeconds = samplingFrequencyInSeconds;
            Streams = streams;
        }
    }
}