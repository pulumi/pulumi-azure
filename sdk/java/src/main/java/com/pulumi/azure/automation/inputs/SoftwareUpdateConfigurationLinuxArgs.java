// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SoftwareUpdateConfigurationLinuxArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareUpdateConfigurationLinuxArgs Empty = new SoftwareUpdateConfigurationLinuxArgs();

    /**
     * Specifies the update classifications included in the Software Update Configuration. Possible values are `Unclassified`, `Critical`, `Security` and `Other`.
     * 
     */
    @Import(name="classificationIncluded")
    private @Nullable Output<String> classificationIncluded;

    /**
     * @return Specifies the update classifications included in the Software Update Configuration. Possible values are `Unclassified`, `Critical`, `Security` and `Other`.
     * 
     */
    public Optional<Output<String>> classificationIncluded() {
        return Optional.ofNullable(this.classificationIncluded);
    }

    /**
     * Specifies a list of packages to excluded from the Software Update Configuration.
     * 
     */
    @Import(name="excludedPackages")
    private @Nullable Output<List<String>> excludedPackages;

    /**
     * @return Specifies a list of packages to excluded from the Software Update Configuration.
     * 
     */
    public Optional<Output<List<String>>> excludedPackages() {
        return Optional.ofNullable(this.excludedPackages);
    }

    /**
     * Specifies a list of packages to included from the Software Update Configuration.
     * 
     */
    @Import(name="includedPackages")
    private @Nullable Output<List<String>> includedPackages;

    /**
     * @return Specifies a list of packages to included from the Software Update Configuration.
     * 
     */
    public Optional<Output<List<String>>> includedPackages() {
        return Optional.ofNullable(this.includedPackages);
    }

    /**
     * Specifies the reboot settings after software update, possible values are `IfRequired`, `Never` and `Always`
     * 
     */
    @Import(name="reboot")
    private @Nullable Output<String> reboot;

    /**
     * @return Specifies the reboot settings after software update, possible values are `IfRequired`, `Never` and `Always`
     * 
     */
    public Optional<Output<String>> reboot() {
        return Optional.ofNullable(this.reboot);
    }

    private SoftwareUpdateConfigurationLinuxArgs() {}

    private SoftwareUpdateConfigurationLinuxArgs(SoftwareUpdateConfigurationLinuxArgs $) {
        this.classificationIncluded = $.classificationIncluded;
        this.excludedPackages = $.excludedPackages;
        this.includedPackages = $.includedPackages;
        this.reboot = $.reboot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareUpdateConfigurationLinuxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareUpdateConfigurationLinuxArgs $;

        public Builder() {
            $ = new SoftwareUpdateConfigurationLinuxArgs();
        }

        public Builder(SoftwareUpdateConfigurationLinuxArgs defaults) {
            $ = new SoftwareUpdateConfigurationLinuxArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classificationIncluded Specifies the update classifications included in the Software Update Configuration. Possible values are `Unclassified`, `Critical`, `Security` and `Other`.
         * 
         * @return builder
         * 
         */
        public Builder classificationIncluded(@Nullable Output<String> classificationIncluded) {
            $.classificationIncluded = classificationIncluded;
            return this;
        }

        /**
         * @param classificationIncluded Specifies the update classifications included in the Software Update Configuration. Possible values are `Unclassified`, `Critical`, `Security` and `Other`.
         * 
         * @return builder
         * 
         */
        public Builder classificationIncluded(String classificationIncluded) {
            return classificationIncluded(Output.of(classificationIncluded));
        }

        /**
         * @param excludedPackages Specifies a list of packages to excluded from the Software Update Configuration.
         * 
         * @return builder
         * 
         */
        public Builder excludedPackages(@Nullable Output<List<String>> excludedPackages) {
            $.excludedPackages = excludedPackages;
            return this;
        }

        /**
         * @param excludedPackages Specifies a list of packages to excluded from the Software Update Configuration.
         * 
         * @return builder
         * 
         */
        public Builder excludedPackages(List<String> excludedPackages) {
            return excludedPackages(Output.of(excludedPackages));
        }

        /**
         * @param excludedPackages Specifies a list of packages to excluded from the Software Update Configuration.
         * 
         * @return builder
         * 
         */
        public Builder excludedPackages(String... excludedPackages) {
            return excludedPackages(List.of(excludedPackages));
        }

        /**
         * @param includedPackages Specifies a list of packages to included from the Software Update Configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackages(@Nullable Output<List<String>> includedPackages) {
            $.includedPackages = includedPackages;
            return this;
        }

        /**
         * @param includedPackages Specifies a list of packages to included from the Software Update Configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackages(List<String> includedPackages) {
            return includedPackages(Output.of(includedPackages));
        }

        /**
         * @param includedPackages Specifies a list of packages to included from the Software Update Configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackages(String... includedPackages) {
            return includedPackages(List.of(includedPackages));
        }

        /**
         * @param reboot Specifies the reboot settings after software update, possible values are `IfRequired`, `Never` and `Always`
         * 
         * @return builder
         * 
         */
        public Builder reboot(@Nullable Output<String> reboot) {
            $.reboot = reboot;
            return this;
        }

        /**
         * @param reboot Specifies the reboot settings after software update, possible values are `IfRequired`, `Never` and `Always`
         * 
         * @return builder
         * 
         */
        public Builder reboot(String reboot) {
            return reboot(Output.of(reboot));
        }

        public SoftwareUpdateConfigurationLinuxArgs build() {
            return $;
        }
    }

}