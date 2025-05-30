// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Outputs
{

    [OutputType]
    public sealed class DeploymentNetworkInterface
    {
        /// <summary>
        /// Specify The Subnet Resource ID for this NGINX Deployment.
        /// </summary>
        public readonly string SubnetId;

        [OutputConstructor]
        private DeploymentNetworkInterface(string subnetId)
        {
            SubnetId = subnetId;
        }
    }
}
