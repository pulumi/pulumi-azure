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
    public sealed class GetDicomServiceAuthenticationResult
    {
        /// <summary>
        /// The intended audience to receive authentication tokens for the service. The default value is &lt;https://dicom.azurehealthcareapis.azure.com&gt;
        /// </summary>
        public readonly ImmutableArray<string> Audiences;
        public readonly string Authority;

        [OutputConstructor]
        private GetDicomServiceAuthenticationResult(
            ImmutableArray<string> audiences,

            string authority)
        {
            Audiences = audiences;
            Authority = authority;
        }
    }
}
