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
    public sealed class AccountGeoLocation
    {
        /// <summary>
        /// The failover priority of the region. A failover priority of `0` indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists. Changing this causes the location to be re-provisioned and cannot be changed for the location with failover priority `0`.
        /// </summary>
        public readonly int FailoverPriority;
        /// <summary>
        /// The CosmosDB Account ID.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The name of the Azure region to host replicated data.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// Should zone redundancy be enabled for this region? Defaults to `false`.
        /// </summary>
        public readonly bool? ZoneRedundant;

        [OutputConstructor]
        private AccountGeoLocation(
            int failoverPriority,

            string? id,

            string location,

            bool? zoneRedundant)
        {
            FailoverPriority = failoverPriority;
            Id = id;
            Location = location;
            ZoneRedundant = zoneRedundant;
        }
    }
}
