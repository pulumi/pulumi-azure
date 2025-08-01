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
    'GetPolicyVMResult',
    'AwaitableGetPolicyVMResult',
    'get_policy_vm',
    'get_policy_vm_output',
]

@pulumi.output_type
class GetPolicyVMResult:
    """
    A collection of values returned by getPolicyVM.
    """
    def __init__(__self__, id=None, name=None, recovery_vault_name=None, resource_group_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if recovery_vault_name and not isinstance(recovery_vault_name, str):
            raise TypeError("Expected argument 'recovery_vault_name' to be a str")
        pulumi.set(__self__, "recovery_vault_name", recovery_vault_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="recoveryVaultName")
    def recovery_vault_name(self) -> _builtins.str:
        return pulumi.get(self, "recovery_vault_name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")


class AwaitableGetPolicyVMResult(GetPolicyVMResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyVMResult(
            id=self.id,
            name=self.name,
            recovery_vault_name=self.recovery_vault_name,
            resource_group_name=self.resource_group_name)


def get_policy_vm(name: Optional[_builtins.str] = None,
                  recovery_vault_name: Optional[_builtins.str] = None,
                  resource_group_name: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicyVMResult:
    """
    Use this data source to access information about an existing VM Backup Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    policy = azure.backup.get_policy_vm(name="policy",
        recovery_vault_name="recovery_vault",
        resource_group_name="resource_group")
    ```


    :param _builtins.str name: Specifies the name of the VM Backup Policy.
    :param _builtins.str recovery_vault_name: Specifies the name of the Recovery Services Vault.
    :param _builtins.str resource_group_name: The name of the resource group in which the VM Backup Policy resides.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['recoveryVaultName'] = recovery_vault_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:backup/getPolicyVM:getPolicyVM', __args__, opts=opts, typ=GetPolicyVMResult).value

    return AwaitableGetPolicyVMResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        recovery_vault_name=pulumi.get(__ret__, 'recovery_vault_name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'))
def get_policy_vm_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                         recovery_vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                         resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPolicyVMResult]:
    """
    Use this data source to access information about an existing VM Backup Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    policy = azure.backup.get_policy_vm(name="policy",
        recovery_vault_name="recovery_vault",
        resource_group_name="resource_group")
    ```


    :param _builtins.str name: Specifies the name of the VM Backup Policy.
    :param _builtins.str recovery_vault_name: Specifies the name of the Recovery Services Vault.
    :param _builtins.str resource_group_name: The name of the resource group in which the VM Backup Policy resides.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['recoveryVaultName'] = recovery_vault_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:backup/getPolicyVM:getPolicyVM', __args__, opts=opts, typ=GetPolicyVMResult)
    return __ret__.apply(lambda __response__: GetPolicyVMResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        recovery_vault_name=pulumi.get(__response__, 'recovery_vault_name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name')))
