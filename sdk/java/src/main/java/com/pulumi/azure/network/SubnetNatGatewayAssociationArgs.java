// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SubnetNatGatewayAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetNatGatewayAssociationArgs Empty = new SubnetNatGatewayAssociationArgs();

    /**
     * The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="natGatewayId", required=true)
    private Output<String> natGatewayId;

    /**
     * @return The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> natGatewayId() {
        return this.natGatewayId;
    }

    /**
     * The ID of the Subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private SubnetNatGatewayAssociationArgs() {}

    private SubnetNatGatewayAssociationArgs(SubnetNatGatewayAssociationArgs $) {
        this.natGatewayId = $.natGatewayId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetNatGatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetNatGatewayAssociationArgs $;

        public Builder() {
            $ = new SubnetNatGatewayAssociationArgs();
        }

        public Builder(SubnetNatGatewayAssociationArgs defaults) {
            $ = new SubnetNatGatewayAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param natGatewayId The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(Output<String> natGatewayId) {
            $.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * @param natGatewayId The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(String natGatewayId) {
            return natGatewayId(Output.of(natGatewayId));
        }

        /**
         * @param subnetId The ID of the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public SubnetNatGatewayAssociationArgs build() {
            if ($.natGatewayId == null) {
                throw new MissingRequiredPropertyException("SubnetNatGatewayAssociationArgs", "natGatewayId");
            }
            if ($.subnetId == null) {
                throw new MissingRequiredPropertyException("SubnetNatGatewayAssociationArgs", "subnetId");
            }
            return $;
        }
    }

}
