// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotHubDeviceUpdateAccountIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubDeviceUpdateAccountIdentityArgs Empty = new IotHubDeviceUpdateAccountIdentityArgs();

    /**
     * A list of User Assigned Managed Identity IDs to be assigned to this IoT Hub Device Update Account.
     * 
     * &gt; **Note:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return A list of User Assigned Managed Identity IDs to be assigned to this IoT Hub Device Update Account.
     * 
     * &gt; **Note:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    /**
     * The Principal ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this IoT Hub Device Update Account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this IoT Hub Device Update Account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private IotHubDeviceUpdateAccountIdentityArgs() {}

    private IotHubDeviceUpdateAccountIdentityArgs(IotHubDeviceUpdateAccountIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubDeviceUpdateAccountIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubDeviceUpdateAccountIdentityArgs $;

        public Builder() {
            $ = new IotHubDeviceUpdateAccountIdentityArgs();
        }

        public Builder(IotHubDeviceUpdateAccountIdentityArgs defaults) {
            $ = new IotHubDeviceUpdateAccountIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this IoT Hub Device Update Account.
         * 
         * &gt; **Note:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this IoT Hub Device Update Account.
         * 
         * &gt; **Note:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this IoT Hub Device Update Account.
         * 
         * &gt; **Note:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this IoT Hub Device Update Account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this IoT Hub Device Update Account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this IoT Hub Device Update Account. Possible values are `SystemAssigned`, `UserAssigned` and `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IotHubDeviceUpdateAccountIdentityArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("IotHubDeviceUpdateAccountIdentityArgs", "type");
            }
            return $;
        }
    }

}
