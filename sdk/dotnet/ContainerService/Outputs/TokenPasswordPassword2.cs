// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class TokenPasswordPassword2
    {
        /// <summary>
        /// The expiration date of the password in RFC3339 format. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? Expiry;
        /// <summary>
        /// The value of the password (Sensitive).
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private TokenPasswordPassword2(
            string? expiry,

            string? value)
        {
            Expiry = expiry;
            Value = value;
        }
    }
}