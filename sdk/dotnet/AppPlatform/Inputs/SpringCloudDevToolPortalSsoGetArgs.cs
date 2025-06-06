// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Inputs
{

    public sealed class SpringCloudDevToolPortalSsoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the public identifier for the application.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// Specifies the secret known only to the application and the authorization server.
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// Specifies the URI of a JSON file with generic OIDC provider configuration.
        /// </summary>
        [Input("metadataUrl")]
        public Input<string>? MetadataUrl { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Specifies a list of specific actions applications can be allowed to do on a user's behalf.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public SpringCloudDevToolPortalSsoGetArgs()
        {
        }
        public static new SpringCloudDevToolPortalSsoGetArgs Empty => new SpringCloudDevToolPortalSsoGetArgs();
    }
}
