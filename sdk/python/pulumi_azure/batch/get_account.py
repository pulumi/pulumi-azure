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

__all__ = [
    'GetAccountResult',
    'AwaitableGetAccountResult',
    'get_account',
    'get_account_output',
]

@pulumi.output_type
class GetAccountResult:
    """
    A collection of values returned by getAccount.
    """
    def __init__(__self__, account_endpoint=None, encryptions=None, id=None, key_vault_references=None, location=None, name=None, pool_allocation_mode=None, primary_access_key=None, resource_group_name=None, secondary_access_key=None, storage_account_id=None, tags=None):
        if account_endpoint and not isinstance(account_endpoint, str):
            raise TypeError("Expected argument 'account_endpoint' to be a str")
        pulumi.set(__self__, "account_endpoint", account_endpoint)
        if encryptions and not isinstance(encryptions, list):
            raise TypeError("Expected argument 'encryptions' to be a list")
        pulumi.set(__self__, "encryptions", encryptions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_vault_references and not isinstance(key_vault_references, list):
            raise TypeError("Expected argument 'key_vault_references' to be a list")
        pulumi.set(__self__, "key_vault_references", key_vault_references)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if pool_allocation_mode and not isinstance(pool_allocation_mode, str):
            raise TypeError("Expected argument 'pool_allocation_mode' to be a str")
        pulumi.set(__self__, "pool_allocation_mode", pool_allocation_mode)
        if primary_access_key and not isinstance(primary_access_key, str):
            raise TypeError("Expected argument 'primary_access_key' to be a str")
        pulumi.set(__self__, "primary_access_key", primary_access_key)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_access_key and not isinstance(secondary_access_key, str):
            raise TypeError("Expected argument 'secondary_access_key' to be a str")
        pulumi.set(__self__, "secondary_access_key", secondary_access_key)
        if storage_account_id and not isinstance(storage_account_id, str):
            raise TypeError("Expected argument 'storage_account_id' to be a str")
        pulumi.set(__self__, "storage_account_id", storage_account_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="accountEndpoint")
    def account_endpoint(self) -> _builtins.str:
        """
        The account endpoint used to interact with the Batch service.
        """
        return pulumi.get(self, "account_endpoint")

    @_builtins.property
    @pulumi.getter
    def encryptions(self) -> Sequence['outputs.GetAccountEncryptionResult']:
        """
        The `encryption` block that describes the Azure KeyVault key reference used to encrypt data for the Azure Batch account.
        """
        return pulumi.get(self, "encryptions")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="keyVaultReferences")
    def key_vault_references(self) -> Sequence['outputs.GetAccountKeyVaultReferenceResult']:
        """
        The `key_vault_reference` block that describes the Azure KeyVault reference to use when deploying the Azure Batch account using the `UserSubscription` pool allocation mode.
        """
        return pulumi.get(self, "key_vault_references")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure Region in which this Batch account exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The Batch account name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="poolAllocationMode")
    def pool_allocation_mode(self) -> _builtins.str:
        """
        The pool allocation mode configured for this Batch account.
        """
        return pulumi.get(self, "pool_allocation_mode")

    @_builtins.property
    @pulumi.getter(name="primaryAccessKey")
    def primary_access_key(self) -> _builtins.str:
        """
        The Batch account primary access key.
        """
        return pulumi.get(self, "primary_access_key")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="secondaryAccessKey")
    def secondary_access_key(self) -> _builtins.str:
        """
        The Batch account secondary access key.
        """
        return pulumi.get(self, "secondary_access_key")

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> _builtins.str:
        """
        The ID of the Storage Account used for this Batch account.
        """
        return pulumi.get(self, "storage_account_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A map of tags assigned to the Batch account.
        """
        return pulumi.get(self, "tags")


class AwaitableGetAccountResult(GetAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountResult(
            account_endpoint=self.account_endpoint,
            encryptions=self.encryptions,
            id=self.id,
            key_vault_references=self.key_vault_references,
            location=self.location,
            name=self.name,
            pool_allocation_mode=self.pool_allocation_mode,
            primary_access_key=self.primary_access_key,
            resource_group_name=self.resource_group_name,
            secondary_access_key=self.secondary_access_key,
            storage_account_id=self.storage_account_id,
            tags=self.tags)


def get_account(name: Optional[_builtins.str] = None,
                resource_group_name: Optional[_builtins.str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountResult:
    """
    Use this data source to access information about an existing Batch Account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.batch.get_account(name="testbatchaccount",
        resource_group_name="test")
    pulumi.export("poolAllocationMode", example.pool_allocation_mode)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Batch`: 2024-07-01


    :param _builtins.str name: The name of the Batch account.
    :param _builtins.str resource_group_name: The Name of the Resource Group where this Batch account exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:batch/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult).value

    return AwaitableGetAccountResult(
        account_endpoint=pulumi.get(__ret__, 'account_endpoint'),
        encryptions=pulumi.get(__ret__, 'encryptions'),
        id=pulumi.get(__ret__, 'id'),
        key_vault_references=pulumi.get(__ret__, 'key_vault_references'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        pool_allocation_mode=pulumi.get(__ret__, 'pool_allocation_mode'),
        primary_access_key=pulumi.get(__ret__, 'primary_access_key'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__ret__, 'secondary_access_key'),
        storage_account_id=pulumi.get(__ret__, 'storage_account_id'),
        tags=pulumi.get(__ret__, 'tags'))
def get_account_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                       resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountResult]:
    """
    Use this data source to access information about an existing Batch Account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.batch.get_account(name="testbatchaccount",
        resource_group_name="test")
    pulumi.export("poolAllocationMode", example.pool_allocation_mode)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Batch`: 2024-07-01


    :param _builtins.str name: The name of the Batch account.
    :param _builtins.str resource_group_name: The Name of the Resource Group where this Batch account exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:batch/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult)
    return __ret__.apply(lambda __response__: GetAccountResult(
        account_endpoint=pulumi.get(__response__, 'account_endpoint'),
        encryptions=pulumi.get(__response__, 'encryptions'),
        id=pulumi.get(__response__, 'id'),
        key_vault_references=pulumi.get(__response__, 'key_vault_references'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        pool_allocation_mode=pulumi.get(__response__, 'pool_allocation_mode'),
        primary_access_key=pulumi.get(__response__, 'primary_access_key'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__response__, 'secondary_access_key'),
        storage_account_id=pulumi.get(__response__, 'storage_account_id'),
        tags=pulumi.get(__response__, 'tags')))
