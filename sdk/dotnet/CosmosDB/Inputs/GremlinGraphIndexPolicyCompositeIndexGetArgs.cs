// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Inputs
{

    public sealed class GremlinGraphIndexPolicyCompositeIndexGetArgs : Pulumi.ResourceArgs
    {
        [Input("indices", required: true)]
        private InputList<Inputs.GremlinGraphIndexPolicyCompositeIndexIndexGetArgs>? _indices;

        /// <summary>
        /// One or more `index` blocks as defined below.
        /// </summary>
        public InputList<Inputs.GremlinGraphIndexPolicyCompositeIndexIndexGetArgs> Indices
        {
            get => _indices ?? (_indices = new InputList<Inputs.GremlinGraphIndexPolicyCompositeIndexIndexGetArgs>());
            set => _indices = value;
        }

        public GremlinGraphIndexPolicyCompositeIndexGetArgs()
        {
        }
    }
}