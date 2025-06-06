// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot.Inputs
{

    public sealed class SecuritySolutionAdditionalWorkspaceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataTypes", required: true)]
        private InputList<string>? _dataTypes;

        /// <summary>
        /// A list of data types which sent to workspace. Possible values are `Alerts` and `RawEvents`.
        /// </summary>
        public InputList<string> DataTypes
        {
            get => _dataTypes ?? (_dataTypes = new InputList<string>());
            set => _dataTypes = value;
        }

        /// <summary>
        /// The resource ID of the Log Analytics Workspace.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public SecuritySolutionAdditionalWorkspaceGetArgs()
        {
        }
        public static new SecuritySolutionAdditionalWorkspaceGetArgs Empty => new SecuritySolutionAdditionalWorkspaceGetArgs();
    }
}
