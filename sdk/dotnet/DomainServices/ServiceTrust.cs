// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DomainServices
{
    /// <summary>
    /// Manages a Active Directory Domain Service Trust.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = Azure.DomainServices.GetService.Invoke(new()
    ///     {
    ///         Name = "example-ds",
    ///         ResourceGroupName = "example-rg",
    ///     });
    /// 
    ///     var exampleServiceTrust = new Azure.DomainServices.ServiceTrust("example", new()
    ///     {
    ///         Name = "example-trust",
    ///         DomainServiceId = example.Apply(getServiceResult =&gt; getServiceResult.Id),
    ///         TrustedDomainFqdn = "example.com",
    ///         TrustedDomainDnsIps = new[]
    ///         {
    ///             "10.1.0.3",
    ///             "10.1.0.4",
    ///         },
    ///         Password = "Password123",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.AAD`: 2021-05-01
    /// 
    /// ## Import
    /// 
    /// Active Directory Domain Service Trusts can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:domainservices/serviceTrust:ServiceTrust example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.AAD/domainServices/DomainService1/trusts/trust1
    /// ```
    /// </summary>
    [AzureResourceType("azure:domainservices/serviceTrust:ServiceTrust")]
    public partial class ServiceTrust : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Active Directory Domain Service. Changing this forces a new Active Directory Domain Service Trust to be created.
        /// </summary>
        [Output("domainServiceId")]
        public Output<string> DomainServiceId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Active Directory Domain Service Trust. Changing this forces a new Active Directory Domain Service Trust to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The password of the inbound trust set in the on-premise Active Directory Domain Service.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of DNS IPs that are used to resolve the on-premise Active Directory Domain Service.
        /// </summary>
        [Output("trustedDomainDnsIps")]
        public Output<ImmutableArray<string>> TrustedDomainDnsIps { get; private set; } = null!;

        /// <summary>
        /// The FQDN of the on-premise Active Directory Domain Service.
        /// </summary>
        [Output("trustedDomainFqdn")]
        public Output<string> TrustedDomainFqdn { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceTrust resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceTrust(string name, ServiceTrustArgs args, CustomResourceOptions? options = null)
            : base("azure:domainservices/serviceTrust:ServiceTrust", name, args ?? new ServiceTrustArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceTrust(string name, Input<string> id, ServiceTrustState? state = null, CustomResourceOptions? options = null)
            : base("azure:domainservices/serviceTrust:ServiceTrust", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServiceTrust resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceTrust Get(string name, Input<string> id, ServiceTrustState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceTrust(name, id, state, options);
        }
    }

    public sealed class ServiceTrustArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Active Directory Domain Service. Changing this forces a new Active Directory Domain Service Trust to be created.
        /// </summary>
        [Input("domainServiceId", required: true)]
        public Input<string> DomainServiceId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Active Directory Domain Service Trust. Changing this forces a new Active Directory Domain Service Trust to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password of the inbound trust set in the on-premise Active Directory Domain Service.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("trustedDomainDnsIps", required: true)]
        private InputList<string>? _trustedDomainDnsIps;

        /// <summary>
        /// Specifies a list of DNS IPs that are used to resolve the on-premise Active Directory Domain Service.
        /// </summary>
        public InputList<string> TrustedDomainDnsIps
        {
            get => _trustedDomainDnsIps ?? (_trustedDomainDnsIps = new InputList<string>());
            set => _trustedDomainDnsIps = value;
        }

        /// <summary>
        /// The FQDN of the on-premise Active Directory Domain Service.
        /// </summary>
        [Input("trustedDomainFqdn", required: true)]
        public Input<string> TrustedDomainFqdn { get; set; } = null!;

        public ServiceTrustArgs()
        {
        }
        public static new ServiceTrustArgs Empty => new ServiceTrustArgs();
    }

    public sealed class ServiceTrustState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Active Directory Domain Service. Changing this forces a new Active Directory Domain Service Trust to be created.
        /// </summary>
        [Input("domainServiceId")]
        public Input<string>? DomainServiceId { get; set; }

        /// <summary>
        /// The name which should be used for this Active Directory Domain Service Trust. Changing this forces a new Active Directory Domain Service Trust to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the inbound trust set in the on-premise Active Directory Domain Service.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("trustedDomainDnsIps")]
        private InputList<string>? _trustedDomainDnsIps;

        /// <summary>
        /// Specifies a list of DNS IPs that are used to resolve the on-premise Active Directory Domain Service.
        /// </summary>
        public InputList<string> TrustedDomainDnsIps
        {
            get => _trustedDomainDnsIps ?? (_trustedDomainDnsIps = new InputList<string>());
            set => _trustedDomainDnsIps = value;
        }

        /// <summary>
        /// The FQDN of the on-premise Active Directory Domain Service.
        /// </summary>
        [Input("trustedDomainFqdn")]
        public Input<string>? TrustedDomainFqdn { get; set; }

        public ServiceTrustState()
        {
        }
        public static new ServiceTrustState Empty => new ServiceTrustState();
    }
}
