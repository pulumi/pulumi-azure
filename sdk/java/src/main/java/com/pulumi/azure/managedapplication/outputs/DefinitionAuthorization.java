// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.managedapplication.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DefinitionAuthorization {
    /**
     * @return Specifies a role definition identifier for the provider. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    private String roleDefinitionId;
    /**
     * @return Specifies a service principal identifier for the provider. This is the identity that the provider will use to call ARM to manage the managed application resources.
     * 
     */
    private String servicePrincipalId;

    private DefinitionAuthorization() {}
    /**
     * @return Specifies a role definition identifier for the provider. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * @return Specifies a service principal identifier for the provider. This is the identity that the provider will use to call ARM to manage the managed application resources.
     * 
     */
    public String servicePrincipalId() {
        return this.servicePrincipalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefinitionAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String roleDefinitionId;
        private String servicePrincipalId;
        public Builder() {}
        public Builder(DefinitionAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
        }

        @CustomType.Setter
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        @CustomType.Setter
        public Builder servicePrincipalId(String servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }
        public DefinitionAuthorization build() {
            final var o = new DefinitionAuthorization();
            o.roleDefinitionId = roleDefinitionId;
            o.servicePrincipalId = servicePrincipalId;
            return o;
        }
    }
}