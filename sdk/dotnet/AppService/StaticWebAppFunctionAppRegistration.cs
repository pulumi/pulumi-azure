// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService
{
    /// <summary>
    /// Manages an App Service Static Web App Function App Registration.
    /// 
    /// &gt; **Note:** This resource registers the specified Function App to the `Production` build of the Static Web App.
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
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleStaticWebApp = new Azure.AppService.StaticWebApp("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplesstorageacc",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleServicePlan = new Azure.AppService.ServicePlan("example", new()
    ///     {
    ///         Name = "example-service-plan",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         OsType = "Linux",
    ///         SkuName = "S1",
    ///     });
    /// 
    ///     var exampleLinuxFunctionApp = new Azure.AppService.LinuxFunctionApp("example", new()
    ///     {
    ///         Name = "example-function-app",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         ServicePlanId = exampleServicePlan.Id,
    ///         StorageAccountName = exampleAccount.Name,
    ///         StorageAccountAccessKey = exampleAccount.PrimaryAccessKey,
    ///         SiteConfig = null,
    ///     });
    /// 
    ///     var exampleStaticWebAppFunctionAppRegistration = new Azure.AppService.StaticWebAppFunctionAppRegistration("example", new()
    ///     {
    ///         StaticWebAppId = exampleStaticWebApp.Id,
    ///         FunctionAppId = exampleLinuxFunctionApp.Id,
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
    /// * `Microsoft.Web`: 2023-12-01, 2023-01-01
    /// 
    /// ## Import
    /// 
    /// Static Web App Function App Registration can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:appservice/staticWebAppFunctionAppRegistration:StaticWebAppFunctionAppRegistration example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Web/staticSites/my-static-site1/userProvidedFunctionApps/myFunctionApp
    /// ```
    /// </summary>
    [AzureResourceType("azure:appservice/staticWebAppFunctionAppRegistration:StaticWebAppFunctionAppRegistration")]
    public partial class StaticWebAppFunctionAppRegistration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of a Linux or Windows Function App to connect to the Static Web App as a Backend. Changing this forces a new resource to be created. 
        /// 
        /// &gt; **Note:** Only one Function App can be connected to a Static Web App. Multiple Function Apps are not currently supported.
        /// 
        /// &gt; **Note:** Connecting a Function App resource to a Static Web App resource updates the Function App to use AuthV2 and configures the `azure_static_web_app_v2` which may need to be accounted for by the use of `ignore_changes` depending on the existing `auth_settings_v2` configuration of the target Function App.
        /// </summary>
        [Output("functionAppId")]
        public Output<string> FunctionAppId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Static Web App to register the Function App to as a backend. Changing this forces a new resource to be created.
        /// </summary>
        [Output("staticWebAppId")]
        public Output<string> StaticWebAppId { get; private set; } = null!;


        /// <summary>
        /// Create a StaticWebAppFunctionAppRegistration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StaticWebAppFunctionAppRegistration(string name, StaticWebAppFunctionAppRegistrationArgs args, CustomResourceOptions? options = null)
            : base("azure:appservice/staticWebAppFunctionAppRegistration:StaticWebAppFunctionAppRegistration", name, args ?? new StaticWebAppFunctionAppRegistrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StaticWebAppFunctionAppRegistration(string name, Input<string> id, StaticWebAppFunctionAppRegistrationState? state = null, CustomResourceOptions? options = null)
            : base("azure:appservice/staticWebAppFunctionAppRegistration:StaticWebAppFunctionAppRegistration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StaticWebAppFunctionAppRegistration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StaticWebAppFunctionAppRegistration Get(string name, Input<string> id, StaticWebAppFunctionAppRegistrationState? state = null, CustomResourceOptions? options = null)
        {
            return new StaticWebAppFunctionAppRegistration(name, id, state, options);
        }
    }

    public sealed class StaticWebAppFunctionAppRegistrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a Linux or Windows Function App to connect to the Static Web App as a Backend. Changing this forces a new resource to be created. 
        /// 
        /// &gt; **Note:** Only one Function App can be connected to a Static Web App. Multiple Function Apps are not currently supported.
        /// 
        /// &gt; **Note:** Connecting a Function App resource to a Static Web App resource updates the Function App to use AuthV2 and configures the `azure_static_web_app_v2` which may need to be accounted for by the use of `ignore_changes` depending on the existing `auth_settings_v2` configuration of the target Function App.
        /// </summary>
        [Input("functionAppId", required: true)]
        public Input<string> FunctionAppId { get; set; } = null!;

        /// <summary>
        /// The ID of the Static Web App to register the Function App to as a backend. Changing this forces a new resource to be created.
        /// </summary>
        [Input("staticWebAppId", required: true)]
        public Input<string> StaticWebAppId { get; set; } = null!;

        public StaticWebAppFunctionAppRegistrationArgs()
        {
        }
        public static new StaticWebAppFunctionAppRegistrationArgs Empty => new StaticWebAppFunctionAppRegistrationArgs();
    }

    public sealed class StaticWebAppFunctionAppRegistrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a Linux or Windows Function App to connect to the Static Web App as a Backend. Changing this forces a new resource to be created. 
        /// 
        /// &gt; **Note:** Only one Function App can be connected to a Static Web App. Multiple Function Apps are not currently supported.
        /// 
        /// &gt; **Note:** Connecting a Function App resource to a Static Web App resource updates the Function App to use AuthV2 and configures the `azure_static_web_app_v2` which may need to be accounted for by the use of `ignore_changes` depending on the existing `auth_settings_v2` configuration of the target Function App.
        /// </summary>
        [Input("functionAppId")]
        public Input<string>? FunctionAppId { get; set; }

        /// <summary>
        /// The ID of the Static Web App to register the Function App to as a backend. Changing this forces a new resource to be created.
        /// </summary>
        [Input("staticWebAppId")]
        public Input<string>? StaticWebAppId { get; set; }

        public StaticWebAppFunctionAppRegistrationState()
        {
        }
        public static new StaticWebAppFunctionAppRegistrationState Empty => new StaticWebAppFunctionAppRegistrationState();
    }
}
