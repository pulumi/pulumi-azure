// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.azure.logicapps.outputs.StandardSiteConfigCors;
import com.pulumi.azure.logicapps.outputs.StandardSiteConfigIpRestriction;
import com.pulumi.azure.logicapps.outputs.StandardSiteConfigScmIpRestriction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StandardSiteConfig {
    /**
     * @return Should the Logic App be loaded at all times? Defaults to `false`.
     * 
     */
    private @Nullable Boolean alwaysOn;
    /**
     * @return The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    private @Nullable Integer appScaleLimit;
    /**
     * @return The Auto-swap slot name.
     * 
     */
    private @Nullable String autoSwapSlotName;
    /**
     * @return A `cors` block as defined below.
     * 
     */
    private @Nullable StandardSiteConfigCors cors;
    /**
     * @return The version of the .NET framework&#39;s CLR used in this Logic App Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0`, `v6.0` and `v8.0`. [For more information on which .NET Framework version to use based on the runtime version you&#39;re targeting - please see this table](https://docs.microsoft.com/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
     * 
     */
    private @Nullable String dotnetFrameworkVersion;
    /**
     * @return The number of minimum instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    private @Nullable Integer elasticInstanceMinimum;
    /**
     * @return State of FTP / FTPS service for this Logic App. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `AllAllowed`.
     * 
     */
    private @Nullable String ftpsState;
    /**
     * @return Path which will be checked for this Logic App health.
     * 
     */
    private @Nullable String healthCheckPath;
    /**
     * @return Specifies whether the HTTP2 protocol should be enabled. Defaults to `false`.
     * 
     */
    private @Nullable Boolean http2Enabled;
    /**
     * @return A list of `ip_restriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **Note:** User has to explicitly set `ip_restriction` to empty slice (`[]`) to remove it.
     * 
     */
    private @Nullable List<StandardSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return Linux App Framework and version for the App Service, e.g. `DOCKER|(golang:latest)`. Setting this value will also set the `kind` of application deployed to `functionapp,linux,container,workflowapp`.
     * 
     * &gt; **Note:** You must set `os_type` in `azure.appservice.ServicePlan` to `Linux` when this property is set.
     * 
     */
    private @Nullable String linuxFxVersion;
    /**
     * @return The minimum supported TLS version for the Logic App. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new Logic Apps.
     * 
     * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     * 
     */
    private @Nullable String minTlsVersion;
    /**
     * @return The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    private @Nullable Integer preWarmedInstanceCount;
    /**
     * @deprecated
     * the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider. */
    private @Nullable Boolean publicNetworkAccessEnabled;
    /**
     * @return Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
     * 
     */
    private @Nullable Boolean runtimeScaleMonitoringEnabled;
    /**
     * @return A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
     * 
     * &gt; **Note:** User has to explicitly set `scm_ip_restriction` to empty slice (`[]`) to remove it.
     * 
     */
    private @Nullable List<StandardSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return Configures the minimum version of TLS required for SSL requests to the SCM site. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     * 
     */
    private @Nullable String scmMinTlsVersion;
    /**
     * @return The type of Source Control used by the Logic App in use by the Windows Function App. Defaults to `None`. Possible values are: `BitbucketGit`, `BitbucketHg`, `CodePlexGit`, `CodePlexHg`, `Dropbox`, `ExternalGit`, `ExternalHg`, `GitHub`, `LocalGit`, `None`, `OneDrive`, `Tfs`, `VSO`, and `VSTSRM`
     * 
     */
    private @Nullable String scmType;
    /**
     * @return Should the Logic App `ip_restriction` configuration be used for the SCM too. Defaults to `false`.
     * 
     */
    private @Nullable Boolean scmUseMainIpRestriction;
    /**
     * @return Should the Logic App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
     * 
     * &gt; **Note:** when using an App Service Plan in the `Free` or `Shared` Tiers `use_32_bit_worker_process` must be set to `true`.
     * 
     */
    private @Nullable Boolean use32BitWorkerProcess;
    /**
     * @return Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
     * 
     */
    private @Nullable Boolean vnetRouteAllEnabled;
    /**
     * @return Should WebSockets be enabled?
     * 
     */
    private @Nullable Boolean websocketsEnabled;

    private StandardSiteConfig() {}
    /**
     * @return Should the Logic App be loaded at all times? Defaults to `false`.
     * 
     */
    public Optional<Boolean> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }
    /**
     * @return The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    public Optional<Integer> appScaleLimit() {
        return Optional.ofNullable(this.appScaleLimit);
    }
    /**
     * @return The Auto-swap slot name.
     * 
     */
    public Optional<String> autoSwapSlotName() {
        return Optional.ofNullable(this.autoSwapSlotName);
    }
    /**
     * @return A `cors` block as defined below.
     * 
     */
    public Optional<StandardSiteConfigCors> cors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * @return The version of the .NET framework&#39;s CLR used in this Logic App Possible values are `v4.0` (including .NET Core 2.1 and 3.1), `v5.0`, `v6.0` and `v8.0`. [For more information on which .NET Framework version to use based on the runtime version you&#39;re targeting - please see this table](https://docs.microsoft.com/azure/azure-functions/functions-dotnet-class-library#supported-versions). Defaults to `v4.0`.
     * 
     */
    public Optional<String> dotnetFrameworkVersion() {
        return Optional.ofNullable(this.dotnetFrameworkVersion);
    }
    /**
     * @return The number of minimum instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    public Optional<Integer> elasticInstanceMinimum() {
        return Optional.ofNullable(this.elasticInstanceMinimum);
    }
    /**
     * @return State of FTP / FTPS service for this Logic App. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `AllAllowed`.
     * 
     */
    public Optional<String> ftpsState() {
        return Optional.ofNullable(this.ftpsState);
    }
    /**
     * @return Path which will be checked for this Logic App health.
     * 
     */
    public Optional<String> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }
    /**
     * @return Specifies whether the HTTP2 protocol should be enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }
    /**
     * @return A list of `ip_restriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **Note:** User has to explicitly set `ip_restriction` to empty slice (`[]`) to remove it.
     * 
     */
    public List<StandardSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions == null ? List.of() : this.ipRestrictions;
    }
    /**
     * @return Linux App Framework and version for the App Service, e.g. `DOCKER|(golang:latest)`. Setting this value will also set the `kind` of application deployed to `functionapp,linux,container,workflowapp`.
     * 
     * &gt; **Note:** You must set `os_type` in `azure.appservice.ServicePlan` to `Linux` when this property is set.
     * 
     */
    public Optional<String> linuxFxVersion() {
        return Optional.ofNullable(this.linuxFxVersion);
    }
    /**
     * @return The minimum supported TLS version for the Logic App. Possible values are `1.0`, `1.1`, and `1.2`. Defaults to `1.2` for new Logic Apps.
     * 
     * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     * 
     */
    public Optional<String> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }
    /**
     * @return The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    public Optional<Integer> preWarmedInstanceCount() {
        return Optional.ofNullable(this.preWarmedInstanceCount);
    }
    /**
     * @deprecated
     * the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider. */
    public Optional<Boolean> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }
    /**
     * @return Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan. Defaults to `false`.
     * 
     */
    public Optional<Boolean> runtimeScaleMonitoringEnabled() {
        return Optional.ofNullable(this.runtimeScaleMonitoringEnabled);
    }
    /**
     * @return A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
     * 
     * &gt; **Note:** User has to explicitly set `scm_ip_restriction` to empty slice (`[]`) to remove it.
     * 
     */
    public List<StandardSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions == null ? List.of() : this.scmIpRestrictions;
    }
    /**
     * @return Configures the minimum version of TLS required for SSL requests to the SCM site. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     * 
     */
    public Optional<String> scmMinTlsVersion() {
        return Optional.ofNullable(this.scmMinTlsVersion);
    }
    /**
     * @return The type of Source Control used by the Logic App in use by the Windows Function App. Defaults to `None`. Possible values are: `BitbucketGit`, `BitbucketHg`, `CodePlexGit`, `CodePlexHg`, `Dropbox`, `ExternalGit`, `ExternalHg`, `GitHub`, `LocalGit`, `None`, `OneDrive`, `Tfs`, `VSO`, and `VSTSRM`
     * 
     */
    public Optional<String> scmType() {
        return Optional.ofNullable(this.scmType);
    }
    /**
     * @return Should the Logic App `ip_restriction` configuration be used for the SCM too. Defaults to `false`.
     * 
     */
    public Optional<Boolean> scmUseMainIpRestriction() {
        return Optional.ofNullable(this.scmUseMainIpRestriction);
    }
    /**
     * @return Should the Logic App run in 32 bit mode, rather than 64 bit mode? Defaults to `true`.
     * 
     * &gt; **Note:** when using an App Service Plan in the `Free` or `Shared` Tiers `use_32_bit_worker_process` must be set to `true`.
     * 
     */
    public Optional<Boolean> use32BitWorkerProcess() {
        return Optional.ofNullable(this.use32BitWorkerProcess);
    }
    /**
     * @return Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
     * 
     */
    public Optional<Boolean> vnetRouteAllEnabled() {
        return Optional.ofNullable(this.vnetRouteAllEnabled);
    }
    /**
     * @return Should WebSockets be enabled?
     * 
     */
    public Optional<Boolean> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSiteConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alwaysOn;
        private @Nullable Integer appScaleLimit;
        private @Nullable String autoSwapSlotName;
        private @Nullable StandardSiteConfigCors cors;
        private @Nullable String dotnetFrameworkVersion;
        private @Nullable Integer elasticInstanceMinimum;
        private @Nullable String ftpsState;
        private @Nullable String healthCheckPath;
        private @Nullable Boolean http2Enabled;
        private @Nullable List<StandardSiteConfigIpRestriction> ipRestrictions;
        private @Nullable String linuxFxVersion;
        private @Nullable String minTlsVersion;
        private @Nullable Integer preWarmedInstanceCount;
        private @Nullable Boolean publicNetworkAccessEnabled;
        private @Nullable Boolean runtimeScaleMonitoringEnabled;
        private @Nullable List<StandardSiteConfigScmIpRestriction> scmIpRestrictions;
        private @Nullable String scmMinTlsVersion;
        private @Nullable String scmType;
        private @Nullable Boolean scmUseMainIpRestriction;
        private @Nullable Boolean use32BitWorkerProcess;
        private @Nullable Boolean vnetRouteAllEnabled;
        private @Nullable Boolean websocketsEnabled;
        public Builder() {}
        public Builder(StandardSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.appScaleLimit = defaults.appScaleLimit;
    	      this.autoSwapSlotName = defaults.autoSwapSlotName;
    	      this.cors = defaults.cors;
    	      this.dotnetFrameworkVersion = defaults.dotnetFrameworkVersion;
    	      this.elasticInstanceMinimum = defaults.elasticInstanceMinimum;
    	      this.ftpsState = defaults.ftpsState;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.linuxFxVersion = defaults.linuxFxVersion;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.preWarmedInstanceCount = defaults.preWarmedInstanceCount;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.runtimeScaleMonitoringEnabled = defaults.runtimeScaleMonitoringEnabled;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmMinTlsVersion = defaults.scmMinTlsVersion;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorkerProcess = defaults.use32BitWorkerProcess;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
        }

        @CustomType.Setter
        public Builder alwaysOn(@Nullable Boolean alwaysOn) {

            this.alwaysOn = alwaysOn;
            return this;
        }
        @CustomType.Setter
        public Builder appScaleLimit(@Nullable Integer appScaleLimit) {

            this.appScaleLimit = appScaleLimit;
            return this;
        }
        @CustomType.Setter
        public Builder autoSwapSlotName(@Nullable String autoSwapSlotName) {

            this.autoSwapSlotName = autoSwapSlotName;
            return this;
        }
        @CustomType.Setter
        public Builder cors(@Nullable StandardSiteConfigCors cors) {

            this.cors = cors;
            return this;
        }
        @CustomType.Setter
        public Builder dotnetFrameworkVersion(@Nullable String dotnetFrameworkVersion) {

            this.dotnetFrameworkVersion = dotnetFrameworkVersion;
            return this;
        }
        @CustomType.Setter
        public Builder elasticInstanceMinimum(@Nullable Integer elasticInstanceMinimum) {

            this.elasticInstanceMinimum = elasticInstanceMinimum;
            return this;
        }
        @CustomType.Setter
        public Builder ftpsState(@Nullable String ftpsState) {

            this.ftpsState = ftpsState;
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
        public Builder ipRestrictions(@Nullable List<StandardSiteConfigIpRestriction> ipRestrictions) {

            this.ipRestrictions = ipRestrictions;
            return this;
        }
        public Builder ipRestrictions(StandardSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        @CustomType.Setter
        public Builder linuxFxVersion(@Nullable String linuxFxVersion) {

            this.linuxFxVersion = linuxFxVersion;
            return this;
        }
        @CustomType.Setter
        public Builder minTlsVersion(@Nullable String minTlsVersion) {

            this.minTlsVersion = minTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder preWarmedInstanceCount(@Nullable Integer preWarmedInstanceCount) {

            this.preWarmedInstanceCount = preWarmedInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder publicNetworkAccessEnabled(@Nullable Boolean publicNetworkAccessEnabled) {

            this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder runtimeScaleMonitoringEnabled(@Nullable Boolean runtimeScaleMonitoringEnabled) {

            this.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder scmIpRestrictions(@Nullable List<StandardSiteConfigScmIpRestriction> scmIpRestrictions) {

            this.scmIpRestrictions = scmIpRestrictions;
            return this;
        }
        public Builder scmIpRestrictions(StandardSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        @CustomType.Setter
        public Builder scmMinTlsVersion(@Nullable String scmMinTlsVersion) {

            this.scmMinTlsVersion = scmMinTlsVersion;
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
        public Builder use32BitWorkerProcess(@Nullable Boolean use32BitWorkerProcess) {

            this.use32BitWorkerProcess = use32BitWorkerProcess;
            return this;
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
        public StandardSiteConfig build() {
            final var _resultValue = new StandardSiteConfig();
            _resultValue.alwaysOn = alwaysOn;
            _resultValue.appScaleLimit = appScaleLimit;
            _resultValue.autoSwapSlotName = autoSwapSlotName;
            _resultValue.cors = cors;
            _resultValue.dotnetFrameworkVersion = dotnetFrameworkVersion;
            _resultValue.elasticInstanceMinimum = elasticInstanceMinimum;
            _resultValue.ftpsState = ftpsState;
            _resultValue.healthCheckPath = healthCheckPath;
            _resultValue.http2Enabled = http2Enabled;
            _resultValue.ipRestrictions = ipRestrictions;
            _resultValue.linuxFxVersion = linuxFxVersion;
            _resultValue.minTlsVersion = minTlsVersion;
            _resultValue.preWarmedInstanceCount = preWarmedInstanceCount;
            _resultValue.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            _resultValue.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            _resultValue.scmIpRestrictions = scmIpRestrictions;
            _resultValue.scmMinTlsVersion = scmMinTlsVersion;
            _resultValue.scmType = scmType;
            _resultValue.scmUseMainIpRestriction = scmUseMainIpRestriction;
            _resultValue.use32BitWorkerProcess = use32BitWorkerProcess;
            _resultValue.vnetRouteAllEnabled = vnetRouteAllEnabled;
            _resultValue.websocketsEnabled = websocketsEnabled;
            return _resultValue;
        }
    }
}
