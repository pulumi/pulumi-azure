// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.StreamAnalytics
{
    /// <summary>
    /// Manages a Stream Analytics Output Function.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///         });
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///         });
    ///         var examplePlan = new Azure.AppService.Plan("examplePlan", new Azure.AppService.PlanArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Kind = "FunctionApp",
    ///             Reserved = true,
    ///             Sku = new Azure.AppService.Inputs.PlanSkuArgs
    ///             {
    ///                 Tier = "Dynamic",
    ///                 Size = "Y1",
    ///             },
    ///         });
    ///         var exampleFunctionApp = new Azure.AppService.FunctionApp("exampleFunctionApp", new Azure.AppService.FunctionAppArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             AppServicePlanId = examplePlan.Id,
    ///             StorageAccountName = exampleAccount.Name,
    ///             StorageAccountAccessKey = exampleAccount.PrimaryAccessKey,
    ///             OsType = "linux",
    ///             Version = "~3",
    ///         });
    ///         var exampleJob = new Azure.StreamAnalytics.Job("exampleJob", new Azure.StreamAnalytics.JobArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             StreamingUnits = 3,
    ///             TransformationQuery = @"    SELECT *
    ///     INTO [YourOutputAlias]
    ///     FROM [YourInputAlias]
    /// ",
    ///         });
    ///         var exampleOutputFunction = new Azure.StreamAnalytics.OutputFunction("exampleOutputFunction", new Azure.StreamAnalytics.OutputFunctionArgs
    ///         {
    ///             ResourceGroupName = exampleJob.ResourceGroupName,
    ///             StreamAnalyticsJobName = exampleJob.Name,
    ///             FunctionApp = exampleFunctionApp.Name,
    ///             FunctionName = "examplefunctionname",
    ///             ApiKey = "exampleapikey",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Stream Analytics Output Functions can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:streamanalytics/outputFunction:OutputFunction example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/outputs/output1
    /// ```
    /// </summary>
    [AzureResourceType("azure:streamanalytics/outputFunction:OutputFunction")]
    public partial class OutputFunction : Pulumi.CustomResource
    {
        /// <summary>
        /// The API key for the Function.
        /// </summary>
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        /// <summary>
        /// The maximum number of events in each batch that's sent to the function. Defaults to `100`.
        /// </summary>
        [Output("batchMaxCount")]
        public Output<int?> BatchMaxCount { get; private set; } = null!;

        /// <summary>
        /// The maximum batch size in bytes that's sent to the function. Defaults to `262144` (256 kB).
        /// </summary>
        [Output("batchMaxInBytes")]
        public Output<int?> BatchMaxInBytes { get; private set; } = null!;

        /// <summary>
        /// The name of the Function App.
        /// </summary>
        [Output("functionApp")]
        public Output<string> FunctionApp { get; private set; } = null!;

        /// <summary>
        /// The name of the function in the Function App.
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Output("streamAnalyticsJobName")]
        public Output<string> StreamAnalyticsJobName { get; private set; } = null!;


        /// <summary>
        /// Create a OutputFunction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OutputFunction(string name, OutputFunctionArgs args, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/outputFunction:OutputFunction", name, args ?? new OutputFunctionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OutputFunction(string name, Input<string> id, OutputFunctionState? state = null, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/outputFunction:OutputFunction", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing OutputFunction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OutputFunction Get(string name, Input<string> id, OutputFunctionState? state = null, CustomResourceOptions? options = null)
        {
            return new OutputFunction(name, id, state, options);
        }
    }

    public sealed class OutputFunctionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API key for the Function.
        /// </summary>
        [Input("apiKey", required: true)]
        public Input<string> ApiKey { get; set; } = null!;

        /// <summary>
        /// The maximum number of events in each batch that's sent to the function. Defaults to `100`.
        /// </summary>
        [Input("batchMaxCount")]
        public Input<int>? BatchMaxCount { get; set; }

        /// <summary>
        /// The maximum batch size in bytes that's sent to the function. Defaults to `262144` (256 kB).
        /// </summary>
        [Input("batchMaxInBytes")]
        public Input<int>? BatchMaxInBytes { get; set; }

        /// <summary>
        /// The name of the Function App.
        /// </summary>
        [Input("functionApp", required: true)]
        public Input<string> FunctionApp { get; set; } = null!;

        /// <summary>
        /// The name of the function in the Function App.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobName", required: true)]
        public Input<string> StreamAnalyticsJobName { get; set; } = null!;

        public OutputFunctionArgs()
        {
        }
    }

    public sealed class OutputFunctionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API key for the Function.
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        /// <summary>
        /// The maximum number of events in each batch that's sent to the function. Defaults to `100`.
        /// </summary>
        [Input("batchMaxCount")]
        public Input<int>? BatchMaxCount { get; set; }

        /// <summary>
        /// The maximum batch size in bytes that's sent to the function. Defaults to `262144` (256 kB).
        /// </summary>
        [Input("batchMaxInBytes")]
        public Input<int>? BatchMaxInBytes { get; set; }

        /// <summary>
        /// The name of the Function App.
        /// </summary>
        [Input("functionApp")]
        public Input<string>? FunctionApp { get; set; }

        /// <summary>
        /// The name of the function in the Function App.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobName")]
        public Input<string>? StreamAnalyticsJobName { get; set; }

        public OutputFunctionState()
        {
        }
    }
}