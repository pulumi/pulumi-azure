// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentWebApplicationFirewallStatusComponentVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentWebApplicationFirewallStatusComponentVersionArgs Empty = new DeploymentWebApplicationFirewallStatusComponentVersionArgs();

    @Import(name="wafEngineVersion")
    private @Nullable Output<String> wafEngineVersion;

    public Optional<Output<String>> wafEngineVersion() {
        return Optional.ofNullable(this.wafEngineVersion);
    }

    @Import(name="wafNginxVersion")
    private @Nullable Output<String> wafNginxVersion;

    public Optional<Output<String>> wafNginxVersion() {
        return Optional.ofNullable(this.wafNginxVersion);
    }

    private DeploymentWebApplicationFirewallStatusComponentVersionArgs() {}

    private DeploymentWebApplicationFirewallStatusComponentVersionArgs(DeploymentWebApplicationFirewallStatusComponentVersionArgs $) {
        this.wafEngineVersion = $.wafEngineVersion;
        this.wafNginxVersion = $.wafNginxVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentWebApplicationFirewallStatusComponentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentWebApplicationFirewallStatusComponentVersionArgs $;

        public Builder() {
            $ = new DeploymentWebApplicationFirewallStatusComponentVersionArgs();
        }

        public Builder(DeploymentWebApplicationFirewallStatusComponentVersionArgs defaults) {
            $ = new DeploymentWebApplicationFirewallStatusComponentVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder wafEngineVersion(@Nullable Output<String> wafEngineVersion) {
            $.wafEngineVersion = wafEngineVersion;
            return this;
        }

        public Builder wafEngineVersion(String wafEngineVersion) {
            return wafEngineVersion(Output.of(wafEngineVersion));
        }

        public Builder wafNginxVersion(@Nullable Output<String> wafNginxVersion) {
            $.wafNginxVersion = wafNginxVersion;
            return this;
        }

        public Builder wafNginxVersion(String wafNginxVersion) {
            return wafNginxVersion(Output.of(wafNginxVersion));
        }

        public DeploymentWebApplicationFirewallStatusComponentVersionArgs build() {
            return $;
        }
    }

}
