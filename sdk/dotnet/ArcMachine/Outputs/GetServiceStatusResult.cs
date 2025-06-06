// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArcMachine.Outputs
{

    [OutputType]
    public sealed class GetServiceStatusResult
    {
        /// <summary>
        /// A `extension_service` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceStatusExtensionServiceResult> ExtensionServices;
        /// <summary>
        /// A `guest_configuration_service` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceStatusGuestConfigurationServiceResult> GuestConfigurationServices;

        [OutputConstructor]
        private GetServiceStatusResult(
            ImmutableArray<Outputs.GetServiceStatusExtensionServiceResult> extensionServices,

            ImmutableArray<Outputs.GetServiceStatusGuestConfigurationServiceResult> guestConfigurationServices)
        {
            ExtensionServices = extensionServices;
            GuestConfigurationServices = guestConfigurationServices;
        }
    }
}
