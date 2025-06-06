// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogAnalytics
{
    /// <summary>
    /// Manages a Log Analytics Query Pack.
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
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleQueryPack = new Azure.LogAnalytics.QueryPack("example", new()
    ///     {
    ///         Name = "example-laqp",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
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
    /// * `Microsoft.OperationalInsights`: 2019-09-01
    /// 
    /// ## Import
    /// 
    /// Log Analytics Query Packs can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:loganalytics/queryPack:QueryPack example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.OperationalInsights/queryPacks/queryPack1
    /// ```
    /// </summary>
    [AzureResourceType("azure:loganalytics/queryPack:QueryPack")]
    public partial class QueryPack : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Log Analytics Query Pack.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a QueryPack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public QueryPack(string name, QueryPackArgs args, CustomResourceOptions? options = null)
            : base("azure:loganalytics/queryPack:QueryPack", name, args ?? new QueryPackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private QueryPack(string name, Input<string> id, QueryPackState? state = null, CustomResourceOptions? options = null)
            : base("azure:loganalytics/queryPack:QueryPack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing QueryPack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static QueryPack Get(string name, Input<string> id, QueryPackState? state = null, CustomResourceOptions? options = null)
        {
            return new QueryPack(name, id, state, options);
        }
    }

    public sealed class QueryPackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Log Analytics Query Pack.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public QueryPackArgs()
        {
        }
        public static new QueryPackArgs Empty => new QueryPackArgs();
    }

    public sealed class QueryPackState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Log Analytics Query Pack.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public QueryPackState()
        {
        }
        public static new QueryPackState Empty => new QueryPackState();
    }
}
