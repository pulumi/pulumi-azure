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
    'GetFirewallPolicyResult',
    'AwaitableGetFirewallPolicyResult',
    'get_firewall_policy',
    'get_firewall_policy_output',
]

@pulumi.output_type
class GetFirewallPolicyResult:
    """
    A collection of values returned by getFirewallPolicy.
    """
    def __init__(__self__, id=None, location=None, name=None, resource_group_name=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")


class AwaitableGetFirewallPolicyResult(GetFirewallPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFirewallPolicyResult(
            id=self.id,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            tags=self.tags)


def get_firewall_policy(name: Optional[_builtins.str] = None,
                        resource_group_name: Optional[_builtins.str] = None,
                        tags: Optional[Mapping[str, _builtins.str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFirewallPolicyResult:
    """
    Use this data source to access information about an existing Web Application Firewall Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.waf.get_firewall_policy(resource_group_name="existing",
        name="existing")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-05-01


    :param _builtins.str name: The name of the Web Application Firewall Policy
    :param _builtins.str resource_group_name: The name of the Resource Group where the Web Application Firewall Policy exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:waf/getFirewallPolicy:getFirewallPolicy', __args__, opts=opts, typ=GetFirewallPolicyResult).value

    return AwaitableGetFirewallPolicyResult(
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'))
def get_firewall_policy_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                               resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFirewallPolicyResult]:
    """
    Use this data source to access information about an existing Web Application Firewall Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.waf.get_firewall_policy(resource_group_name="existing",
        name="existing")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-05-01


    :param _builtins.str name: The name of the Web Application Firewall Policy
    :param _builtins.str resource_group_name: The name of the Resource Group where the Web Application Firewall Policy exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:waf/getFirewallPolicy:getFirewallPolicy', __args__, opts=opts, typ=GetFirewallPolicyResult)
    return __ret__.apply(lambda __response__: GetFirewallPolicyResult(
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags')))
