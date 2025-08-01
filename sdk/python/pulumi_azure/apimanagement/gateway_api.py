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

__all__ = ['GatewayApiArgs', 'GatewayApi']

@pulumi.input_type
class GatewayApiArgs:
    def __init__(__self__, *,
                 api_id: pulumi.Input[_builtins.str],
                 gateway_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a GatewayApi resource.
        :param pulumi.Input[_builtins.str] api_id: The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        :param pulumi.Input[_builtins.str] gateway_id: The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        pulumi.set(__self__, "api_id", api_id)
        pulumi.set(__self__, "gateway_id", gateway_id)

    @_builtins.property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_id", value)

    @_builtins.property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        return pulumi.get(self, "gateway_id")

    @gateway_id.setter
    def gateway_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "gateway_id", value)


@pulumi.input_type
class _GatewayApiState:
    def __init__(__self__, *,
                 api_id: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering GatewayApi resources.
        :param pulumi.Input[_builtins.str] api_id: The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        :param pulumi.Input[_builtins.str] gateway_id: The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        if api_id is not None:
            pulumi.set(__self__, "api_id", api_id)
        if gateway_id is not None:
            pulumi.set(__self__, "gateway_id", gateway_id)

    @_builtins.property
    @pulumi.getter(name="apiId")
    def api_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_id", value)

    @_builtins.property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        return pulumi.get(self, "gateway_id")

    @gateway_id.setter
    def gateway_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "gateway_id", value)


@pulumi.type_token("azure:apimanagement/gatewayApi:GatewayApi")
class GatewayApi(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a API Management Gateway API.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.apimanagement.get_service(name="example-api",
            resource_group_name="example-resources")
        example_get_api = azure.apimanagement.get_api(name="search-api",
            api_management_name=example.name,
            resource_group_name=example.resource_group_name,
            revision="2")
        example_get_gateway = azure.apimanagement.get_gateway(name="example-gateway",
            api_management_id=example.id)
        example_gateway_api = azure.apimanagement.GatewayApi("example",
            gateway_id=example_get_gateway.id,
            api_id=example_get_api.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ApiManagement`: 2022-08-01

        ## Import

        API Management Gateway APIs can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:apimanagement/gatewayApi:GatewayApi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.ApiManagement/service/service1/gateways/gateway1/apis/api1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_id: The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        :param pulumi.Input[_builtins.str] gateway_id: The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayApiArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a API Management Gateway API.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.apimanagement.get_service(name="example-api",
            resource_group_name="example-resources")
        example_get_api = azure.apimanagement.get_api(name="search-api",
            api_management_name=example.name,
            resource_group_name=example.resource_group_name,
            revision="2")
        example_get_gateway = azure.apimanagement.get_gateway(name="example-gateway",
            api_management_id=example.id)
        example_gateway_api = azure.apimanagement.GatewayApi("example",
            gateway_id=example_get_gateway.id,
            api_id=example_get_api.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ApiManagement`: 2022-08-01

        ## Import

        API Management Gateway APIs can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:apimanagement/gatewayApi:GatewayApi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.ApiManagement/service/service1/gateways/gateway1/apis/api1
        ```

        :param str resource_name: The name of the resource.
        :param GatewayApiArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayApiArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[_builtins.str]] = None,
                 gateway_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayApiArgs.__new__(GatewayApiArgs)

            if api_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_id'")
            __props__.__dict__["api_id"] = api_id
            if gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'gateway_id'")
            __props__.__dict__["gateway_id"] = gateway_id
        super(GatewayApi, __self__).__init__(
            'azure:apimanagement/gatewayApi:GatewayApi',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_id: Optional[pulumi.Input[_builtins.str]] = None,
            gateway_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'GatewayApi':
        """
        Get an existing GatewayApi resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_id: The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        :param pulumi.Input[_builtins.str] gateway_id: The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayApiState.__new__(_GatewayApiState)

        __props__.__dict__["api_id"] = api_id
        __props__.__dict__["gateway_id"] = gateway_id
        return GatewayApi(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
        """
        return pulumi.get(self, "api_id")

    @_builtins.property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
        """
        return pulumi.get(self, "gateway_id")

