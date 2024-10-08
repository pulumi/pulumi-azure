// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PostgreSql.Inputs
{

    public sealed class FlexibleServerIdentityArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityIds", required: true)]
        private InputList<string>? _identityIds;

        /// <summary>
        /// A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
        /// </summary>
        public InputList<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new InputList<string>());
            set => _identityIds = value;
        }

        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. The only possible value is `UserAssigned`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FlexibleServerIdentityArgs()
        {
        }
        public static new FlexibleServerIdentityArgs Empty => new FlexibleServerIdentityArgs();
    }
}
