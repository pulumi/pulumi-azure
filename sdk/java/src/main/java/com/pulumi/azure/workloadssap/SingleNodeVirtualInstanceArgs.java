// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap;

import com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceIdentityArgs;
import com.pulumi.azure.workloadssap.inputs.SingleNodeVirtualInstanceSingleServerConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SingleNodeVirtualInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SingleNodeVirtualInstanceArgs Empty = new SingleNodeVirtualInstanceArgs();

    /**
     * The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appLocation", required=true)
    private Output<String> appLocation;

    /**
     * @return The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appLocation() {
        return this.appLocation;
    }

    /**
     * The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="environment", required=true)
    private Output<String> environment;

    /**
     * @return The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<SingleNodeVirtualInstanceIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<SingleNodeVirtualInstanceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managedResourceGroupName")
    private @Nullable Output<String> managedResourceGroupName;

    /**
     * @return The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> managedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }

    /**
     * The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
     * 
     */
    @Import(name="managedResourcesNetworkAccessType")
    private @Nullable Output<String> managedResourcesNetworkAccessType;

    /**
     * @return The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
     * 
     */
    public Optional<Output<String>> managedResourcesNetworkAccessType() {
        return Optional.ofNullable(this.managedResourcesNetworkAccessType);
    }

    /**
     * Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sapFqdn", required=true)
    private Output<String> sapFqdn;

    /**
     * @return The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sapFqdn() {
        return this.sapFqdn;
    }

    /**
     * The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sapProduct", required=true)
    private Output<String> sapProduct;

    /**
     * @return The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sapProduct() {
        return this.sapProduct;
    }

    /**
     * A `single_server_configuration` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="singleServerConfiguration", required=true)
    private Output<SingleNodeVirtualInstanceSingleServerConfigurationArgs> singleServerConfiguration;

    /**
     * @return A `single_server_configuration` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<SingleNodeVirtualInstanceSingleServerConfigurationArgs> singleServerConfiguration() {
        return this.singleServerConfiguration;
    }

    /**
     * A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SingleNodeVirtualInstanceArgs() {}

    private SingleNodeVirtualInstanceArgs(SingleNodeVirtualInstanceArgs $) {
        this.appLocation = $.appLocation;
        this.environment = $.environment;
        this.identity = $.identity;
        this.location = $.location;
        this.managedResourceGroupName = $.managedResourceGroupName;
        this.managedResourcesNetworkAccessType = $.managedResourcesNetworkAccessType;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sapFqdn = $.sapFqdn;
        this.sapProduct = $.sapProduct;
        this.singleServerConfiguration = $.singleServerConfiguration;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SingleNodeVirtualInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SingleNodeVirtualInstanceArgs $;

        public Builder() {
            $ = new SingleNodeVirtualInstanceArgs();
        }

        public Builder(SingleNodeVirtualInstanceArgs defaults) {
            $ = new SingleNodeVirtualInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appLocation The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appLocation(Output<String> appLocation) {
            $.appLocation = appLocation;
            return this;
        }

        /**
         * @param appLocation The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appLocation(String appLocation) {
            return appLocation(Output.of(appLocation));
        }

        /**
         * @param environment The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<SingleNodeVirtualInstanceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(SingleNodeVirtualInstanceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedResourceGroupName The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(@Nullable Output<String> managedResourceGroupName) {
            $.managedResourceGroupName = managedResourceGroupName;
            return this;
        }

        /**
         * @param managedResourceGroupName The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(String managedResourceGroupName) {
            return managedResourceGroupName(Output.of(managedResourceGroupName));
        }

        /**
         * @param managedResourcesNetworkAccessType The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
         * 
         * @return builder
         * 
         */
        public Builder managedResourcesNetworkAccessType(@Nullable Output<String> managedResourcesNetworkAccessType) {
            $.managedResourcesNetworkAccessType = managedResourcesNetworkAccessType;
            return this;
        }

        /**
         * @param managedResourcesNetworkAccessType The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
         * 
         * @return builder
         * 
         */
        public Builder managedResourcesNetworkAccessType(String managedResourcesNetworkAccessType) {
            return managedResourcesNetworkAccessType(Output.of(managedResourcesNetworkAccessType));
        }

        /**
         * @param name Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sapFqdn The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sapFqdn(Output<String> sapFqdn) {
            $.sapFqdn = sapFqdn;
            return this;
        }

        /**
         * @param sapFqdn The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sapFqdn(String sapFqdn) {
            return sapFqdn(Output.of(sapFqdn));
        }

        /**
         * @param sapProduct The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sapProduct(Output<String> sapProduct) {
            $.sapProduct = sapProduct;
            return this;
        }

        /**
         * @param sapProduct The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sapProduct(String sapProduct) {
            return sapProduct(Output.of(sapProduct));
        }

        /**
         * @param singleServerConfiguration A `single_server_configuration` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder singleServerConfiguration(Output<SingleNodeVirtualInstanceSingleServerConfigurationArgs> singleServerConfiguration) {
            $.singleServerConfiguration = singleServerConfiguration;
            return this;
        }

        /**
         * @param singleServerConfiguration A `single_server_configuration` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder singleServerConfiguration(SingleNodeVirtualInstanceSingleServerConfigurationArgs singleServerConfiguration) {
            return singleServerConfiguration(Output.of(singleServerConfiguration));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SingleNodeVirtualInstanceArgs build() {
            if ($.appLocation == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceArgs", "appLocation");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceArgs", "environment");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceArgs", "resourceGroupName");
            }
            if ($.sapFqdn == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceArgs", "sapFqdn");
            }
            if ($.sapProduct == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceArgs", "sapProduct");
            }
            if ($.singleServerConfiguration == null) {
                throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceArgs", "singleServerConfiguration");
            }
            return $;
        }
    }

}
