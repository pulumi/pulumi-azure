// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleServerFirewallRuleState extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleServerFirewallRuleState Empty = new FlexibleServerFirewallRuleState();

    /**
     * Specifies the End IP Address associated with this Firewall Rule.
     * 
     * &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0` which ([is documented in the Azure API Docs](https://docs.microsoft.com/rest/api/sql/firewallrules/createorupdate)).
     * 
     */
    @Import(name="endIpAddress")
    private @Nullable Output<String> endIpAddress;

    /**
     * @return Specifies the End IP Address associated with this Firewall Rule.
     * 
     * &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0` which ([is documented in the Azure API Docs](https://docs.microsoft.com/rest/api/sql/firewallrules/createorupdate)).
     * 
     */
    public Optional<Output<String>> endIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }

    /**
     * Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * Specifies the Start IP Address associated with this Firewall Rule.
     * 
     */
    @Import(name="startIpAddress")
    private @Nullable Output<String> startIpAddress;

    /**
     * @return Specifies the Start IP Address associated with this Firewall Rule.
     * 
     */
    public Optional<Output<String>> startIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }

    private FlexibleServerFirewallRuleState() {}

    private FlexibleServerFirewallRuleState(FlexibleServerFirewallRuleState $) {
        this.endIpAddress = $.endIpAddress;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.startIpAddress = $.startIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleServerFirewallRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleServerFirewallRuleState $;

        public Builder() {
            $ = new FlexibleServerFirewallRuleState();
        }

        public Builder(FlexibleServerFirewallRuleState defaults) {
            $ = new FlexibleServerFirewallRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIpAddress Specifies the End IP Address associated with this Firewall Rule.
         * 
         * &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0` which ([is documented in the Azure API Docs](https://docs.microsoft.com/rest/api/sql/firewallrules/createorupdate)).
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(@Nullable Output<String> endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        /**
         * @param endIpAddress Specifies the End IP Address associated with this Firewall Rule.
         * 
         * &gt; **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0` which ([is documented in the Azure API Docs](https://docs.microsoft.com/rest/api/sql/firewallrules/createorupdate)).
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(String endIpAddress) {
            return endIpAddress(Output.of(endIpAddress));
        }

        /**
         * @param name Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param startIpAddress Specifies the Start IP Address associated with this Firewall Rule.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(@Nullable Output<String> startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        /**
         * @param startIpAddress Specifies the Start IP Address associated with this Firewall Rule.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(String startIpAddress) {
            return startIpAddress(Output.of(startIpAddress));
        }

        public FlexibleServerFirewallRuleState build() {
            return $;
        }
    }

}
