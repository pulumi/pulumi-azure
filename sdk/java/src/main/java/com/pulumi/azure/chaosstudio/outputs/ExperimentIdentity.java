// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.chaosstudio.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExperimentIdentity {
    /**
     * @return A list of User Managed Identity IDs which should be assigned to the Policy Definition.
     * 
     * &gt; **Note:** This is required when `type` is set to `UserAssigned`.
     * 
     */
    private @Nullable List<String> identityIds;
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    private @Nullable String principalId;
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return The Type of Managed Identity which should be added to this Policy Definition. Possible values are `SystemAssigned` and `UserAssigned`.
     * 
     */
    private String type;

    private ExperimentIdentity() {}
    /**
     * @return A list of User Managed Identity IDs which should be assigned to the Policy Definition.
     * 
     * &gt; **Note:** This is required when `type` is set to `UserAssigned`.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds == null ? List.of() : this.identityIds;
    }
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The Type of Managed Identity which should be added to this Policy Definition. Possible values are `SystemAssigned` and `UserAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> identityIds;
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;
        public Builder() {}
        public Builder(ExperimentIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identityIds(@Nullable List<String> identityIds) {

            this.identityIds = identityIds;
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
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
            if (type == null) {
              throw new MissingRequiredPropertyException("ExperimentIdentity", "type");
            }
            this.type = type;
            return this;
        }
        public ExperimentIdentity build() {
            final var _resultValue = new ExperimentIdentity();
            _resultValue.identityIds = identityIds;
            _resultValue.principalId = principalId;
            _resultValue.tenantId = tenantId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
