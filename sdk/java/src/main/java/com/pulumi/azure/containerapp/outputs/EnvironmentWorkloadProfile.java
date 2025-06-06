// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentWorkloadProfile {
    /**
     * @return The maximum number of instances of workload profile that can be deployed in the Container App Environment.
     * 
     */
    private @Nullable Integer maximumCount;
    /**
     * @return The minimum number of instances of workload profile that can be deployed in the Container App Environment.
     * 
     */
    private @Nullable Integer minimumCount;
    /**
     * @return The name of the workload profile.
     * 
     */
    private String name;
    /**
     * @return Workload profile type for the workloads to run on. Possible values include `Consumption`, `D4`, `D8`, `D16`, `D32`, `E4`, `E8`, `E16` and `E32`.
     * 
     * &gt; **Note:** A `Consumption` type must have a name of `Consumption` and an environment may only have one `Consumption` Workload Profile.
     * 
     * &gt; **Note:** Defining a `Consumption` profile is optional, however, Environments created without an initial Workload Profile cannot have them added at a later time and must be recreated. Similarly, an environment created with Profiles must always have at least one defined Profile, removing all profiles will force a recreation of the resource.
     * 
     */
    private String workloadProfileType;

    private EnvironmentWorkloadProfile() {}
    /**
     * @return The maximum number of instances of workload profile that can be deployed in the Container App Environment.
     * 
     */
    public Optional<Integer> maximumCount() {
        return Optional.ofNullable(this.maximumCount);
    }
    /**
     * @return The minimum number of instances of workload profile that can be deployed in the Container App Environment.
     * 
     */
    public Optional<Integer> minimumCount() {
        return Optional.ofNullable(this.minimumCount);
    }
    /**
     * @return The name of the workload profile.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Workload profile type for the workloads to run on. Possible values include `Consumption`, `D4`, `D8`, `D16`, `D32`, `E4`, `E8`, `E16` and `E32`.
     * 
     * &gt; **Note:** A `Consumption` type must have a name of `Consumption` and an environment may only have one `Consumption` Workload Profile.
     * 
     * &gt; **Note:** Defining a `Consumption` profile is optional, however, Environments created without an initial Workload Profile cannot have them added at a later time and must be recreated. Similarly, an environment created with Profiles must always have at least one defined Profile, removing all profiles will force a recreation of the resource.
     * 
     */
    public String workloadProfileType() {
        return this.workloadProfileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentWorkloadProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maximumCount;
        private @Nullable Integer minimumCount;
        private String name;
        private String workloadProfileType;
        public Builder() {}
        public Builder(EnvironmentWorkloadProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCount = defaults.maximumCount;
    	      this.minimumCount = defaults.minimumCount;
    	      this.name = defaults.name;
    	      this.workloadProfileType = defaults.workloadProfileType;
        }

        @CustomType.Setter
        public Builder maximumCount(@Nullable Integer maximumCount) {

            this.maximumCount = maximumCount;
            return this;
        }
        @CustomType.Setter
        public Builder minimumCount(@Nullable Integer minimumCount) {

            this.minimumCount = minimumCount;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("EnvironmentWorkloadProfile", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder workloadProfileType(String workloadProfileType) {
            if (workloadProfileType == null) {
              throw new MissingRequiredPropertyException("EnvironmentWorkloadProfile", "workloadProfileType");
            }
            this.workloadProfileType = workloadProfileType;
            return this;
        }
        public EnvironmentWorkloadProfile build() {
            final var _resultValue = new EnvironmentWorkloadProfile();
            _resultValue.maximumCount = maximumCount;
            _resultValue.minimumCount = minimumCount;
            _resultValue.name = name;
            _resultValue.workloadProfileType = workloadProfileType;
            return _resultValue;
        }
    }
}
