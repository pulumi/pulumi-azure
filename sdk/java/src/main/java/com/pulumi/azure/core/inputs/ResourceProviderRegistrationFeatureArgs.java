// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResourceProviderRegistrationFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceProviderRegistrationFeatureArgs Empty = new ResourceProviderRegistrationFeatureArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Should this feature be Registered or Unregistered?
     * 
     */
    @Import(name="registered", required=true)
    private Output<Boolean> registered;

    /**
     * @return Should this feature be Registered or Unregistered?
     * 
     */
    public Output<Boolean> registered() {
        return this.registered;
    }

    private ResourceProviderRegistrationFeatureArgs() {}

    private ResourceProviderRegistrationFeatureArgs(ResourceProviderRegistrationFeatureArgs $) {
        this.name = $.name;
        this.registered = $.registered;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceProviderRegistrationFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceProviderRegistrationFeatureArgs $;

        public Builder() {
            $ = new ResourceProviderRegistrationFeatureArgs();
        }

        public Builder(ResourceProviderRegistrationFeatureArgs defaults) {
            $ = new ResourceProviderRegistrationFeatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param registered Should this feature be Registered or Unregistered?
         * 
         * @return builder
         * 
         */
        public Builder registered(Output<Boolean> registered) {
            $.registered = registered;
            return this;
        }

        /**
         * @param registered Should this feature be Registered or Unregistered?
         * 
         * @return builder
         * 
         */
        public Builder registered(Boolean registered) {
            return registered(Output.of(registered));
        }

        public ResourceProviderRegistrationFeatureArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ResourceProviderRegistrationFeatureArgs", "name");
            }
            if ($.registered == null) {
                throw new MissingRequiredPropertyException("ResourceProviderRegistrationFeatureArgs", "registered");
            }
            return $;
        }
    }

}
