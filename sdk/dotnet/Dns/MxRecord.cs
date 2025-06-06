// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Dns
{
    /// <summary>
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
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleZone = new Azure.Dns.Zone("example", new()
    ///     {
    ///         Name = "mydomain.com",
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleMxRecord = new Azure.Dns.MxRecord("example", new()
    ///     {
    ///         Name = "test",
    ///         ZoneName = exampleZone.Name,
    ///         ResourceGroupName = example.Name,
    ///         Ttl = 300,
    ///         Records = new[]
    ///         {
    ///             new Azure.Dns.Inputs.MxRecordRecordArgs
    ///             {
    ///                 Preference = "10",
    ///                 Exchange = "mail1.contoso.com",
    ///             },
    ///             new Azure.Dns.Inputs.MxRecordRecordArgs
    ///             {
    ///                 Preference = "20",
    ///                 Exchange = "mail2.contoso.com",
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Environment", "Production" },
    ///         },
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
    /// * `Microsoft.Network`: 2018-05-01
    /// 
    /// ## Import
    /// 
    /// MX records can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:dns/mxRecord:MxRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/dnsZones/zone1/MX/myrecord1
    /// ```
    /// </summary>
    [AzureResourceType("azure:dns/mxRecord:MxRecord")]
    public partial class MxRecord : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The FQDN of the DNS MX Record.
        /// </summary>
        [Output("fqdn")]
        public Output<string> Fqdn { get; private set; } = null!;

        /// <summary>
        /// The name of the DNS MX Record. Defaults to `@` (root). Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of values that make up the MX record. Each `record` block supports fields documented below.
        /// </summary>
        [Output("records")]
        public Output<ImmutableArray<Outputs.MxRecordRecord>> Records { get; private set; } = null!;

        /// <summary>
        /// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The Time To Live (TTL) of the DNS record in seconds.
        /// </summary>
        [Output("ttl")]
        public Output<int> Ttl { get; private set; } = null!;

        /// <summary>
        /// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("zoneName")]
        public Output<string> ZoneName { get; private set; } = null!;


        /// <summary>
        /// Create a MxRecord resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MxRecord(string name, MxRecordArgs args, CustomResourceOptions? options = null)
            : base("azure:dns/mxRecord:MxRecord", name, args ?? new MxRecordArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MxRecord(string name, Input<string> id, MxRecordState? state = null, CustomResourceOptions? options = null)
            : base("azure:dns/mxRecord:MxRecord", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MxRecord resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MxRecord Get(string name, Input<string> id, MxRecordState? state = null, CustomResourceOptions? options = null)
        {
            return new MxRecord(name, id, state, options);
        }
    }

    public sealed class MxRecordArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the DNS MX Record. Defaults to `@` (root). Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("records", required: true)]
        private InputList<Inputs.MxRecordRecordArgs>? _records;

        /// <summary>
        /// A list of values that make up the MX record. Each `record` block supports fields documented below.
        /// </summary>
        public InputList<Inputs.MxRecordRecordArgs> Records
        {
            get => _records ?? (_records = new InputList<Inputs.MxRecordRecordArgs>());
            set => _records = value;
        }

        /// <summary>
        /// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Time To Live (TTL) of the DNS record in seconds.
        /// </summary>
        [Input("ttl", required: true)]
        public Input<int> Ttl { get; set; } = null!;

        /// <summary>
        /// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("zoneName", required: true)]
        public Input<string> ZoneName { get; set; } = null!;

        public MxRecordArgs()
        {
        }
        public static new MxRecordArgs Empty => new MxRecordArgs();
    }

    public sealed class MxRecordState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The FQDN of the DNS MX Record.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// The name of the DNS MX Record. Defaults to `@` (root). Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("records")]
        private InputList<Inputs.MxRecordRecordGetArgs>? _records;

        /// <summary>
        /// A list of values that make up the MX record. Each `record` block supports fields documented below.
        /// </summary>
        public InputList<Inputs.MxRecordRecordGetArgs> Records
        {
            get => _records ?? (_records = new InputList<Inputs.MxRecordRecordGetArgs>());
            set => _records = value;
        }

        /// <summary>
        /// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Time To Live (TTL) of the DNS record in seconds.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("zoneName")]
        public Input<string>? ZoneName { get; set; }

        public MxRecordState()
        {
        }
        public static new MxRecordState Empty => new MxRecordState();
    }
}
