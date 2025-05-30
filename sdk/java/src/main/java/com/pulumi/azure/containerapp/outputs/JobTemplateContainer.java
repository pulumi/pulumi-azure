// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.azure.containerapp.outputs.JobTemplateContainerEnv;
import com.pulumi.azure.containerapp.outputs.JobTemplateContainerLivenessProbe;
import com.pulumi.azure.containerapp.outputs.JobTemplateContainerReadinessProbe;
import com.pulumi.azure.containerapp.outputs.JobTemplateContainerStartupProbe;
import com.pulumi.azure.containerapp.outputs.JobTemplateContainerVolumeMount;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateContainer {
    /**
     * @return A list of extra arguments to pass to the container.
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return A command to pass to the container to override the default. This is provided as a list of command line elements without spaces.
     * 
     */
    private @Nullable List<String> commands;
    /**
     * @return The amount of vCPU to allocate to the container. Possible values include `0.25`, `0.5`, `0.75`, `1.0`, `1.25`, `1.5`, `1.75`, and `2.0`.
     * 
     * &gt; **Note:** `cpu` and `memory` must be specified in `0.25&#39;/&#39;0.5Gi` combination increments. e.g. `1.0` / `2.0` or `0.5` / `1.0`
     * 
     */
    private Double cpu;
    /**
     * @return One or more `env` blocks as detailed below.
     * 
     */
    private @Nullable List<JobTemplateContainerEnv> envs;
    /**
     * @return The amount of ephemeral storage available to the Container App.
     * 
     * &gt; **Note:** `ephemeral_storage` is currently in preview and not configurable at this time.
     * 
     */
    private @Nullable String ephemeralStorage;
    /**
     * @return The image to use to create the container.
     * 
     */
    private String image;
    /**
     * @return A `liveness_probe` block as detailed below.
     * 
     */
    private @Nullable List<JobTemplateContainerLivenessProbe> livenessProbes;
    /**
     * @return The amount of memory to allocate to the container. Possible values are `0.5Gi`, `1Gi`, `1.5Gi`, `2Gi`, `2.5Gi`, `3Gi`, `3.5Gi` and `4Gi`.
     * 
     * &gt; **Note:** `cpu` and `memory` must be specified in `0.25&#39;/&#39;0.5Gi` combination increments. e.g. `1.25` / `2.5Gi` or `0.75` / `1.5Gi`
     * 
     */
    private String memory;
    /**
     * @return The name of the container.
     * 
     */
    private String name;
    /**
     * @return A `readiness_probe` block as detailed below.
     * 
     */
    private @Nullable List<JobTemplateContainerReadinessProbe> readinessProbes;
    /**
     * @return A `startup_probe` block as detailed below.
     * 
     */
    private @Nullable List<JobTemplateContainerStartupProbe> startupProbes;
    /**
     * @return A `volume_mounts` block as detailed below.
     * 
     */
    private @Nullable List<JobTemplateContainerVolumeMount> volumeMounts;

    private JobTemplateContainer() {}
    /**
     * @return A list of extra arguments to pass to the container.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return A command to pass to the container to override the default. This is provided as a list of command line elements without spaces.
     * 
     */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * @return The amount of vCPU to allocate to the container. Possible values include `0.25`, `0.5`, `0.75`, `1.0`, `1.25`, `1.5`, `1.75`, and `2.0`.
     * 
     * &gt; **Note:** `cpu` and `memory` must be specified in `0.25&#39;/&#39;0.5Gi` combination increments. e.g. `1.0` / `2.0` or `0.5` / `1.0`
     * 
     */
    public Double cpu() {
        return this.cpu;
    }
    /**
     * @return One or more `env` blocks as detailed below.
     * 
     */
    public List<JobTemplateContainerEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return The amount of ephemeral storage available to the Container App.
     * 
     * &gt; **Note:** `ephemeral_storage` is currently in preview and not configurable at this time.
     * 
     */
    public Optional<String> ephemeralStorage() {
        return Optional.ofNullable(this.ephemeralStorage);
    }
    /**
     * @return The image to use to create the container.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return A `liveness_probe` block as detailed below.
     * 
     */
    public List<JobTemplateContainerLivenessProbe> livenessProbes() {
        return this.livenessProbes == null ? List.of() : this.livenessProbes;
    }
    /**
     * @return The amount of memory to allocate to the container. Possible values are `0.5Gi`, `1Gi`, `1.5Gi`, `2Gi`, `2.5Gi`, `3Gi`, `3.5Gi` and `4Gi`.
     * 
     * &gt; **Note:** `cpu` and `memory` must be specified in `0.25&#39;/&#39;0.5Gi` combination increments. e.g. `1.25` / `2.5Gi` or `0.75` / `1.5Gi`
     * 
     */
    public String memory() {
        return this.memory;
    }
    /**
     * @return The name of the container.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `readiness_probe` block as detailed below.
     * 
     */
    public List<JobTemplateContainerReadinessProbe> readinessProbes() {
        return this.readinessProbes == null ? List.of() : this.readinessProbes;
    }
    /**
     * @return A `startup_probe` block as detailed below.
     * 
     */
    public List<JobTemplateContainerStartupProbe> startupProbes() {
        return this.startupProbes == null ? List.of() : this.startupProbes;
    }
    /**
     * @return A `volume_mounts` block as detailed below.
     * 
     */
    public List<JobTemplateContainerVolumeMount> volumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateContainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> commands;
        private Double cpu;
        private @Nullable List<JobTemplateContainerEnv> envs;
        private @Nullable String ephemeralStorage;
        private String image;
        private @Nullable List<JobTemplateContainerLivenessProbe> livenessProbes;
        private String memory;
        private String name;
        private @Nullable List<JobTemplateContainerReadinessProbe> readinessProbes;
        private @Nullable List<JobTemplateContainerStartupProbe> startupProbes;
        private @Nullable List<JobTemplateContainerVolumeMount> volumeMounts;
        public Builder() {}
        public Builder(JobTemplateContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.cpu = defaults.cpu;
    	      this.envs = defaults.envs;
    	      this.ephemeralStorage = defaults.ephemeralStorage;
    	      this.image = defaults.image;
    	      this.livenessProbes = defaults.livenessProbes;
    	      this.memory = defaults.memory;
    	      this.name = defaults.name;
    	      this.readinessProbes = defaults.readinessProbes;
    	      this.startupProbes = defaults.startupProbes;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {

            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder commands(@Nullable List<String> commands) {

            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder cpu(Double cpu) {
            if (cpu == null) {
              throw new MissingRequiredPropertyException("JobTemplateContainer", "cpu");
            }
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder envs(@Nullable List<JobTemplateContainerEnv> envs) {

            this.envs = envs;
            return this;
        }
        public Builder envs(JobTemplateContainerEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder ephemeralStorage(@Nullable String ephemeralStorage) {

            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("JobTemplateContainer", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder livenessProbes(@Nullable List<JobTemplateContainerLivenessProbe> livenessProbes) {

            this.livenessProbes = livenessProbes;
            return this;
        }
        public Builder livenessProbes(JobTemplateContainerLivenessProbe... livenessProbes) {
            return livenessProbes(List.of(livenessProbes));
        }
        @CustomType.Setter
        public Builder memory(String memory) {
            if (memory == null) {
              throw new MissingRequiredPropertyException("JobTemplateContainer", "memory");
            }
            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("JobTemplateContainer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder readinessProbes(@Nullable List<JobTemplateContainerReadinessProbe> readinessProbes) {

            this.readinessProbes = readinessProbes;
            return this;
        }
        public Builder readinessProbes(JobTemplateContainerReadinessProbe... readinessProbes) {
            return readinessProbes(List.of(readinessProbes));
        }
        @CustomType.Setter
        public Builder startupProbes(@Nullable List<JobTemplateContainerStartupProbe> startupProbes) {

            this.startupProbes = startupProbes;
            return this;
        }
        public Builder startupProbes(JobTemplateContainerStartupProbe... startupProbes) {
            return startupProbes(List.of(startupProbes));
        }
        @CustomType.Setter
        public Builder volumeMounts(@Nullable List<JobTemplateContainerVolumeMount> volumeMounts) {

            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(JobTemplateContainerVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public JobTemplateContainer build() {
            final var _resultValue = new JobTemplateContainer();
            _resultValue.args = args;
            _resultValue.commands = commands;
            _resultValue.cpu = cpu;
            _resultValue.envs = envs;
            _resultValue.ephemeralStorage = ephemeralStorage;
            _resultValue.image = image;
            _resultValue.livenessProbes = livenessProbes;
            _resultValue.memory = memory;
            _resultValue.name = name;
            _resultValue.readinessProbes = readinessProbes;
            _resultValue.startupProbes = startupProbes;
            _resultValue.volumeMounts = volumeMounts;
            return _resultValue;
        }
    }
}
