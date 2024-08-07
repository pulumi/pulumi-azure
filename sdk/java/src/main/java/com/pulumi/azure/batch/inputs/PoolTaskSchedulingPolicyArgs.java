// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolTaskSchedulingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolTaskSchedulingPolicyArgs Empty = new PoolTaskSchedulingPolicyArgs();

    /**
     * Supported values are &#34;Pack&#34; and &#34;Spread&#34;. &#34;Pack&#34; means as many tasks as possible (taskSlotsPerNode) should be assigned to each node in the pool before any tasks are assigned to the next node in the pool. &#34;Spread&#34; means that tasks should be assigned evenly across all nodes in the pool.
     * 
     */
    @Import(name="nodeFillType")
    private @Nullable Output<String> nodeFillType;

    /**
     * @return Supported values are &#34;Pack&#34; and &#34;Spread&#34;. &#34;Pack&#34; means as many tasks as possible (taskSlotsPerNode) should be assigned to each node in the pool before any tasks are assigned to the next node in the pool. &#34;Spread&#34; means that tasks should be assigned evenly across all nodes in the pool.
     * 
     */
    public Optional<Output<String>> nodeFillType() {
        return Optional.ofNullable(this.nodeFillType);
    }

    private PoolTaskSchedulingPolicyArgs() {}

    private PoolTaskSchedulingPolicyArgs(PoolTaskSchedulingPolicyArgs $) {
        this.nodeFillType = $.nodeFillType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolTaskSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolTaskSchedulingPolicyArgs $;

        public Builder() {
            $ = new PoolTaskSchedulingPolicyArgs();
        }

        public Builder(PoolTaskSchedulingPolicyArgs defaults) {
            $ = new PoolTaskSchedulingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeFillType Supported values are &#34;Pack&#34; and &#34;Spread&#34;. &#34;Pack&#34; means as many tasks as possible (taskSlotsPerNode) should be assigned to each node in the pool before any tasks are assigned to the next node in the pool. &#34;Spread&#34; means that tasks should be assigned evenly across all nodes in the pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeFillType(@Nullable Output<String> nodeFillType) {
            $.nodeFillType = nodeFillType;
            return this;
        }

        /**
         * @param nodeFillType Supported values are &#34;Pack&#34; and &#34;Spread&#34;. &#34;Pack&#34; means as many tasks as possible (taskSlotsPerNode) should be assigned to each node in the pool before any tasks are assigned to the next node in the pool. &#34;Spread&#34; means that tasks should be assigned evenly across all nodes in the pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeFillType(String nodeFillType) {
            return nodeFillType(Output.of(nodeFillType));
        }

        public PoolTaskSchedulingPolicyArgs build() {
            return $;
        }
    }

}
