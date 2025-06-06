// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class FunctionAppSiteConfig
    {
        /// <summary>
        /// Should the Function App be loaded at all times? Defaults to `false`.
        /// </summary>
        public readonly bool? AlwaysOn;
        /// <summary>
        /// The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
        /// </summary>
        public readonly int? AppScaleLimit;
        /// <summary>
        /// The name of the slot to automatically swap to during deployment
        /// 
        /// &gt; **NOTE:** This attribute is only used for slots.
        /// </summary>
        public readonly string? AutoSwapSlotName;
        /// <summary>
        /// A `cors` block as defined below.
        /// </summary>
        public readonly Outputs.FunctionAppSiteConfigCors? Cors;
        /// <summary>
        /// The version of the .NET framework's CLR used in this function app. Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0` and `v6.0`. [For more information on which .NET Framework version to use based on the runtime version you're targeting - please see this table](https://docs.microsoft.com/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
        /// </summary>
        public readonly string? DotnetFrameworkVersion;
        /// <summary>
        /// The number of minimum instances for this function app. Only affects apps on the Premium plan. Possible values are between `1` and `20`.
        /// </summary>
        public readonly int? ElasticInstanceMinimum;
        /// <summary>
        /// State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `AllAllowed`.
        /// </summary>
        public readonly string? FtpsState;
        /// <summary>
        /// Path which will be checked for this function app health.
        /// </summary>
        public readonly string? HealthCheckPath;
        /// <summary>
        /// Specifies whether or not the HTTP2 protocol should be enabled. Defaults to `false`.
        /// </summary>
        public readonly bool? Http2Enabled;
        /// <summary>
        /// A list of `ip_restriction` objects representing IP restrictions as defined below.
        /// 
        /// &gt; **NOTE** User has to explicitly set `ip_restriction` to empty slice (`[]`) to remove it.
        /// </summary>
        public readonly ImmutableArray<Outputs.FunctionAppSiteConfigIpRestriction> IpRestrictions;
        /// <summary>
        /// Java version hosted by the function app in Azure. Possible values are `1.8`, `11` &amp; `17` (In-Preview).
        /// </summary>
        public readonly string? JavaVersion;
        /// <summary>
        /// Linux App Framework and version for the AppService, e.g. `DOCKER|(golang:latest)`.
        /// </summary>
        public readonly string? LinuxFxVersion;
        /// <summary>
        /// The minimum supported TLS version for the function app. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new function apps.
        /// </summary>
        public readonly string? MinTlsVersion;
        /// <summary>
        /// The number of pre-warmed instances for this function app. Only affects apps on the Premium plan.
        /// </summary>
        public readonly int? PreWarmedInstanceCount;
        /// <summary>
        /// Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
        /// </summary>
        public readonly bool? RuntimeScaleMonitoringEnabled;
        /// <summary>
        /// A list of `scm_ip_restriction` objects representing IP restrictions as defined below.
        /// 
        /// &gt; **NOTE** User has to explicitly set `scm_ip_restriction` to empty slice (`[]`) to remove it.
        /// </summary>
        public readonly ImmutableArray<Outputs.FunctionAppSiteConfigScmIpRestriction> ScmIpRestrictions;
        /// <summary>
        /// The type of Source Control used by the Function App. Valid values include: `BitBucketGit`, `BitBucketHg`, `CodePlexGit`, `CodePlexHg`, `Dropbox`, `ExternalGit`, `ExternalHg`, `GitHub`, `LocalGit`, `None` (default), `OneDrive`, `Tfs`, `VSO`, and `VSTSRM`.
        /// 
        /// &gt; **NOTE:** This setting is incompatible with the `source_control` block which updates this value based on the setting provided.
        /// </summary>
        public readonly string? ScmType;
        /// <summary>
        /// IP security restrictions for scm to use main. Defaults to `false`.
        /// 
        /// &gt; **NOTE** Any `scm_ip_restriction` blocks configured are ignored by the service when `scm_use_main_ip_restriction` is set to `true`. Any scm restrictions will become active if this is subsequently set to `false` or removed.
        /// </summary>
        public readonly bool? ScmUseMainIpRestriction;
        /// <summary>
        /// Should the Function App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
        /// 
        /// &gt; **Note:** when using an App Service Plan in the `Free` or `Shared` Tiers `use_32_bit_worker_process` must be set to `true`.
        /// </summary>
        public readonly bool? Use32BitWorkerProcess;
        public readonly bool? VnetRouteAllEnabled;
        /// <summary>
        /// Should WebSockets be enabled?
        /// </summary>
        public readonly bool? WebsocketsEnabled;

        [OutputConstructor]
        private FunctionAppSiteConfig(
            bool? alwaysOn,

            int? appScaleLimit,

            string? autoSwapSlotName,

            Outputs.FunctionAppSiteConfigCors? cors,

            string? dotnetFrameworkVersion,

            int? elasticInstanceMinimum,

            string? ftpsState,

            string? healthCheckPath,

            bool? http2Enabled,

            ImmutableArray<Outputs.FunctionAppSiteConfigIpRestriction> ipRestrictions,

            string? javaVersion,

            string? linuxFxVersion,

            string? minTlsVersion,

            int? preWarmedInstanceCount,

            bool? runtimeScaleMonitoringEnabled,

            ImmutableArray<Outputs.FunctionAppSiteConfigScmIpRestriction> scmIpRestrictions,

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
            JavaVersion = javaVersion;
            LinuxFxVersion = linuxFxVersion;
            MinTlsVersion = minTlsVersion;
            PreWarmedInstanceCount = preWarmedInstanceCount;
            RuntimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            ScmIpRestrictions = scmIpRestrictions;
            ScmType = scmType;
            ScmUseMainIpRestriction = scmUseMainIpRestriction;
            Use32BitWorkerProcess = use32BitWorkerProcess;
            VnetRouteAllEnabled = vnetRouteAllEnabled;
            WebsocketsEnabled = websocketsEnabled;
        }
    }
}
