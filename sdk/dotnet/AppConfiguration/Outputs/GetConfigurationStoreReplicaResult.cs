// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration.Outputs
{

    [OutputType]
    public sealed class GetConfigurationStoreReplicaResult
    {
        /// <summary>
        /// The URL of the App Configuration Replica.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The ID of the Access Key.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The supported Azure location where the App Configuration Replica exists.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The Name of this App Configuration.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetConfigurationStoreReplicaResult(
            string endpoint,

            string id,

            string location,

            string name)
        {
            Endpoint = endpoint;
            Id = id;
            Location = location;
            Name = name;
        }
    }
}
