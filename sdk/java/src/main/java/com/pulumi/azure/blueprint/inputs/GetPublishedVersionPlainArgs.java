// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublishedVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublishedVersionPlainArgs Empty = new GetPublishedVersionPlainArgs();

    /**
     * The name of the Blueprint Definition
     * 
     */
    @Import(name="blueprintName", required=true)
    private String blueprintName;

    /**
     * @return The name of the Blueprint Definition
     * 
     */
    public String blueprintName() {
        return this.blueprintName;
    }

    /**
     * The ID of the Management Group / Subscription where this Blueprint Definition is stored.
     * 
     */
    @Import(name="scopeId", required=true)
    private String scopeId;

    /**
     * @return The ID of the Management Group / Subscription where this Blueprint Definition is stored.
     * 
     */
    public String scopeId() {
        return this.scopeId;
    }

    /**
     * The Version name of the Published Version of the Blueprint Definition
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The Version name of the Published Version of the Blueprint Definition
     * 
     */
    public String version() {
        return this.version;
    }

    private GetPublishedVersionPlainArgs() {}

    private GetPublishedVersionPlainArgs(GetPublishedVersionPlainArgs $) {
        this.blueprintName = $.blueprintName;
        this.scopeId = $.scopeId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublishedVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublishedVersionPlainArgs $;

        public Builder() {
            $ = new GetPublishedVersionPlainArgs();
        }

        public Builder(GetPublishedVersionPlainArgs defaults) {
            $ = new GetPublishedVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprintName The name of the Blueprint Definition
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(String blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        /**
         * @param scopeId The ID of the Management Group / Subscription where this Blueprint Definition is stored.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(String scopeId) {
            $.scopeId = scopeId;
            return this;
        }

        /**
         * @param version The Version name of the Published Version of the Blueprint Definition
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public GetPublishedVersionPlainArgs build() {
            $.blueprintName = Objects.requireNonNull($.blueprintName, "expected parameter 'blueprintName' to be non-null");
            $.scopeId = Objects.requireNonNull($.scopeId, "expected parameter 'scopeId' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}