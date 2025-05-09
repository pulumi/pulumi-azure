// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceGroupPolicyExemptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceGroupPolicyExemptionArgs Empty = new ResourceGroupPolicyExemptionArgs();

    /**
     * A description to use for this Policy Exemption.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description to use for this Policy Exemption.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A friendly display name to use for this Policy Exemption.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A friendly display name to use for this Policy Exemption.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
     * 
     */
    @Import(name="exemptionCategory", required=true)
    private Output<String> exemptionCategory;

    /**
     * @return The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
     * 
     */
    public Output<String> exemptionCategory() {
        return this.exemptionCategory;
    }

    /**
     * The expiration date and time in UTC ISO 8601 format of this policy exemption.
     * 
     */
    @Import(name="expiresOn")
    private @Nullable Output<String> expiresOn;

    /**
     * @return The expiration date and time in UTC ISO 8601 format of this policy exemption.
     * 
     */
    public Optional<Output<String>> expiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }

    /**
     * The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<String> metadata;

    /**
     * @return The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
     * 
     */
    public Optional<Output<String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the Policy Exemption. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Policy Exemption. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Policy Assignment to be exempted at the specified Scope. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="policyAssignmentId", required=true)
    private Output<String> policyAssignmentId;

    /**
     * @return The ID of the Policy Assignment to be exempted at the specified Scope. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     */
    @Import(name="policyDefinitionReferenceIds")
    private @Nullable Output<List<String>> policyDefinitionReferenceIds;

    /**
     * @return The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     */
    public Optional<Output<List<String>>> policyDefinitionReferenceIds() {
        return Optional.ofNullable(this.policyDefinitionReferenceIds);
    }

    /**
     * The Resource Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupId", required=true)
    private Output<String> resourceGroupId;

    /**
     * @return The Resource Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    private ResourceGroupPolicyExemptionArgs() {}

    private ResourceGroupPolicyExemptionArgs(ResourceGroupPolicyExemptionArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.exemptionCategory = $.exemptionCategory;
        this.expiresOn = $.expiresOn;
        this.metadata = $.metadata;
        this.name = $.name;
        this.policyAssignmentId = $.policyAssignmentId;
        this.policyDefinitionReferenceIds = $.policyDefinitionReferenceIds;
        this.resourceGroupId = $.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGroupPolicyExemptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGroupPolicyExemptionArgs $;

        public Builder() {
            $ = new ResourceGroupPolicyExemptionArgs();
        }

        public Builder(ResourceGroupPolicyExemptionArgs defaults) {
            $ = new ResourceGroupPolicyExemptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description to use for this Policy Exemption.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description to use for this Policy Exemption.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A friendly display name to use for this Policy Exemption.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A friendly display name to use for this Policy Exemption.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param exemptionCategory The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
         * 
         * @return builder
         * 
         */
        public Builder exemptionCategory(Output<String> exemptionCategory) {
            $.exemptionCategory = exemptionCategory;
            return this;
        }

        /**
         * @param exemptionCategory The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
         * 
         * @return builder
         * 
         */
        public Builder exemptionCategory(String exemptionCategory) {
            return exemptionCategory(Output.of(exemptionCategory));
        }

        /**
         * @param expiresOn The expiration date and time in UTC ISO 8601 format of this policy exemption.
         * 
         * @return builder
         * 
         */
        public Builder expiresOn(@Nullable Output<String> expiresOn) {
            $.expiresOn = expiresOn;
            return this;
        }

        /**
         * @param expiresOn The expiration date and time in UTC ISO 8601 format of this policy exemption.
         * 
         * @return builder
         * 
         */
        public Builder expiresOn(String expiresOn) {
            return expiresOn(Output.of(expiresOn));
        }

        /**
         * @param metadata The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name of the Policy Exemption. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Policy Exemption. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyAssignmentId The ID of the Policy Assignment to be exempted at the specified Scope. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyAssignmentId(Output<String> policyAssignmentId) {
            $.policyAssignmentId = policyAssignmentId;
            return this;
        }

        /**
         * @param policyAssignmentId The ID of the Policy Assignment to be exempted at the specified Scope. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyAssignmentId(String policyAssignmentId) {
            return policyAssignmentId(Output.of(policyAssignmentId));
        }

        /**
         * @param policyDefinitionReferenceIds The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionReferenceIds(@Nullable Output<List<String>> policyDefinitionReferenceIds) {
            $.policyDefinitionReferenceIds = policyDefinitionReferenceIds;
            return this;
        }

        /**
         * @param policyDefinitionReferenceIds The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds) {
            return policyDefinitionReferenceIds(Output.of(policyDefinitionReferenceIds));
        }

        /**
         * @param policyDefinitionReferenceIds The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionReferenceIds(String... policyDefinitionReferenceIds) {
            return policyDefinitionReferenceIds(List.of(policyDefinitionReferenceIds));
        }

        /**
         * @param resourceGroupId The Resource Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Resource Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        public ResourceGroupPolicyExemptionArgs build() {
            if ($.exemptionCategory == null) {
                throw new MissingRequiredPropertyException("ResourceGroupPolicyExemptionArgs", "exemptionCategory");
            }
            if ($.policyAssignmentId == null) {
                throw new MissingRequiredPropertyException("ResourceGroupPolicyExemptionArgs", "policyAssignmentId");
            }
            if ($.resourceGroupId == null) {
                throw new MissingRequiredPropertyException("ResourceGroupPolicyExemptionArgs", "resourceGroupId");
            }
            return $;
        }
    }

}
