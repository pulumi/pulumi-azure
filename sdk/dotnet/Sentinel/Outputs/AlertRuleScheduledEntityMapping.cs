// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Outputs
{

    [OutputType]
    public sealed class AlertRuleScheduledEntityMapping
    {
        /// <summary>
        /// The type of the entity. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
        /// </summary>
        public readonly string EntityType;
        /// <summary>
        /// A list of `field_mapping` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AlertRuleScheduledEntityMappingFieldMapping> FieldMappings;

        [OutputConstructor]
        private AlertRuleScheduledEntityMapping(
            string entityType,

            ImmutableArray<Outputs.AlertRuleScheduledEntityMappingFieldMapping> fieldMappings)
        {
            EntityType = entityType;
            FieldMappings = fieldMappings;
        }
    }
}
