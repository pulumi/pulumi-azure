// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorIdentity {
    /**
     * @return The Principal ID for the Service Principal associated with the Identity of this Datadog Monitor.
     * 
     */
    private @Nullable String principalId;
    /**
     * @return The Tenant ID for the Service Principal associated with the Identity of this Datadog Monitor.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return Specifies the identity type of the Datadog Monitor. At this time the only allowed value is `SystemAssigned`.
     * 
     */
    private String type;

    private MonitorIdentity() {}
    /**
     * @return The Principal ID for the Service Principal associated with the Identity of this Datadog Monitor.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The Tenant ID for the Service Principal associated with the Identity of this Datadog Monitor.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return Specifies the identity type of the Datadog Monitor. At this time the only allowed value is `SystemAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;
        public Builder() {}
        public Builder(MonitorIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MonitorIdentity build() {
            final var o = new MonitorIdentity();
            o.principalId = principalId;
            o.tenantId = tenantId;
            o.type = type;
            return o;
        }
    }
}