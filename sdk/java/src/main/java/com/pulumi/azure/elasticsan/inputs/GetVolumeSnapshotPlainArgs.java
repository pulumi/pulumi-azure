// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticsan.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeSnapshotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeSnapshotPlainArgs Empty = new GetVolumeSnapshotPlainArgs();

    /**
     * The name of the Elastic SAN Volume Snapshot.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Elastic SAN Volume Snapshot.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Elastic SAN Volume Group ID within which the Elastic SAN Volume Snapshot exists.
     * 
     */
    @Import(name="volumeGroupId", required=true)
    private String volumeGroupId;

    /**
     * @return The Elastic SAN Volume Group ID within which the Elastic SAN Volume Snapshot exists.
     * 
     */
    public String volumeGroupId() {
        return this.volumeGroupId;
    }

    private GetVolumeSnapshotPlainArgs() {}

    private GetVolumeSnapshotPlainArgs(GetVolumeSnapshotPlainArgs $) {
        this.name = $.name;
        this.volumeGroupId = $.volumeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeSnapshotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeSnapshotPlainArgs $;

        public Builder() {
            $ = new GetVolumeSnapshotPlainArgs();
        }

        public Builder(GetVolumeSnapshotPlainArgs defaults) {
            $ = new GetVolumeSnapshotPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Elastic SAN Volume Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param volumeGroupId The Elastic SAN Volume Group ID within which the Elastic SAN Volume Snapshot exists.
         * 
         * @return builder
         * 
         */
        public Builder volumeGroupId(String volumeGroupId) {
            $.volumeGroupId = volumeGroupId;
            return this;
        }

        public GetVolumeSnapshotPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetVolumeSnapshotPlainArgs", "name");
            }
            if ($.volumeGroupId == null) {
                throw new MissingRequiredPropertyException("GetVolumeSnapshotPlainArgs", "volumeGroupId");
            }
            return $;
        }
    }

}
