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
    public sealed class WindowsFunctionAppSiteConfig
    {
        /// <summary>
        /// If this Windows Function App is Always On enabled. Defaults to `false`.
        /// 
        /// &gt; **Note:** when running in a Consumption or Premium Plan, `always_on` feature should be turned off. Please turn it off before upgrading the service plan from standard to premium.
        /// </summary>
        public readonly bool? AlwaysOn;
        /// <summary>
        /// The URL of the API definition that describes this Windows Function App.
        /// </summary>
        public readonly string? ApiDefinitionUrl;
        /// <summary>
        /// The ID of the API Management API for this Windows Function App.
        /// </summary>
        public readonly string? ApiManagementApiId;
        /// <summary>
        /// The App command line to launch.
        /// </summary>
        public readonly string? AppCommandLine;
        /// <summary>
        /// The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
        /// </summary>
        public readonly int? AppScaleLimit;
        /// <summary>
        /// An `app_service_logs` block as defined above.
        /// </summary>
        public readonly Outputs.WindowsFunctionAppSiteConfigAppServiceLogs? AppServiceLogs;
        /// <summary>
        /// The Connection String for linking the Windows Function App to Application Insights.
        /// </summary>
        public readonly string? ApplicationInsightsConnectionString;
        /// <summary>
        /// The Instrumentation Key for connecting the Windows Function App to Application Insights.
        /// </summary>
        public readonly string? ApplicationInsightsKey;
        /// <summary>
        /// An `application_stack` block as defined above.
        /// 
        /// &gt; **Note:** If this is set, there must not be an application setting `FUNCTIONS_WORKER_RUNTIME`.
        /// </summary>
        public readonly Outputs.WindowsFunctionAppSiteConfigApplicationStack? ApplicationStack;
        /// <summary>
        /// A `cors` block as defined above.
        /// </summary>
        public readonly Outputs.WindowsFunctionAppSiteConfigCors? Cors;
        /// <summary>
        /// Specifies a list of Default Documents for the Windows Function App.
        /// </summary>
        public readonly ImmutableArray<string> DefaultDocuments;
        /// <summary>
        /// Is detailed error logging enabled
        /// </summary>
        public readonly bool? DetailedErrorLoggingEnabled;
        /// <summary>
        /// The number of minimum instances for this Windows Function App. Only affects apps on Elastic Premium plans.
        /// </summary>
        public readonly int? ElasticInstanceMinimum;
        /// <summary>
        /// State of FTP / FTPS service for this Windows Function App. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `Disabled`.
        /// </summary>
        public readonly string? FtpsState;
        /// <summary>
        /// The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
        /// </summary>
        public readonly int? HealthCheckEvictionTimeInMin;
        /// <summary>
        /// The path to be checked for this Windows Function App health.
        /// </summary>
        public readonly string? HealthCheckPath;
        /// <summary>
        /// Specifies if the HTTP2 protocol should be enabled. Defaults to `false`.
        /// </summary>
        public readonly bool? Http2Enabled;
        /// <summary>
        /// The Default action for traffic that does not match any `ip_restriction` rule. possible values include `Allow` and `Deny`. Defaults to `Allow`.
        /// </summary>
        public readonly string? IpRestrictionDefaultAction;
        /// <summary>
        /// One or more `ip_restriction` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.WindowsFunctionAppSiteConfigIpRestriction> IpRestrictions;
        /// <summary>
        /// The Site load balancing mode. Possible values include: `WeightedRoundRobin`, `LeastRequests`, `LeastResponseTime`, `WeightedTotalTraffic`, `RequestHash`, `PerSiteRoundRobin`. Defaults to `LeastRequests` if omitted.
        /// </summary>
        public readonly string? LoadBalancingMode;
        /// <summary>
        /// Managed pipeline mode. Possible values include: `Integrated`, `Classic`. Defaults to `Integrated`.
        /// </summary>
        public readonly string? ManagedPipelineMode;
        /// <summary>
        /// Configures the minimum version of TLS required for SSL requests. Possible values include: `1.0`, `1.1`, `1.2` and `1.3`. Defaults to `1.2`.
        /// </summary>
        public readonly string? MinimumTlsVersion;
        /// <summary>
        /// The number of pre-warmed instances for this Windows Function App. Only affects apps on an Elastic Premium plan.
        /// </summary>
        public readonly int? PreWarmedInstanceCount;
        /// <summary>
        /// Should Remote Debugging be enabled. Defaults to `false`.
        /// </summary>
        public readonly bool? RemoteDebuggingEnabled;
        /// <summary>
        /// The Remote Debugging Version. Currently only `VS2022` is supported.
        /// </summary>
        public readonly string? RemoteDebuggingVersion;
        /// <summary>
        /// Should Scale Monitoring of the Functions Runtime be enabled?
        /// 
        /// &gt; **Note:** Functions runtime scale monitoring can only be enabled for Elastic Premium Function Apps or Workflow Standard Logic Apps and requires a minimum prewarmed instance count of 1.
        /// </summary>
        public readonly bool? RuntimeScaleMonitoringEnabled;
        /// <summary>
        /// The Default action for traffic that does not match any `scm_ip_restriction` rule. possible values include `Allow` and `Deny`. Defaults to `Allow`.
        /// </summary>
        public readonly string? ScmIpRestrictionDefaultAction;
        /// <summary>
        /// One or more `scm_ip_restriction` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.WindowsFunctionAppSiteConfigScmIpRestriction> ScmIpRestrictions;
        /// <summary>
        /// Configures the minimum version of TLS required for SSL requests to the SCM site. Possible values include: `1.0`, `1.1`, `1.2` and `1.3`. Defaults to `1.2`.
        /// </summary>
        public readonly string? ScmMinimumTlsVersion;
        /// <summary>
        /// The SCM Type in use by the Windows Function App.
        /// </summary>
        public readonly string? ScmType;
        /// <summary>
        /// Should the Windows Function App `ip_restriction` configuration be used for the SCM also.
        /// </summary>
        public readonly bool? ScmUseMainIpRestriction;
        /// <summary>
        /// Should the Windows Function App use a 32-bit worker process. Defaults to `true`.
        /// </summary>
        public readonly bool? Use32BitWorker;
        /// <summary>
        /// Should all outbound traffic to have NAT Gateways, Network Security Groups and User Defined Routes applied? Defaults to `false`.
        /// </summary>
        public readonly bool? VnetRouteAllEnabled;
        /// <summary>
        /// Should Web Sockets be enabled. Defaults to `false`.
        /// </summary>
        public readonly bool? WebsocketsEnabled;
        /// <summary>
        /// The Windows FX Version string.
        /// </summary>
        public readonly string? WindowsFxVersion;
        /// <summary>
        /// The number of Workers for this Windows Function App.
        /// </summary>
        public readonly int? WorkerCount;

        [OutputConstructor]
        private WindowsFunctionAppSiteConfig(
            bool? alwaysOn,

            string? apiDefinitionUrl,

            string? apiManagementApiId,

            string? appCommandLine,

            int? appScaleLimit,

            Outputs.WindowsFunctionAppSiteConfigAppServiceLogs? appServiceLogs,

            string? applicationInsightsConnectionString,

            string? applicationInsightsKey,

            Outputs.WindowsFunctionAppSiteConfigApplicationStack? applicationStack,

            Outputs.WindowsFunctionAppSiteConfigCors? cors,

            ImmutableArray<string> defaultDocuments,

            bool? detailedErrorLoggingEnabled,

            int? elasticInstanceMinimum,

            string? ftpsState,

            int? healthCheckEvictionTimeInMin,

            string? healthCheckPath,

            bool? http2Enabled,

            string? ipRestrictionDefaultAction,

            ImmutableArray<Outputs.WindowsFunctionAppSiteConfigIpRestriction> ipRestrictions,

            string? loadBalancingMode,

            string? managedPipelineMode,

            string? minimumTlsVersion,

            int? preWarmedInstanceCount,

            bool? remoteDebuggingEnabled,

            string? remoteDebuggingVersion,

            bool? runtimeScaleMonitoringEnabled,

            string? scmIpRestrictionDefaultAction,

            ImmutableArray<Outputs.WindowsFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions,

            string? scmMinimumTlsVersion,

            string? scmType,

            bool? scmUseMainIpRestriction,

            bool? use32BitWorker,

            bool? vnetRouteAllEnabled,

            bool? websocketsEnabled,

            string? windowsFxVersion,

            int? workerCount)
        {
            AlwaysOn = alwaysOn;
            ApiDefinitionUrl = apiDefinitionUrl;
            ApiManagementApiId = apiManagementApiId;
            AppCommandLine = appCommandLine;
            AppScaleLimit = appScaleLimit;
            AppServiceLogs = appServiceLogs;
            ApplicationInsightsConnectionString = applicationInsightsConnectionString;
            ApplicationInsightsKey = applicationInsightsKey;
            ApplicationStack = applicationStack;
            Cors = cors;
            DefaultDocuments = defaultDocuments;
            DetailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
            ElasticInstanceMinimum = elasticInstanceMinimum;
            FtpsState = ftpsState;
            HealthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
            HealthCheckPath = healthCheckPath;
            Http2Enabled = http2Enabled;
            IpRestrictionDefaultAction = ipRestrictionDefaultAction;
            IpRestrictions = ipRestrictions;
            LoadBalancingMode = loadBalancingMode;
            ManagedPipelineMode = managedPipelineMode;
            MinimumTlsVersion = minimumTlsVersion;
            PreWarmedInstanceCount = preWarmedInstanceCount;
            RemoteDebuggingEnabled = remoteDebuggingEnabled;
            RemoteDebuggingVersion = remoteDebuggingVersion;
            RuntimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            ScmIpRestrictionDefaultAction = scmIpRestrictionDefaultAction;
            ScmIpRestrictions = scmIpRestrictions;
            ScmMinimumTlsVersion = scmMinimumTlsVersion;
            ScmType = scmType;
            ScmUseMainIpRestriction = scmUseMainIpRestriction;
            Use32BitWorker = use32BitWorker;
            VnetRouteAllEnabled = vnetRouteAllEnabled;
            WebsocketsEnabled = websocketsEnabled;
            WindowsFxVersion = windowsFxVersion;
            WorkerCount = workerCount;
        }
    }
}
