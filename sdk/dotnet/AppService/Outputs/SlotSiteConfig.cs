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
    public sealed class SlotSiteConfig
    {
        /// <summary>
        /// Are Managed Identity Credentials used for Azure Container Registry pull
        /// </summary>
        public readonly bool? AcrUseManagedIdentityCredentials;
        /// <summary>
        /// If using User Managed Identity, the User Managed Identity Client Id
        /// 
        /// &gt; **NOTE:** When using User Managed Identity with Azure Container Registry the Identity will need to have the [ACRPull role assigned](https://docs.microsoft.com/azure/container-registry/container-registry-authentication-managed-identity#example-1-access-with-a-user-assigned-identity)
        /// </summary>
        public readonly string? AcrUserManagedIdentityClientId;
        /// <summary>
        /// Should the slot be loaded at all times? Defaults to `false`.
        /// 
        /// &gt; **NOTE:** when using an App Service Plan in the `Free` or `Shared` Tiers `always_on` must be set to `false`.
        /// </summary>
        public readonly bool? AlwaysOn;
        /// <summary>
        /// App command line to launch, e.g. `/sbin/myserver -b 0.0.0.0`.
        /// </summary>
        public readonly string? AppCommandLine;
        /// <summary>
        /// The name of the slot to automatically swap to during deployment
        /// </summary>
        public readonly string? AutoSwapSlotName;
        /// <summary>
        /// A `cors` block as defined below.
        /// </summary>
        public readonly Outputs.SlotSiteConfigCors? Cors;
        /// <summary>
        /// The ordering of default documents to load, if an address isn't specified.
        /// </summary>
        public readonly ImmutableArray<string> DefaultDocuments;
        /// <summary>
        /// The version of the .NET framework's CLR used in this App Service Slot. Possible values are `v2.0` (which will use the latest version of the .NET framework for the .NET CLR v2 - currently `.net 3.5`), `v4.0` (which corresponds to the latest version of the .NET CLR v4 - which at the time of writing is `.net 4.7.1`), `v5.0` and `v6.0`. [For more information on which .NET CLR version to use based on the .NET framework you're targeting - please see this table](https://en.wikipedia.org/wiki/.NET_Framework_version_history#Overview). Defaults to `v4.0`.
        /// </summary>
        public readonly string? DotnetFrameworkVersion;
        /// <summary>
        /// State of FTP / FTPS service for this App Service Slot. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`.
        /// </summary>
        public readonly string? FtpsState;
        /// <summary>
        /// The health check path to be pinged by App Service Slot. [For more information - please see App Service health check announcement](https://azure.github.io/AppService/2020/08/24/healthcheck-on-app-service.html).
        /// </summary>
        public readonly string? HealthCheckPath;
        /// <summary>
        /// Is HTTP2 Enabled on this App Service? Defaults to `false`.
        /// </summary>
        public readonly bool? Http2Enabled;
        /// <summary>
        /// A list of objects representing ip restrictions as defined below.
        /// 
        /// &gt; **NOTE** User has to explicitly set `ip_restriction` to empty slice (`[]`) to remove it.
        /// </summary>
        public readonly ImmutableArray<Outputs.SlotSiteConfigIpRestriction> IpRestrictions;
        /// <summary>
        /// The Java Container to use. If specified `java_version` and `java_container_version` must also be specified. Possible values are `JAVA`, `JETTY`, and `TOMCAT`.
        /// </summary>
        public readonly string? JavaContainer;
        /// <summary>
        /// The version of the Java Container to use. If specified `java_version` and `java_container` must also be specified.
        /// </summary>
        public readonly string? JavaContainerVersion;
        /// <summary>
        /// The version of Java to use. If specified `java_container` and `java_container_version` must also be specified. Possible values are `1.7`, `1.8`, and `11` and their specific versions - except for Java 11 (e.g. `1.7.0_80`, `1.8.0_181`, `11`)
        /// </summary>
        public readonly string? JavaVersion;
        /// <summary>
        /// Linux App Framework and version for the App Service Slot. Possible options are a Docker container (`DOCKER|&lt;user/image:tag&gt;`), a base-64 encoded Docker Compose file (`COMPOSE|${filebase64("compose.yml")}`) or a base-64 encoded Kubernetes Manifest (`KUBE|${filebase64("kubernetes.yml")}`).
        /// 
        /// &gt; **NOTE:** To set this property the App Service Plan to which the App belongs must be configured with `kind = "Linux"`, and `reserved = true` or the API will reject any value supplied.
        /// </summary>
        public readonly string? LinuxFxVersion;
        /// <summary>
        /// Is "MySQL In App" Enabled? This runs a local MySQL instance with your app and shares resources from the App Service plan.
        /// 
        /// &gt; **NOTE:** MySQL In App is not intended for production environments and will not scale beyond a single instance. Instead you may wish to use Azure Database for MySQL.
        /// </summary>
        public readonly bool? LocalMysqlEnabled;
        /// <summary>
        /// The Managed Pipeline Mode. Possible values are `Integrated` and `Classic`. Defaults to `Integrated`.
        /// </summary>
        public readonly string? ManagedPipelineMode;
        /// <summary>
        /// The minimum supported TLS version for the app service. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new app services.
        /// </summary>
        public readonly string? MinTlsVersion;
        /// <summary>
        /// The scaled number of workers (for per site scaling) of this App Service Slot. Requires that `per_site_scaling` is enabled on the `azure.appservice.Plan`. [For more information - please see Microsoft documentation on high-density hosting](https://docs.microsoft.com/azure/app-service/manage-scale-per-app).
        /// </summary>
        public readonly int? NumberOfWorkers;
        /// <summary>
        /// The version of PHP to use in this App Service Slot. Possible values are `5.5`, `5.6`, `7.0`, `7.1`, `7.2`, `7.3`, and `7.4`.
        /// </summary>
        public readonly string? PhpVersion;
        /// <summary>
        /// The version of Python to use in this App Service Slot. Possible values are `2.7` and `3.4`.
        /// </summary>
        public readonly string? PythonVersion;
        /// <summary>
        /// Is Remote Debugging Enabled? Defaults to `false`.
        /// </summary>
        public readonly bool? RemoteDebuggingEnabled;
        /// <summary>
        /// Which version of Visual Studio should the Remote Debugger be compatible with? Currently only `VS2022` is supported.
        /// </summary>
        public readonly string? RemoteDebuggingVersion;
        /// <summary>
        /// A list of `scm_ip_restriction` objects representing IP restrictions as defined below.
        /// 
        /// &gt; **NOTE** User has to explicitly set `scm_ip_restriction` to empty slice (`[]`) to remove it.
        /// </summary>
        public readonly ImmutableArray<Outputs.SlotSiteConfigScmIpRestriction> ScmIpRestrictions;
        /// <summary>
        /// The type of Source Control enabled for this App Service Slot. Defaults to `None`. Possible values are: `BitbucketGit`, `BitbucketHg`, `CodePlexGit`, `CodePlexHg`, `Dropbox`, `ExternalGit`, `ExternalHg`, `GitHub`, `LocalGit`, `None`, `OneDrive`, `Tfs`, `VSO`, and `VSTSRM`
        /// </summary>
        public readonly string? ScmType;
        /// <summary>
        /// IP security restrictions for scm to use main. Defaults to `false`. 
        /// 
        /// &gt; **NOTE** Any `scm_ip_restriction` blocks configured are ignored by the service when `scm_use_main_ip_restriction` is set to `true`. Any scm restrictions will become active if this is subsequently set to `false` or removed.
        /// </summary>
        public readonly bool? ScmUseMainIpRestriction;
        /// <summary>
        /// Should the App Service Slot run in 32 bit mode, rather than 64 bit mode?
        /// 
        /// &gt; **NOTE:** when using an App Service Plan in the `Free` or `Shared` Tiers `use_32_bit_worker_process` must be set to `true`.
        /// </summary>
        public readonly bool? Use32BitWorkerProcess;
        public readonly bool? VnetRouteAllEnabled;
        /// <summary>
        /// Should WebSockets be enabled?
        /// </summary>
        public readonly bool? WebsocketsEnabled;
        /// <summary>
        /// The Windows Docker container image (`DOCKER|&lt;user/image:tag&gt;`)
        /// 
        /// Additional examples of how to run Containers via the `azure.appservice.Slot` resource can be found in the `./examples/app-service` directory within the GitHub Repository.
        /// </summary>
        public readonly string? WindowsFxVersion;

        [OutputConstructor]
        private SlotSiteConfig(
            bool? acrUseManagedIdentityCredentials,

            string? acrUserManagedIdentityClientId,

            bool? alwaysOn,

            string? appCommandLine,

            string? autoSwapSlotName,

            Outputs.SlotSiteConfigCors? cors,

            ImmutableArray<string> defaultDocuments,

            string? dotnetFrameworkVersion,

            string? ftpsState,

            string? healthCheckPath,

            bool? http2Enabled,

            ImmutableArray<Outputs.SlotSiteConfigIpRestriction> ipRestrictions,

            string? javaContainer,

            string? javaContainerVersion,

            string? javaVersion,

            string? linuxFxVersion,

            bool? localMysqlEnabled,

            string? managedPipelineMode,

            string? minTlsVersion,

            int? numberOfWorkers,

            string? phpVersion,

            string? pythonVersion,

            bool? remoteDebuggingEnabled,

            string? remoteDebuggingVersion,

            ImmutableArray<Outputs.SlotSiteConfigScmIpRestriction> scmIpRestrictions,

            string? scmType,

            bool? scmUseMainIpRestriction,

            bool? use32BitWorkerProcess,

            bool? vnetRouteAllEnabled,

            bool? websocketsEnabled,

            string? windowsFxVersion)
        {
            AcrUseManagedIdentityCredentials = acrUseManagedIdentityCredentials;
            AcrUserManagedIdentityClientId = acrUserManagedIdentityClientId;
            AlwaysOn = alwaysOn;
            AppCommandLine = appCommandLine;
            AutoSwapSlotName = autoSwapSlotName;
            Cors = cors;
            DefaultDocuments = defaultDocuments;
            DotnetFrameworkVersion = dotnetFrameworkVersion;
            FtpsState = ftpsState;
            HealthCheckPath = healthCheckPath;
            Http2Enabled = http2Enabled;
            IpRestrictions = ipRestrictions;
            JavaContainer = javaContainer;
            JavaContainerVersion = javaContainerVersion;
            JavaVersion = javaVersion;
            LinuxFxVersion = linuxFxVersion;
            LocalMysqlEnabled = localMysqlEnabled;
            ManagedPipelineMode = managedPipelineMode;
            MinTlsVersion = minTlsVersion;
            NumberOfWorkers = numberOfWorkers;
            PhpVersion = phpVersion;
            PythonVersion = pythonVersion;
            RemoteDebuggingEnabled = remoteDebuggingEnabled;
            RemoteDebuggingVersion = remoteDebuggingVersion;
            ScmIpRestrictions = scmIpRestrictions;
            ScmType = scmType;
            ScmUseMainIpRestriction = scmUseMainIpRestriction;
            Use32BitWorkerProcess = use32BitWorkerProcess;
            VnetRouteAllEnabled = vnetRouteAllEnabled;
            WebsocketsEnabled = websocketsEnabled;
            WindowsFxVersion = windowsFxVersion;
        }
    }
}
