// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkAttachedDataNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkAttachedDataNetworkPlainArgs Empty = new GetNetworkAttachedDataNetworkPlainArgs();

    /**
     * The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
     * 
     */
    @Import(name="mobileNetworkDataNetworkName", required=true)
    private String mobileNetworkDataNetworkName;

    /**
     * @return The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
     * 
     */
    public String mobileNetworkDataNetworkName() {
        return this.mobileNetworkDataNetworkName;
    }

    /**
     * The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
     * 
     */
    @Import(name="mobileNetworkPacketCoreDataPlaneId", required=true)
    private String mobileNetworkPacketCoreDataPlaneId;

    /**
     * @return The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
     * 
     */
    public String mobileNetworkPacketCoreDataPlaneId() {
        return this.mobileNetworkPacketCoreDataPlaneId;
    }

    private GetNetworkAttachedDataNetworkPlainArgs() {}

    private GetNetworkAttachedDataNetworkPlainArgs(GetNetworkAttachedDataNetworkPlainArgs $) {
        this.mobileNetworkDataNetworkName = $.mobileNetworkDataNetworkName;
        this.mobileNetworkPacketCoreDataPlaneId = $.mobileNetworkPacketCoreDataPlaneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkAttachedDataNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkAttachedDataNetworkPlainArgs $;

        public Builder() {
            $ = new GetNetworkAttachedDataNetworkPlainArgs();
        }

        public Builder(GetNetworkAttachedDataNetworkPlainArgs defaults) {
            $ = new GetNetworkAttachedDataNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkDataNetworkName The Name of the `azure.mobile.NetworkDataNetwork` this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkDataNetworkName(String mobileNetworkDataNetworkName) {
            $.mobileNetworkDataNetworkName = mobileNetworkDataNetworkName;
            return this;
        }

        /**
         * @param mobileNetworkPacketCoreDataPlaneId The ID of the `azure.mobile.NetworkPacketCoreDataPlane` which the Mobile Network Attached Data Network belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkPacketCoreDataPlaneId(String mobileNetworkPacketCoreDataPlaneId) {
            $.mobileNetworkPacketCoreDataPlaneId = mobileNetworkPacketCoreDataPlaneId;
            return this;
        }

        public GetNetworkAttachedDataNetworkPlainArgs build() {
            if ($.mobileNetworkDataNetworkName == null) {
                throw new MissingRequiredPropertyException("GetNetworkAttachedDataNetworkPlainArgs", "mobileNetworkDataNetworkName");
            }
            if ($.mobileNetworkPacketCoreDataPlaneId == null) {
                throw new MissingRequiredPropertyException("GetNetworkAttachedDataNetworkPlainArgs", "mobileNetworkPacketCoreDataPlaneId");
            }
            return $;
        }
    }

}
