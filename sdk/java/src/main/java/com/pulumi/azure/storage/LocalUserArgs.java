// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.storage.inputs.LocalUserPermissionScopeArgs;
import com.pulumi.azure.storage.inputs.LocalUserSshAuthorizedKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalUserArgs Empty = new LocalUserArgs();

    /**
     * The home directory of the Storage Account Local User.
     * 
     */
    @Import(name="homeDirectory")
    private @Nullable Output<String> homeDirectory;

    /**
     * @return The home directory of the Storage Account Local User.
     * 
     */
    public Optional<Output<String>> homeDirectory() {
        return Optional.ofNullable(this.homeDirectory);
    }

    /**
     * The name which should be used for this Storage Account Local User. Changing this forces a new Storage Account Local User to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Storage Account Local User. Changing this forces a new Storage Account Local User to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `permission_scope` blocks as defined below.
     * 
     */
    @Import(name="permissionScopes")
    private @Nullable Output<List<LocalUserPermissionScopeArgs>> permissionScopes;

    /**
     * @return One or more `permission_scope` blocks as defined below.
     * 
     */
    public Optional<Output<List<LocalUserPermissionScopeArgs>>> permissionScopes() {
        return Optional.ofNullable(this.permissionScopes);
    }

    /**
     * One or more `ssh_authorized_key` blocks as defined below. Changing this forces a new Storage Account Local User to be created.
     * 
     */
    @Import(name="sshAuthorizedKeys")
    private @Nullable Output<List<LocalUserSshAuthorizedKeyArgs>> sshAuthorizedKeys;

    /**
     * @return One or more `ssh_authorized_key` blocks as defined below. Changing this forces a new Storage Account Local User to be created.
     * 
     */
    public Optional<Output<List<LocalUserSshAuthorizedKeyArgs>>> sshAuthorizedKeys() {
        return Optional.ofNullable(this.sshAuthorizedKeys);
    }

    /**
     * Specifies whether SSH Key Authentication is enabled. Defaults to `false`.
     * 
     */
    @Import(name="sshKeyEnabled")
    private @Nullable Output<Boolean> sshKeyEnabled;

    /**
     * @return Specifies whether SSH Key Authentication is enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> sshKeyEnabled() {
        return Optional.ofNullable(this.sshKeyEnabled);
    }

    /**
     * Specifies whether SSH Password Authentication is enabled. Defaults to `false`.
     * 
     */
    @Import(name="sshPasswordEnabled")
    private @Nullable Output<Boolean> sshPasswordEnabled;

    /**
     * @return Specifies whether SSH Password Authentication is enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> sshPasswordEnabled() {
        return Optional.ofNullable(this.sshPasswordEnabled);
    }

    /**
     * The ID of the Storage Account that this Storage Account Local User resides in. Changing this forces a new Storage Account Local User to be created.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account that this Storage Account Local User resides in. Changing this forces a new Storage Account Local User to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private LocalUserArgs() {}

    private LocalUserArgs(LocalUserArgs $) {
        this.homeDirectory = $.homeDirectory;
        this.name = $.name;
        this.permissionScopes = $.permissionScopes;
        this.sshAuthorizedKeys = $.sshAuthorizedKeys;
        this.sshKeyEnabled = $.sshKeyEnabled;
        this.sshPasswordEnabled = $.sshPasswordEnabled;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalUserArgs $;

        public Builder() {
            $ = new LocalUserArgs();
        }

        public Builder(LocalUserArgs defaults) {
            $ = new LocalUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param homeDirectory The home directory of the Storage Account Local User.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectory(@Nullable Output<String> homeDirectory) {
            $.homeDirectory = homeDirectory;
            return this;
        }

        /**
         * @param homeDirectory The home directory of the Storage Account Local User.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectory(String homeDirectory) {
            return homeDirectory(Output.of(homeDirectory));
        }

        /**
         * @param name The name which should be used for this Storage Account Local User. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Storage Account Local User. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param permissionScopes One or more `permission_scope` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissionScopes(@Nullable Output<List<LocalUserPermissionScopeArgs>> permissionScopes) {
            $.permissionScopes = permissionScopes;
            return this;
        }

        /**
         * @param permissionScopes One or more `permission_scope` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissionScopes(List<LocalUserPermissionScopeArgs> permissionScopes) {
            return permissionScopes(Output.of(permissionScopes));
        }

        /**
         * @param permissionScopes One or more `permission_scope` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissionScopes(LocalUserPermissionScopeArgs... permissionScopes) {
            return permissionScopes(List.of(permissionScopes));
        }

        /**
         * @param sshAuthorizedKeys One or more `ssh_authorized_key` blocks as defined below. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshAuthorizedKeys(@Nullable Output<List<LocalUserSshAuthorizedKeyArgs>> sshAuthorizedKeys) {
            $.sshAuthorizedKeys = sshAuthorizedKeys;
            return this;
        }

        /**
         * @param sshAuthorizedKeys One or more `ssh_authorized_key` blocks as defined below. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshAuthorizedKeys(List<LocalUserSshAuthorizedKeyArgs> sshAuthorizedKeys) {
            return sshAuthorizedKeys(Output.of(sshAuthorizedKeys));
        }

        /**
         * @param sshAuthorizedKeys One or more `ssh_authorized_key` blocks as defined below. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshAuthorizedKeys(LocalUserSshAuthorizedKeyArgs... sshAuthorizedKeys) {
            return sshAuthorizedKeys(List.of(sshAuthorizedKeys));
        }

        /**
         * @param sshKeyEnabled Specifies whether SSH Key Authentication is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyEnabled(@Nullable Output<Boolean> sshKeyEnabled) {
            $.sshKeyEnabled = sshKeyEnabled;
            return this;
        }

        /**
         * @param sshKeyEnabled Specifies whether SSH Key Authentication is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyEnabled(Boolean sshKeyEnabled) {
            return sshKeyEnabled(Output.of(sshKeyEnabled));
        }

        /**
         * @param sshPasswordEnabled Specifies whether SSH Password Authentication is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder sshPasswordEnabled(@Nullable Output<Boolean> sshPasswordEnabled) {
            $.sshPasswordEnabled = sshPasswordEnabled;
            return this;
        }

        /**
         * @param sshPasswordEnabled Specifies whether SSH Password Authentication is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder sshPasswordEnabled(Boolean sshPasswordEnabled) {
            return sshPasswordEnabled(Output.of(sshPasswordEnabled));
        }

        /**
         * @param storageAccountId The ID of the Storage Account that this Storage Account Local User resides in. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account that this Storage Account Local User resides in. Changing this forces a new Storage Account Local User to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public LocalUserArgs build() {
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}