// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Inputs
{

    public sealed class PolicyVMRetentionWeeklyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of weekly backups to keep. Must be between `1` and `9999`
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        [Input("weekdays", required: true)]
        private InputList<string>? _weekdays;

        /// <summary>
        /// The weekday backups to retain. Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
        /// </summary>
        public InputList<string> Weekdays
        {
            get => _weekdays ?? (_weekdays = new InputList<string>());
            set => _weekdays = value;
        }

        public PolicyVMRetentionWeeklyGetArgs()
        {
        }
        public static new PolicyVMRetentionWeeklyGetArgs Empty => new PolicyVMRetentionWeeklyGetArgs();
    }
}
