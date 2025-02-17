// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresAmbariArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresHiveArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresOozieArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClusterMetastoresArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterMetastoresArgs Empty = new KafkaClusterMetastoresArgs();

    /**
     * An `ambari` block as defined below.
     * 
     */
    @Import(name="ambari")
    private @Nullable Output<KafkaClusterMetastoresAmbariArgs> ambari;

    /**
     * @return An `ambari` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterMetastoresAmbariArgs>> ambari() {
        return Optional.ofNullable(this.ambari);
    }

    /**
     * A `hive` block as defined below.
     * 
     */
    @Import(name="hive")
    private @Nullable Output<KafkaClusterMetastoresHiveArgs> hive;

    /**
     * @return A `hive` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterMetastoresHiveArgs>> hive() {
        return Optional.ofNullable(this.hive);
    }

    /**
     * An `oozie` block as defined below.
     * 
     */
    @Import(name="oozie")
    private @Nullable Output<KafkaClusterMetastoresOozieArgs> oozie;

    /**
     * @return An `oozie` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterMetastoresOozieArgs>> oozie() {
        return Optional.ofNullable(this.oozie);
    }

    private KafkaClusterMetastoresArgs() {}

    private KafkaClusterMetastoresArgs(KafkaClusterMetastoresArgs $) {
        this.ambari = $.ambari;
        this.hive = $.hive;
        this.oozie = $.oozie;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterMetastoresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterMetastoresArgs $;

        public Builder() {
            $ = new KafkaClusterMetastoresArgs();
        }

        public Builder(KafkaClusterMetastoresArgs defaults) {
            $ = new KafkaClusterMetastoresArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ambari An `ambari` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ambari(@Nullable Output<KafkaClusterMetastoresAmbariArgs> ambari) {
            $.ambari = ambari;
            return this;
        }

        /**
         * @param ambari An `ambari` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder ambari(KafkaClusterMetastoresAmbariArgs ambari) {
            return ambari(Output.of(ambari));
        }

        /**
         * @param hive A `hive` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder hive(@Nullable Output<KafkaClusterMetastoresHiveArgs> hive) {
            $.hive = hive;
            return this;
        }

        /**
         * @param hive A `hive` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder hive(KafkaClusterMetastoresHiveArgs hive) {
            return hive(Output.of(hive));
        }

        /**
         * @param oozie An `oozie` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder oozie(@Nullable Output<KafkaClusterMetastoresOozieArgs> oozie) {
            $.oozie = oozie;
            return this;
        }

        /**
         * @param oozie An `oozie` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder oozie(KafkaClusterMetastoresOozieArgs oozie) {
            return oozie(Output.of(oozie));
        }

        public KafkaClusterMetastoresArgs build() {
            return $;
        }
    }

}
