// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointPrivateServiceConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointPrivateServiceConnectionArgs Empty = new EndpointPrivateServiceConnectionArgs();

    /**
     * Does the Private Endpoint require Manual Approval from the remote resource owner? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** If you are trying to connect the Private Endpoint to a remote resource without having the correct RBAC permissions on the remote resource set this value to `true`.
     * 
     */
    @Import(name="isManualConnection", required=true)
    private Output<Boolean> isManualConnection;

    /**
     * @return Does the Private Endpoint require Manual Approval from the remote resource owner? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** If you are trying to connect the Private Endpoint to a remote resource without having the correct RBAC permissions on the remote resource set this value to `true`.
     * 
     */
    public Output<Boolean> isManualConnection() {
        return this.isManualConnection;
    }

    /**
     * Specifies the Name of the Private Service Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the Name of the Private Service Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Service Alias of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="privateConnectionResourceAlias")
    private @Nullable Output<String> privateConnectionResourceAlias;

    /**
     * @return The Service Alias of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> privateConnectionResourceAlias() {
        return Optional.ofNullable(this.privateConnectionResourceAlias);
    }

    /**
     * The ID of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created. For a web app or function app slot, the parent web app should be used in this field instead of a reference to the slot itself.
     * 
     */
    @Import(name="privateConnectionResourceId")
    private @Nullable Output<String> privateConnectionResourceId;

    /**
     * @return The ID of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created. For a web app or function app slot, the parent web app should be used in this field instead of a reference to the slot itself.
     * 
     */
    public Optional<Output<String>> privateConnectionResourceId() {
        return Optional.ofNullable(this.privateConnectionResourceId);
    }

    /**
     * (Required) The static IP address set by this configuration. It is recommended to use the private IP address exported in the `private_service_connection` block to obtain the address associated with the private endpoint.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return (Required) The static IP address set by this configuration. It is recommended to use the private IP address exported in the `private_service_connection` block to obtain the address associated with the private endpoint.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * A message passed to the owner of the remote resource when the private endpoint attempts to establish the connection to the remote resource. The provider allows a maximum request message length of `140` characters, however the request message maximum length is dependent on the service the private endpoint is connected to. Only valid if `is_manual_connection` is set to `true`.
     * 
     * &gt; **Note:** When connected to an SQL resource the `request_message` maximum length is `128`.
     * 
     */
    @Import(name="requestMessage")
    private @Nullable Output<String> requestMessage;

    /**
     * @return A message passed to the owner of the remote resource when the private endpoint attempts to establish the connection to the remote resource. The provider allows a maximum request message length of `140` characters, however the request message maximum length is dependent on the service the private endpoint is connected to. Only valid if `is_manual_connection` is set to `true`.
     * 
     * &gt; **Note:** When connected to an SQL resource the `request_message` maximum length is `128`.
     * 
     */
    public Optional<Output<String>> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * A list of subresource names which the Private Endpoint is able to connect to. `subresource_names` corresponds to `group_id`. Possible values are detailed in the product [documentation](https://docs.microsoft.com/azure/private-link/private-endpoint-overview#private-link-resource) in the `Subresources` column. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Some resource types (such as Storage Account) only support 1 subresource per private endpoint.
     * 
     * &gt; **Note:** For most Private Links one or more `subresource_names` will need to be specified, please see the linked documentation for details.
     * 
     */
    @Import(name="subresourceNames")
    private @Nullable Output<List<String>> subresourceNames;

    /**
     * @return A list of subresource names which the Private Endpoint is able to connect to. `subresource_names` corresponds to `group_id`. Possible values are detailed in the product [documentation](https://docs.microsoft.com/azure/private-link/private-endpoint-overview#private-link-resource) in the `Subresources` column. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Some resource types (such as Storage Account) only support 1 subresource per private endpoint.
     * 
     * &gt; **Note:** For most Private Links one or more `subresource_names` will need to be specified, please see the linked documentation for details.
     * 
     */
    public Optional<Output<List<String>>> subresourceNames() {
        return Optional.ofNullable(this.subresourceNames);
    }

    private EndpointPrivateServiceConnectionArgs() {}

    private EndpointPrivateServiceConnectionArgs(EndpointPrivateServiceConnectionArgs $) {
        this.isManualConnection = $.isManualConnection;
        this.name = $.name;
        this.privateConnectionResourceAlias = $.privateConnectionResourceAlias;
        this.privateConnectionResourceId = $.privateConnectionResourceId;
        this.privateIpAddress = $.privateIpAddress;
        this.requestMessage = $.requestMessage;
        this.subresourceNames = $.subresourceNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointPrivateServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointPrivateServiceConnectionArgs $;

        public Builder() {
            $ = new EndpointPrivateServiceConnectionArgs();
        }

        public Builder(EndpointPrivateServiceConnectionArgs defaults) {
            $ = new EndpointPrivateServiceConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isManualConnection Does the Private Endpoint require Manual Approval from the remote resource owner? Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** If you are trying to connect the Private Endpoint to a remote resource without having the correct RBAC permissions on the remote resource set this value to `true`.
         * 
         * @return builder
         * 
         */
        public Builder isManualConnection(Output<Boolean> isManualConnection) {
            $.isManualConnection = isManualConnection;
            return this;
        }

        /**
         * @param isManualConnection Does the Private Endpoint require Manual Approval from the remote resource owner? Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** If you are trying to connect the Private Endpoint to a remote resource without having the correct RBAC permissions on the remote resource set this value to `true`.
         * 
         * @return builder
         * 
         */
        public Builder isManualConnection(Boolean isManualConnection) {
            return isManualConnection(Output.of(isManualConnection));
        }

        /**
         * @param name Specifies the Name of the Private Service Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the Name of the Private Service Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateConnectionResourceAlias The Service Alias of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectionResourceAlias(@Nullable Output<String> privateConnectionResourceAlias) {
            $.privateConnectionResourceAlias = privateConnectionResourceAlias;
            return this;
        }

        /**
         * @param privateConnectionResourceAlias The Service Alias of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectionResourceAlias(String privateConnectionResourceAlias) {
            return privateConnectionResourceAlias(Output.of(privateConnectionResourceAlias));
        }

        /**
         * @param privateConnectionResourceId The ID of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created. For a web app or function app slot, the parent web app should be used in this field instead of a reference to the slot itself.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectionResourceId(@Nullable Output<String> privateConnectionResourceId) {
            $.privateConnectionResourceId = privateConnectionResourceId;
            return this;
        }

        /**
         * @param privateConnectionResourceId The ID of the Private Link Enabled Remote Resource which this Private Endpoint should be connected to. One of `private_connection_resource_id` or `private_connection_resource_alias` must be specified. Changing this forces a new resource to be created. For a web app or function app slot, the parent web app should be used in this field instead of a reference to the slot itself.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectionResourceId(String privateConnectionResourceId) {
            return privateConnectionResourceId(Output.of(privateConnectionResourceId));
        }

        /**
         * @param privateIpAddress (Required) The static IP address set by this configuration. It is recommended to use the private IP address exported in the `private_service_connection` block to obtain the address associated with the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress (Required) The static IP address set by this configuration. It is recommended to use the private IP address exported in the `private_service_connection` block to obtain the address associated with the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param requestMessage A message passed to the owner of the remote resource when the private endpoint attempts to establish the connection to the remote resource. The provider allows a maximum request message length of `140` characters, however the request message maximum length is dependent on the service the private endpoint is connected to. Only valid if `is_manual_connection` is set to `true`.
         * 
         * &gt; **Note:** When connected to an SQL resource the `request_message` maximum length is `128`.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        /**
         * @param requestMessage A message passed to the owner of the remote resource when the private endpoint attempts to establish the connection to the remote resource. The provider allows a maximum request message length of `140` characters, however the request message maximum length is dependent on the service the private endpoint is connected to. Only valid if `is_manual_connection` is set to `true`.
         * 
         * &gt; **Note:** When connected to an SQL resource the `request_message` maximum length is `128`.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(String requestMessage) {
            return requestMessage(Output.of(requestMessage));
        }

        /**
         * @param subresourceNames A list of subresource names which the Private Endpoint is able to connect to. `subresource_names` corresponds to `group_id`. Possible values are detailed in the product [documentation](https://docs.microsoft.com/azure/private-link/private-endpoint-overview#private-link-resource) in the `Subresources` column. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Some resource types (such as Storage Account) only support 1 subresource per private endpoint.
         * 
         * &gt; **Note:** For most Private Links one or more `subresource_names` will need to be specified, please see the linked documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder subresourceNames(@Nullable Output<List<String>> subresourceNames) {
            $.subresourceNames = subresourceNames;
            return this;
        }

        /**
         * @param subresourceNames A list of subresource names which the Private Endpoint is able to connect to. `subresource_names` corresponds to `group_id`. Possible values are detailed in the product [documentation](https://docs.microsoft.com/azure/private-link/private-endpoint-overview#private-link-resource) in the `Subresources` column. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Some resource types (such as Storage Account) only support 1 subresource per private endpoint.
         * 
         * &gt; **Note:** For most Private Links one or more `subresource_names` will need to be specified, please see the linked documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder subresourceNames(List<String> subresourceNames) {
            return subresourceNames(Output.of(subresourceNames));
        }

        /**
         * @param subresourceNames A list of subresource names which the Private Endpoint is able to connect to. `subresource_names` corresponds to `group_id`. Possible values are detailed in the product [documentation](https://docs.microsoft.com/azure/private-link/private-endpoint-overview#private-link-resource) in the `Subresources` column. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Some resource types (such as Storage Account) only support 1 subresource per private endpoint.
         * 
         * &gt; **Note:** For most Private Links one or more `subresource_names` will need to be specified, please see the linked documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder subresourceNames(String... subresourceNames) {
            return subresourceNames(List.of(subresourceNames));
        }

        public EndpointPrivateServiceConnectionArgs build() {
            if ($.isManualConnection == null) {
                throw new MissingRequiredPropertyException("EndpointPrivateServiceConnectionArgs", "isManualConnection");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("EndpointPrivateServiceConnectionArgs", "name");
            }
            return $;
        }
    }

}
