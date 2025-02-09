// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDpsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDpsArgs Empty = new GetDpsArgs();

    /**
     * Specifies the name of the Iot Device Provisioning Service resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Iot Device Provisioning Service resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group under which the Iot Device Provisioning Service is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the Iot Device Provisioning Service is located in.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDpsArgs() {}

    private GetDpsArgs(GetDpsArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDpsArgs $;

        public Builder() {
            $ = new GetDpsArgs();
        }

        public Builder(GetDpsArgs defaults) {
            $ = new GetDpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Iot Device Provisioning Service resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Iot Device Provisioning Service resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Iot Device Provisioning Service is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Iot Device Provisioning Service is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetDpsArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDpsArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetDpsArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
