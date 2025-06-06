// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class WindowsWebAppAuthSettingsV2AzureStaticWebAppV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Client to use to authenticate with Azure Static Web App Authentication.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        public WindowsWebAppAuthSettingsV2AzureStaticWebAppV2Args()
        {
        }
        public static new WindowsWebAppAuthSettingsV2AzureStaticWebAppV2Args Empty => new WindowsWebAppAuthSettingsV2AzureStaticWebAppV2Args();
    }
}
