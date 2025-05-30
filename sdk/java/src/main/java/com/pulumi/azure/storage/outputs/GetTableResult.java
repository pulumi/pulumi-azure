// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.GetTableAcl;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableResult {
    /**
     * @return A mapping of ACLs for this Table.
     * 
     */
    private List<GetTableAcl> acls;
    /**
     * @return The ID of the Storage Table.
     * 
     */
    private String id;
    private String name;
    /**
     * @return The Resource Manager ID of this Storage Table.
     * 
     */
    private String resourceManagerId;
    private String storageAccountName;

    private GetTableResult() {}
    /**
     * @return A mapping of ACLs for this Table.
     * 
     */
    public List<GetTableAcl> acls() {
        return this.acls;
    }
    /**
     * @return The ID of the Storage Table.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Resource Manager ID of this Storage Table.
     * 
     */
    public String resourceManagerId() {
        return this.resourceManagerId;
    }
    public String storageAccountName() {
        return this.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTableAcl> acls;
        private String id;
        private String name;
        private String resourceManagerId;
        private String storageAccountName;
        public Builder() {}
        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceManagerId = defaults.resourceManagerId;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        @CustomType.Setter
        public Builder acls(List<GetTableAcl> acls) {
            if (acls == null) {
              throw new MissingRequiredPropertyException("GetTableResult", "acls");
            }
            this.acls = acls;
            return this;
        }
        public Builder acls(GetTableAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTableResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTableResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceManagerId(String resourceManagerId) {
            if (resourceManagerId == null) {
              throw new MissingRequiredPropertyException("GetTableResult", "resourceManagerId");
            }
            this.resourceManagerId = resourceManagerId;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(String storageAccountName) {
            if (storageAccountName == null) {
              throw new MissingRequiredPropertyException("GetTableResult", "storageAccountName");
            }
            this.storageAccountName = storageAccountName;
            return this;
        }
        public GetTableResult build() {
            final var _resultValue = new GetTableResult();
            _resultValue.acls = acls;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.resourceManagerId = resourceManagerId;
            _resultValue.storageAccountName = storageAccountName;
            return _resultValue;
        }
    }
}
