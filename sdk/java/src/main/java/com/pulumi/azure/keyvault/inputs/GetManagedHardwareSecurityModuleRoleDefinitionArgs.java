// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedHardwareSecurityModuleRoleDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedHardwareSecurityModuleRoleDefinitionArgs Empty = new GetManagedHardwareSecurityModuleRoleDefinitionArgs();

    /**
     * The ID of the Key Vault Managed Hardware Security Module.
     * 
     */
    @Import(name="managedHsmId", required=true)
    private Output<String> managedHsmId;

    /**
     * @return The ID of the Key Vault Managed Hardware Security Module.
     * 
     */
    public Output<String> managedHsmId() {
        return this.managedHsmId;
    }

    /**
     * The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetManagedHardwareSecurityModuleRoleDefinitionArgs() {}

    private GetManagedHardwareSecurityModuleRoleDefinitionArgs(GetManagedHardwareSecurityModuleRoleDefinitionArgs $) {
        this.managedHsmId = $.managedHsmId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedHardwareSecurityModuleRoleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedHardwareSecurityModuleRoleDefinitionArgs $;

        public Builder() {
            $ = new GetManagedHardwareSecurityModuleRoleDefinitionArgs();
        }

        public Builder(GetManagedHardwareSecurityModuleRoleDefinitionArgs defaults) {
            $ = new GetManagedHardwareSecurityModuleRoleDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedHsmId The ID of the Key Vault Managed Hardware Security Module.
         * 
         * @return builder
         * 
         */
        public Builder managedHsmId(Output<String> managedHsmId) {
            $.managedHsmId = managedHsmId;
            return this;
        }

        /**
         * @param managedHsmId The ID of the Key Vault Managed Hardware Security Module.
         * 
         * @return builder
         * 
         */
        public Builder managedHsmId(String managedHsmId) {
            return managedHsmId(Output.of(managedHsmId));
        }

        /**
         * @param name The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetManagedHardwareSecurityModuleRoleDefinitionArgs build() {
            if ($.managedHsmId == null) {
                throw new MissingRequiredPropertyException("GetManagedHardwareSecurityModuleRoleDefinitionArgs", "managedHsmId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetManagedHardwareSecurityModuleRoleDefinitionArgs", "name");
            }
            return $;
        }
    }

}
