// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InteractiveQueryClusterRolesWorkerNodeAutoscale {
    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    private @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence;

    private InteractiveQueryClusterRolesWorkerNodeAutoscale() {}
    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    public Optional<InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InteractiveQueryClusterRolesWorkerNodeAutoscale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence;
        public Builder() {}
        public Builder(InteractiveQueryClusterRolesWorkerNodeAutoscale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
        }

        @CustomType.Setter
        public Builder recurrence(@Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence) {

            this.recurrence = recurrence;
            return this;
        }
        public InteractiveQueryClusterRolesWorkerNodeAutoscale build() {
            final var _resultValue = new InteractiveQueryClusterRolesWorkerNodeAutoscale();
            _resultValue.recurrence = recurrence;
            return _resultValue;
        }
    }
}
