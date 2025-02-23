// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigCorsArgs;
import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigIpRestrictionArgs;
import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigScmIpRestrictionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStandardSiteConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetStandardSiteConfigArgs Empty = new GetStandardSiteConfigArgs();

    /**
     * Should the Logic App be loaded at all times?
     * 
     */
    @Import(name="alwaysOn")
    private @Nullable Output<Boolean> alwaysOn;

    /**
     * @return Should the Logic App be loaded at all times?
     * 
     */
    public Optional<Output<Boolean>> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }

    /**
     * The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    @Import(name="appScaleLimit", required=true)
    private Output<Integer> appScaleLimit;

    /**
     * @return The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    public Output<Integer> appScaleLimit() {
        return this.appScaleLimit;
    }

    /**
     * The Auto-swap slot name.
     * 
     */
    @Import(name="autoSwapSlotName", required=true)
    private Output<String> autoSwapSlotName;

    /**
     * @return The Auto-swap slot name.
     * 
     */
    public Output<String> autoSwapSlotName() {
        return this.autoSwapSlotName;
    }

    /**
     * A `cors` block as defined below.
     * 
     */
    @Import(name="cors", required=true)
    private Output<GetStandardSiteConfigCorsArgs> cors;

    /**
     * @return A `cors` block as defined below.
     * 
     */
    public Output<GetStandardSiteConfigCorsArgs> cors() {
        return this.cors;
    }

    /**
     * The version of the .NET framework&#39;s CLR used in this Logic App.
     * 
     */
    @Import(name="dotnetFrameworkVersion")
    private @Nullable Output<String> dotnetFrameworkVersion;

    /**
     * @return The version of the .NET framework&#39;s CLR used in this Logic App.
     * 
     */
    public Optional<Output<String>> dotnetFrameworkVersion() {
        return Optional.ofNullable(this.dotnetFrameworkVersion);
    }

    /**
     * The number of minimum instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    @Import(name="elasticInstanceMinimum", required=true)
    private Output<Integer> elasticInstanceMinimum;

    /**
     * @return The number of minimum instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    public Output<Integer> elasticInstanceMinimum() {
        return this.elasticInstanceMinimum;
    }

    /**
     * The state of FTP / FTPS service for this Logic App.
     * 
     */
    @Import(name="ftpsState", required=true)
    private Output<String> ftpsState;

    /**
     * @return The state of FTP / FTPS service for this Logic App.
     * 
     */
    public Output<String> ftpsState() {
        return this.ftpsState;
    }

    /**
     * Path which will be checked for this Logic App health.
     * 
     */
    @Import(name="healthCheckPath")
    private @Nullable Output<String> healthCheckPath;

    /**
     * @return Path which will be checked for this Logic App health.
     * 
     */
    public Optional<Output<String>> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }

    /**
     * Specifies whether the HTTP2 protocol should be enabled.
     * 
     */
    @Import(name="http2Enabled")
    private @Nullable Output<Boolean> http2Enabled;

    /**
     * @return Specifies whether the HTTP2 protocol should be enabled.
     * 
     */
    public Optional<Output<Boolean>> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }

    /**
     * A list of `ip_restriction` objects representing IP restrictions as defined below.
     * 
     */
    @Import(name="ipRestrictions", required=true)
    private Output<List<GetStandardSiteConfigIpRestrictionArgs>> ipRestrictions;

    /**
     * @return A list of `ip_restriction` objects representing IP restrictions as defined below.
     * 
     */
    public Output<List<GetStandardSiteConfigIpRestrictionArgs>> ipRestrictions() {
        return this.ipRestrictions;
    }

    /**
     * Linux App Framework and version for the Logic App.
     * 
     */
    @Import(name="linuxFxVersion", required=true)
    private Output<String> linuxFxVersion;

    /**
     * @return Linux App Framework and version for the Logic App.
     * 
     */
    public Output<String> linuxFxVersion() {
        return this.linuxFxVersion;
    }

    /**
     * The minimum supported TLS version for the Logic App.
     * 
     */
    @Import(name="minTlsVersion", required=true)
    private Output<String> minTlsVersion;

    /**
     * @return The minimum supported TLS version for the Logic App.
     * 
     */
    public Output<String> minTlsVersion() {
        return this.minTlsVersion;
    }

    /**
     * The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    @Import(name="preWarmedInstanceCount", required=true)
    private Output<Integer> preWarmedInstanceCount;

    /**
     * @return The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
     * 
     */
    public Output<Integer> preWarmedInstanceCount() {
        return this.preWarmedInstanceCount;
    }

    /**
     * @deprecated
     * the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider. */
    @Import(name="publicNetworkAccessEnabled", required=true)
    private Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @deprecated
     * the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider. */
    public Output<Boolean> publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }

    /**
     * Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan.
     * 
     */
    @Import(name="runtimeScaleMonitoringEnabled")
    private @Nullable Output<Boolean> runtimeScaleMonitoringEnabled;

    /**
     * @return Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan.
     * 
     */
    public Optional<Output<Boolean>> runtimeScaleMonitoringEnabled() {
        return Optional.ofNullable(this.runtimeScaleMonitoringEnabled);
    }

    /**
     * A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
     * 
     */
    @Import(name="scmIpRestrictions", required=true)
    private Output<List<GetStandardSiteConfigScmIpRestrictionArgs>> scmIpRestrictions;

    /**
     * @return A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
     * 
     */
    public Output<List<GetStandardSiteConfigScmIpRestrictionArgs>> scmIpRestrictions() {
        return this.scmIpRestrictions;
    }

    /**
     * The minimum version of TLS required for SSL requests to the SCM site.
     * 
     */
    @Import(name="scmMinTlsVersion", required=true)
    private Output<String> scmMinTlsVersion;

    /**
     * @return The minimum version of TLS required for SSL requests to the SCM site.
     * 
     */
    public Output<String> scmMinTlsVersion() {
        return this.scmMinTlsVersion;
    }

    /**
     * The type of Source Control used by the Logic App in use by the Windows Function App.
     * 
     */
    @Import(name="scmType", required=true)
    private Output<String> scmType;

    /**
     * @return The type of Source Control used by the Logic App in use by the Windows Function App.
     * 
     */
    public Output<String> scmType() {
        return this.scmType;
    }

    /**
     * Should the Logic App `ip_restriction` configuration be used for the SCM too.
     * 
     */
    @Import(name="scmUseMainIpRestriction")
    private @Nullable Output<Boolean> scmUseMainIpRestriction;

    /**
     * @return Should the Logic App `ip_restriction` configuration be used for the SCM too.
     * 
     */
    public Optional<Output<Boolean>> scmUseMainIpRestriction() {
        return Optional.ofNullable(this.scmUseMainIpRestriction);
    }

    /**
     * Should the Logic App run in 32 bit mode, rather than 64 bit mode?
     * 
     */
    @Import(name="use32BitWorkerProcess")
    private @Nullable Output<Boolean> use32BitWorkerProcess;

    /**
     * @return Should the Logic App run in 32 bit mode, rather than 64 bit mode?
     * 
     */
    public Optional<Output<Boolean>> use32BitWorkerProcess() {
        return Optional.ofNullable(this.use32BitWorkerProcess);
    }

    /**
     * Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
     * 
     */
    @Import(name="vnetRouteAllEnabled", required=true)
    private Output<Boolean> vnetRouteAllEnabled;

    /**
     * @return Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
     * 
     */
    public Output<Boolean> vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }

    /**
     * Should WebSockets be enabled?
     * 
     */
    @Import(name="websocketsEnabled")
    private @Nullable Output<Boolean> websocketsEnabled;

    /**
     * @return Should WebSockets be enabled?
     * 
     */
    public Optional<Output<Boolean>> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }

    private GetStandardSiteConfigArgs() {}

    private GetStandardSiteConfigArgs(GetStandardSiteConfigArgs $) {
        this.alwaysOn = $.alwaysOn;
        this.appScaleLimit = $.appScaleLimit;
        this.autoSwapSlotName = $.autoSwapSlotName;
        this.cors = $.cors;
        this.dotnetFrameworkVersion = $.dotnetFrameworkVersion;
        this.elasticInstanceMinimum = $.elasticInstanceMinimum;
        this.ftpsState = $.ftpsState;
        this.healthCheckPath = $.healthCheckPath;
        this.http2Enabled = $.http2Enabled;
        this.ipRestrictions = $.ipRestrictions;
        this.linuxFxVersion = $.linuxFxVersion;
        this.minTlsVersion = $.minTlsVersion;
        this.preWarmedInstanceCount = $.preWarmedInstanceCount;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.runtimeScaleMonitoringEnabled = $.runtimeScaleMonitoringEnabled;
        this.scmIpRestrictions = $.scmIpRestrictions;
        this.scmMinTlsVersion = $.scmMinTlsVersion;
        this.scmType = $.scmType;
        this.scmUseMainIpRestriction = $.scmUseMainIpRestriction;
        this.use32BitWorkerProcess = $.use32BitWorkerProcess;
        this.vnetRouteAllEnabled = $.vnetRouteAllEnabled;
        this.websocketsEnabled = $.websocketsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardSiteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardSiteConfigArgs $;

        public Builder() {
            $ = new GetStandardSiteConfigArgs();
        }

        public Builder(GetStandardSiteConfigArgs defaults) {
            $ = new GetStandardSiteConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysOn Should the Logic App be loaded at all times?
         * 
         * @return builder
         * 
         */
        public Builder alwaysOn(@Nullable Output<Boolean> alwaysOn) {
            $.alwaysOn = alwaysOn;
            return this;
        }

        /**
         * @param alwaysOn Should the Logic App be loaded at all times?
         * 
         * @return builder
         * 
         */
        public Builder alwaysOn(Boolean alwaysOn) {
            return alwaysOn(Output.of(alwaysOn));
        }

        /**
         * @param appScaleLimit The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder appScaleLimit(Output<Integer> appScaleLimit) {
            $.appScaleLimit = appScaleLimit;
            return this;
        }

        /**
         * @param appScaleLimit The number of workers this Logic App can scale out to. Only applicable to apps on the Consumption and Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder appScaleLimit(Integer appScaleLimit) {
            return appScaleLimit(Output.of(appScaleLimit));
        }

        /**
         * @param autoSwapSlotName The Auto-swap slot name.
         * 
         * @return builder
         * 
         */
        public Builder autoSwapSlotName(Output<String> autoSwapSlotName) {
            $.autoSwapSlotName = autoSwapSlotName;
            return this;
        }

        /**
         * @param autoSwapSlotName The Auto-swap slot name.
         * 
         * @return builder
         * 
         */
        public Builder autoSwapSlotName(String autoSwapSlotName) {
            return autoSwapSlotName(Output.of(autoSwapSlotName));
        }

        /**
         * @param cors A `cors` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder cors(Output<GetStandardSiteConfigCorsArgs> cors) {
            $.cors = cors;
            return this;
        }

        /**
         * @param cors A `cors` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder cors(GetStandardSiteConfigCorsArgs cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param dotnetFrameworkVersion The version of the .NET framework&#39;s CLR used in this Logic App.
         * 
         * @return builder
         * 
         */
        public Builder dotnetFrameworkVersion(@Nullable Output<String> dotnetFrameworkVersion) {
            $.dotnetFrameworkVersion = dotnetFrameworkVersion;
            return this;
        }

        /**
         * @param dotnetFrameworkVersion The version of the .NET framework&#39;s CLR used in this Logic App.
         * 
         * @return builder
         * 
         */
        public Builder dotnetFrameworkVersion(String dotnetFrameworkVersion) {
            return dotnetFrameworkVersion(Output.of(dotnetFrameworkVersion));
        }

        /**
         * @param elasticInstanceMinimum The number of minimum instances for this Logic App Only affects apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder elasticInstanceMinimum(Output<Integer> elasticInstanceMinimum) {
            $.elasticInstanceMinimum = elasticInstanceMinimum;
            return this;
        }

        /**
         * @param elasticInstanceMinimum The number of minimum instances for this Logic App Only affects apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder elasticInstanceMinimum(Integer elasticInstanceMinimum) {
            return elasticInstanceMinimum(Output.of(elasticInstanceMinimum));
        }

        /**
         * @param ftpsState The state of FTP / FTPS service for this Logic App.
         * 
         * @return builder
         * 
         */
        public Builder ftpsState(Output<String> ftpsState) {
            $.ftpsState = ftpsState;
            return this;
        }

        /**
         * @param ftpsState The state of FTP / FTPS service for this Logic App.
         * 
         * @return builder
         * 
         */
        public Builder ftpsState(String ftpsState) {
            return ftpsState(Output.of(ftpsState));
        }

        /**
         * @param healthCheckPath Path which will be checked for this Logic App health.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * @param healthCheckPath Path which will be checked for this Logic App health.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPath(String healthCheckPath) {
            return healthCheckPath(Output.of(healthCheckPath));
        }

        /**
         * @param http2Enabled Specifies whether the HTTP2 protocol should be enabled.
         * 
         * @return builder
         * 
         */
        public Builder http2Enabled(@Nullable Output<Boolean> http2Enabled) {
            $.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * @param http2Enabled Specifies whether the HTTP2 protocol should be enabled.
         * 
         * @return builder
         * 
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            return http2Enabled(Output.of(http2Enabled));
        }

        /**
         * @param ipRestrictions A list of `ip_restriction` objects representing IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipRestrictions(Output<List<GetStandardSiteConfigIpRestrictionArgs>> ipRestrictions) {
            $.ipRestrictions = ipRestrictions;
            return this;
        }

        /**
         * @param ipRestrictions A list of `ip_restriction` objects representing IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipRestrictions(List<GetStandardSiteConfigIpRestrictionArgs> ipRestrictions) {
            return ipRestrictions(Output.of(ipRestrictions));
        }

        /**
         * @param ipRestrictions A list of `ip_restriction` objects representing IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ipRestrictions(GetStandardSiteConfigIpRestrictionArgs... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }

        /**
         * @param linuxFxVersion Linux App Framework and version for the Logic App.
         * 
         * @return builder
         * 
         */
        public Builder linuxFxVersion(Output<String> linuxFxVersion) {
            $.linuxFxVersion = linuxFxVersion;
            return this;
        }

        /**
         * @param linuxFxVersion Linux App Framework and version for the Logic App.
         * 
         * @return builder
         * 
         */
        public Builder linuxFxVersion(String linuxFxVersion) {
            return linuxFxVersion(Output.of(linuxFxVersion));
        }

        /**
         * @param minTlsVersion The minimum supported TLS version for the Logic App.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(Output<String> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        /**
         * @param minTlsVersion The minimum supported TLS version for the Logic App.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(String minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        /**
         * @param preWarmedInstanceCount The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder preWarmedInstanceCount(Output<Integer> preWarmedInstanceCount) {
            $.preWarmedInstanceCount = preWarmedInstanceCount;
            return this;
        }

        /**
         * @param preWarmedInstanceCount The number of pre-warmed instances for this Logic App Only affects apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder preWarmedInstanceCount(Integer preWarmedInstanceCount) {
            return preWarmedInstanceCount(Output.of(preWarmedInstanceCount));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider. */
        public Builder publicNetworkAccessEnabled(Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider.
         * 
         */
        @Deprecated /* the `site_config.public_network_access_enabled` property has been superseded by the `public_network_access` property and will be removed in v5.0 of the AzureRM Provider. */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param runtimeScaleMonitoringEnabled Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder runtimeScaleMonitoringEnabled(@Nullable Output<Boolean> runtimeScaleMonitoringEnabled) {
            $.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            return this;
        }

        /**
         * @param runtimeScaleMonitoringEnabled Should Runtime Scale Monitoring be enabled?. Only applicable to apps on the Premium plan.
         * 
         * @return builder
         * 
         */
        public Builder runtimeScaleMonitoringEnabled(Boolean runtimeScaleMonitoringEnabled) {
            return runtimeScaleMonitoringEnabled(Output.of(runtimeScaleMonitoringEnabled));
        }

        /**
         * @param scmIpRestrictions A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scmIpRestrictions(Output<List<GetStandardSiteConfigScmIpRestrictionArgs>> scmIpRestrictions) {
            $.scmIpRestrictions = scmIpRestrictions;
            return this;
        }

        /**
         * @param scmIpRestrictions A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scmIpRestrictions(List<GetStandardSiteConfigScmIpRestrictionArgs> scmIpRestrictions) {
            return scmIpRestrictions(Output.of(scmIpRestrictions));
        }

        /**
         * @param scmIpRestrictions A list of `scm_ip_restriction` objects representing SCM IP restrictions as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scmIpRestrictions(GetStandardSiteConfigScmIpRestrictionArgs... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }

        /**
         * @param scmMinTlsVersion The minimum version of TLS required for SSL requests to the SCM site.
         * 
         * @return builder
         * 
         */
        public Builder scmMinTlsVersion(Output<String> scmMinTlsVersion) {
            $.scmMinTlsVersion = scmMinTlsVersion;
            return this;
        }

        /**
         * @param scmMinTlsVersion The minimum version of TLS required for SSL requests to the SCM site.
         * 
         * @return builder
         * 
         */
        public Builder scmMinTlsVersion(String scmMinTlsVersion) {
            return scmMinTlsVersion(Output.of(scmMinTlsVersion));
        }

        /**
         * @param scmType The type of Source Control used by the Logic App in use by the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder scmType(Output<String> scmType) {
            $.scmType = scmType;
            return this;
        }

        /**
         * @param scmType The type of Source Control used by the Logic App in use by the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder scmType(String scmType) {
            return scmType(Output.of(scmType));
        }

        /**
         * @param scmUseMainIpRestriction Should the Logic App `ip_restriction` configuration be used for the SCM too.
         * 
         * @return builder
         * 
         */
        public Builder scmUseMainIpRestriction(@Nullable Output<Boolean> scmUseMainIpRestriction) {
            $.scmUseMainIpRestriction = scmUseMainIpRestriction;
            return this;
        }

        /**
         * @param scmUseMainIpRestriction Should the Logic App `ip_restriction` configuration be used for the SCM too.
         * 
         * @return builder
         * 
         */
        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            return scmUseMainIpRestriction(Output.of(scmUseMainIpRestriction));
        }

        /**
         * @param use32BitWorkerProcess Should the Logic App run in 32 bit mode, rather than 64 bit mode?
         * 
         * @return builder
         * 
         */
        public Builder use32BitWorkerProcess(@Nullable Output<Boolean> use32BitWorkerProcess) {
            $.use32BitWorkerProcess = use32BitWorkerProcess;
            return this;
        }

        /**
         * @param use32BitWorkerProcess Should the Logic App run in 32 bit mode, rather than 64 bit mode?
         * 
         * @return builder
         * 
         */
        public Builder use32BitWorkerProcess(Boolean use32BitWorkerProcess) {
            return use32BitWorkerProcess(Output.of(use32BitWorkerProcess));
        }

        /**
         * @param vnetRouteAllEnabled Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
         * 
         * @return builder
         * 
         */
        public Builder vnetRouteAllEnabled(Output<Boolean> vnetRouteAllEnabled) {
            $.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }

        /**
         * @param vnetRouteAllEnabled Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
         * 
         * @return builder
         * 
         */
        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            return vnetRouteAllEnabled(Output.of(vnetRouteAllEnabled));
        }

        /**
         * @param websocketsEnabled Should WebSockets be enabled?
         * 
         * @return builder
         * 
         */
        public Builder websocketsEnabled(@Nullable Output<Boolean> websocketsEnabled) {
            $.websocketsEnabled = websocketsEnabled;
            return this;
        }

        /**
         * @param websocketsEnabled Should WebSockets be enabled?
         * 
         * @return builder
         * 
         */
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            return websocketsEnabled(Output.of(websocketsEnabled));
        }

        public GetStandardSiteConfigArgs build() {
            if ($.appScaleLimit == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "appScaleLimit");
            }
            if ($.autoSwapSlotName == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "autoSwapSlotName");
            }
            if ($.cors == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "cors");
            }
            if ($.elasticInstanceMinimum == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "elasticInstanceMinimum");
            }
            if ($.ftpsState == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "ftpsState");
            }
            if ($.ipRestrictions == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "ipRestrictions");
            }
            if ($.linuxFxVersion == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "linuxFxVersion");
            }
            if ($.minTlsVersion == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "minTlsVersion");
            }
            if ($.preWarmedInstanceCount == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "preWarmedInstanceCount");
            }
            if ($.publicNetworkAccessEnabled == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "publicNetworkAccessEnabled");
            }
            if ($.scmIpRestrictions == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "scmIpRestrictions");
            }
            if ($.scmMinTlsVersion == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "scmMinTlsVersion");
            }
            if ($.scmType == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "scmType");
            }
            if ($.vnetRouteAllEnabled == null) {
                throw new MissingRequiredPropertyException("GetStandardSiteConfigArgs", "vnetRouteAllEnabled");
            }
            return $;
        }
    }

}
