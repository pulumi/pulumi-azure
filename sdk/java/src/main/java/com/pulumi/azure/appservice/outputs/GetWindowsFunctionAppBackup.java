// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppBackupSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsFunctionAppBackup {
    /**
     * @return Is the Backup Job enabled?
     * 
     */
    private Boolean enabled;
    /**
     * @return The name of this Windows Function App.
     * 
     */
    private String name;
    /**
     * @return A `schedule` block as defined below.
     * 
     */
    private List<GetWindowsFunctionAppBackupSchedule> schedules;
    /**
     * @return The SAS URL to the container.
     * 
     */
    private String storageAccountUrl;

    private GetWindowsFunctionAppBackup() {}
    /**
     * @return Is the Backup Job enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The name of this Windows Function App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `schedule` block as defined below.
     * 
     */
    public List<GetWindowsFunctionAppBackupSchedule> schedules() {
        return this.schedules;
    }
    /**
     * @return The SAS URL to the container.
     * 
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsFunctionAppBackup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String name;
        private List<GetWindowsFunctionAppBackupSchedule> schedules;
        private String storageAccountUrl;
        public Builder() {}
        public Builder(GetWindowsFunctionAppBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schedules(List<GetWindowsFunctionAppBackupSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetWindowsFunctionAppBackupSchedule... schedules) {
            return schedules(List.of(schedules));
        }
        @CustomType.Setter
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }
        public GetWindowsFunctionAppBackup build() {
            final var o = new GetWindowsFunctionAppBackup();
            o.enabled = enabled;
            o.name = name;
            o.schedules = schedules;
            o.storageAccountUrl = storageAccountUrl;
            return o;
        }
    }
}