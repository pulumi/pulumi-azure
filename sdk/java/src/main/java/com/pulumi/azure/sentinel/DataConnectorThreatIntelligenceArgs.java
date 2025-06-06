// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectorThreatIntelligenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectorThreatIntelligenceArgs Empty = new DataConnectorThreatIntelligenceArgs();

    /**
     * The ID of the Log Analytics Workspace that this Threat Intelligence Data Connector resides in. Changing this forces a new Threat Intelligence Data Connector to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this Threat Intelligence Data Connector resides in. Changing this forces a new Threat Intelligence Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The lookback date for the this Threat Intelligence Data Connector in RFC3339. Defaults to `1970-01-01T00:00:00Z`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="lookbackDate")
    private @Nullable Output<String> lookbackDate;

    /**
     * @return The lookback date for the this Threat Intelligence Data Connector in RFC3339. Defaults to `1970-01-01T00:00:00Z`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> lookbackDate() {
        return Optional.ofNullable(this.lookbackDate);
    }

    /**
     * The name which should be used for this Threat Intelligence Data Connector. Changing this forces a new Threat Intelligence Data Connector to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Threat Intelligence Data Connector. Changing this forces a new Threat Intelligence Data Connector to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the tenant that this Threat Intelligence Data Connector connects to. Changing this forces a new Threat Intelligence Data Connector to be created.
     * 
     * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The ID of the tenant that this Threat Intelligence Data Connector connects to. Changing this forces a new Threat Intelligence Data Connector to be created.
     * 
     * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private DataConnectorThreatIntelligenceArgs() {}

    private DataConnectorThreatIntelligenceArgs(DataConnectorThreatIntelligenceArgs $) {
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.lookbackDate = $.lookbackDate;
        this.name = $.name;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectorThreatIntelligenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectorThreatIntelligenceArgs $;

        public Builder() {
            $ = new DataConnectorThreatIntelligenceArgs();
        }

        public Builder(DataConnectorThreatIntelligenceArgs defaults) {
            $ = new DataConnectorThreatIntelligenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this Threat Intelligence Data Connector resides in. Changing this forces a new Threat Intelligence Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this Threat Intelligence Data Connector resides in. Changing this forces a new Threat Intelligence Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param lookbackDate The lookback date for the this Threat Intelligence Data Connector in RFC3339. Defaults to `1970-01-01T00:00:00Z`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder lookbackDate(@Nullable Output<String> lookbackDate) {
            $.lookbackDate = lookbackDate;
            return this;
        }

        /**
         * @param lookbackDate The lookback date for the this Threat Intelligence Data Connector in RFC3339. Defaults to `1970-01-01T00:00:00Z`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder lookbackDate(String lookbackDate) {
            return lookbackDate(Output.of(lookbackDate));
        }

        /**
         * @param name The name which should be used for this Threat Intelligence Data Connector. Changing this forces a new Threat Intelligence Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Threat Intelligence Data Connector. Changing this forces a new Threat Intelligence Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tenantId The ID of the tenant that this Threat Intelligence Data Connector connects to. Changing this forces a new Threat Intelligence Data Connector to be created.
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
         * @param tenantId The ID of the tenant that this Threat Intelligence Data Connector connects to. Changing this forces a new Threat Intelligence Data Connector to be created.
         * 
         * &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public DataConnectorThreatIntelligenceArgs build() {
            if ($.logAnalyticsWorkspaceId == null) {
                throw new MissingRequiredPropertyException("DataConnectorThreatIntelligenceArgs", "logAnalyticsWorkspaceId");
            }
            return $;
        }
    }

}
