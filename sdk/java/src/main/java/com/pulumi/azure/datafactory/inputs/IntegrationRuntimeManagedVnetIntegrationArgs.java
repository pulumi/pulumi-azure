// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IntegrationRuntimeManagedVnetIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeManagedVnetIntegrationArgs Empty = new IntegrationRuntimeManagedVnetIntegrationArgs();

    /**
     * Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    @Import(name="subnetName", required=true)
    private Output<String> subnetName;

    /**
     * @return Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    public Output<String> subnetName() {
        return this.subnetName;
    }

    /**
     * ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    @Import(name="vnetId", required=true)
    private Output<String> vnetId;

    /**
     * @return ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
     * 
     */
    public Output<String> vnetId() {
        return this.vnetId;
    }

    private IntegrationRuntimeManagedVnetIntegrationArgs() {}

    private IntegrationRuntimeManagedVnetIntegrationArgs(IntegrationRuntimeManagedVnetIntegrationArgs $) {
        this.subnetName = $.subnetName;
        this.vnetId = $.vnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeManagedVnetIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeManagedVnetIntegrationArgs $;

        public Builder() {
            $ = new IntegrationRuntimeManagedVnetIntegrationArgs();
        }

        public Builder(IntegrationRuntimeManagedVnetIntegrationArgs defaults) {
            $ = new IntegrationRuntimeManagedVnetIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetName Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(Output<String> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        /**
         * @param subnetName Name of the subnet to which the nodes of the Managed Integration Runtime will be added.
         * 
         * @return builder
         * 
         */
        public Builder subnetName(String subnetName) {
            return subnetName(Output.of(subnetName));
        }

        /**
         * @param vnetId ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
         * 
         * @return builder
         * 
         */
        public Builder vnetId(Output<String> vnetId) {
            $.vnetId = vnetId;
            return this;
        }

        /**
         * @param vnetId ID of the virtual network to which the nodes of the Managed Integration Runtime will be added.
         * 
         * @return builder
         * 
         */
        public Builder vnetId(String vnetId) {
            return vnetId(Output.of(vnetId));
        }

        public IntegrationRuntimeManagedVnetIntegrationArgs build() {
            $.subnetName = Objects.requireNonNull($.subnetName, "expected parameter 'subnetName' to be non-null");
            $.vnetId = Objects.requireNonNull($.vnetId, "expected parameter 'vnetId' to be non-null");
            return $;
        }
    }

}