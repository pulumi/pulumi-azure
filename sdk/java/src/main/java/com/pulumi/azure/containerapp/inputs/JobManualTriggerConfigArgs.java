// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobManualTriggerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobManualTriggerConfigArgs Empty = new JobManualTriggerConfigArgs();

    /**
     * Number of parallel replicas of a job that can run at a given time.
     * 
     */
    @Import(name="parallelism")
    private @Nullable Output<Integer> parallelism;

    /**
     * @return Number of parallel replicas of a job that can run at a given time.
     * 
     */
    public Optional<Output<Integer>> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }

    /**
     * Minimum number of successful replica completions before overall job completion.
     * 
     */
    @Import(name="replicaCompletionCount")
    private @Nullable Output<Integer> replicaCompletionCount;

    /**
     * @return Minimum number of successful replica completions before overall job completion.
     * 
     */
    public Optional<Output<Integer>> replicaCompletionCount() {
        return Optional.ofNullable(this.replicaCompletionCount);
    }

    private JobManualTriggerConfigArgs() {}

    private JobManualTriggerConfigArgs(JobManualTriggerConfigArgs $) {
        this.parallelism = $.parallelism;
        this.replicaCompletionCount = $.replicaCompletionCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobManualTriggerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobManualTriggerConfigArgs $;

        public Builder() {
            $ = new JobManualTriggerConfigArgs();
        }

        public Builder(JobManualTriggerConfigArgs defaults) {
            $ = new JobManualTriggerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parallelism Number of parallel replicas of a job that can run at a given time.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            $.parallelism = parallelism;
            return this;
        }

        /**
         * @param parallelism Number of parallel replicas of a job that can run at a given time.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(Integer parallelism) {
            return parallelism(Output.of(parallelism));
        }

        /**
         * @param replicaCompletionCount Minimum number of successful replica completions before overall job completion.
         * 
         * @return builder
         * 
         */
        public Builder replicaCompletionCount(@Nullable Output<Integer> replicaCompletionCount) {
            $.replicaCompletionCount = replicaCompletionCount;
            return this;
        }

        /**
         * @param replicaCompletionCount Minimum number of successful replica completions before overall job completion.
         * 
         * @return builder
         * 
         */
        public Builder replicaCompletionCount(Integer replicaCompletionCount) {
            return replicaCompletionCount(Output.of(replicaCompletionCount));
        }

        public JobManualTriggerConfigArgs build() {
            return $;
        }
    }

}
