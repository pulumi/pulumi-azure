// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lighthouse.Inputs
{

    public sealed class DefinitionEligibleAuthorizationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `just_in_time_access_policy` block as defined below.
        /// </summary>
        [Input("justInTimeAccessPolicy")]
        public Input<Inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyGetArgs>? JustInTimeAccessPolicy { get; set; }

        /// <summary>
        /// The display name of the Azure Active Directory Principal.
        /// </summary>
        [Input("principalDisplayName")]
        public Input<string>? PrincipalDisplayName { get; set; }

        /// <summary>
        /// The Principal ID of the Azure Active Directory.
        /// </summary>
        [Input("principalId", required: true)]
        public Input<string> PrincipalId { get; set; } = null!;

        /// <summary>
        /// The Principal ID of the Azure built-in role that defines the permissions that the Azure Active Directory will have on the projected scope.
        /// </summary>
        [Input("roleDefinitionId", required: true)]
        public Input<string> RoleDefinitionId { get; set; } = null!;

        public DefinitionEligibleAuthorizationGetArgs()
        {
        }
        public static new DefinitionEligibleAuthorizationGetArgs Empty => new DefinitionEligibleAuthorizationGetArgs();
    }
}