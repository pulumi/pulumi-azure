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

__all__ = ['ShareDirectoryArgs', 'ShareDirectory']

@pulumi.input_type
class ShareDirectoryArgs:
    def __init__(__self__, *,
                 storage_share_id: pulumi.Input[_builtins.str],
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ShareDirectory resource.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this Directory.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "storage_share_id", storage_share_id)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")

    @storage_share_id.setter
    def storage_share_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "storage_share_id", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of metadata to assign to this Directory.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ShareDirectoryState:
    def __init__(__self__, *,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_share_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ShareDirectory resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this Directory.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_share_id is not None:
            pulumi.set(__self__, "storage_share_id", storage_share_id)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of metadata to assign to this Directory.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")

    @storage_share_id.setter
    def storage_share_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_share_id", value)


@pulumi.type_token("azure:storage/shareDirectory:ShareDirectory")
class ShareDirectory(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="azuretest",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="azureteststorage",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_share = azure.storage.Share("example",
            name="sharename",
            storage_account_name=example_account.name,
            quota=50)
        example_share_directory = azure.storage.ShareDirectory("example",
            name="example",
            storage_share_id=example_share.id)
        ```

        ## Import

        Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/shareDirectory:ShareDirectory example https://tomdevsa20.file.core.windows.net/share1/directory1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this Directory.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ShareDirectoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="azuretest",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="azureteststorage",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_share = azure.storage.Share("example",
            name="sharename",
            storage_account_name=example_account.name,
            quota=50)
        example_share_directory = azure.storage.ShareDirectory("example",
            name="example",
            storage_share_id=example_share.id)
        ```

        ## Import

        Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/shareDirectory:ShareDirectory example https://tomdevsa20.file.core.windows.net/share1/directory1
        ```

        :param str resource_name: The name of the resource.
        :param ShareDirectoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ShareDirectoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ShareDirectoryArgs.__new__(ShareDirectoryArgs)

            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            if storage_share_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_share_id'")
            __props__.__dict__["storage_share_id"] = storage_share_id
        super(ShareDirectory, __self__).__init__(
            'azure:storage/shareDirectory:ShareDirectory',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            storage_share_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ShareDirectory':
        """
        Get an existing ShareDirectory resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this Directory.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ShareDirectoryState.__new__(_ShareDirectoryState)

        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["storage_share_id"] = storage_share_id
        return ShareDirectory(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of metadata to assign to this Directory.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")

