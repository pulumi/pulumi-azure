// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Outputs
{

    [OutputType]
    public sealed class StandardSiteConfig
    {
        /// <summary>
        /// Should the Logic App be loaded at all times? Defaults to `false`.
        /// </summary>
        public readonly bool? AlwaysOn;
        /// <summary>
        /// The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
        /// </summary>
        public readonly int? AppScaleLimit;
        /// <summary>
        /// The Auto-swap slot name.
        /// </summary>
        public readonly string? AutoSwapSlotName;
        /// <summary>
        /// A `cors` block as defined below.
        /// </summary>
        public readonly Outputs.StandardSiteConfigCors? Cors;
        /// <summary>
        /// The version of the .NET framework's CLR used in this Logic App Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0`, `v6.0` and `v8.0`. [For more information on which .NET Framework version to use based on the runtime version you're targeting - please see this table](https://docs.microsoft.com/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
        /// </summary>
        public readonly string? DotnetFrameworkVersion;
        /// <summary>
        /// The number of minimum instances for this Logic App Only affects apps on the Premium plan.
        /// </summary>
        public readonly int? ElasticInstanceMinimum;
        /// <summary>
        /// State of FTP / FTPS service for this Logic App. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `AllAllowed`.
        /// </summary>
        public readonly string? FtpsState;
        /// <summary>
        /// Path which will be checked for this Logic App health.
        /// </summary>
        public readonly string? HealthCheckPath;
        /// <summary>
        /// Specifies whether the HTTP2 protocol should be enabled. Defaults to `false`.
        /// </summary>
        public readonly bool? Http2Enabled;
        /// <summary>
        /// A list of `ip_restriction` objects representing IP restrictions as defined below.
        /// 
        /// &gt; **Note:** User has to explicitly set `ip_restriction` to empty slice (`[]`) to remove it.
        /// </summary>
        public readonly ImmutableArray<Outputs.StandardSiteConfigIpRestriction> IpRestrictions;
        /// <summary>
        /// Linux App Framework and version for the App Service, e.g. `DOCKER|(golang:latest)`. Setting this value will also set the `kind` of application deployed to `functionapp,linux,container,workflowapp`.
        /// 
        /// &gt; **Note:** You must set `os_type` in `azure.appservice.ServicePlan` to `Linux` when this property is set.
        /// </summary>
        public readonly string? LinuxFxVersion;
        /// <summary>
        /// The minimum supported TLS version for the Logic App. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new Logic Apps.
        /// 
        /// &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
        /// </summary>
        public readonly string? MinTlsVersion;
        /// <summary>
        /// The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
        /// </summary>
        public readonly int? PreWarmedInstanceCount;
        public readonly bool? PublicNetworkAccessEnabled;
        /// <summary>
        /// Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
        /// </summary>
        public readonly bool? RuntimeScaleMonitoringEnabled;
        /// <summary>
        /// A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
        /// 
        /// &gt; **Note:** User has to explicitly set `scm_ip_restriction` to empty slice (`[]`) to remove it.
        /// </summary>
        public readonly ImmutableArray<Outputs.StandardSiteConfigScmIpRestriction> ScmIpRestrictions;
        /// <summary>
        /// Configures the minimum version of TLS required for SSL requests to the SCM site. Possible values are `1.0`, `1.1` and `1.2`.
        /// 
        /// &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
        /// </summary>
        public readonly string? ScmMinTlsVersion;
        /// <summary>
        /// The type of Source Control used by the Logic App in use by the Windows Function App. Defaults to `None`. Possible values are: `BitbucketGit`, `BitbucketHg`, `CodePlexGit`, `CodePlexHg`, `Dropbox`, `ExternalGit`, `ExternalHg`, `GitHub`, `LocalGit`, `None`, `OneDrive`, `Tfs`, `VSO`, and `VSTSRM`
        /// </summary>
        public readonly string? ScmType;
        /// <summary>
        /// Should the Logic App `ip_restriction` configuration be used for the SCM too. Defaults to `false`.
        /// </summary>
        public readonly bool? ScmUseMainIpRestriction;
        /// <summary>
        /// Should the Logic App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
        /// 
        /// &gt; **Note:** when using an App Service Plan in the `Free` or `Shared` Tiers `use_32_bit_worker_process` must be set to `true`.
        /// </summary>
        public readonly bool? Use32BitWorkerProcess;
        /// <summary>
        /// Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
        /// </summary>
        public readonly bool? VnetRouteAllEnabled;
        /// <summary>
        /// Should WebSockets be enabled?
        /// </summary>
        public readonly bool? WebsocketsEnabled;

        [OutputConstructor]
        private StandardSiteConfig(
            bool? alwaysOn,

            int? appScaleLimit,

            string? autoSwapSlotName,

            Outputs.StandardSiteConfigCors? cors,

            string? dotnetFrameworkVersion,

            int? elasticInstanceMinimum,

            string? ftpsState,

            string? healthCheckPath,

            bool? http2Enabled,

            ImmutableArray<Outputs.StandardSiteConfigIpRestriction> ipRestrictions,

            string? linuxFxVersion,

            string? minTlsVersion,

            int? preWarmedInstanceCount,

            bool? publicNetworkAccessEnabled,

            bool? runtimeScaleMonitoringEnabled,

            ImmutableArray<Outputs.StandardSiteConfigScmIpRestriction> scmIpRestrictions,

            string? scmMinTlsVersion,

            string? scmType,

            bool? scmUseMainIpRestriction,

            bool? use32BitWorkerProcess,

            bool? vnetRouteAllEnabled,

            bool? websocketsEnabled)
        {
            AlwaysOn = alwaysOn;
            AppScaleLimit = appScaleLimit;
            AutoSwapSlotName = autoSwapSlotName;
            Cors = cors;
            DotnetFrameworkVersion = dotnetFrameworkVersion;
            ElasticInstanceMinimum = elasticInstanceMinimum;
            FtpsState = ftpsState;
            HealthCheckPath = healthCheckPath;
            Http2Enabled = http2Enabled;
            IpRestrictions = ipRestrictions;
            LinuxFxVersion = linuxFxVersion;
            MinTlsVersion = minTlsVersion;
            PreWarmedInstanceCount = preWarmedInstanceCount;
            PublicNetworkAccessEnabled = publicNetworkAccessEnabled;
            RuntimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            ScmIpRestrictions = scmIpRestrictions;
            ScmMinTlsVersion = scmMinTlsVersion;
            ScmType = scmType;
            ScmUseMainIpRestriction = scmUseMainIpRestriction;
            Use32BitWorkerProcess = use32BitWorkerProcess;
            VnetRouteAllEnabled = vnetRouteAllEnabled;
            WebsocketsEnabled = websocketsEnabled;
        }
    }
}
