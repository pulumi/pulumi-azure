// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devcenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCatalogArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogArgs Empty = new GetCatalogArgs();

    /**
     * Specifies the Dev Center Id within which this Dev Center Catalog should exist.
     * 
     */
    @Import(name="devCenterId", required=true)
    private Output<String> devCenterId;

    /**
     * @return Specifies the Dev Center Id within which this Dev Center Catalog should exist.
     * 
     */
    public Output<String> devCenterId() {
        return this.devCenterId;
    }

    /**
     * The name of this Dev Center Catalog.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Dev Center Catalog.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetCatalogArgs() {}

    private GetCatalogArgs(GetCatalogArgs $) {
        this.devCenterId = $.devCenterId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogArgs $;

        public Builder() {
            $ = new GetCatalogArgs();
        }

        public Builder(GetCatalogArgs defaults) {
            $ = new GetCatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param devCenterId Specifies the Dev Center Id within which this Dev Center Catalog should exist.
         * 
         * @return builder
         * 
         */
        public Builder devCenterId(Output<String> devCenterId) {
            $.devCenterId = devCenterId;
            return this;
        }

        /**
         * @param devCenterId Specifies the Dev Center Id within which this Dev Center Catalog should exist.
         * 
         * @return builder
         * 
         */
        public Builder devCenterId(String devCenterId) {
            return devCenterId(Output.of(devCenterId));
        }

        /**
         * @param name The name of this Dev Center Catalog.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Dev Center Catalog.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetCatalogArgs build() {
            if ($.devCenterId == null) {
                throw new MissingRequiredPropertyException("GetCatalogArgs", "devCenterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetCatalogArgs", "name");
            }
            return $;
        }
    }

}
