// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentWebApplicationFirewallStatusComponentVersion {
    private @Nullable String wafEngineVersion;
    private @Nullable String wafNginxVersion;

    private DeploymentWebApplicationFirewallStatusComponentVersion() {}
    public Optional<String> wafEngineVersion() {
        return Optional.ofNullable(this.wafEngineVersion);
    }
    public Optional<String> wafNginxVersion() {
        return Optional.ofNullable(this.wafNginxVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentWebApplicationFirewallStatusComponentVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String wafEngineVersion;
        private @Nullable String wafNginxVersion;
        public Builder() {}
        public Builder(DeploymentWebApplicationFirewallStatusComponentVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wafEngineVersion = defaults.wafEngineVersion;
    	      this.wafNginxVersion = defaults.wafNginxVersion;
        }

        @CustomType.Setter
        public Builder wafEngineVersion(@Nullable String wafEngineVersion) {

            this.wafEngineVersion = wafEngineVersion;
            return this;
        }
        @CustomType.Setter
        public Builder wafNginxVersion(@Nullable String wafNginxVersion) {

            this.wafNginxVersion = wafNginxVersion;
            return this;
        }
        public DeploymentWebApplicationFirewallStatusComponentVersion build() {
            final var _resultValue = new DeploymentWebApplicationFirewallStatusComponentVersion();
            _resultValue.wafEngineVersion = wafEngineVersion;
            _resultValue.wafNginxVersion = wafNginxVersion;
            return _resultValue;
        }
    }
}
