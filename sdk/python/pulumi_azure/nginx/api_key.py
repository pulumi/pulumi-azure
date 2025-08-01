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

__all__ = ['ApiKeyArgs', 'ApiKey']

@pulumi.input_type
class ApiKeyArgs:
    def __init__(__self__, *,
                 end_date_time: pulumi.Input[_builtins.str],
                 nginx_deployment_id: pulumi.Input[_builtins.str],
                 secret_text: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ApiKey resource.
        :param pulumi.Input[_builtins.str] end_date_time: The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        :param pulumi.Input[_builtins.str] nginx_deployment_id: The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secret_text: The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        :param pulumi.Input[_builtins.str] name: The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "end_date_time", end_date_time)
        pulumi.set(__self__, "nginx_deployment_id", nginx_deployment_id)
        pulumi.set(__self__, "secret_text", secret_text)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> pulumi.Input[_builtins.str]:
        """
        The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        """
        return pulumi.get(self, "end_date_time")

    @end_date_time.setter
    def end_date_time(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "end_date_time", value)

    @_builtins.property
    @pulumi.getter(name="nginxDeploymentId")
    def nginx_deployment_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "nginx_deployment_id")

    @nginx_deployment_id.setter
    def nginx_deployment_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "nginx_deployment_id", value)

    @_builtins.property
    @pulumi.getter(name="secretText")
    def secret_text(self) -> pulumi.Input[_builtins.str]:
        """
        The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        """
        return pulumi.get(self, "secret_text")

    @secret_text.setter
    def secret_text(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "secret_text", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ApiKeyState:
    def __init__(__self__, *,
                 end_date_time: Optional[pulumi.Input[_builtins.str]] = None,
                 hint: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 nginx_deployment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_text: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ApiKey resources.
        :param pulumi.Input[_builtins.str] end_date_time: The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        :param pulumi.Input[_builtins.str] hint: The first three characters of the secret text to help identify it in use.
        :param pulumi.Input[_builtins.str] name: The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] nginx_deployment_id: The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secret_text: The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        """
        if end_date_time is not None:
            pulumi.set(__self__, "end_date_time", end_date_time)
        if hint is not None:
            pulumi.set(__self__, "hint", hint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nginx_deployment_id is not None:
            pulumi.set(__self__, "nginx_deployment_id", nginx_deployment_id)
        if secret_text is not None:
            pulumi.set(__self__, "secret_text", secret_text)

    @_builtins.property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        """
        return pulumi.get(self, "end_date_time")

    @end_date_time.setter
    def end_date_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "end_date_time", value)

    @_builtins.property
    @pulumi.getter
    def hint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The first three characters of the secret text to help identify it in use.
        """
        return pulumi.get(self, "hint")

    @hint.setter
    def hint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "hint", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="nginxDeploymentId")
    def nginx_deployment_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "nginx_deployment_id")

    @nginx_deployment_id.setter
    def nginx_deployment_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "nginx_deployment_id", value)

    @_builtins.property
    @pulumi.getter(name="secretText")
    def secret_text(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        """
        return pulumi.get(self, "secret_text")

    @secret_text.setter
    def secret_text(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secret_text", value)


@pulumi.type_token("azure:nginx/apiKey:ApiKey")
class ApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_date_time: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 nginx_deployment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_text: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages the Dataplane API Key for an Nginx Deployment.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="West Europe")
        example_public_ip = azure.network.PublicIp("example",
            name="example",
            resource_group_name=example.name,
            location=example.location,
            allocation_method="Static",
            sku="Standard",
            tags={
                "environment": "Production",
            })
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="example-subnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"],
            delegations=[{
                "name": "delegation",
                "service_delegation": {
                    "name": "NGINX.NGINXPLUS/nginxDeployments",
                    "actions": ["Microsoft.Network/virtualNetworks/subnets/join/action"],
                },
            }])
        example_deployment = azure.nginx.Deployment("example",
            name="example-nginx",
            resource_group_name=example.name,
            sku="standardv2_Monthly",
            location=example.location,
            automatic_upgrade_channel="stable",
            frontend_public={
                "ip_addresses": [example_public_ip.id],
            },
            network_interfaces=[{
                "subnet_id": example_subnet.id,
            }],
            capacity=20,
            email="user@test.com")
        example_api_key = azure.nginx.ApiKey("example",
            name="example-api-key",
            nginx_deployment_id=example_deployment.id,
            secret_text="727c8642-6807-4254-9d02-ae93bfad21de",
            end_date_time="2027-01-01T00:00:00Z")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Nginx.NginxPlus`: 2024-11-01-preview

        ## Import

        An NGINX Dataplane API Key can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:nginx/apiKey:ApiKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/deploy1/apiKeys/key1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] end_date_time: The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        :param pulumi.Input[_builtins.str] name: The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] nginx_deployment_id: The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secret_text: The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the Dataplane API Key for an Nginx Deployment.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="West Europe")
        example_public_ip = azure.network.PublicIp("example",
            name="example",
            resource_group_name=example.name,
            location=example.location,
            allocation_method="Static",
            sku="Standard",
            tags={
                "environment": "Production",
            })
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="example-subnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"],
            delegations=[{
                "name": "delegation",
                "service_delegation": {
                    "name": "NGINX.NGINXPLUS/nginxDeployments",
                    "actions": ["Microsoft.Network/virtualNetworks/subnets/join/action"],
                },
            }])
        example_deployment = azure.nginx.Deployment("example",
            name="example-nginx",
            resource_group_name=example.name,
            sku="standardv2_Monthly",
            location=example.location,
            automatic_upgrade_channel="stable",
            frontend_public={
                "ip_addresses": [example_public_ip.id],
            },
            network_interfaces=[{
                "subnet_id": example_subnet.id,
            }],
            capacity=20,
            email="user@test.com")
        example_api_key = azure.nginx.ApiKey("example",
            name="example-api-key",
            nginx_deployment_id=example_deployment.id,
            secret_text="727c8642-6807-4254-9d02-ae93bfad21de",
            end_date_time="2027-01-01T00:00:00Z")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Nginx.NginxPlus`: 2024-11-01-preview

        ## Import

        An NGINX Dataplane API Key can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:nginx/apiKey:ApiKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Nginx.NginxPlus/nginxDeployments/deploy1/apiKeys/key1
        ```

        :param str resource_name: The name of the resource.
        :param ApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_date_time: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 nginx_deployment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_text: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiKeyArgs.__new__(ApiKeyArgs)

            if end_date_time is None and not opts.urn:
                raise TypeError("Missing required property 'end_date_time'")
            __props__.__dict__["end_date_time"] = end_date_time
            __props__.__dict__["name"] = name
            if nginx_deployment_id is None and not opts.urn:
                raise TypeError("Missing required property 'nginx_deployment_id'")
            __props__.__dict__["nginx_deployment_id"] = nginx_deployment_id
            if secret_text is None and not opts.urn:
                raise TypeError("Missing required property 'secret_text'")
            __props__.__dict__["secret_text"] = None if secret_text is None else pulumi.Output.secret(secret_text)
            __props__.__dict__["hint"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secretText"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ApiKey, __self__).__init__(
            'azure:nginx/apiKey:ApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            end_date_time: Optional[pulumi.Input[_builtins.str]] = None,
            hint: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            nginx_deployment_id: Optional[pulumi.Input[_builtins.str]] = None,
            secret_text: Optional[pulumi.Input[_builtins.str]] = None) -> 'ApiKey':
        """
        Get an existing ApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] end_date_time: The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        :param pulumi.Input[_builtins.str] hint: The first three characters of the secret text to help identify it in use.
        :param pulumi.Input[_builtins.str] name: The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] nginx_deployment_id: The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secret_text: The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiKeyState.__new__(_ApiKeyState)

        __props__.__dict__["end_date_time"] = end_date_time
        __props__.__dict__["hint"] = hint
        __props__.__dict__["name"] = name
        __props__.__dict__["nginx_deployment_id"] = nginx_deployment_id
        __props__.__dict__["secret_text"] = secret_text
        return ApiKey(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> pulumi.Output[_builtins.str]:
        """
        The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
        """
        return pulumi.get(self, "end_date_time")

    @_builtins.property
    @pulumi.getter
    def hint(self) -> pulumi.Output[_builtins.str]:
        """
        The first three characters of the secret text to help identify it in use.
        """
        return pulumi.get(self, "hint")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="nginxDeploymentId")
    def nginx_deployment_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "nginx_deployment_id")

    @_builtins.property
    @pulumi.getter(name="secretText")
    def secret_text(self) -> pulumi.Output[_builtins.str]:
        """
        The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
        """
        return pulumi.get(self, "secret_text")

