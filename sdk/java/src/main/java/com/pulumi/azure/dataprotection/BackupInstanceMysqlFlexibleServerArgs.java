// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupInstanceMysqlFlexibleServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupInstanceMysqlFlexibleServerArgs Empty = new BackupInstanceMysqlFlexibleServerArgs();

    /**
     * The ID of the Backup Policy.
     * 
     */
    @Import(name="backupPolicyId", required=true)
    private Output<String> backupPolicyId;

    /**
     * @return The ID of the Backup Policy.
     * 
     */
    public Output<String> backupPolicyId() {
        return this.backupPolicyId;
    }

    /**
     * The location of the source database. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the source database. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the source server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<String> serverId;

    /**
     * @return The ID of the source server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    /**
     * The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vaultId", required=true)
    private Output<String> vaultId;

    /**
     * @return The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    private BackupInstanceMysqlFlexibleServerArgs() {}

    private BackupInstanceMysqlFlexibleServerArgs(BackupInstanceMysqlFlexibleServerArgs $) {
        this.backupPolicyId = $.backupPolicyId;
        this.location = $.location;
        this.name = $.name;
        this.serverId = $.serverId;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupInstanceMysqlFlexibleServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupInstanceMysqlFlexibleServerArgs $;

        public Builder() {
            $ = new BackupInstanceMysqlFlexibleServerArgs();
        }

        public Builder(BackupInstanceMysqlFlexibleServerArgs defaults) {
            $ = new BackupInstanceMysqlFlexibleServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupPolicyId The ID of the Backup Policy.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyId(Output<String> backupPolicyId) {
            $.backupPolicyId = backupPolicyId;
            return this;
        }

        /**
         * @param backupPolicyId The ID of the Backup Policy.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyId(String backupPolicyId) {
            return backupPolicyId(Output.of(backupPolicyId));
        }

        /**
         * @param location The location of the source database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the source database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serverId The ID of the source server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The ID of the source server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public BackupInstanceMysqlFlexibleServerArgs build() {
            if ($.backupPolicyId == null) {
                throw new MissingRequiredPropertyException("BackupInstanceMysqlFlexibleServerArgs", "backupPolicyId");
            }
            if ($.serverId == null) {
                throw new MissingRequiredPropertyException("BackupInstanceMysqlFlexibleServerArgs", "serverId");
            }
            if ($.vaultId == null) {
                throw new MissingRequiredPropertyException("BackupInstanceMysqlFlexibleServerArgs", "vaultId");
            }
            return $;
        }
    }

}
