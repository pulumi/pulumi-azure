// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class IntegrationRuntimeSsisExpressCustomSetupArgs : Pulumi.ResourceArgs
    {
        [Input("commandKeys")]
        private InputList<Inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs>? _commandKeys;

        /// <summary>
        /// One or more `command_key` blocks as defined below.
        /// </summary>
        public InputList<Inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs> CommandKeys
        {
            get => _commandKeys ?? (_commandKeys = new InputList<Inputs.IntegrationRuntimeSsisExpressCustomSetupCommandKeyArgs>());
            set => _commandKeys = value;
        }

        [Input("components")]
        private InputList<Inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs>? _components;

        /// <summary>
        /// One or more `component` blocks as defined below.
        /// </summary>
        public InputList<Inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.IntegrationRuntimeSsisExpressCustomSetupComponentArgs>());
            set => _components = value;
        }

        [Input("environment")]
        private InputMap<string>? _environment;

        /// <summary>
        /// The Environment Variables for the Azure-SSIS Integration Runtime.
        /// </summary>
        public InputMap<string> Environment
        {
            get => _environment ?? (_environment = new InputMap<string>());
            set => _environment = value;
        }

        /// <summary>
        /// The version of Azure Powershell installed for the Azure-SSIS Integration Runtime.
        /// </summary>
        [Input("powershellVersion")]
        public Input<string>? PowershellVersion { get; set; }

        public IntegrationRuntimeSsisExpressCustomSetupArgs()
        {
        }
    }
}