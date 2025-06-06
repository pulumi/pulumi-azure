// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class VirtualMachineStorageConfigurationDataSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultFilePath", required: true)]
        public Input<string> DefaultFilePath { get; set; } = null!;

        [Input("luns", required: true)]
        private InputList<int>? _luns;
        public InputList<int> Luns
        {
            get => _luns ?? (_luns = new InputList<int>());
            set => _luns = value;
        }

        public VirtualMachineStorageConfigurationDataSettingsArgs()
        {
        }
        public static new VirtualMachineStorageConfigurationDataSettingsArgs Empty => new VirtualMachineStorageConfigurationDataSettingsArgs();
    }
}
