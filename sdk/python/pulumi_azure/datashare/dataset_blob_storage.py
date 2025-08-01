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

__all__ = ['DatasetBlobStorageArgs', 'DatasetBlobStorage']

@pulumi.input_type
class DatasetBlobStorageArgs:
    def __init__(__self__, *,
                 container_name: pulumi.Input[_builtins.str],
                 data_share_id: pulumi.Input[_builtins.str],
                 storage_account: pulumi.Input['DatasetBlobStorageStorageAccountArgs'],
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 folder_path: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a DatasetBlobStorage resource.
        :param pulumi.Input[_builtins.str] container_name: The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] data_share_id: The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input['DatasetBlobStorageStorageAccountArgs'] storage_account: A `storage_account` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] file_path: The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] folder_path: The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        pulumi.set(__self__, "container_name", container_name)
        pulumi.set(__self__, "data_share_id", data_share_id)
        pulumi.set(__self__, "storage_account", storage_account)
        if file_path is not None:
            pulumi.set(__self__, "file_path", file_path)
        if folder_path is not None:
            pulumi.set(__self__, "folder_path", folder_path)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "container_name", value)

    @_builtins.property
    @pulumi.getter(name="dataShareId")
    def data_share_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "data_share_id")

    @data_share_id.setter
    def data_share_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_share_id", value)

    @_builtins.property
    @pulumi.getter(name="storageAccount")
    def storage_account(self) -> pulumi.Input['DatasetBlobStorageStorageAccountArgs']:
        """
        A `storage_account` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account")

    @storage_account.setter
    def storage_account(self, value: pulumi.Input['DatasetBlobStorageStorageAccountArgs']):
        pulumi.set(self, "storage_account", value)

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "file_path")

    @file_path.setter
    def file_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_path", value)

    @_builtins.property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "folder_path")

    @folder_path.setter
    def folder_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "folder_path", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DatasetBlobStorageState:
    def __init__(__self__, *,
                 container_name: Optional[pulumi.Input[_builtins.str]] = None,
                 data_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 folder_path: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account: Optional[pulumi.Input['DatasetBlobStorageStorageAccountArgs']] = None):
        """
        Input properties used for looking up and filtering DatasetBlobStorage resources.
        :param pulumi.Input[_builtins.str] container_name: The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] data_share_id: The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] display_name: The name of the Data Share Dataset.
        :param pulumi.Input[_builtins.str] file_path: The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] folder_path: The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input['DatasetBlobStorageStorageAccountArgs'] storage_account: A `storage_account` block as defined below. Changing this forces a new resource to be created.
        """
        if container_name is not None:
            pulumi.set(__self__, "container_name", container_name)
        if data_share_id is not None:
            pulumi.set(__self__, "data_share_id", data_share_id)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if file_path is not None:
            pulumi.set(__self__, "file_path", file_path)
        if folder_path is not None:
            pulumi.set(__self__, "folder_path", folder_path)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_account is not None:
            pulumi.set(__self__, "storage_account", storage_account)

    @_builtins.property
    @pulumi.getter(name="containerName")
    def container_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "container_name", value)

    @_builtins.property
    @pulumi.getter(name="dataShareId")
    def data_share_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "data_share_id")

    @data_share_id.setter
    def data_share_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_share_id", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Data Share Dataset.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "file_path")

    @file_path.setter
    def file_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_path", value)

    @_builtins.property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "folder_path")

    @folder_path.setter
    def folder_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "folder_path", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageAccount")
    def storage_account(self) -> Optional[pulumi.Input['DatasetBlobStorageStorageAccountArgs']]:
        """
        A `storage_account` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account")

    @storage_account.setter
    def storage_account(self, value: Optional[pulumi.Input['DatasetBlobStorageStorageAccountArgs']]):
        pulumi.set(self, "storage_account", value)


@pulumi.type_token("azure:datashare/datasetBlobStorage:DatasetBlobStorage")
class DatasetBlobStorage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_name: Optional[pulumi.Input[_builtins.str]] = None,
                 data_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 folder_path: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account: Optional[pulumi.Input[Union['DatasetBlobStorageStorageAccountArgs', 'DatasetBlobStorageStorageAccountArgsDict']]] = None,
                 __props__=None):
        """
        Manages a Data Share Blob Storage Dataset.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure
        import pulumi_azuread as azuread

        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.datashare.Account("example",
            name="example-dsa",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            identity={
                "type": "SystemAssigned",
            })
        example_share = azure.datashare.Share("example",
            name="example_ds",
            account_id=example_account.id,
            kind="CopyBased")
        example_account2 = azure.storage.Account("example",
            name="examplestr",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="RAGRS")
        example_container = azure.storage.Container("example",
            name="example-sc",
            storage_account_name=example_account2.name,
            container_access_type="container")
        example = azuread.get_service_principal_output(display_name=example_account.name)
        example_assignment = azure.authorization.Assignment("example",
            scope=example_account2.id,
            role_definition_name="Storage Blob Data Reader",
            principal_id=example.object_id)
        example_dataset_blob_storage = azure.datashare.DatasetBlobStorage("example",
            name="example-dsbsds-file",
            data_share_id=example_share.id,
            container_name=example_container.name,
            storage_account={
                "name": example_account2.name,
                "resource_group_name": example_account2.resource_group_name,
                "subscription_id": "00000000-0000-0000-0000-000000000000",
            },
            file_path="myfile.txt",
            opts = pulumi.ResourceOptions(depends_on=[example_assignment]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DataShare`: 2019-11-01

        ## Import

        Data Share Blob Storage Datasets can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datashare/datasetBlobStorage:DatasetBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] container_name: The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] data_share_id: The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] file_path: The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] folder_path: The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[Union['DatasetBlobStorageStorageAccountArgs', 'DatasetBlobStorageStorageAccountArgsDict']] storage_account: A `storage_account` block as defined below. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatasetBlobStorageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Data Share Blob Storage Dataset.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure
        import pulumi_azuread as azuread

        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.datashare.Account("example",
            name="example-dsa",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            identity={
                "type": "SystemAssigned",
            })
        example_share = azure.datashare.Share("example",
            name="example_ds",
            account_id=example_account.id,
            kind="CopyBased")
        example_account2 = azure.storage.Account("example",
            name="examplestr",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="RAGRS")
        example_container = azure.storage.Container("example",
            name="example-sc",
            storage_account_name=example_account2.name,
            container_access_type="container")
        example = azuread.get_service_principal_output(display_name=example_account.name)
        example_assignment = azure.authorization.Assignment("example",
            scope=example_account2.id,
            role_definition_name="Storage Blob Data Reader",
            principal_id=example.object_id)
        example_dataset_blob_storage = azure.datashare.DatasetBlobStorage("example",
            name="example-dsbsds-file",
            data_share_id=example_share.id,
            container_name=example_container.name,
            storage_account={
                "name": example_account2.name,
                "resource_group_name": example_account2.resource_group_name,
                "subscription_id": "00000000-0000-0000-0000-000000000000",
            },
            file_path="myfile.txt",
            opts = pulumi.ResourceOptions(depends_on=[example_assignment]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DataShare`: 2019-11-01

        ## Import

        Data Share Blob Storage Datasets can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datashare/datasetBlobStorage:DatasetBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
        ```

        :param str resource_name: The name of the resource.
        :param DatasetBlobStorageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatasetBlobStorageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_name: Optional[pulumi.Input[_builtins.str]] = None,
                 data_share_id: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 folder_path: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account: Optional[pulumi.Input[Union['DatasetBlobStorageStorageAccountArgs', 'DatasetBlobStorageStorageAccountArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatasetBlobStorageArgs.__new__(DatasetBlobStorageArgs)

            if container_name is None and not opts.urn:
                raise TypeError("Missing required property 'container_name'")
            __props__.__dict__["container_name"] = container_name
            if data_share_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_share_id'")
            __props__.__dict__["data_share_id"] = data_share_id
            __props__.__dict__["file_path"] = file_path
            __props__.__dict__["folder_path"] = folder_path
            __props__.__dict__["name"] = name
            if storage_account is None and not opts.urn:
                raise TypeError("Missing required property 'storage_account'")
            __props__.__dict__["storage_account"] = storage_account
            __props__.__dict__["display_name"] = None
        super(DatasetBlobStorage, __self__).__init__(
            'azure:datashare/datasetBlobStorage:DatasetBlobStorage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            container_name: Optional[pulumi.Input[_builtins.str]] = None,
            data_share_id: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            file_path: Optional[pulumi.Input[_builtins.str]] = None,
            folder_path: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            storage_account: Optional[pulumi.Input[Union['DatasetBlobStorageStorageAccountArgs', 'DatasetBlobStorageStorageAccountArgsDict']]] = None) -> 'DatasetBlobStorage':
        """
        Get an existing DatasetBlobStorage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] container_name: The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] data_share_id: The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] display_name: The name of the Data Share Dataset.
        :param pulumi.Input[_builtins.str] file_path: The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] folder_path: The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        :param pulumi.Input[Union['DatasetBlobStorageStorageAccountArgs', 'DatasetBlobStorageStorageAccountArgsDict']] storage_account: A `storage_account` block as defined below. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatasetBlobStorageState.__new__(_DatasetBlobStorageState)

        __props__.__dict__["container_name"] = container_name
        __props__.__dict__["data_share_id"] = data_share_id
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["file_path"] = file_path
        __props__.__dict__["folder_path"] = folder_path
        __props__.__dict__["name"] = name
        __props__.__dict__["storage_account"] = storage_account
        return DatasetBlobStorage(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "container_name")

    @_builtins.property
    @pulumi.getter(name="dataShareId")
    def data_share_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "data_share_id")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Data Share Dataset.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "file_path")

    @_builtins.property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "folder_path")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="storageAccount")
    def storage_account(self) -> pulumi.Output['outputs.DatasetBlobStorageStorageAccount']:
        """
        A `storage_account` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account")

