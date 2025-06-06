// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointIpConfiguration {
    /**
     * @return Specifies the member name this IP address applies to. If it is not specified, it will use the value of `subresource_name`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `member_name` will be required and will not take the value of `subresource_name` in the next major version.
     * 
     */
    private @Nullable String memberName;
    /**
     * @return Specifies the Name of the IP Configuration. Changing this forces a new resource to be created.
     * 
     */
    private String name;
    /**
     * @return Specifies the static IP address within the private endpoint&#39;s subnet to be used. Changing this forces a new resource to be created.
     * 
     */
    private String privateIpAddress;
    /**
     * @return Specifies the subresource this IP address applies to. `subresource_names` corresponds to `group_id`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String subresourceName;

    private EndpointIpConfiguration() {}
    /**
     * @return Specifies the member name this IP address applies to. If it is not specified, it will use the value of `subresource_name`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `member_name` will be required and will not take the value of `subresource_name` in the next major version.
     * 
     */
    public Optional<String> memberName() {
        return Optional.ofNullable(this.memberName);
    }
    /**
     * @return Specifies the Name of the IP Configuration. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the static IP address within the private endpoint&#39;s subnet to be used. Changing this forces a new resource to be created.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return Specifies the subresource this IP address applies to. `subresource_names` corresponds to `group_id`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> subresourceName() {
        return Optional.ofNullable(this.subresourceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String memberName;
        private String name;
        private String privateIpAddress;
        private @Nullable String subresourceName;
        public Builder() {}
        public Builder(EndpointIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberName = defaults.memberName;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.subresourceName = defaults.subresourceName;
        }

        @CustomType.Setter
        public Builder memberName(@Nullable String memberName) {

            this.memberName = memberName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("EndpointIpConfiguration", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            if (privateIpAddress == null) {
              throw new MissingRequiredPropertyException("EndpointIpConfiguration", "privateIpAddress");
            }
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder subresourceName(@Nullable String subresourceName) {

            this.subresourceName = subresourceName;
            return this;
        }
        public EndpointIpConfiguration build() {
            final var _resultValue = new EndpointIpConfiguration();
            _resultValue.memberName = memberName;
            _resultValue.name = name;
            _resultValue.privateIpAddress = privateIpAddress;
            _resultValue.subresourceName = subresourceName;
            return _resultValue;
        }
    }
}
