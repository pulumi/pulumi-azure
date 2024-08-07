// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFlexibleServerResult {
    /**
     * @return The Administrator login for the PostgreSQL Flexible Server.
     * 
     */
    private String administratorLogin;
    /**
     * @return Is the storage auto grow for PostgreSQL Flexible Server enabled?
     * 
     */
    private Boolean autoGrowEnabled;
    /**
     * @return The backup retention days for the PostgreSQL Flexible Server.
     * 
     */
    private Integer backupRetentionDays;
    /**
     * @return The ID of the virtual network subnet to create the PostgreSQL Flexible Server.
     * 
     */
    private String delegatedSubnetId;
    /**
     * @return The FQDN of the PostgreSQL Flexible Server.
     * 
     */
    private String fqdn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the PostgreSQL Flexible Server exists.
     * 
     */
    private String location;
    private String name;
    /**
     * @return Is public network access enabled?
     * 
     */
    private Boolean publicNetworkAccessEnabled;
    private String resourceGroupName;
    /**
     * @return The SKU Name for the PostgreSQL Flexible Server. The name of the SKU, follows the `tier` + `name` pattern (e.g. `B_Standard_B1ms`, `GP_Standard_D2s_v3`, `MO_Standard_E4s_v3`).
     * 
     */
    private String skuName;
    /**
     * @return The max storage allowed for the PostgreSQL Flexible Server.
     * 
     */
    private Integer storageMb;
    /**
     * @return A mapping of tags assigned to the PostgreSQL Flexible Server.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The version of PostgreSQL Flexible Server to use.
     * 
     */
    private String version;

    private GetFlexibleServerResult() {}
    /**
     * @return The Administrator login for the PostgreSQL Flexible Server.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return Is the storage auto grow for PostgreSQL Flexible Server enabled?
     * 
     */
    public Boolean autoGrowEnabled() {
        return this.autoGrowEnabled;
    }
    /**
     * @return The backup retention days for the PostgreSQL Flexible Server.
     * 
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }
    /**
     * @return The ID of the virtual network subnet to create the PostgreSQL Flexible Server.
     * 
     */
    public String delegatedSubnetId() {
        return this.delegatedSubnetId;
    }
    /**
     * @return The FQDN of the PostgreSQL Flexible Server.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the PostgreSQL Flexible Server exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Is public network access enabled?
     * 
     */
    public Boolean publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU Name for the PostgreSQL Flexible Server. The name of the SKU, follows the `tier` + `name` pattern (e.g. `B_Standard_B1ms`, `GP_Standard_D2s_v3`, `MO_Standard_E4s_v3`).
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return The max storage allowed for the PostgreSQL Flexible Server.
     * 
     */
    public Integer storageMb() {
        return this.storageMb;
    }
    /**
     * @return A mapping of tags assigned to the PostgreSQL Flexible Server.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The version of PostgreSQL Flexible Server to use.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlexibleServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String administratorLogin;
        private Boolean autoGrowEnabled;
        private Integer backupRetentionDays;
        private String delegatedSubnetId;
        private String fqdn;
        private String id;
        private String location;
        private String name;
        private Boolean publicNetworkAccessEnabled;
        private String resourceGroupName;
        private String skuName;
        private Integer storageMb;
        private Map<String,String> tags;
        private String version;
        public Builder() {}
        public Builder(GetFlexibleServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.autoGrowEnabled = defaults.autoGrowEnabled;
    	      this.backupRetentionDays = defaults.backupRetentionDays;
    	      this.delegatedSubnetId = defaults.delegatedSubnetId;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.storageMb = defaults.storageMb;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder administratorLogin(String administratorLogin) {
            if (administratorLogin == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "administratorLogin");
            }
            this.administratorLogin = administratorLogin;
            return this;
        }
        @CustomType.Setter
        public Builder autoGrowEnabled(Boolean autoGrowEnabled) {
            if (autoGrowEnabled == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "autoGrowEnabled");
            }
            this.autoGrowEnabled = autoGrowEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder backupRetentionDays(Integer backupRetentionDays) {
            if (backupRetentionDays == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "backupRetentionDays");
            }
            this.backupRetentionDays = backupRetentionDays;
            return this;
        }
        @CustomType.Setter
        public Builder delegatedSubnetId(String delegatedSubnetId) {
            if (delegatedSubnetId == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "delegatedSubnetId");
            }
            this.delegatedSubnetId = delegatedSubnetId;
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            if (fqdn == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "fqdn");
            }
            this.fqdn = fqdn;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            if (publicNetworkAccessEnabled == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "publicNetworkAccessEnabled");
            }
            this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder skuName(String skuName) {
            if (skuName == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "skuName");
            }
            this.skuName = skuName;
            return this;
        }
        @CustomType.Setter
        public Builder storageMb(Integer storageMb) {
            if (storageMb == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "storageMb");
            }
            this.storageMb = storageMb;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetFlexibleServerResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetFlexibleServerResult build() {
            final var _resultValue = new GetFlexibleServerResult();
            _resultValue.administratorLogin = administratorLogin;
            _resultValue.autoGrowEnabled = autoGrowEnabled;
            _resultValue.backupRetentionDays = backupRetentionDays;
            _resultValue.delegatedSubnetId = delegatedSubnetId;
            _resultValue.fqdn = fqdn;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.skuName = skuName;
            _resultValue.storageMb = storageMb;
            _resultValue.tags = tags;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
