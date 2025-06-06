// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Inputs
{

    public sealed class SoftwareUpdateConfigurationTargetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("azureQueries")]
        private InputList<Inputs.SoftwareUpdateConfigurationTargetAzureQueryGetArgs>? _azureQueries;

        /// <summary>
        /// One or more `azure_query` blocks as defined above.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationTargetAzureQueryGetArgs> AzureQueries
        {
            get => _azureQueries ?? (_azureQueries = new InputList<Inputs.SoftwareUpdateConfigurationTargetAzureQueryGetArgs>());
            set => _azureQueries = value;
        }

        [Input("nonAzureQueries")]
        private InputList<Inputs.SoftwareUpdateConfigurationTargetNonAzureQueryGetArgs>? _nonAzureQueries;

        /// <summary>
        /// One or more `non_azure_query` blocks as defined above.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationTargetNonAzureQueryGetArgs> NonAzureQueries
        {
            get => _nonAzureQueries ?? (_nonAzureQueries = new InputList<Inputs.SoftwareUpdateConfigurationTargetNonAzureQueryGetArgs>());
            set => _nonAzureQueries = value;
        }

        public SoftwareUpdateConfigurationTargetGetArgs()
        {
        }
        public static new SoftwareUpdateConfigurationTargetGetArgs Empty => new SoftwareUpdateConfigurationTargetGetArgs();
    }
}
