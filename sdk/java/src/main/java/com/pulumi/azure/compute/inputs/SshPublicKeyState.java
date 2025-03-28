// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshPublicKeyState extends com.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyState Empty = new SshPublicKeyState();

    /**
     * The Azure Region where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this SSH Public Key. Changing this forces a new SSH Public Key to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this SSH Public Key. Changing this forces a new SSH Public Key to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SSH public key used to authenticate to a virtual machine through ssh. the provided public key needs to be at least 2048-bit and in ssh-rsa format.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return SSH public key used to authenticate to a virtual machine through ssh. the provided public key needs to be at least 2048-bit and in ssh-rsa format.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The name of the Resource Group where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the SSH Public Key.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the SSH Public Key.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SshPublicKeyState() {}

    private SshPublicKeyState(SshPublicKeyState $) {
        this.location = $.location;
        this.name = $.name;
        this.publicKey = $.publicKey;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshPublicKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshPublicKeyState $;

        public Builder() {
            $ = new SshPublicKeyState();
        }

        public Builder(SshPublicKeyState defaults) {
            $ = new SshPublicKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this SSH Public Key. Changing this forces a new SSH Public Key to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this SSH Public Key. Changing this forces a new SSH Public Key to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicKey SSH public key used to authenticate to a virtual machine through ssh. the provided public key needs to be at least 2048-bit and in ssh-rsa format.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey SSH public key used to authenticate to a virtual machine through ssh. the provided public key needs to be at least 2048-bit and in ssh-rsa format.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the SSH Public Key should exist. Changing this forces a new SSH Public Key to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the SSH Public Key.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the SSH Public Key.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SshPublicKeyState build() {
            return $;
        }
    }

}
