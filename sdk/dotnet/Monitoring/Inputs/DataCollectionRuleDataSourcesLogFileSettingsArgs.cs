// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class DataCollectionRuleDataSourcesLogFileSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `text` block as defined below.
        /// </summary>
        [Input("text", required: true)]
        public Input<Inputs.DataCollectionRuleDataSourcesLogFileSettingsTextArgs> Text { get; set; } = null!;

        public DataCollectionRuleDataSourcesLogFileSettingsArgs()
        {
        }
        public static new DataCollectionRuleDataSourcesLogFileSettingsArgs Empty => new DataCollectionRuleDataSourcesLogFileSettingsArgs();
    }
}
