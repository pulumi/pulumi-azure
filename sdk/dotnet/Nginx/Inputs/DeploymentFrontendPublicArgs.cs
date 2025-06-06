// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Inputs
{

    public sealed class DeploymentFrontendPublicArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipAddresses")]
        private InputList<string>? _ipAddresses;

        /// <summary>
        /// Specifies a list of Public IP Resource ID to this NGINX Deployment.
        /// </summary>
        public InputList<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<string>());
            set => _ipAddresses = value;
        }

        public DeploymentFrontendPublicArgs()
        {
        }
        public static new DeploymentFrontendPublicArgs Empty => new DeploymentFrontendPublicArgs();
    }
}
