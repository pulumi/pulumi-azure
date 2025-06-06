// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Inputs
{

    public sealed class GremlinGraphIndexPolicyCompositeIndexArgs : global::Pulumi.ResourceArgs
    {
        [Input("indices", required: true)]
        private InputList<Inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs>? _indices;

        /// <summary>
        /// One or more `index` blocks as defined below.
        /// </summary>
        public InputList<Inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs> Indices
        {
            get => _indices ?? (_indices = new InputList<Inputs.GremlinGraphIndexPolicyCompositeIndexIndexArgs>());
            set => _indices = value;
        }

        public GremlinGraphIndexPolicyCompositeIndexArgs()
        {
        }
        public static new GremlinGraphIndexPolicyCompositeIndexArgs Empty => new GremlinGraphIndexPolicyCompositeIndexArgs();
    }
}
