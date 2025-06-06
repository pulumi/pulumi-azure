// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Outputs
{

    [OutputType]
    public sealed class GetAccountGeoLocationResult
    {
        public readonly int FailoverPriority;
        /// <summary>
        /// The ID of the virtual network subnet.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Azure region hosting replicated data.
        /// </summary>
        public readonly string Location;

        [OutputConstructor]
        private GetAccountGeoLocationResult(
            int failoverPriority,

            string id,

            string location)
        {
            FailoverPriority = failoverPriority;
            Id = id;
            Location = location;
        }
    }
}
