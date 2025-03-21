// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolMountNfsMountArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolMountNfsMountArgs Empty = new PoolMountNfsMountArgs();

    /**
     * Additional command line options to pass to the mount command. These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<String> mountOptions;

    /**
     * @return Additional command line options to pass to the mount command. These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    public Optional<Output<String>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
    private Output<String> relativeMountPath;

    /**
     * @return The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
     * 
     */
    public Output<String> relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * The URI of the file system to mount.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The URI of the file system to mount.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    private PoolMountNfsMountArgs() {}

    private PoolMountNfsMountArgs(PoolMountNfsMountArgs $) {
        this.mountOptions = $.mountOptions;
        this.relativeMountPath = $.relativeMountPath;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolMountNfsMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolMountNfsMountArgs $;

        public Builder() {
            $ = new PoolMountNfsMountArgs();
        }

        public Builder(PoolMountNfsMountArgs defaults) {
            $ = new PoolMountNfsMountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountOptions Additional command line options to pass to the mount command. These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions Additional command line options to pass to the mount command. These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(String mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param relativeMountPath The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            $.relativeMountPath = relativeMountPath;
            return this;
        }

        /**
         * @param relativeMountPath The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(String relativeMountPath) {
            return relativeMountPath(Output.of(relativeMountPath));
        }

        /**
         * @param source The URI of the file system to mount.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The URI of the file system to mount.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public PoolMountNfsMountArgs build() {
            if ($.relativeMountPath == null) {
                throw new MissingRequiredPropertyException("PoolMountNfsMountArgs", "relativeMountPath");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("PoolMountNfsMountArgs", "source");
            }
            return $;
        }
    }

}
