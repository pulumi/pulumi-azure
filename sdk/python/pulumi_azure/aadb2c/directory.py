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

__all__ = ['DirectoryArgs', 'Directory']

@pulumi.input_type
class DirectoryArgs:
    def __init__(__self__, *,
                 data_residency_location: pulumi.Input[_builtins.str],
                 domain_name: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 sku_name: pulumi.Input[_builtins.str],
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Directory resource.
        :param pulumi.Input[_builtins.str] data_residency_location: Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        :param pulumi.Input[_builtins.str] domain_name: Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] sku_name: Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        :param pulumi.Input[_builtins.str] country_code: Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] display_name: The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the AAD B2C Directory.
        """
        pulumi.set(__self__, "data_residency_location", data_residency_location)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "sku_name", sku_name)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="dataResidencyLocation")
    def data_residency_location(self) -> pulumi.Input[_builtins.str]:
        """
        Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        """
        return pulumi.get(self, "data_residency_location")

    @data_residency_location.setter
    def data_residency_location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_residency_location", value)

    @_builtins.property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[_builtins.str]:
        """
        Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "domain_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="skuName")
    def sku_name(self) -> pulumi.Input[_builtins.str]:
        """
        Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        """
        return pulumi.get(self, "sku_name")

    @sku_name.setter
    def sku_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "sku_name", value)

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "country_code", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the AAD B2C Directory.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DirectoryState:
    def __init__(__self__, *,
                 billing_type: Optional[pulumi.Input[_builtins.str]] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 data_residency_location: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 domain_name: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_start_date: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sku_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 tenant_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Directory resources.
        :param pulumi.Input[_builtins.str] billing_type: The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
        :param pulumi.Input[_builtins.str] country_code: Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] data_residency_location: Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        :param pulumi.Input[_builtins.str] display_name: The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] domain_name: Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] effective_start_date: The date from which the billing type took effect. May not be populated until after the first billing cycle.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] sku_name: Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the AAD B2C Directory.
        :param pulumi.Input[_builtins.str] tenant_id: The Tenant ID for the AAD B2C tenant.
        """
        if billing_type is not None:
            pulumi.set(__self__, "billing_type", billing_type)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if data_residency_location is not None:
            pulumi.set(__self__, "data_residency_location", data_residency_location)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if effective_start_date is not None:
            pulumi.set(__self__, "effective_start_date", effective_start_date)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if sku_name is not None:
            pulumi.set(__self__, "sku_name", sku_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter(name="billingType")
    def billing_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
        """
        return pulumi.get(self, "billing_type")

    @billing_type.setter
    def billing_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "billing_type", value)

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "country_code", value)

    @_builtins.property
    @pulumi.getter(name="dataResidencyLocation")
    def data_residency_location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        """
        return pulumi.get(self, "data_residency_location")

    @data_residency_location.setter
    def data_residency_location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_residency_location", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "domain_name", value)

    @_builtins.property
    @pulumi.getter(name="effectiveStartDate")
    def effective_start_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The date from which the billing type took effect. May not be populated until after the first billing cycle.
        """
        return pulumi.get(self, "effective_start_date")

    @effective_start_date.setter
    def effective_start_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "effective_start_date", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="skuName")
    def sku_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        """
        return pulumi.get(self, "sku_name")

    @sku_name.setter
    def sku_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "sku_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the AAD B2C Directory.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Tenant ID for the AAD B2C tenant.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tenant_id", value)


@pulumi.type_token("azure:aadb2c/directory:Directory")
class Directory(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 data_residency_location: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 domain_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sku_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages an AAD B2C Directory.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.aadb2c.Directory("example",
            country_code="US",
            data_residency_location="United States",
            display_name="example-b2c-tenant",
            domain_name="exampleb2ctenant.onmicrosoft.com",
            resource_group_name="example-rg",
            sku_name="PremiumP1")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.AzureActiveDirectory`: 2021-04-01-preview

        ## Import

        AAD B2C Directories can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:aadb2c/directory:Directory example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/example-resource-group/providers/Microsoft.AzureActiveDirectory/b2cDirectories/directory-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] country_code: Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] data_residency_location: Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        :param pulumi.Input[_builtins.str] display_name: The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] domain_name: Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] sku_name: Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the AAD B2C Directory.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DirectoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an AAD B2C Directory.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.aadb2c.Directory("example",
            country_code="US",
            data_residency_location="United States",
            display_name="example-b2c-tenant",
            domain_name="exampleb2ctenant.onmicrosoft.com",
            resource_group_name="example-rg",
            sku_name="PremiumP1")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.AzureActiveDirectory`: 2021-04-01-preview

        ## Import

        AAD B2C Directories can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:aadb2c/directory:Directory example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/example-resource-group/providers/Microsoft.AzureActiveDirectory/b2cDirectories/directory-name
        ```

        :param str resource_name: The name of the resource.
        :param DirectoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DirectoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 data_residency_location: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 domain_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sku_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DirectoryArgs.__new__(DirectoryArgs)

            __props__.__dict__["country_code"] = country_code
            if data_residency_location is None and not opts.urn:
                raise TypeError("Missing required property 'data_residency_location'")
            __props__.__dict__["data_residency_location"] = data_residency_location
            __props__.__dict__["display_name"] = display_name
            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if sku_name is None and not opts.urn:
                raise TypeError("Missing required property 'sku_name'")
            __props__.__dict__["sku_name"] = sku_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["billing_type"] = None
            __props__.__dict__["effective_start_date"] = None
            __props__.__dict__["tenant_id"] = None
        super(Directory, __self__).__init__(
            'azure:aadb2c/directory:Directory',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            billing_type: Optional[pulumi.Input[_builtins.str]] = None,
            country_code: Optional[pulumi.Input[_builtins.str]] = None,
            data_residency_location: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            domain_name: Optional[pulumi.Input[_builtins.str]] = None,
            effective_start_date: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            sku_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            tenant_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'Directory':
        """
        Get an existing Directory resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] billing_type: The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
        :param pulumi.Input[_builtins.str] country_code: Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] data_residency_location: Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        :param pulumi.Input[_builtins.str] display_name: The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] domain_name: Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] effective_start_date: The date from which the billing type took effect. May not be populated until after the first billing cycle.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        :param pulumi.Input[_builtins.str] sku_name: Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the AAD B2C Directory.
        :param pulumi.Input[_builtins.str] tenant_id: The Tenant ID for the AAD B2C tenant.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DirectoryState.__new__(_DirectoryState)

        __props__.__dict__["billing_type"] = billing_type
        __props__.__dict__["country_code"] = country_code
        __props__.__dict__["data_residency_location"] = data_residency_location
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["effective_start_date"] = effective_start_date
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["sku_name"] = sku_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tenant_id"] = tenant_id
        return Directory(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="billingType")
    def billing_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
        """
        return pulumi.get(self, "billing_type")

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Output[_builtins.str]:
        """
        Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "country_code")

    @_builtins.property
    @pulumi.getter(name="dataResidencyLocation")
    def data_residency_location(self) -> pulumi.Output[_builtins.str]:
        """
        Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
        """
        return pulumi.get(self, "data_residency_location")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[_builtins.str]:
        """
        Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "domain_name")

    @_builtins.property
    @pulumi.getter(name="effectiveStartDate")
    def effective_start_date(self) -> pulumi.Output[_builtins.str]:
        """
        The date from which the billing type took effect. May not be populated until after the first billing cycle.
        """
        return pulumi.get(self, "effective_start_date")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="skuName")
    def sku_name(self) -> pulumi.Output[_builtins.str]:
        """
        Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
        """
        return pulumi.get(self, "sku_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags which should be assigned to the AAD B2C Directory.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Tenant ID for the AAD B2C tenant.
        """
        return pulumi.get(self, "tenant_id")

