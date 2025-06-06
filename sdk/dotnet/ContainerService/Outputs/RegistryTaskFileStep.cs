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
    public sealed class RegistryTaskFileStep
    {
        /// <summary>
        /// The token (Git PAT or SAS token of storage account blob) associated with the context for this step.
        /// </summary>
        public readonly string? ContextAccessToken;
        /// <summary>
        /// The URL (absolute or relative) of the source context for this step.
        /// </summary>
        public readonly string? ContextPath;
        /// <summary>
        /// Specifies a map of secret values that can be passed when running a task.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? SecretValues;
        /// <summary>
        /// The task template file path relative to the source context.
        /// </summary>
        public readonly string TaskFilePath;
        /// <summary>
        /// The parameters file path relative to the source context.
        /// </summary>
        public readonly string? ValueFilePath;
        /// <summary>
        /// Specifies a map of values that can be passed when running a task.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Values;

        [OutputConstructor]
        private RegistryTaskFileStep(
            string? contextAccessToken,

            string? contextPath,

            ImmutableDictionary<string, string>? secretValues,

            string taskFilePath,

            string? valueFilePath,

            ImmutableDictionary<string, string>? values)
        {
            ContextAccessToken = contextAccessToken;
            ContextPath = contextPath;
            SecretValues = secretValues;
            TaskFilePath = taskFilePath;
            ValueFilePath = valueFilePath;
            Values = values;
        }
    }
}
