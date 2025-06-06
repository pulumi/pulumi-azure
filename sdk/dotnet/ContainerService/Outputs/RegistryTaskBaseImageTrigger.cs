// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class RegistryTaskBaseImageTrigger
    {
        /// <summary>
        /// Should the trigger be enabled? Defaults to `true`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The name which should be used for this trigger.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The type of the trigger. Possible values are `All` and `Runtime`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The endpoint URL for receiving the trigger.
        /// </summary>
        public readonly string? UpdateTriggerEndpoint;
        /// <summary>
        /// Type of payload body for the trigger. Possible values are `Default` and `Token`.
        /// </summary>
        public readonly string? UpdateTriggerPayloadType;

        [OutputConstructor]
        private RegistryTaskBaseImageTrigger(
            bool? enabled,

            string name,

            string type,

            string? updateTriggerEndpoint,

            string? updateTriggerPayloadType)
        {
            Enabled = enabled;
            Name = name;
            Type = type;
            UpdateTriggerEndpoint = updateTriggerEndpoint;
            UpdateTriggerPayloadType = updateTriggerPayloadType;
        }
    }
}
