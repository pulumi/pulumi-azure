// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp
{
    /// <summary>
    /// Manages a Container App Environment Custom Domain Suffix.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("example", new()
    ///     {
    ///         Name = "acctest-01",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Sku = "PerGB2018",
    ///         RetentionInDays = 30,
    ///     });
    /// 
    ///     var exampleEnvironment = new Azure.ContainerApp.Environment("example", new()
    ///     {
    ///         Name = "my-environment",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsWorkspace.Id,
    ///     });
    /// 
    ///     var exampleEnvironmentCustomDomain = new Azure.ContainerApp.EnvironmentCustomDomain("example", new()
    ///     {
    ///         ContainerAppEnvironmentId = exampleEnvironment.Id,
    ///         CertificateBlobBase64 = Std.Filebase64.Invoke(new()
    ///         {
    ///             Input = "testacc.pfx",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         CertificatePassword = "TestAcc",
    ///         DnsSuffix = "acceptancetest.contoso.com",
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
    /// * `Microsoft.App`: 2025-01-01
    /// 
    /// * `Microsoft.OperationalInsights`: 2020-08-01
    /// 
    /// ## Import
    /// 
    /// A Container App Environment Custom Domain Suffix can be imported using the `resource id` of its parent container ontainer App Environment , e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:containerapp/environmentCustomDomain:EnvironmentCustomDomain example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.App/managedEnvironments/myEnvironment"
    /// ```
    /// </summary>
    [AzureResourceType("azure:containerapp/environmentCustomDomain:EnvironmentCustomDomain")]
    public partial class EnvironmentCustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The bundle of Private Key and Certificate for the Custom DNS Suffix as a base64 encoded PFX or PEM.
        /// </summary>
        [Output("certificateBlobBase64")]
        public Output<string> CertificateBlobBase64 { get; private set; } = null!;

        /// <summary>
        /// The password for the Certificate bundle.
        /// </summary>
        [Output("certificatePassword")]
        public Output<string> CertificatePassword { get; private set; } = null!;

        /// <summary>
        /// The ID of the Container Apps Managed Environment. Changing this forces a new resource to be created.
        /// </summary>
        [Output("containerAppEnvironmentId")]
        public Output<string> ContainerAppEnvironmentId { get; private set; } = null!;

        /// <summary>
        /// Custom DNS Suffix for the Container App Environment.
        /// </summary>
        [Output("dnsSuffix")]
        public Output<string> DnsSuffix { get; private set; } = null!;


        /// <summary>
        /// Create a EnvironmentCustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvironmentCustomDomain(string name, EnvironmentCustomDomainArgs args, CustomResourceOptions? options = null)
            : base("azure:containerapp/environmentCustomDomain:EnvironmentCustomDomain", name, args ?? new EnvironmentCustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvironmentCustomDomain(string name, Input<string> id, EnvironmentCustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("azure:containerapp/environmentCustomDomain:EnvironmentCustomDomain", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "certificatePassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EnvironmentCustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvironmentCustomDomain Get(string name, Input<string> id, EnvironmentCustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvironmentCustomDomain(name, id, state, options);
        }
    }

    public sealed class EnvironmentCustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bundle of Private Key and Certificate for the Custom DNS Suffix as a base64 encoded PFX or PEM.
        /// </summary>
        [Input("certificateBlobBase64", required: true)]
        public Input<string> CertificateBlobBase64 { get; set; } = null!;

        [Input("certificatePassword", required: true)]
        private Input<string>? _certificatePassword;

        /// <summary>
        /// The password for the Certificate bundle.
        /// </summary>
        public Input<string>? CertificatePassword
        {
            get => _certificatePassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificatePassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the Container Apps Managed Environment. Changing this forces a new resource to be created.
        /// </summary>
        [Input("containerAppEnvironmentId", required: true)]
        public Input<string> ContainerAppEnvironmentId { get; set; } = null!;

        /// <summary>
        /// Custom DNS Suffix for the Container App Environment.
        /// </summary>
        [Input("dnsSuffix", required: true)]
        public Input<string> DnsSuffix { get; set; } = null!;

        public EnvironmentCustomDomainArgs()
        {
        }
        public static new EnvironmentCustomDomainArgs Empty => new EnvironmentCustomDomainArgs();
    }

    public sealed class EnvironmentCustomDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bundle of Private Key and Certificate for the Custom DNS Suffix as a base64 encoded PFX or PEM.
        /// </summary>
        [Input("certificateBlobBase64")]
        public Input<string>? CertificateBlobBase64 { get; set; }

        [Input("certificatePassword")]
        private Input<string>? _certificatePassword;

        /// <summary>
        /// The password for the Certificate bundle.
        /// </summary>
        public Input<string>? CertificatePassword
        {
            get => _certificatePassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificatePassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the Container Apps Managed Environment. Changing this forces a new resource to be created.
        /// </summary>
        [Input("containerAppEnvironmentId")]
        public Input<string>? ContainerAppEnvironmentId { get; set; }

        /// <summary>
        /// Custom DNS Suffix for the Container App Environment.
        /// </summary>
        [Input("dnsSuffix")]
        public Input<string>? DnsSuffix { get; set; }

        public EnvironmentCustomDomainState()
        {
        }
        public static new EnvironmentCustomDomainState Empty => new EnvironmentCustomDomainState();
    }
}
