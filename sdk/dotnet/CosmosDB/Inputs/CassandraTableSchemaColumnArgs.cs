// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Inputs
{

    public sealed class CassandraTableSchemaColumnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the column to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Type of the column to be created.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public CassandraTableSchemaColumnArgs()
        {
        }
        public static new CassandraTableSchemaColumnArgs Empty => new CassandraTableSchemaColumnArgs();
    }
}
