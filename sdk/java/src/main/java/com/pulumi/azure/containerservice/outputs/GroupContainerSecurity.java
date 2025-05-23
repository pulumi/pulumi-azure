// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GroupContainerSecurity {
    /**
     * @return Whether the container&#39;s permission is elevated to privileged? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Currently, this only applies when the `os_type` is `Linux` and the `sku` is `Confidential`.
     * 
     */
    private Boolean privilegeEnabled;

    private GroupContainerSecurity() {}
    /**
     * @return Whether the container&#39;s permission is elevated to privileged? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Currently, this only applies when the `os_type` is `Linux` and the `sku` is `Confidential`.
     * 
     */
    public Boolean privilegeEnabled() {
        return this.privilegeEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupContainerSecurity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean privilegeEnabled;
        public Builder() {}
        public Builder(GroupContainerSecurity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privilegeEnabled = defaults.privilegeEnabled;
        }

        @CustomType.Setter
        public Builder privilegeEnabled(Boolean privilegeEnabled) {
            if (privilegeEnabled == null) {
              throw new MissingRequiredPropertyException("GroupContainerSecurity", "privilegeEnabled");
            }
            this.privilegeEnabled = privilegeEnabled;
            return this;
        }
        public GroupContainerSecurity build() {
            final var _resultValue = new GroupContainerSecurity();
            _resultValue.privilegeEnabled = privilegeEnabled;
            return _resultValue;
        }
    }
}
