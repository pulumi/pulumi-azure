// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.oracle.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAutonomousDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousDatabaseArgs Empty = new GetAutonomousDatabaseArgs();

    /**
     * The name of this Autonomous Database.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Autonomous Database.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Autonomous Database exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Autonomous Database exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAutonomousDatabaseArgs() {}

    private GetAutonomousDatabaseArgs(GetAutonomousDatabaseArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousDatabaseArgs $;

        public Builder() {
            $ = new GetAutonomousDatabaseArgs();
        }

        public Builder(GetAutonomousDatabaseArgs defaults) {
            $ = new GetAutonomousDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Autonomous Database.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Autonomous Database.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Autonomous Database exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Autonomous Database exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetAutonomousDatabaseArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAutonomousDatabaseArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetAutonomousDatabaseArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
