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


public final class VirtualHubRouteTableRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubRouteTableRouteArgs Empty = new VirtualHubRouteTableRouteArgs();

    /**
     * A list of destination addresses for this route.
     * 
     */
    @Import(name="destinations", required=true)
    private Output<List<String>> destinations;

    /**
     * @return A list of destination addresses for this route.
     * 
     */
    public Output<List<String>> destinations() {
        return this.destinations;
    }

    /**
     * The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
     * 
     */
    @Import(name="destinationsType", required=true)
    private Output<String> destinationsType;

    /**
     * @return The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
     * 
     */
    public Output<String> destinationsType() {
        return this.destinationsType;
    }

    /**
     * The name which should be used for this route.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this route.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The next hop&#39;s resource ID.
     * 
     */
    @Import(name="nextHop", required=true)
    private Output<String> nextHop;

    /**
     * @return The next hop&#39;s resource ID.
     * 
     */
    public Output<String> nextHop() {
        return this.nextHop;
    }

    /**
     * The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
     * 
     * &gt; **Note:** The Routes can alternatively be created using the virtual_hub_route_table_route resource. Using both inline and external routes is not supported and may result in unexpected configuration.
     * 
     */
    @Import(name="nextHopType")
    private @Nullable Output<String> nextHopType;

    /**
     * @return The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
     * 
     * &gt; **Note:** The Routes can alternatively be created using the virtual_hub_route_table_route resource. Using both inline and external routes is not supported and may result in unexpected configuration.
     * 
     */
    public Optional<Output<String>> nextHopType() {
        return Optional.ofNullable(this.nextHopType);
    }

    private VirtualHubRouteTableRouteArgs() {}

    private VirtualHubRouteTableRouteArgs(VirtualHubRouteTableRouteArgs $) {
        this.destinations = $.destinations;
        this.destinationsType = $.destinationsType;
        this.name = $.name;
        this.nextHop = $.nextHop;
        this.nextHopType = $.nextHopType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubRouteTableRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubRouteTableRouteArgs $;

        public Builder() {
            $ = new VirtualHubRouteTableRouteArgs();
        }

        public Builder(VirtualHubRouteTableRouteArgs defaults) {
            $ = new VirtualHubRouteTableRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations A list of destination addresses for this route.
         * 
         * @return builder
         * 
         */
        public Builder destinations(Output<List<String>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations A list of destination addresses for this route.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<String> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations A list of destination addresses for this route.
         * 
         * @return builder
         * 
         */
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param destinationsType The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
         * 
         * @return builder
         * 
         */
        public Builder destinationsType(Output<String> destinationsType) {
            $.destinationsType = destinationsType;
            return this;
        }

        /**
         * @param destinationsType The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
         * 
         * @return builder
         * 
         */
        public Builder destinationsType(String destinationsType) {
            return destinationsType(Output.of(destinationsType));
        }

        /**
         * @param name The name which should be used for this route.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this route.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nextHop The next hop&#39;s resource ID.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(Output<String> nextHop) {
            $.nextHop = nextHop;
            return this;
        }

        /**
         * @param nextHop The next hop&#39;s resource ID.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(String nextHop) {
            return nextHop(Output.of(nextHop));
        }

        /**
         * @param nextHopType The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
         * 
         * &gt; **Note:** The Routes can alternatively be created using the virtual_hub_route_table_route resource. Using both inline and external routes is not supported and may result in unexpected configuration.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(@Nullable Output<String> nextHopType) {
            $.nextHopType = nextHopType;
            return this;
        }

        /**
         * @param nextHopType The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
         * 
         * &gt; **Note:** The Routes can alternatively be created using the virtual_hub_route_table_route resource. Using both inline and external routes is not supported and may result in unexpected configuration.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(String nextHopType) {
            return nextHopType(Output.of(nextHopType));
        }

        public VirtualHubRouteTableRouteArgs build() {
            if ($.destinations == null) {
                throw new MissingRequiredPropertyException("VirtualHubRouteTableRouteArgs", "destinations");
            }
            if ($.destinationsType == null) {
                throw new MissingRequiredPropertyException("VirtualHubRouteTableRouteArgs", "destinationsType");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("VirtualHubRouteTableRouteArgs", "name");
            }
            if ($.nextHop == null) {
                throw new MissingRequiredPropertyException("VirtualHubRouteTableRouteArgs", "nextHop");
            }
            return $;
        }
    }

}
