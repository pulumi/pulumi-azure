// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigApplicationStack;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSetting;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigCors;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigHandlerMapping;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigScmIpRestriction;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigVirtualApplication;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfig {
    /**
     * @return If this Windows Web App Slot is Always On enabled. Defaults to `true`.
     * 
     */
    private @Nullable Boolean alwaysOn;
    /**
     * @return The URL to the API Definition for this Windows Web App Slot.
     * 
     */
    private @Nullable String apiDefinitionUrl;
    /**
     * @return The API Management API ID this Windows Web App Slot os associated with.
     * 
     */
    private @Nullable String apiManagementApiId;
    /**
     * @return The App command line to launch.
     * 
     */
    private @Nullable String appCommandLine;
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppSlotSiteConfigApplicationStack applicationStack;
    /**
     * @return A `auto_heal_setting` block as defined above. Required with `auto_heal`.
     * 
     */
    private @Nullable WindowsWebAppSlotSiteConfigAutoHealSetting autoHealSetting;
    /**
     * @return The Windows Web App Slot Name to automatically swap to when deployment to that slot is successfully completed.
     * 
     * &gt; **Note:** This must be a valid slot name on the target Windows Web App Slot.
     * 
     */
    private @Nullable String autoSwapSlotName;
    /**
     * @return The Client ID of the Managed Service Identity to use for connections to the Azure Container Registry.
     * 
     */
    private @Nullable String containerRegistryManagedIdentityClientId;
    /**
     * @return Should connections for Azure Container Registry use Managed Identity.
     * 
     */
    private @Nullable Boolean containerRegistryUseManagedIdentity;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppSlotSiteConfigCors cors;
    /**
     * @return Specifies a list of Default Documents for the Windows Web App Slot.
     * 
     */
    private @Nullable List<String> defaultDocuments;
    private @Nullable Boolean detailedErrorLoggingEnabled;
    private @Nullable String ftpsState;
    /**
     * @return One or more `handler_mapping` blocks as defined below.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigHandlerMapping> handlerMappings;
    /**
     * @return The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    private @Nullable Integer healthCheckEvictionTimeInMin;
    /**
     * @return The path to the Health Check.
     * 
     */
    private @Nullable String healthCheckPath;
    /**
     * @return Should the HTTP2 be enabled?
     * 
     */
    private @Nullable Boolean http2Enabled;
    /**
     * @return The Default action for traffic that does not match any `ip_restriction` rule. possible values include `Allow` and `Deny`. Defaults to `Allow`.
     * 
     */
    private @Nullable String ipRestrictionDefaultAction;
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return The Site load balancing. Possible values include: `WeightedRoundRobin`, `LeastRequests`, `LeastResponseTime`, `WeightedTotalTraffic`, `RequestHash`, `PerSiteRoundRobin`. Defaults to `LeastRequests` if omitted.
     * 
     */
    private @Nullable String loadBalancingMode;
    /**
     * @return Use Local MySQL. Defaults to `false`.
     * 
     */
    private @Nullable Boolean localMysqlEnabled;
    /**
     * @return Managed pipeline mode. Possible values include: `Integrated`, `Classic`. Defaults to `Integrated`.
     * 
     */
    private @Nullable String managedPipelineMode;
    /**
     * @return The configures the minimum version of TLS required for SSL requests. Possible values include: `1.0`, `1.1`, and `1.2`. Defaults to `1.2`.
     * 
     */
    private @Nullable String minimumTlsVersion;
    /**
     * @return Should Remote Debugging be enabled. Defaults to `false`.
     * 
     */
    private @Nullable Boolean remoteDebuggingEnabled;
    /**
     * @return The Remote Debugging Version. Currently only `VS2022` is supported.
     * 
     */
    private @Nullable String remoteDebuggingVersion;
    /**
     * @return The Default action for traffic that does not match any `scm_ip_restriction` rule. possible values include `Allow` and `Deny`. Defaults to `Allow`.
     * 
     */
    private @Nullable String scmIpRestrictionDefaultAction;
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return The configures the minimum version of TLS required for SSL requests to the SCM site Possible values include: `1.0`, `1.1`, and `1.2`. Defaults to `1.2`.
     * 
     */
    private @Nullable String scmMinimumTlsVersion;
    private @Nullable String scmType;
    /**
     * @return Should the Windows Web App Slot `ip_restriction` configuration be used for the SCM also.
     * 
     */
    private @Nullable Boolean scmUseMainIpRestriction;
    /**
     * @return Should the Windows Web App Slot use a 32-bit worker. The default value varies from different service plans.
     * 
     */
    private @Nullable Boolean use32BitWorker;
    /**
     * @return One or more `virtual_application` blocks as defined below.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigVirtualApplication> virtualApplications;
    /**
     * @return Should all outbound traffic to have NAT Gateways, Network Security Groups and User Defined Routes applied? Defaults to `false`.
     * 
     */
    private @Nullable Boolean vnetRouteAllEnabled;
    /**
     * @return Should Web Sockets be enabled. Defaults to `false`.
     * 
     */
    private @Nullable Boolean websocketsEnabled;
    private @Nullable String windowsFxVersion;
    /**
     * @return The number of Workers for this Windows App Service Slot.
     * 
     */
    private @Nullable Integer workerCount;

    private WindowsWebAppSlotSiteConfig() {}
    /**
     * @return If this Windows Web App Slot is Always On enabled. Defaults to `true`.
     * 
     */
    public Optional<Boolean> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }
    /**
     * @return The URL to the API Definition for this Windows Web App Slot.
     * 
     */
    public Optional<String> apiDefinitionUrl() {
        return Optional.ofNullable(this.apiDefinitionUrl);
    }
    /**
     * @return The API Management API ID this Windows Web App Slot os associated with.
     * 
     */
    public Optional<String> apiManagementApiId() {
        return Optional.ofNullable(this.apiManagementApiId);
    }
    /**
     * @return The App command line to launch.
     * 
     */
    public Optional<String> appCommandLine() {
        return Optional.ofNullable(this.appCommandLine);
    }
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotSiteConfigApplicationStack> applicationStack() {
        return Optional.ofNullable(this.applicationStack);
    }
    /**
     * @return A `auto_heal_setting` block as defined above. Required with `auto_heal`.
     * 
     */
    public Optional<WindowsWebAppSlotSiteConfigAutoHealSetting> autoHealSetting() {
        return Optional.ofNullable(this.autoHealSetting);
    }
    /**
     * @return The Windows Web App Slot Name to automatically swap to when deployment to that slot is successfully completed.
     * 
     * &gt; **Note:** This must be a valid slot name on the target Windows Web App Slot.
     * 
     */
    public Optional<String> autoSwapSlotName() {
        return Optional.ofNullable(this.autoSwapSlotName);
    }
    /**
     * @return The Client ID of the Managed Service Identity to use for connections to the Azure Container Registry.
     * 
     */
    public Optional<String> containerRegistryManagedIdentityClientId() {
        return Optional.ofNullable(this.containerRegistryManagedIdentityClientId);
    }
    /**
     * @return Should connections for Azure Container Registry use Managed Identity.
     * 
     */
    public Optional<Boolean> containerRegistryUseManagedIdentity() {
        return Optional.ofNullable(this.containerRegistryUseManagedIdentity);
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotSiteConfigCors> cors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * @return Specifies a list of Default Documents for the Windows Web App Slot.
     * 
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments == null ? List.of() : this.defaultDocuments;
    }
    public Optional<Boolean> detailedErrorLoggingEnabled() {
        return Optional.ofNullable(this.detailedErrorLoggingEnabled);
    }
    public Optional<String> ftpsState() {
        return Optional.ofNullable(this.ftpsState);
    }
    /**
     * @return One or more `handler_mapping` blocks as defined below.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigHandlerMapping> handlerMappings() {
        return this.handlerMappings == null ? List.of() : this.handlerMappings;
    }
    /**
     * @return The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    public Optional<Integer> healthCheckEvictionTimeInMin() {
        return Optional.ofNullable(this.healthCheckEvictionTimeInMin);
    }
    /**
     * @return The path to the Health Check.
     * 
     */
    public Optional<String> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }
    /**
     * @return Should the HTTP2 be enabled?
     * 
     */
    public Optional<Boolean> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }
    /**
     * @return The Default action for traffic that does not match any `ip_restriction` rule. possible values include `Allow` and `Deny`. Defaults to `Allow`.
     * 
     */
    public Optional<String> ipRestrictionDefaultAction() {
        return Optional.ofNullable(this.ipRestrictionDefaultAction);
    }
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions == null ? List.of() : this.ipRestrictions;
    }
    /**
     * @return The Site load balancing. Possible values include: `WeightedRoundRobin`, `LeastRequests`, `LeastResponseTime`, `WeightedTotalTraffic`, `RequestHash`, `PerSiteRoundRobin`. Defaults to `LeastRequests` if omitted.
     * 
     */
    public Optional<String> loadBalancingMode() {
        return Optional.ofNullable(this.loadBalancingMode);
    }
    /**
     * @return Use Local MySQL. Defaults to `false`.
     * 
     */
    public Optional<Boolean> localMysqlEnabled() {
        return Optional.ofNullable(this.localMysqlEnabled);
    }
    /**
     * @return Managed pipeline mode. Possible values include: `Integrated`, `Classic`. Defaults to `Integrated`.
     * 
     */
    public Optional<String> managedPipelineMode() {
        return Optional.ofNullable(this.managedPipelineMode);
    }
    /**
     * @return The configures the minimum version of TLS required for SSL requests. Possible values include: `1.0`, `1.1`, and `1.2`. Defaults to `1.2`.
     * 
     */
    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * @return Should Remote Debugging be enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> remoteDebuggingEnabled() {
        return Optional.ofNullable(this.remoteDebuggingEnabled);
    }
    /**
     * @return The Remote Debugging Version. Currently only `VS2022` is supported.
     * 
     */
    public Optional<String> remoteDebuggingVersion() {
        return Optional.ofNullable(this.remoteDebuggingVersion);
    }
    /**
     * @return The Default action for traffic that does not match any `scm_ip_restriction` rule. possible values include `Allow` and `Deny`. Defaults to `Allow`.
     * 
     */
    public Optional<String> scmIpRestrictionDefaultAction() {
        return Optional.ofNullable(this.scmIpRestrictionDefaultAction);
    }
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions == null ? List.of() : this.scmIpRestrictions;
    }
    /**
     * @return The configures the minimum version of TLS required for SSL requests to the SCM site Possible values include: `1.0`, `1.1`, and `1.2`. Defaults to `1.2`.
     * 
     */
    public Optional<String> scmMinimumTlsVersion() {
        return Optional.ofNullable(this.scmMinimumTlsVersion);
    }
    public Optional<String> scmType() {
        return Optional.ofNullable(this.scmType);
    }
    /**
     * @return Should the Windows Web App Slot `ip_restriction` configuration be used for the SCM also.
     * 
     */
    public Optional<Boolean> scmUseMainIpRestriction() {
        return Optional.ofNullable(this.scmUseMainIpRestriction);
    }
    /**
     * @return Should the Windows Web App Slot use a 32-bit worker. The default value varies from different service plans.
     * 
     */
    public Optional<Boolean> use32BitWorker() {
        return Optional.ofNullable(this.use32BitWorker);
    }
    /**
     * @return One or more `virtual_application` blocks as defined below.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigVirtualApplication> virtualApplications() {
        return this.virtualApplications == null ? List.of() : this.virtualApplications;
    }
    /**
     * @return Should all outbound traffic to have NAT Gateways, Network Security Groups and User Defined Routes applied? Defaults to `false`.
     * 
     */
    public Optional<Boolean> vnetRouteAllEnabled() {
        return Optional.ofNullable(this.vnetRouteAllEnabled);
    }
    /**
     * @return Should Web Sockets be enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }
    public Optional<String> windowsFxVersion() {
        return Optional.ofNullable(this.windowsFxVersion);
    }
    /**
     * @return The number of Workers for this Windows App Service Slot.
     * 
     */
    public Optional<Integer> workerCount() {
        return Optional.ofNullable(this.workerCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alwaysOn;
        private @Nullable String apiDefinitionUrl;
        private @Nullable String apiManagementApiId;
        private @Nullable String appCommandLine;
        private @Nullable WindowsWebAppSlotSiteConfigApplicationStack applicationStack;
        private @Nullable WindowsWebAppSlotSiteConfigAutoHealSetting autoHealSetting;
        private @Nullable String autoSwapSlotName;
        private @Nullable String containerRegistryManagedIdentityClientId;
        private @Nullable Boolean containerRegistryUseManagedIdentity;
        private @Nullable WindowsWebAppSlotSiteConfigCors cors;
        private @Nullable List<String> defaultDocuments;
        private @Nullable Boolean detailedErrorLoggingEnabled;
        private @Nullable String ftpsState;
        private @Nullable List<WindowsWebAppSlotSiteConfigHandlerMapping> handlerMappings;
        private @Nullable Integer healthCheckEvictionTimeInMin;
        private @Nullable String healthCheckPath;
        private @Nullable Boolean http2Enabled;
        private @Nullable String ipRestrictionDefaultAction;
        private @Nullable List<WindowsWebAppSlotSiteConfigIpRestriction> ipRestrictions;
        private @Nullable String loadBalancingMode;
        private @Nullable Boolean localMysqlEnabled;
        private @Nullable String managedPipelineMode;
        private @Nullable String minimumTlsVersion;
        private @Nullable Boolean remoteDebuggingEnabled;
        private @Nullable String remoteDebuggingVersion;
        private @Nullable String scmIpRestrictionDefaultAction;
        private @Nullable List<WindowsWebAppSlotSiteConfigScmIpRestriction> scmIpRestrictions;
        private @Nullable String scmMinimumTlsVersion;
        private @Nullable String scmType;
        private @Nullable Boolean scmUseMainIpRestriction;
        private @Nullable Boolean use32BitWorker;
        private @Nullable List<WindowsWebAppSlotSiteConfigVirtualApplication> virtualApplications;
        private @Nullable Boolean vnetRouteAllEnabled;
        private @Nullable Boolean websocketsEnabled;
        private @Nullable String windowsFxVersion;
        private @Nullable Integer workerCount;
        public Builder() {}
        public Builder(WindowsWebAppSlotSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.apiDefinitionUrl = defaults.apiDefinitionUrl;
    	      this.apiManagementApiId = defaults.apiManagementApiId;
    	      this.appCommandLine = defaults.appCommandLine;
    	      this.applicationStack = defaults.applicationStack;
    	      this.autoHealSetting = defaults.autoHealSetting;
    	      this.autoSwapSlotName = defaults.autoSwapSlotName;
    	      this.containerRegistryManagedIdentityClientId = defaults.containerRegistryManagedIdentityClientId;
    	      this.containerRegistryUseManagedIdentity = defaults.containerRegistryUseManagedIdentity;
    	      this.cors = defaults.cors;
    	      this.defaultDocuments = defaults.defaultDocuments;
    	      this.detailedErrorLoggingEnabled = defaults.detailedErrorLoggingEnabled;
    	      this.ftpsState = defaults.ftpsState;
    	      this.handlerMappings = defaults.handlerMappings;
    	      this.healthCheckEvictionTimeInMin = defaults.healthCheckEvictionTimeInMin;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictionDefaultAction = defaults.ipRestrictionDefaultAction;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.loadBalancingMode = defaults.loadBalancingMode;
    	      this.localMysqlEnabled = defaults.localMysqlEnabled;
    	      this.managedPipelineMode = defaults.managedPipelineMode;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.remoteDebuggingEnabled = defaults.remoteDebuggingEnabled;
    	      this.remoteDebuggingVersion = defaults.remoteDebuggingVersion;
    	      this.scmIpRestrictionDefaultAction = defaults.scmIpRestrictionDefaultAction;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmMinimumTlsVersion = defaults.scmMinimumTlsVersion;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorker = defaults.use32BitWorker;
    	      this.virtualApplications = defaults.virtualApplications;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
    	      this.windowsFxVersion = defaults.windowsFxVersion;
    	      this.workerCount = defaults.workerCount;
        }

        @CustomType.Setter
        public Builder alwaysOn(@Nullable Boolean alwaysOn) {

            this.alwaysOn = alwaysOn;
            return this;
        }
        @CustomType.Setter
        public Builder apiDefinitionUrl(@Nullable String apiDefinitionUrl) {

            this.apiDefinitionUrl = apiDefinitionUrl;
            return this;
        }
        @CustomType.Setter
        public Builder apiManagementApiId(@Nullable String apiManagementApiId) {

            this.apiManagementApiId = apiManagementApiId;
            return this;
        }
        @CustomType.Setter
        public Builder appCommandLine(@Nullable String appCommandLine) {

            this.appCommandLine = appCommandLine;
            return this;
        }
        @CustomType.Setter
        public Builder applicationStack(@Nullable WindowsWebAppSlotSiteConfigApplicationStack applicationStack) {

            this.applicationStack = applicationStack;
            return this;
        }
        @CustomType.Setter
        public Builder autoHealSetting(@Nullable WindowsWebAppSlotSiteConfigAutoHealSetting autoHealSetting) {

            this.autoHealSetting = autoHealSetting;
            return this;
        }
        @CustomType.Setter
        public Builder autoSwapSlotName(@Nullable String autoSwapSlotName) {

            this.autoSwapSlotName = autoSwapSlotName;
            return this;
        }
        @CustomType.Setter
        public Builder containerRegistryManagedIdentityClientId(@Nullable String containerRegistryManagedIdentityClientId) {

            this.containerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
            return this;
        }
        @CustomType.Setter
        public Builder containerRegistryUseManagedIdentity(@Nullable Boolean containerRegistryUseManagedIdentity) {

            this.containerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
            return this;
        }
        @CustomType.Setter
        public Builder cors(@Nullable WindowsWebAppSlotSiteConfigCors cors) {

            this.cors = cors;
            return this;
        }
        @CustomType.Setter
        public Builder defaultDocuments(@Nullable List<String> defaultDocuments) {

            this.defaultDocuments = defaultDocuments;
            return this;
        }
        public Builder defaultDocuments(String... defaultDocuments) {
            return defaultDocuments(List.of(defaultDocuments));
        }
        @CustomType.Setter
        public Builder detailedErrorLoggingEnabled(@Nullable Boolean detailedErrorLoggingEnabled) {

            this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder ftpsState(@Nullable String ftpsState) {

            this.ftpsState = ftpsState;
            return this;
        }
        @CustomType.Setter
        public Builder handlerMappings(@Nullable List<WindowsWebAppSlotSiteConfigHandlerMapping> handlerMappings) {

            this.handlerMappings = handlerMappings;
            return this;
        }
        public Builder handlerMappings(WindowsWebAppSlotSiteConfigHandlerMapping... handlerMappings) {
            return handlerMappings(List.of(handlerMappings));
        }
        @CustomType.Setter
        public Builder healthCheckEvictionTimeInMin(@Nullable Integer healthCheckEvictionTimeInMin) {

            this.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckPath(@Nullable String healthCheckPath) {

            this.healthCheckPath = healthCheckPath;
            return this;
        }
        @CustomType.Setter
        public Builder http2Enabled(@Nullable Boolean http2Enabled) {

            this.http2Enabled = http2Enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ipRestrictionDefaultAction(@Nullable String ipRestrictionDefaultAction) {

            this.ipRestrictionDefaultAction = ipRestrictionDefaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder ipRestrictions(@Nullable List<WindowsWebAppSlotSiteConfigIpRestriction> ipRestrictions) {

            this.ipRestrictions = ipRestrictions;
            return this;
        }
        public Builder ipRestrictions(WindowsWebAppSlotSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        @CustomType.Setter
        public Builder loadBalancingMode(@Nullable String loadBalancingMode) {

            this.loadBalancingMode = loadBalancingMode;
            return this;
        }
        @CustomType.Setter
        public Builder localMysqlEnabled(@Nullable Boolean localMysqlEnabled) {

            this.localMysqlEnabled = localMysqlEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder managedPipelineMode(@Nullable String managedPipelineMode) {

            this.managedPipelineMode = managedPipelineMode;
            return this;
        }
        @CustomType.Setter
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {

            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDebuggingEnabled(@Nullable Boolean remoteDebuggingEnabled) {

            this.remoteDebuggingEnabled = remoteDebuggingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDebuggingVersion(@Nullable String remoteDebuggingVersion) {

            this.remoteDebuggingVersion = remoteDebuggingVersion;
            return this;
        }
        @CustomType.Setter
        public Builder scmIpRestrictionDefaultAction(@Nullable String scmIpRestrictionDefaultAction) {

            this.scmIpRestrictionDefaultAction = scmIpRestrictionDefaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder scmIpRestrictions(@Nullable List<WindowsWebAppSlotSiteConfigScmIpRestriction> scmIpRestrictions) {

            this.scmIpRestrictions = scmIpRestrictions;
            return this;
        }
        public Builder scmIpRestrictions(WindowsWebAppSlotSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        @CustomType.Setter
        public Builder scmMinimumTlsVersion(@Nullable String scmMinimumTlsVersion) {

            this.scmMinimumTlsVersion = scmMinimumTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder scmType(@Nullable String scmType) {

            this.scmType = scmType;
            return this;
        }
        @CustomType.Setter
        public Builder scmUseMainIpRestriction(@Nullable Boolean scmUseMainIpRestriction) {

            this.scmUseMainIpRestriction = scmUseMainIpRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder use32BitWorker(@Nullable Boolean use32BitWorker) {

            this.use32BitWorker = use32BitWorker;
            return this;
        }
        @CustomType.Setter
        public Builder virtualApplications(@Nullable List<WindowsWebAppSlotSiteConfigVirtualApplication> virtualApplications) {

            this.virtualApplications = virtualApplications;
            return this;
        }
        public Builder virtualApplications(WindowsWebAppSlotSiteConfigVirtualApplication... virtualApplications) {
            return virtualApplications(List.of(virtualApplications));
        }
        @CustomType.Setter
        public Builder vnetRouteAllEnabled(@Nullable Boolean vnetRouteAllEnabled) {

            this.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder websocketsEnabled(@Nullable Boolean websocketsEnabled) {

            this.websocketsEnabled = websocketsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder windowsFxVersion(@Nullable String windowsFxVersion) {

            this.windowsFxVersion = windowsFxVersion;
            return this;
        }
        @CustomType.Setter
        public Builder workerCount(@Nullable Integer workerCount) {

            this.workerCount = workerCount;
            return this;
        }
        public WindowsWebAppSlotSiteConfig build() {
            final var _resultValue = new WindowsWebAppSlotSiteConfig();
            _resultValue.alwaysOn = alwaysOn;
            _resultValue.apiDefinitionUrl = apiDefinitionUrl;
            _resultValue.apiManagementApiId = apiManagementApiId;
            _resultValue.appCommandLine = appCommandLine;
            _resultValue.applicationStack = applicationStack;
            _resultValue.autoHealSetting = autoHealSetting;
            _resultValue.autoSwapSlotName = autoSwapSlotName;
            _resultValue.containerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
            _resultValue.containerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
            _resultValue.cors = cors;
            _resultValue.defaultDocuments = defaultDocuments;
            _resultValue.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
            _resultValue.ftpsState = ftpsState;
            _resultValue.handlerMappings = handlerMappings;
            _resultValue.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
            _resultValue.healthCheckPath = healthCheckPath;
            _resultValue.http2Enabled = http2Enabled;
            _resultValue.ipRestrictionDefaultAction = ipRestrictionDefaultAction;
            _resultValue.ipRestrictions = ipRestrictions;
            _resultValue.loadBalancingMode = loadBalancingMode;
            _resultValue.localMysqlEnabled = localMysqlEnabled;
            _resultValue.managedPipelineMode = managedPipelineMode;
            _resultValue.minimumTlsVersion = minimumTlsVersion;
            _resultValue.remoteDebuggingEnabled = remoteDebuggingEnabled;
            _resultValue.remoteDebuggingVersion = remoteDebuggingVersion;
            _resultValue.scmIpRestrictionDefaultAction = scmIpRestrictionDefaultAction;
            _resultValue.scmIpRestrictions = scmIpRestrictions;
            _resultValue.scmMinimumTlsVersion = scmMinimumTlsVersion;
            _resultValue.scmType = scmType;
            _resultValue.scmUseMainIpRestriction = scmUseMainIpRestriction;
            _resultValue.use32BitWorker = use32BitWorker;
            _resultValue.virtualApplications = virtualApplications;
            _resultValue.vnetRouteAllEnabled = vnetRouteAllEnabled;
            _resultValue.websocketsEnabled = websocketsEnabled;
            _resultValue.windowsFxVersion = windowsFxVersion;
            _resultValue.workerCount = workerCount;
            return _resultValue;
        }
    }
}
