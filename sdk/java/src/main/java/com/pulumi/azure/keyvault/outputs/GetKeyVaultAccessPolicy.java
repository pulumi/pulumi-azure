// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeyVaultAccessPolicy {
    /**
     * @return The Object ID of a Azure Active Directory Application.
     * 
     */
    private String applicationId;
    /**
     * @return A list of certificate permissions applicable to this Access Policy.
     * 
     */
    private List<String> certificatePermissions;
    /**
     * @return A list of key permissions applicable to this Access Policy.
     * 
     */
    private List<String> keyPermissions;
    /**
     * @return An Object ID of a User, Service Principal or Security Group.
     * 
     */
    private String objectId;
    /**
     * @return A list of secret permissions applicable to this Access Policy.
     * 
     */
    private List<String> secretPermissions;
    /**
     * @return A list of storage permissions applicable to this Access Policy.
     * 
     */
    private List<String> storagePermissions;
    /**
     * @return The Azure Active Directory Tenant ID used to authenticate requests for this Key Vault.
     * 
     */
    private String tenantId;

    private GetKeyVaultAccessPolicy() {}
    /**
     * @return The Object ID of a Azure Active Directory Application.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return A list of certificate permissions applicable to this Access Policy.
     * 
     */
    public List<String> certificatePermissions() {
        return this.certificatePermissions;
    }
    /**
     * @return A list of key permissions applicable to this Access Policy.
     * 
     */
    public List<String> keyPermissions() {
        return this.keyPermissions;
    }
    /**
     * @return An Object ID of a User, Service Principal or Security Group.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return A list of secret permissions applicable to this Access Policy.
     * 
     */
    public List<String> secretPermissions() {
        return this.secretPermissions;
    }
    /**
     * @return A list of storage permissions applicable to this Access Policy.
     * 
     */
    public List<String> storagePermissions() {
        return this.storagePermissions;
    }
    /**
     * @return The Azure Active Directory Tenant ID used to authenticate requests for this Key Vault.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyVaultAccessPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private List<String> certificatePermissions;
        private List<String> keyPermissions;
        private String objectId;
        private List<String> secretPermissions;
        private List<String> storagePermissions;
        private String tenantId;
        public Builder() {}
        public Builder(GetKeyVaultAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.certificatePermissions = defaults.certificatePermissions;
    	      this.keyPermissions = defaults.keyPermissions;
    	      this.objectId = defaults.objectId;
    	      this.secretPermissions = defaults.secretPermissions;
    	      this.storagePermissions = defaults.storagePermissions;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder certificatePermissions(List<String> certificatePermissions) {
            this.certificatePermissions = Objects.requireNonNull(certificatePermissions);
            return this;
        }
        public Builder certificatePermissions(String... certificatePermissions) {
            return certificatePermissions(List.of(certificatePermissions));
        }
        @CustomType.Setter
        public Builder keyPermissions(List<String> keyPermissions) {
            this.keyPermissions = Objects.requireNonNull(keyPermissions);
            return this;
        }
        public Builder keyPermissions(String... keyPermissions) {
            return keyPermissions(List.of(keyPermissions));
        }
        @CustomType.Setter
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        @CustomType.Setter
        public Builder secretPermissions(List<String> secretPermissions) {
            this.secretPermissions = Objects.requireNonNull(secretPermissions);
            return this;
        }
        public Builder secretPermissions(String... secretPermissions) {
            return secretPermissions(List.of(secretPermissions));
        }
        @CustomType.Setter
        public Builder storagePermissions(List<String> storagePermissions) {
            this.storagePermissions = Objects.requireNonNull(storagePermissions);
            return this;
        }
        public Builder storagePermissions(String... storagePermissions) {
            return storagePermissions(List.of(storagePermissions));
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public GetKeyVaultAccessPolicy build() {
            final var o = new GetKeyVaultAccessPolicy();
            o.applicationId = applicationId;
            o.certificatePermissions = certificatePermissions;
            o.keyPermissions = keyPermissions;
            o.objectId = objectId;
            o.secretPermissions = secretPermissions;
            o.storagePermissions = storagePermissions;
            o.tenantId = tenantId;
            return o;
        }
    }
}