// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.inputs;

import com.pulumi.azure.sql.inputs.FailoverGroupPartnerServerArgs;
import com.pulumi.azure.sql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs;
import com.pulumi.azure.sql.inputs.FailoverGroupReadonlyEndpointFailoverPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FailoverGroupState extends com.pulumi.resources.ResourceArgs {

    public static final FailoverGroupState Empty = new FailoverGroupState();

    /**
     * A list of database ids to add to the failover group
     * 
     */
    @Import(name="databases")
    private @Nullable Output<List<String>> databases;

    /**
     * @return A list of database ids to add to the failover group
     * 
     */
    public Optional<Output<List<String>>> databases() {
        return Optional.ofNullable(this.databases);
    }

    /**
     * the location of the failover group.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return the location of the failover group.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the failover group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the failover group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of secondary servers as documented below
     * 
     */
    @Import(name="partnerServers")
    private @Nullable Output<List<FailoverGroupPartnerServerArgs>> partnerServers;

    /**
     * @return A list of secondary servers as documented below
     * 
     */
    public Optional<Output<List<FailoverGroupPartnerServerArgs>>> partnerServers() {
        return Optional.ofNullable(this.partnerServers);
    }

    /**
     * A read/write policy as documented below
     * 
     */
    @Import(name="readWriteEndpointFailoverPolicy")
    private @Nullable Output<FailoverGroupReadWriteEndpointFailoverPolicyArgs> readWriteEndpointFailoverPolicy;

    /**
     * @return A read/write policy as documented below
     * 
     */
    public Optional<Output<FailoverGroupReadWriteEndpointFailoverPolicyArgs>> readWriteEndpointFailoverPolicy() {
        return Optional.ofNullable(this.readWriteEndpointFailoverPolicy);
    }

    /**
     * a read-only policy as documented below
     * 
     */
    @Import(name="readonlyEndpointFailoverPolicy")
    private @Nullable Output<FailoverGroupReadonlyEndpointFailoverPolicyArgs> readonlyEndpointFailoverPolicy;

    /**
     * @return a read-only policy as documented below
     * 
     */
    public Optional<Output<FailoverGroupReadonlyEndpointFailoverPolicyArgs>> readonlyEndpointFailoverPolicy() {
        return Optional.ofNullable(this.readonlyEndpointFailoverPolicy);
    }

    /**
     * The name of the resource group containing the SQL server
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the SQL server
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * local replication role of the failover group instance.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return local replication role of the failover group instance.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The name of the primary SQL server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return The name of the primary SQL server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FailoverGroupState() {}

    private FailoverGroupState(FailoverGroupState $) {
        this.databases = $.databases;
        this.location = $.location;
        this.name = $.name;
        this.partnerServers = $.partnerServers;
        this.readWriteEndpointFailoverPolicy = $.readWriteEndpointFailoverPolicy;
        this.readonlyEndpointFailoverPolicy = $.readonlyEndpointFailoverPolicy;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
        this.serverName = $.serverName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupState $;

        public Builder() {
            $ = new FailoverGroupState();
        }

        public Builder(FailoverGroupState defaults) {
            $ = new FailoverGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param databases A list of database ids to add to the failover group
         * 
         * @return builder
         * 
         */
        public Builder databases(@Nullable Output<List<String>> databases) {
            $.databases = databases;
            return this;
        }

        /**
         * @param databases A list of database ids to add to the failover group
         * 
         * @return builder
         * 
         */
        public Builder databases(List<String> databases) {
            return databases(Output.of(databases));
        }

        /**
         * @param databases A list of database ids to add to the failover group
         * 
         * @return builder
         * 
         */
        public Builder databases(String... databases) {
            return databases(List.of(databases));
        }

        /**
         * @param location the location of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location the location of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the failover group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the failover group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partnerServers A list of secondary servers as documented below
         * 
         * @return builder
         * 
         */
        public Builder partnerServers(@Nullable Output<List<FailoverGroupPartnerServerArgs>> partnerServers) {
            $.partnerServers = partnerServers;
            return this;
        }

        /**
         * @param partnerServers A list of secondary servers as documented below
         * 
         * @return builder
         * 
         */
        public Builder partnerServers(List<FailoverGroupPartnerServerArgs> partnerServers) {
            return partnerServers(Output.of(partnerServers));
        }

        /**
         * @param partnerServers A list of secondary servers as documented below
         * 
         * @return builder
         * 
         */
        public Builder partnerServers(FailoverGroupPartnerServerArgs... partnerServers) {
            return partnerServers(List.of(partnerServers));
        }

        /**
         * @param readWriteEndpointFailoverPolicy A read/write policy as documented below
         * 
         * @return builder
         * 
         */
        public Builder readWriteEndpointFailoverPolicy(@Nullable Output<FailoverGroupReadWriteEndpointFailoverPolicyArgs> readWriteEndpointFailoverPolicy) {
            $.readWriteEndpointFailoverPolicy = readWriteEndpointFailoverPolicy;
            return this;
        }

        /**
         * @param readWriteEndpointFailoverPolicy A read/write policy as documented below
         * 
         * @return builder
         * 
         */
        public Builder readWriteEndpointFailoverPolicy(FailoverGroupReadWriteEndpointFailoverPolicyArgs readWriteEndpointFailoverPolicy) {
            return readWriteEndpointFailoverPolicy(Output.of(readWriteEndpointFailoverPolicy));
        }

        /**
         * @param readonlyEndpointFailoverPolicy a read-only policy as documented below
         * 
         * @return builder
         * 
         */
        public Builder readonlyEndpointFailoverPolicy(@Nullable Output<FailoverGroupReadonlyEndpointFailoverPolicyArgs> readonlyEndpointFailoverPolicy) {
            $.readonlyEndpointFailoverPolicy = readonlyEndpointFailoverPolicy;
            return this;
        }

        /**
         * @param readonlyEndpointFailoverPolicy a read-only policy as documented below
         * 
         * @return builder
         * 
         */
        public Builder readonlyEndpointFailoverPolicy(FailoverGroupReadonlyEndpointFailoverPolicyArgs readonlyEndpointFailoverPolicy) {
            return readonlyEndpointFailoverPolicy(Output.of(readonlyEndpointFailoverPolicy));
        }

        /**
         * @param resourceGroupName The name of the resource group containing the SQL server
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the SQL server
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param role local replication role of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role local replication role of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param serverName The name of the primary SQL server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the primary SQL server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FailoverGroupState build() {
            return $;
        }
    }

}