// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.oracle.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGiVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGiVersionsArgs Empty = new GetGiVersionsArgs();

    /**
     * The Azure Region to query for the GI Versions in.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The Azure Region to query for the GI Versions in.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    private GetGiVersionsArgs() {}

    private GetGiVersionsArgs(GetGiVersionsArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGiVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGiVersionsArgs $;

        public Builder() {
            $ = new GetGiVersionsArgs();
        }

        public Builder(GetGiVersionsArgs defaults) {
            $ = new GetGiVersionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region to query for the GI Versions in.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region to query for the GI Versions in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public GetGiVersionsArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetGiVersionsArgs", "location");
            }
            return $;
        }
    }

}
