// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class DataCollectionRuleDataSourcesLogFileSettingsTextGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp format of the text log files. Possible values are `ISO 8601`, `YYYY-MM-DD HH:MM:SS`, `M/D/YYYY HH:MM:SS AM/PM`, `Mon DD, YYYY HH:MM:SS`, `yyMMdd HH:mm:ss`, `ddMMyy HH:mm:ss`, `MMM d hh:mm:ss`, `dd/MMM/yyyy:HH:mm:ss zzz`,and `yyyy-MM-ddTHH:mm:ssK`.
        /// </summary>
        [Input("recordStartTimestampFormat", required: true)]
        public Input<string> RecordStartTimestampFormat { get; set; } = null!;

        public DataCollectionRuleDataSourcesLogFileSettingsTextGetArgs()
        {
        }
        public static new DataCollectionRuleDataSourcesLogFileSettingsTextGetArgs Empty => new DataCollectionRuleDataSourcesLogFileSettingsTextGetArgs();
    }
}