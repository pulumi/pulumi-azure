// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleFusionSourceSubTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleFusionSourceSubTypeArgs Empty = new AlertRuleFusionSourceSubTypeArgs();

    /**
     * Whether this source subtype under source signal is enabled or disabled in Fusion detection. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether this source subtype under source signal is enabled or disabled in Fusion detection. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Name of the source subtype under a given source signal in Fusion detection. Refer to Fusion alert rule template for supported values.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name of the source subtype under a given source signal in Fusion detection. Refer to Fusion alert rule template for supported values.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
     * 
     */
    @Import(name="severitiesAlloweds", required=true)
    private Output<List<String>> severitiesAlloweds;

    /**
     * @return A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
     * 
     */
    public Output<List<String>> severitiesAlloweds() {
        return this.severitiesAlloweds;
    }

    private AlertRuleFusionSourceSubTypeArgs() {}

    private AlertRuleFusionSourceSubTypeArgs(AlertRuleFusionSourceSubTypeArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.severitiesAlloweds = $.severitiesAlloweds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleFusionSourceSubTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleFusionSourceSubTypeArgs $;

        public Builder() {
            $ = new AlertRuleFusionSourceSubTypeArgs();
        }

        public Builder(AlertRuleFusionSourceSubTypeArgs defaults) {
            $ = new AlertRuleFusionSourceSubTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether this source subtype under source signal is enabled or disabled in Fusion detection. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether this source subtype under source signal is enabled or disabled in Fusion detection. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The Name of the source subtype under a given source signal in Fusion detection. Refer to Fusion alert rule template for supported values.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the source subtype under a given source signal in Fusion detection. Refer to Fusion alert rule template for supported values.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param severitiesAlloweds A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
         * 
         * @return builder
         * 
         */
        public Builder severitiesAlloweds(Output<List<String>> severitiesAlloweds) {
            $.severitiesAlloweds = severitiesAlloweds;
            return this;
        }

        /**
         * @param severitiesAlloweds A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
         * 
         * @return builder
         * 
         */
        public Builder severitiesAlloweds(List<String> severitiesAlloweds) {
            return severitiesAlloweds(Output.of(severitiesAlloweds));
        }

        /**
         * @param severitiesAlloweds A list of severities that are enabled for this source subtype consumed in Fusion detection. Possible values for each element are `High`, `Medium`, `Low`, `Informational`.
         * 
         * @return builder
         * 
         */
        public Builder severitiesAlloweds(String... severitiesAlloweds) {
            return severitiesAlloweds(List.of(severitiesAlloweds));
        }

        public AlertRuleFusionSourceSubTypeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.severitiesAlloweds = Objects.requireNonNull($.severitiesAlloweds, "expected parameter 'severitiesAlloweds' to be non-null");
            return $;
        }
    }

}