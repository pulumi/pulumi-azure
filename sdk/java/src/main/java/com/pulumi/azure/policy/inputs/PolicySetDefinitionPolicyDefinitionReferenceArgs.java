// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicySetDefinitionPolicyDefinitionReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicySetDefinitionPolicyDefinitionReferenceArgs Empty = new PolicySetDefinitionPolicyDefinitionReferenceArgs();

    /**
     * Parameter values for the referenced policy rule. This field is a JSON string that allows you to assign parameters to this policy rule.
     * 
     */
    @Import(name="parameterValues")
    private @Nullable Output<String> parameterValues;

    /**
     * @return Parameter values for the referenced policy rule. This field is a JSON string that allows you to assign parameters to this policy rule.
     * 
     */
    public Optional<Output<String>> parameterValues() {
        return Optional.ofNullable(this.parameterValues);
    }

    /**
     * The ID of the policy definition or policy set definition that will be included in this policy set definition.
     * 
     */
    @Import(name="policyDefinitionId", required=true)
    private Output<String> policyDefinitionId;

    /**
     * @return The ID of the policy definition or policy set definition that will be included in this policy set definition.
     * 
     */
    public Output<String> policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * A list of names of the policy definition groups that this policy definition reference belongs to.
     * 
     */
    @Import(name="policyGroupNames")
    private @Nullable Output<List<String>> policyGroupNames;

    /**
     * @return A list of names of the policy definition groups that this policy definition reference belongs to.
     * 
     */
    public Optional<Output<List<String>>> policyGroupNames() {
        return Optional.ofNullable(this.policyGroupNames);
    }

    /**
     * A unique ID within this policy set definition for this policy definition reference.
     * 
     */
    @Import(name="referenceId")
    private @Nullable Output<String> referenceId;

    /**
     * @return A unique ID within this policy set definition for this policy definition reference.
     * 
     */
    public Optional<Output<String>> referenceId() {
        return Optional.ofNullable(this.referenceId);
    }

    private PolicySetDefinitionPolicyDefinitionReferenceArgs() {}

    private PolicySetDefinitionPolicyDefinitionReferenceArgs(PolicySetDefinitionPolicyDefinitionReferenceArgs $) {
        this.parameterValues = $.parameterValues;
        this.policyDefinitionId = $.policyDefinitionId;
        this.policyGroupNames = $.policyGroupNames;
        this.referenceId = $.referenceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicySetDefinitionPolicyDefinitionReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicySetDefinitionPolicyDefinitionReferenceArgs $;

        public Builder() {
            $ = new PolicySetDefinitionPolicyDefinitionReferenceArgs();
        }

        public Builder(PolicySetDefinitionPolicyDefinitionReferenceArgs defaults) {
            $ = new PolicySetDefinitionPolicyDefinitionReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameterValues Parameter values for the referenced policy rule. This field is a JSON string that allows you to assign parameters to this policy rule.
         * 
         * @return builder
         * 
         */
        public Builder parameterValues(@Nullable Output<String> parameterValues) {
            $.parameterValues = parameterValues;
            return this;
        }

        /**
         * @param parameterValues Parameter values for the referenced policy rule. This field is a JSON string that allows you to assign parameters to this policy rule.
         * 
         * @return builder
         * 
         */
        public Builder parameterValues(String parameterValues) {
            return parameterValues(Output.of(parameterValues));
        }

        /**
         * @param policyDefinitionId The ID of the policy definition or policy set definition that will be included in this policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(Output<String> policyDefinitionId) {
            $.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @param policyDefinitionId The ID of the policy definition or policy set definition that will be included in this policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(String policyDefinitionId) {
            return policyDefinitionId(Output.of(policyDefinitionId));
        }

        /**
         * @param policyGroupNames A list of names of the policy definition groups that this policy definition reference belongs to.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupNames(@Nullable Output<List<String>> policyGroupNames) {
            $.policyGroupNames = policyGroupNames;
            return this;
        }

        /**
         * @param policyGroupNames A list of names of the policy definition groups that this policy definition reference belongs to.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupNames(List<String> policyGroupNames) {
            return policyGroupNames(Output.of(policyGroupNames));
        }

        /**
         * @param policyGroupNames A list of names of the policy definition groups that this policy definition reference belongs to.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupNames(String... policyGroupNames) {
            return policyGroupNames(List.of(policyGroupNames));
        }

        /**
         * @param referenceId A unique ID within this policy set definition for this policy definition reference.
         * 
         * @return builder
         * 
         */
        public Builder referenceId(@Nullable Output<String> referenceId) {
            $.referenceId = referenceId;
            return this;
        }

        /**
         * @param referenceId A unique ID within this policy set definition for this policy definition reference.
         * 
         * @return builder
         * 
         */
        public Builder referenceId(String referenceId) {
            return referenceId(Output.of(referenceId));
        }

        public PolicySetDefinitionPolicyDefinitionReferenceArgs build() {
            $.policyDefinitionId = Objects.requireNonNull($.policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
            return $;
        }
    }

}