// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.azure.core.outputs.GetSubscriptionsSubscription;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSubscriptionsResult {
    private @Nullable String displayNameContains;
    private @Nullable String displayNamePrefix;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return One or more `subscription` blocks as defined below.
     * 
     */
    private List<GetSubscriptionsSubscription> subscriptions;

    private GetSubscriptionsResult() {}
    public Optional<String> displayNameContains() {
        return Optional.ofNullable(this.displayNameContains);
    }
    public Optional<String> displayNamePrefix() {
        return Optional.ofNullable(this.displayNamePrefix);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return One or more `subscription` blocks as defined below.
     * 
     */
    public List<GetSubscriptionsSubscription> subscriptions() {
        return this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayNameContains;
        private @Nullable String displayNamePrefix;
        private String id;
        private List<GetSubscriptionsSubscription> subscriptions;
        public Builder() {}
        public Builder(GetSubscriptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayNameContains = defaults.displayNameContains;
    	      this.displayNamePrefix = defaults.displayNamePrefix;
    	      this.id = defaults.id;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder displayNameContains(@Nullable String displayNameContains) {

            this.displayNameContains = displayNameContains;
            return this;
        }
        @CustomType.Setter
        public Builder displayNamePrefix(@Nullable String displayNamePrefix) {

            this.displayNamePrefix = displayNamePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSubscriptionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptions(List<GetSubscriptionsSubscription> subscriptions) {
            if (subscriptions == null) {
              throw new MissingRequiredPropertyException("GetSubscriptionsResult", "subscriptions");
            }
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(GetSubscriptionsSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public GetSubscriptionsResult build() {
            final var _resultValue = new GetSubscriptionsResult();
            _resultValue.displayNameContains = displayNameContains;
            _resultValue.displayNamePrefix = displayNamePrefix;
            _resultValue.id = id;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}
