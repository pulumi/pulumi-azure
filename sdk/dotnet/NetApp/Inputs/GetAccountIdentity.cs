// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetApp.Inputs
{

    public sealed class GetAccountIdentityArgs : global::Pulumi.InvokeArgs
    {
        [Input("identityIds")]
        private List<string>? _identityIds;
        public List<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new List<string>());
            set => _identityIds = value;
        }

        [Input("principalId", required: true)]
        public string PrincipalId { get; set; } = null!;

        [Input("tenantId", required: true)]
        public string TenantId { get; set; } = null!;

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetAccountIdentityArgs()
        {
        }
        public static new GetAccountIdentityArgs Empty => new GetAccountIdentityArgs();
    }
}
