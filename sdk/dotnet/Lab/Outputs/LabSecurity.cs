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
    public sealed class LabSecurity
    {
        /// <summary>
        /// Is open access enabled to allow any user or only specified users to register to a Lab Service Lab?
        /// </summary>
        public readonly bool OpenAccessEnabled;
        /// <summary>
        /// The registration code for the Lab Service Lab.
        /// </summary>
        public readonly string? RegistrationCode;

        [OutputConstructor]
        private LabSecurity(
            bool openAccessEnabled,

            string? registrationCode)
        {
            OpenAccessEnabled = openAccessEnabled;
            RegistrationCode = registrationCode;
        }
    }
}
