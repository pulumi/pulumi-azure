// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointPrivateDnsZoneGroup {
    /**
     * @return The ID of the Private DNS Zone Config.
     * 
     */
    private @Nullable String id;
    /**
     * @return Specifies the Name of the Private DNS Zone Group.
     * 
     */
    private String name;
    /**
     * @return Specifies the list of Private DNS Zones to include within the `private_dns_zone_group`.
     * 
     */
    private List<String> privateDnsZoneIds;

    private EndpointPrivateDnsZoneGroup() {}
    /**
     * @return The ID of the Private DNS Zone Config.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Specifies the Name of the Private DNS Zone Group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the list of Private DNS Zones to include within the `private_dns_zone_group`.
     * 
     */
    public List<String> privateDnsZoneIds() {
        return this.privateDnsZoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPrivateDnsZoneGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private String name;
        private List<String> privateDnsZoneIds;
        public Builder() {}
        public Builder(EndpointPrivateDnsZoneGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateDnsZoneIds = defaults.privateDnsZoneIds;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("EndpointPrivateDnsZoneGroup", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privateDnsZoneIds(List<String> privateDnsZoneIds) {
            if (privateDnsZoneIds == null) {
              throw new MissingRequiredPropertyException("EndpointPrivateDnsZoneGroup", "privateDnsZoneIds");
            }
            this.privateDnsZoneIds = privateDnsZoneIds;
            return this;
        }
        public Builder privateDnsZoneIds(String... privateDnsZoneIds) {
            return privateDnsZoneIds(List.of(privateDnsZoneIds));
        }
        public EndpointPrivateDnsZoneGroup build() {
            final var _resultValue = new EndpointPrivateDnsZoneGroup();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.privateDnsZoneIds = privateDnsZoneIds;
            return _resultValue;
        }
    }
}
