// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePointArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePointArgs Empty = new RestorePointArgs();

    /**
     * Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="crashConsistencyModeEnabled")
    private @Nullable Output<Boolean> crashConsistencyModeEnabled;

    /**
     * @return Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> crashConsistencyModeEnabled() {
        return Optional.ofNullable(this.crashConsistencyModeEnabled);
    }

    /**
     * A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="excludedDisks")
    private @Nullable Output<List<String>> excludedDisks;

    /**
     * @return A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> excludedDisks() {
        return Optional.ofNullable(this.excludedDisks);
    }

    /**
     * Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="virtualMachineRestorePointCollectionId", required=true)
    private Output<String> virtualMachineRestorePointCollectionId;

    public Output<String> virtualMachineRestorePointCollectionId() {
        return this.virtualMachineRestorePointCollectionId;
    }

    private RestorePointArgs() {}

    private RestorePointArgs(RestorePointArgs $) {
        this.crashConsistencyModeEnabled = $.crashConsistencyModeEnabled;
        this.excludedDisks = $.excludedDisks;
        this.name = $.name;
        this.virtualMachineRestorePointCollectionId = $.virtualMachineRestorePointCollectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePointArgs $;

        public Builder() {
            $ = new RestorePointArgs();
        }

        public Builder(RestorePointArgs defaults) {
            $ = new RestorePointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crashConsistencyModeEnabled Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder crashConsistencyModeEnabled(@Nullable Output<Boolean> crashConsistencyModeEnabled) {
            $.crashConsistencyModeEnabled = crashConsistencyModeEnabled;
            return this;
        }

        /**
         * @param crashConsistencyModeEnabled Is Crash Consistent the Consistency Mode of the Virtual Machine Restore Point. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder crashConsistencyModeEnabled(Boolean crashConsistencyModeEnabled) {
            return crashConsistencyModeEnabled(Output.of(crashConsistencyModeEnabled));
        }

        /**
         * @param excludedDisks A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder excludedDisks(@Nullable Output<List<String>> excludedDisks) {
            $.excludedDisks = excludedDisks;
            return this;
        }

        /**
         * @param excludedDisks A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder excludedDisks(List<String> excludedDisks) {
            return excludedDisks(Output.of(excludedDisks));
        }

        /**
         * @param excludedDisks A list of disks that will be excluded from the Virtual Machine Restore Point. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder excludedDisks(String... excludedDisks) {
            return excludedDisks(List.of(excludedDisks));
        }

        /**
         * @param name Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Virtual Machine Restore Point. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder virtualMachineRestorePointCollectionId(Output<String> virtualMachineRestorePointCollectionId) {
            $.virtualMachineRestorePointCollectionId = virtualMachineRestorePointCollectionId;
            return this;
        }

        public Builder virtualMachineRestorePointCollectionId(String virtualMachineRestorePointCollectionId) {
            return virtualMachineRestorePointCollectionId(Output.of(virtualMachineRestorePointCollectionId));
        }

        public RestorePointArgs build() {
            if ($.virtualMachineRestorePointCollectionId == null) {
                throw new MissingRequiredPropertyException("RestorePointArgs", "virtualMachineRestorePointCollectionId");
            }
            return $;
        }
    }

}
