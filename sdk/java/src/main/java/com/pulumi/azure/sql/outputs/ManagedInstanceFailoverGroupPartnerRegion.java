// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstanceFailoverGroupPartnerRegion {
    /**
     * @return The Azure Region where the SQL Instance Failover Group exists.
     * 
     */
    private @Nullable String location;
    /**
     * @return The partner replication role of the SQL Instance Failover Group.
     * 
     */
    private @Nullable String role;

    private ManagedInstanceFailoverGroupPartnerRegion() {}
    /**
     * @return The Azure Region where the SQL Instance Failover Group exists.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The partner replication role of the SQL Instance Failover Group.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceFailoverGroupPartnerRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String location;
        private @Nullable String role;
        public Builder() {}
        public Builder(ManagedInstanceFailoverGroupPartnerRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public ManagedInstanceFailoverGroupPartnerRegion build() {
            final var o = new ManagedInstanceFailoverGroupPartnerRegion();
            o.location = location;
            o.role = role;
            return o;
        }
    }
}