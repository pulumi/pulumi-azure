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

__all__ = ['VirtualNetworkArgs', 'VirtualNetwork']

@pulumi.input_type
class VirtualNetworkArgs:
    def __init__(__self__, *,
                 lab_name: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet: Optional[pulumi.Input['VirtualNetworkSubnetArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a VirtualNetwork resource.
        :param pulumi.Input[_builtins.str] lab_name: Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: A description for the Virtual Network.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        :param pulumi.Input['VirtualNetworkSubnetArgs'] subnet: A `subnet` block as defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "lab_name", lab_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="labName")
    def lab_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lab_name")

    @lab_name.setter
    def lab_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "lab_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description for the Virtual Network.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input['VirtualNetworkSubnetArgs']]:
        """
        A `subnet` block as defined below.
        """
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input['VirtualNetworkSubnetArgs']]):
        pulumi.set(self, "subnet", value)

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
class _VirtualNetworkState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 lab_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet: Optional[pulumi.Input['VirtualNetworkSubnetArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 unique_identifier: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VirtualNetwork resources.
        :param pulumi.Input[_builtins.str] description: A description for the Virtual Network.
        :param pulumi.Input[_builtins.str] lab_name: Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input['VirtualNetworkSubnetArgs'] subnet: A `subnet` block as defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] unique_identifier: The unique immutable identifier of the Dev Test Virtual Network.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if lab_name is not None:
            pulumi.set(__self__, "lab_name", lab_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if unique_identifier is not None:
            pulumi.set(__self__, "unique_identifier", unique_identifier)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description for the Virtual Network.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="labName")
    def lab_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lab_name")

    @lab_name.setter
    def lab_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lab_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input['VirtualNetworkSubnetArgs']]:
        """
        A `subnet` block as defined below.
        """
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input['VirtualNetworkSubnetArgs']]):
        pulumi.set(self, "subnet", value)

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

    @_builtins.property
    @pulumi.getter(name="uniqueIdentifier")
    def unique_identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique immutable identifier of the Dev Test Virtual Network.
        """
        return pulumi.get(self, "unique_identifier")

    @unique_identifier.setter
    def unique_identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "unique_identifier", value)


@pulumi.type_token("azure:devtest/virtualNetwork:VirtualNetwork")
class VirtualNetwork(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 lab_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet: Optional[pulumi.Input[Union['VirtualNetworkSubnetArgs', 'VirtualNetworkSubnetArgsDict']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Virtual Network within a DevTest Lab.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_lab = azure.devtest.Lab("example",
            name="example-devtestlab",
            location=example.location,
            resource_group_name=example.name,
            tags={
                "Sydney": "Australia",
            })
        example_virtual_network = azure.devtest.VirtualNetwork("example",
            name="example-network",
            lab_name=example_lab.name,
            resource_group_name=example.name,
            subnet={
                "use_public_ip_address": "Allow",
                "use_in_virtual_machine_creation": "Allow",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DevTestLab`: 2018-09-15

        ## Import

        DevTest Virtual Networks can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:devtest/virtualNetwork:VirtualNetwork network1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1/virtualNetworks/network1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description for the Virtual Network.
        :param pulumi.Input[_builtins.str] lab_name: Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['VirtualNetworkSubnetArgs', 'VirtualNetworkSubnetArgsDict']] subnet: A `subnet` block as defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VirtualNetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Virtual Network within a DevTest Lab.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_lab = azure.devtest.Lab("example",
            name="example-devtestlab",
            location=example.location,
            resource_group_name=example.name,
            tags={
                "Sydney": "Australia",
            })
        example_virtual_network = azure.devtest.VirtualNetwork("example",
            name="example-network",
            lab_name=example_lab.name,
            resource_group_name=example.name,
            subnet={
                "use_public_ip_address": "Allow",
                "use_in_virtual_machine_creation": "Allow",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DevTestLab`: 2018-09-15

        ## Import

        DevTest Virtual Networks can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:devtest/virtualNetwork:VirtualNetwork network1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1/virtualNetworks/network1
        ```

        :param str resource_name: The name of the resource.
        :param VirtualNetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VirtualNetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 lab_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet: Optional[pulumi.Input[Union['VirtualNetworkSubnetArgs', 'VirtualNetworkSubnetArgsDict']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VirtualNetworkArgs.__new__(VirtualNetworkArgs)

            __props__.__dict__["description"] = description
            if lab_name is None and not opts.urn:
                raise TypeError("Missing required property 'lab_name'")
            __props__.__dict__["lab_name"] = lab_name
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["subnet"] = subnet
            __props__.__dict__["tags"] = tags
            __props__.__dict__["unique_identifier"] = None
        super(VirtualNetwork, __self__).__init__(
            'azure:devtest/virtualNetwork:VirtualNetwork',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            lab_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            subnet: Optional[pulumi.Input[Union['VirtualNetworkSubnetArgs', 'VirtualNetworkSubnetArgsDict']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            unique_identifier: Optional[pulumi.Input[_builtins.str]] = None) -> 'VirtualNetwork':
        """
        Get an existing VirtualNetwork resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description for the Virtual Network.
        :param pulumi.Input[_builtins.str] lab_name: Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['VirtualNetworkSubnetArgs', 'VirtualNetworkSubnetArgsDict']] subnet: A `subnet` block as defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] unique_identifier: The unique immutable identifier of the Dev Test Virtual Network.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VirtualNetworkState.__new__(_VirtualNetworkState)

        __props__.__dict__["description"] = description
        __props__.__dict__["lab_name"] = lab_name
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["subnet"] = subnet
        __props__.__dict__["tags"] = tags
        __props__.__dict__["unique_identifier"] = unique_identifier
        return VirtualNetwork(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description for the Virtual Network.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="labName")
    def lab_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lab_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def subnet(self) -> pulumi.Output['outputs.VirtualNetworkSubnet']:
        """
        A `subnet` block as defined below.
        """
        return pulumi.get(self, "subnet")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="uniqueIdentifier")
    def unique_identifier(self) -> pulumi.Output[_builtins.str]:
        """
        The unique immutable identifier of the Dev Test Virtual Network.
        """
        return pulumi.get(self, "unique_identifier")

