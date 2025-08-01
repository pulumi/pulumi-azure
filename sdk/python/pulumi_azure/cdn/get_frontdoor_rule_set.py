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
    'GetFrontdoorRuleSetResult',
    'AwaitableGetFrontdoorRuleSetResult',
    'get_frontdoor_rule_set',
    'get_frontdoor_rule_set_output',
]

@pulumi.output_type
class GetFrontdoorRuleSetResult:
    """
    A collection of values returned by getFrontdoorRuleSet.
    """
    def __init__(__self__, cdn_frontdoor_profile_id=None, id=None, name=None, profile_name=None, resource_group_name=None):
        if cdn_frontdoor_profile_id and not isinstance(cdn_frontdoor_profile_id, str):
            raise TypeError("Expected argument 'cdn_frontdoor_profile_id' to be a str")
        pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if profile_name and not isinstance(profile_name, str):
            raise TypeError("Expected argument 'profile_name' to be a str")
        pulumi.set(__self__, "profile_name", profile_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @_builtins.property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> _builtins.str:
        """
        The ID of the Front Door Profile within which this Front Door Rule Set exists.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

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
    @pulumi.getter(name="profileName")
    def profile_name(self) -> _builtins.str:
        return pulumi.get(self, "profile_name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")


class AwaitableGetFrontdoorRuleSetResult(GetFrontdoorRuleSetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFrontdoorRuleSetResult(
            cdn_frontdoor_profile_id=self.cdn_frontdoor_profile_id,
            id=self.id,
            name=self.name,
            profile_name=self.profile_name,
            resource_group_name=self.resource_group_name)


def get_frontdoor_rule_set(name: Optional[_builtins.str] = None,
                           profile_name: Optional[_builtins.str] = None,
                           resource_group_name: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFrontdoorRuleSetResult:
    """
    Use this data source to access information about an existing Front Door (standard/premium) Rule Set.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.cdn.get_frontdoor_rule_set(name="existing-rule-set",
        profile_name="existing-profile",
        resource_group_name="existing-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Cdn`: 2024-02-01


    :param _builtins.str name: Specifies the name of the Front Door Rule Set to retrieve.
    :param _builtins.str profile_name: Specifies the name of the Front Door Profile where this Front Door Rule Set exists.
    :param _builtins.str resource_group_name: Specifies the name of the Resource Group where the Front Door Profile exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['profileName'] = profile_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:cdn/getFrontdoorRuleSet:getFrontdoorRuleSet', __args__, opts=opts, typ=GetFrontdoorRuleSetResult).value

    return AwaitableGetFrontdoorRuleSetResult(
        cdn_frontdoor_profile_id=pulumi.get(__ret__, 'cdn_frontdoor_profile_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        profile_name=pulumi.get(__ret__, 'profile_name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'))
def get_frontdoor_rule_set_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                  profile_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFrontdoorRuleSetResult]:
    """
    Use this data source to access information about an existing Front Door (standard/premium) Rule Set.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.cdn.get_frontdoor_rule_set(name="existing-rule-set",
        profile_name="existing-profile",
        resource_group_name="existing-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Cdn`: 2024-02-01


    :param _builtins.str name: Specifies the name of the Front Door Rule Set to retrieve.
    :param _builtins.str profile_name: Specifies the name of the Front Door Profile where this Front Door Rule Set exists.
    :param _builtins.str resource_group_name: Specifies the name of the Resource Group where the Front Door Profile exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['profileName'] = profile_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:cdn/getFrontdoorRuleSet:getFrontdoorRuleSet', __args__, opts=opts, typ=GetFrontdoorRuleSetResult)
    return __ret__.apply(lambda __response__: GetFrontdoorRuleSetResult(
        cdn_frontdoor_profile_id=pulumi.get(__response__, 'cdn_frontdoor_profile_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        profile_name=pulumi.get(__response__, 'profile_name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name')))
