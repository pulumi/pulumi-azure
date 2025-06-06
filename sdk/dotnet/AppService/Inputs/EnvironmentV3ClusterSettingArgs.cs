// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class EnvironmentV3ClusterSettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Cluster Setting.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value for the Cluster Setting.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EnvironmentV3ClusterSettingArgs()
        {
        }
        public static new EnvironmentV3ClusterSettingArgs Empty => new EnvironmentV3ClusterSettingArgs();
    }
}
