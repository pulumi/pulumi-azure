// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogAnalytics
{
    /// <summary>
    /// Manages a Log Analytics Linked Service.
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
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "resourcegroup-01",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Automation.Account("example", new()
    ///     {
    ///         Name = "automation-01",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Basic",
    ///         Tags = 
    ///         {
    ///             { "environment", "development" },
    ///         },
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("example", new()
    ///     {
    ///         Name = "workspace-01",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Sku = "PerGB2018",
    ///         RetentionInDays = 30,
    ///     });
    /// 
    ///     var exampleLinkedService = new Azure.LogAnalytics.LinkedService("example", new()
    ///     {
    ///         ResourceGroupName = example.Name,
    ///         WorkspaceId = exampleAnalyticsWorkspace.Id,
    ///         ReadAccessId = exampleAccount.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.OperationalInsights`: 2020-08-01
    /// 
    /// ## Import
    /// 
    /// Log Analytics Workspaces can be imported using the `resource id`, e.g.
    /// 
    /// When `read_access_id` has been specified:
    /// 
    /// ```sh
    /// $ pulumi import azure:loganalytics/linkedService:LinkedService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/linkedServices/Automation
    /// ```
    /// 
    /// When `read_access_id` has been omitted:
    /// 
    /// ```sh
    /// $ pulumi import azure:loganalytics/linkedService:LinkedService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/linkedServices/Cluster
    /// ```
    /// </summary>
    [AzureResourceType("azure:loganalytics/linkedService:LinkedService")]
    public partial class LinkedService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The generated name of the Linked Service. The format for this attribute is always `&lt;workspace name&gt;/&lt;linked service type&gt;`(e.g. `workspace1/Automation` or `workspace1/Cluster`)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
        /// </summary>
        [Output("readAccessId")]
        public Output<string> ReadAccessId { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
        /// 
        /// &gt; **Note:** You must define at least one of the above access resource id attributes (e.g. `read_access_id` or `write_access_id`).
        /// </summary>
        [Output("writeAccessId")]
        public Output<string?> WriteAccessId { get; private set; } = null!;


        /// <summary>
        /// Create a LinkedService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LinkedService(string name, LinkedServiceArgs args, CustomResourceOptions? options = null)
            : base("azure:loganalytics/linkedService:LinkedService", name, args ?? new LinkedServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LinkedService(string name, Input<string> id, LinkedServiceState? state = null, CustomResourceOptions? options = null)
            : base("azure:loganalytics/linkedService:LinkedService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LinkedService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LinkedService Get(string name, Input<string> id, LinkedServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new LinkedService(name, id, state, options);
        }
    }

    public sealed class LinkedServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
        /// </summary>
        [Input("readAccessId")]
        public Input<string>? ReadAccessId { get; set; }

        /// <summary>
        /// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        /// <summary>
        /// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
        /// 
        /// &gt; **Note:** You must define at least one of the above access resource id attributes (e.g. `read_access_id` or `write_access_id`).
        /// </summary>
        [Input("writeAccessId")]
        public Input<string>? WriteAccessId { get; set; }

        public LinkedServiceArgs()
        {
        }
        public static new LinkedServiceArgs Empty => new LinkedServiceArgs();
    }

    public sealed class LinkedServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The generated name of the Linked Service. The format for this attribute is always `&lt;workspace name&gt;/&lt;linked service type&gt;`(e.g. `workspace1/Automation` or `workspace1/Cluster`)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
        /// </summary>
        [Input("readAccessId")]
        public Input<string>? ReadAccessId { get; set; }

        /// <summary>
        /// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        /// <summary>
        /// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
        /// 
        /// &gt; **Note:** You must define at least one of the above access resource id attributes (e.g. `read_access_id` or `write_access_id`).
        /// </summary>
        [Input("writeAccessId")]
        public Input<string>? WriteAccessId { get; set; }

        public LinkedServiceState()
        {
        }
        public static new LinkedServiceState Empty => new LinkedServiceState();
    }
}
