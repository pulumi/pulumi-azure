// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyAssignmentNonComplianceMessage {
    /**
     * @return The non-compliance message text.
     * 
     */
    private String content;
    /**
     * @return The ID of the Policy Definition that the non-compliance message applies to.
     * 
     */
    private String policyDefinitionReferenceId;

    private GetPolicyAssignmentNonComplianceMessage() {}
    /**
     * @return The non-compliance message text.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The ID of the Policy Definition that the non-compliance message applies to.
     * 
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyAssignmentNonComplianceMessage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private String policyDefinitionReferenceId;
        public Builder() {}
        public Builder(GetPolicyAssignmentNonComplianceMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
        }

        @CustomType.Setter
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        @CustomType.Setter
        public Builder policyDefinitionReferenceId(String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = Objects.requireNonNull(policyDefinitionReferenceId);
            return this;
        }
        public GetPolicyAssignmentNonComplianceMessage build() {
            final var o = new GetPolicyAssignmentNonComplianceMessage();
            o.content = content;
            o.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return o;
        }
    }
}