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
    'GetPolicyResult',
    'AwaitableGetPolicyResult',
    'get_policy',
    'get_policy_output',
]

@pulumi.output_type
class GetPolicyResult:
    """
    A collection of values returned by getPolicy.
    """
    def __init__(__self__, id=None, rules=None, storage_account_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if storage_account_id and not isinstance(storage_account_id, str):
            raise TypeError("Expected argument 'storage_account_id' to be a str")
        pulumi.set(__self__, "storage_account_id", storage_account_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetPolicyRuleResult']:
        """
        supports the following:
        """
        return pulumi.get(self, "rules")

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> _builtins.str:
        return pulumi.get(self, "storage_account_id")


class AwaitableGetPolicyResult(GetPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyResult(
            id=self.id,
            rules=self.rules,
            storage_account_id=self.storage_account_id)


def get_policy(storage_account_id: Optional[_builtins.str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicyResult:
    """
    Use this data source to access information about an existing Storage Management Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.storage.get_account(name="storageaccountname",
        resource_group_name="resourcegroupname")
    example_get_policy = azure.storage.get_policy(storage_account_id=example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Storage`: 2023-05-01


    :param _builtins.str storage_account_id: Specifies the id of the storage account to retrieve the management policy for.
    """
    __args__ = dict()
    __args__['storageAccountId'] = storage_account_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:storage/getPolicy:getPolicy', __args__, opts=opts, typ=GetPolicyResult).value

    return AwaitableGetPolicyResult(
        id=pulumi.get(__ret__, 'id'),
        rules=pulumi.get(__ret__, 'rules'),
        storage_account_id=pulumi.get(__ret__, 'storage_account_id'))
def get_policy_output(storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPolicyResult]:
    """
    Use this data source to access information about an existing Storage Management Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.storage.get_account(name="storageaccountname",
        resource_group_name="resourcegroupname")
    example_get_policy = azure.storage.get_policy(storage_account_id=example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Storage`: 2023-05-01


    :param _builtins.str storage_account_id: Specifies the id of the storage account to retrieve the management policy for.
    """
    __args__ = dict()
    __args__['storageAccountId'] = storage_account_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:storage/getPolicy:getPolicy', __args__, opts=opts, typ=GetPolicyResult)
    return __ret__.apply(lambda __response__: GetPolicyResult(
        id=pulumi.get(__response__, 'id'),
        rules=pulumi.get(__response__, 'rules'),
        storage_account_id=pulumi.get(__response__, 'storage_account_id')))
