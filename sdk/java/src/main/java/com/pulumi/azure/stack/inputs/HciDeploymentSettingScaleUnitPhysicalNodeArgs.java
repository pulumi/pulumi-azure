// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.stack.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class HciDeploymentSettingScaleUnitPhysicalNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final HciDeploymentSettingScaleUnitPhysicalNodeArgs Empty = new HciDeploymentSettingScaleUnitPhysicalNodeArgs();

    /**
     * Specifies the IPv4 address assigned to each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    @Import(name="ipv4Address", required=true)
    private Output<String> ipv4Address;

    /**
     * @return Specifies the IPv4 address assigned to each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    public Output<String> ipv4Address() {
        return this.ipv4Address;
    }

    /**
     * The NETBIOS name of each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The NETBIOS name of each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private HciDeploymentSettingScaleUnitPhysicalNodeArgs() {}

    private HciDeploymentSettingScaleUnitPhysicalNodeArgs(HciDeploymentSettingScaleUnitPhysicalNodeArgs $) {
        this.ipv4Address = $.ipv4Address;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HciDeploymentSettingScaleUnitPhysicalNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HciDeploymentSettingScaleUnitPhysicalNodeArgs $;

        public Builder() {
            $ = new HciDeploymentSettingScaleUnitPhysicalNodeArgs();
        }

        public Builder(HciDeploymentSettingScaleUnitPhysicalNodeArgs defaults) {
            $ = new HciDeploymentSettingScaleUnitPhysicalNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv4Address Specifies the IPv4 address assigned to each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address Specifies the IPv4 address assigned to each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        /**
         * @param name The NETBIOS name of each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The NETBIOS name of each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public HciDeploymentSettingScaleUnitPhysicalNodeArgs build() {
            if ($.ipv4Address == null) {
                throw new MissingRequiredPropertyException("HciDeploymentSettingScaleUnitPhysicalNodeArgs", "ipv4Address");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("HciDeploymentSettingScaleUnitPhysicalNodeArgs", "name");
            }
            return $;
        }
    }

}
