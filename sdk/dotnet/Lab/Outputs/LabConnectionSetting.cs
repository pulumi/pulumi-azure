// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab.Outputs
{

    [OutputType]
    public sealed class LabConnectionSetting
    {
        /// <summary>
        /// The enabled access level for Client Access over RDP. Possible value is `Public`.
        /// </summary>
        public readonly string? ClientRdpAccess;
        /// <summary>
        /// The enabled access level for Client Access over SSH. Possible value is `Public`.
        /// </summary>
        public readonly string? ClientSshAccess;

        [OutputConstructor]
        private LabConnectionSetting(
            string? clientRdpAccess,

            string? clientSshAccess)
        {
            ClientRdpAccess = clientRdpAccess;
            ClientSshAccess = clientSshAccess;
        }
    }
}