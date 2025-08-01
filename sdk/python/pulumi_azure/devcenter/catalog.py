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

__all__ = ['CatalogArgs', 'Catalog']

@pulumi.input_type
class CatalogArgs:
    def __init__(__self__, *,
                 dev_center_id: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 catalog_adogit: Optional[pulumi.Input['CatalogCatalogAdogitArgs']] = None,
                 catalog_github: Optional[pulumi.Input['CatalogCatalogGithubArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Catalog resource.
        :param pulumi.Input[_builtins.str] dev_center_id: Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input['CatalogCatalogAdogitArgs'] catalog_adogit: A `catalog_adogit` block as defined below.
        :param pulumi.Input['CatalogCatalogGithubArgs'] catalog_github: A `catalog_github` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        """
        pulumi.set(__self__, "dev_center_id", dev_center_id)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if catalog_adogit is not None:
            pulumi.set(__self__, "catalog_adogit", catalog_adogit)
        if catalog_github is not None:
            pulumi.set(__self__, "catalog_github", catalog_github)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="devCenterId")
    def dev_center_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        """
        return pulumi.get(self, "dev_center_id")

    @dev_center_id.setter
    def dev_center_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "dev_center_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="catalogAdogit")
    def catalog_adogit(self) -> Optional[pulumi.Input['CatalogCatalogAdogitArgs']]:
        """
        A `catalog_adogit` block as defined below.
        """
        return pulumi.get(self, "catalog_adogit")

    @catalog_adogit.setter
    def catalog_adogit(self, value: Optional[pulumi.Input['CatalogCatalogAdogitArgs']]):
        pulumi.set(self, "catalog_adogit", value)

    @_builtins.property
    @pulumi.getter(name="catalogGithub")
    def catalog_github(self) -> Optional[pulumi.Input['CatalogCatalogGithubArgs']]:
        """
        A `catalog_github` block as defined below.
        """
        return pulumi.get(self, "catalog_github")

    @catalog_github.setter
    def catalog_github(self, value: Optional[pulumi.Input['CatalogCatalogGithubArgs']]):
        pulumi.set(self, "catalog_github", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CatalogState:
    def __init__(__self__, *,
                 catalog_adogit: Optional[pulumi.Input['CatalogCatalogAdogitArgs']] = None,
                 catalog_github: Optional[pulumi.Input['CatalogCatalogGithubArgs']] = None,
                 dev_center_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Catalog resources.
        :param pulumi.Input['CatalogCatalogAdogitArgs'] catalog_adogit: A `catalog_adogit` block as defined below.
        :param pulumi.Input['CatalogCatalogGithubArgs'] catalog_github: A `catalog_github` block as defined below.
        :param pulumi.Input[_builtins.str] dev_center_id: Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        """
        if catalog_adogit is not None:
            pulumi.set(__self__, "catalog_adogit", catalog_adogit)
        if catalog_github is not None:
            pulumi.set(__self__, "catalog_github", catalog_github)
        if dev_center_id is not None:
            pulumi.set(__self__, "dev_center_id", dev_center_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)

    @_builtins.property
    @pulumi.getter(name="catalogAdogit")
    def catalog_adogit(self) -> Optional[pulumi.Input['CatalogCatalogAdogitArgs']]:
        """
        A `catalog_adogit` block as defined below.
        """
        return pulumi.get(self, "catalog_adogit")

    @catalog_adogit.setter
    def catalog_adogit(self, value: Optional[pulumi.Input['CatalogCatalogAdogitArgs']]):
        pulumi.set(self, "catalog_adogit", value)

    @_builtins.property
    @pulumi.getter(name="catalogGithub")
    def catalog_github(self) -> Optional[pulumi.Input['CatalogCatalogGithubArgs']]:
        """
        A `catalog_github` block as defined below.
        """
        return pulumi.get(self, "catalog_github")

    @catalog_github.setter
    def catalog_github(self, value: Optional[pulumi.Input['CatalogCatalogGithubArgs']]):
        pulumi.set(self, "catalog_github", value)

    @_builtins.property
    @pulumi.getter(name="devCenterId")
    def dev_center_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        """
        return pulumi.get(self, "dev_center_id")

    @dev_center_id.setter
    def dev_center_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dev_center_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)


@pulumi.type_token("azure:devcenter/catalog:Catalog")
class Catalog(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_adogit: Optional[pulumi.Input[Union['CatalogCatalogAdogitArgs', 'CatalogCatalogAdogitArgsDict']]] = None,
                 catalog_github: Optional[pulumi.Input[Union['CatalogCatalogGithubArgs', 'CatalogCatalogGithubArgsDict']]] = None,
                 dev_center_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Dev Center Catalog.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_dev_center = azure.devcenter.DevCenter("example",
            location=example.location,
            name="example",
            resource_group_name=example.name,
            identity={
                "type": "SystemAssigned",
            })
        example_catalog = azure.devcenter.Catalog("example",
            name="example",
            resource_group_name=test_azurerm_resource_group["name"],
            dev_center_id=test["id"],
            catalog_github={
                "branch": "foo",
                "path": "",
                "uri": "example URI",
                "key_vault_key_url": "secret",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DevCenter`: 2025-02-01

        ## Import

        An existing Dev Center Catalog can be imported into Pulumi using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:devcenter/catalog:Catalog example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/devCenters/{devCenterName}/catalogs/{catalogName}
        ```

        * Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center exists. For example `12345678-1234-9876-4563-123456789012`.

        * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center exists. For example `example-resource-group`.

        * Where `{devCenterName}` is the name of the Dev Center. For example `devCenterValue`.

        * Where `{catalogName}` is the name of the Dev Center Catalog. For example `catalogValue`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['CatalogCatalogAdogitArgs', 'CatalogCatalogAdogitArgsDict']] catalog_adogit: A `catalog_adogit` block as defined below.
        :param pulumi.Input[Union['CatalogCatalogGithubArgs', 'CatalogCatalogGithubArgsDict']] catalog_github: A `catalog_github` block as defined below.
        :param pulumi.Input[_builtins.str] dev_center_id: Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CatalogArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Dev Center Catalog.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_dev_center = azure.devcenter.DevCenter("example",
            location=example.location,
            name="example",
            resource_group_name=example.name,
            identity={
                "type": "SystemAssigned",
            })
        example_catalog = azure.devcenter.Catalog("example",
            name="example",
            resource_group_name=test_azurerm_resource_group["name"],
            dev_center_id=test["id"],
            catalog_github={
                "branch": "foo",
                "path": "",
                "uri": "example URI",
                "key_vault_key_url": "secret",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DevCenter`: 2025-02-01

        ## Import

        An existing Dev Center Catalog can be imported into Pulumi using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:devcenter/catalog:Catalog example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/devCenters/{devCenterName}/catalogs/{catalogName}
        ```

        * Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center exists. For example `12345678-1234-9876-4563-123456789012`.

        * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center exists. For example `example-resource-group`.

        * Where `{devCenterName}` is the name of the Dev Center. For example `devCenterValue`.

        * Where `{catalogName}` is the name of the Dev Center Catalog. For example `catalogValue`.

        :param str resource_name: The name of the resource.
        :param CatalogArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CatalogArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_adogit: Optional[pulumi.Input[Union['CatalogCatalogAdogitArgs', 'CatalogCatalogAdogitArgsDict']]] = None,
                 catalog_github: Optional[pulumi.Input[Union['CatalogCatalogGithubArgs', 'CatalogCatalogGithubArgsDict']]] = None,
                 dev_center_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CatalogArgs.__new__(CatalogArgs)

            __props__.__dict__["catalog_adogit"] = catalog_adogit
            __props__.__dict__["catalog_github"] = catalog_github
            if dev_center_id is None and not opts.urn:
                raise TypeError("Missing required property 'dev_center_id'")
            __props__.__dict__["dev_center_id"] = dev_center_id
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        super(Catalog, __self__).__init__(
            'azure:devcenter/catalog:Catalog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catalog_adogit: Optional[pulumi.Input[Union['CatalogCatalogAdogitArgs', 'CatalogCatalogAdogitArgsDict']]] = None,
            catalog_github: Optional[pulumi.Input[Union['CatalogCatalogGithubArgs', 'CatalogCatalogGithubArgsDict']]] = None,
            dev_center_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'Catalog':
        """
        Get an existing Catalog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['CatalogCatalogAdogitArgs', 'CatalogCatalogAdogitArgsDict']] catalog_adogit: A `catalog_adogit` block as defined below.
        :param pulumi.Input[Union['CatalogCatalogGithubArgs', 'CatalogCatalogGithubArgsDict']] catalog_github: A `catalog_github` block as defined below.
        :param pulumi.Input[_builtins.str] dev_center_id: Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CatalogState.__new__(_CatalogState)

        __props__.__dict__["catalog_adogit"] = catalog_adogit
        __props__.__dict__["catalog_github"] = catalog_github
        __props__.__dict__["dev_center_id"] = dev_center_id
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        return Catalog(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="catalogAdogit")
    def catalog_adogit(self) -> pulumi.Output[Optional['outputs.CatalogCatalogAdogit']]:
        """
        A `catalog_adogit` block as defined below.
        """
        return pulumi.get(self, "catalog_adogit")

    @_builtins.property
    @pulumi.getter(name="catalogGithub")
    def catalog_github(self) -> pulumi.Output[Optional['outputs.CatalogCatalogGithub']]:
        """
        A `catalog_github` block as defined below.
        """
        return pulumi.get(self, "catalog_github")

    @_builtins.property
    @pulumi.getter(name="devCenterId")
    def dev_center_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Dev Center Id within which this Dev Center Catalog should exist. Changing this forces a new Dev Center Catalog to be created.
        """
        return pulumi.get(self, "dev_center_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of this Dev Center Catalog. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Resource Group within which this Dev Center Catalog should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "resource_group_name")

