// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationAddresses")]
        private InputList<string>? _destinationAddresses;
        public InputList<string> DestinationAddresses
        {
            get => _destinationAddresses ?? (_destinationAddresses = new InputList<string>());
            set => _destinationAddresses = value;
        }

        [Input("destinationFqdnTags")]
        private InputList<string>? _destinationFqdnTags;

        /// <summary>
        /// Specifies a list of destination FQDN tags.
        /// </summary>
        public InputList<string> DestinationFqdnTags
        {
            get => _destinationFqdnTags ?? (_destinationFqdnTags = new InputList<string>());
            set => _destinationFqdnTags = value;
        }

        [Input("destinationFqdns")]
        private InputList<string>? _destinationFqdns;
        public InputList<string> DestinationFqdns
        {
            get => _destinationFqdns ?? (_destinationFqdns = new InputList<string>());
            set => _destinationFqdns = value;
        }

        [Input("destinationUrls")]
        private InputList<string>? _destinationUrls;

        /// <summary>
        /// Specifies a list of destination URLs for which policy should hold. Needs Premium SKU for Firewall Policy. Conflicts with `destination_fqdns`.
        /// </summary>
        public InputList<string> DestinationUrls
        {
            get => _destinationUrls ?? (_destinationUrls = new InputList<string>());
            set => _destinationUrls = value;
        }

        [Input("httpHeaders")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs>? _httpHeaders;

        /// <summary>
        /// Specifies a list of HTTP/HTTPS headers to insert. One or more `http_headers` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs> HttpHeaders
        {
            get => _httpHeaders ?? (_httpHeaders = new InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeaderArgs>());
            set => _httpHeaders = value;
        }

        /// <summary>
        /// The name which should be used for this Firewall Policy Rule Collection Group. Changing this forces a new Firewall Policy Rule Collection Group to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("protocols")]
        private InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs>? _protocols;
        public InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs> Protocols
        {
            get => _protocols ?? (_protocols = new InputList<Inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs>());
            set => _protocols = value;
        }

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        [Input("sourceIpGroups")]
        private InputList<string>? _sourceIpGroups;
        public InputList<string> SourceIpGroups
        {
            get => _sourceIpGroups ?? (_sourceIpGroups = new InputList<string>());
            set => _sourceIpGroups = value;
        }

        /// <summary>
        /// Boolean specifying if TLS shall be terminated (true) or not (false). Must be `true` when using `destination_urls`. Needs Premium SKU for Firewall Policy.
        /// </summary>
        [Input("terminateTls")]
        public Input<bool>? TerminateTls { get; set; }

        [Input("webCategories")]
        private InputList<string>? _webCategories;

        /// <summary>
        /// Specifies a list of web categories to which access is denied or allowed depending on the value of `action` above. Needs Premium SKU for Firewall Policy.
        /// </summary>
        public InputList<string> WebCategories
        {
            get => _webCategories ?? (_webCategories = new InputList<string>());
            set => _webCategories = value;
        }

        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs()
        {
        }
        public static new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs Empty => new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs();
    }
}
