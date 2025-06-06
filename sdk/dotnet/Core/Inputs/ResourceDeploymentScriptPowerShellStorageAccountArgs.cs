// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Inputs
{

    public sealed class ResourceDeploymentScriptPowerShellStorageAccountArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        private Input<string>? _key;

        /// <summary>
        /// Specifies the storage account access key.
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the storage account name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ResourceDeploymentScriptPowerShellStorageAccountArgs()
        {
        }
        public static new ResourceDeploymentScriptPowerShellStorageAccountArgs Empty => new ResourceDeploymentScriptPowerShellStorageAccountArgs();
    }
}
