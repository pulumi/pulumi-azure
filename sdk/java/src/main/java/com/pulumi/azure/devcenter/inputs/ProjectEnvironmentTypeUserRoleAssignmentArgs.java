// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devcenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProjectEnvironmentTypeUserRoleAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentTypeUserRoleAssignmentArgs Empty = new ProjectEnvironmentTypeUserRoleAssignmentArgs();

    /**
     * A list of roles to assign to the `user_id`.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<String>> roles;

    /**
     * @return A list of roles to assign to the `user_id`.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }

    /**
     * The user object ID that is assigned roles.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The user object ID that is assigned roles.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private ProjectEnvironmentTypeUserRoleAssignmentArgs() {}

    private ProjectEnvironmentTypeUserRoleAssignmentArgs(ProjectEnvironmentTypeUserRoleAssignmentArgs $) {
        this.roles = $.roles;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectEnvironmentTypeUserRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectEnvironmentTypeUserRoleAssignmentArgs $;

        public Builder() {
            $ = new ProjectEnvironmentTypeUserRoleAssignmentArgs();
        }

        public Builder(ProjectEnvironmentTypeUserRoleAssignmentArgs defaults) {
            $ = new ProjectEnvironmentTypeUserRoleAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roles A list of roles to assign to the `user_id`.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A list of roles to assign to the `user_id`.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles A list of roles to assign to the `user_id`.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userId The user object ID that is assigned roles.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user object ID that is assigned roles.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public ProjectEnvironmentTypeUserRoleAssignmentArgs build() {
            if ($.roles == null) {
                throw new MissingRequiredPropertyException("ProjectEnvironmentTypeUserRoleAssignmentArgs", "roles");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("ProjectEnvironmentTypeUserRoleAssignmentArgs", "userId");
            }
            return $;
        }
    }

}
