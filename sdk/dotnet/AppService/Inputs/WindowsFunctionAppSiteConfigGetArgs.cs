// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class WindowsFunctionAppSiteConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// If this Windows Function App is Always On enabled. Defaults to `false`.
        /// </summary>
        [Input("alwaysOn")]
        public Input<bool>? AlwaysOn { get; set; }

        /// <summary>
        /// The URL of the API definition that describes this Windows Function App.
        /// </summary>
        [Input("apiDefinitionUrl")]
        public Input<string>? ApiDefinitionUrl { get; set; }

        /// <summary>
        /// The ID of the API Management API for this Windows Function App.
        /// </summary>
        [Input("apiManagementApiId")]
        public Input<string>? ApiManagementApiId { get; set; }

        /// <summary>
        /// The App command line to launch.
        /// </summary>
        [Input("appCommandLine")]
        public Input<string>? AppCommandLine { get; set; }

        /// <summary>
        /// The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
        /// </summary>
        [Input("appScaleLimit")]
        public Input<int>? AppScaleLimit { get; set; }

        /// <summary>
        /// An `app_service_logs` block as defined above.
        /// </summary>
        [Input("appServiceLogs")]
        public Input<Inputs.WindowsFunctionAppSiteConfigAppServiceLogsGetArgs>? AppServiceLogs { get; set; }

        /// <summary>
        /// The Connection String for linking the Windows Function App to Application Insights.
        /// </summary>
        [Input("applicationInsightsConnectionString")]
        public Input<string>? ApplicationInsightsConnectionString { get; set; }

        /// <summary>
        /// The Instrumentation Key for connecting the Windows Function App to Application Insights.
        /// </summary>
        [Input("applicationInsightsKey")]
        public Input<string>? ApplicationInsightsKey { get; set; }

        /// <summary>
        /// An `application_stack` block as defined above.
        /// </summary>
        [Input("applicationStack")]
        public Input<Inputs.WindowsFunctionAppSiteConfigApplicationStackGetArgs>? ApplicationStack { get; set; }

        /// <summary>
        /// A `cors` block as defined above.
        /// </summary>
        [Input("cors")]
        public Input<Inputs.WindowsFunctionAppSiteConfigCorsGetArgs>? Cors { get; set; }

        [Input("defaultDocuments")]
        private InputList<string>? _defaultDocuments;

        /// <summary>
        /// Specifies a list of Default Documents for the Windows Function App.
        /// </summary>
        public InputList<string> DefaultDocuments
        {
            get => _defaultDocuments ?? (_defaultDocuments = new InputList<string>());
            set => _defaultDocuments = value;
        }

        [Input("detailedErrorLoggingEnabled")]
        public Input<bool>? DetailedErrorLoggingEnabled { get; set; }

        /// <summary>
        /// The number of minimum instances for this Windows Function App. Only affects apps on Elastic Premium plans.
        /// </summary>
        [Input("elasticInstanceMinimum")]
        public Input<int>? ElasticInstanceMinimum { get; set; }

        /// <summary>
        /// State of FTP / FTPS service for this Windows Function App. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `Disabled`.
        /// </summary>
        [Input("ftpsState")]
        public Input<string>? FtpsState { get; set; }

        /// <summary>
        /// The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
        /// </summary>
        [Input("healthCheckEvictionTimeInMin")]
        public Input<int>? HealthCheckEvictionTimeInMin { get; set; }

        /// <summary>
        /// The path to be checked for this Windows Function App health.
        /// </summary>
        [Input("healthCheckPath")]
        public Input<string>? HealthCheckPath { get; set; }

        /// <summary>
        /// Specifies if the HTTP2 protocol should be enabled. Defaults to `false`.
        /// </summary>
        [Input("http2Enabled")]
        public Input<bool>? Http2Enabled { get; set; }

        [Input("ipRestrictions")]
        private InputList<Inputs.WindowsFunctionAppSiteConfigIpRestrictionGetArgs>? _ipRestrictions;

        /// <summary>
        /// One or more `ip_restriction` blocks as defined above.
        /// </summary>
        public InputList<Inputs.WindowsFunctionAppSiteConfigIpRestrictionGetArgs> IpRestrictions
        {
            get => _ipRestrictions ?? (_ipRestrictions = new InputList<Inputs.WindowsFunctionAppSiteConfigIpRestrictionGetArgs>());
            set => _ipRestrictions = value;
        }

        /// <summary>
        /// The Site load balancing mode. Possible values include: `WeightedRoundRobin`, `LeastRequests`, `LeastResponseTime`, `WeightedTotalTraffic`, `RequestHash`, `PerSiteRoundRobin`. Defaults to `LeastRequests` if omitted.
        /// </summary>
        [Input("loadBalancingMode")]
        public Input<string>? LoadBalancingMode { get; set; }

        /// <summary>
        /// Managed pipeline mode. Possible values include: `Integrated`, `Classic`. Defaults to `Integrated`.
        /// </summary>
        [Input("managedPipelineMode")]
        public Input<string>? ManagedPipelineMode { get; set; }

        /// <summary>
        /// Configures the minimum version of TLS required for SSL requests. Possible values include: `1.0`, `1.1`, and  `1.2`. Defaults to `1.2`.
        /// </summary>
        [Input("minimumTlsVersion")]
        public Input<string>? MinimumTlsVersion { get; set; }

        /// <summary>
        /// The number of pre-warmed instances for this Windows Function App. Only affects apps on an Elastic Premium plan.
        /// </summary>
        [Input("preWarmedInstanceCount")]
        public Input<int>? PreWarmedInstanceCount { get; set; }

        /// <summary>
        /// Should Remote Debugging be enabled. Defaults to `false`.
        /// </summary>
        [Input("remoteDebuggingEnabled")]
        public Input<bool>? RemoteDebuggingEnabled { get; set; }

        /// <summary>
        /// The Remote Debugging Version. Possible values include `VS2017` and `VS2019`.
        /// </summary>
        [Input("remoteDebuggingVersion")]
        public Input<string>? RemoteDebuggingVersion { get; set; }

        /// <summary>
        /// Should Scale Monitoring of the Functions Runtime be enabled?
        /// </summary>
        [Input("runtimeScaleMonitoringEnabled")]
        public Input<bool>? RuntimeScaleMonitoringEnabled { get; set; }

        [Input("scmIpRestrictions")]
        private InputList<Inputs.WindowsFunctionAppSiteConfigScmIpRestrictionGetArgs>? _scmIpRestrictions;

        /// <summary>
        /// One or more `scm_ip_restriction` blocks as defined above.
        /// </summary>
        public InputList<Inputs.WindowsFunctionAppSiteConfigScmIpRestrictionGetArgs> ScmIpRestrictions
        {
            get => _scmIpRestrictions ?? (_scmIpRestrictions = new InputList<Inputs.WindowsFunctionAppSiteConfigScmIpRestrictionGetArgs>());
            set => _scmIpRestrictions = value;
        }

        /// <summary>
        /// Configures the minimum version of TLS required for SSL requests to the SCM site. Possible values include: `1.0`, `1.1`, and  `1.2`. Defaults to `1.2`.
        /// </summary>
        [Input("scmMinimumTlsVersion")]
        public Input<string>? ScmMinimumTlsVersion { get; set; }

        [Input("scmType")]
        public Input<string>? ScmType { get; set; }

        /// <summary>
        /// Should the Windows Function App `ip_restriction` configuration be used for the SCM also.
        /// </summary>
        [Input("scmUseMainIpRestriction")]
        public Input<bool>? ScmUseMainIpRestriction { get; set; }

        /// <summary>
        /// Should the Windows Function App use a 32-bit worker process. Defaults to `true`.
        /// </summary>
        [Input("use32BitWorker")]
        public Input<bool>? Use32BitWorker { get; set; }

        /// <summary>
        /// Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied? Defaults to `false`.
        /// </summary>
        [Input("vnetRouteAllEnabled")]
        public Input<bool>? VnetRouteAllEnabled { get; set; }

        /// <summary>
        /// Should Web Sockets be enabled. Defaults to `false`.
        /// </summary>
        [Input("websocketsEnabled")]
        public Input<bool>? WebsocketsEnabled { get; set; }

        [Input("windowsFxVersion")]
        public Input<string>? WindowsFxVersion { get; set; }

        /// <summary>
        /// The number of Workers for this Windows Function App.
        /// </summary>
        [Input("workerCount")]
        public Input<int>? WorkerCount { get; set; }

        public WindowsFunctionAppSiteConfigGetArgs()
        {
        }
    }
}