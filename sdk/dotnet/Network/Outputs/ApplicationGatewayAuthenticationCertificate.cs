// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewayAuthenticationCertificate
    {
        /// <summary>
        /// The contents of the Authentication Certificate which should be used.
        /// </summary>
        public readonly string Data;
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The Name of the Authentication Certificate to use.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ApplicationGatewayAuthenticationCertificate(
            string data,

            string? id,

            string name)
        {
            Data = data;
            Id = id;
            Name = name;
        }
    }
}
