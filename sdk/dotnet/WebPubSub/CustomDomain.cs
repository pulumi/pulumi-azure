// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WebPubSub
{
    /// <summary>
    /// Manages an Azure Web PubSub Custom Domain.
    /// 
    /// ## Import
    /// 
    /// Custom Domain for a Web PubSub service can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:webpubsub/customDomain:CustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/webPubSub/webpubsub1/customDomains/customDomain1
    /// ```
    /// </summary>
    [AzureResourceType("azure:webpubsub/customDomain:CustomDomain")]
    public partial class CustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Output("webPubsubCustomCertificateId")]
        public Output<string> WebPubsubCustomCertificateId { get; private set; } = null!;

        /// <summary>
        /// Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Output("webPubsubId")]
        public Output<string> WebPubsubId { get; private set; } = null!;


        /// <summary>
        /// Create a CustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomDomain(string name, CustomDomainArgs args, CustomResourceOptions? options = null)
            : base("azure:webpubsub/customDomain:CustomDomain", name, args ?? new CustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomDomain(string name, Input<string> id, CustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("azure:webpubsub/customDomain:CustomDomain", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomDomain Get(string name, Input<string> id, CustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomDomain(name, id, state, options);
        }
    }

    public sealed class CustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("webPubsubCustomCertificateId", required: true)]
        public Input<string> WebPubsubCustomCertificateId { get; set; } = null!;

        /// <summary>
        /// Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("webPubsubId", required: true)]
        public Input<string> WebPubsubId { get; set; } = null!;

        public CustomDomainArgs()
        {
        }
        public static new CustomDomainArgs Empty => new CustomDomainArgs();
    }

    public sealed class CustomDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("webPubsubCustomCertificateId")]
        public Input<string>? WebPubsubCustomCertificateId { get; set; }

        /// <summary>
        /// Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("webPubsubId")]
        public Input<string>? WebPubsubId { get; set; }

        public CustomDomainState()
        {
        }
        public static new CustomDomainState Empty => new CustomDomainState();
    }
}
