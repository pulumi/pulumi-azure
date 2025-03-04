// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.managedlustre.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FileSystemMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemMaintenanceWindowArgs Empty = new FileSystemMaintenanceWindowArgs();

    /**
     * The day of the week on which the maintenance window will occur. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private Output<String> dayOfWeek;

    /**
     * @return The day of the week on which the maintenance window will occur. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * The time of day (in UTC) to start the maintenance window.
     * 
     */
    @Import(name="timeOfDayInUtc", required=true)
    private Output<String> timeOfDayInUtc;

    /**
     * @return The time of day (in UTC) to start the maintenance window.
     * 
     */
    public Output<String> timeOfDayInUtc() {
        return this.timeOfDayInUtc;
    }

    private FileSystemMaintenanceWindowArgs() {}

    private FileSystemMaintenanceWindowArgs(FileSystemMaintenanceWindowArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.timeOfDayInUtc = $.timeOfDayInUtc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemMaintenanceWindowArgs $;

        public Builder() {
            $ = new FileSystemMaintenanceWindowArgs();
        }

        public Builder(FileSystemMaintenanceWindowArgs defaults) {
            $ = new FileSystemMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeek The day of the week on which the maintenance window will occur. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek The day of the week on which the maintenance window will occur. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        /**
         * @param timeOfDayInUtc The time of day (in UTC) to start the maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder timeOfDayInUtc(Output<String> timeOfDayInUtc) {
            $.timeOfDayInUtc = timeOfDayInUtc;
            return this;
        }

        /**
         * @param timeOfDayInUtc The time of day (in UTC) to start the maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder timeOfDayInUtc(String timeOfDayInUtc) {
            return timeOfDayInUtc(Output.of(timeOfDayInUtc));
        }

        public FileSystemMaintenanceWindowArgs build() {
            if ($.dayOfWeek == null) {
                throw new MissingRequiredPropertyException("FileSystemMaintenanceWindowArgs", "dayOfWeek");
            }
            if ($.timeOfDayInUtc == null) {
                throw new MissingRequiredPropertyException("FileSystemMaintenanceWindowArgs", "timeOfDayInUtc");
            }
            return $;
        }
    }

}
