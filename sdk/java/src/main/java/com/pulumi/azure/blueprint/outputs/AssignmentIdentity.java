// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.blueprint.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AssignmentIdentity {
    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Blueprint.
     * 
     */
    private List<String> identityIds;
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Blueprint. Only possible value is `UserAssigned`.
     * 
     */
    private String type;

    private AssignmentIdentity() {}
    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Blueprint.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Blueprint. Only possible value is `UserAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String type;
        public Builder() {}
        public Builder(AssignmentIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identityIds(List<String> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AssignmentIdentity build() {
            final var o = new AssignmentIdentity();
            o.identityIds = identityIds;
            o.type = type;
            return o;
        }
    }
}