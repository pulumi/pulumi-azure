// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage
{
    public static class GetTableEntities
    {
        /// <summary>
        /// Use this data source to access information about an existing Storage Table Entity.
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
        ///     var example = Azure.Storage.GetTableEntities.Invoke(new()
        ///     {
        ///         StorageTableId = exampleAzurermStorageTable.Id,
        ///         Filter = "PartitionKey eq 'example'",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTableEntitiesResult> InvokeAsync(GetTableEntitiesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTableEntitiesResult>("azure:storage/getTableEntities:getTableEntities", args ?? new GetTableEntitiesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Storage Table Entity.
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
        ///     var example = Azure.Storage.GetTableEntities.Invoke(new()
        ///     {
        ///         StorageTableId = exampleAzurermStorageTable.Id,
        ///         Filter = "PartitionKey eq 'example'",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTableEntitiesResult> Invoke(GetTableEntitiesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTableEntitiesResult>("azure:storage/getTableEntities:getTableEntities", args ?? new GetTableEntitiesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Storage Table Entity.
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
        ///     var example = Azure.Storage.GetTableEntities.Invoke(new()
        ///     {
        ///         StorageTableId = exampleAzurermStorageTable.Id,
        ///         Filter = "PartitionKey eq 'example'",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTableEntitiesResult> Invoke(GetTableEntitiesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTableEntitiesResult>("azure:storage/getTableEntities:getTableEntities", args ?? new GetTableEntitiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTableEntitiesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The filter used to retrieve the entities.
        /// </summary>
        [Input("filter", required: true)]
        public string Filter { get; set; } = null!;

        [Input("selects")]
        private List<string>? _selects;

        /// <summary>
        /// A list of properties to select from the returned Storage Table Entities.
        /// </summary>
        public List<string> Selects
        {
            get => _selects ?? (_selects = new List<string>());
            set => _selects = value;
        }

        /// <summary>
        /// The Storage Table ID where the entities exist.
        /// </summary>
        [Input("storageTableId", required: true)]
        public string StorageTableId { get; set; } = null!;

        public GetTableEntitiesArgs()
        {
        }
        public static new GetTableEntitiesArgs Empty => new GetTableEntitiesArgs();
    }

    public sealed class GetTableEntitiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The filter used to retrieve the entities.
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        [Input("selects")]
        private InputList<string>? _selects;

        /// <summary>
        /// A list of properties to select from the returned Storage Table Entities.
        /// </summary>
        public InputList<string> Selects
        {
            get => _selects ?? (_selects = new InputList<string>());
            set => _selects = value;
        }

        /// <summary>
        /// The Storage Table ID where the entities exist.
        /// </summary>
        [Input("storageTableId", required: true)]
        public Input<string> StorageTableId { get; set; } = null!;

        public GetTableEntitiesInvokeArgs()
        {
        }
        public static new GetTableEntitiesInvokeArgs Empty => new GetTableEntitiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTableEntitiesResult
    {
        public readonly string Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of `items` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTableEntitiesItemResult> Items;
        public readonly ImmutableArray<string> Selects;
        public readonly string StorageTableId;

        [OutputConstructor]
        private GetTableEntitiesResult(
            string filter,

            string id,

            ImmutableArray<Outputs.GetTableEntitiesItemResult> items,

            ImmutableArray<string> selects,

            string storageTableId)
        {
            Filter = filter;
            Id = id;
            Items = items;
            Selects = selects;
            StorageTableId = storageTableId;
        }
    }
}
