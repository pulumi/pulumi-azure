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

__all__ = ['SpringCloudActiveDeploymentArgs', 'SpringCloudActiveDeployment']

@pulumi.input_type
class SpringCloudActiveDeploymentArgs:
    def __init__(__self__, *,
                 deployment_name: pulumi.Input[_builtins.str],
                 spring_cloud_app_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a SpringCloudActiveDeployment resource.
        :param pulumi.Input[_builtins.str] deployment_name: Specifies the name of Spring Cloud Deployment which is going to be active.
        :param pulumi.Input[_builtins.str] spring_cloud_app_id: Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "deployment_name", deployment_name)
        pulumi.set(__self__, "spring_cloud_app_id", spring_cloud_app_id)

    @_builtins.property
    @pulumi.getter(name="deploymentName")
    def deployment_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of Spring Cloud Deployment which is going to be active.
        """
        return pulumi.get(self, "deployment_name")

    @deployment_name.setter
    def deployment_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "deployment_name", value)

    @_builtins.property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @spring_cloud_app_id.setter
    def spring_cloud_app_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "spring_cloud_app_id", value)


@pulumi.input_type
class _SpringCloudActiveDeploymentState:
    def __init__(__self__, *,
                 deployment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SpringCloudActiveDeployment resources.
        :param pulumi.Input[_builtins.str] deployment_name: Specifies the name of Spring Cloud Deployment which is going to be active.
        :param pulumi.Input[_builtins.str] spring_cloud_app_id: Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        if deployment_name is not None:
            pulumi.set(__self__, "deployment_name", deployment_name)
        if spring_cloud_app_id is not None:
            pulumi.set(__self__, "spring_cloud_app_id", spring_cloud_app_id)

    @_builtins.property
    @pulumi.getter(name="deploymentName")
    def deployment_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of Spring Cloud Deployment which is going to be active.
        """
        return pulumi.get(self, "deployment_name")

    @deployment_name.setter
    def deployment_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "deployment_name", value)

    @_builtins.property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @spring_cloud_app_id.setter
    def spring_cloud_app_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "spring_cloud_app_id", value)


@pulumi.type_token("azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment")
class SpringCloudActiveDeployment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deployment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an Active Azure Spring Cloud Deployment.

        !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `appplatform.SpringCloudActiveDeployment` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("example",
            name="example-springcloud",
            resource_group_name=example.name,
            location=example.location)
        example_spring_cloud_app = azure.appplatform.SpringCloudApp("example",
            name="example-springcloudapp",
            resource_group_name=example.name,
            service_name=example_spring_cloud_service.name,
            identity={
                "type": "SystemAssigned",
            })
        example_spring_cloud_java_deployment = azure.appplatform.SpringCloudJavaDeployment("example",
            name="deploy1",
            spring_cloud_app_id=example_spring_cloud_app.id,
            instance_count=2,
            jvm_options="-XX:+PrintGC",
            runtime_version="Java_11",
            quota={
                "cpu": "2",
                "memory": "4Gi",
            },
            environment_variables={
                "Env": "Staging",
            })
        example_spring_cloud_active_deployment = azure.appplatform.SpringCloudActiveDeployment("example",
            spring_cloud_app_id=example_spring_cloud_app.id,
            deployment_name=example_spring_cloud_java_deployment.name)
        ```

        ## Import

        Spring Cloud Active Deployment can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/spring/service1/apps/app1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] deployment_name: Specifies the name of Spring Cloud Deployment which is going to be active.
        :param pulumi.Input[_builtins.str] spring_cloud_app_id: Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpringCloudActiveDeploymentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Active Azure Spring Cloud Deployment.

        !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `appplatform.SpringCloudActiveDeployment` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("example",
            name="example-springcloud",
            resource_group_name=example.name,
            location=example.location)
        example_spring_cloud_app = azure.appplatform.SpringCloudApp("example",
            name="example-springcloudapp",
            resource_group_name=example.name,
            service_name=example_spring_cloud_service.name,
            identity={
                "type": "SystemAssigned",
            })
        example_spring_cloud_java_deployment = azure.appplatform.SpringCloudJavaDeployment("example",
            name="deploy1",
            spring_cloud_app_id=example_spring_cloud_app.id,
            instance_count=2,
            jvm_options="-XX:+PrintGC",
            runtime_version="Java_11",
            quota={
                "cpu": "2",
                "memory": "4Gi",
            },
            environment_variables={
                "Env": "Staging",
            })
        example_spring_cloud_active_deployment = azure.appplatform.SpringCloudActiveDeployment("example",
            spring_cloud_app_id=example_spring_cloud_app.id,
            deployment_name=example_spring_cloud_java_deployment.name)
        ```

        ## Import

        Spring Cloud Active Deployment can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/spring/service1/apps/app1
        ```

        :param str resource_name: The name of the resource.
        :param SpringCloudActiveDeploymentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpringCloudActiveDeploymentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deployment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpringCloudActiveDeploymentArgs.__new__(SpringCloudActiveDeploymentArgs)

            if deployment_name is None and not opts.urn:
                raise TypeError("Missing required property 'deployment_name'")
            __props__.__dict__["deployment_name"] = deployment_name
            if spring_cloud_app_id is None and not opts.urn:
                raise TypeError("Missing required property 'spring_cloud_app_id'")
            __props__.__dict__["spring_cloud_app_id"] = spring_cloud_app_id
        super(SpringCloudActiveDeployment, __self__).__init__(
            'azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            deployment_name: Optional[pulumi.Input[_builtins.str]] = None,
            spring_cloud_app_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'SpringCloudActiveDeployment':
        """
        Get an existing SpringCloudActiveDeployment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] deployment_name: Specifies the name of Spring Cloud Deployment which is going to be active.
        :param pulumi.Input[_builtins.str] spring_cloud_app_id: Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpringCloudActiveDeploymentState.__new__(_SpringCloudActiveDeploymentState)

        __props__.__dict__["deployment_name"] = deployment_name
        __props__.__dict__["spring_cloud_app_id"] = spring_cloud_app_id
        return SpringCloudActiveDeployment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="deploymentName")
    def deployment_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of Spring Cloud Deployment which is going to be active.
        """
        return pulumi.get(self, "deployment_name")

    @_builtins.property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

