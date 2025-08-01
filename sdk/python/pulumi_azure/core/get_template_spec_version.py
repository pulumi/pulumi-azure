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
    'GetTemplateSpecVersionResult',
    'AwaitableGetTemplateSpecVersionResult',
    'get_template_spec_version',
    'get_template_spec_version_output',
]

@pulumi.output_type
class GetTemplateSpecVersionResult:
    """
    A collection of values returned by getTemplateSpecVersion.
    """
    def __init__(__self__, id=None, name=None, resource_group_name=None, tags=None, template_body=None, version=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if template_body and not isinstance(template_body, str):
            raise TypeError("Expected argument 'template_body' to be a str")
        pulumi.set(__self__, "template_body", template_body)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

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
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the Template.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="templateBody")
    def template_body(self) -> _builtins.str:
        """
        The ARM Template body of the Template Spec Version.
        """
        return pulumi.get(self, "template_body")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.str:
        return pulumi.get(self, "version")


class AwaitableGetTemplateSpecVersionResult(GetTemplateSpecVersionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTemplateSpecVersionResult(
            id=self.id,
            name=self.name,
            resource_group_name=self.resource_group_name,
            tags=self.tags,
            template_body=self.template_body,
            version=self.version)


def get_template_spec_version(name: Optional[_builtins.str] = None,
                              resource_group_name: Optional[_builtins.str] = None,
                              version: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTemplateSpecVersionResult:
    """
    Use this data source to access information about an existing Template Spec Version.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.core.get_template_spec_version(name="exampleTemplateSpec",
        resource_group_name="MyResourceGroup",
        version="v1.0.4")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Resources`: 2022-02-01


    :param _builtins.str name: The name of this Template Spec.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Template Spec exists.
    :param _builtins.str version: The Version Name of the Template Spec.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:core/getTemplateSpecVersion:getTemplateSpecVersion', __args__, opts=opts, typ=GetTemplateSpecVersionResult).value

    return AwaitableGetTemplateSpecVersionResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'),
        template_body=pulumi.get(__ret__, 'template_body'),
        version=pulumi.get(__ret__, 'version'))
def get_template_spec_version_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                     resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                     version: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTemplateSpecVersionResult]:
    """
    Use this data source to access information about an existing Template Spec Version.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.core.get_template_spec_version(name="exampleTemplateSpec",
        resource_group_name="MyResourceGroup",
        version="v1.0.4")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Resources`: 2022-02-01


    :param _builtins.str name: The name of this Template Spec.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Template Spec exists.
    :param _builtins.str version: The Version Name of the Template Spec.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['version'] = version
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:core/getTemplateSpecVersion:getTemplateSpecVersion', __args__, opts=opts, typ=GetTemplateSpecVersionResult)
    return __ret__.apply(lambda __response__: GetTemplateSpecVersionResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags'),
        template_body=pulumi.get(__response__, 'template_body'),
        version=pulumi.get(__response__, 'version')))
