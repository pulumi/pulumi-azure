// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WorkloadsSAP.Inputs
{

    public sealed class ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `application_server` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("applicationServer")]
        public Input<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesApplicationServerGetArgs>? ApplicationServer { get; set; }

        /// <summary>
        /// A `central_server` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("centralServer")]
        public Input<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerGetArgs>? CentralServer { get; set; }

        /// <summary>
        /// A `database_server` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("databaseServer")]
        public Input<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerGetArgs>? DatabaseServer { get; set; }

        /// <summary>
        /// A `shared_storage` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sharedStorage")]
        public Input<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesSharedStorageGetArgs>? SharedStorage { get; set; }

        public ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesGetArgs()
        {
        }
        public static new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesGetArgs Empty => new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesGetArgs();
    }
}
