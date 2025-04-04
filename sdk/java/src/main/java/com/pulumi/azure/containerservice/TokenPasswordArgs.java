// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.containerservice.inputs.TokenPasswordPassword1Args;
import com.pulumi.azure.containerservice.inputs.TokenPasswordPassword2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TokenPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final TokenPasswordArgs Empty = new TokenPasswordArgs();

    /**
     * The ID of the Container Registry Token that this Container Registry Token Password resides in. Changing this forces a new Container Registry Token Password to be created.
     * 
     */
    @Import(name="containerRegistryTokenId", required=true)
    private Output<String> containerRegistryTokenId;

    /**
     * @return The ID of the Container Registry Token that this Container Registry Token Password resides in. Changing this forces a new Container Registry Token Password to be created.
     * 
     */
    public Output<String> containerRegistryTokenId() {
        return this.containerRegistryTokenId;
    }

    /**
     * One `password` block as defined below.
     * 
     */
    @Import(name="password1", required=true)
    private Output<TokenPasswordPassword1Args> password1;

    /**
     * @return One `password` block as defined below.
     * 
     */
    public Output<TokenPasswordPassword1Args> password1() {
        return this.password1;
    }

    /**
     * One `password` block as defined below.
     * 
     */
    @Import(name="password2")
    private @Nullable Output<TokenPasswordPassword2Args> password2;

    /**
     * @return One `password` block as defined below.
     * 
     */
    public Optional<Output<TokenPasswordPassword2Args>> password2() {
        return Optional.ofNullable(this.password2);
    }

    private TokenPasswordArgs() {}

    private TokenPasswordArgs(TokenPasswordArgs $) {
        this.containerRegistryTokenId = $.containerRegistryTokenId;
        this.password1 = $.password1;
        this.password2 = $.password2;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenPasswordArgs $;

        public Builder() {
            $ = new TokenPasswordArgs();
        }

        public Builder(TokenPasswordArgs defaults) {
            $ = new TokenPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerRegistryTokenId The ID of the Container Registry Token that this Container Registry Token Password resides in. Changing this forces a new Container Registry Token Password to be created.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistryTokenId(Output<String> containerRegistryTokenId) {
            $.containerRegistryTokenId = containerRegistryTokenId;
            return this;
        }

        /**
         * @param containerRegistryTokenId The ID of the Container Registry Token that this Container Registry Token Password resides in. Changing this forces a new Container Registry Token Password to be created.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistryTokenId(String containerRegistryTokenId) {
            return containerRegistryTokenId(Output.of(containerRegistryTokenId));
        }

        /**
         * @param password1 One `password` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder password1(Output<TokenPasswordPassword1Args> password1) {
            $.password1 = password1;
            return this;
        }

        /**
         * @param password1 One `password` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder password1(TokenPasswordPassword1Args password1) {
            return password1(Output.of(password1));
        }

        /**
         * @param password2 One `password` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder password2(@Nullable Output<TokenPasswordPassword2Args> password2) {
            $.password2 = password2;
            return this;
        }

        /**
         * @param password2 One `password` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder password2(TokenPasswordPassword2Args password2) {
            return password2(Output.of(password2));
        }

        public TokenPasswordArgs build() {
            if ($.containerRegistryTokenId == null) {
                throw new MissingRequiredPropertyException("TokenPasswordArgs", "containerRegistryTokenId");
            }
            if ($.password1 == null) {
                throw new MissingRequiredPropertyException("TokenPasswordArgs", "password1");
            }
            return $;
        }
    }

}
