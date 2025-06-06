// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare.Outputs
{

    [OutputType]
    public sealed class WorkspacePrivateEndpointConnection
    {
        /// <summary>
        /// The ID of the Healthcare Workspace.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Specifies the name of the Healthcare Workspace. Changing this forces a new Healthcare Workspace to be created.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private WorkspacePrivateEndpointConnection(
            string? id,

            string? name)
        {
            Id = id;
            Name = name;
        }
    }
}
