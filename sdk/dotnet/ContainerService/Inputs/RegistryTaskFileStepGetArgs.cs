// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryTaskFileStepGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The token (Git PAT or SAS token of storage account blob) associated with the context for this step.
        /// </summary>
        [Input("contextAccessToken")]
        public Input<string>? ContextAccessToken { get; set; }

        /// <summary>
        /// The URL (absolute or relative) of the source context for this step.
        /// </summary>
        [Input("contextPath")]
        public Input<string>? ContextPath { get; set; }

        [Input("secretValues")]
        private InputMap<string>? _secretValues;

        /// <summary>
        /// Specifies a map of secret values that can be passed when running a task.
        /// </summary>
        public InputMap<string> SecretValues
        {
            get => _secretValues ?? (_secretValues = new InputMap<string>());
            set => _secretValues = value;
        }

        /// <summary>
        /// The task template file path relative to the source context.
        /// </summary>
        [Input("taskFilePath", required: true)]
        public Input<string> TaskFilePath { get; set; } = null!;

        /// <summary>
        /// The parameters file path relative to the source context.
        /// </summary>
        [Input("valueFilePath")]
        public Input<string>? ValueFilePath { get; set; }

        [Input("values")]
        private InputMap<string>? _values;

        /// <summary>
        /// Specifies a map of values that can be passed when running a task.
        /// </summary>
        public InputMap<string> Values
        {
            get => _values ?? (_values = new InputMap<string>());
            set => _values = value;
        }

        public RegistryTaskFileStepGetArgs()
        {
        }
    }
}