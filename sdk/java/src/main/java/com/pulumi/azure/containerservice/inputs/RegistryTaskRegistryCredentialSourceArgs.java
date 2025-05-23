// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RegistryTaskRegistryCredentialSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryTaskRegistryCredentialSourceArgs Empty = new RegistryTaskRegistryCredentialSourceArgs();

    /**
     * The login mode for the source registry. Possible values are `None` and `Default`.
     * 
     */
    @Import(name="loginMode", required=true)
    private Output<String> loginMode;

    /**
     * @return The login mode for the source registry. Possible values are `None` and `Default`.
     * 
     */
    public Output<String> loginMode() {
        return this.loginMode;
    }

    private RegistryTaskRegistryCredentialSourceArgs() {}

    private RegistryTaskRegistryCredentialSourceArgs(RegistryTaskRegistryCredentialSourceArgs $) {
        this.loginMode = $.loginMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryTaskRegistryCredentialSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryTaskRegistryCredentialSourceArgs $;

        public Builder() {
            $ = new RegistryTaskRegistryCredentialSourceArgs();
        }

        public Builder(RegistryTaskRegistryCredentialSourceArgs defaults) {
            $ = new RegistryTaskRegistryCredentialSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loginMode The login mode for the source registry. Possible values are `None` and `Default`.
         * 
         * @return builder
         * 
         */
        public Builder loginMode(Output<String> loginMode) {
            $.loginMode = loginMode;
            return this;
        }

        /**
         * @param loginMode The login mode for the source registry. Possible values are `None` and `Default`.
         * 
         * @return builder
         * 
         */
        public Builder loginMode(String loginMode) {
            return loginMode(Output.of(loginMode));
        }

        public RegistryTaskRegistryCredentialSourceArgs build() {
            if ($.loginMode == null) {
                throw new MissingRequiredPropertyException("RegistryTaskRegistryCredentialSourceArgs", "loginMode");
            }
            return $;
        }
    }

}
