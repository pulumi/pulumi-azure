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
from . import outputs
from ._inputs import *

__all__ = ['LocalNetworkGatewayArgs', 'LocalNetworkGateway']

@pulumi.input_type
class LocalNetworkGatewayArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 address_spaces: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 bgp_settings: Optional[pulumi.Input['LocalNetworkGatewayBgpSettingsArgs']] = None,
                 gateway_address: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_fqdn: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a LocalNetworkGateway resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] address_spaces: The list of string CIDRs representing the address spaces the gateway exposes.
        :param pulumi.Input['LocalNetworkGatewayBgpSettingsArgs'] bgp_settings: A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        :param pulumi.Input[_builtins.str] gateway_address: The gateway IP address to connect with.
        :param pulumi.Input[_builtins.str] gateway_fqdn: The gateway FQDN to connect with.
               
               > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        :param pulumi.Input[_builtins.str] location: The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if address_spaces is not None:
            pulumi.set(__self__, "address_spaces", address_spaces)
        if bgp_settings is not None:
            pulumi.set(__self__, "bgp_settings", bgp_settings)
        if gateway_address is not None:
            pulumi.set(__self__, "gateway_address", gateway_address)
        if gateway_fqdn is not None:
            pulumi.set(__self__, "gateway_fqdn", gateway_fqdn)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="addressSpaces")
    def address_spaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of string CIDRs representing the address spaces the gateway exposes.
        """
        return pulumi.get(self, "address_spaces")

    @address_spaces.setter
    def address_spaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "address_spaces", value)

    @_builtins.property
    @pulumi.getter(name="bgpSettings")
    def bgp_settings(self) -> Optional[pulumi.Input['LocalNetworkGatewayBgpSettingsArgs']]:
        """
        A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        """
        return pulumi.get(self, "bgp_settings")

    @bgp_settings.setter
    def bgp_settings(self, value: Optional[pulumi.Input['LocalNetworkGatewayBgpSettingsArgs']]):
        pulumi.set(self, "bgp_settings", value)

    @_builtins.property
    @pulumi.getter(name="gatewayAddress")
    def gateway_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The gateway IP address to connect with.
        """
        return pulumi.get(self, "gateway_address")

    @gateway_address.setter
    def gateway_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "gateway_address", value)

    @_builtins.property
    @pulumi.getter(name="gatewayFqdn")
    def gateway_fqdn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The gateway FQDN to connect with.

        > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        """
        return pulumi.get(self, "gateway_fqdn")

    @gateway_fqdn.setter
    def gateway_fqdn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "gateway_fqdn", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the local network gateway. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LocalNetworkGatewayState:
    def __init__(__self__, *,
                 address_spaces: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 bgp_settings: Optional[pulumi.Input['LocalNetworkGatewayBgpSettingsArgs']] = None,
                 gateway_address: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_fqdn: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering LocalNetworkGateway resources.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] address_spaces: The list of string CIDRs representing the address spaces the gateway exposes.
        :param pulumi.Input['LocalNetworkGatewayBgpSettingsArgs'] bgp_settings: A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        :param pulumi.Input[_builtins.str] gateway_address: The gateway IP address to connect with.
        :param pulumi.Input[_builtins.str] gateway_fqdn: The gateway FQDN to connect with.
               
               > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        :param pulumi.Input[_builtins.str] location: The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if address_spaces is not None:
            pulumi.set(__self__, "address_spaces", address_spaces)
        if bgp_settings is not None:
            pulumi.set(__self__, "bgp_settings", bgp_settings)
        if gateway_address is not None:
            pulumi.set(__self__, "gateway_address", gateway_address)
        if gateway_fqdn is not None:
            pulumi.set(__self__, "gateway_fqdn", gateway_fqdn)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="addressSpaces")
    def address_spaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of string CIDRs representing the address spaces the gateway exposes.
        """
        return pulumi.get(self, "address_spaces")

    @address_spaces.setter
    def address_spaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "address_spaces", value)

    @_builtins.property
    @pulumi.getter(name="bgpSettings")
    def bgp_settings(self) -> Optional[pulumi.Input['LocalNetworkGatewayBgpSettingsArgs']]:
        """
        A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        """
        return pulumi.get(self, "bgp_settings")

    @bgp_settings.setter
    def bgp_settings(self, value: Optional[pulumi.Input['LocalNetworkGatewayBgpSettingsArgs']]):
        pulumi.set(self, "bgp_settings", value)

    @_builtins.property
    @pulumi.getter(name="gatewayAddress")
    def gateway_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The gateway IP address to connect with.
        """
        return pulumi.get(self, "gateway_address")

    @gateway_address.setter
    def gateway_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "gateway_address", value)

    @_builtins.property
    @pulumi.getter(name="gatewayFqdn")
    def gateway_fqdn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The gateway FQDN to connect with.

        > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        """
        return pulumi.get(self, "gateway_fqdn")

    @gateway_fqdn.setter
    def gateway_fqdn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "gateway_fqdn", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the local network gateway. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("azure:network/localNetworkGateway:LocalNetworkGateway")
class LocalNetworkGateway(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address_spaces: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 bgp_settings: Optional[pulumi.Input[Union['LocalNetworkGatewayBgpSettingsArgs', 'LocalNetworkGatewayBgpSettingsArgsDict']]] = None,
                 gateway_address: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_fqdn: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a local network gateway connection over which specific connections can be configured.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="localNetworkGWTest",
            location="West Europe")
        home = azure.network.LocalNetworkGateway("home",
            name="backHome",
            resource_group_name=example.name,
            location=example.location,
            gateway_address="12.13.14.15",
            address_spaces=["10.0.0.0/16"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Local Network Gateways can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/localNetworkGateway:LocalNetworkGateway lng1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/localNetworkGateways/lng1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] address_spaces: The list of string CIDRs representing the address spaces the gateway exposes.
        :param pulumi.Input[Union['LocalNetworkGatewayBgpSettingsArgs', 'LocalNetworkGatewayBgpSettingsArgsDict']] bgp_settings: A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        :param pulumi.Input[_builtins.str] gateway_address: The gateway IP address to connect with.
        :param pulumi.Input[_builtins.str] gateway_fqdn: The gateway FQDN to connect with.
               
               > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        :param pulumi.Input[_builtins.str] location: The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocalNetworkGatewayArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a local network gateway connection over which specific connections can be configured.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="localNetworkGWTest",
            location="West Europe")
        home = azure.network.LocalNetworkGateway("home",
            name="backHome",
            resource_group_name=example.name,
            location=example.location,
            gateway_address="12.13.14.15",
            address_spaces=["10.0.0.0/16"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Local Network Gateways can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/localNetworkGateway:LocalNetworkGateway lng1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/localNetworkGateways/lng1
        ```

        :param str resource_name: The name of the resource.
        :param LocalNetworkGatewayArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocalNetworkGatewayArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address_spaces: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 bgp_settings: Optional[pulumi.Input[Union['LocalNetworkGatewayBgpSettingsArgs', 'LocalNetworkGatewayBgpSettingsArgsDict']]] = None,
                 gateway_address: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_fqdn: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocalNetworkGatewayArgs.__new__(LocalNetworkGatewayArgs)

            __props__.__dict__["address_spaces"] = address_spaces
            __props__.__dict__["bgp_settings"] = bgp_settings
            __props__.__dict__["gateway_address"] = gateway_address
            __props__.__dict__["gateway_fqdn"] = gateway_fqdn
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
        super(LocalNetworkGateway, __self__).__init__(
            'azure:network/localNetworkGateway:LocalNetworkGateway',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address_spaces: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            bgp_settings: Optional[pulumi.Input[Union['LocalNetworkGatewayBgpSettingsArgs', 'LocalNetworkGatewayBgpSettingsArgsDict']]] = None,
            gateway_address: Optional[pulumi.Input[_builtins.str]] = None,
            gateway_fqdn: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'LocalNetworkGateway':
        """
        Get an existing LocalNetworkGateway resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] address_spaces: The list of string CIDRs representing the address spaces the gateway exposes.
        :param pulumi.Input[Union['LocalNetworkGatewayBgpSettingsArgs', 'LocalNetworkGatewayBgpSettingsArgsDict']] bgp_settings: A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        :param pulumi.Input[_builtins.str] gateway_address: The gateway IP address to connect with.
        :param pulumi.Input[_builtins.str] gateway_fqdn: The gateway FQDN to connect with.
               
               > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        :param pulumi.Input[_builtins.str] location: The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocalNetworkGatewayState.__new__(_LocalNetworkGatewayState)

        __props__.__dict__["address_spaces"] = address_spaces
        __props__.__dict__["bgp_settings"] = bgp_settings
        __props__.__dict__["gateway_address"] = gateway_address
        __props__.__dict__["gateway_fqdn"] = gateway_fqdn
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        return LocalNetworkGateway(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="addressSpaces")
    def address_spaces(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The list of string CIDRs representing the address spaces the gateway exposes.
        """
        return pulumi.get(self, "address_spaces")

    @_builtins.property
    @pulumi.getter(name="bgpSettings")
    def bgp_settings(self) -> pulumi.Output[Optional['outputs.LocalNetworkGatewayBgpSettings']]:
        """
        A `bgp_settings` block as defined below containing the Local Network Gateway's BGP speaker settings.
        """
        return pulumi.get(self, "bgp_settings")

    @_builtins.property
    @pulumi.getter(name="gatewayAddress")
    def gateway_address(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The gateway IP address to connect with.
        """
        return pulumi.get(self, "gateway_address")

    @_builtins.property
    @pulumi.getter(name="gatewayFqdn")
    def gateway_fqdn(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The gateway FQDN to connect with.

        > **Note:** Either `gateway_address` or `gateway_fqdn` should be specified.
        """
        return pulumi.get(self, "gateway_fqdn")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location/region where the local network gateway is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the local network gateway. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which to create the local network gateway. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

