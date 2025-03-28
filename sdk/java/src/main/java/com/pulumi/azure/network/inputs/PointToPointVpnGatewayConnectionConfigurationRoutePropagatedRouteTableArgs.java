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


public final class PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs Empty = new PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs();

    /**
     * The list of Virtual Hub Route Table resource id which the routes will be propagated to.
     * 
     */
    @Import(name="ids", required=true)
    private Output<List<String>> ids;

    /**
     * @return The list of Virtual Hub Route Table resource id which the routes will be propagated to.
     * 
     */
    public Output<List<String>> ids() {
        return this.ids;
    }

    /**
     * The list of labels to logically group Virtual Hub Route Tables which the routes will be propagated to.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return The list of labels to logically group Virtual Hub Route Tables which the routes will be propagated to.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs() {}

    private PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs(PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs $) {
        this.ids = $.ids;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs $;

        public Builder() {
            $ = new PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs();
        }

        public Builder(PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs defaults) {
            $ = new PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids The list of Virtual Hub Route Table resource id which the routes will be propagated to.
         * 
         * @return builder
         * 
         */
        public Builder ids(Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids The list of Virtual Hub Route Table resource id which the routes will be propagated to.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids The list of Virtual Hub Route Table resource id which the routes will be propagated to.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param labels The list of labels to logically group Virtual Hub Route Tables which the routes will be propagated to.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The list of labels to logically group Virtual Hub Route Tables which the routes will be propagated to.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels The list of labels to logically group Virtual Hub Route Tables which the routes will be propagated to.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        public PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs build() {
            if ($.ids == null) {
                throw new MissingRequiredPropertyException("PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableArgs", "ids");
            }
            return $;
        }
    }

}
