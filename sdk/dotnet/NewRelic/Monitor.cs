// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NewRelic
{
    /// <summary>
    /// Manages an Azure Native New Relic Monitor.
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
    ///         Name = "example-resources",
    ///         Location = "East US",
    ///     });
    /// 
    ///     var exampleMonitor = new Azure.NewRelic.Monitor("example", new()
    ///     {
    ///         Name = "example-nrm",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Plan = new Azure.NewRelic.Inputs.MonitorPlanArgs
    ///         {
    ///             EffectiveDate = "2023-06-06T00:00:00Z",
    ///         },
    ///         User = new Azure.NewRelic.Inputs.MonitorUserArgs
    ///         {
    ///             Email = "user@example.com",
    ///             FirstName = "Example",
    ///             LastName = "User",
    ///             PhoneNumber = "+12313803556",
    ///         },
    ///         Identity = new Azure.NewRelic.Inputs.MonitorIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Role Assignment
    /// 
    /// To enable metrics flow, perform role assignment on the identity created above. `Monitoring reader(43d0d8ad-25c7-4714-9337-8ba259a9fe05)` role is required .
    /// 
    /// ### Role assignment on the monitor created
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var monitoringReader = Azure.Authorization.GetRoleDefinition.Invoke(new()
    ///     {
    ///         Name = "Monitoring Reader",
    ///     });
    /// 
    ///     var example = new Azure.Authorization.Assignment("example", new()
    ///     {
    ///         Scope = primary.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id),
    ///         RoleDefinitionId = Output.Tuple(primary, monitoringReader).Apply(values =&gt;
    ///         {
    ///             var primary = values.Item1;
    ///             var monitoringReader = values.Item2;
    ///             return $"{primary.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id)}{monitoringReader.Apply(getRoleDefinitionResult =&gt; getRoleDefinitionResult.Id)}";
    ///         }),
    ///         PrincipalId = exampleAzurermNewRelicMonitor.Identity[0].PrincipalId,
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
    /// * `NewRelic.Observability`: 2024-03-01
    /// 
    /// ## Import
    /// 
    /// Azure Native New Relic Monitor can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:newrelic/monitor:Monitor example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/NewRelic.Observability/monitors/monitor1
    /// ```
    /// </summary>
    [AzureResourceType("azure:newrelic/monitor:Monitor")]
    public partial class Monitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the source of account creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("accountCreationSource")]
        public Output<string?> AccountCreationSource { get; private set; } = null!;

        /// <summary>
        /// Specifies the account id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// 
        /// &gt; **Note:** The value of `account_id` must come from an Azure Native New Relic Monitor instance of another different subscription.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.MonitorIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// Specifies the ingestion key of account. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("ingestionKey")]
        public Output<string?> IngestionKey { get; private set; } = null!;

        /// <summary>
        /// Specifies the Azure Region where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Azure Native New Relic Monitor. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the source of org creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("orgCreationSource")]
        public Output<string?> OrgCreationSource { get; private set; } = null!;

        /// <summary>
        /// Specifies the organization id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// 
        /// &gt; **Note:** The value of `organization_id` must come from an Azure Native New Relic Monitor instance of another different subscription.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("plan")]
        public Output<Outputs.MonitorPlan> Plan { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("user")]
        public Output<Outputs.MonitorUser> User { get; private set; } = null!;

        /// <summary>
        /// Specifies the user id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Output("userId")]
        public Output<string?> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a Monitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Monitor(string name, MonitorArgs args, CustomResourceOptions? options = null)
            : base("azure:newrelic/monitor:Monitor", name, args ?? new MonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Monitor(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
            : base("azure:newrelic/monitor:Monitor", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "ingestionKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Monitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Monitor Get(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new Monitor(name, id, state, options);
        }
    }

    public sealed class MonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the source of account creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("accountCreationSource")]
        public Input<string>? AccountCreationSource { get; set; }

        /// <summary>
        /// Specifies the account id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// 
        /// &gt; **Note:** The value of `account_id` must come from an Azure Native New Relic Monitor instance of another different subscription.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// An `identity` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.MonitorIdentityArgs>? Identity { get; set; }

        [Input("ingestionKey")]
        private Input<string>? _ingestionKey;

        /// <summary>
        /// Specifies the ingestion key of account. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public Input<string>? IngestionKey
        {
            get => _ingestionKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _ingestionKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the Azure Region where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Azure Native New Relic Monitor. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the source of org creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("orgCreationSource")]
        public Input<string>? OrgCreationSource { get; set; }

        /// <summary>
        /// Specifies the organization id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// 
        /// &gt; **Note:** The value of `organization_id` must come from an Azure Native New Relic Monitor instance of another different subscription.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("plan", required: true)]
        public Input<Inputs.MonitorPlanArgs> Plan { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("user", required: true)]
        public Input<Inputs.MonitorUserArgs> User { get; set; } = null!;

        /// <summary>
        /// Specifies the user id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public MonitorArgs()
        {
        }
        public static new MonitorArgs Empty => new MonitorArgs();
    }

    public sealed class MonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the source of account creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("accountCreationSource")]
        public Input<string>? AccountCreationSource { get; set; }

        /// <summary>
        /// Specifies the account id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// 
        /// &gt; **Note:** The value of `account_id` must come from an Azure Native New Relic Monitor instance of another different subscription.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// An `identity` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.MonitorIdentityGetArgs>? Identity { get; set; }

        [Input("ingestionKey")]
        private Input<string>? _ingestionKey;

        /// <summary>
        /// Specifies the ingestion key of account. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        public Input<string>? IngestionKey
        {
            get => _ingestionKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _ingestionKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the Azure Region where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Azure Native New Relic Monitor. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the source of org creation. Possible values are `LIFTR` and `NEWRELIC`. Defaults to `LIFTR`. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("orgCreationSource")]
        public Input<string>? OrgCreationSource { get; set; }

        /// <summary>
        /// Specifies the organization id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// 
        /// &gt; **Note:** The value of `organization_id` must come from an Azure Native New Relic Monitor instance of another different subscription.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("plan")]
        public Input<Inputs.MonitorPlanGetArgs>? Plan { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group where the Azure Native New Relic Monitor should exist. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("user")]
        public Input<Inputs.MonitorUserGetArgs>? User { get; set; }

        /// <summary>
        /// Specifies the user id. Changing this forces a new Azure Native New Relic Monitor to be created.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public MonitorState()
        {
        }
        public static new MonitorState Empty => new MonitorState();
    }
}
