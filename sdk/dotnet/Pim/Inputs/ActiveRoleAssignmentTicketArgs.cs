// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Pim.Inputs
{

    public sealed class ActiveRoleAssignmentTicketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-supplied ticket number to be included with the request. Changing this forces a new resource to be created.
        /// </summary>
        [Input("number")]
        public Input<string>? Number { get; set; }

        /// <summary>
        /// User-supplied ticket system name to be included with the request. Changing this forces a new resource to be created.
        /// </summary>
        [Input("system")]
        public Input<string>? System { get; set; }

        public ActiveRoleAssignmentTicketArgs()
        {
        }
        public static new ActiveRoleAssignmentTicketArgs Empty => new ActiveRoleAssignmentTicketArgs();
    }
}
