// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionServicePrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionServicePrincipalArgs Empty = new ConnectionServicePrincipalArgs();

    /**
     * The (Client) ID of the Service Principal.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The (Client) ID of the Service Principal.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The thumbprint of the Service Principal Certificate.
     * 
     */
    @Import(name="certificateThumbprint", required=true)
    private Output<String> certificateThumbprint;

    /**
     * @return The thumbprint of the Service Principal Certificate.
     * 
     */
    public Output<String> certificateThumbprint() {
        return this.certificateThumbprint;
    }

    /**
     * A description for this Connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this Connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The subscription GUID.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return The subscription GUID.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The ID of the Tenant the Service Principal is assigned in.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The ID of the Tenant the Service Principal is assigned in.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private ConnectionServicePrincipalArgs() {}

    private ConnectionServicePrincipalArgs(ConnectionServicePrincipalArgs $) {
        this.applicationId = $.applicationId;
        this.automationAccountName = $.automationAccountName;
        this.certificateThumbprint = $.certificateThumbprint;
        this.description = $.description;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionServicePrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionServicePrincipalArgs $;

        public Builder() {
            $ = new ConnectionServicePrincipalArgs();
        }

        public Builder(ConnectionServicePrincipalArgs defaults) {
            $ = new ConnectionServicePrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The (Client) ID of the Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The (Client) ID of the Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param certificateThumbprint The thumbprint of the Service Principal Certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateThumbprint(Output<String> certificateThumbprint) {
            $.certificateThumbprint = certificateThumbprint;
            return this;
        }

        /**
         * @param certificateThumbprint The thumbprint of the Service Principal Certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateThumbprint(String certificateThumbprint) {
            return certificateThumbprint(Output.of(certificateThumbprint));
        }

        /**
         * @param description A description for this Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name of the Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subscriptionId The subscription GUID.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The subscription GUID.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tenantId The ID of the Tenant the Service Principal is assigned in.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The ID of the Tenant the Service Principal is assigned in.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ConnectionServicePrincipalArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.certificateThumbprint = Objects.requireNonNull($.certificateThumbprint, "expected parameter 'certificateThumbprint' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}