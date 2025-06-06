// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService
{
    public static class GetLinuxWebApp
    {
        /// <summary>
        /// Use this data source to access information about an existing Linux Web App.
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
        ///     var example = Azure.AppService.GetLinuxWebApp.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getLinuxWebAppResult =&gt; getLinuxWebAppResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Web`: 2023-12-01
        /// </summary>
        public static Task<GetLinuxWebAppResult> InvokeAsync(GetLinuxWebAppArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLinuxWebAppResult>("azure:appservice/getLinuxWebApp:getLinuxWebApp", args ?? new GetLinuxWebAppArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Linux Web App.
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
        ///     var example = Azure.AppService.GetLinuxWebApp.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getLinuxWebAppResult =&gt; getLinuxWebAppResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Web`: 2023-12-01
        /// </summary>
        public static Output<GetLinuxWebAppResult> Invoke(GetLinuxWebAppInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLinuxWebAppResult>("azure:appservice/getLinuxWebApp:getLinuxWebApp", args ?? new GetLinuxWebAppInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Linux Web App.
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
        ///     var example = Azure.AppService.GetLinuxWebApp.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getLinuxWebAppResult =&gt; getLinuxWebAppResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Web`: 2023-12-01
        /// </summary>
        public static Output<GetLinuxWebAppResult> Invoke(GetLinuxWebAppInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLinuxWebAppResult>("azure:appservice/getLinuxWebApp:getLinuxWebApp", args ?? new GetLinuxWebAppInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLinuxWebAppArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Linux Web App.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Linux Web App exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetLinuxWebAppArgs()
        {
        }
        public static new GetLinuxWebAppArgs Empty => new GetLinuxWebAppArgs();
    }

    public sealed class GetLinuxWebAppInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Linux Web App.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Linux Web App exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetLinuxWebAppInvokeArgs()
        {
        }
        public static new GetLinuxWebAppInvokeArgs Empty => new GetLinuxWebAppInvokeArgs();
    }


    [OutputType]
    public sealed class GetLinuxWebAppResult
    {
        /// <summary>
        /// An `app_metadata` block as defined below.
        /// </summary>
        public readonly ImmutableDictionary<string, string> AppMetadata;
        /// <summary>
        /// An `app_settings` block as defined below.
        /// </summary>
        public readonly ImmutableDictionary<string, string> AppSettings;
        /// <summary>
        /// An `auth_settings` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingResult> AuthSettings;
        /// <summary>
        /// An `auth_settings_v2` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingsV2Result> AuthSettingsV2s;
        /// <summary>
        /// The current availability state. Possible values are `Normal`, `Limited`, and `DisasterRecoveryMode`.
        /// </summary>
        public readonly string Availability;
        /// <summary>
        /// A `backup` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppBackupResult> Backups;
        /// <summary>
        /// Is Client Affinity enabled?
        /// </summary>
        public readonly bool ClientAffinityEnabled;
        /// <summary>
        /// Are Client Certificates enabled?
        /// </summary>
        public readonly bool ClientCertificateEnabled;
        /// <summary>
        /// Paths to exclude when using client certificates, separated by ;
        /// </summary>
        public readonly string ClientCertificateExclusionPaths;
        /// <summary>
        /// The Client Certificate mode.
        /// </summary>
        public readonly string ClientCertificateMode;
        /// <summary>
        /// A `connection_string` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppConnectionStringResult> ConnectionStrings;
        /// <summary>
        /// The identifier used by App Service to perform domain ownership verification via DNS TXT record.
        /// </summary>
        public readonly string CustomDomainVerificationId;
        /// <summary>
        /// The default hostname of the Linux Web App.
        /// </summary>
        public readonly string DefaultHostname;
        /// <summary>
        /// Is the Backup enabled?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Are the default FTP Basic Authentication publishing credentials enabled.
        /// </summary>
        public readonly bool FtpPublishBasicAuthenticationEnabled;
        /// <summary>
        /// The ID of the App Service Environment used by App Service.
        /// </summary>
        public readonly string HostingEnvironmentId;
        /// <summary>
        /// Should the Linux Web App require HTTPS connections.
        /// </summary>
        public readonly bool HttpsOnly;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A `identity` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppIdentityResult> Identities;
        public readonly string KeyVaultReferenceIdentityId;
        /// <summary>
        /// The Kind value for this Linux Web App.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The Azure Region where the Linux Web App exists.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// A `logs` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppLogResult> Logs;
        /// <summary>
        /// The name of this Storage Account.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A `outbound_ip_address_list` block as defined below.
        /// </summary>
        public readonly ImmutableArray<string> OutboundIpAddressLists;
        /// <summary>
        /// A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
        /// </summary>
        public readonly string OutboundIpAddresses;
        /// <summary>
        /// A `possible_outbound_ip_address_list` block as defined below.
        /// </summary>
        public readonly ImmutableArray<string> PossibleOutboundIpAddressLists;
        /// <summary>
        /// A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
        /// </summary>
        public readonly string PossibleOutboundIpAddresses;
        /// <summary>
        /// Is Public Network Access enabled for this Linux Web App.
        /// </summary>
        public readonly bool PublicNetworkAccessEnabled;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The ID of the Service Plan that this Linux Web App exists in.
        /// </summary>
        public readonly string ServicePlanId;
        /// <summary>
        /// A `site_config` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppSiteConfigResult> SiteConfigs;
        /// <summary>
        /// A `site_credential` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppSiteCredentialResult> SiteCredentials;
        /// <summary>
        /// A `sticky_settings` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppStickySettingResult> StickySettings;
        /// <summary>
        /// A `storage_account` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppStorageAccountResult> StorageAccounts;
        /// <summary>
        /// A mapping of tags assigned to the Linux Web App.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The current usage state. Possible values are `Normal` and `Exceeded`.
        /// </summary>
        public readonly string Usage;
        /// <summary>
        /// Whether backup and restore operations over the linked virtual network are enabled.
        /// </summary>
        public readonly bool VirtualNetworkBackupRestoreEnabled;
        /// <summary>
        /// The subnet id which the Linux Web App is vNet Integrated with.
        /// </summary>
        public readonly string VirtualNetworkSubnetId;
        /// <summary>
        /// Are the default WebDeploy Basic Authentication publishing credentials enabled.
        /// </summary>
        public readonly bool WebdeployPublishBasicAuthenticationEnabled;

        [OutputConstructor]
        private GetLinuxWebAppResult(
            ImmutableDictionary<string, string> appMetadata,

            ImmutableDictionary<string, string> appSettings,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingResult> authSettings,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingsV2Result> authSettingsV2s,

            string availability,

            ImmutableArray<Outputs.GetLinuxWebAppBackupResult> backups,

            bool clientAffinityEnabled,

            bool clientCertificateEnabled,

            string clientCertificateExclusionPaths,

            string clientCertificateMode,

            ImmutableArray<Outputs.GetLinuxWebAppConnectionStringResult> connectionStrings,

            string customDomainVerificationId,

            string defaultHostname,

            bool enabled,

            bool ftpPublishBasicAuthenticationEnabled,

            string hostingEnvironmentId,

            bool httpsOnly,

            string id,

            ImmutableArray<Outputs.GetLinuxWebAppIdentityResult> identities,

            string keyVaultReferenceIdentityId,

            string kind,

            string location,

            ImmutableArray<Outputs.GetLinuxWebAppLogResult> logs,

            string name,

            ImmutableArray<string> outboundIpAddressLists,

            string outboundIpAddresses,

            ImmutableArray<string> possibleOutboundIpAddressLists,

            string possibleOutboundIpAddresses,

            bool publicNetworkAccessEnabled,

            string resourceGroupName,

            string servicePlanId,

            ImmutableArray<Outputs.GetLinuxWebAppSiteConfigResult> siteConfigs,

            ImmutableArray<Outputs.GetLinuxWebAppSiteCredentialResult> siteCredentials,

            ImmutableArray<Outputs.GetLinuxWebAppStickySettingResult> stickySettings,

            ImmutableArray<Outputs.GetLinuxWebAppStorageAccountResult> storageAccounts,

            ImmutableDictionary<string, string> tags,

            string usage,

            bool virtualNetworkBackupRestoreEnabled,

            string virtualNetworkSubnetId,

            bool webdeployPublishBasicAuthenticationEnabled)
        {
            AppMetadata = appMetadata;
            AppSettings = appSettings;
            AuthSettings = authSettings;
            AuthSettingsV2s = authSettingsV2s;
            Availability = availability;
            Backups = backups;
            ClientAffinityEnabled = clientAffinityEnabled;
            ClientCertificateEnabled = clientCertificateEnabled;
            ClientCertificateExclusionPaths = clientCertificateExclusionPaths;
            ClientCertificateMode = clientCertificateMode;
            ConnectionStrings = connectionStrings;
            CustomDomainVerificationId = customDomainVerificationId;
            DefaultHostname = defaultHostname;
            Enabled = enabled;
            FtpPublishBasicAuthenticationEnabled = ftpPublishBasicAuthenticationEnabled;
            HostingEnvironmentId = hostingEnvironmentId;
            HttpsOnly = httpsOnly;
            Id = id;
            Identities = identities;
            KeyVaultReferenceIdentityId = keyVaultReferenceIdentityId;
            Kind = kind;
            Location = location;
            Logs = logs;
            Name = name;
            OutboundIpAddressLists = outboundIpAddressLists;
            OutboundIpAddresses = outboundIpAddresses;
            PossibleOutboundIpAddressLists = possibleOutboundIpAddressLists;
            PossibleOutboundIpAddresses = possibleOutboundIpAddresses;
            PublicNetworkAccessEnabled = publicNetworkAccessEnabled;
            ResourceGroupName = resourceGroupName;
            ServicePlanId = servicePlanId;
            SiteConfigs = siteConfigs;
            SiteCredentials = siteCredentials;
            StickySettings = stickySettings;
            StorageAccounts = storageAccounts;
            Tags = tags;
            Usage = usage;
            VirtualNetworkBackupRestoreEnabled = virtualNetworkBackupRestoreEnabled;
            VirtualNetworkSubnetId = virtualNetworkSubnetId;
            WebdeployPublishBasicAuthenticationEnabled = webdeployPublishBasicAuthenticationEnabled;
        }
    }
}
