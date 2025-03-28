// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNatGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNatGatewayArgs Empty = new GetNatGatewayArgs();

    /**
     * Specifies the Name of the NAT Gateway.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the Name of the NAT Gateway.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of existing Public IP Address resource IDs which the NAT Gateway is using.
     * 
     */
    @Import(name="publicIpAddressIds")
    private @Nullable Output<List<String>> publicIpAddressIds;

    /**
     * @return A list of existing Public IP Address resource IDs which the NAT Gateway is using.
     * 
     */
    public Optional<Output<List<String>>> publicIpAddressIds() {
        return Optional.ofNullable(this.publicIpAddressIds);
    }

    /**
     * A list of existing Public IP Prefix resource IDs which the NAT Gateway is using.
     * 
     */
    @Import(name="publicIpPrefixIds")
    private @Nullable Output<List<String>> publicIpPrefixIds;

    /**
     * @return A list of existing Public IP Prefix resource IDs which the NAT Gateway is using.
     * 
     */
    public Optional<Output<List<String>>> publicIpPrefixIds() {
        return Optional.ofNullable(this.publicIpPrefixIds);
    }

    /**
     * Specifies the name of the Resource Group where the NAT Gateway exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the NAT Gateway exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNatGatewayArgs() {}

    private GetNatGatewayArgs(GetNatGatewayArgs $) {
        this.name = $.name;
        this.publicIpAddressIds = $.publicIpAddressIds;
        this.publicIpPrefixIds = $.publicIpPrefixIds;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatGatewayArgs $;

        public Builder() {
            $ = new GetNatGatewayArgs();
        }

        public Builder(GetNatGatewayArgs defaults) {
            $ = new GetNatGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the Name of the NAT Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the Name of the NAT Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicIpAddressIds A list of existing Public IP Address resource IDs which the NAT Gateway is using.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressIds(@Nullable Output<List<String>> publicIpAddressIds) {
            $.publicIpAddressIds = publicIpAddressIds;
            return this;
        }

        /**
         * @param publicIpAddressIds A list of existing Public IP Address resource IDs which the NAT Gateway is using.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressIds(List<String> publicIpAddressIds) {
            return publicIpAddressIds(Output.of(publicIpAddressIds));
        }

        /**
         * @param publicIpAddressIds A list of existing Public IP Address resource IDs which the NAT Gateway is using.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressIds(String... publicIpAddressIds) {
            return publicIpAddressIds(List.of(publicIpAddressIds));
        }

        /**
         * @param publicIpPrefixIds A list of existing Public IP Prefix resource IDs which the NAT Gateway is using.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixIds(@Nullable Output<List<String>> publicIpPrefixIds) {
            $.publicIpPrefixIds = publicIpPrefixIds;
            return this;
        }

        /**
         * @param publicIpPrefixIds A list of existing Public IP Prefix resource IDs which the NAT Gateway is using.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixIds(List<String> publicIpPrefixIds) {
            return publicIpPrefixIds(Output.of(publicIpPrefixIds));
        }

        /**
         * @param publicIpPrefixIds A list of existing Public IP Prefix resource IDs which the NAT Gateway is using.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixIds(String... publicIpPrefixIds) {
            return publicIpPrefixIds(List.of(publicIpPrefixIds));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the NAT Gateway exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the NAT Gateway exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetNatGatewayArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNatGatewayArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetNatGatewayArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
