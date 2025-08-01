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

__all__ = ['GalleryApplicationAssignmentArgs', 'GalleryApplicationAssignment']

@pulumi.input_type
class GalleryApplicationAssignmentArgs:
    def __init__(__self__, *,
                 gallery_application_version_id: pulumi.Input[_builtins.str],
                 virtual_machine_id: pulumi.Input[_builtins.str],
                 configuration_blob_uri: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a GalleryApplicationAssignment resource.
        :param pulumi.Input[_builtins.str] gallery_application_version_id: The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] virtual_machine_id: The ID of the Virtual Machine. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] configuration_blob_uri: Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] order: Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        :param pulumi.Input[_builtins.str] tag: Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "gallery_application_version_id", gallery_application_version_id)
        pulumi.set(__self__, "virtual_machine_id", virtual_machine_id)
        if configuration_blob_uri is not None:
            pulumi.set(__self__, "configuration_blob_uri", configuration_blob_uri)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)

    @_builtins.property
    @pulumi.getter(name="galleryApplicationVersionId")
    def gallery_application_version_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "gallery_application_version_id")

    @gallery_application_version_id.setter
    def gallery_application_version_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "gallery_application_version_id", value)

    @_builtins.property
    @pulumi.getter(name="virtualMachineId")
    def virtual_machine_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Virtual Machine. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "virtual_machine_id")

    @virtual_machine_id.setter
    def virtual_machine_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "virtual_machine_id", value)

    @_builtins.property
    @pulumi.getter(name="configurationBlobUri")
    def configuration_blob_uri(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "configuration_blob_uri")

    @configuration_blob_uri.setter
    def configuration_blob_uri(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "configuration_blob_uri", value)

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "order", value)

    @_builtins.property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tag", value)


@pulumi.input_type
class _GalleryApplicationAssignmentState:
    def __init__(__self__, *,
                 configuration_blob_uri: Optional[pulumi.Input[_builtins.str]] = None,
                 gallery_application_version_id: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering GalleryApplicationAssignment resources.
        :param pulumi.Input[_builtins.str] configuration_blob_uri: Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] gallery_application_version_id: The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] order: Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        :param pulumi.Input[_builtins.str] tag: Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] virtual_machine_id: The ID of the Virtual Machine. Changing this forces a new resource to be created.
        """
        if configuration_blob_uri is not None:
            pulumi.set(__self__, "configuration_blob_uri", configuration_blob_uri)
        if gallery_application_version_id is not None:
            pulumi.set(__self__, "gallery_application_version_id", gallery_application_version_id)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if virtual_machine_id is not None:
            pulumi.set(__self__, "virtual_machine_id", virtual_machine_id)

    @_builtins.property
    @pulumi.getter(name="configurationBlobUri")
    def configuration_blob_uri(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "configuration_blob_uri")

    @configuration_blob_uri.setter
    def configuration_blob_uri(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "configuration_blob_uri", value)

    @_builtins.property
    @pulumi.getter(name="galleryApplicationVersionId")
    def gallery_application_version_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "gallery_application_version_id")

    @gallery_application_version_id.setter
    def gallery_application_version_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "gallery_application_version_id", value)

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "order", value)

    @_builtins.property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tag", value)

    @_builtins.property
    @pulumi.getter(name="virtualMachineId")
    def virtual_machine_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Virtual Machine. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "virtual_machine_id")

    @virtual_machine_id.setter
    def virtual_machine_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "virtual_machine_id", value)


@pulumi.type_token("azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment")
class GalleryApplicationAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration_blob_uri: Optional[pulumi.Input[_builtins.str]] = None,
                 gallery_application_version_id: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Virtual Machine Gallery Application Assignment.

        > **Note:** Gallery Application Assignments can be defined either directly on `compute.LinuxVirtualMachine` and `compute.WindowsVirtualMachine` resources, or using the `compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. It's recommended to use `ignore_changes` for the `gallery_application` block on the associated virtual machine resources, to avoid a persistent diff when using this resource.
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.compute.get_virtual_machine(name="example-vm",
            resource_group_name="example-resources-vm")
        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_shared_image_gallery = azure.compute.SharedImageGallery("example",
            name="examplegallery",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_gallery_application = azure.compute.GalleryApplication("example",
            name="example-app",
            gallery_id=example_shared_image_gallery.id,
            location=example_resource_group.location,
            supported_os_type="Linux")
        example_account = azure.storage.Account("example",
            name="examplestorage",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("example",
            name="example-container",
            storage_account_name=example_account.name,
            container_access_type="blob")
        example_blob = azure.storage.Blob("example",
            name="scripts",
            storage_account_name=example_account.name,
            storage_container_name=example_container.name,
            type="Block",
            source_content="[scripts file content]")
        example_gallery_application_version = azure.compute.GalleryApplicationVersion("example",
            name="0.0.1",
            gallery_application_id=example_gallery_application.id,
            location=example_gallery_application.location,
            manage_action={
                "install": "[install command]",
                "remove": "[remove command]",
            },
            source={
                "media_link": example_blob.id,
            },
            target_regions=[{
                "name": example_gallery_application.location,
                "regional_replica_count": 1,
            }])
        example_gallery_application_assignment = azure.compute.GalleryApplicationAssignment("example",
            gallery_application_version_id=example_gallery_application_version.id,
            virtual_machine_id=example.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2024-03-01

        ## Import

        Virtual Machine Gallery Application Assignments can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment example subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/machine1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1/versions/galleryApplicationVersion1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] configuration_blob_uri: Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] gallery_application_version_id: The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] order: Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        :param pulumi.Input[_builtins.str] tag: Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] virtual_machine_id: The ID of the Virtual Machine. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GalleryApplicationAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Virtual Machine Gallery Application Assignment.

        > **Note:** Gallery Application Assignments can be defined either directly on `compute.LinuxVirtualMachine` and `compute.WindowsVirtualMachine` resources, or using the `compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. It's recommended to use `ignore_changes` for the `gallery_application` block on the associated virtual machine resources, to avoid a persistent diff when using this resource.
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.compute.get_virtual_machine(name="example-vm",
            resource_group_name="example-resources-vm")
        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_shared_image_gallery = azure.compute.SharedImageGallery("example",
            name="examplegallery",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_gallery_application = azure.compute.GalleryApplication("example",
            name="example-app",
            gallery_id=example_shared_image_gallery.id,
            location=example_resource_group.location,
            supported_os_type="Linux")
        example_account = azure.storage.Account("example",
            name="examplestorage",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("example",
            name="example-container",
            storage_account_name=example_account.name,
            container_access_type="blob")
        example_blob = azure.storage.Blob("example",
            name="scripts",
            storage_account_name=example_account.name,
            storage_container_name=example_container.name,
            type="Block",
            source_content="[scripts file content]")
        example_gallery_application_version = azure.compute.GalleryApplicationVersion("example",
            name="0.0.1",
            gallery_application_id=example_gallery_application.id,
            location=example_gallery_application.location,
            manage_action={
                "install": "[install command]",
                "remove": "[remove command]",
            },
            source={
                "media_link": example_blob.id,
            },
            target_regions=[{
                "name": example_gallery_application.location,
                "regional_replica_count": 1,
            }])
        example_gallery_application_assignment = azure.compute.GalleryApplicationAssignment("example",
            gallery_application_version_id=example_gallery_application_version.id,
            virtual_machine_id=example.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2024-03-01

        ## Import

        Virtual Machine Gallery Application Assignments can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment example subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/machine1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1/versions/galleryApplicationVersion1
        ```

        :param str resource_name: The name of the resource.
        :param GalleryApplicationAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GalleryApplicationAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration_blob_uri: Optional[pulumi.Input[_builtins.str]] = None,
                 gallery_application_version_id: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GalleryApplicationAssignmentArgs.__new__(GalleryApplicationAssignmentArgs)

            __props__.__dict__["configuration_blob_uri"] = configuration_blob_uri
            if gallery_application_version_id is None and not opts.urn:
                raise TypeError("Missing required property 'gallery_application_version_id'")
            __props__.__dict__["gallery_application_version_id"] = gallery_application_version_id
            __props__.__dict__["order"] = order
            __props__.__dict__["tag"] = tag
            if virtual_machine_id is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_machine_id'")
            __props__.__dict__["virtual_machine_id"] = virtual_machine_id
        super(GalleryApplicationAssignment, __self__).__init__(
            'azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration_blob_uri: Optional[pulumi.Input[_builtins.str]] = None,
            gallery_application_version_id: Optional[pulumi.Input[_builtins.str]] = None,
            order: Optional[pulumi.Input[_builtins.int]] = None,
            tag: Optional[pulumi.Input[_builtins.str]] = None,
            virtual_machine_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'GalleryApplicationAssignment':
        """
        Get an existing GalleryApplicationAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] configuration_blob_uri: Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] gallery_application_version_id: The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] order: Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        :param pulumi.Input[_builtins.str] tag: Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] virtual_machine_id: The ID of the Virtual Machine. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GalleryApplicationAssignmentState.__new__(_GalleryApplicationAssignmentState)

        __props__.__dict__["configuration_blob_uri"] = configuration_blob_uri
        __props__.__dict__["gallery_application_version_id"] = gallery_application_version_id
        __props__.__dict__["order"] = order
        __props__.__dict__["tag"] = tag
        __props__.__dict__["virtual_machine_id"] = virtual_machine_id
        return GalleryApplicationAssignment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="configurationBlobUri")
    def configuration_blob_uri(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "configuration_blob_uri")

    @_builtins.property
    @pulumi.getter(name="galleryApplicationVersionId")
    def gallery_application_version_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Gallery Application Version. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "gallery_application_version_id")

    @_builtins.property
    @pulumi.getter
    def order(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        """
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter
    def tag(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "tag")

    @_builtins.property
    @pulumi.getter(name="virtualMachineId")
    def virtual_machine_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Virtual Machine. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "virtual_machine_id")

