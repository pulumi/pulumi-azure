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

__all__ = ['SyncGroupArgs', 'SyncGroup']

@pulumi.input_type
class SyncGroupArgs:
    def __init__(__self__, *,
                 storage_sync_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a SyncGroup resource.
        :param pulumi.Input[_builtins.str] storage_sync_id: The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        """
        pulumi.set(__self__, "storage_sync_id", storage_sync_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="storageSyncId")
    def storage_sync_id(self) -> pulumi.Input[_builtins.str]:
        """
        The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        """
        return pulumi.get(self, "storage_sync_id")

    @storage_sync_id.setter
    def storage_sync_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "storage_sync_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SyncGroupState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_sync_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SyncGroup resources.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        :param pulumi.Input[_builtins.str] storage_sync_id: The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_sync_id is not None:
            pulumi.set(__self__, "storage_sync_id", storage_sync_id)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageSyncId")
    def storage_sync_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        """
        return pulumi.get(self, "storage_sync_id")

    @storage_sync_id.setter
    def storage_sync_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_sync_id", value)


@pulumi.type_token("azure:storage/syncGroup:SyncGroup")
class SyncGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_sync_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Storage Sync Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_sync = azure.storage.Sync("example",
            name="example-ss",
            resource_group_name=example.name,
            location=example.location)
        example_sync_group = azure.storage.SyncGroup("example",
            name="example-ss-group",
            storage_sync_id=example_sync.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StorageSync`: 2020-03-01

        ## Import

        Storage Sync Groups can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/syncGroup:SyncGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.StorageSync/storageSyncServices/sync1/syncGroups/group1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        :param pulumi.Input[_builtins.str] storage_sync_id: The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SyncGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Storage Sync Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_sync = azure.storage.Sync("example",
            name="example-ss",
            resource_group_name=example.name,
            location=example.location)
        example_sync_group = azure.storage.SyncGroup("example",
            name="example-ss-group",
            storage_sync_id=example_sync.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StorageSync`: 2020-03-01

        ## Import

        Storage Sync Groups can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/syncGroup:SyncGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.StorageSync/storageSyncServices/sync1/syncGroups/group1
        ```

        :param str resource_name: The name of the resource.
        :param SyncGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SyncGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_sync_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SyncGroupArgs.__new__(SyncGroupArgs)

            __props__.__dict__["name"] = name
            if storage_sync_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_sync_id'")
            __props__.__dict__["storage_sync_id"] = storage_sync_id
        super(SyncGroup, __self__).__init__(
            'azure:storage/syncGroup:SyncGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            storage_sync_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'SyncGroup':
        """
        Get an existing SyncGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        :param pulumi.Input[_builtins.str] storage_sync_id: The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SyncGroupState.__new__(_SyncGroupState)

        __props__.__dict__["name"] = name
        __props__.__dict__["storage_sync_id"] = storage_sync_id
        return SyncGroup(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="storageSyncId")
    def storage_sync_id(self) -> pulumi.Output[_builtins.str]:
        """
        The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
        """
        return pulumi.get(self, "storage_sync_id")

