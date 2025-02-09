// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AttachedDatabaseConfigurationSharing {
    /**
     * @return List of external tables exclude from the follower database.
     * 
     */
    private @Nullable List<String> externalTablesToExcludes;
    /**
     * @return List of external tables to include in the follower database.
     * 
     */
    private @Nullable List<String> externalTablesToIncludes;
    /**
     * @return List of materialized views exclude from the follower database.
     * 
     */
    private @Nullable List<String> materializedViewsToExcludes;
    /**
     * @return List of materialized views to include in the follower database.
     * 
     */
    private @Nullable List<String> materializedViewsToIncludes;
    /**
     * @return List of tables to exclude from the follower database.
     * 
     */
    private @Nullable List<String> tablesToExcludes;
    /**
     * @return List of tables to include in the follower database.
     * 
     */
    private @Nullable List<String> tablesToIncludes;

    private AttachedDatabaseConfigurationSharing() {}
    /**
     * @return List of external tables exclude from the follower database.
     * 
     */
    public List<String> externalTablesToExcludes() {
        return this.externalTablesToExcludes == null ? List.of() : this.externalTablesToExcludes;
    }
    /**
     * @return List of external tables to include in the follower database.
     * 
     */
    public List<String> externalTablesToIncludes() {
        return this.externalTablesToIncludes == null ? List.of() : this.externalTablesToIncludes;
    }
    /**
     * @return List of materialized views exclude from the follower database.
     * 
     */
    public List<String> materializedViewsToExcludes() {
        return this.materializedViewsToExcludes == null ? List.of() : this.materializedViewsToExcludes;
    }
    /**
     * @return List of materialized views to include in the follower database.
     * 
     */
    public List<String> materializedViewsToIncludes() {
        return this.materializedViewsToIncludes == null ? List.of() : this.materializedViewsToIncludes;
    }
    /**
     * @return List of tables to exclude from the follower database.
     * 
     */
    public List<String> tablesToExcludes() {
        return this.tablesToExcludes == null ? List.of() : this.tablesToExcludes;
    }
    /**
     * @return List of tables to include in the follower database.
     * 
     */
    public List<String> tablesToIncludes() {
        return this.tablesToIncludes == null ? List.of() : this.tablesToIncludes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDatabaseConfigurationSharing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> externalTablesToExcludes;
        private @Nullable List<String> externalTablesToIncludes;
        private @Nullable List<String> materializedViewsToExcludes;
        private @Nullable List<String> materializedViewsToIncludes;
        private @Nullable List<String> tablesToExcludes;
        private @Nullable List<String> tablesToIncludes;
        public Builder() {}
        public Builder(AttachedDatabaseConfigurationSharing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalTablesToExcludes = defaults.externalTablesToExcludes;
    	      this.externalTablesToIncludes = defaults.externalTablesToIncludes;
    	      this.materializedViewsToExcludes = defaults.materializedViewsToExcludes;
    	      this.materializedViewsToIncludes = defaults.materializedViewsToIncludes;
    	      this.tablesToExcludes = defaults.tablesToExcludes;
    	      this.tablesToIncludes = defaults.tablesToIncludes;
        }

        @CustomType.Setter
        public Builder externalTablesToExcludes(@Nullable List<String> externalTablesToExcludes) {

            this.externalTablesToExcludes = externalTablesToExcludes;
            return this;
        }
        public Builder externalTablesToExcludes(String... externalTablesToExcludes) {
            return externalTablesToExcludes(List.of(externalTablesToExcludes));
        }
        @CustomType.Setter
        public Builder externalTablesToIncludes(@Nullable List<String> externalTablesToIncludes) {

            this.externalTablesToIncludes = externalTablesToIncludes;
            return this;
        }
        public Builder externalTablesToIncludes(String... externalTablesToIncludes) {
            return externalTablesToIncludes(List.of(externalTablesToIncludes));
        }
        @CustomType.Setter
        public Builder materializedViewsToExcludes(@Nullable List<String> materializedViewsToExcludes) {

            this.materializedViewsToExcludes = materializedViewsToExcludes;
            return this;
        }
        public Builder materializedViewsToExcludes(String... materializedViewsToExcludes) {
            return materializedViewsToExcludes(List.of(materializedViewsToExcludes));
        }
        @CustomType.Setter
        public Builder materializedViewsToIncludes(@Nullable List<String> materializedViewsToIncludes) {

            this.materializedViewsToIncludes = materializedViewsToIncludes;
            return this;
        }
        public Builder materializedViewsToIncludes(String... materializedViewsToIncludes) {
            return materializedViewsToIncludes(List.of(materializedViewsToIncludes));
        }
        @CustomType.Setter
        public Builder tablesToExcludes(@Nullable List<String> tablesToExcludes) {

            this.tablesToExcludes = tablesToExcludes;
            return this;
        }
        public Builder tablesToExcludes(String... tablesToExcludes) {
            return tablesToExcludes(List.of(tablesToExcludes));
        }
        @CustomType.Setter
        public Builder tablesToIncludes(@Nullable List<String> tablesToIncludes) {

            this.tablesToIncludes = tablesToIncludes;
            return this;
        }
        public Builder tablesToIncludes(String... tablesToIncludes) {
            return tablesToIncludes(List.of(tablesToIncludes));
        }
        public AttachedDatabaseConfigurationSharing build() {
            final var _resultValue = new AttachedDatabaseConfigurationSharing();
            _resultValue.externalTablesToExcludes = externalTablesToExcludes;
            _resultValue.externalTablesToIncludes = externalTablesToIncludes;
            _resultValue.materializedViewsToExcludes = materializedViewsToExcludes;
            _resultValue.materializedViewsToIncludes = materializedViewsToIncludes;
            _resultValue.tablesToExcludes = tablesToExcludes;
            _resultValue.tablesToIncludes = tablesToIncludes;
            return _resultValue;
        }
    }
}
