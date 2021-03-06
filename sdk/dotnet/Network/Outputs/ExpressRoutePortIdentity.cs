// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ExpressRoutePortIdentity
    {
        /// <summary>
        /// Specifies a list with a single user managed identity id to be assigned to the Express Route Port. Currently, exactly one id is allowed to specify.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The type of the identity used for the Express Route Port. Currently, the only possible values is `UserAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ExpressRoutePortIdentity(
            ImmutableArray<string> identityIds,

            string type)
        {
            IdentityIds = identityIds;
            Type = type;
        }
    }
}
