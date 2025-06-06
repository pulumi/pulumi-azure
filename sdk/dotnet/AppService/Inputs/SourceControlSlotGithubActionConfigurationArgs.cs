// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class SourceControlSlotGithubActionConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `code_configuration` block as detailed below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("codeConfiguration")]
        public Input<Inputs.SourceControlSlotGithubActionConfigurationCodeConfigurationArgs>? CodeConfiguration { get; set; }

        /// <summary>
        /// A `container_configuration` block as detailed below.
        /// </summary>
        [Input("containerConfiguration")]
        public Input<Inputs.SourceControlSlotGithubActionConfigurationContainerConfigurationArgs>? ContainerConfiguration { get; set; }

        /// <summary>
        /// Should the service generate the GitHub Action Workflow file. Defaults to `true` Changing this forces a new resource to be created.
        /// </summary>
        [Input("generateWorkflowFile")]
        public Input<bool>? GenerateWorkflowFile { get; set; }

        /// <summary>
        /// Denotes this action uses a Linux base image.
        /// </summary>
        [Input("linuxAction")]
        public Input<bool>? LinuxAction { get; set; }

        public SourceControlSlotGithubActionConfigurationArgs()
        {
        }
        public static new SourceControlSlotGithubActionConfigurationArgs Empty => new SourceControlSlotGithubActionConfigurationArgs();
    }
}
