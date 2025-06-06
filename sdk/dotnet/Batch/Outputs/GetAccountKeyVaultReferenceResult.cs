// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Outputs
{

    [OutputType]
    public sealed class GetAccountKeyVaultReferenceResult
    {
        /// <summary>
        /// The Azure identifier of the Azure KeyVault reference.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The HTTPS URL of the Azure KeyVault reference.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetAccountKeyVaultReferenceResult(
            string id,

            string url)
        {
            Id = id;
            Url = url;
        }
    }
}
