// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the component to configure with the added content. The only allowable value is `Microsoft-Windows-Shell-Setup`.
        /// </summary>
        [Input("component", required: true)]
        public Input<string> Component { get; set; } = null!;

        [Input("content", required: true)]
        private Input<string>? _content;

        /// <summary>
        /// Specifies the base-64 encoded XML formatted content that is added to the unattend.xml file for the specified path and component.
        /// </summary>
        public Input<string>? Content
        {
            get => _content;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _content = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the name of the pass that the content applies to. The only allowable value is `oobeSystem`.
        /// </summary>
        [Input("pass", required: true)]
        public Input<string> Pass { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the setting to which the content applies. Possible values are: `FirstLogonCommands` and `AutoLogon`.
        /// </summary>
        [Input("settingName", required: true)]
        public Input<string> SettingName { get; set; } = null!;

        public VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs()
        {
        }
        public static new VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs Empty => new VirtualMachineOsProfileWindowsConfigAdditionalUnattendConfigArgs();
    }
}
