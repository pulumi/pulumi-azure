// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class AccountImmutabilityPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
        /// </summary>
        [Input("allowProtectedAppendWrites", required: true)]
        public Input<bool> AllowProtectedAppendWrites { get; set; } = null!;

        /// <summary>
        /// The immutability period for the blobs in the container since the policy creation, in days.
        /// </summary>
        [Input("periodSinceCreationInDays", required: true)]
        public Input<int> PeriodSinceCreationInDays { get; set; } = null!;

        /// <summary>
        /// Defines the mode of the policy. `Disabled` state disables the policy, `Unlocked` state allows increase and decrease of immutability retention time and also allows toggling allowProtectedAppendWrites property, `Locked` state only allows the increase of the immutability retention time. A policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a policy in an Unlocked state can transition to a Locked state which cannot be reverted. Changing from `Locked` forces a new resource to be created.
        /// </summary>
        [Input("state", required: true)]
        public Input<string> State { get; set; } = null!;

        public AccountImmutabilityPolicyGetArgs()
        {
        }
        public static new AccountImmutabilityPolicyGetArgs Empty => new AccountImmutabilityPolicyGetArgs();
    }
}
