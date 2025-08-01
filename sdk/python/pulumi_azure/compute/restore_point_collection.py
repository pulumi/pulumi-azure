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

__all__ = ['RestorePointCollectionArgs', 'RestorePointCollection']

@pulumi.input_type
class RestorePointCollectionArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 source_virtual_machine_id: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a RestorePointCollection resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_virtual_machine_id: The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "source_virtual_machine_id", source_virtual_machine_id)
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
        The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceVirtualMachineId")
    def source_virtual_machine_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_virtual_machine_id")

    @source_virtual_machine_id.setter
    def source_virtual_machine_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "source_virtual_machine_id", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _RestorePointCollectionState:
    def __init__(__self__, *,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering RestorePointCollection resources.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_virtual_machine_id: The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if source_virtual_machine_id is not None:
            pulumi.set(__self__, "source_virtual_machine_id", source_virtual_machine_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceVirtualMachineId")
    def source_virtual_machine_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_virtual_machine_id")

    @source_virtual_machine_id.setter
    def source_virtual_machine_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_virtual_machine_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("azure:compute/restorePointCollection:RestorePointCollection")
class RestorePointCollection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Virtual Machine Restore Point Collection.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure
        import pulumi_std as std

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-network",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="internal",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"])
        example_network_interface = azure.network.NetworkInterface("example",
            name="example-nic",
            location=example.location,
            resource_group_name=example.name,
            ip_configurations=[{
                "name": "internal",
                "subnet_id": example_subnet.id,
                "private_ip_address_allocation": "Dynamic",
            }])
        example_linux_virtual_machine = azure.compute.LinuxVirtualMachine("example",
            name="example-machine",
            resource_group_name=example.name,
            location=example.location,
            size="Standard_F2",
            admin_username="adminuser",
            network_interface_ids=[example_network_interface.id],
            admin_ssh_keys=[{
                "username": "adminuser",
                "public_key": std.file(input="~/.ssh/id_rsa.pub").result,
            }],
            os_disk={
                "caching": "ReadWrite",
                "storage_account_type": "Standard_LRS",
            },
            source_image_reference={
                "publisher": "Canonical",
                "offer": "0001-com-ubuntu-server-jammy",
                "sku": "22_04-lts",
                "version": "latest",
            })
        example_restore_point_collection = azure.compute.RestorePointCollection("example",
            name="example-collection",
            resource_group_name=example.name,
            location=example_linux_virtual_machine.location,
            source_virtual_machine_id=example_linux_virtual_machine.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2024-03-01

        ## Import

        Virtual Machine Restore Point Collections can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/restorePointCollection:RestorePointCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/restorePointCollections/collection1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_virtual_machine_id: The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RestorePointCollectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Virtual Machine Restore Point Collection.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure
        import pulumi_std as std

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-network",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="internal",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"])
        example_network_interface = azure.network.NetworkInterface("example",
            name="example-nic",
            location=example.location,
            resource_group_name=example.name,
            ip_configurations=[{
                "name": "internal",
                "subnet_id": example_subnet.id,
                "private_ip_address_allocation": "Dynamic",
            }])
        example_linux_virtual_machine = azure.compute.LinuxVirtualMachine("example",
            name="example-machine",
            resource_group_name=example.name,
            location=example.location,
            size="Standard_F2",
            admin_username="adminuser",
            network_interface_ids=[example_network_interface.id],
            admin_ssh_keys=[{
                "username": "adminuser",
                "public_key": std.file(input="~/.ssh/id_rsa.pub").result,
            }],
            os_disk={
                "caching": "ReadWrite",
                "storage_account_type": "Standard_LRS",
            },
            source_image_reference={
                "publisher": "Canonical",
                "offer": "0001-com-ubuntu-server-jammy",
                "sku": "22_04-lts",
                "version": "latest",
            })
        example_restore_point_collection = azure.compute.RestorePointCollection("example",
            name="example-collection",
            resource_group_name=example.name,
            location=example_linux_virtual_machine.location,
            source_virtual_machine_id=example_linux_virtual_machine.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2024-03-01

        ## Import

        Virtual Machine Restore Point Collections can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/restorePointCollection:RestorePointCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/restorePointCollections/collection1
        ```

        :param str resource_name: The name of the resource.
        :param RestorePointCollectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RestorePointCollectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RestorePointCollectionArgs.__new__(RestorePointCollectionArgs)

            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if source_virtual_machine_id is None and not opts.urn:
                raise TypeError("Missing required property 'source_virtual_machine_id'")
            __props__.__dict__["source_virtual_machine_id"] = source_virtual_machine_id
            __props__.__dict__["tags"] = tags
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="azure:compute/virtualMachineRestorePointCollection:VirtualMachineRestorePointCollection")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(RestorePointCollection, __self__).__init__(
            'azure:compute/restorePointCollection:RestorePointCollection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            source_virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'RestorePointCollection':
        """
        Get an existing RestorePointCollection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_virtual_machine_id: The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RestorePointCollectionState.__new__(_RestorePointCollectionState)

        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["source_virtual_machine_id"] = source_virtual_machine_id
        __props__.__dict__["tags"] = tags
        return RestorePointCollection(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="sourceVirtualMachineId")
    def source_virtual_machine_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_virtual_machine_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
        """
        return pulumi.get(self, "tags")

