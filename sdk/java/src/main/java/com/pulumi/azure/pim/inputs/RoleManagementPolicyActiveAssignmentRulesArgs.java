// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleManagementPolicyActiveAssignmentRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleManagementPolicyActiveAssignmentRulesArgs Empty = new RoleManagementPolicyActiveAssignmentRulesArgs();

    /**
     * Must an assignment have an expiry date. `false` allows permanent assignment.
     * 
     */
    @Import(name="expirationRequired")
    private @Nullable Output<Boolean> expirationRequired;

    /**
     * @return Must an assignment have an expiry date. `false` allows permanent assignment.
     * 
     */
    public Optional<Output<Boolean>> expirationRequired() {
        return Optional.ofNullable(this.expirationRequired);
    }

    /**
     * The maximum length of time an assignment can be valid, as an ISO8601 duration. Permitted values: `P15D`, `P30D`, `P90D`, `P180D`, or `P365D`.
     * 
     */
    @Import(name="expireAfter")
    private @Nullable Output<String> expireAfter;

    /**
     * @return The maximum length of time an assignment can be valid, as an ISO8601 duration. Permitted values: `P15D`, `P30D`, `P90D`, `P180D`, or `P365D`.
     * 
     */
    public Optional<Output<String>> expireAfter() {
        return Optional.ofNullable(this.expireAfter);
    }

    /**
     * Is a justification required to create new assignments.
     * 
     */
    @Import(name="requireJustification")
    private @Nullable Output<Boolean> requireJustification;

    /**
     * @return Is a justification required to create new assignments.
     * 
     */
    public Optional<Output<Boolean>> requireJustification() {
        return Optional.ofNullable(this.requireJustification);
    }

    /**
     * Is multi-factor authentication required to create new assignments.
     * 
     */
    @Import(name="requireMultifactorAuthentication")
    private @Nullable Output<Boolean> requireMultifactorAuthentication;

    /**
     * @return Is multi-factor authentication required to create new assignments.
     * 
     */
    public Optional<Output<Boolean>> requireMultifactorAuthentication() {
        return Optional.ofNullable(this.requireMultifactorAuthentication);
    }

    /**
     * Is ticket information required to create new assignments.
     * 
     * One of `expiration_required` or `expire_after` must be provided.
     * 
     */
    @Import(name="requireTicketInfo")
    private @Nullable Output<Boolean> requireTicketInfo;

    /**
     * @return Is ticket information required to create new assignments.
     * 
     * One of `expiration_required` or `expire_after` must be provided.
     * 
     */
    public Optional<Output<Boolean>> requireTicketInfo() {
        return Optional.ofNullable(this.requireTicketInfo);
    }

    private RoleManagementPolicyActiveAssignmentRulesArgs() {}

    private RoleManagementPolicyActiveAssignmentRulesArgs(RoleManagementPolicyActiveAssignmentRulesArgs $) {
        this.expirationRequired = $.expirationRequired;
        this.expireAfter = $.expireAfter;
        this.requireJustification = $.requireJustification;
        this.requireMultifactorAuthentication = $.requireMultifactorAuthentication;
        this.requireTicketInfo = $.requireTicketInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleManagementPolicyActiveAssignmentRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleManagementPolicyActiveAssignmentRulesArgs $;

        public Builder() {
            $ = new RoleManagementPolicyActiveAssignmentRulesArgs();
        }

        public Builder(RoleManagementPolicyActiveAssignmentRulesArgs defaults) {
            $ = new RoleManagementPolicyActiveAssignmentRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationRequired Must an assignment have an expiry date. `false` allows permanent assignment.
         * 
         * @return builder
         * 
         */
        public Builder expirationRequired(@Nullable Output<Boolean> expirationRequired) {
            $.expirationRequired = expirationRequired;
            return this;
        }

        /**
         * @param expirationRequired Must an assignment have an expiry date. `false` allows permanent assignment.
         * 
         * @return builder
         * 
         */
        public Builder expirationRequired(Boolean expirationRequired) {
            return expirationRequired(Output.of(expirationRequired));
        }

        /**
         * @param expireAfter The maximum length of time an assignment can be valid, as an ISO8601 duration. Permitted values: `P15D`, `P30D`, `P90D`, `P180D`, or `P365D`.
         * 
         * @return builder
         * 
         */
        public Builder expireAfter(@Nullable Output<String> expireAfter) {
            $.expireAfter = expireAfter;
            return this;
        }

        /**
         * @param expireAfter The maximum length of time an assignment can be valid, as an ISO8601 duration. Permitted values: `P15D`, `P30D`, `P90D`, `P180D`, or `P365D`.
         * 
         * @return builder
         * 
         */
        public Builder expireAfter(String expireAfter) {
            return expireAfter(Output.of(expireAfter));
        }

        /**
         * @param requireJustification Is a justification required to create new assignments.
         * 
         * @return builder
         * 
         */
        public Builder requireJustification(@Nullable Output<Boolean> requireJustification) {
            $.requireJustification = requireJustification;
            return this;
        }

        /**
         * @param requireJustification Is a justification required to create new assignments.
         * 
         * @return builder
         * 
         */
        public Builder requireJustification(Boolean requireJustification) {
            return requireJustification(Output.of(requireJustification));
        }

        /**
         * @param requireMultifactorAuthentication Is multi-factor authentication required to create new assignments.
         * 
         * @return builder
         * 
         */
        public Builder requireMultifactorAuthentication(@Nullable Output<Boolean> requireMultifactorAuthentication) {
            $.requireMultifactorAuthentication = requireMultifactorAuthentication;
            return this;
        }

        /**
         * @param requireMultifactorAuthentication Is multi-factor authentication required to create new assignments.
         * 
         * @return builder
         * 
         */
        public Builder requireMultifactorAuthentication(Boolean requireMultifactorAuthentication) {
            return requireMultifactorAuthentication(Output.of(requireMultifactorAuthentication));
        }

        /**
         * @param requireTicketInfo Is ticket information required to create new assignments.
         * 
         * One of `expiration_required` or `expire_after` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder requireTicketInfo(@Nullable Output<Boolean> requireTicketInfo) {
            $.requireTicketInfo = requireTicketInfo;
            return this;
        }

        /**
         * @param requireTicketInfo Is ticket information required to create new assignments.
         * 
         * One of `expiration_required` or `expire_after` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder requireTicketInfo(Boolean requireTicketInfo) {
            return requireTicketInfo(Output.of(requireTicketInfo));
        }

        public RoleManagementPolicyActiveAssignmentRulesArgs build() {
            return $;
        }
    }

}
