// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MachineLearning.Inputs
{

    public sealed class WorkspaceManagedNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The isolation mode of the Machine Learning Workspace. Possible values are `Disabled`, `AllowOnlyApprovedOutbound`, and `AllowInternetOutbound`
        /// </summary>
        [Input("isolationMode")]
        public Input<string>? IsolationMode { get; set; }

        public WorkspaceManagedNetworkGetArgs()
        {
        }
        public static new WorkspaceManagedNetworkGetArgs Empty => new WorkspaceManagedNetworkGetArgs();
    }
}
