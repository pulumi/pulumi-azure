// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetServiceEndpointStoragePolicyDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetServiceEndpointStoragePolicyDefinitionArgs Empty = new SubnetServiceEndpointStoragePolicyDefinitionArgs();

    /**
     * The description of this Subnet Service Endpoint Storage Policy Definition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this Subnet Service Endpoint Storage Policy Definition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name which should be used for this Subnet Service Endpoint Storage Policy Definition.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this Subnet Service Endpoint Storage Policy Definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of service resources. Valid values are `Microsoft.Storage` or `Global`. When the `service_resources` property contains resource IDs, this property must be `Microsoft.Storage`. When the `service_resources` property contains Aliases, this property must be `Global`. Defaults to `Microsoft.Storage`.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The type of service resources. Valid values are `Microsoft.Storage` or `Global`. When the `service_resources` property contains resource IDs, this property must be `Microsoft.Storage`. When the `service_resources` property contains Aliases, this property must be `Global`. Defaults to `Microsoft.Storage`.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Specifies a list of resources or aliases that this Subnet Service Endpoint Storage Policy Definition applies to.
     * 
     * &gt; **Note:** The `service_resources` property must contain either Aliases or Resource IDs, but not both.
     * 
     */
    @Import(name="serviceResources", required=true)
    private Output<List<String>> serviceResources;

    /**
     * @return Specifies a list of resources or aliases that this Subnet Service Endpoint Storage Policy Definition applies to.
     * 
     * &gt; **Note:** The `service_resources` property must contain either Aliases or Resource IDs, but not both.
     * 
     */
    public Output<List<String>> serviceResources() {
        return this.serviceResources;
    }

    private SubnetServiceEndpointStoragePolicyDefinitionArgs() {}

    private SubnetServiceEndpointStoragePolicyDefinitionArgs(SubnetServiceEndpointStoragePolicyDefinitionArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.service = $.service;
        this.serviceResources = $.serviceResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetServiceEndpointStoragePolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetServiceEndpointStoragePolicyDefinitionArgs $;

        public Builder() {
            $ = new SubnetServiceEndpointStoragePolicyDefinitionArgs();
        }

        public Builder(SubnetServiceEndpointStoragePolicyDefinitionArgs defaults) {
            $ = new SubnetServiceEndpointStoragePolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of this Subnet Service Endpoint Storage Policy Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this Subnet Service Endpoint Storage Policy Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name which should be used for this Subnet Service Endpoint Storage Policy Definition.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Subnet Service Endpoint Storage Policy Definition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param service The type of service resources. Valid values are `Microsoft.Storage` or `Global`. When the `service_resources` property contains resource IDs, this property must be `Microsoft.Storage`. When the `service_resources` property contains Aliases, this property must be `Global`. Defaults to `Microsoft.Storage`.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The type of service resources. Valid values are `Microsoft.Storage` or `Global`. When the `service_resources` property contains resource IDs, this property must be `Microsoft.Storage`. When the `service_resources` property contains Aliases, this property must be `Global`. Defaults to `Microsoft.Storage`.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param serviceResources Specifies a list of resources or aliases that this Subnet Service Endpoint Storage Policy Definition applies to.
         * 
         * &gt; **Note:** The `service_resources` property must contain either Aliases or Resource IDs, but not both.
         * 
         * @return builder
         * 
         */
        public Builder serviceResources(Output<List<String>> serviceResources) {
            $.serviceResources = serviceResources;
            return this;
        }

        /**
         * @param serviceResources Specifies a list of resources or aliases that this Subnet Service Endpoint Storage Policy Definition applies to.
         * 
         * &gt; **Note:** The `service_resources` property must contain either Aliases or Resource IDs, but not both.
         * 
         * @return builder
         * 
         */
        public Builder serviceResources(List<String> serviceResources) {
            return serviceResources(Output.of(serviceResources));
        }

        /**
         * @param serviceResources Specifies a list of resources or aliases that this Subnet Service Endpoint Storage Policy Definition applies to.
         * 
         * &gt; **Note:** The `service_resources` property must contain either Aliases or Resource IDs, but not both.
         * 
         * @return builder
         * 
         */
        public Builder serviceResources(String... serviceResources) {
            return serviceResources(List.of(serviceResources));
        }

        public SubnetServiceEndpointStoragePolicyDefinitionArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("SubnetServiceEndpointStoragePolicyDefinitionArgs", "name");
            }
            if ($.serviceResources == null) {
                throw new MissingRequiredPropertyException("SubnetServiceEndpointStoragePolicyDefinitionArgs", "serviceResources");
            }
            return $;
        }
    }

}
