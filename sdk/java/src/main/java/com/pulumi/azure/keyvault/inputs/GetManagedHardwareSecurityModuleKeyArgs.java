// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedHardwareSecurityModuleKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedHardwareSecurityModuleKeyArgs Empty = new GetManagedHardwareSecurityModuleKeyArgs();

    /**
     * Specifies the ID of the Managed Hardware Security Module instance where the Secret resides, available on the `azure.keyvault.ManagedHardwareSecurityModuleKey` Data Source / Resource.
     * 
     * &gt; **Note:** The Managed Hardware Security Module must be in the same subscription as the provider. If the Managed Hardware Security Module is in another subscription, you must create an aliased provider for that subscription.
     * 
     */
    @Import(name="managedHsmId", required=true)
    private Output<String> managedHsmId;

    /**
     * @return Specifies the ID of the Managed Hardware Security Module instance where the Secret resides, available on the `azure.keyvault.ManagedHardwareSecurityModuleKey` Data Source / Resource.
     * 
     * &gt; **Note:** The Managed Hardware Security Module must be in the same subscription as the provider. If the Managed Hardware Security Module is in another subscription, you must create an aliased provider for that subscription.
     * 
     */
    public Output<String> managedHsmId() {
        return this.managedHsmId;
    }

    /**
     * Specifies the name of the Managed Hardware Security Module Key.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Managed Hardware Security Module Key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetManagedHardwareSecurityModuleKeyArgs() {}

    private GetManagedHardwareSecurityModuleKeyArgs(GetManagedHardwareSecurityModuleKeyArgs $) {
        this.managedHsmId = $.managedHsmId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedHardwareSecurityModuleKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedHardwareSecurityModuleKeyArgs $;

        public Builder() {
            $ = new GetManagedHardwareSecurityModuleKeyArgs();
        }

        public Builder(GetManagedHardwareSecurityModuleKeyArgs defaults) {
            $ = new GetManagedHardwareSecurityModuleKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedHsmId Specifies the ID of the Managed Hardware Security Module instance where the Secret resides, available on the `azure.keyvault.ManagedHardwareSecurityModuleKey` Data Source / Resource.
         * 
         * &gt; **Note:** The Managed Hardware Security Module must be in the same subscription as the provider. If the Managed Hardware Security Module is in another subscription, you must create an aliased provider for that subscription.
         * 
         * @return builder
         * 
         */
        public Builder managedHsmId(Output<String> managedHsmId) {
            $.managedHsmId = managedHsmId;
            return this;
        }

        /**
         * @param managedHsmId Specifies the ID of the Managed Hardware Security Module instance where the Secret resides, available on the `azure.keyvault.ManagedHardwareSecurityModuleKey` Data Source / Resource.
         * 
         * &gt; **Note:** The Managed Hardware Security Module must be in the same subscription as the provider. If the Managed Hardware Security Module is in another subscription, you must create an aliased provider for that subscription.
         * 
         * @return builder
         * 
         */
        public Builder managedHsmId(String managedHsmId) {
            return managedHsmId(Output.of(managedHsmId));
        }

        /**
         * @param name Specifies the name of the Managed Hardware Security Module Key.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Managed Hardware Security Module Key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetManagedHardwareSecurityModuleKeyArgs build() {
            if ($.managedHsmId == null) {
                throw new MissingRequiredPropertyException("GetManagedHardwareSecurityModuleKeyArgs", "managedHsmId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetManagedHardwareSecurityModuleKeyArgs", "name");
            }
            return $;
        }
    }

}
