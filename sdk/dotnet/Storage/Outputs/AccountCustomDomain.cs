// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class AccountCustomDomain
    {
        /// <summary>
        /// The Custom Domain Name to use for the Storage Account, which will be validated by Azure.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Should the Custom Domain Name be validated by using indirect CNAME validation?
        /// </summary>
        public readonly bool? UseSubdomain;

        [OutputConstructor]
        private AccountCustomDomain(
            string name,

            bool? useSubdomain)
        {
            Name = name;
            UseSubdomain = useSubdomain;
        }
    }
}
