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
    'GetAuthorizationRuleResult',
    'AwaitableGetAuthorizationRuleResult',
    'get_authorization_rule',
    'get_authorization_rule_output',
]

@pulumi.output_type
class GetAuthorizationRuleResult:
    """
    A collection of values returned by getAuthorizationRule.
    """
    def __init__(__self__, eventhub_name=None, id=None, listen=None, manage=None, name=None, namespace_name=None, primary_connection_string=None, primary_connection_string_alias=None, primary_key=None, resource_group_name=None, secondary_connection_string=None, secondary_connection_string_alias=None, secondary_key=None, send=None):
        if eventhub_name and not isinstance(eventhub_name, str):
            raise TypeError("Expected argument 'eventhub_name' to be a str")
        pulumi.set(__self__, "eventhub_name", eventhub_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if listen and not isinstance(listen, bool):
            raise TypeError("Expected argument 'listen' to be a bool")
        pulumi.set(__self__, "listen", listen)
        if manage and not isinstance(manage, bool):
            raise TypeError("Expected argument 'manage' to be a bool")
        pulumi.set(__self__, "manage", manage)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace_name and not isinstance(namespace_name, str):
            raise TypeError("Expected argument 'namespace_name' to be a str")
        pulumi.set(__self__, "namespace_name", namespace_name)
        if primary_connection_string and not isinstance(primary_connection_string, str):
            raise TypeError("Expected argument 'primary_connection_string' to be a str")
        pulumi.set(__self__, "primary_connection_string", primary_connection_string)
        if primary_connection_string_alias and not isinstance(primary_connection_string_alias, str):
            raise TypeError("Expected argument 'primary_connection_string_alias' to be a str")
        pulumi.set(__self__, "primary_connection_string_alias", primary_connection_string_alias)
        if primary_key and not isinstance(primary_key, str):
            raise TypeError("Expected argument 'primary_key' to be a str")
        pulumi.set(__self__, "primary_key", primary_key)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_connection_string and not isinstance(secondary_connection_string, str):
            raise TypeError("Expected argument 'secondary_connection_string' to be a str")
        pulumi.set(__self__, "secondary_connection_string", secondary_connection_string)
        if secondary_connection_string_alias and not isinstance(secondary_connection_string_alias, str):
            raise TypeError("Expected argument 'secondary_connection_string_alias' to be a str")
        pulumi.set(__self__, "secondary_connection_string_alias", secondary_connection_string_alias)
        if secondary_key and not isinstance(secondary_key, str):
            raise TypeError("Expected argument 'secondary_key' to be a str")
        pulumi.set(__self__, "secondary_key", secondary_key)
        if send and not isinstance(send, bool):
            raise TypeError("Expected argument 'send' to be a bool")
        pulumi.set(__self__, "send", send)

    @_builtins.property
    @pulumi.getter(name="eventhubName")
    def eventhub_name(self) -> _builtins.str:
        return pulumi.get(self, "eventhub_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def listen(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "listen")

    @_builtins.property
    @pulumi.getter
    def manage(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "manage")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> _builtins.str:
        return pulumi.get(self, "namespace_name")

    @_builtins.property
    @pulumi.getter(name="primaryConnectionString")
    def primary_connection_string(self) -> _builtins.str:
        """
        The Primary Connection String for the Event Hubs Authorization Rule.
        """
        return pulumi.get(self, "primary_connection_string")

    @_builtins.property
    @pulumi.getter(name="primaryConnectionStringAlias")
    def primary_connection_string_alias(self) -> _builtins.str:
        """
        The alias of the Primary Connection String for the Event Hubs Authorization Rule.
        """
        return pulumi.get(self, "primary_connection_string_alias")

    @_builtins.property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> _builtins.str:
        """
        The Primary Key for the Event Hubs Authorization Rule.
        """
        return pulumi.get(self, "primary_key")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="secondaryConnectionString")
    def secondary_connection_string(self) -> _builtins.str:
        """
        The Secondary Connection String for the Event Hubs Authorization Rule.
        """
        return pulumi.get(self, "secondary_connection_string")

    @_builtins.property
    @pulumi.getter(name="secondaryConnectionStringAlias")
    def secondary_connection_string_alias(self) -> _builtins.str:
        """
        The alias of the Secondary Connection String for the Event Hubs Authorization Rule.
        """
        return pulumi.get(self, "secondary_connection_string_alias")

    @_builtins.property
    @pulumi.getter(name="secondaryKey")
    def secondary_key(self) -> _builtins.str:
        """
        The Secondary Key for the Event Hubs Authorization Rule.
        """
        return pulumi.get(self, "secondary_key")

    @_builtins.property
    @pulumi.getter
    def send(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "send")


class AwaitableGetAuthorizationRuleResult(GetAuthorizationRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthorizationRuleResult(
            eventhub_name=self.eventhub_name,
            id=self.id,
            listen=self.listen,
            manage=self.manage,
            name=self.name,
            namespace_name=self.namespace_name,
            primary_connection_string=self.primary_connection_string,
            primary_connection_string_alias=self.primary_connection_string_alias,
            primary_key=self.primary_key,
            resource_group_name=self.resource_group_name,
            secondary_connection_string=self.secondary_connection_string,
            secondary_connection_string_alias=self.secondary_connection_string_alias,
            secondary_key=self.secondary_key,
            send=self.send)


def get_authorization_rule(eventhub_name: Optional[_builtins.str] = None,
                           listen: Optional[_builtins.bool] = None,
                           manage: Optional[_builtins.bool] = None,
                           name: Optional[_builtins.str] = None,
                           namespace_name: Optional[_builtins.str] = None,
                           resource_group_name: Optional[_builtins.str] = None,
                           send: Optional[_builtins.bool] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthorizationRuleResult:
    """
    Use this data source to access information about an existing Event Hubs Authorization Rule within an Event Hub.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    test = azure.eventhub.get_authorization_rule(name="test",
        namespace_name=test_azurerm_eventhub_namespace["name"],
        eventhub_name=test_azurerm_eventhub["name"],
        resource_group_name=test_azurerm_resource_group["name"])
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.EventHub`: 2024-01-01


    :param _builtins.str eventhub_name: Specifies the name of the EventHub.
    :param _builtins.str name: Specifies the name of the EventHub Authorization Rule resource. be created.
    :param _builtins.str namespace_name: Specifies the name of the grandparent EventHub Namespace.
    :param _builtins.str resource_group_name: The name of the resource group in which the EventHub Authorization Rule's grandparent Namespace exists.
    """
    __args__ = dict()
    __args__['eventhubName'] = eventhub_name
    __args__['listen'] = listen
    __args__['manage'] = manage
    __args__['name'] = name
    __args__['namespaceName'] = namespace_name
    __args__['resourceGroupName'] = resource_group_name
    __args__['send'] = send
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:eventhub/getAuthorizationRule:getAuthorizationRule', __args__, opts=opts, typ=GetAuthorizationRuleResult).value

    return AwaitableGetAuthorizationRuleResult(
        eventhub_name=pulumi.get(__ret__, 'eventhub_name'),
        id=pulumi.get(__ret__, 'id'),
        listen=pulumi.get(__ret__, 'listen'),
        manage=pulumi.get(__ret__, 'manage'),
        name=pulumi.get(__ret__, 'name'),
        namespace_name=pulumi.get(__ret__, 'namespace_name'),
        primary_connection_string=pulumi.get(__ret__, 'primary_connection_string'),
        primary_connection_string_alias=pulumi.get(__ret__, 'primary_connection_string_alias'),
        primary_key=pulumi.get(__ret__, 'primary_key'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        secondary_connection_string=pulumi.get(__ret__, 'secondary_connection_string'),
        secondary_connection_string_alias=pulumi.get(__ret__, 'secondary_connection_string_alias'),
        secondary_key=pulumi.get(__ret__, 'secondary_key'),
        send=pulumi.get(__ret__, 'send'))
def get_authorization_rule_output(eventhub_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  listen: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                  manage: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                  name: Optional[pulumi.Input[_builtins.str]] = None,
                                  namespace_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  send: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAuthorizationRuleResult]:
    """
    Use this data source to access information about an existing Event Hubs Authorization Rule within an Event Hub.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    test = azure.eventhub.get_authorization_rule(name="test",
        namespace_name=test_azurerm_eventhub_namespace["name"],
        eventhub_name=test_azurerm_eventhub["name"],
        resource_group_name=test_azurerm_resource_group["name"])
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.EventHub`: 2024-01-01


    :param _builtins.str eventhub_name: Specifies the name of the EventHub.
    :param _builtins.str name: Specifies the name of the EventHub Authorization Rule resource. be created.
    :param _builtins.str namespace_name: Specifies the name of the grandparent EventHub Namespace.
    :param _builtins.str resource_group_name: The name of the resource group in which the EventHub Authorization Rule's grandparent Namespace exists.
    """
    __args__ = dict()
    __args__['eventhubName'] = eventhub_name
    __args__['listen'] = listen
    __args__['manage'] = manage
    __args__['name'] = name
    __args__['namespaceName'] = namespace_name
    __args__['resourceGroupName'] = resource_group_name
    __args__['send'] = send
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:eventhub/getAuthorizationRule:getAuthorizationRule', __args__, opts=opts, typ=GetAuthorizationRuleResult)
    return __ret__.apply(lambda __response__: GetAuthorizationRuleResult(
        eventhub_name=pulumi.get(__response__, 'eventhub_name'),
        id=pulumi.get(__response__, 'id'),
        listen=pulumi.get(__response__, 'listen'),
        manage=pulumi.get(__response__, 'manage'),
        name=pulumi.get(__response__, 'name'),
        namespace_name=pulumi.get(__response__, 'namespace_name'),
        primary_connection_string=pulumi.get(__response__, 'primary_connection_string'),
        primary_connection_string_alias=pulumi.get(__response__, 'primary_connection_string_alias'),
        primary_key=pulumi.get(__response__, 'primary_key'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        secondary_connection_string=pulumi.get(__response__, 'secondary_connection_string'),
        secondary_connection_string_alias=pulumi.get(__response__, 'secondary_connection_string_alias'),
        secondary_key=pulumi.get(__response__, 'secondary_key'),
        send=pulumi.get(__response__, 'send')))
