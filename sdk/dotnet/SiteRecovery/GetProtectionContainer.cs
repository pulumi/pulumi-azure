// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery
{
    public static class GetProtectionContainer
    {
        /// <summary>
        /// Use this data source to access information about an existing site recovery services protection container.
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
        ///     var container = Azure.SiteRecovery.GetProtectionContainer.Invoke(new()
        ///     {
        ///         Name = "primary-container",
        ///         RecoveryVaultName = "tfex-recovery_vault",
        ///         ResourceGroupName = "tfex-resource_group",
        ///         RecoveryFabricName = "primary-fabric",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.RecoveryServices`: 2024-04-01
        /// </summary>
        public static Task<GetProtectionContainerResult> InvokeAsync(GetProtectionContainerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProtectionContainerResult>("azure:siterecovery/getProtectionContainer:getProtectionContainer", args ?? new GetProtectionContainerArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing site recovery services protection container.
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
        ///     var container = Azure.SiteRecovery.GetProtectionContainer.Invoke(new()
        ///     {
        ///         Name = "primary-container",
        ///         RecoveryVaultName = "tfex-recovery_vault",
        ///         ResourceGroupName = "tfex-resource_group",
        ///         RecoveryFabricName = "primary-fabric",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.RecoveryServices`: 2024-04-01
        /// </summary>
        public static Output<GetProtectionContainerResult> Invoke(GetProtectionContainerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProtectionContainerResult>("azure:siterecovery/getProtectionContainer:getProtectionContainer", args ?? new GetProtectionContainerInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing site recovery services protection container.
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
        ///     var container = Azure.SiteRecovery.GetProtectionContainer.Invoke(new()
        ///     {
        ///         Name = "primary-container",
        ///         RecoveryVaultName = "tfex-recovery_vault",
        ///         ResourceGroupName = "tfex-resource_group",
        ///         RecoveryFabricName = "primary-fabric",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.RecoveryServices`: 2024-04-01
        /// </summary>
        public static Output<GetProtectionContainerResult> Invoke(GetProtectionContainerInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetProtectionContainerResult>("azure:siterecovery/getProtectionContainer:getProtectionContainer", args ?? new GetProtectionContainerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProtectionContainerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the protection container.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the fabric that contains the protection container.
        /// </summary>
        [Input("recoveryFabricName", required: true)]
        public string RecoveryFabricName { get; set; } = null!;

        /// <summary>
        /// The name of the Recovery Services Vault that the protection container is associated witth.
        /// </summary>
        [Input("recoveryVaultName", required: true)]
        public string RecoveryVaultName { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which the associated protection container resides.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetProtectionContainerArgs()
        {
        }
        public static new GetProtectionContainerArgs Empty => new GetProtectionContainerArgs();
    }

    public sealed class GetProtectionContainerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the protection container.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the fabric that contains the protection container.
        /// </summary>
        [Input("recoveryFabricName", required: true)]
        public Input<string> RecoveryFabricName { get; set; } = null!;

        /// <summary>
        /// The name of the Recovery Services Vault that the protection container is associated witth.
        /// </summary>
        [Input("recoveryVaultName", required: true)]
        public Input<string> RecoveryVaultName { get; set; } = null!;

        /// <summary>
        /// The name of the resource group in which the associated protection container resides.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetProtectionContainerInvokeArgs()
        {
        }
        public static new GetProtectionContainerInvokeArgs Empty => new GetProtectionContainerInvokeArgs();
    }


    [OutputType]
    public sealed class GetProtectionContainerResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string RecoveryFabricName;
        public readonly string RecoveryVaultName;
        public readonly string ResourceGroupName;

        [OutputConstructor]
        private GetProtectionContainerResult(
            string id,

            string name,

            string recoveryFabricName,

            string recoveryVaultName,

            string resourceGroupName)
        {
            Id = id;
            Name = name;
            RecoveryFabricName = recoveryFabricName;
            RecoveryVaultName = recoveryVaultName;
            ResourceGroupName = resourceGroupName;
        }
    }
}
