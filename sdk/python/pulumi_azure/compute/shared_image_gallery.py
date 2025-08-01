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
from ._inputs import *

__all__ = ['SharedImageGalleryArgs', 'SharedImageGallery']

@pulumi.input_type
class SharedImageGalleryArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 sharing: Optional[pulumi.Input['SharedImageGallerySharingArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a SharedImageGallery resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: A description for this Shared Image Gallery.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input['SharedImageGallerySharingArgs'] sharing: A `sharing` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Shared Image Gallery.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sharing is not None:
            pulumi.set(__self__, "sharing", sharing)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description for this Shared Image Gallery.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def sharing(self) -> Optional[pulumi.Input['SharedImageGallerySharingArgs']]:
        """
        A `sharing` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "sharing")

    @sharing.setter
    def sharing(self, value: Optional[pulumi.Input['SharedImageGallerySharingArgs']]):
        pulumi.set(self, "sharing", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the Shared Image Gallery.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SharedImageGalleryState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sharing: Optional[pulumi.Input['SharedImageGallerySharingArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 unique_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SharedImageGallery resources.
        :param pulumi.Input[_builtins.str] description: A description for this Shared Image Gallery.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input['SharedImageGallerySharingArgs'] sharing: A `sharing` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Shared Image Gallery.
        :param pulumi.Input[_builtins.str] unique_name: The Unique Name for this Shared Image Gallery.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if sharing is not None:
            pulumi.set(__self__, "sharing", sharing)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if unique_name is not None:
            pulumi.set(__self__, "unique_name", unique_name)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description for this Shared Image Gallery.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def sharing(self) -> Optional[pulumi.Input['SharedImageGallerySharingArgs']]:
        """
        A `sharing` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "sharing")

    @sharing.setter
    def sharing(self, value: Optional[pulumi.Input['SharedImageGallerySharingArgs']]):
        pulumi.set(self, "sharing", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the Shared Image Gallery.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="uniqueName")
    def unique_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Unique Name for this Shared Image Gallery.
        """
        return pulumi.get(self, "unique_name")

    @unique_name.setter
    def unique_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "unique_name", value)


@pulumi.type_token("azure:compute/sharedImageGallery:SharedImageGallery")
class SharedImageGallery(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sharing: Optional[pulumi.Input[Union['SharedImageGallerySharingArgs', 'SharedImageGallerySharingArgsDict']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Shared Image Gallery.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_shared_image_gallery = azure.compute.SharedImageGallery("example",
            name="example_image_gallery",
            resource_group_name=example.name,
            location=example.location,
            description="Shared images and things.",
            tags={
                "Hello": "There",
                "World": "Example",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2022-03-03

        ## Import

        Shared Image Galleries can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/sharedImageGallery:SharedImageGallery gallery1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/galleries/gallery1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description for this Shared Image Gallery.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['SharedImageGallerySharingArgs', 'SharedImageGallerySharingArgsDict']] sharing: A `sharing` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Shared Image Gallery.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SharedImageGalleryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Shared Image Gallery.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_shared_image_gallery = azure.compute.SharedImageGallery("example",
            name="example_image_gallery",
            resource_group_name=example.name,
            location=example.location,
            description="Shared images and things.",
            tags={
                "Hello": "There",
                "World": "Example",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2022-03-03

        ## Import

        Shared Image Galleries can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/sharedImageGallery:SharedImageGallery gallery1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/galleries/gallery1
        ```

        :param str resource_name: The name of the resource.
        :param SharedImageGalleryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SharedImageGalleryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sharing: Optional[pulumi.Input[Union['SharedImageGallerySharingArgs', 'SharedImageGallerySharingArgsDict']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SharedImageGalleryArgs.__new__(SharedImageGalleryArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["sharing"] = sharing
            __props__.__dict__["tags"] = tags
            __props__.__dict__["unique_name"] = None
        super(SharedImageGallery, __self__).__init__(
            'azure:compute/sharedImageGallery:SharedImageGallery',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            sharing: Optional[pulumi.Input[Union['SharedImageGallerySharingArgs', 'SharedImageGallerySharingArgsDict']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            unique_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'SharedImageGallery':
        """
        Get an existing SharedImageGallery resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description for this Shared Image Gallery.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['SharedImageGallerySharingArgs', 'SharedImageGallerySharingArgsDict']] sharing: A `sharing` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Shared Image Gallery.
        :param pulumi.Input[_builtins.str] unique_name: The Unique Name for this Shared Image Gallery.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SharedImageGalleryState.__new__(_SharedImageGalleryState)

        __props__.__dict__["description"] = description
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["sharing"] = sharing
        __props__.__dict__["tags"] = tags
        __props__.__dict__["unique_name"] = unique_name
        return SharedImageGallery(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description for this Shared Image Gallery.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def sharing(self) -> pulumi.Output[Optional['outputs.SharedImageGallerySharing']]:
        """
        A `sharing` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "sharing")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the Shared Image Gallery.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="uniqueName")
    def unique_name(self) -> pulumi.Output[_builtins.str]:
        """
        The Unique Name for this Shared Image Gallery.
        """
        return pulumi.get(self, "unique_name")

