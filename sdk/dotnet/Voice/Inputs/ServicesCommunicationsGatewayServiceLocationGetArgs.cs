// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Voice.Inputs
{

    public sealed class ServicesCommunicationsGatewayServiceLocationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedMediaSourceAddressPrefixes")]
        private InputList<string>? _allowedMediaSourceAddressPrefixes;

        /// <summary>
        /// Specifies the allowed source IP address or CIDR ranges for media.
        /// </summary>
        public InputList<string> AllowedMediaSourceAddressPrefixes
        {
            get => _allowedMediaSourceAddressPrefixes ?? (_allowedMediaSourceAddressPrefixes = new InputList<string>());
            set => _allowedMediaSourceAddressPrefixes = value;
        }

        [Input("allowedSignalingSourceAddressPrefixes")]
        private InputList<string>? _allowedSignalingSourceAddressPrefixes;

        /// <summary>
        /// Specifies the allowed source IP address or CIDR ranges for signaling.
        /// </summary>
        public InputList<string> AllowedSignalingSourceAddressPrefixes
        {
            get => _allowedSignalingSourceAddressPrefixes ?? (_allowedSignalingSourceAddressPrefixes = new InputList<string>());
            set => _allowedSignalingSourceAddressPrefixes = value;
        }

        [Input("esrpAddresses")]
        private InputList<string>? _esrpAddresses;

        /// <summary>
        /// IP address to use to contact the ESRP from this region.
        /// </summary>
        public InputList<string> EsrpAddresses
        {
            get => _esrpAddresses ?? (_esrpAddresses = new InputList<string>());
            set => _esrpAddresses = value;
        }

        /// <summary>
        /// Specifies the region in which the resources needed for Teams Calling will be deployed.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("operatorAddresses", required: true)]
        private InputList<string>? _operatorAddresses;

        /// <summary>
        /// IP address to use to contact the operator network from this region.
        /// </summary>
        public InputList<string> OperatorAddresses
        {
            get => _operatorAddresses ?? (_operatorAddresses = new InputList<string>());
            set => _operatorAddresses = value;
        }

        public ServicesCommunicationsGatewayServiceLocationGetArgs()
        {
        }
        public static new ServicesCommunicationsGatewayServiceLocationGetArgs Empty => new ServicesCommunicationsGatewayServiceLocationGetArgs();
    }
}