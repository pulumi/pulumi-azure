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
    public sealed class DeploymentFrontendPrivate
    {
        /// <summary>
        /// Specify the method for allocating the private IP. Possible values are `Static` and `Dynamic`. Changing this forces a new NGINX Deployment to be created.
        /// </summary>
        public readonly string AllocationMethod;
        /// <summary>
        /// Specify the private IP Address. Changing this forces a new NGINX Deployment to be created.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// Specify the Subnet Resource ID for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        /// </summary>
        public readonly string SubnetId;

        [OutputConstructor]
        private DeploymentFrontendPrivate(
            string allocationMethod,

            string ipAddress,

            string subnetId)
        {
            AllocationMethod = allocationMethod;
            IpAddress = ipAddress;
            SubnetId = subnetId;
        }
    }
}
