// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch
{
    /// <summary>
    /// Manages a certificate in an Azure Batch account.
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
    ///         Name = "testbatch",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "teststorage",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleAccount2 = new Azure.Batch.Account("example", new()
    ///     {
    ///         Name = "testbatchaccount",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         PoolAllocationMode = "BatchService",
    ///         StorageAccountId = exampleAccount.Id,
    ///         StorageAccountAuthenticationMode = "StorageKeys",
    ///         Tags = 
    ///         {
    ///             { "env", "test" },
    ///         },
    ///     });
    /// 
    ///     var exampleCertificate = new Azure.Batch.Certificate("example", new()
    ///     {
    ///         ResourceGroupName = example.Name,
    ///         AccountName = exampleAccount2.Name,
    ///         BatchCertificate = Std.Filebase64.Invoke(new()
    ///         {
    ///             Input = "certificate.pfx",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         Format = "Pfx",
    ///         Password = "password",
    ///         Thumbprint = "42C107874FD0E4A9583292A2F1098E8FE4B2EDDA",
    ///         ThumbprintAlgorithm = "SHA1",
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
    /// * `Microsoft.Batch`: 2024-07-01
    /// 
    /// ## Import
    /// 
    /// Batch Certificates can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:batch/certificate:Certificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Batch/batchAccounts/batch1/certificates/certificate1
    /// ```
    /// </summary>
    [AzureResourceType("azure:batch/certificate:Certificate")]
    public partial class Certificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the name of the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// The base64-encoded contents of the certificate.
        /// </summary>
        [Output("certificate")]
        public Output<string> BatchCertificate { get; private set; } = null!;

        /// <summary>
        /// The format of the certificate. Possible values are `Cer` or `Pfx`.
        /// </summary>
        [Output("format")]
        public Output<string> Format { get; private set; } = null!;

        /// <summary>
        /// The generated name of the certificate.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The public key of the certificate.
        /// </summary>
        [Output("publicData")]
        public Output<string> PublicData { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The thumbprint of the certificate. Changing this forces a new resource to be created.
        /// </summary>
        [Output("thumbprint")]
        public Output<string> Thumbprint { get; private set; } = null!;

        /// <summary>
        /// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("thumbprintAlgorithm")]
        public Output<string> ThumbprintAlgorithm { get; private set; } = null!;


        /// <summary>
        /// Create a Certificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Certificate(string name, CertificateArgs args, CustomResourceOptions? options = null)
            : base("azure:batch/certificate:Certificate", name, args ?? new CertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Certificate(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
            : base("azure:batch/certificate:Certificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "certificate",
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Certificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Certificate Get(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new Certificate(name, id, state, options);
        }
    }

    public sealed class CertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        [Input("certificate", required: true)]
        private Input<string>? _certificate;

        /// <summary>
        /// The base64-encoded contents of the certificate.
        /// </summary>
        public Input<string>? BatchCertificate
        {
            get => _certificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The format of the certificate. Possible values are `Cer` or `Pfx`.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
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

        /// <summary>
        /// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The thumbprint of the certificate. Changing this forces a new resource to be created.
        /// </summary>
        [Input("thumbprint", required: true)]
        public Input<string> Thumbprint { get; set; } = null!;

        /// <summary>
        /// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("thumbprintAlgorithm", required: true)]
        public Input<string> ThumbprintAlgorithm { get; set; } = null!;

        public CertificateArgs()
        {
        }
        public static new CertificateArgs Empty => new CertificateArgs();
    }

    public sealed class CertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("certificate")]
        private Input<string>? _certificate;

        /// <summary>
        /// The base64-encoded contents of the certificate.
        /// </summary>
        public Input<string>? BatchCertificate
        {
            get => _certificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The format of the certificate. Possible values are `Cer` or `Pfx`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The generated name of the certificate.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
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

        /// <summary>
        /// The public key of the certificate.
        /// </summary>
        [Input("publicData")]
        public Input<string>? PublicData { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The thumbprint of the certificate. Changing this forces a new resource to be created.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        /// <summary>
        /// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("thumbprintAlgorithm")]
        public Input<string>? ThumbprintAlgorithm { get; set; }

        public CertificateState()
        {
        }
        public static new CertificateState Empty => new CertificateState();
    }
}
