// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare.Inputs
{

    public sealed class DicomServiceIdentityGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityIds")]
        private InputList<string>? _identityIds;

        /// <summary>
        /// A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
        /// </summary>
        public InputList<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new InputList<string>());
            set => _identityIds = value;
        }

        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// The type of identity used for the Healthcare DICOM service. Possible values are `UserAssigned`, `SystemAssigned` and `SystemAssigned, UserAssigned`. If `UserAssigned` is set, an `identity_ids` must be set as well.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DicomServiceIdentityGetArgs()
        {
        }
        public static new DicomServiceIdentityGetArgs Empty => new DicomServiceIdentityGetArgs();
    }
}
