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

__all__ = ['ShareFileArgs', 'ShareFile']

@pulumi.input_type
class ShareFileArgs:
    def __init__(__self__, *,
                 storage_share_id: pulumi.Input[_builtins.str],
                 content_disposition: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 content_md5: Optional[pulumi.Input[_builtins.str]] = None,
                 content_type: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ShareFile resource.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[_builtins.str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[_builtins.str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        :param pulumi.Input[_builtins.str] source: An absolute path to a file on the local system. Changing this forces a new resource to be created.
               
               > **Note:** The file specified with `source` can not be empty.
        """
        pulumi.set(__self__, "storage_share_id", storage_share_id)
        if content_disposition is not None:
            pulumi.set(__self__, "content_disposition", content_disposition)
        if content_encoding is not None:
            pulumi.set(__self__, "content_encoding", content_encoding)
        if content_md5 is not None:
            pulumi.set(__self__, "content_md5", content_md5)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if source is not None:
            pulumi.set(__self__, "source", source)

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
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Sets the file’s Content-Disposition header.
        """
        return pulumi.get(self, "content_disposition")

    @content_disposition.setter
    def content_disposition(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_disposition", value)

    @_builtins.property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies which content encodings have been applied to the file.
        """
        return pulumi.get(self, "content_encoding")

    @content_encoding.setter
    def content_encoding(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_encoding", value)

    @_builtins.property
    @pulumi.getter(name="contentMd5")
    def content_md5(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "content_md5")

    @content_md5.setter
    def content_md5(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_md5", value)

    @_builtins.property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The content type of the share file. Defaults to `application/octet-stream`.
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_type", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of metadata to assign to this file.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "path", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An absolute path to a file on the local system. Changing this forces a new resource to be created.

        > **Note:** The file specified with `source` can not be empty.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _ShareFileState:
    def __init__(__self__, *,
                 content_disposition: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 content_length: Optional[pulumi.Input[_builtins.int]] = None,
                 content_md5: Optional[pulumi.Input[_builtins.str]] = None,
                 content_type: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_share_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ShareFile resources.
        :param pulumi.Input[_builtins.str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[_builtins.str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[_builtins.int] content_length: The length in bytes of the file content
        :param pulumi.Input[_builtins.str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        :param pulumi.Input[_builtins.str] source: An absolute path to a file on the local system. Changing this forces a new resource to be created.
               
               > **Note:** The file specified with `source` can not be empty.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        if content_disposition is not None:
            pulumi.set(__self__, "content_disposition", content_disposition)
        if content_encoding is not None:
            pulumi.set(__self__, "content_encoding", content_encoding)
        if content_length is not None:
            pulumi.set(__self__, "content_length", content_length)
        if content_md5 is not None:
            pulumi.set(__self__, "content_md5", content_md5)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if storage_share_id is not None:
            pulumi.set(__self__, "storage_share_id", storage_share_id)

    @_builtins.property
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Sets the file’s Content-Disposition header.
        """
        return pulumi.get(self, "content_disposition")

    @content_disposition.setter
    def content_disposition(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_disposition", value)

    @_builtins.property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies which content encodings have been applied to the file.
        """
        return pulumi.get(self, "content_encoding")

    @content_encoding.setter
    def content_encoding(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_encoding", value)

    @_builtins.property
    @pulumi.getter(name="contentLength")
    def content_length(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The length in bytes of the file content
        """
        return pulumi.get(self, "content_length")

    @content_length.setter
    def content_length(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "content_length", value)

    @_builtins.property
    @pulumi.getter(name="contentMd5")
    def content_md5(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "content_md5")

    @content_md5.setter
    def content_md5(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_md5", value)

    @_builtins.property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The content type of the share file. Defaults to `application/octet-stream`.
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_type", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of metadata to assign to this file.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "path", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An absolute path to a file on the local system. Changing this forces a new resource to be created.

        > **Note:** The file specified with `source` can not be empty.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source", value)

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


@pulumi.type_token("azure:storage/shareFile:ShareFile")
class ShareFile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_disposition: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 content_md5: Optional[pulumi.Input[_builtins.str]] = None,
                 content_type: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
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
        example_share_file = azure.storage.ShareFile("example",
            name="my-awesome-content.zip",
            storage_share_id=example_share.id,
            source="some-local-file.zip")
        ```

        ## Import

        Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/shareFile:ShareFile example https://account1.file.core.windows.net/share1/file1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[_builtins.str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[_builtins.str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        :param pulumi.Input[_builtins.str] source: An absolute path to a file on the local system. Changing this forces a new resource to be created.
               
               > **Note:** The file specified with `source` can not be empty.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ShareFileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
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
        example_share_file = azure.storage.ShareFile("example",
            name="my-awesome-content.zip",
            storage_share_id=example_share.id,
            source="some-local-file.zip")
        ```

        ## Import

        Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/shareFile:ShareFile example https://account1.file.core.windows.net/share1/file1
        ```

        :param str resource_name: The name of the resource.
        :param ShareFileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ShareFileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_disposition: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 content_md5: Optional[pulumi.Input[_builtins.str]] = None,
                 content_type: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ShareFileArgs.__new__(ShareFileArgs)

            __props__.__dict__["content_disposition"] = content_disposition
            __props__.__dict__["content_encoding"] = content_encoding
            __props__.__dict__["content_md5"] = content_md5
            __props__.__dict__["content_type"] = content_type
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            __props__.__dict__["path"] = path
            __props__.__dict__["source"] = source
            if storage_share_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_share_id'")
            __props__.__dict__["storage_share_id"] = storage_share_id
            __props__.__dict__["content_length"] = None
        super(ShareFile, __self__).__init__(
            'azure:storage/shareFile:ShareFile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content_disposition: Optional[pulumi.Input[_builtins.str]] = None,
            content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
            content_length: Optional[pulumi.Input[_builtins.int]] = None,
            content_md5: Optional[pulumi.Input[_builtins.str]] = None,
            content_type: Optional[pulumi.Input[_builtins.str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            path: Optional[pulumi.Input[_builtins.str]] = None,
            source: Optional[pulumi.Input[_builtins.str]] = None,
            storage_share_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ShareFile':
        """
        Get an existing ShareFile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] content_disposition: Sets the file’s Content-Disposition header.
        :param pulumi.Input[_builtins.str] content_encoding: Specifies which content encodings have been applied to the file.
        :param pulumi.Input[_builtins.int] content_length: The length in bytes of the file content
        :param pulumi.Input[_builtins.str] content_type: The content type of the share file. Defaults to `application/octet-stream`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of metadata to assign to this file.
        :param pulumi.Input[_builtins.str] name: The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] path: The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        :param pulumi.Input[_builtins.str] source: An absolute path to a file on the local system. Changing this forces a new resource to be created.
               
               > **Note:** The file specified with `source` can not be empty.
        :param pulumi.Input[_builtins.str] storage_share_id: The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ShareFileState.__new__(_ShareFileState)

        __props__.__dict__["content_disposition"] = content_disposition
        __props__.__dict__["content_encoding"] = content_encoding
        __props__.__dict__["content_length"] = content_length
        __props__.__dict__["content_md5"] = content_md5
        __props__.__dict__["content_type"] = content_type
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["path"] = path
        __props__.__dict__["source"] = source
        __props__.__dict__["storage_share_id"] = storage_share_id
        return ShareFile(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="contentDisposition")
    def content_disposition(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Sets the file’s Content-Disposition header.
        """
        return pulumi.get(self, "content_disposition")

    @_builtins.property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies which content encodings have been applied to the file.
        """
        return pulumi.get(self, "content_encoding")

    @_builtins.property
    @pulumi.getter(name="contentLength")
    def content_length(self) -> pulumi.Output[_builtins.int]:
        """
        The length in bytes of the file content
        """
        return pulumi.get(self, "content_length")

    @_builtins.property
    @pulumi.getter(name="contentMd5")
    def content_md5(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "content_md5")

    @_builtins.property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The content type of the share file. Defaults to `application/octet-stream`.
        """
        return pulumi.get(self, "content_type")

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of metadata to assign to this file.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def path(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `""`.
        """
        return pulumi.get(self, "path")

    @_builtins.property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An absolute path to a file on the local system. Changing this forces a new resource to be created.

        > **Note:** The file specified with `source` can not be empty.
        """
        return pulumi.get(self, "source")

    @_builtins.property
    @pulumi.getter(name="storageShareId")
    def storage_share_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_share_id")

