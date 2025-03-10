// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigApplicationStack;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigAutoHealSetting;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigCor;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigHandlerMapping;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigScmIpRestriction;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigVirtualApplication;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfig {
    /**
     * @return Is this Windows Web App is Always On enabled.
     * 
     */
    private Boolean alwaysOn;
    /**
     * @return The ID of the APIM configuration for this Windows Web App.
     * 
     */
    private String apiDefinitionUrl;
    /**
     * @return The ID of the API Management setting linked to the Windows Web App.
     * 
     */
    private String apiManagementApiId;
    /**
     * @return The command line used to launch this app.
     * 
     */
    private String appCommandLine;
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    private List<GetWindowsWebAppSiteConfigApplicationStack> applicationStacks;
    /**
     * @return A `auto_heal_setting` block as defined above.
     * 
     */
    private List<GetWindowsWebAppSiteConfigAutoHealSetting> autoHealSettings;
    /**
     * @return The Client ID of the Managed Service Identity used for connections to the Azure Container Registry.
     * 
     */
    private String containerRegistryManagedIdentityClientId;
    /**
     * @return Do connections for Azure Container Registry use Managed Identity.
     * 
     */
    private Boolean containerRegistryUseManagedIdentity;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private List<GetWindowsWebAppSiteConfigCor> cors;
    /**
     * @return The list of Default Documents for the Windows Web App.
     * 
     */
    private List<String> defaultDocuments;
    /**
     * @return Is Detailed Error Logging enabled.
     * 
     */
    private Boolean detailedErrorLoggingEnabled;
    /**
     * @return The State of FTP / FTPS service.
     * 
     */
    private String ftpsState;
    /**
     * @return A `handler_mapping` block as defined below.
     * 
     */
    private List<GetWindowsWebAppSiteConfigHandlerMapping> handlerMappings;
    /**
     * @return (Optional) The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    private Integer healthCheckEvictionTimeInMin;
    /**
     * @return The path to the Health Check endpoint.
     * 
     */
    private String healthCheckPath;
    /**
     * @return Is HTTP2.0 enabled.
     * 
     */
    private Boolean http2Enabled;
    /**
     * @return The Default action for traffic that does not match any `ip_restriction` rule.
     * 
     */
    private String ipRestrictionDefaultAction;
    /**
     * @return A `ip_restriction` block as defined above.
     * 
     */
    private List<GetWindowsWebAppSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return The site Load Balancing Mode.
     * 
     */
    private String loadBalancingMode;
    /**
     * @return Is the Local MySQL enabled.
     * 
     */
    private Boolean localMysqlEnabled;
    /**
     * @return The Managed Pipeline Mode.
     * 
     */
    private String managedPipelineMode;
    /**
     * @return The Minimum version of TLS for requests.
     * 
     */
    private String minimumTlsVersion;
    private Boolean remoteDebuggingEnabled;
    /**
     * @return The Remote Debugging Version.
     * 
     */
    private String remoteDebuggingVersion;
    /**
     * @return The Default action for traffic that does not match any `scm_ip_restriction` rule.
     * 
     */
    private String scmIpRestrictionDefaultAction;
    /**
     * @return A `scm_ip_restriction` block as defined above.
     * 
     */
    private List<GetWindowsWebAppSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return The Minimum version of TLS for requests to SCM.
     * 
     */
    private String scmMinimumTlsVersion;
    /**
     * @return The Source Control Management Type in use.
     * 
     */
    private String scmType;
    /**
     * @return Is the Windows Web App `ip_restriction` configuration used for the SCM also.
     * 
     */
    private Boolean scmUseMainIpRestriction;
    /**
     * @return Does the Windows Web App use a 32-bit worker.
     * 
     */
    private Boolean use32BitWorker;
    /**
     * @return A `virtual_application` block as defined below.
     * 
     */
    private List<GetWindowsWebAppSiteConfigVirtualApplication> virtualApplications;
    /**
     * @return Are all outbound traffic to NAT Gateways, Network Security Groups and User Defined Routes applied?
     * 
     */
    private Boolean vnetRouteAllEnabled;
    /**
     * @return Are Web Sockets enabled?
     * 
     */
    private Boolean websocketsEnabled;
    /**
     * @return The string representation of the Windows FX Version.
     * 
     */
    private String windowsFxVersion;
    /**
     * @return The number of Workers for this Windows App Service.
     * 
     */
    private Integer workerCount;

    private GetWindowsWebAppSiteConfig() {}
    /**
     * @return Is this Windows Web App is Always On enabled.
     * 
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }
    /**
     * @return The ID of the APIM configuration for this Windows Web App.
     * 
     */
    public String apiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }
    /**
     * @return The ID of the API Management setting linked to the Windows Web App.
     * 
     */
    public String apiManagementApiId() {
        return this.apiManagementApiId;
    }
    /**
     * @return The command line used to launch this app.
     * 
     */
    public String appCommandLine() {
        return this.appCommandLine;
    }
    /**
     * @return A `application_stack` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigApplicationStack> applicationStacks() {
        return this.applicationStacks;
    }
    /**
     * @return A `auto_heal_setting` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigAutoHealSetting> autoHealSettings() {
        return this.autoHealSettings;
    }
    /**
     * @return The Client ID of the Managed Service Identity used for connections to the Azure Container Registry.
     * 
     */
    public String containerRegistryManagedIdentityClientId() {
        return this.containerRegistryManagedIdentityClientId;
    }
    /**
     * @return Do connections for Azure Container Registry use Managed Identity.
     * 
     */
    public Boolean containerRegistryUseManagedIdentity() {
        return this.containerRegistryUseManagedIdentity;
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigCor> cors() {
        return this.cors;
    }
    /**
     * @return The list of Default Documents for the Windows Web App.
     * 
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments;
    }
    /**
     * @return Is Detailed Error Logging enabled.
     * 
     */
    public Boolean detailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }
    /**
     * @return The State of FTP / FTPS service.
     * 
     */
    public String ftpsState() {
        return this.ftpsState;
    }
    /**
     * @return A `handler_mapping` block as defined below.
     * 
     */
    public List<GetWindowsWebAppSiteConfigHandlerMapping> handlerMappings() {
        return this.handlerMappings;
    }
    /**
     * @return (Optional) The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    public Integer healthCheckEvictionTimeInMin() {
        return this.healthCheckEvictionTimeInMin;
    }
    /**
     * @return The path to the Health Check endpoint.
     * 
     */
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * @return Is HTTP2.0 enabled.
     * 
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }
    /**
     * @return The Default action for traffic that does not match any `ip_restriction` rule.
     * 
     */
    public String ipRestrictionDefaultAction() {
        return this.ipRestrictionDefaultAction;
    }
    /**
     * @return A `ip_restriction` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions;
    }
    /**
     * @return The site Load Balancing Mode.
     * 
     */
    public String loadBalancingMode() {
        return this.loadBalancingMode;
    }
    /**
     * @return Is the Local MySQL enabled.
     * 
     */
    public Boolean localMysqlEnabled() {
        return this.localMysqlEnabled;
    }
    /**
     * @return The Managed Pipeline Mode.
     * 
     */
    public String managedPipelineMode() {
        return this.managedPipelineMode;
    }
    /**
     * @return The Minimum version of TLS for requests.
     * 
     */
    public String minimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    public Boolean remoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    /**
     * @return The Remote Debugging Version.
     * 
     */
    public String remoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    /**
     * @return The Default action for traffic that does not match any `scm_ip_restriction` rule.
     * 
     */
    public String scmIpRestrictionDefaultAction() {
        return this.scmIpRestrictionDefaultAction;
    }
    /**
     * @return A `scm_ip_restriction` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions;
    }
    /**
     * @return The Minimum version of TLS for requests to SCM.
     * 
     */
    public String scmMinimumTlsVersion() {
        return this.scmMinimumTlsVersion;
    }
    /**
     * @return The Source Control Management Type in use.
     * 
     */
    public String scmType() {
        return this.scmType;
    }
    /**
     * @return Is the Windows Web App `ip_restriction` configuration used for the SCM also.
     * 
     */
    public Boolean scmUseMainIpRestriction() {
        return this.scmUseMainIpRestriction;
    }
    /**
     * @return Does the Windows Web App use a 32-bit worker.
     * 
     */
    public Boolean use32BitWorker() {
        return this.use32BitWorker;
    }
    /**
     * @return A `virtual_application` block as defined below.
     * 
     */
    public List<GetWindowsWebAppSiteConfigVirtualApplication> virtualApplications() {
        return this.virtualApplications;
    }
    /**
     * @return Are all outbound traffic to NAT Gateways, Network Security Groups and User Defined Routes applied?
     * 
     */
    public Boolean vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }
    /**
     * @return Are Web Sockets enabled?
     * 
     */
    public Boolean websocketsEnabled() {
        return this.websocketsEnabled;
    }
    /**
     * @return The string representation of the Windows FX Version.
     * 
     */
    public String windowsFxVersion() {
        return this.windowsFxVersion;
    }
    /**
     * @return The number of Workers for this Windows App Service.
     * 
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean alwaysOn;
        private String apiDefinitionUrl;
        private String apiManagementApiId;
        private String appCommandLine;
        private List<GetWindowsWebAppSiteConfigApplicationStack> applicationStacks;
        private List<GetWindowsWebAppSiteConfigAutoHealSetting> autoHealSettings;
        private String containerRegistryManagedIdentityClientId;
        private Boolean containerRegistryUseManagedIdentity;
        private List<GetWindowsWebAppSiteConfigCor> cors;
        private List<String> defaultDocuments;
        private Boolean detailedErrorLoggingEnabled;
        private String ftpsState;
        private List<GetWindowsWebAppSiteConfigHandlerMapping> handlerMappings;
        private Integer healthCheckEvictionTimeInMin;
        private String healthCheckPath;
        private Boolean http2Enabled;
        private String ipRestrictionDefaultAction;
        private List<GetWindowsWebAppSiteConfigIpRestriction> ipRestrictions;
        private String loadBalancingMode;
        private Boolean localMysqlEnabled;
        private String managedPipelineMode;
        private String minimumTlsVersion;
        private Boolean remoteDebuggingEnabled;
        private String remoteDebuggingVersion;
        private String scmIpRestrictionDefaultAction;
        private List<GetWindowsWebAppSiteConfigScmIpRestriction> scmIpRestrictions;
        private String scmMinimumTlsVersion;
        private String scmType;
        private Boolean scmUseMainIpRestriction;
        private Boolean use32BitWorker;
        private List<GetWindowsWebAppSiteConfigVirtualApplication> virtualApplications;
        private Boolean vnetRouteAllEnabled;
        private Boolean websocketsEnabled;
        private String windowsFxVersion;
        private Integer workerCount;
        public Builder() {}
        public Builder(GetWindowsWebAppSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.apiDefinitionUrl = defaults.apiDefinitionUrl;
    	      this.apiManagementApiId = defaults.apiManagementApiId;
    	      this.appCommandLine = defaults.appCommandLine;
    	      this.applicationStacks = defaults.applicationStacks;
    	      this.autoHealSettings = defaults.autoHealSettings;
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
        public Builder alwaysOn(Boolean alwaysOn) {
            if (alwaysOn == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "alwaysOn");
            }
            this.alwaysOn = alwaysOn;
            return this;
        }
        @CustomType.Setter
        public Builder apiDefinitionUrl(String apiDefinitionUrl) {
            if (apiDefinitionUrl == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "apiDefinitionUrl");
            }
            this.apiDefinitionUrl = apiDefinitionUrl;
            return this;
        }
        @CustomType.Setter
        public Builder apiManagementApiId(String apiManagementApiId) {
            if (apiManagementApiId == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "apiManagementApiId");
            }
            this.apiManagementApiId = apiManagementApiId;
            return this;
        }
        @CustomType.Setter
        public Builder appCommandLine(String appCommandLine) {
            if (appCommandLine == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "appCommandLine");
            }
            this.appCommandLine = appCommandLine;
            return this;
        }
        @CustomType.Setter
        public Builder applicationStacks(List<GetWindowsWebAppSiteConfigApplicationStack> applicationStacks) {
            if (applicationStacks == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "applicationStacks");
            }
            this.applicationStacks = applicationStacks;
            return this;
        }
        public Builder applicationStacks(GetWindowsWebAppSiteConfigApplicationStack... applicationStacks) {
            return applicationStacks(List.of(applicationStacks));
        }
        @CustomType.Setter
        public Builder autoHealSettings(List<GetWindowsWebAppSiteConfigAutoHealSetting> autoHealSettings) {
            if (autoHealSettings == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "autoHealSettings");
            }
            this.autoHealSettings = autoHealSettings;
            return this;
        }
        public Builder autoHealSettings(GetWindowsWebAppSiteConfigAutoHealSetting... autoHealSettings) {
            return autoHealSettings(List.of(autoHealSettings));
        }
        @CustomType.Setter
        public Builder containerRegistryManagedIdentityClientId(String containerRegistryManagedIdentityClientId) {
            if (containerRegistryManagedIdentityClientId == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "containerRegistryManagedIdentityClientId");
            }
            this.containerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
            return this;
        }
        @CustomType.Setter
        public Builder containerRegistryUseManagedIdentity(Boolean containerRegistryUseManagedIdentity) {
            if (containerRegistryUseManagedIdentity == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "containerRegistryUseManagedIdentity");
            }
            this.containerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
            return this;
        }
        @CustomType.Setter
        public Builder cors(List<GetWindowsWebAppSiteConfigCor> cors) {
            if (cors == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "cors");
            }
            this.cors = cors;
            return this;
        }
        public Builder cors(GetWindowsWebAppSiteConfigCor... cors) {
            return cors(List.of(cors));
        }
        @CustomType.Setter
        public Builder defaultDocuments(List<String> defaultDocuments) {
            if (defaultDocuments == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "defaultDocuments");
            }
            this.defaultDocuments = defaultDocuments;
            return this;
        }
        public Builder defaultDocuments(String... defaultDocuments) {
            return defaultDocuments(List.of(defaultDocuments));
        }
        @CustomType.Setter
        public Builder detailedErrorLoggingEnabled(Boolean detailedErrorLoggingEnabled) {
            if (detailedErrorLoggingEnabled == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "detailedErrorLoggingEnabled");
            }
            this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder ftpsState(String ftpsState) {
            if (ftpsState == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "ftpsState");
            }
            this.ftpsState = ftpsState;
            return this;
        }
        @CustomType.Setter
        public Builder handlerMappings(List<GetWindowsWebAppSiteConfigHandlerMapping> handlerMappings) {
            if (handlerMappings == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "handlerMappings");
            }
            this.handlerMappings = handlerMappings;
            return this;
        }
        public Builder handlerMappings(GetWindowsWebAppSiteConfigHandlerMapping... handlerMappings) {
            return handlerMappings(List.of(handlerMappings));
        }
        @CustomType.Setter
        public Builder healthCheckEvictionTimeInMin(Integer healthCheckEvictionTimeInMin) {
            if (healthCheckEvictionTimeInMin == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "healthCheckEvictionTimeInMin");
            }
            this.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckPath(String healthCheckPath) {
            if (healthCheckPath == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "healthCheckPath");
            }
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        @CustomType.Setter
        public Builder http2Enabled(Boolean http2Enabled) {
            if (http2Enabled == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "http2Enabled");
            }
            this.http2Enabled = http2Enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ipRestrictionDefaultAction(String ipRestrictionDefaultAction) {
            if (ipRestrictionDefaultAction == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "ipRestrictionDefaultAction");
            }
            this.ipRestrictionDefaultAction = ipRestrictionDefaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder ipRestrictions(List<GetWindowsWebAppSiteConfigIpRestriction> ipRestrictions) {
            if (ipRestrictions == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "ipRestrictions");
            }
            this.ipRestrictions = ipRestrictions;
            return this;
        }
        public Builder ipRestrictions(GetWindowsWebAppSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        @CustomType.Setter
        public Builder loadBalancingMode(String loadBalancingMode) {
            if (loadBalancingMode == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "loadBalancingMode");
            }
            this.loadBalancingMode = loadBalancingMode;
            return this;
        }
        @CustomType.Setter
        public Builder localMysqlEnabled(Boolean localMysqlEnabled) {
            if (localMysqlEnabled == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "localMysqlEnabled");
            }
            this.localMysqlEnabled = localMysqlEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder managedPipelineMode(String managedPipelineMode) {
            if (managedPipelineMode == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "managedPipelineMode");
            }
            this.managedPipelineMode = managedPipelineMode;
            return this;
        }
        @CustomType.Setter
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            if (minimumTlsVersion == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "minimumTlsVersion");
            }
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
            if (remoteDebuggingEnabled == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "remoteDebuggingEnabled");
            }
            this.remoteDebuggingEnabled = remoteDebuggingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDebuggingVersion(String remoteDebuggingVersion) {
            if (remoteDebuggingVersion == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "remoteDebuggingVersion");
            }
            this.remoteDebuggingVersion = remoteDebuggingVersion;
            return this;
        }
        @CustomType.Setter
        public Builder scmIpRestrictionDefaultAction(String scmIpRestrictionDefaultAction) {
            if (scmIpRestrictionDefaultAction == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "scmIpRestrictionDefaultAction");
            }
            this.scmIpRestrictionDefaultAction = scmIpRestrictionDefaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder scmIpRestrictions(List<GetWindowsWebAppSiteConfigScmIpRestriction> scmIpRestrictions) {
            if (scmIpRestrictions == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "scmIpRestrictions");
            }
            this.scmIpRestrictions = scmIpRestrictions;
            return this;
        }
        public Builder scmIpRestrictions(GetWindowsWebAppSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        @CustomType.Setter
        public Builder scmMinimumTlsVersion(String scmMinimumTlsVersion) {
            if (scmMinimumTlsVersion == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "scmMinimumTlsVersion");
            }
            this.scmMinimumTlsVersion = scmMinimumTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder scmType(String scmType) {
            if (scmType == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "scmType");
            }
            this.scmType = scmType;
            return this;
        }
        @CustomType.Setter
        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            if (scmUseMainIpRestriction == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "scmUseMainIpRestriction");
            }
            this.scmUseMainIpRestriction = scmUseMainIpRestriction;
            return this;
        }
        @CustomType.Setter
        public Builder use32BitWorker(Boolean use32BitWorker) {
            if (use32BitWorker == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "use32BitWorker");
            }
            this.use32BitWorker = use32BitWorker;
            return this;
        }
        @CustomType.Setter
        public Builder virtualApplications(List<GetWindowsWebAppSiteConfigVirtualApplication> virtualApplications) {
            if (virtualApplications == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "virtualApplications");
            }
            this.virtualApplications = virtualApplications;
            return this;
        }
        public Builder virtualApplications(GetWindowsWebAppSiteConfigVirtualApplication... virtualApplications) {
            return virtualApplications(List.of(virtualApplications));
        }
        @CustomType.Setter
        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            if (vnetRouteAllEnabled == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "vnetRouteAllEnabled");
            }
            this.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            if (websocketsEnabled == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "websocketsEnabled");
            }
            this.websocketsEnabled = websocketsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder windowsFxVersion(String windowsFxVersion) {
            if (windowsFxVersion == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "windowsFxVersion");
            }
            this.windowsFxVersion = windowsFxVersion;
            return this;
        }
        @CustomType.Setter
        public Builder workerCount(Integer workerCount) {
            if (workerCount == null) {
              throw new MissingRequiredPropertyException("GetWindowsWebAppSiteConfig", "workerCount");
            }
            this.workerCount = workerCount;
            return this;
        }
        public GetWindowsWebAppSiteConfig build() {
            final var _resultValue = new GetWindowsWebAppSiteConfig();
            _resultValue.alwaysOn = alwaysOn;
            _resultValue.apiDefinitionUrl = apiDefinitionUrl;
            _resultValue.apiManagementApiId = apiManagementApiId;
            _resultValue.appCommandLine = appCommandLine;
            _resultValue.applicationStacks = applicationStacks;
            _resultValue.autoHealSettings = autoHealSettings;
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
