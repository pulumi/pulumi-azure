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

__all__ = ['NetworkPacketCoreDataPlaneArgs', 'NetworkPacketCoreDataPlane']

@pulumi.input_type
class NetworkPacketCoreDataPlaneArgs:
    def __init__(__self__, *,
                 mobile_network_packet_core_control_plane_id: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_plane_access_ipv4_address: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_gateway: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_subnet: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a NetworkPacketCoreDataPlane resource.
        :param pulumi.Input[_builtins.str] mobile_network_packet_core_control_plane_id: Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_address: The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_gateway: The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_subnet: The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_name: Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        pulumi.set(__self__, "mobile_network_packet_core_control_plane_id", mobile_network_packet_core_control_plane_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user_plane_access_ipv4_address is not None:
            pulumi.set(__self__, "user_plane_access_ipv4_address", user_plane_access_ipv4_address)
        if user_plane_access_ipv4_gateway is not None:
            pulumi.set(__self__, "user_plane_access_ipv4_gateway", user_plane_access_ipv4_gateway)
        if user_plane_access_ipv4_subnet is not None:
            pulumi.set(__self__, "user_plane_access_ipv4_subnet", user_plane_access_ipv4_subnet)
        if user_plane_access_name is not None:
            pulumi.set(__self__, "user_plane_access_name", user_plane_access_name)

    @_builtins.property
    @pulumi.getter(name="mobileNetworkPacketCoreControlPlaneId")
    def mobile_network_packet_core_control_plane_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "mobile_network_packet_core_control_plane_id")

    @mobile_network_packet_core_control_plane_id.setter
    def mobile_network_packet_core_control_plane_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "mobile_network_packet_core_control_plane_id", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Address")
    def user_plane_access_ipv4_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_address")

    @user_plane_access_ipv4_address.setter
    def user_plane_access_ipv4_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_ipv4_address", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Gateway")
    def user_plane_access_ipv4_gateway(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_gateway")

    @user_plane_access_ipv4_gateway.setter
    def user_plane_access_ipv4_gateway(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_ipv4_gateway", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Subnet")
    def user_plane_access_ipv4_subnet(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_subnet")

    @user_plane_access_ipv4_subnet.setter
    def user_plane_access_ipv4_subnet(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_ipv4_subnet", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessName")
    def user_plane_access_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_name")

    @user_plane_access_name.setter
    def user_plane_access_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_name", value)


@pulumi.input_type
class _NetworkPacketCoreDataPlaneState:
    def __init__(__self__, *,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 mobile_network_packet_core_control_plane_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_plane_access_ipv4_address: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_gateway: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_subnet: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NetworkPacketCoreDataPlane resources.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] mobile_network_packet_core_control_plane_id: Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_address: The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_gateway: The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_subnet: The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_name: Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        if location is not None:
            pulumi.set(__self__, "location", location)
        if mobile_network_packet_core_control_plane_id is not None:
            pulumi.set(__self__, "mobile_network_packet_core_control_plane_id", mobile_network_packet_core_control_plane_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user_plane_access_ipv4_address is not None:
            pulumi.set(__self__, "user_plane_access_ipv4_address", user_plane_access_ipv4_address)
        if user_plane_access_ipv4_gateway is not None:
            pulumi.set(__self__, "user_plane_access_ipv4_gateway", user_plane_access_ipv4_gateway)
        if user_plane_access_ipv4_subnet is not None:
            pulumi.set(__self__, "user_plane_access_ipv4_subnet", user_plane_access_ipv4_subnet)
        if user_plane_access_name is not None:
            pulumi.set(__self__, "user_plane_access_name", user_plane_access_name)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="mobileNetworkPacketCoreControlPlaneId")
    def mobile_network_packet_core_control_plane_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "mobile_network_packet_core_control_plane_id")

    @mobile_network_packet_core_control_plane_id.setter
    def mobile_network_packet_core_control_plane_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mobile_network_packet_core_control_plane_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Address")
    def user_plane_access_ipv4_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_address")

    @user_plane_access_ipv4_address.setter
    def user_plane_access_ipv4_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_ipv4_address", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Gateway")
    def user_plane_access_ipv4_gateway(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_gateway")

    @user_plane_access_ipv4_gateway.setter
    def user_plane_access_ipv4_gateway(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_ipv4_gateway", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Subnet")
    def user_plane_access_ipv4_subnet(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_subnet")

    @user_plane_access_ipv4_subnet.setter
    def user_plane_access_ipv4_subnet(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_ipv4_subnet", value)

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessName")
    def user_plane_access_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_name")

    @user_plane_access_name.setter
    def user_plane_access_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_plane_access_name", value)


@pulumi.type_token("azure:mobile/networkPacketCoreDataPlane:NetworkPacketCoreDataPlane")
class NetworkPacketCoreDataPlane(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 mobile_network_packet_core_control_plane_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_plane_access_ipv4_address: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_gateway: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_subnet: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Mobile Network Packet Core Data Plane.

        ## Import

        Mobile Network Packet Core Data Plane can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mobile/networkPacketCoreDataPlane:NetworkPacketCoreDataPlane example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/packetCoreControlPlanes/packetCoreControlPlane1/packetCoreDataPlanes/packetCoreDataPlane1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] mobile_network_packet_core_control_plane_id: Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_address: The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_gateway: The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_subnet: The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_name: Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkPacketCoreDataPlaneArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Mobile Network Packet Core Data Plane.

        ## Import

        Mobile Network Packet Core Data Plane can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mobile/networkPacketCoreDataPlane:NetworkPacketCoreDataPlane example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/packetCoreControlPlanes/packetCoreControlPlane1/packetCoreDataPlanes/packetCoreDataPlane1
        ```

        :param str resource_name: The name of the resource.
        :param NetworkPacketCoreDataPlaneArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkPacketCoreDataPlaneArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 mobile_network_packet_core_control_plane_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_plane_access_ipv4_address: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_gateway: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_ipv4_subnet: Optional[pulumi.Input[_builtins.str]] = None,
                 user_plane_access_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkPacketCoreDataPlaneArgs.__new__(NetworkPacketCoreDataPlaneArgs)

            __props__.__dict__["location"] = location
            if mobile_network_packet_core_control_plane_id is None and not opts.urn:
                raise TypeError("Missing required property 'mobile_network_packet_core_control_plane_id'")
            __props__.__dict__["mobile_network_packet_core_control_plane_id"] = mobile_network_packet_core_control_plane_id
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["user_plane_access_ipv4_address"] = user_plane_access_ipv4_address
            __props__.__dict__["user_plane_access_ipv4_gateway"] = user_plane_access_ipv4_gateway
            __props__.__dict__["user_plane_access_ipv4_subnet"] = user_plane_access_ipv4_subnet
            __props__.__dict__["user_plane_access_name"] = user_plane_access_name
        super(NetworkPacketCoreDataPlane, __self__).__init__(
            'azure:mobile/networkPacketCoreDataPlane:NetworkPacketCoreDataPlane',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            mobile_network_packet_core_control_plane_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            user_plane_access_ipv4_address: Optional[pulumi.Input[_builtins.str]] = None,
            user_plane_access_ipv4_gateway: Optional[pulumi.Input[_builtins.str]] = None,
            user_plane_access_ipv4_subnet: Optional[pulumi.Input[_builtins.str]] = None,
            user_plane_access_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'NetworkPacketCoreDataPlane':
        """
        Get an existing NetworkPacketCoreDataPlane resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] mobile_network_packet_core_control_plane_id: Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_address: The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_gateway: The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_ipv4_subnet: The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        :param pulumi.Input[_builtins.str] user_plane_access_name: Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkPacketCoreDataPlaneState.__new__(_NetworkPacketCoreDataPlaneState)

        __props__.__dict__["location"] = location
        __props__.__dict__["mobile_network_packet_core_control_plane_id"] = mobile_network_packet_core_control_plane_id
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["user_plane_access_ipv4_address"] = user_plane_access_ipv4_address
        __props__.__dict__["user_plane_access_ipv4_gateway"] = user_plane_access_ipv4_gateway
        __props__.__dict__["user_plane_access_ipv4_subnet"] = user_plane_access_ipv4_subnet
        __props__.__dict__["user_plane_access_name"] = user_plane_access_name
        return NetworkPacketCoreDataPlane(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Azure Region where the Mobile Network Packet Core Data Plane should exist. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="mobileNetworkPacketCoreControlPlaneId")
    def mobile_network_packet_core_control_plane_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the ID of the Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "mobile_network_packet_core_control_plane_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name which should be used for this Mobile Network Packet Core Data Plane. Changing this forces a new Mobile Network Packet Core Data Plane to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags which should be assigned to the Mobile Network Packet Core Data Plane.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Address")
    def user_plane_access_ipv4_address(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The IPv4 address for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_address")

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Gateway")
    def user_plane_access_ipv4_gateway(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The default IPv4 gateway for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_gateway")

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessIpv4Subnet")
    def user_plane_access_ipv4_subnet(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The IPv4 subnet for the user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_ipv4_subnet")

    @_builtins.property
    @pulumi.getter(name="userPlaneAccessName")
    def user_plane_access_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the logical name for thie user plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
        """
        return pulumi.get(self, "user_plane_access_name")

