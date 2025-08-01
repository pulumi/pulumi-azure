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

__all__ = ['LabArgs', 'Lab']

@pulumi.input_type
class LabArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Lab resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
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
        The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
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
class _LabState:
    def __init__(__self__, *,
                 artifacts_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 default_premium_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 default_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 key_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 premium_data_disk_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 unique_identifier: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Lab resources.
        :param pulumi.Input[_builtins.str] artifacts_storage_account_id: The ID of the Storage Account used for Artifact Storage.
        :param pulumi.Input[_builtins.str] default_premium_storage_account_id: The ID of the Default Premium Storage Account for this Dev Test Lab.
        :param pulumi.Input[_builtins.str] default_storage_account_id: The ID of the Default Storage Account for this Dev Test Lab.
        :param pulumi.Input[_builtins.str] key_vault_id: The ID of the Key used for this Dev Test Lab.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] premium_data_disk_storage_account_id: The ID of the Storage Account used for Storage of Premium Data Disk.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] unique_identifier: The unique immutable identifier of the Dev Test Lab.
        """
        if artifacts_storage_account_id is not None:
            pulumi.set(__self__, "artifacts_storage_account_id", artifacts_storage_account_id)
        if default_premium_storage_account_id is not None:
            pulumi.set(__self__, "default_premium_storage_account_id", default_premium_storage_account_id)
        if default_storage_account_id is not None:
            pulumi.set(__self__, "default_storage_account_id", default_storage_account_id)
        if key_vault_id is not None:
            pulumi.set(__self__, "key_vault_id", key_vault_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if premium_data_disk_storage_account_id is not None:
            pulumi.set(__self__, "premium_data_disk_storage_account_id", premium_data_disk_storage_account_id)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if unique_identifier is not None:
            pulumi.set(__self__, "unique_identifier", unique_identifier)

    @_builtins.property
    @pulumi.getter(name="artifactsStorageAccountId")
    def artifacts_storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Storage Account used for Artifact Storage.
        """
        return pulumi.get(self, "artifacts_storage_account_id")

    @artifacts_storage_account_id.setter
    def artifacts_storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "artifacts_storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="defaultPremiumStorageAccountId")
    def default_premium_storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Default Premium Storage Account for this Dev Test Lab.
        """
        return pulumi.get(self, "default_premium_storage_account_id")

    @default_premium_storage_account_id.setter
    def default_premium_storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_premium_storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="defaultStorageAccountId")
    def default_storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Default Storage Account for this Dev Test Lab.
        """
        return pulumi.get(self, "default_storage_account_id")

    @default_storage_account_id.setter
    def default_storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="keyVaultId")
    def key_vault_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Key used for this Dev Test Lab.
        """
        return pulumi.get(self, "key_vault_id")

    @key_vault_id.setter
    def key_vault_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key_vault_id", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="premiumDataDiskStorageAccountId")
    def premium_data_disk_storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Storage Account used for Storage of Premium Data Disk.
        """
        return pulumi.get(self, "premium_data_disk_storage_account_id")

    @premium_data_disk_storage_account_id.setter
    def premium_data_disk_storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "premium_data_disk_storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
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

    @_builtins.property
    @pulumi.getter(name="uniqueIdentifier")
    def unique_identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique immutable identifier of the Dev Test Lab.
        """
        return pulumi.get(self, "unique_identifier")

    @unique_identifier.setter
    def unique_identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "unique_identifier", value)


@pulumi.type_token("azure:devtest/lab:Lab")
class Lab(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Dev Test Lab.

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
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DevTestLab`: 2018-09-15

        ## Import

        Dev Test Labs can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:devtest/lab:Lab lab1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LabArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Dev Test Lab.

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
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DevTestLab`: 2018-09-15

        ## Import

        Dev Test Labs can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:devtest/lab:Lab lab1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1
        ```

        :param str resource_name: The name of the resource.
        :param LabArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LabArgs, pulumi.ResourceOptions, *args, **kwargs)
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
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LabArgs.__new__(LabArgs)

            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["artifacts_storage_account_id"] = None
            __props__.__dict__["default_premium_storage_account_id"] = None
            __props__.__dict__["default_storage_account_id"] = None
            __props__.__dict__["key_vault_id"] = None
            __props__.__dict__["premium_data_disk_storage_account_id"] = None
            __props__.__dict__["unique_identifier"] = None
        super(Lab, __self__).__init__(
            'azure:devtest/lab:Lab',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            artifacts_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            default_premium_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            default_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            key_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            premium_data_disk_storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            unique_identifier: Optional[pulumi.Input[_builtins.str]] = None) -> 'Lab':
        """
        Get an existing Lab resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] artifacts_storage_account_id: The ID of the Storage Account used for Artifact Storage.
        :param pulumi.Input[_builtins.str] default_premium_storage_account_id: The ID of the Default Premium Storage Account for this Dev Test Lab.
        :param pulumi.Input[_builtins.str] default_storage_account_id: The ID of the Default Storage Account for this Dev Test Lab.
        :param pulumi.Input[_builtins.str] key_vault_id: The ID of the Key used for this Dev Test Lab.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] premium_data_disk_storage_account_id: The ID of the Storage Account used for Storage of Premium Data Disk.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] unique_identifier: The unique immutable identifier of the Dev Test Lab.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LabState.__new__(_LabState)

        __props__.__dict__["artifacts_storage_account_id"] = artifacts_storage_account_id
        __props__.__dict__["default_premium_storage_account_id"] = default_premium_storage_account_id
        __props__.__dict__["default_storage_account_id"] = default_storage_account_id
        __props__.__dict__["key_vault_id"] = key_vault_id
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["premium_data_disk_storage_account_id"] = premium_data_disk_storage_account_id
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["unique_identifier"] = unique_identifier
        return Lab(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="artifactsStorageAccountId")
    def artifacts_storage_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Storage Account used for Artifact Storage.
        """
        return pulumi.get(self, "artifacts_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="defaultPremiumStorageAccountId")
    def default_premium_storage_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Default Premium Storage Account for this Dev Test Lab.
        """
        return pulumi.get(self, "default_premium_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="defaultStorageAccountId")
    def default_storage_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Default Storage Account for this Dev Test Lab.
        """
        return pulumi.get(self, "default_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="keyVaultId")
    def key_vault_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Key used for this Dev Test Lab.
        """
        return pulumi.get(self, "key_vault_id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the supported Azure location where the Dev Test Lab should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Dev Test Lab. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="premiumDataDiskStorageAccountId")
    def premium_data_disk_storage_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Storage Account used for Storage of Premium Data Disk.
        """
        return pulumi.get(self, "premium_data_disk_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group under which the Dev Test Lab resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

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
        The unique immutable identifier of the Dev Test Lab.
        """
        return pulumi.get(self, "unique_identifier")

