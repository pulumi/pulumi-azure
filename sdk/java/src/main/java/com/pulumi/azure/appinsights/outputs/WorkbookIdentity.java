// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkbookIdentity {
    /**
     * @return The list of User Assigned Managed Identity IDs assigned to this Workbook.
     * 
     */
    private @Nullable List<String> identityIds;
    /**
     * @return The Principal ID of the System Assigned Managed Service Identity that is configured on this Workbook.
     * 
     */
    private @Nullable String principalId;
    /**
     * @return The Tenant ID of the System Assigned Managed Service Identity that is configured on this Workbook.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return The type of Managed Service Identity that is configured on this Workbook.
     * 
     */
    private String type;

    private WorkbookIdentity() {}
    /**
     * @return The list of User Assigned Managed Identity IDs assigned to this Workbook.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds == null ? List.of() : this.identityIds;
    }
    /**
     * @return The Principal ID of the System Assigned Managed Service Identity that is configured on this Workbook.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The Tenant ID of the System Assigned Managed Service Identity that is configured on this Workbook.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The type of Managed Service Identity that is configured on this Workbook.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> identityIds;
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;
        public Builder() {}
        public Builder(WorkbookIdentity defaults) {
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
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public WorkbookIdentity build() {
            final var o = new WorkbookIdentity();
            o.identityIds = identityIds;
            o.principalId = principalId;
            o.tenantId = tenantId;
            o.type = type;
            return o;
        }
    }
}