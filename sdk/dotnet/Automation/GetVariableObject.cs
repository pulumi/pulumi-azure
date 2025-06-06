// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation
{
    public static class GetVariableObject
    {
        /// <summary>
        /// Use this data source to access information about an existing Automation Object Variable.
        /// </summary>
        public static Task<GetVariableObjectResult> InvokeAsync(GetVariableObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVariableObjectResult>("azure:automation/getVariableObject:getVariableObject", args ?? new GetVariableObjectArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Automation Object Variable.
        /// </summary>
        public static Output<GetVariableObjectResult> Invoke(GetVariableObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVariableObjectResult>("azure:automation/getVariableObject:getVariableObject", args ?? new GetVariableObjectInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Automation Object Variable.
        /// </summary>
        public static Output<GetVariableObjectResult> Invoke(GetVariableObjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVariableObjectResult>("azure:automation/getVariableObject:getVariableObject", args ?? new GetVariableObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVariableObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the automation account in which the Automation Variable exists.
        /// </summary>
        [Input("automationAccountName", required: true)]
        public string AutomationAccountName { get; set; } = null!;

        /// <summary>
        /// The name of the Automation Variable.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the automation account exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetVariableObjectArgs()
        {
        }
        public static new GetVariableObjectArgs Empty => new GetVariableObjectArgs();
    }

    public sealed class GetVariableObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the automation account in which the Automation Variable exists.
        /// </summary>
        [Input("automationAccountName", required: true)]
        public Input<string> AutomationAccountName { get; set; } = null!;

        /// <summary>
        /// The name of the Automation Variable.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Name of the Resource Group where the automation account exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetVariableObjectInvokeArgs()
        {
        }
        public static new GetVariableObjectInvokeArgs Empty => new GetVariableObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetVariableObjectResult
    {
        public readonly string AutomationAccountName;
        /// <summary>
        /// The description of the Automation Variable.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Specifies if the Automation Variable is encrypted. Defaults to `false`.
        /// </summary>
        public readonly bool Encrypted;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The value of the Automation Variable as a json encoded `string`.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetVariableObjectResult(
            string automationAccountName,

            string description,

            bool encrypted,

            string id,

            string name,

            string resourceGroupName,

            string value)
        {
            AutomationAccountName = automationAccountName;
            Description = description;
            Encrypted = encrypted;
            Id = id;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Value = value;
        }
    }
}
