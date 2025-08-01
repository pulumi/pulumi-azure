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
    'GetClientConfigResult',
    'AwaitableGetClientConfigResult',
    'get_client_config',
    'get_client_config_output',
]

@pulumi.output_type
class GetClientConfigResult:
    """
    A collection of values returned by getClientConfig.
    """
    def __init__(__self__, client_id=None, id=None, object_id=None, subscription_id=None, tenant_id=None):
        if client_id and not isinstance(client_id, str):
            raise TypeError("Expected argument 'client_id' to be a str")
        pulumi.set(__self__, "client_id", client_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if object_id and not isinstance(object_id, str):
            raise TypeError("Expected argument 'object_id' to be a str")
        pulumi.set(__self__, "object_id", object_id)
        if subscription_id and not isinstance(subscription_id, str):
            raise TypeError("Expected argument 'subscription_id' to be a str")
        pulumi.set(__self__, "subscription_id", subscription_id)
        if tenant_id and not isinstance(tenant_id, str):
            raise TypeError("Expected argument 'tenant_id' to be a str")
        pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> _builtins.str:
        """
        is set to the Azure Client ID (Application Object ID).
        """
        return pulumi.get(self, "client_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="objectId")
    def object_id(self) -> _builtins.str:
        """
        is set to the Azure Object ID.
        """
        return pulumi.get(self, "object_id")

    @_builtins.property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> _builtins.str:
        """
        is set to the Azure Subscription ID.
        """
        return pulumi.get(self, "subscription_id")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> _builtins.str:
        """
        is set to the Azure Tenant ID.
        """
        return pulumi.get(self, "tenant_id")


class AwaitableGetClientConfigResult(GetClientConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClientConfigResult(
            client_id=self.client_id,
            id=self.id,
            object_id=self.object_id,
            subscription_id=self.subscription_id,
            tenant_id=self.tenant_id)


def get_client_config(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClientConfigResult:
    """
    Use this data source to access the configuration of the AzureRM provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    current = azure.core.get_client_config()
    pulumi.export("accountId", current.client_id)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:core/getClientConfig:getClientConfig', __args__, opts=opts, typ=GetClientConfigResult).value

    return AwaitableGetClientConfigResult(
        client_id=pulumi.get(__ret__, 'client_id'),
        id=pulumi.get(__ret__, 'id'),
        object_id=pulumi.get(__ret__, 'object_id'),
        subscription_id=pulumi.get(__ret__, 'subscription_id'),
        tenant_id=pulumi.get(__ret__, 'tenant_id'))
def get_client_config_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetClientConfigResult]:
    """
    Use this data source to access the configuration of the AzureRM provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    current = azure.core.get_client_config()
    pulumi.export("accountId", current.client_id)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:core/getClientConfig:getClientConfig', __args__, opts=opts, typ=GetClientConfigResult)
    return __ret__.apply(lambda __response__: GetClientConfigResult(
        client_id=pulumi.get(__response__, 'client_id'),
        id=pulumi.get(__response__, 'id'),
        object_id=pulumi.get(__response__, 'object_id'),
        subscription_id=pulumi.get(__response__, 'subscription_id'),
        tenant_id=pulumi.get(__response__, 'tenant_id')))
