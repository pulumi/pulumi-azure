// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.connections.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedApiArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedApiArgs Empty = new GetManagedApiArgs();

    /**
     * The Azure location for this Managed API.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The Azure location for this Managed API.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Specifies the name of the Managed API.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Managed API.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetManagedApiArgs() {}

    private GetManagedApiArgs(GetManagedApiArgs $) {
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedApiArgs $;

        public Builder() {
            $ = new GetManagedApiArgs();
        }

        public Builder(GetManagedApiArgs defaults) {
            $ = new GetManagedApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure location for this Managed API.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location for this Managed API.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Managed API.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Managed API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetManagedApiArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetManagedApiArgs", "location");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetManagedApiArgs", "name");
            }
            return $;
        }
    }

}
