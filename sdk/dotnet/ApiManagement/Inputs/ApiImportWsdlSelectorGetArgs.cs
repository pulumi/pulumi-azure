// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class ApiImportWsdlSelectorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of endpoint (port) to import from WSDL.
        /// </summary>
        [Input("endpointName", required: true)]
        public Input<string> EndpointName { get; set; } = null!;

        /// <summary>
        /// The name of service to import from WSDL.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public ApiImportWsdlSelectorGetArgs()
        {
        }
        public static new ApiImportWsdlSelectorGetArgs Empty => new ApiImportWsdlSelectorGetArgs();
    }
}
