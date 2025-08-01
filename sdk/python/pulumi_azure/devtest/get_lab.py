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

__all__ = [
    'GetLabResult',
    'AwaitableGetLabResult',
    'get_lab',
    'get_lab_output',
]

@pulumi.output_type
class GetLabResult:
    """
    A collection of values returned by getLab.
    """
    def __init__(__self__, artifacts_storage_account_id=None, default_premium_storage_account_id=None, default_storage_account_id=None, id=None, key_vault_id=None, location=None, name=None, premium_data_disk_storage_account_id=None, resource_group_name=None, storage_type=None, tags=None, unique_identifier=None):
        if artifacts_storage_account_id and not isinstance(artifacts_storage_account_id, str):
            raise TypeError("Expected argument 'artifacts_storage_account_id' to be a str")
        pulumi.set(__self__, "artifacts_storage_account_id", artifacts_storage_account_id)
        if default_premium_storage_account_id and not isinstance(default_premium_storage_account_id, str):
            raise TypeError("Expected argument 'default_premium_storage_account_id' to be a str")
        pulumi.set(__self__, "default_premium_storage_account_id", default_premium_storage_account_id)
        if default_storage_account_id and not isinstance(default_storage_account_id, str):
            raise TypeError("Expected argument 'default_storage_account_id' to be a str")
        pulumi.set(__self__, "default_storage_account_id", default_storage_account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_vault_id and not isinstance(key_vault_id, str):
            raise TypeError("Expected argument 'key_vault_id' to be a str")
        pulumi.set(__self__, "key_vault_id", key_vault_id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if premium_data_disk_storage_account_id and not isinstance(premium_data_disk_storage_account_id, str):
            raise TypeError("Expected argument 'premium_data_disk_storage_account_id' to be a str")
        pulumi.set(__self__, "premium_data_disk_storage_account_id", premium_data_disk_storage_account_id)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if storage_type and not isinstance(storage_type, str):
            raise TypeError("Expected argument 'storage_type' to be a str")
        pulumi.set(__self__, "storage_type", storage_type)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if unique_identifier and not isinstance(unique_identifier, str):
            raise TypeError("Expected argument 'unique_identifier' to be a str")
        pulumi.set(__self__, "unique_identifier", unique_identifier)

    @_builtins.property
    @pulumi.getter(name="artifactsStorageAccountId")
    def artifacts_storage_account_id(self) -> _builtins.str:
        """
        The ID of the Storage Account used for Artifact Storage.
        """
        return pulumi.get(self, "artifacts_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="defaultPremiumStorageAccountId")
    def default_premium_storage_account_id(self) -> _builtins.str:
        """
        The ID of the Default Premium Storage Account for this Dev Test Lab.
        """
        return pulumi.get(self, "default_premium_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="defaultStorageAccountId")
    def default_storage_account_id(self) -> _builtins.str:
        """
        The ID of the Default Storage Account for this Dev Test Lab.
        """
        return pulumi.get(self, "default_storage_account_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="keyVaultId")
    def key_vault_id(self) -> _builtins.str:
        """
        The ID of the Key used for this Dev Test Lab.
        """
        return pulumi.get(self, "key_vault_id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure location where the Dev Test Lab exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="premiumDataDiskStorageAccountId")
    def premium_data_disk_storage_account_id(self) -> _builtins.str:
        """
        The ID of the Storage Account used for Storage of Premium Data Disk.
        """
        return pulumi.get(self, "premium_data_disk_storage_account_id")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> _builtins.str:
        """
        The type of storage used by the Dev Test Lab.
        """
        return pulumi.get(self, "storage_type")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="uniqueIdentifier")
    def unique_identifier(self) -> _builtins.str:
        """
        The unique immutable identifier of the Dev Test Lab.
        """
        return pulumi.get(self, "unique_identifier")


class AwaitableGetLabResult(GetLabResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLabResult(
            artifacts_storage_account_id=self.artifacts_storage_account_id,
            default_premium_storage_account_id=self.default_premium_storage_account_id,
            default_storage_account_id=self.default_storage_account_id,
            id=self.id,
            key_vault_id=self.key_vault_id,
            location=self.location,
            name=self.name,
            premium_data_disk_storage_account_id=self.premium_data_disk_storage_account_id,
            resource_group_name=self.resource_group_name,
            storage_type=self.storage_type,
            tags=self.tags,
            unique_identifier=self.unique_identifier)


def get_lab(name: Optional[_builtins.str] = None,
            resource_group_name: Optional[_builtins.str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLabResult:
    """
    Use this data source to access information about an existing Dev Test Lab.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.devtest.get_lab(name="example-lab",
        resource_group_name="example-resources")
    pulumi.export("uniqueIdentifier", example.unique_identifier)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.DevTestLab`: 2018-09-15


    :param _builtins.str name: The name of the Dev Test Lab.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the Dev Test Lab exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:devtest/getLab:getLab', __args__, opts=opts, typ=GetLabResult).value

    return AwaitableGetLabResult(
        artifacts_storage_account_id=pulumi.get(__ret__, 'artifacts_storage_account_id'),
        default_premium_storage_account_id=pulumi.get(__ret__, 'default_premium_storage_account_id'),
        default_storage_account_id=pulumi.get(__ret__, 'default_storage_account_id'),
        id=pulumi.get(__ret__, 'id'),
        key_vault_id=pulumi.get(__ret__, 'key_vault_id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        premium_data_disk_storage_account_id=pulumi.get(__ret__, 'premium_data_disk_storage_account_id'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        storage_type=pulumi.get(__ret__, 'storage_type'),
        tags=pulumi.get(__ret__, 'tags'),
        unique_identifier=pulumi.get(__ret__, 'unique_identifier'))
def get_lab_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                   resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLabResult]:
    """
    Use this data source to access information about an existing Dev Test Lab.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.devtest.get_lab(name="example-lab",
        resource_group_name="example-resources")
    pulumi.export("uniqueIdentifier", example.unique_identifier)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.DevTestLab`: 2018-09-15


    :param _builtins.str name: The name of the Dev Test Lab.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the Dev Test Lab exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:devtest/getLab:getLab', __args__, opts=opts, typ=GetLabResult)
    return __ret__.apply(lambda __response__: GetLabResult(
        artifacts_storage_account_id=pulumi.get(__response__, 'artifacts_storage_account_id'),
        default_premium_storage_account_id=pulumi.get(__response__, 'default_premium_storage_account_id'),
        default_storage_account_id=pulumi.get(__response__, 'default_storage_account_id'),
        id=pulumi.get(__response__, 'id'),
        key_vault_id=pulumi.get(__response__, 'key_vault_id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        premium_data_disk_storage_account_id=pulumi.get(__response__, 'premium_data_disk_storage_account_id'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        storage_type=pulumi.get(__response__, 'storage_type'),
        tags=pulumi.get(__response__, 'tags'),
        unique_identifier=pulumi.get(__response__, 'unique_identifier')))
