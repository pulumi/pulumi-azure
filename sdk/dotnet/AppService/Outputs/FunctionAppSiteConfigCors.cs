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
    public sealed class FunctionAppSiteConfigCors
    {
        /// <summary>
        /// A list of origins which should be able to make cross-origin calls. `*` can be used to allow all calls.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;
        /// <summary>
        /// Are credentials supported?
        /// </summary>
        public readonly bool? SupportCredentials;

        [OutputConstructor]
        private FunctionAppSiteConfigCors(
            ImmutableArray<string> allowedOrigins,

            bool? supportCredentials)
        {
            AllowedOrigins = allowedOrigins;
            SupportCredentials = supportCredentials;
        }
    }
}
