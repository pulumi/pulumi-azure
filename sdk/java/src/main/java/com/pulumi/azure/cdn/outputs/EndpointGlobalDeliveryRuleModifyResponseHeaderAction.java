// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointGlobalDeliveryRuleModifyResponseHeaderAction {
    /**
     * @return Action to be executed on a header value. Valid values are `Append`, `Delete` and `Overwrite`.
     * 
     */
    private String action;
    /**
     * @return The header name.
     * 
     */
    private String name;
    /**
     * @return The value of the header. Only needed when `action` is set to `Append` or `overwrite`.
     * 
     */
    private @Nullable String value;

    private EndpointGlobalDeliveryRuleModifyResponseHeaderAction() {}
    /**
     * @return Action to be executed on a header value. Valid values are `Append`, `Delete` and `Overwrite`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The header name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the header. Only needed when `action` is set to `Append` or `overwrite`.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGlobalDeliveryRuleModifyResponseHeaderAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(EndpointGlobalDeliveryRuleModifyResponseHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EndpointGlobalDeliveryRuleModifyResponseHeaderAction build() {
            final var o = new EndpointGlobalDeliveryRuleModifyResponseHeaderAction();
            o.action = action;
            o.name = name;
            o.value = value;
            return o;
        }
    }
}