// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetShareAclAccessPolicy {
    /**
     * @return The time at which this Access Policy is valid until.
     * 
     */
    private String expiry;
    /**
     * @return The permissions which should be associated with this Shared Identifier. Possible value is combination of `r` (read), `w` (write), `d` (delete), and `l` (list).
     * 
     */
    private String permissions;
    /**
     * @return The time at which this Access Policy is valid from.
     * 
     */
    private String start;

    private GetShareAclAccessPolicy() {}
    /**
     * @return The time at which this Access Policy is valid until.
     * 
     */
    public String expiry() {
        return this.expiry;
    }
    /**
     * @return The permissions which should be associated with this Shared Identifier. Possible value is combination of `r` (read), `w` (write), `d` (delete), and `l` (list).
     * 
     */
    public String permissions() {
        return this.permissions;
    }
    /**
     * @return The time at which this Access Policy is valid from.
     * 
     */
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareAclAccessPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expiry;
        private String permissions;
        private String start;
        public Builder() {}
        public Builder(GetShareAclAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.permissions = defaults.permissions;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder expiry(String expiry) {
            if (expiry == null) {
              throw new MissingRequiredPropertyException("GetShareAclAccessPolicy", "expiry");
            }
            this.expiry = expiry;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetShareAclAccessPolicy", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            if (start == null) {
              throw new MissingRequiredPropertyException("GetShareAclAccessPolicy", "start");
            }
            this.start = start;
            return this;
        }
        public GetShareAclAccessPolicy build() {
            final var _resultValue = new GetShareAclAccessPolicy();
            _resultValue.expiry = expiry;
            _resultValue.permissions = permissions;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}
