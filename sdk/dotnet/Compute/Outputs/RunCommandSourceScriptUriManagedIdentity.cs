// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class RunCommandSourceScriptUriManagedIdentity
    {
        /// <summary>
        /// The client ID of the managed identity.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The object ID of the managed identity.
        /// </summary>
        public readonly string? ObjectId;

        [OutputConstructor]
        private RunCommandSourceScriptUriManagedIdentity(
            string? clientId,

            string? objectId)
        {
            ClientId = clientId;
            ObjectId = objectId;
        }
    }
}
