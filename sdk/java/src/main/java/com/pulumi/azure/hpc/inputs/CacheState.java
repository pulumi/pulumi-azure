// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.inputs;

import com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs;
import com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs;
import com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs;
import com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs;
import com.pulumi.azure.hpc.inputs.CacheDnsArgs;
import com.pulumi.azure.hpc.inputs.CacheIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheState extends com.pulumi.resources.ResourceArgs {

    public static final CacheState Empty = new CacheState();

    /**
     * Specifies whether the HPC Cache automatically rotates Encryption Key to the latest version. Defaults to `false`.
     * 
     */
    @Import(name="automaticallyRotateKeyToLatestEnabled")
    private @Nullable Output<Boolean> automaticallyRotateKeyToLatestEnabled;

    /**
     * @return Specifies whether the HPC Cache automatically rotates Encryption Key to the latest version. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> automaticallyRotateKeyToLatestEnabled() {
        return Optional.ofNullable(this.automaticallyRotateKeyToLatestEnabled);
    }

    /**
     * The size of the HPC Cache, in GB. Possible values are `3072`, `6144`, `12288`, `21623`, `24576`, `43246`, `49152` and `86491`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="cacheSizeInGb")
    private @Nullable Output<Integer> cacheSizeInGb;

    /**
     * @return The size of the HPC Cache, in GB. Possible values are `3072`, `6144`, `12288`, `21623`, `24576`, `43246`, `49152` and `86491`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> cacheSizeInGb() {
        return Optional.ofNullable(this.cacheSizeInGb);
    }

    /**
     * A `default_access_policy` block as defined below.
     * 
     */
    @Import(name="defaultAccessPolicy")
    private @Nullable Output<CacheDefaultAccessPolicyArgs> defaultAccessPolicy;

    /**
     * @return A `default_access_policy` block as defined below.
     * 
     */
    public Optional<Output<CacheDefaultAccessPolicyArgs>> defaultAccessPolicy() {
        return Optional.ofNullable(this.defaultAccessPolicy);
    }

    /**
     * A `directory_active_directory` block as defined below.
     * 
     */
    @Import(name="directoryActiveDirectory")
    private @Nullable Output<CacheDirectoryActiveDirectoryArgs> directoryActiveDirectory;

    /**
     * @return A `directory_active_directory` block as defined below.
     * 
     */
    public Optional<Output<CacheDirectoryActiveDirectoryArgs>> directoryActiveDirectory() {
        return Optional.ofNullable(this.directoryActiveDirectory);
    }

    /**
     * A `directory_flat_file` block as defined below.
     * 
     */
    @Import(name="directoryFlatFile")
    private @Nullable Output<CacheDirectoryFlatFileArgs> directoryFlatFile;

    /**
     * @return A `directory_flat_file` block as defined below.
     * 
     */
    public Optional<Output<CacheDirectoryFlatFileArgs>> directoryFlatFile() {
        return Optional.ofNullable(this.directoryFlatFile);
    }

    /**
     * A `directory_ldap` block as defined below.
     * 
     */
    @Import(name="directoryLdap")
    private @Nullable Output<CacheDirectoryLdapArgs> directoryLdap;

    /**
     * @return A `directory_ldap` block as defined below.
     * 
     */
    public Optional<Output<CacheDirectoryLdapArgs>> directoryLdap() {
        return Optional.ofNullable(this.directoryLdap);
    }

    /**
     * A `dns` block as defined below.
     * 
     */
    @Import(name="dns")
    private @Nullable Output<CacheDnsArgs> dns;

    /**
     * @return A `dns` block as defined below.
     * 
     */
    public Optional<Output<CacheDnsArgs>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<CacheIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<CacheIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The ID of the Key Vault Key which should be used to encrypt the data in this HPC Cache.
     * 
     */
    @Import(name="keyVaultKeyId")
    private @Nullable Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key which should be used to encrypt the data in this HPC Cache.
     * 
     */
    public Optional<Output<String>> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }

    /**
     * Specifies the supported Azure Region where the HPC Cache should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure Region where the HPC Cache should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A list of IP Addresses where the HPC Cache can be mounted.
     * 
     */
    @Import(name="mountAddresses")
    private @Nullable Output<List<String>> mountAddresses;

    /**
     * @return A list of IP Addresses where the HPC Cache can be mounted.
     * 
     */
    public Optional<Output<List<String>>> mountAddresses() {
        return Optional.ofNullable(this.mountAddresses);
    }

    /**
     * The IPv4 maximum transmission unit configured for the subnet of the HPC Cache. Possible values range from 576 - 1500. Defaults to 1500.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return The IPv4 maximum transmission unit configured for the subnet of the HPC Cache. Possible values range from 576 - 1500. Defaults to 1500.
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * The name of the HPC Cache. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the HPC Cache. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The NTP server IP Address or FQDN for the HPC Cache. Defaults to `time.windows.com`.
     * 
     */
    @Import(name="ntpServer")
    private @Nullable Output<String> ntpServer;

    /**
     * @return The NTP server IP Address or FQDN for the HPC Cache. Defaults to `time.windows.com`.
     * 
     */
    public Optional<Output<String>> ntpServer() {
        return Optional.ofNullable(this.ntpServer);
    }

    /**
     * The name of the Resource Group in which to create the HPC Cache. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which to create the HPC Cache. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The SKU of HPC Cache to use. Possible values are (ReadWrite) - `Standard_2G`, `Standard_4G` `Standard_8G` or (ReadOnly) - `Standard_L4_5G`, `Standard_L9G`, and `Standard_L16G`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The SKU of HPC Cache to use. Possible values are (ReadWrite) - `Standard_2G`, `Standard_4G` `Standard_8G` or (ReadOnly) - `Standard_L4_5G`, `Standard_L9G`, and `Standard_L16G`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The ID of the Subnet for the HPC Cache. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet for the HPC Cache. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags to assign to the HPC Cache.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the HPC Cache.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CacheState() {}

    private CacheState(CacheState $) {
        this.automaticallyRotateKeyToLatestEnabled = $.automaticallyRotateKeyToLatestEnabled;
        this.cacheSizeInGb = $.cacheSizeInGb;
        this.defaultAccessPolicy = $.defaultAccessPolicy;
        this.directoryActiveDirectory = $.directoryActiveDirectory;
        this.directoryFlatFile = $.directoryFlatFile;
        this.directoryLdap = $.directoryLdap;
        this.dns = $.dns;
        this.identity = $.identity;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.location = $.location;
        this.mountAddresses = $.mountAddresses;
        this.mtu = $.mtu;
        this.name = $.name;
        this.ntpServer = $.ntpServer;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheState $;

        public Builder() {
            $ = new CacheState();
        }

        public Builder(CacheState defaults) {
            $ = new CacheState(Objects.requireNonNull(defaults));
        }

        /**
         * @param automaticallyRotateKeyToLatestEnabled Specifies whether the HPC Cache automatically rotates Encryption Key to the latest version. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticallyRotateKeyToLatestEnabled(@Nullable Output<Boolean> automaticallyRotateKeyToLatestEnabled) {
            $.automaticallyRotateKeyToLatestEnabled = automaticallyRotateKeyToLatestEnabled;
            return this;
        }

        /**
         * @param automaticallyRotateKeyToLatestEnabled Specifies whether the HPC Cache automatically rotates Encryption Key to the latest version. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticallyRotateKeyToLatestEnabled(Boolean automaticallyRotateKeyToLatestEnabled) {
            return automaticallyRotateKeyToLatestEnabled(Output.of(automaticallyRotateKeyToLatestEnabled));
        }

        /**
         * @param cacheSizeInGb The size of the HPC Cache, in GB. Possible values are `3072`, `6144`, `12288`, `21623`, `24576`, `43246`, `49152` and `86491`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cacheSizeInGb(@Nullable Output<Integer> cacheSizeInGb) {
            $.cacheSizeInGb = cacheSizeInGb;
            return this;
        }

        /**
         * @param cacheSizeInGb The size of the HPC Cache, in GB. Possible values are `3072`, `6144`, `12288`, `21623`, `24576`, `43246`, `49152` and `86491`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cacheSizeInGb(Integer cacheSizeInGb) {
            return cacheSizeInGb(Output.of(cacheSizeInGb));
        }

        /**
         * @param defaultAccessPolicy A `default_access_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder defaultAccessPolicy(@Nullable Output<CacheDefaultAccessPolicyArgs> defaultAccessPolicy) {
            $.defaultAccessPolicy = defaultAccessPolicy;
            return this;
        }

        /**
         * @param defaultAccessPolicy A `default_access_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder defaultAccessPolicy(CacheDefaultAccessPolicyArgs defaultAccessPolicy) {
            return defaultAccessPolicy(Output.of(defaultAccessPolicy));
        }

        /**
         * @param directoryActiveDirectory A `directory_active_directory` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder directoryActiveDirectory(@Nullable Output<CacheDirectoryActiveDirectoryArgs> directoryActiveDirectory) {
            $.directoryActiveDirectory = directoryActiveDirectory;
            return this;
        }

        /**
         * @param directoryActiveDirectory A `directory_active_directory` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder directoryActiveDirectory(CacheDirectoryActiveDirectoryArgs directoryActiveDirectory) {
            return directoryActiveDirectory(Output.of(directoryActiveDirectory));
        }

        /**
         * @param directoryFlatFile A `directory_flat_file` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder directoryFlatFile(@Nullable Output<CacheDirectoryFlatFileArgs> directoryFlatFile) {
            $.directoryFlatFile = directoryFlatFile;
            return this;
        }

        /**
         * @param directoryFlatFile A `directory_flat_file` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder directoryFlatFile(CacheDirectoryFlatFileArgs directoryFlatFile) {
            return directoryFlatFile(Output.of(directoryFlatFile));
        }

        /**
         * @param directoryLdap A `directory_ldap` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder directoryLdap(@Nullable Output<CacheDirectoryLdapArgs> directoryLdap) {
            $.directoryLdap = directoryLdap;
            return this;
        }

        /**
         * @param directoryLdap A `directory_ldap` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder directoryLdap(CacheDirectoryLdapArgs directoryLdap) {
            return directoryLdap(Output.of(directoryLdap));
        }

        /**
         * @param dns A `dns` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable Output<CacheDnsArgs> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns A `dns` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dns(CacheDnsArgs dns) {
            return dns(Output.of(dns));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<CacheIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(CacheIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to encrypt the data in this HPC Cache.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(@Nullable Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to encrypt the data in this HPC Cache.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param location Specifies the supported Azure Region where the HPC Cache should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure Region where the HPC Cache should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mountAddresses A list of IP Addresses where the HPC Cache can be mounted.
         * 
         * @return builder
         * 
         */
        public Builder mountAddresses(@Nullable Output<List<String>> mountAddresses) {
            $.mountAddresses = mountAddresses;
            return this;
        }

        /**
         * @param mountAddresses A list of IP Addresses where the HPC Cache can be mounted.
         * 
         * @return builder
         * 
         */
        public Builder mountAddresses(List<String> mountAddresses) {
            return mountAddresses(Output.of(mountAddresses));
        }

        /**
         * @param mountAddresses A list of IP Addresses where the HPC Cache can be mounted.
         * 
         * @return builder
         * 
         */
        public Builder mountAddresses(String... mountAddresses) {
            return mountAddresses(List.of(mountAddresses));
        }

        /**
         * @param mtu The IPv4 maximum transmission unit configured for the subnet of the HPC Cache. Possible values range from 576 - 1500. Defaults to 1500.
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu The IPv4 maximum transmission unit configured for the subnet of the HPC Cache. Possible values range from 576 - 1500. Defaults to 1500.
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param name The name of the HPC Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the HPC Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ntpServer The NTP server IP Address or FQDN for the HPC Cache. Defaults to `time.windows.com`.
         * 
         * @return builder
         * 
         */
        public Builder ntpServer(@Nullable Output<String> ntpServer) {
            $.ntpServer = ntpServer;
            return this;
        }

        /**
         * @param ntpServer The NTP server IP Address or FQDN for the HPC Cache. Defaults to `time.windows.com`.
         * 
         * @return builder
         * 
         */
        public Builder ntpServer(String ntpServer) {
            return ntpServer(Output.of(ntpServer));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which to create the HPC Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which to create the HPC Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The SKU of HPC Cache to use. Possible values are (ReadWrite) - `Standard_2G`, `Standard_4G` `Standard_8G` or (ReadOnly) - `Standard_L4_5G`, `Standard_L9G`, and `Standard_L16G`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU of HPC Cache to use. Possible values are (ReadWrite) - `Standard_2G`, `Standard_4G` `Standard_8G` or (ReadOnly) - `Standard_L4_5G`, `Standard_L9G`, and `Standard_L16G`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param subnetId The ID of the Subnet for the HPC Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet for the HPC Cache. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags to assign to the HPC Cache.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the HPC Cache.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CacheState build() {
            return $;
        }
    }

}