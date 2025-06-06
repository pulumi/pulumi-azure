// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Inputs
{

    public sealed class SqlContainerUniqueKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("paths", required: true)]
        private InputList<string>? _paths;

        /// <summary>
        /// A list of paths to use for this unique key. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        public SqlContainerUniqueKeyArgs()
        {
        }
        public static new SqlContainerUniqueKeyArgs Empty => new SqlContainerUniqueKeyArgs();
    }
}
