// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSpringCloudServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpringCloudServiceArgs Empty = new GetSpringCloudServiceArgs();

    /**
     * Specifies The name of the Spring Cloud Service resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies The name of the Spring Cloud Service resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the Resource Group where the Spring Cloud Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Spring Cloud Service exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetSpringCloudServiceArgs() {}

    private GetSpringCloudServiceArgs(GetSpringCloudServiceArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpringCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpringCloudServiceArgs $;

        public Builder() {
            $ = new GetSpringCloudServiceArgs();
        }

        public Builder(GetSpringCloudServiceArgs defaults) {
            $ = new GetSpringCloudServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies The name of the Spring Cloud Service resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies The name of the Spring Cloud Service resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Spring Cloud Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Spring Cloud Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetSpringCloudServiceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSpringCloudServiceArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetSpringCloudServiceArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
