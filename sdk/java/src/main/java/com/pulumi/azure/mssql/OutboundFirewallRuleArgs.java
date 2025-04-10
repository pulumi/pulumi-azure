// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutboundFirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutboundFirewallRuleArgs Empty = new OutboundFirewallRuleArgs();

    /**
     * The name of the outbound firewall rule. This should be a FQDN. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the outbound firewall rule. This should be a FQDN. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of the SQL Server on which to create the Outbound Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<String> serverId;

    /**
     * @return The resource ID of the SQL Server on which to create the Outbound Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    private OutboundFirewallRuleArgs() {}

    private OutboundFirewallRuleArgs(OutboundFirewallRuleArgs $) {
        this.name = $.name;
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutboundFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutboundFirewallRuleArgs $;

        public Builder() {
            $ = new OutboundFirewallRuleArgs();
        }

        public Builder(OutboundFirewallRuleArgs defaults) {
            $ = new OutboundFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the outbound firewall rule. This should be a FQDN. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the outbound firewall rule. This should be a FQDN. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serverId The resource ID of the SQL Server on which to create the Outbound Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The resource ID of the SQL Server on which to create the Outbound Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        public OutboundFirewallRuleArgs build() {
            if ($.serverId == null) {
                throw new MissingRequiredPropertyException("OutboundFirewallRuleArgs", "serverId");
            }
            return $;
        }
    }

}
