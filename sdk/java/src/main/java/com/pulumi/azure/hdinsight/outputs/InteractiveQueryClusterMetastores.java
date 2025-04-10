// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.InteractiveQueryClusterMetastoresAmbari;
import com.pulumi.azure.hdinsight.outputs.InteractiveQueryClusterMetastoresHive;
import com.pulumi.azure.hdinsight.outputs.InteractiveQueryClusterMetastoresOozie;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InteractiveQueryClusterMetastores {
    /**
     * @return An `ambari` block as defined below.
     * 
     */
    private @Nullable InteractiveQueryClusterMetastoresAmbari ambari;
    /**
     * @return A `hive` block as defined below.
     * 
     */
    private @Nullable InteractiveQueryClusterMetastoresHive hive;
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    private @Nullable InteractiveQueryClusterMetastoresOozie oozie;

    private InteractiveQueryClusterMetastores() {}
    /**
     * @return An `ambari` block as defined below.
     * 
     */
    public Optional<InteractiveQueryClusterMetastoresAmbari> ambari() {
        return Optional.ofNullable(this.ambari);
    }
    /**
     * @return A `hive` block as defined below.
     * 
     */
    public Optional<InteractiveQueryClusterMetastoresHive> hive() {
        return Optional.ofNullable(this.hive);
    }
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    public Optional<InteractiveQueryClusterMetastoresOozie> oozie() {
        return Optional.ofNullable(this.oozie);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InteractiveQueryClusterMetastores defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable InteractiveQueryClusterMetastoresAmbari ambari;
        private @Nullable InteractiveQueryClusterMetastoresHive hive;
        private @Nullable InteractiveQueryClusterMetastoresOozie oozie;
        public Builder() {}
        public Builder(InteractiveQueryClusterMetastores defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambari = defaults.ambari;
    	      this.hive = defaults.hive;
    	      this.oozie = defaults.oozie;
        }

        @CustomType.Setter
        public Builder ambari(@Nullable InteractiveQueryClusterMetastoresAmbari ambari) {

            this.ambari = ambari;
            return this;
        }
        @CustomType.Setter
        public Builder hive(@Nullable InteractiveQueryClusterMetastoresHive hive) {

            this.hive = hive;
            return this;
        }
        @CustomType.Setter
        public Builder oozie(@Nullable InteractiveQueryClusterMetastoresOozie oozie) {

            this.oozie = oozie;
            return this;
        }
        public InteractiveQueryClusterMetastores build() {
            final var _resultValue = new InteractiveQueryClusterMetastores();
            _resultValue.ambari = ambari;
            _resultValue.hive = hive;
            _resultValue.oozie = oozie;
            return _resultValue;
        }
    }
}
