// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineAutoBackupManualSchedule {
    /**
     * @return A list of days on which backup can take place. Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`
     * 
     * &gt; **Note:** `days_of_week` can only be specified when `manual_schedule` is set to `Weekly`
     * 
     */
    private @Nullable List<String> daysOfWeeks;
    /**
     * @return Frequency of full backups. Valid values include `Daily` or `Weekly`.
     * 
     */
    private String fullBackupFrequency;
    /**
     * @return Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`.
     * 
     */
    private Integer fullBackupStartHour;
    /**
     * @return Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`.
     * 
     */
    private Integer fullBackupWindowInHours;
    /**
     * @return Frequency of log backups, in minutes. Valid values are from `5` to `60`.
     * 
     */
    private Integer logBackupFrequencyInMinutes;

    private VirtualMachineAutoBackupManualSchedule() {}
    /**
     * @return A list of days on which backup can take place. Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`
     * 
     * &gt; **Note:** `days_of_week` can only be specified when `manual_schedule` is set to `Weekly`
     * 
     */
    public List<String> daysOfWeeks() {
        return this.daysOfWeeks == null ? List.of() : this.daysOfWeeks;
    }
    /**
     * @return Frequency of full backups. Valid values include `Daily` or `Weekly`.
     * 
     */
    public String fullBackupFrequency() {
        return this.fullBackupFrequency;
    }
    /**
     * @return Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`.
     * 
     */
    public Integer fullBackupStartHour() {
        return this.fullBackupStartHour;
    }
    /**
     * @return Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`.
     * 
     */
    public Integer fullBackupWindowInHours() {
        return this.fullBackupWindowInHours;
    }
    /**
     * @return Frequency of log backups, in minutes. Valid values are from `5` to `60`.
     * 
     */
    public Integer logBackupFrequencyInMinutes() {
        return this.logBackupFrequencyInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineAutoBackupManualSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> daysOfWeeks;
        private String fullBackupFrequency;
        private Integer fullBackupStartHour;
        private Integer fullBackupWindowInHours;
        private Integer logBackupFrequencyInMinutes;
        public Builder() {}
        public Builder(VirtualMachineAutoBackupManualSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfWeeks = defaults.daysOfWeeks;
    	      this.fullBackupFrequency = defaults.fullBackupFrequency;
    	      this.fullBackupStartHour = defaults.fullBackupStartHour;
    	      this.fullBackupWindowInHours = defaults.fullBackupWindowInHours;
    	      this.logBackupFrequencyInMinutes = defaults.logBackupFrequencyInMinutes;
        }

        @CustomType.Setter
        public Builder daysOfWeeks(@Nullable List<String> daysOfWeeks) {

            this.daysOfWeeks = daysOfWeeks;
            return this;
        }
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }
        @CustomType.Setter
        public Builder fullBackupFrequency(String fullBackupFrequency) {
            if (fullBackupFrequency == null) {
              throw new MissingRequiredPropertyException("VirtualMachineAutoBackupManualSchedule", "fullBackupFrequency");
            }
            this.fullBackupFrequency = fullBackupFrequency;
            return this;
        }
        @CustomType.Setter
        public Builder fullBackupStartHour(Integer fullBackupStartHour) {
            if (fullBackupStartHour == null) {
              throw new MissingRequiredPropertyException("VirtualMachineAutoBackupManualSchedule", "fullBackupStartHour");
            }
            this.fullBackupStartHour = fullBackupStartHour;
            return this;
        }
        @CustomType.Setter
        public Builder fullBackupWindowInHours(Integer fullBackupWindowInHours) {
            if (fullBackupWindowInHours == null) {
              throw new MissingRequiredPropertyException("VirtualMachineAutoBackupManualSchedule", "fullBackupWindowInHours");
            }
            this.fullBackupWindowInHours = fullBackupWindowInHours;
            return this;
        }
        @CustomType.Setter
        public Builder logBackupFrequencyInMinutes(Integer logBackupFrequencyInMinutes) {
            if (logBackupFrequencyInMinutes == null) {
              throw new MissingRequiredPropertyException("VirtualMachineAutoBackupManualSchedule", "logBackupFrequencyInMinutes");
            }
            this.logBackupFrequencyInMinutes = logBackupFrequencyInMinutes;
            return this;
        }
        public VirtualMachineAutoBackupManualSchedule build() {
            final var _resultValue = new VirtualMachineAutoBackupManualSchedule();
            _resultValue.daysOfWeeks = daysOfWeeks;
            _resultValue.fullBackupFrequency = fullBackupFrequency;
            _resultValue.fullBackupStartHour = fullBackupStartHour;
            _resultValue.fullBackupWindowInHours = fullBackupWindowInHours;
            _resultValue.logBackupFrequencyInMinutes = logBackupFrequencyInMinutes;
            return _resultValue;
        }
    }
}
