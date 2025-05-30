// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleServerStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleServerStorageArgs Empty = new FlexibleServerStorageArgs();

    /**
     * Should Storage Auto Grow be enabled? Defaults to `true`.
     * 
     */
    @Import(name="autoGrowEnabled")
    private @Nullable Output<Boolean> autoGrowEnabled;

    /**
     * @return Should Storage Auto Grow be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> autoGrowEnabled() {
        return Optional.ofNullable(this.autoGrowEnabled);
    }

    /**
     * Should IOPS be scaled automatically? If `true`, `iops` can not be set. Defaults to `false`.
     * 
     */
    @Import(name="ioScalingEnabled")
    private @Nullable Output<Boolean> ioScalingEnabled;

    /**
     * @return Should IOPS be scaled automatically? If `true`, `iops` can not be set. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> ioScalingEnabled() {
        return Optional.ofNullable(this.ioScalingEnabled);
    }

    /**
     * The storage IOPS for the MySQL Flexible Server. Possible values are between `360` and `20000`.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return The storage IOPS for the MySQL Flexible Server. Possible values are between `360` and `20000`.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * Should Storage Log On Disk be enabled? Defaults to `false`.
     * 
     */
    @Import(name="logOnDiskEnabled")
    private @Nullable Output<Boolean> logOnDiskEnabled;

    /**
     * @return Should Storage Log On Disk be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> logOnDiskEnabled() {
        return Optional.ofNullable(this.logOnDiskEnabled);
    }

    /**
     * The max storage allowed for the MySQL Flexible Server. Possible values are between `20` and `16384`.
     * 
     * &gt; **Note:** Decreasing `size_gb` forces a new resource to be created.
     * 
     */
    @Import(name="sizeGb")
    private @Nullable Output<Integer> sizeGb;

    /**
     * @return The max storage allowed for the MySQL Flexible Server. Possible values are between `20` and `16384`.
     * 
     * &gt; **Note:** Decreasing `size_gb` forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> sizeGb() {
        return Optional.ofNullable(this.sizeGb);
    }

    private FlexibleServerStorageArgs() {}

    private FlexibleServerStorageArgs(FlexibleServerStorageArgs $) {
        this.autoGrowEnabled = $.autoGrowEnabled;
        this.ioScalingEnabled = $.ioScalingEnabled;
        this.iops = $.iops;
        this.logOnDiskEnabled = $.logOnDiskEnabled;
        this.sizeGb = $.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleServerStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleServerStorageArgs $;

        public Builder() {
            $ = new FlexibleServerStorageArgs();
        }

        public Builder(FlexibleServerStorageArgs defaults) {
            $ = new FlexibleServerStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoGrowEnabled Should Storage Auto Grow be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoGrowEnabled(@Nullable Output<Boolean> autoGrowEnabled) {
            $.autoGrowEnabled = autoGrowEnabled;
            return this;
        }

        /**
         * @param autoGrowEnabled Should Storage Auto Grow be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoGrowEnabled(Boolean autoGrowEnabled) {
            return autoGrowEnabled(Output.of(autoGrowEnabled));
        }

        /**
         * @param ioScalingEnabled Should IOPS be scaled automatically? If `true`, `iops` can not be set. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ioScalingEnabled(@Nullable Output<Boolean> ioScalingEnabled) {
            $.ioScalingEnabled = ioScalingEnabled;
            return this;
        }

        /**
         * @param ioScalingEnabled Should IOPS be scaled automatically? If `true`, `iops` can not be set. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ioScalingEnabled(Boolean ioScalingEnabled) {
            return ioScalingEnabled(Output.of(ioScalingEnabled));
        }

        /**
         * @param iops The storage IOPS for the MySQL Flexible Server. Possible values are between `360` and `20000`.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops The storage IOPS for the MySQL Flexible Server. Possible values are between `360` and `20000`.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param logOnDiskEnabled Should Storage Log On Disk be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder logOnDiskEnabled(@Nullable Output<Boolean> logOnDiskEnabled) {
            $.logOnDiskEnabled = logOnDiskEnabled;
            return this;
        }

        /**
         * @param logOnDiskEnabled Should Storage Log On Disk be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder logOnDiskEnabled(Boolean logOnDiskEnabled) {
            return logOnDiskEnabled(Output.of(logOnDiskEnabled));
        }

        /**
         * @param sizeGb The max storage allowed for the MySQL Flexible Server. Possible values are between `20` and `16384`.
         * 
         * &gt; **Note:** Decreasing `size_gb` forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(@Nullable Output<Integer> sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        /**
         * @param sizeGb The max storage allowed for the MySQL Flexible Server. Possible values are between `20` and `16384`.
         * 
         * &gt; **Note:** Decreasing `size_gb` forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Integer sizeGb) {
            return sizeGb(Output.of(sizeGb));
        }

        public FlexibleServerStorageArgs build() {
            return $;
        }
    }

}
