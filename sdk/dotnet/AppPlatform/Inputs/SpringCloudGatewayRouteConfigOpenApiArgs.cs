// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Inputs
{

    public sealed class SpringCloudGatewayRouteConfigOpenApiArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URI of OpenAPI specification.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public SpringCloudGatewayRouteConfigOpenApiArgs()
        {
        }
        public static new SpringCloudGatewayRouteConfigOpenApiArgs Empty => new SpringCloudGatewayRouteConfigOpenApiArgs();
    }
}