// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedAccessPolicyArgs Empty = new SharedAccessPolicyArgs();

    /**
     * Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
     * 
     */
    @Import(name="deviceConnect")
    private @Nullable Output<Boolean> deviceConnect;

    /**
     * @return Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
     * 
     */
    public Optional<Output<Boolean>> deviceConnect() {
        return Optional.ofNullable(this.deviceConnect);
    }

    /**
     * The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="iothubName", required=true)
    private Output<String> iothubName;

    /**
     * @return The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> iothubName() {
        return this.iothubName;
    }

    /**
     * Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
     * 
     */
    @Import(name="registryRead")
    private @Nullable Output<Boolean> registryRead;

    /**
     * @return Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
     * 
     */
    public Optional<Output<Boolean>> registryRead() {
        return Optional.ofNullable(this.registryRead);
    }

    /**
     * Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
     * 
     */
    @Import(name="registryWrite")
    private @Nullable Output<Boolean> registryWrite;

    /**
     * @return Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
     * 
     */
    public Optional<Output<Boolean>> registryWrite() {
        return Optional.ofNullable(this.registryWrite);
    }

    /**
     * The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
     * 
     */
    @Import(name="serviceConnect")
    private @Nullable Output<Boolean> serviceConnect;

    /**
     * @return Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
     * 
     */
    public Optional<Output<Boolean>> serviceConnect() {
        return Optional.ofNullable(this.serviceConnect);
    }

    private SharedAccessPolicyArgs() {}

    private SharedAccessPolicyArgs(SharedAccessPolicyArgs $) {
        this.deviceConnect = $.deviceConnect;
        this.iothubName = $.iothubName;
        this.name = $.name;
        this.registryRead = $.registryRead;
        this.registryWrite = $.registryWrite;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceConnect = $.serviceConnect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedAccessPolicyArgs $;

        public Builder() {
            $ = new SharedAccessPolicyArgs();
        }

        public Builder(SharedAccessPolicyArgs defaults) {
            $ = new SharedAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceConnect Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
         * 
         * @return builder
         * 
         */
        public Builder deviceConnect(@Nullable Output<Boolean> deviceConnect) {
            $.deviceConnect = deviceConnect;
            return this;
        }

        /**
         * @param deviceConnect Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
         * 
         * @return builder
         * 
         */
        public Builder deviceConnect(Boolean deviceConnect) {
            return deviceConnect(Output.of(deviceConnect));
        }

        /**
         * @param iothubName The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubName(Output<String> iothubName) {
            $.iothubName = iothubName;
            return this;
        }

        /**
         * @param iothubName The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubName(String iothubName) {
            return iothubName(Output.of(iothubName));
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param registryRead Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
         * 
         * @return builder
         * 
         */
        public Builder registryRead(@Nullable Output<Boolean> registryRead) {
            $.registryRead = registryRead;
            return this;
        }

        /**
         * @param registryRead Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
         * 
         * @return builder
         * 
         */
        public Builder registryRead(Boolean registryRead) {
            return registryRead(Output.of(registryRead));
        }

        /**
         * @param registryWrite Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
         * 
         * @return builder
         * 
         */
        public Builder registryWrite(@Nullable Output<Boolean> registryWrite) {
            $.registryWrite = registryWrite;
            return this;
        }

        /**
         * @param registryWrite Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
         * 
         * @return builder
         * 
         */
        public Builder registryWrite(Boolean registryWrite) {
            return registryWrite(Output.of(registryWrite));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceConnect Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
         * 
         * @return builder
         * 
         */
        public Builder serviceConnect(@Nullable Output<Boolean> serviceConnect) {
            $.serviceConnect = serviceConnect;
            return this;
        }

        /**
         * @param serviceConnect Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
         * 
         * @return builder
         * 
         */
        public Builder serviceConnect(Boolean serviceConnect) {
            return serviceConnect(Output.of(serviceConnect));
        }

        public SharedAccessPolicyArgs build() {
            $.iothubName = Objects.requireNonNull($.iothubName, "expected parameter 'iothubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}