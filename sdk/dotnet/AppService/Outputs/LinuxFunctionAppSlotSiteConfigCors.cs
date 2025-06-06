// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class LinuxFunctionAppSlotSiteConfigCors
    {
        /// <summary>
        /// Specifies a list of origins that should be allowed to make cross-origin calls.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;
        /// <summary>
        /// Are credentials allowed in CORS requests? Defaults to `false`.
        /// </summary>
        public readonly bool? SupportCredentials;

        [OutputConstructor]
        private LinuxFunctionAppSlotSiteConfigCors(
            ImmutableArray<string> allowedOrigins,

            bool? supportCredentials)
        {
            AllowedOrigins = allowedOrigins;
            SupportCredentials = supportCredentials;
        }
    }
}
