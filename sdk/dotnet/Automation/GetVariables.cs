// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation
{
    public static class GetVariables
    {
        /// <summary>
        /// Use this data source to get all variables in an Automation Account.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Automation.GetAccount.Invoke(new()
        ///     {
        ///         Name = "example-account",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     var exampleGetVariables = Azure.Automation.GetVariables.Invoke(new()
        ///     {
        ///         AutomationAccountId = example.Apply(getAccountResult =&gt; getAccountResult.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["stringVars"] = exampleAzurermAutomationVariableString.String,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Automation`: 2023-11-01
        /// </summary>
        public static Task<GetVariablesResult> InvokeAsync(GetVariablesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVariablesResult>("azure:automation/getVariables:getVariables", args ?? new GetVariablesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get all variables in an Automation Account.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Automation.GetAccount.Invoke(new()
        ///     {
        ///         Name = "example-account",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     var exampleGetVariables = Azure.Automation.GetVariables.Invoke(new()
        ///     {
        ///         AutomationAccountId = example.Apply(getAccountResult =&gt; getAccountResult.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["stringVars"] = exampleAzurermAutomationVariableString.String,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Automation`: 2023-11-01
        /// </summary>
        public static Output<GetVariablesResult> Invoke(GetVariablesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVariablesResult>("azure:automation/getVariables:getVariables", args ?? new GetVariablesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get all variables in an Automation Account.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Automation.GetAccount.Invoke(new()
        ///     {
        ///         Name = "example-account",
        ///         ResourceGroupName = "example-resources",
        ///     });
        /// 
        ///     var exampleGetVariables = Azure.Automation.GetVariables.Invoke(new()
        ///     {
        ///         AutomationAccountId = example.Apply(getAccountResult =&gt; getAccountResult.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["stringVars"] = exampleAzurermAutomationVariableString.String,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Automation`: 2023-11-01
        /// </summary>
        public static Output<GetVariablesResult> Invoke(GetVariablesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVariablesResult>("azure:automation/getVariables:getVariables", args ?? new GetVariablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVariablesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The resource ID of the automation account.
        /// </summary>
        [Input("automationAccountId", required: true)]
        public string AutomationAccountId { get; set; } = null!;

        public GetVariablesArgs()
        {
        }
        public static new GetVariablesArgs Empty => new GetVariablesArgs();
    }

    public sealed class GetVariablesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The resource ID of the automation account.
        /// </summary>
        [Input("automationAccountId", required: true)]
        public Input<string> AutomationAccountId { get; set; } = null!;

        public GetVariablesInvokeArgs()
        {
        }
        public static new GetVariablesInvokeArgs Empty => new GetVariablesInvokeArgs();
    }


    [OutputType]
    public sealed class GetVariablesResult
    {
        public readonly string AutomationAccountId;
        /// <summary>
        /// One or more `variable` blocks as defined below for each boolean variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesBoolResult> Bools;
        /// <summary>
        /// One or more `variable` blocks as defined below for each datetime variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesDatetimeResult> Datetimes;
        /// <summary>
        /// Specifies if the Automation Variable is encrypted.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesEncryptedResult> Encrypteds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// One or more `variable` blocks as defined below for each int variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesIntResult> Ints;
        /// <summary>
        /// One or more `variable` blocks as defined below for each null variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesNullResult> Nulls;
        public readonly ImmutableArray<Outputs.GetVariablesObjectResult> Objects;
        /// <summary>
        /// One or more `variable` blocks as defined below for each string variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesStringResult> Strings;

        [OutputConstructor]
        private GetVariablesResult(
            string automationAccountId,

            ImmutableArray<Outputs.GetVariablesBoolResult> bools,

            ImmutableArray<Outputs.GetVariablesDatetimeResult> datetimes,

            ImmutableArray<Outputs.GetVariablesEncryptedResult> encrypteds,

            string id,

            ImmutableArray<Outputs.GetVariablesIntResult> ints,

            ImmutableArray<Outputs.GetVariablesNullResult> nulls,

            ImmutableArray<Outputs.GetVariablesObjectResult> objects,

            ImmutableArray<Outputs.GetVariablesStringResult> strings)
        {
            AutomationAccountId = automationAccountId;
            Bools = bools;
            Datetimes = datetimes;
            Encrypteds = encrypteds;
            Id = id;
            Ints = ints;
            Nulls = nulls;
            Objects = objects;
            Strings = strings;
        }
    }
}
