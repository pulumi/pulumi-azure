// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab;

import com.pulumi.azure.lab.inputs.LabAutoShutdownArgs;
import com.pulumi.azure.lab.inputs.LabConnectionSettingArgs;
import com.pulumi.azure.lab.inputs.LabNetworkArgs;
import com.pulumi.azure.lab.inputs.LabRosterArgs;
import com.pulumi.azure.lab.inputs.LabSecurityArgs;
import com.pulumi.azure.lab.inputs.LabVirtualMachineArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabArgs Empty = new LabArgs();

    /**
     * An `auto_shutdown` block as defined below.
     * 
     */
    @Import(name="autoShutdown")
    private @Nullable Output<LabAutoShutdownArgs> autoShutdown;

    /**
     * @return An `auto_shutdown` block as defined below.
     * 
     */
    public Optional<Output<LabAutoShutdownArgs>> autoShutdown() {
        return Optional.ofNullable(this.autoShutdown);
    }

    /**
     * A `connection_setting` block as defined below.
     * 
     */
    @Import(name="connectionSetting")
    private @Nullable Output<LabConnectionSettingArgs> connectionSetting;

    /**
     * @return A `connection_setting` block as defined below.
     * 
     */
    public Optional<Output<LabConnectionSettingArgs>> connectionSetting() {
        return Optional.ofNullable(this.connectionSetting);
    }

    /**
     * The description of the Lab Service Lab.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Lab Service Lab.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     * 
     */
    @Import(name="labPlanId")
    private @Nullable Output<String> labPlanId;

    /**
     * @return The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
     * 
     */
    public Optional<Output<String>> labPlanId() {
        return Optional.ofNullable(this.labPlanId);
    }

    /**
     * The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network` block as defined below.
     * 
     */
    @Import(name="network")
    private @Nullable Output<LabNetworkArgs> network;

    /**
     * @return A `network` block as defined below.
     * 
     */
    public Optional<Output<LabNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `roster` block as defined below.
     * 
     */
    @Import(name="roster")
    private @Nullable Output<LabRosterArgs> roster;

    /**
     * @return A `roster` block as defined below.
     * 
     */
    public Optional<Output<LabRosterArgs>> roster() {
        return Optional.ofNullable(this.roster);
    }

    /**
     * A `security` block as defined below.
     * 
     */
    @Import(name="security", required=true)
    private Output<LabSecurityArgs> security;

    /**
     * @return A `security` block as defined below.
     * 
     */
    public Output<LabSecurityArgs> security() {
        return this.security;
    }

    /**
     * A mapping of tags which should be assigned to the Lab Service Lab.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Lab Service Lab.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The title of the Lab Service Lab.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return The title of the Lab Service Lab.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     * A `virtual_machine` block as defined below.
     * 
     */
    @Import(name="virtualMachine", required=true)
    private Output<LabVirtualMachineArgs> virtualMachine;

    /**
     * @return A `virtual_machine` block as defined below.
     * 
     */
    public Output<LabVirtualMachineArgs> virtualMachine() {
        return this.virtualMachine;
    }

    private LabArgs() {}

    private LabArgs(LabArgs $) {
        this.autoShutdown = $.autoShutdown;
        this.connectionSetting = $.connectionSetting;
        this.description = $.description;
        this.labPlanId = $.labPlanId;
        this.location = $.location;
        this.name = $.name;
        this.network = $.network;
        this.resourceGroupName = $.resourceGroupName;
        this.roster = $.roster;
        this.security = $.security;
        this.tags = $.tags;
        this.title = $.title;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabArgs $;

        public Builder() {
            $ = new LabArgs();
        }

        public Builder(LabArgs defaults) {
            $ = new LabArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoShutdown An `auto_shutdown` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder autoShutdown(@Nullable Output<LabAutoShutdownArgs> autoShutdown) {
            $.autoShutdown = autoShutdown;
            return this;
        }

        /**
         * @param autoShutdown An `auto_shutdown` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder autoShutdown(LabAutoShutdownArgs autoShutdown) {
            return autoShutdown(Output.of(autoShutdown));
        }

        /**
         * @param connectionSetting A `connection_setting` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionSetting(@Nullable Output<LabConnectionSettingArgs> connectionSetting) {
            $.connectionSetting = connectionSetting;
            return this;
        }

        /**
         * @param connectionSetting A `connection_setting` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionSetting(LabConnectionSettingArgs connectionSetting) {
            return connectionSetting(Output.of(connectionSetting));
        }

        /**
         * @param description The description of the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labPlanId The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder labPlanId(@Nullable Output<String> labPlanId) {
            $.labPlanId = labPlanId;
            return this;
        }

        /**
         * @param labPlanId The resource ID of the Lab Plan that is used during resource creation to provide defaults and acts as a permission container when creating a Lab Service Lab via `labs.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder labPlanId(String labPlanId) {
            return labPlanId(Output.of(labPlanId));
        }

        /**
         * @param location The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Lab Service Lab should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Lab Service Lab. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network A `network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<LabNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network A `network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder network(LabNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Lab Service Lab should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roster A `roster` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roster(@Nullable Output<LabRosterArgs> roster) {
            $.roster = roster;
            return this;
        }

        /**
         * @param roster A `roster` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roster(LabRosterArgs roster) {
            return roster(Output.of(roster));
        }

        /**
         * @param security A `security` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder security(Output<LabSecurityArgs> security) {
            $.security = security;
            return this;
        }

        /**
         * @param security A `security` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder security(LabSecurityArgs security) {
            return security(Output.of(security));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param title The title of the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param virtualMachine A `virtual_machine` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(Output<LabVirtualMachineArgs> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        /**
         * @param virtualMachine A `virtual_machine` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(LabVirtualMachineArgs virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public LabArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.security = Objects.requireNonNull($.security, "expected parameter 'security' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            $.virtualMachine = Objects.requireNonNull($.virtualMachine, "expected parameter 'virtualMachine' to be non-null");
            return $;
        }
    }

}