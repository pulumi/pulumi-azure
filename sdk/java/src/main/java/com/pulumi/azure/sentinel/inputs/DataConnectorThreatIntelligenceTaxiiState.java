// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectorThreatIntelligenceTaxiiState extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectorThreatIntelligenceTaxiiState Empty = new DataConnectorThreatIntelligenceTaxiiState();

    /**
     * The API root URI of the TAXII server.
     * 
     */
    @Import(name="apiRootUrl")
    private @Nullable Output<String> apiRootUrl;

    /**
     * @return The API root URI of the TAXII server.
     * 
     */
    public Optional<Output<String>> apiRootUrl() {
        return Optional.ofNullable(this.apiRootUrl);
    }

    /**
     * The collection ID of the TAXII server.
     * 
     */
    @Import(name="collectionId")
    private @Nullable Output<String> collectionId;

    /**
     * @return The collection ID of the TAXII server.
     * 
     */
    public Optional<Output<String>> collectionId() {
        return Optional.ofNullable(this.collectionId);
    }

    /**
     * The friendly name which should be used for this Threat Intelligence TAXII Data Connector.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The friendly name which should be used for this Threat Intelligence TAXII Data Connector.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the Log Analytics Workspace that this Threat Intelligence TAXII Data Connector resides in. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId")
    private @Nullable Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this Threat Intelligence TAXII Data Connector resides in. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    public Optional<Output<String>> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    /**
     * The lookback date for the TAXII server in RFC3339. Defaults to `1970-01-01T00:00:00Z`.
     * 
     */
    @Import(name="lookbackDate")
    private @Nullable Output<String> lookbackDate;

    /**
     * @return The lookback date for the TAXII server in RFC3339. Defaults to `1970-01-01T00:00:00Z`.
     * 
     */
    public Optional<Output<String>> lookbackDate() {
        return Optional.ofNullable(this.lookbackDate);
    }

    /**
     * The name which should be used for this Threat Intelligence TAXII Data Connector. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Threat Intelligence TAXII Data Connector. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The password for the TAXII server.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the TAXII server.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The polling frequency for the TAXII server. Possible values are `OnceAMinute`, `OnceAnHour` and `OnceADay`. Defaults to `OnceAnHour`.
     * 
     */
    @Import(name="pollingFrequency")
    private @Nullable Output<String> pollingFrequency;

    /**
     * @return The polling frequency for the TAXII server. Possible values are `OnceAMinute`, `OnceAnHour` and `OnceADay`. Defaults to `OnceAnHour`.
     * 
     */
    public Optional<Output<String>> pollingFrequency() {
        return Optional.ofNullable(this.pollingFrequency);
    }

    /**
     * The ID of the tenant that this Threat Intelligence TAXII Data Connector connects to. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The ID of the tenant that this Threat Intelligence TAXII Data Connector connects to. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
     * 
     * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The user name for the TAXII server.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The user name for the TAXII server.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private DataConnectorThreatIntelligenceTaxiiState() {}

    private DataConnectorThreatIntelligenceTaxiiState(DataConnectorThreatIntelligenceTaxiiState $) {
        this.apiRootUrl = $.apiRootUrl;
        this.collectionId = $.collectionId;
        this.displayName = $.displayName;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.lookbackDate = $.lookbackDate;
        this.name = $.name;
        this.password = $.password;
        this.pollingFrequency = $.pollingFrequency;
        this.tenantId = $.tenantId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectorThreatIntelligenceTaxiiState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectorThreatIntelligenceTaxiiState $;

        public Builder() {
            $ = new DataConnectorThreatIntelligenceTaxiiState();
        }

        public Builder(DataConnectorThreatIntelligenceTaxiiState defaults) {
            $ = new DataConnectorThreatIntelligenceTaxiiState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiRootUrl The API root URI of the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder apiRootUrl(@Nullable Output<String> apiRootUrl) {
            $.apiRootUrl = apiRootUrl;
            return this;
        }

        /**
         * @param apiRootUrl The API root URI of the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder apiRootUrl(String apiRootUrl) {
            return apiRootUrl(Output.of(apiRootUrl));
        }

        /**
         * @param collectionId The collection ID of the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder collectionId(@Nullable Output<String> collectionId) {
            $.collectionId = collectionId;
            return this;
        }

        /**
         * @param collectionId The collection ID of the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder collectionId(String collectionId) {
            return collectionId(Output.of(collectionId));
        }

        /**
         * @param displayName The friendly name which should be used for this Threat Intelligence TAXII Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The friendly name which should be used for this Threat Intelligence TAXII Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this Threat Intelligence TAXII Data Connector resides in. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(@Nullable Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this Threat Intelligence TAXII Data Connector resides in. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param lookbackDate The lookback date for the TAXII server in RFC3339. Defaults to `1970-01-01T00:00:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder lookbackDate(@Nullable Output<String> lookbackDate) {
            $.lookbackDate = lookbackDate;
            return this;
        }

        /**
         * @param lookbackDate The lookback date for the TAXII server in RFC3339. Defaults to `1970-01-01T00:00:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder lookbackDate(String lookbackDate) {
            return lookbackDate(Output.of(lookbackDate));
        }

        /**
         * @param name The name which should be used for this Threat Intelligence TAXII Data Connector. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Threat Intelligence TAXII Data Connector. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password for the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param pollingFrequency The polling frequency for the TAXII server. Possible values are `OnceAMinute`, `OnceAnHour` and `OnceADay`. Defaults to `OnceAnHour`.
         * 
         * @return builder
         * 
         */
        public Builder pollingFrequency(@Nullable Output<String> pollingFrequency) {
            $.pollingFrequency = pollingFrequency;
            return this;
        }

        /**
         * @param pollingFrequency The polling frequency for the TAXII server. Possible values are `OnceAMinute`, `OnceAnHour` and `OnceADay`. Defaults to `OnceAnHour`.
         * 
         * @return builder
         * 
         */
        public Builder pollingFrequency(String pollingFrequency) {
            return pollingFrequency(Output.of(pollingFrequency));
        }

        /**
         * @param tenantId The ID of the tenant that this Threat Intelligence TAXII Data Connector connects to. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
         * 
         * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The ID of the tenant that this Threat Intelligence TAXII Data Connector connects to. Changing this forces a new Threat Intelligence TAXII Data Connector to be created.
         * 
         * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param userName The user name for the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name for the TAXII server.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public DataConnectorThreatIntelligenceTaxiiState build() {
            return $;
        }
    }

}
