// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLabPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabPlainArgs Empty = new GetLabPlainArgs();

    /**
     * The name of the Dev Test Lab.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Dev Test Lab.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the Dev Test Lab exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where the Dev Test Lab exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLabPlainArgs() {}

    private GetLabPlainArgs(GetLabPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabPlainArgs $;

        public Builder() {
            $ = new GetLabPlainArgs();
        }

        public Builder(GetLabPlainArgs defaults) {
            $ = new GetLabPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the Dev Test Lab exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLabPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}