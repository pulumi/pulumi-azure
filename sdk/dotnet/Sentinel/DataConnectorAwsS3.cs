// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel
{
    /// <summary>
    /// Manages a AWS S3 Data Connector.
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
    ///             Location = "West Europe",
    ///         });
    ///         var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("exampleAnalyticsWorkspace", new Azure.OperationalInsights.AnalyticsWorkspaceArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Sku = "PerGB2018",
    ///         });
    ///         var exampleAnalyticsSolution = new Azure.OperationalInsights.AnalyticsSolution("exampleAnalyticsSolution", new Azure.OperationalInsights.AnalyticsSolutionArgs
    ///         {
    ///             SolutionName = "SecurityInsights",
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             WorkspaceResourceId = exampleAnalyticsWorkspace.Id,
    ///             WorkspaceName = exampleAnalyticsWorkspace.Name,
    ///             Plan = new Azure.OperationalInsights.Inputs.AnalyticsSolutionPlanArgs
    ///             {
    ///                 Publisher = "Microsoft",
    ///                 Product = "OMSGallery/SecurityInsights",
    ///             },
    ///         });
    ///         var exampleDataConnectorAwsS3 = new Azure.Sentinel.DataConnectorAwsS3("exampleDataConnectorAwsS3", new Azure.Sentinel.DataConnectorAwsS3Args
    ///         {
    ///             LogAnalyticsWorkspaceId = "TODO",
    ///             AwsRoleArn = "TODO",
    ///             DestinationTable = "TODO",
    ///             SqsUrls = 
    ///             {
    ///                 "example",
    ///             },
    ///         });
    ///         var exampleSentinel_dataConnectorAwsS3DataConnectorAwsS3 = new Azure.Sentinel.DataConnectorAwsS3("exampleSentinel/dataConnectorAwsS3DataConnectorAwsS3", new Azure.Sentinel.DataConnectorAwsS3Args
    ///         {
    ///             LogAnalyticsWorkspaceId = exampleAnalyticsSolution.WorkspaceResourceId,
    ///             AwsRoleArn = "arn:aws:iam::000000000000:role/role1",
    ///             DestinationTable = "AWSGuardDuty",
    ///             SqsUrls = 
    ///             {
    ///                 "https://sqs.us-east-1.amazonaws.com/000000000000/example",
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleAnalyticsSolution,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// AWS S3 Data Connectors can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
    /// ```
    /// </summary>
    [AzureResourceType("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3")]
    public partial class DataConnectorAwsS3 : Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/en-us/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
        /// </summary>
        [Output("awsRoleArn")]
        public Output<string> AwsRoleArn { get; private set; } = null!;

        /// <summary>
        /// The name of the Log Analytics table that will store the ingested data.
        /// </summary>
        [Output("destinationTable")]
        public Output<string> DestinationTable { get; private set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
        /// </summary>
        [Output("sqsUrls")]
        public Output<ImmutableArray<string>> SqsUrls { get; private set; } = null!;


        /// <summary>
        /// Create a DataConnectorAwsS3 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataConnectorAwsS3(string name, DataConnectorAwsS3Args args, CustomResourceOptions? options = null)
            : base("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3", name, args ?? new DataConnectorAwsS3Args(), MakeResourceOptions(options, ""))
        {
        }

        private DataConnectorAwsS3(string name, Input<string> id, DataConnectorAwsS3State? state = null, CustomResourceOptions? options = null)
            : base("azure:sentinel/dataConnectorAwsS3:DataConnectorAwsS3", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataConnectorAwsS3 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataConnectorAwsS3 Get(string name, Input<string> id, DataConnectorAwsS3State? state = null, CustomResourceOptions? options = null)
        {
            return new DataConnectorAwsS3(name, id, state, options);
        }
    }

    public sealed class DataConnectorAwsS3Args : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/en-us/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
        /// </summary>
        [Input("awsRoleArn", required: true)]
        public Input<string> AwsRoleArn { get; set; } = null!;

        /// <summary>
        /// The name of the Log Analytics table that will store the ingested data.
        /// </summary>
        [Input("destinationTable", required: true)]
        public Input<string> DestinationTable { get; set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sqsUrls", required: true)]
        private InputList<string>? _sqsUrls;

        /// <summary>
        /// Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
        /// </summary>
        public InputList<string> SqsUrls
        {
            get => _sqsUrls ?? (_sqsUrls = new InputList<string>());
            set => _sqsUrls = value;
        }

        public DataConnectorAwsS3Args()
        {
        }
    }

    public sealed class DataConnectorAwsS3State : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/en-us/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
        /// </summary>
        [Input("awsRoleArn")]
        public Input<string>? AwsRoleArn { get; set; }

        /// <summary>
        /// The name of the Log Analytics table that will store the ingested data.
        /// </summary>
        [Input("destinationTable")]
        public Input<string>? DestinationTable { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sqsUrls")]
        private InputList<string>? _sqsUrls;

        /// <summary>
        /// Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
        /// </summary>
        public InputList<string> SqsUrls
        {
            get => _sqsUrls ?? (_sqsUrls = new InputList<string>());
            set => _sqsUrls = value;
        }

        public DataConnectorAwsS3State()
        {
        }
    }
}