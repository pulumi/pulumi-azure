// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Outputs
{

    [OutputType]
    public sealed class ServiceSignUp
    {
        /// <summary>
        /// Can users sign up on the development portal?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// A `terms_of_service` block as defined below.
        /// </summary>
        public readonly Outputs.ServiceSignUpTermsOfService TermsOfService;

        [OutputConstructor]
        private ServiceSignUp(
            bool enabled,

            Outputs.ServiceSignUpTermsOfService termsOfService)
        {
            Enabled = enabled;
            TermsOfService = termsOfService;
        }
    }
}
