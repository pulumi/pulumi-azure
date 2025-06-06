// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs Empty = new LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs();

    /**
     * A list of Backend Address Pools ID&#39;s from a Application Gateway which this Virtual Machine Scale Set should be connected to.
     * 
     */
    @Import(name="applicationGatewayBackendAddressPoolIds")
    private @Nullable Output<List<String>> applicationGatewayBackendAddressPoolIds;

    /**
     * @return A list of Backend Address Pools ID&#39;s from a Application Gateway which this Virtual Machine Scale Set should be connected to.
     * 
     */
    public Optional<Output<List<String>>> applicationGatewayBackendAddressPoolIds() {
        return Optional.ofNullable(this.applicationGatewayBackendAddressPoolIds);
    }

    /**
     * A list of Application Security Group ID&#39;s which this Virtual Machine Scale Set should be connected to.
     * 
     */
    @Import(name="applicationSecurityGroupIds")
    private @Nullable Output<List<String>> applicationSecurityGroupIds;

    /**
     * @return A list of Application Security Group ID&#39;s which this Virtual Machine Scale Set should be connected to.
     * 
     */
    public Optional<Output<List<String>>> applicationSecurityGroupIds() {
        return Optional.ofNullable(this.applicationSecurityGroupIds);
    }

    /**
     * A list of Backend Address Pools ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
     * 
     * &gt; **Note:** When the Virtual Machine Scale Set is configured to have public IPs per instance are created with a load balancer, the SKU of the Virtual Machine instance IPs is determined by the SKU of the Virtual Machine Scale Sets Load Balancer (e.g. `Basic` or `Standard`). Alternatively, you may use the `public_ip_prefix_id` field to generate instance-level IPs in a virtual machine scale set as well. The zonal properties of the prefix will be passed to the Virtual Machine instance IPs, though they will not be shown in the output. To view the public IP addresses assigned to the Virtual Machine Scale Sets Virtual Machine instances use the **az vmss list-instance-public-ips --resource-group `ResourceGroupName` --name `VirtualMachineScaleSetName`** CLI command.
     * 
     * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
     * 
     */
    @Import(name="loadBalancerBackendAddressPoolIds")
    private @Nullable Output<List<String>> loadBalancerBackendAddressPoolIds;

    /**
     * @return A list of Backend Address Pools ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
     * 
     * &gt; **Note:** When the Virtual Machine Scale Set is configured to have public IPs per instance are created with a load balancer, the SKU of the Virtual Machine instance IPs is determined by the SKU of the Virtual Machine Scale Sets Load Balancer (e.g. `Basic` or `Standard`). Alternatively, you may use the `public_ip_prefix_id` field to generate instance-level IPs in a virtual machine scale set as well. The zonal properties of the prefix will be passed to the Virtual Machine instance IPs, though they will not be shown in the output. To view the public IP addresses assigned to the Virtual Machine Scale Sets Virtual Machine instances use the **az vmss list-instance-public-ips --resource-group `ResourceGroupName` --name `VirtualMachineScaleSetName`** CLI command.
     * 
     * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
     * 
     */
    public Optional<Output<List<String>>> loadBalancerBackendAddressPoolIds() {
        return Optional.ofNullable(this.loadBalancerBackendAddressPoolIds);
    }

    /**
     * A list of NAT Rule ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
     * 
     * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
     * 
     */
    @Import(name="loadBalancerInboundNatRulesIds")
    private @Nullable Output<List<String>> loadBalancerInboundNatRulesIds;

    /**
     * @return A list of NAT Rule ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
     * 
     * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
     * 
     */
    public Optional<Output<List<String>>> loadBalancerInboundNatRulesIds() {
        return Optional.ofNullable(this.loadBalancerInboundNatRulesIds);
    }

    /**
     * The Name which should be used for this IP Configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name which should be used for this IP Configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Is this the Primary IP Configuration for this Network Interface? Defaults to `false`.
     * 
     * &gt; **Note:** One `ip_configuration` block must be marked as Primary for each Network Interface.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Is this the Primary IP Configuration for this Network Interface? Defaults to `false`.
     * 
     * &gt; **Note:** One `ip_configuration` block must be marked as Primary for each Network Interface.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * A `public_ip_address` block as defined below.
     * 
     */
    @Import(name="publicIpAddresses")
    private @Nullable Output<List<LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs>> publicIpAddresses;

    /**
     * @return A `public_ip_address` block as defined below.
     * 
     */
    public Optional<Output<List<LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs>>> publicIpAddresses() {
        return Optional.ofNullable(this.publicIpAddresses);
    }

    /**
     * The ID of the Subnet which this IP Configuration should be connected to.
     * 
     * &gt; **Note:** `subnet_id` is required if `version` is set to `IPv4`.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet which this IP Configuration should be connected to.
     * 
     * &gt; **Note:** `subnet_id` is required if `version` is set to `IPv4`.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The Internet Protocol Version which should be used for this IP Configuration. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Internet Protocol Version which should be used for this IP Configuration. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs() {}

    private LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs $) {
        this.applicationGatewayBackendAddressPoolIds = $.applicationGatewayBackendAddressPoolIds;
        this.applicationSecurityGroupIds = $.applicationSecurityGroupIds;
        this.loadBalancerBackendAddressPoolIds = $.loadBalancerBackendAddressPoolIds;
        this.loadBalancerInboundNatRulesIds = $.loadBalancerInboundNatRulesIds;
        this.name = $.name;
        this.primary = $.primary;
        this.publicIpAddresses = $.publicIpAddresses;
        this.subnetId = $.subnetId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs $;

        public Builder() {
            $ = new LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs();
        }

        public Builder(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs defaults) {
            $ = new LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGatewayBackendAddressPoolIds A list of Backend Address Pools ID&#39;s from a Application Gateway which this Virtual Machine Scale Set should be connected to.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPoolIds(@Nullable Output<List<String>> applicationGatewayBackendAddressPoolIds) {
            $.applicationGatewayBackendAddressPoolIds = applicationGatewayBackendAddressPoolIds;
            return this;
        }

        /**
         * @param applicationGatewayBackendAddressPoolIds A list of Backend Address Pools ID&#39;s from a Application Gateway which this Virtual Machine Scale Set should be connected to.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPoolIds(List<String> applicationGatewayBackendAddressPoolIds) {
            return applicationGatewayBackendAddressPoolIds(Output.of(applicationGatewayBackendAddressPoolIds));
        }

        /**
         * @param applicationGatewayBackendAddressPoolIds A list of Backend Address Pools ID&#39;s from a Application Gateway which this Virtual Machine Scale Set should be connected to.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPoolIds(String... applicationGatewayBackendAddressPoolIds) {
            return applicationGatewayBackendAddressPoolIds(List.of(applicationGatewayBackendAddressPoolIds));
        }

        /**
         * @param applicationSecurityGroupIds A list of Application Security Group ID&#39;s which this Virtual Machine Scale Set should be connected to.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroupIds(@Nullable Output<List<String>> applicationSecurityGroupIds) {
            $.applicationSecurityGroupIds = applicationSecurityGroupIds;
            return this;
        }

        /**
         * @param applicationSecurityGroupIds A list of Application Security Group ID&#39;s which this Virtual Machine Scale Set should be connected to.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroupIds(List<String> applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(Output.of(applicationSecurityGroupIds));
        }

        /**
         * @param applicationSecurityGroupIds A list of Application Security Group ID&#39;s which this Virtual Machine Scale Set should be connected to.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroupIds(String... applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(List.of(applicationSecurityGroupIds));
        }

        /**
         * @param loadBalancerBackendAddressPoolIds A list of Backend Address Pools ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
         * 
         * &gt; **Note:** When the Virtual Machine Scale Set is configured to have public IPs per instance are created with a load balancer, the SKU of the Virtual Machine instance IPs is determined by the SKU of the Virtual Machine Scale Sets Load Balancer (e.g. `Basic` or `Standard`). Alternatively, you may use the `public_ip_prefix_id` field to generate instance-level IPs in a virtual machine scale set as well. The zonal properties of the prefix will be passed to the Virtual Machine instance IPs, though they will not be shown in the output. To view the public IP addresses assigned to the Virtual Machine Scale Sets Virtual Machine instances use the **az vmss list-instance-public-ips --resource-group `ResourceGroupName` --name `VirtualMachineScaleSetName`** CLI command.
         * 
         * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolIds(@Nullable Output<List<String>> loadBalancerBackendAddressPoolIds) {
            $.loadBalancerBackendAddressPoolIds = loadBalancerBackendAddressPoolIds;
            return this;
        }

        /**
         * @param loadBalancerBackendAddressPoolIds A list of Backend Address Pools ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
         * 
         * &gt; **Note:** When the Virtual Machine Scale Set is configured to have public IPs per instance are created with a load balancer, the SKU of the Virtual Machine instance IPs is determined by the SKU of the Virtual Machine Scale Sets Load Balancer (e.g. `Basic` or `Standard`). Alternatively, you may use the `public_ip_prefix_id` field to generate instance-level IPs in a virtual machine scale set as well. The zonal properties of the prefix will be passed to the Virtual Machine instance IPs, though they will not be shown in the output. To view the public IP addresses assigned to the Virtual Machine Scale Sets Virtual Machine instances use the **az vmss list-instance-public-ips --resource-group `ResourceGroupName` --name `VirtualMachineScaleSetName`** CLI command.
         * 
         * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolIds(List<String> loadBalancerBackendAddressPoolIds) {
            return loadBalancerBackendAddressPoolIds(Output.of(loadBalancerBackendAddressPoolIds));
        }

        /**
         * @param loadBalancerBackendAddressPoolIds A list of Backend Address Pools ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
         * 
         * &gt; **Note:** When the Virtual Machine Scale Set is configured to have public IPs per instance are created with a load balancer, the SKU of the Virtual Machine instance IPs is determined by the SKU of the Virtual Machine Scale Sets Load Balancer (e.g. `Basic` or `Standard`). Alternatively, you may use the `public_ip_prefix_id` field to generate instance-level IPs in a virtual machine scale set as well. The zonal properties of the prefix will be passed to the Virtual Machine instance IPs, though they will not be shown in the output. To view the public IP addresses assigned to the Virtual Machine Scale Sets Virtual Machine instances use the **az vmss list-instance-public-ips --resource-group `ResourceGroupName` --name `VirtualMachineScaleSetName`** CLI command.
         * 
         * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolIds(String... loadBalancerBackendAddressPoolIds) {
            return loadBalancerBackendAddressPoolIds(List.of(loadBalancerBackendAddressPoolIds));
        }

        /**
         * @param loadBalancerInboundNatRulesIds A list of NAT Rule ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
         * 
         * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatRulesIds(@Nullable Output<List<String>> loadBalancerInboundNatRulesIds) {
            $.loadBalancerInboundNatRulesIds = loadBalancerInboundNatRulesIds;
            return this;
        }

        /**
         * @param loadBalancerInboundNatRulesIds A list of NAT Rule ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
         * 
         * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatRulesIds(List<String> loadBalancerInboundNatRulesIds) {
            return loadBalancerInboundNatRulesIds(Output.of(loadBalancerInboundNatRulesIds));
        }

        /**
         * @param loadBalancerInboundNatRulesIds A list of NAT Rule ID&#39;s from a Load Balancer which this Virtual Machine Scale Set should be connected to.
         * 
         * &gt; **Note:** When using this field you&#39;ll also need to configure a Rule for the Load Balancer, and use a `depends_on` between this resource and the Load Balancer Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatRulesIds(String... loadBalancerInboundNatRulesIds) {
            return loadBalancerInboundNatRulesIds(List.of(loadBalancerInboundNatRulesIds));
        }

        /**
         * @param name The Name which should be used for this IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name which should be used for this IP Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primary Is this the Primary IP Configuration for this Network Interface? Defaults to `false`.
         * 
         * &gt; **Note:** One `ip_configuration` block must be marked as Primary for each Network Interface.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Is this the Primary IP Configuration for this Network Interface? Defaults to `false`.
         * 
         * &gt; **Note:** One `ip_configuration` block must be marked as Primary for each Network Interface.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param publicIpAddresses A `public_ip_address` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(@Nullable Output<List<LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs>> publicIpAddresses) {
            $.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * @param publicIpAddresses A `public_ip_address` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(List<LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs> publicIpAddresses) {
            return publicIpAddresses(Output.of(publicIpAddresses));
        }

        /**
         * @param publicIpAddresses A `public_ip_address` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }

        /**
         * @param subnetId The ID of the Subnet which this IP Configuration should be connected to.
         * 
         * &gt; **Note:** `subnet_id` is required if `version` is set to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet which this IP Configuration should be connected to.
         * 
         * &gt; **Note:** `subnet_id` is required if `version` is set to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param version The Internet Protocol Version which should be used for this IP Configuration. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Internet Protocol Version which should be used for this IP Configuration. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs", "name");
            }
            return $;
        }
    }

}
