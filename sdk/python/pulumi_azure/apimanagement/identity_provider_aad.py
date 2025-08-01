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

__all__ = ['IdentityProviderAadArgs', 'IdentityProviderAad']

@pulumi.input_type
class IdentityProviderAadArgs:
    def __init__(__self__, *,
                 allowed_tenants: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 api_management_name: pulumi.Input[_builtins.str],
                 client_id: pulumi.Input[_builtins.str],
                 client_secret: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 client_library: Optional[pulumi.Input[_builtins.str]] = None,
                 signin_tenant: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a IdentityProviderAad resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] allowed_tenants: List of allowed AAD Tenants.
        :param pulumi.Input[_builtins.str] api_management_name: The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] client_id: Client Id of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_secret: Client secret of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] resource_group_name: The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] client_library: The client library to be used in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] signin_tenant: The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        pulumi.set(__self__, "allowed_tenants", allowed_tenants)
        pulumi.set(__self__, "api_management_name", api_management_name)
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_secret", client_secret)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if client_library is not None:
            pulumi.set(__self__, "client_library", client_library)
        if signin_tenant is not None:
            pulumi.set(__self__, "signin_tenant", signin_tenant)

    @_builtins.property
    @pulumi.getter(name="allowedTenants")
    def allowed_tenants(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        List of allowed AAD Tenants.
        """
        return pulumi.get(self, "allowed_tenants")

    @allowed_tenants.setter
    def allowed_tenants(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "allowed_tenants", value)

    @_builtins.property
    @pulumi.getter(name="apiManagementName")
    def api_management_name(self) -> pulumi.Input[_builtins.str]:
        """
        The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "api_management_name")

    @api_management_name.setter
    def api_management_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_management_name", value)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[_builtins.str]:
        """
        Client Id of the Application in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "client_id", value)

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Input[_builtins.str]:
        """
        Client secret of the Application in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "client_secret", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="clientLibrary")
    def client_library(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The client library to be used in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_library")

    @client_library.setter
    def client_library(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_library", value)

    @_builtins.property
    @pulumi.getter(name="signinTenant")
    def signin_tenant(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        return pulumi.get(self, "signin_tenant")

    @signin_tenant.setter
    def signin_tenant(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "signin_tenant", value)


@pulumi.input_type
class _IdentityProviderAadState:
    def __init__(__self__, *,
                 allowed_tenants: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 api_management_name: Optional[pulumi.Input[_builtins.str]] = None,
                 client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_library: Optional[pulumi.Input[_builtins.str]] = None,
                 client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 signin_tenant: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering IdentityProviderAad resources.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] allowed_tenants: List of allowed AAD Tenants.
        :param pulumi.Input[_builtins.str] api_management_name: The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] client_id: Client Id of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_library: The client library to be used in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_secret: Client secret of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] resource_group_name: The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] signin_tenant: The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        if allowed_tenants is not None:
            pulumi.set(__self__, "allowed_tenants", allowed_tenants)
        if api_management_name is not None:
            pulumi.set(__self__, "api_management_name", api_management_name)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_library is not None:
            pulumi.set(__self__, "client_library", client_library)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if signin_tenant is not None:
            pulumi.set(__self__, "signin_tenant", signin_tenant)

    @_builtins.property
    @pulumi.getter(name="allowedTenants")
    def allowed_tenants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of allowed AAD Tenants.
        """
        return pulumi.get(self, "allowed_tenants")

    @allowed_tenants.setter
    def allowed_tenants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "allowed_tenants", value)

    @_builtins.property
    @pulumi.getter(name="apiManagementName")
    def api_management_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "api_management_name")

    @api_management_name.setter
    def api_management_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_management_name", value)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Client Id of the Application in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_id", value)

    @_builtins.property
    @pulumi.getter(name="clientLibrary")
    def client_library(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The client library to be used in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_library")

    @client_library.setter
    def client_library(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_library", value)

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Client secret of the Application in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_secret", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="signinTenant")
    def signin_tenant(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        return pulumi.get(self, "signin_tenant")

    @signin_tenant.setter
    def signin_tenant(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "signin_tenant", value)


@pulumi.type_token("azure:apimanagement/identityProviderAad:IdentityProviderAad")
class IdentityProviderAad(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_tenants: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 api_management_name: Optional[pulumi.Input[_builtins.str]] = None,
                 client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_library: Optional[pulumi.Input[_builtins.str]] = None,
                 client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 signin_tenant: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an API Management AAD Identity Provider.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_service = azure.apimanagement.Service("example",
            name="example-apim",
            location=example.location,
            resource_group_name=example.name,
            publisher_name="My Company",
            publisher_email="company@mycompany.io",
            sku_name="Developer_1")
        example_identity_provider_aad = azure.apimanagement.IdentityProviderAad("example",
            resource_group_name=example.name,
            api_management_name=example_service.name,
            client_id="00000000-0000-0000-0000-000000000000",
            client_secret="00000000000000000000000000000000",
            allowed_tenants=["00000000-0000-0000-0000-000000000000"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ApiManagement`: 2022-08-01

        ## Import

        API Management AAD Identity Provider can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:apimanagement/identityProviderAad:IdentityProviderAad example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/identityProviders/aad
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] allowed_tenants: List of allowed AAD Tenants.
        :param pulumi.Input[_builtins.str] api_management_name: The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] client_id: Client Id of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_library: The client library to be used in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_secret: Client secret of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] resource_group_name: The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] signin_tenant: The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IdentityProviderAadArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an API Management AAD Identity Provider.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_service = azure.apimanagement.Service("example",
            name="example-apim",
            location=example.location,
            resource_group_name=example.name,
            publisher_name="My Company",
            publisher_email="company@mycompany.io",
            sku_name="Developer_1")
        example_identity_provider_aad = azure.apimanagement.IdentityProviderAad("example",
            resource_group_name=example.name,
            api_management_name=example_service.name,
            client_id="00000000-0000-0000-0000-000000000000",
            client_secret="00000000000000000000000000000000",
            allowed_tenants=["00000000-0000-0000-0000-000000000000"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ApiManagement`: 2022-08-01

        ## Import

        API Management AAD Identity Provider can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:apimanagement/identityProviderAad:IdentityProviderAad example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/identityProviders/aad
        ```

        :param str resource_name: The name of the resource.
        :param IdentityProviderAadArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IdentityProviderAadArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_tenants: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 api_management_name: Optional[pulumi.Input[_builtins.str]] = None,
                 client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_library: Optional[pulumi.Input[_builtins.str]] = None,
                 client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 signin_tenant: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IdentityProviderAadArgs.__new__(IdentityProviderAadArgs)

            if allowed_tenants is None and not opts.urn:
                raise TypeError("Missing required property 'allowed_tenants'")
            __props__.__dict__["allowed_tenants"] = allowed_tenants
            if api_management_name is None and not opts.urn:
                raise TypeError("Missing required property 'api_management_name'")
            __props__.__dict__["api_management_name"] = api_management_name
            if client_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_id'")
            __props__.__dict__["client_id"] = client_id
            __props__.__dict__["client_library"] = client_library
            if client_secret is None and not opts.urn:
                raise TypeError("Missing required property 'client_secret'")
            __props__.__dict__["client_secret"] = None if client_secret is None else pulumi.Output.secret(client_secret)
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["signin_tenant"] = signin_tenant
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["clientSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(IdentityProviderAad, __self__).__init__(
            'azure:apimanagement/identityProviderAad:IdentityProviderAad',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_tenants: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            api_management_name: Optional[pulumi.Input[_builtins.str]] = None,
            client_id: Optional[pulumi.Input[_builtins.str]] = None,
            client_library: Optional[pulumi.Input[_builtins.str]] = None,
            client_secret: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            signin_tenant: Optional[pulumi.Input[_builtins.str]] = None) -> 'IdentityProviderAad':
        """
        Get an existing IdentityProviderAad resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] allowed_tenants: List of allowed AAD Tenants.
        :param pulumi.Input[_builtins.str] api_management_name: The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] client_id: Client Id of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_library: The client library to be used in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] client_secret: Client secret of the Application in the AAD Identity Provider.
        :param pulumi.Input[_builtins.str] resource_group_name: The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] signin_tenant: The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IdentityProviderAadState.__new__(_IdentityProviderAadState)

        __props__.__dict__["allowed_tenants"] = allowed_tenants
        __props__.__dict__["api_management_name"] = api_management_name
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_library"] = client_library
        __props__.__dict__["client_secret"] = client_secret
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["signin_tenant"] = signin_tenant
        return IdentityProviderAad(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="allowedTenants")
    def allowed_tenants(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        List of allowed AAD Tenants.
        """
        return pulumi.get(self, "allowed_tenants")

    @_builtins.property
    @pulumi.getter(name="apiManagementName")
    def api_management_name(self) -> pulumi.Output[_builtins.str]:
        """
        The Name of the API Management Service where this AAD Identity Provider should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "api_management_name")

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[_builtins.str]:
        """
        Client Id of the Application in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_id")

    @_builtins.property
    @pulumi.getter(name="clientLibrary")
    def client_library(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The client library to be used in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_library")

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[_builtins.str]:
        """
        Client secret of the Application in the AAD Identity Provider.
        """
        return pulumi.get(self, "client_secret")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="signinTenant")
    def signin_tenant(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The AAD Tenant to use instead of Common when logging into Active Directory.
        """
        return pulumi.get(self, "signin_tenant")

