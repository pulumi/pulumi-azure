// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPoolPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPoolPlainArgs Empty = new GetPoolPlainArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the endpoint.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPoolPlainArgs() {}

    private GetPoolPlainArgs(GetPoolPlainArgs $) {
        this.accountName = $.accountName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPoolPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPoolPlainArgs $;

        public Builder() {
            $ = new GetPoolPlainArgs();
        }

        public Builder(GetPoolPlainArgs defaults) {
            $ = new GetPoolPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPoolPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}