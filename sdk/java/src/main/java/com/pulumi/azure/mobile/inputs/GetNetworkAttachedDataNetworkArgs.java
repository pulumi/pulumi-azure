// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkAttachedDataNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkAttachedDataNetworkArgs Empty = new GetNetworkAttachedDataNetworkArgs();

    /**
     * The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
     * 
     */
    @Import(name="mobileNetworkDataNetworkName", required=true)
    private Output<String> mobileNetworkDataNetworkName;

    /**
     * @return The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
     * 
     */
    public Output<String> mobileNetworkDataNetworkName() {
        return this.mobileNetworkDataNetworkName;
    }

    /**
     * The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
     * 
     */
    @Import(name="mobileNetworkPacketCoreDataPlaneId", required=true)
    private Output<String> mobileNetworkPacketCoreDataPlaneId;

    /**
     * @return The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
     * 
     */
    public Output<String> mobileNetworkPacketCoreDataPlaneId() {
        return this.mobileNetworkPacketCoreDataPlaneId;
    }

    private GetNetworkAttachedDataNetworkArgs() {}

    private GetNetworkAttachedDataNetworkArgs(GetNetworkAttachedDataNetworkArgs $) {
        this.mobileNetworkDataNetworkName = $.mobileNetworkDataNetworkName;
        this.mobileNetworkPacketCoreDataPlaneId = $.mobileNetworkPacketCoreDataPlaneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkAttachedDataNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkAttachedDataNetworkArgs $;

        public Builder() {
            $ = new GetNetworkAttachedDataNetworkArgs();
        }

        public Builder(GetNetworkAttachedDataNetworkArgs defaults) {
            $ = new GetNetworkAttachedDataNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkDataNetworkName The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkDataNetworkName(Output<String> mobileNetworkDataNetworkName) {
            $.mobileNetworkDataNetworkName = mobileNetworkDataNetworkName;
            return this;
        }

        /**
         * @param mobileNetworkDataNetworkName The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkDataNetworkName(String mobileNetworkDataNetworkName) {
            return mobileNetworkDataNetworkName(Output.of(mobileNetworkDataNetworkName));
        }

        /**
         * @param mobileNetworkPacketCoreDataPlaneId The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkPacketCoreDataPlaneId(Output<String> mobileNetworkPacketCoreDataPlaneId) {
            $.mobileNetworkPacketCoreDataPlaneId = mobileNetworkPacketCoreDataPlaneId;
            return this;
        }

        /**
         * @param mobileNetworkPacketCoreDataPlaneId The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkPacketCoreDataPlaneId(String mobileNetworkPacketCoreDataPlaneId) {
            return mobileNetworkPacketCoreDataPlaneId(Output.of(mobileNetworkPacketCoreDataPlaneId));
        }

        public GetNetworkAttachedDataNetworkArgs build() {
            $.mobileNetworkDataNetworkName = Objects.requireNonNull($.mobileNetworkDataNetworkName, "expected parameter 'mobileNetworkDataNetworkName' to be non-null");
            $.mobileNetworkPacketCoreDataPlaneId = Objects.requireNonNull($.mobileNetworkPacketCoreDataPlaneId, "expected parameter 'mobileNetworkPacketCoreDataPlaneId' to be non-null");
            return $;
        }
    }

}