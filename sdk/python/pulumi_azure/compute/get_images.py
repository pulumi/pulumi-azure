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
    'GetImagesResult',
    'AwaitableGetImagesResult',
    'get_images',
    'get_images_output',
]

@pulumi.output_type
class GetImagesResult:
    """
    A collection of values returned by getImages.
    """
    def __init__(__self__, id=None, images=None, resource_group_name=None, tags_filter=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if images and not isinstance(images, list):
            raise TypeError("Expected argument 'images' to be a list")
        pulumi.set(__self__, "images", images)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags_filter and not isinstance(tags_filter, dict):
            raise TypeError("Expected argument 'tags_filter' to be a dict")
        pulumi.set(__self__, "tags_filter", tags_filter)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def images(self) -> Sequence['outputs.GetImagesImageResult']:
        """
        One or more `images` blocks as defined below:
        """
        return pulumi.get(self, "images")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="tagsFilter")
    def tags_filter(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags_filter")


class AwaitableGetImagesResult(GetImagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImagesResult(
            id=self.id,
            images=self.images,
            resource_group_name=self.resource_group_name,
            tags_filter=self.tags_filter)


def get_images(resource_group_name: Optional[_builtins.str] = None,
               tags_filter: Optional[Mapping[str, _builtins.str]] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImagesResult:
    """
    Use this data source to access information about existing Images within a Resource Group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.compute.get_images(resource_group_name="example-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Compute`: 2022-03-01


    :param _builtins.str resource_group_name: The name of the Resource Group in which the Image exists.
    :param Mapping[str, _builtins.str] tags_filter: A mapping of tags to filter the list of images against.
    """
    __args__ = dict()
    __args__['resourceGroupName'] = resource_group_name
    __args__['tagsFilter'] = tags_filter
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:compute/getImages:getImages', __args__, opts=opts, typ=GetImagesResult).value

    return AwaitableGetImagesResult(
        id=pulumi.get(__ret__, 'id'),
        images=pulumi.get(__ret__, 'images'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags_filter=pulumi.get(__ret__, 'tags_filter'))
def get_images_output(resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                      tags_filter: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetImagesResult]:
    """
    Use this data source to access information about existing Images within a Resource Group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.compute.get_images(resource_group_name="example-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Compute`: 2022-03-01


    :param _builtins.str resource_group_name: The name of the Resource Group in which the Image exists.
    :param Mapping[str, _builtins.str] tags_filter: A mapping of tags to filter the list of images against.
    """
    __args__ = dict()
    __args__['resourceGroupName'] = resource_group_name
    __args__['tagsFilter'] = tags_filter
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:compute/getImages:getImages', __args__, opts=opts, typ=GetImagesResult)
    return __ret__.apply(lambda __response__: GetImagesResult(
        id=pulumi.get(__response__, 'id'),
        images=pulumi.get(__response__, 'images'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags_filter=pulumi.get(__response__, 'tags_filter')))
