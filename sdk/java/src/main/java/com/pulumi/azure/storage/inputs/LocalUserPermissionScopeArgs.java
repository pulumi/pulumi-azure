// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.LocalUserPermissionScopePermissionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LocalUserPermissionScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalUserPermissionScopeArgs Empty = new LocalUserPermissionScopeArgs();

    /**
     * A `permissions` block as defined below.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<LocalUserPermissionScopePermissionsArgs> permissions;

    /**
     * @return A `permissions` block as defined below.
     * 
     */
    public Output<LocalUserPermissionScopePermissionsArgs> permissions() {
        return this.permissions;
    }

    /**
     * The container name (when `service` is set to `blob`) or the file share name (when `service` is set to `file`), used by the Storage Account Local User.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The container name (when `service` is set to `blob`) or the file share name (when `service` is set to `file`), used by the Storage Account Local User.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * The storage service used by this Storage Account Local User. Possible values are `blob` and `file`.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The storage service used by this Storage Account Local User. Possible values are `blob` and `file`.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private LocalUserPermissionScopeArgs() {}

    private LocalUserPermissionScopeArgs(LocalUserPermissionScopeArgs $) {
        this.permissions = $.permissions;
        this.resourceName = $.resourceName;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalUserPermissionScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalUserPermissionScopeArgs $;

        public Builder() {
            $ = new LocalUserPermissionScopeArgs();
        }

        public Builder(LocalUserPermissionScopeArgs defaults) {
            $ = new LocalUserPermissionScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissions A `permissions` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<LocalUserPermissionScopePermissionsArgs> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions A `permissions` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(LocalUserPermissionScopePermissionsArgs permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param resourceName The container name (when `service` is set to `blob`) or the file share name (when `service` is set to `file`), used by the Storage Account Local User.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The container name (when `service` is set to `blob`) or the file share name (when `service` is set to `file`), used by the Storage Account Local User.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param service The storage service used by this Storage Account Local User. Possible values are `blob` and `file`.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The storage service used by this Storage Account Local User. Possible values are `blob` and `file`.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public LocalUserPermissionScopeArgs build() {
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("LocalUserPermissionScopeArgs", "permissions");
            }
            if ($.resourceName == null) {
                throw new MissingRequiredPropertyException("LocalUserPermissionScopeArgs", "resourceName");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("LocalUserPermissionScopeArgs", "service");
            }
            return $;
        }
    }

}
