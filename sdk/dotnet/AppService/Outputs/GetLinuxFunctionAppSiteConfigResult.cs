// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetLinuxFunctionAppSiteConfigResult
    {
        /// <summary>
        /// If this Linux Web App is Always On enabled.
        /// </summary>
        public readonly bool AlwaysOn;
        /// <summary>
        /// The URL of the API definition that describes this Linux Function App.
        /// </summary>
        public readonly string ApiDefinitionUrl;
        /// <summary>
        /// The ID of the API Management API for this Linux Function App.
        /// </summary>
        public readonly string ApiManagementApiId;
        /// <summary>
        /// The App command line that is launched.
        /// </summary>
        public readonly string AppCommandLine;
        /// <summary>
        /// The number of workers this function app can scale out to.
        /// </summary>
        public readonly int AppScaleLimit;
        /// <summary>
        /// An `app_service_logs` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigAppServiceLogResult> AppServiceLogs;
        /// <summary>
        /// The Connection String that links the Linux Function App to Application Insights.
        /// </summary>
        public readonly string ApplicationInsightsConnectionString;
        /// <summary>
        /// The Instrumentation Key that connects the Linux Function App to Application Insights.
        /// </summary>
        public readonly string ApplicationInsightsKey;
        /// <summary>
        /// An `application_stack` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigApplicationStackResult> ApplicationStacks;
        /// <summary>
        /// The Client ID of the Managed Service Identity that is used for connections to the Azure Container Registry.
        /// </summary>
        public readonly string ContainerRegistryManagedIdentityClientId;
        /// <summary>
        /// Do connections for Azure Container Registry use Managed Identity?
        /// </summary>
        public readonly bool ContainerRegistryUseManagedIdentity;
        /// <summary>
        /// A `cors` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigCorResult> Cors;
        /// <summary>
        /// A list of Default Documents for the Linux Web App.
        /// </summary>
        public readonly ImmutableArray<string> DefaultDocuments;
        public readonly bool DetailedErrorLoggingEnabled;
        /// <summary>
        /// The number of minimum instances for this Linux Function App.
        /// </summary>
        public readonly int ElasticInstanceMinimum;
        /// <summary>
        /// State of FTP / FTPS service for this function app.
        /// </summary>
        public readonly string FtpsState;
        /// <summary>
        /// The amount of time in minutes that a node can be unhealthy before being removed from the load balancer.
        /// </summary>
        public readonly int HealthCheckEvictionTimeInMin;
        /// <summary>
        /// The path that is checked for this function app health.
        /// </summary>
        public readonly string HealthCheckPath;
        /// <summary>
        /// Is the HTTP2 protocol enabled?
        /// </summary>
        public readonly bool Http2Enabled;
        /// <summary>
        /// One or more `ip_restriction` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigIpRestrictionResult> IpRestrictions;
        public readonly string LinuxFxVersion;
        /// <summary>
        /// The Site load balancing mode.
        /// </summary>
        public readonly string LoadBalancingMode;
        /// <summary>
        /// Managed pipeline mode.
        /// </summary>
        public readonly string ManagedPipelineMode;
        /// <summary>
        /// The minimum version of TLS required for SSL requests.
        /// </summary>
        public readonly string MinimumTlsVersion;
        /// <summary>
        /// The number of pre-warmed instances for this function app.
        /// </summary>
        public readonly int PreWarmedInstanceCount;
        /// <summary>
        /// Is Remote Debugging enabled?
        /// </summary>
        public readonly bool RemoteDebuggingEnabled;
        /// <summary>
        /// The Remote Debugging Version.
        /// </summary>
        public readonly string RemoteDebuggingVersion;
        /// <summary>
        /// Is Scale Monitoring of the Functions Runtime enabled?
        /// </summary>
        public readonly bool RuntimeScaleMonitoringEnabled;
        /// <summary>
        /// One or more `scm_ip_restriction` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigScmIpRestrictionResult> ScmIpRestrictions;
        /// <summary>
        /// The minimum version of TLS for SSL requests to the SCM site.
        /// </summary>
        public readonly string ScmMinimumTlsVersion;
        public readonly string ScmType;
        /// <summary>
        /// Is the Linux Function App `ip_restriction` configuration used for the SCM also?
        /// </summary>
        public readonly bool ScmUseMainIpRestriction;
        /// <summary>
        /// Does the Linux Web App use a 32-bit worker process?
        /// </summary>
        public readonly bool Use32BitWorker;
        /// <summary>
        /// Does all outbound traffic have Virtual Network Security Groups and User Defined Routes applied?
        /// </summary>
        public readonly bool VnetRouteAllEnabled;
        /// <summary>
        /// Are Web Sockets enabled?
        /// </summary>
        public readonly bool WebsocketsEnabled;
        /// <summary>
        /// The number of Workers for this Linux Function App.
        /// </summary>
        public readonly int WorkerCount;

        [OutputConstructor]
        private GetLinuxFunctionAppSiteConfigResult(
            bool alwaysOn,

            string apiDefinitionUrl,

            string apiManagementApiId,

            string appCommandLine,

            int appScaleLimit,

            ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigAppServiceLogResult> appServiceLogs,

            string applicationInsightsConnectionString,

            string applicationInsightsKey,

            ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigApplicationStackResult> applicationStacks,

            string containerRegistryManagedIdentityClientId,

            bool containerRegistryUseManagedIdentity,

            ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigCorResult> cors,

            ImmutableArray<string> defaultDocuments,

            bool detailedErrorLoggingEnabled,

            int elasticInstanceMinimum,

            string ftpsState,

            int healthCheckEvictionTimeInMin,

            string healthCheckPath,

            bool http2Enabled,

            ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigIpRestrictionResult> ipRestrictions,

            string linuxFxVersion,

            string loadBalancingMode,

            string managedPipelineMode,

            string minimumTlsVersion,

            int preWarmedInstanceCount,

            bool remoteDebuggingEnabled,

            string remoteDebuggingVersion,

            bool runtimeScaleMonitoringEnabled,

            ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigScmIpRestrictionResult> scmIpRestrictions,

            string scmMinimumTlsVersion,

            string scmType,

            bool scmUseMainIpRestriction,

            bool use32BitWorker,

            bool vnetRouteAllEnabled,

            bool websocketsEnabled,

            int workerCount)
        {
            AlwaysOn = alwaysOn;
            ApiDefinitionUrl = apiDefinitionUrl;
            ApiManagementApiId = apiManagementApiId;
            AppCommandLine = appCommandLine;
            AppScaleLimit = appScaleLimit;
            AppServiceLogs = appServiceLogs;
            ApplicationInsightsConnectionString = applicationInsightsConnectionString;
            ApplicationInsightsKey = applicationInsightsKey;
            ApplicationStacks = applicationStacks;
            ContainerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
            ContainerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
            Cors = cors;
            DefaultDocuments = defaultDocuments;
            DetailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
            ElasticInstanceMinimum = elasticInstanceMinimum;
            FtpsState = ftpsState;
            HealthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
            HealthCheckPath = healthCheckPath;
            Http2Enabled = http2Enabled;
            IpRestrictions = ipRestrictions;
            LinuxFxVersion = linuxFxVersion;
            LoadBalancingMode = loadBalancingMode;
            ManagedPipelineMode = managedPipelineMode;
            MinimumTlsVersion = minimumTlsVersion;
            PreWarmedInstanceCount = preWarmedInstanceCount;
            RemoteDebuggingEnabled = remoteDebuggingEnabled;
            RemoteDebuggingVersion = remoteDebuggingVersion;
            RuntimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            ScmIpRestrictions = scmIpRestrictions;
            ScmMinimumTlsVersion = scmMinimumTlsVersion;
            ScmType = scmType;
            ScmUseMainIpRestriction = scmUseMainIpRestriction;
            Use32BitWorker = use32BitWorker;
            VnetRouteAllEnabled = vnetRouteAllEnabled;
            WebsocketsEnabled = websocketsEnabled;
            WorkerCount = workerCount;
        }
    }
}