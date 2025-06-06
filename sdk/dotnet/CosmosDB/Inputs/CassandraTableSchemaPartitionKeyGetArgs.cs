// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Inputs
{

    public sealed class CassandraTableSchemaPartitionKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the column to partition by.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public CassandraTableSchemaPartitionKeyGetArgs()
        {
        }
        public static new CassandraTableSchemaPartitionKeyGetArgs Empty => new CassandraTableSchemaPartitionKeyGetArgs();
    }
}
