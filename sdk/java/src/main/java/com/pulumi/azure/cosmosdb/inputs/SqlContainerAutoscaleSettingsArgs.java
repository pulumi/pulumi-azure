// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlContainerAutoscaleSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlContainerAutoscaleSettingsArgs Empty = new SqlContainerAutoscaleSettingsArgs();

    /**
     * The maximum throughput of the SQL container (RU/s). Must be between `1,000` and `1,000,000`. Must be set in increments of `1,000`. Conflicts with `throughput`.
     * 
     */
    @Import(name="maxThroughput")
    private @Nullable Output<Integer> maxThroughput;

    /**
     * @return The maximum throughput of the SQL container (RU/s). Must be between `1,000` and `1,000,000`. Must be set in increments of `1,000`. Conflicts with `throughput`.
     * 
     */
    public Optional<Output<Integer>> maxThroughput() {
        return Optional.ofNullable(this.maxThroughput);
    }

    private SqlContainerAutoscaleSettingsArgs() {}

    private SqlContainerAutoscaleSettingsArgs(SqlContainerAutoscaleSettingsArgs $) {
        this.maxThroughput = $.maxThroughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlContainerAutoscaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlContainerAutoscaleSettingsArgs $;

        public Builder() {
            $ = new SqlContainerAutoscaleSettingsArgs();
        }

        public Builder(SqlContainerAutoscaleSettingsArgs defaults) {
            $ = new SqlContainerAutoscaleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxThroughput The maximum throughput of the SQL container (RU/s). Must be between `1,000` and `1,000,000`. Must be set in increments of `1,000`. Conflicts with `throughput`.
         * 
         * @return builder
         * 
         */
        public Builder maxThroughput(@Nullable Output<Integer> maxThroughput) {
            $.maxThroughput = maxThroughput;
            return this;
        }

        /**
         * @param maxThroughput The maximum throughput of the SQL container (RU/s). Must be between `1,000` and `1,000,000`. Must be set in increments of `1,000`. Conflicts with `throughput`.
         * 
         * @return builder
         * 
         */
        public Builder maxThroughput(Integer maxThroughput) {
            return maxThroughput(Output.of(maxThroughput));
        }

        public SqlContainerAutoscaleSettingsArgs build() {
            return $;
        }
    }

}