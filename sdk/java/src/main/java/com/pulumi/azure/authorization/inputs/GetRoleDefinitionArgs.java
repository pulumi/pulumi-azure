// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.authorization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleDefinitionArgs Empty = new GetRoleDefinitionArgs();

    /**
     * Specifies the Name of either a built-in or custom Role Definition.
     * 
     * &gt; **Note:** You can also use this for built-in roles such as `Contributor`, `Owner`, `Reader` and `Virtual Machine Contributor`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the Name of either a built-in or custom Role Definition.
     * 
     * &gt; **Note:** You can also use this for built-in roles such as `Contributor`, `Owner`, `Reader` and `Virtual Machine Contributor`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the Role Definition as a UUID/GUID.
     * 
     */
    @Import(name="roleDefinitionId")
    private @Nullable Output<String> roleDefinitionId;

    /**
     * @return Specifies the ID of the Role Definition as a UUID/GUID.
     * 
     */
    public Optional<Output<String>> roleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }

    /**
     * Specifies the Scope at which the Custom Role Definition exists.
     * 
     * &gt; **Note:** One of `name` or `role_definition_id` must be specified.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Specifies the Scope at which the Custom Role Definition exists.
     * 
     * &gt; **Note:** One of `name` or `role_definition_id` must be specified.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private GetRoleDefinitionArgs() {}

    private GetRoleDefinitionArgs(GetRoleDefinitionArgs $) {
        this.name = $.name;
        this.roleDefinitionId = $.roleDefinitionId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleDefinitionArgs $;

        public Builder() {
            $ = new GetRoleDefinitionArgs();
        }

        public Builder(GetRoleDefinitionArgs defaults) {
            $ = new GetRoleDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the Name of either a built-in or custom Role Definition.
         * 
         * &gt; **Note:** You can also use this for built-in roles such as `Contributor`, `Owner`, `Reader` and `Virtual Machine Contributor`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the Name of either a built-in or custom Role Definition.
         * 
         * &gt; **Note:** You can also use this for built-in roles such as `Contributor`, `Owner`, `Reader` and `Virtual Machine Contributor`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleDefinitionId Specifies the ID of the Role Definition as a UUID/GUID.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        /**
         * @param roleDefinitionId Specifies the ID of the Role Definition as a UUID/GUID.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            return roleDefinitionId(Output.of(roleDefinitionId));
        }

        /**
         * @param scope Specifies the Scope at which the Custom Role Definition exists.
         * 
         * &gt; **Note:** One of `name` or `role_definition_id` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies the Scope at which the Custom Role Definition exists.
         * 
         * &gt; **Note:** One of `name` or `role_definition_id` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public GetRoleDefinitionArgs build() {
            return $;
        }
    }

}
