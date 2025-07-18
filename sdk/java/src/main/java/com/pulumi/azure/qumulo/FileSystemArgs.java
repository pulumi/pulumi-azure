// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.qumulo;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemArgs Empty = new FileSystemArgs();

    /**
     * The initial administrator password of the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="adminPassword", required=true)
    private Output<String> adminPassword;

    /**
     * @return The initial administrator password of the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> adminPassword() {
        return this.adminPassword;
    }

    /**
     * The email address used for the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address used for the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The Azure Region where the Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of this Azure Native Qumulo Scalable File System resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Azure Native Qumulo Scalable File System resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the marketplace offer ID. Defaults to `qumulo-saas-mpp`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="offerId")
    private @Nullable Output<String> offerId;

    /**
     * @return Specifies the marketplace offer ID. Defaults to `qumulo-saas-mpp`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> offerId() {
        return Optional.ofNullable(this.offerId);
    }

    /**
     * Specifies the marketplace plan ID. Defaults to `azure-native-qumulo-v3`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    /**
     * @return Specifies the marketplace plan ID. Defaults to `azure-native-qumulo-v3`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * Specifies the marketplace publisher ID. Defaults to `qumulo1584033880660`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publisherId")
    private @Nullable Output<String> publisherId;

    /**
     * @return Specifies the marketplace publisher ID. Defaults to `qumulo1584033880660`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }

    /**
     * Specifies the name of the Resource Group within which this Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group within which this Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage Sku. Possible values are `Cold_LRS`, `Hot_LRS` and `Hot_ZRS`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageSku", required=true)
    private Output<String> storageSku;

    /**
     * @return The storage Sku. Possible values are `Cold_LRS`, `Hot_LRS` and `Hot_ZRS`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageSku() {
        return this.storageSku;
    }

    /**
     * The delegated subnet ID for Vnet injection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The delegated subnet ID for Vnet injection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     * A mapping of tags which should be assigned to the File System.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the File System.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Availability Zone in which the Azure Native Qumulo Scalable File system is located. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The Availability Zone in which the Azure Native Qumulo Scalable File system is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private FileSystemArgs() {}

    private FileSystemArgs(FileSystemArgs $) {
        this.adminPassword = $.adminPassword;
        this.email = $.email;
        this.location = $.location;
        this.name = $.name;
        this.offerId = $.offerId;
        this.planId = $.planId;
        this.publisherId = $.publisherId;
        this.resourceGroupName = $.resourceGroupName;
        this.storageSku = $.storageSku;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemArgs $;

        public Builder() {
            $ = new FileSystemArgs();
        }

        public Builder(FileSystemArgs defaults) {
            $ = new FileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminPassword The initial administrator password of the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword The initial administrator password of the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param email The email address used for the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address used for the Azure Native Qumulo Scalable File System. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param location The Azure Region where the Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of this Azure Native Qumulo Scalable File System resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Azure Native Qumulo Scalable File System resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offerId Specifies the marketplace offer ID. Defaults to `qumulo-saas-mpp`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder offerId(@Nullable Output<String> offerId) {
            $.offerId = offerId;
            return this;
        }

        /**
         * @param offerId Specifies the marketplace offer ID. Defaults to `qumulo-saas-mpp`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder offerId(String offerId) {
            return offerId(Output.of(offerId));
        }

        /**
         * @param planId Specifies the marketplace plan ID. Defaults to `azure-native-qumulo-v3`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param planId Specifies the marketplace plan ID. Defaults to `azure-native-qumulo-v3`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        /**
         * @param publisherId Specifies the marketplace publisher ID. Defaults to `qumulo1584033880660`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(@Nullable Output<String> publisherId) {
            $.publisherId = publisherId;
            return this;
        }

        /**
         * @param publisherId Specifies the marketplace publisher ID. Defaults to `qumulo1584033880660`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(String publisherId) {
            return publisherId(Output.of(publisherId));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group within which this Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group within which this Azure Native Qumulo Scalable File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageSku The storage Sku. Possible values are `Cold_LRS`, `Hot_LRS` and `Hot_ZRS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageSku(Output<String> storageSku) {
            $.storageSku = storageSku;
            return this;
        }

        /**
         * @param storageSku The storage Sku. Possible values are `Cold_LRS`, `Hot_LRS` and `Hot_ZRS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageSku(String storageSku) {
            return storageSku(Output.of(storageSku));
        }

        /**
         * @param subnetId The delegated subnet ID for Vnet injection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The delegated subnet ID for Vnet injection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the File System.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the File System.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zone The Availability Zone in which the Azure Native Qumulo Scalable File system is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The Availability Zone in which the Azure Native Qumulo Scalable File system is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public FileSystemArgs build() {
            if ($.adminPassword == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "adminPassword");
            }
            if ($.email == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "email");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "resourceGroupName");
            }
            if ($.storageSku == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "storageSku");
            }
            if ($.subnetId == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "subnetId");
            }
            if ($.zone == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "zone");
            }
            return $;
        }
    }

}
