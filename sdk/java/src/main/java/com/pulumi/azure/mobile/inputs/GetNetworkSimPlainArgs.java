// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkSimPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkSimPlainArgs Empty = new GetNetworkSimPlainArgs();

    /**
     * The ID of the Mobile Network which the Mobile Network Sim belongs to.
     * 
     */
    @Import(name="mobileNetworkSimGroupId", required=true)
    private String mobileNetworkSimGroupId;

    /**
     * @return The ID of the Mobile Network which the Mobile Network Sim belongs to.
     * 
     */
    public String mobileNetworkSimGroupId() {
        return this.mobileNetworkSimGroupId;
    }

    /**
     * The name which should be used for this Mobile Network Sim.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name which should be used for this Mobile Network Sim.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetNetworkSimPlainArgs() {}

    private GetNetworkSimPlainArgs(GetNetworkSimPlainArgs $) {
        this.mobileNetworkSimGroupId = $.mobileNetworkSimGroupId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkSimPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkSimPlainArgs $;

        public Builder() {
            $ = new GetNetworkSimPlainArgs();
        }

        public Builder(GetNetworkSimPlainArgs defaults) {
            $ = new GetNetworkSimPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkSimGroupId The ID of the Mobile Network which the Mobile Network Sim belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkSimGroupId(String mobileNetworkSimGroupId) {
            $.mobileNetworkSimGroupId = mobileNetworkSimGroupId;
            return this;
        }

        /**
         * @param name The name which should be used for this Mobile Network Sim.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetNetworkSimPlainArgs build() {
            if ($.mobileNetworkSimGroupId == null) {
                throw new MissingRequiredPropertyException("GetNetworkSimPlainArgs", "mobileNetworkSimGroupId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNetworkSimPlainArgs", "name");
            }
            return $;
        }
    }

}
