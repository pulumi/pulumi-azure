// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cognitive.Outputs
{

    [OutputType]
    public sealed class AIServicesStorage
    {
        /// <summary>
        /// The client ID of the Managed Identity associated with the Storage Account.
        /// </summary>
        public readonly string? IdentityClientId;
        /// <summary>
        /// The ID of the Storage Account.
        /// </summary>
        public readonly string StorageAccountId;

        [OutputConstructor]
        private AIServicesStorage(
            string? identityClientId,

            string storageAccountId)
        {
            IdentityClientId = identityClientId;
            StorageAccountId = storageAccountId;
        }
    }
}
