# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['SharedAccessPolicyArgs', 'SharedAccessPolicy']

@pulumi.input_type
class SharedAccessPolicyArgs:
    def __init__(__self__, *,
                 iothub_name: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 device_connect: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 registry_read: Optional[pulumi.Input[_builtins.bool]] = None,
                 registry_write: Optional[pulumi.Input[_builtins.bool]] = None,
                 service_connect: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a SharedAccessPolicy resource.
        :param pulumi.Input[_builtins.str] iothub_name: The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] device_connect: Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
               
               > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] registry_read: Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        :param pulumi.Input[_builtins.bool] registry_write: Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
               
               > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        :param pulumi.Input[_builtins.bool] service_connect: Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        pulumi.set(__self__, "iothub_name", iothub_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if device_connect is not None:
            pulumi.set(__self__, "device_connect", device_connect)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if registry_read is not None:
            pulumi.set(__self__, "registry_read", registry_read)
        if registry_write is not None:
            pulumi.set(__self__, "registry_write", registry_write)
        if service_connect is not None:
            pulumi.set(__self__, "service_connect", service_connect)

    @_builtins.property
    @pulumi.getter(name="iothubName")
    def iothub_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_name")

    @iothub_name.setter
    def iothub_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "iothub_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="deviceConnect")
    def device_connect(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.

        > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        """
        return pulumi.get(self, "device_connect")

    @device_connect.setter
    def device_connect(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "device_connect", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="registryRead")
    def registry_read(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        """
        return pulumi.get(self, "registry_read")

    @registry_read.setter
    def registry_read(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "registry_read", value)

    @_builtins.property
    @pulumi.getter(name="registryWrite")
    def registry_write(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.

        > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        """
        return pulumi.get(self, "registry_write")

    @registry_write.setter
    def registry_write(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "registry_write", value)

    @_builtins.property
    @pulumi.getter(name="serviceConnect")
    def service_connect(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        return pulumi.get(self, "service_connect")

    @service_connect.setter
    def service_connect(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "service_connect", value)


@pulumi.input_type
class _SharedAccessPolicyState:
    def __init__(__self__, *,
                 device_connect: Optional[pulumi.Input[_builtins.bool]] = None,
                 iothub_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_connection_string: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_key: Optional[pulumi.Input[_builtins.str]] = None,
                 registry_read: Optional[pulumi.Input[_builtins.bool]] = None,
                 registry_write: Optional[pulumi.Input[_builtins.bool]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_connection_string: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_key: Optional[pulumi.Input[_builtins.str]] = None,
                 service_connect: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering SharedAccessPolicy resources.
        :param pulumi.Input[_builtins.bool] device_connect: Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
               
               > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        :param pulumi.Input[_builtins.str] iothub_name: The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] primary_connection_string: The primary connection string of the Shared Access Policy.
        :param pulumi.Input[_builtins.str] primary_key: The primary key used to create the authentication token.
        :param pulumi.Input[_builtins.bool] registry_read: Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        :param pulumi.Input[_builtins.bool] registry_write: Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
               
               > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secondary_connection_string: The secondary connection string of the Shared Access Policy.
        :param pulumi.Input[_builtins.str] secondary_key: The secondary key used to create the authentication token.
        :param pulumi.Input[_builtins.bool] service_connect: Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        if device_connect is not None:
            pulumi.set(__self__, "device_connect", device_connect)
        if iothub_name is not None:
            pulumi.set(__self__, "iothub_name", iothub_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_connection_string is not None:
            pulumi.set(__self__, "primary_connection_string", primary_connection_string)
        if primary_key is not None:
            pulumi.set(__self__, "primary_key", primary_key)
        if registry_read is not None:
            pulumi.set(__self__, "registry_read", registry_read)
        if registry_write is not None:
            pulumi.set(__self__, "registry_write", registry_write)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_connection_string is not None:
            pulumi.set(__self__, "secondary_connection_string", secondary_connection_string)
        if secondary_key is not None:
            pulumi.set(__self__, "secondary_key", secondary_key)
        if service_connect is not None:
            pulumi.set(__self__, "service_connect", service_connect)

    @_builtins.property
    @pulumi.getter(name="deviceConnect")
    def device_connect(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.

        > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        """
        return pulumi.get(self, "device_connect")

    @device_connect.setter
    def device_connect(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "device_connect", value)

    @_builtins.property
    @pulumi.getter(name="iothubName")
    def iothub_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_name")

    @iothub_name.setter
    def iothub_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "iothub_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="primaryConnectionString")
    def primary_connection_string(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The primary connection string of the Shared Access Policy.
        """
        return pulumi.get(self, "primary_connection_string")

    @primary_connection_string.setter
    def primary_connection_string(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "primary_connection_string", value)

    @_builtins.property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The primary key used to create the authentication token.
        """
        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "primary_key", value)

    @_builtins.property
    @pulumi.getter(name="registryRead")
    def registry_read(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        """
        return pulumi.get(self, "registry_read")

    @registry_read.setter
    def registry_read(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "registry_read", value)

    @_builtins.property
    @pulumi.getter(name="registryWrite")
    def registry_write(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.

        > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        """
        return pulumi.get(self, "registry_write")

    @registry_write.setter
    def registry_write(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "registry_write", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="secondaryConnectionString")
    def secondary_connection_string(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secondary connection string of the Shared Access Policy.
        """
        return pulumi.get(self, "secondary_connection_string")

    @secondary_connection_string.setter
    def secondary_connection_string(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_connection_string", value)

    @_builtins.property
    @pulumi.getter(name="secondaryKey")
    def secondary_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secondary key used to create the authentication token.
        """
        return pulumi.get(self, "secondary_key")

    @secondary_key.setter
    def secondary_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_key", value)

    @_builtins.property
    @pulumi.getter(name="serviceConnect")
    def service_connect(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        return pulumi.get(self, "service_connect")

    @service_connect.setter
    def service_connect(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "service_connect", value)


@pulumi.type_token("azure:iot/sharedAccessPolicy:SharedAccessPolicy")
class SharedAccessPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_connect: Optional[pulumi.Input[_builtins.bool]] = None,
                 iothub_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 registry_read: Optional[pulumi.Input[_builtins.bool]] = None,
                 registry_write: Optional[pulumi.Input[_builtins.bool]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 service_connect: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        Manages an IotHub Shared Access Policy

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_io_t_hub = azure.iot.IoTHub("example",
            name="example",
            resource_group_name=example.name,
            location=example.location,
            sku={
                "name": "S1",
                "capacity": 1,
            })
        example_shared_access_policy = azure.iot.SharedAccessPolicy("example",
            name="example",
            resource_group_name=example.name,
            iothub_name=example_io_t_hub.name,
            registry_read=True,
            registry_write=True)
        ```

        ## Import

        IoTHub Shared Access Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:iot/sharedAccessPolicy:SharedAccessPolicy shared_access_policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/iotHubs/hub1/iotHubKeys/shared_access_policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] device_connect: Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
               
               > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        :param pulumi.Input[_builtins.str] iothub_name: The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] registry_read: Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        :param pulumi.Input[_builtins.bool] registry_write: Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
               
               > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] service_connect: Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SharedAccessPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an IotHub Shared Access Policy

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_io_t_hub = azure.iot.IoTHub("example",
            name="example",
            resource_group_name=example.name,
            location=example.location,
            sku={
                "name": "S1",
                "capacity": 1,
            })
        example_shared_access_policy = azure.iot.SharedAccessPolicy("example",
            name="example",
            resource_group_name=example.name,
            iothub_name=example_io_t_hub.name,
            registry_read=True,
            registry_write=True)
        ```

        ## Import

        IoTHub Shared Access Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:iot/sharedAccessPolicy:SharedAccessPolicy shared_access_policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/iotHubs/hub1/iotHubKeys/shared_access_policy1
        ```

        :param str resource_name: The name of the resource.
        :param SharedAccessPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SharedAccessPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_connect: Optional[pulumi.Input[_builtins.bool]] = None,
                 iothub_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 registry_read: Optional[pulumi.Input[_builtins.bool]] = None,
                 registry_write: Optional[pulumi.Input[_builtins.bool]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 service_connect: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SharedAccessPolicyArgs.__new__(SharedAccessPolicyArgs)

            __props__.__dict__["device_connect"] = device_connect
            if iothub_name is None and not opts.urn:
                raise TypeError("Missing required property 'iothub_name'")
            __props__.__dict__["iothub_name"] = iothub_name
            __props__.__dict__["name"] = name
            __props__.__dict__["registry_read"] = registry_read
            __props__.__dict__["registry_write"] = registry_write
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["service_connect"] = service_connect
            __props__.__dict__["primary_connection_string"] = None
            __props__.__dict__["primary_key"] = None
            __props__.__dict__["secondary_connection_string"] = None
            __props__.__dict__["secondary_key"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["primaryConnectionString", "primaryKey", "secondaryConnectionString", "secondaryKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SharedAccessPolicy, __self__).__init__(
            'azure:iot/sharedAccessPolicy:SharedAccessPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device_connect: Optional[pulumi.Input[_builtins.bool]] = None,
            iothub_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            primary_connection_string: Optional[pulumi.Input[_builtins.str]] = None,
            primary_key: Optional[pulumi.Input[_builtins.str]] = None,
            registry_read: Optional[pulumi.Input[_builtins.bool]] = None,
            registry_write: Optional[pulumi.Input[_builtins.bool]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            secondary_connection_string: Optional[pulumi.Input[_builtins.str]] = None,
            secondary_key: Optional[pulumi.Input[_builtins.str]] = None,
            service_connect: Optional[pulumi.Input[_builtins.bool]] = None) -> 'SharedAccessPolicy':
        """
        Get an existing SharedAccessPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] device_connect: Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.
               
               > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        :param pulumi.Input[_builtins.str] iothub_name: The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] primary_connection_string: The primary connection string of the Shared Access Policy.
        :param pulumi.Input[_builtins.str] primary_key: The primary key used to create the authentication token.
        :param pulumi.Input[_builtins.bool] registry_read: Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        :param pulumi.Input[_builtins.bool] registry_write: Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.
               
               > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secondary_connection_string: The secondary connection string of the Shared Access Policy.
        :param pulumi.Input[_builtins.str] secondary_key: The secondary key used to create the authentication token.
        :param pulumi.Input[_builtins.bool] service_connect: Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SharedAccessPolicyState.__new__(_SharedAccessPolicyState)

        __props__.__dict__["device_connect"] = device_connect
        __props__.__dict__["iothub_name"] = iothub_name
        __props__.__dict__["name"] = name
        __props__.__dict__["primary_connection_string"] = primary_connection_string
        __props__.__dict__["primary_key"] = primary_key
        __props__.__dict__["registry_read"] = registry_read
        __props__.__dict__["registry_write"] = registry_write
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["secondary_connection_string"] = secondary_connection_string
        __props__.__dict__["secondary_key"] = secondary_key
        __props__.__dict__["service_connect"] = service_connect
        return SharedAccessPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="deviceConnect")
    def device_connect(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Adds `DeviceConnect` permission to this Shared Access Account. It allows sending and receiving on the device-side endpoints.

        > **Note:** At least one of `registry_read`, `registry_write`, `service_connect`, `device_connect` permissions must be set to `true`.
        """
        return pulumi.get(self, "device_connect")

    @_builtins.property
    @pulumi.getter(name="iothubName")
    def iothub_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the IoTHub to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryConnectionString")
    def primary_connection_string(self) -> pulumi.Output[_builtins.str]:
        """
        The primary connection string of the Shared Access Policy.
        """
        return pulumi.get(self, "primary_connection_string")

    @_builtins.property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> pulumi.Output[_builtins.str]:
        """
        The primary key used to create the authentication token.
        """
        return pulumi.get(self, "primary_key")

    @_builtins.property
    @pulumi.getter(name="registryRead")
    def registry_read(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Adds `RegistryRead` permission to this Shared Access Account. It allows read access to the identity registry.
        """
        return pulumi.get(self, "registry_read")

    @_builtins.property
    @pulumi.getter(name="registryWrite")
    def registry_write(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Adds `RegistryWrite` permission to this Shared Access Account. It allows write access to the identity registry.

        > **Note:** When `registry_write` is set to `true`, `registry_read` must also be set to true. This is a limitation of the Azure REST API
        """
        return pulumi.get(self, "registry_write")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="secondaryConnectionString")
    def secondary_connection_string(self) -> pulumi.Output[_builtins.str]:
        """
        The secondary connection string of the Shared Access Policy.
        """
        return pulumi.get(self, "secondary_connection_string")

    @_builtins.property
    @pulumi.getter(name="secondaryKey")
    def secondary_key(self) -> pulumi.Output[_builtins.str]:
        """
        The secondary key used to create the authentication token.
        """
        return pulumi.get(self, "secondary_key")

    @_builtins.property
    @pulumi.getter(name="serviceConnect")
    def service_connect(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Adds `ServiceConnect` permission to this Shared Access Account. It allows sending and receiving on the cloud-side endpoints.
        """
        return pulumi.get(self, "service_connect")

