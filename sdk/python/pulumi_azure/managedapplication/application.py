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

__all__ = ['ApplicationArgs', 'Application']

@pulumi.input_type
class ApplicationArgs:
    def __init__(__self__, *,
                 kind: pulumi.Input[_builtins.str],
                 managed_resource_group_name: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 application_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameter_values: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input['ApplicationPlanArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Application resource.
        :param pulumi.Input[_builtins.str] kind: The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managed_resource_group_name: The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] application_definition_id: The application definition ID to deploy.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] parameter_values: The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        :param pulumi.Input['ApplicationPlanArgs'] plan: One `plan` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "kind", kind)
        pulumi.set(__self__, "managed_resource_group_name", managed_resource_group_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if application_definition_id is not None:
            pulumi.set(__self__, "application_definition_id", application_definition_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameter_values is not None:
            pulumi.set(__self__, "parameter_values", parameter_values)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> pulumi.Input[_builtins.str]:
        """
        The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "kind", value)

    @_builtins.property
    @pulumi.getter(name="managedResourceGroupName")
    def managed_resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_resource_group_name")

    @managed_resource_group_name.setter
    def managed_resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "managed_resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="applicationDefinitionId")
    def application_definition_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The application definition ID to deploy.
        """
        return pulumi.get(self, "application_definition_id")

    @application_definition_id.setter
    def application_definition_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "application_definition_id", value)

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
        Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="parameterValues")
    def parameter_values(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        """
        return pulumi.get(self, "parameter_values")

    @parameter_values.setter
    def parameter_values(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parameter_values", value)

    @_builtins.property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input['ApplicationPlanArgs']]:
        """
        One `plan` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input['ApplicationPlanArgs']]):
        pulumi.set(self, "plan", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ApplicationState:
    def __init__(__self__, *,
                 application_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 outputs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 parameter_values: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input['ApplicationPlanArgs']] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Application resources.
        :param pulumi.Input[_builtins.str] application_definition_id: The application definition ID to deploy.
        :param pulumi.Input[_builtins.str] kind: The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managed_resource_group_name: The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] outputs: The name and value pairs that define the managed application outputs.
        :param pulumi.Input[_builtins.str] parameter_values: The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        :param pulumi.Input['ApplicationPlanArgs'] plan: One `plan` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if application_definition_id is not None:
            pulumi.set(__self__, "application_definition_id", application_definition_id)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if managed_resource_group_name is not None:
            pulumi.set(__self__, "managed_resource_group_name", managed_resource_group_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if outputs is not None:
            pulumi.set(__self__, "outputs", outputs)
        if parameter_values is not None:
            pulumi.set(__self__, "parameter_values", parameter_values)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="applicationDefinitionId")
    def application_definition_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The application definition ID to deploy.
        """
        return pulumi.get(self, "application_definition_id")

    @application_definition_id.setter
    def application_definition_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "application_definition_id", value)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "kind", value)

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
    @pulumi.getter(name="managedResourceGroupName")
    def managed_resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_resource_group_name")

    @managed_resource_group_name.setter
    def managed_resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "managed_resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def outputs(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The name and value pairs that define the managed application outputs.
        """
        return pulumi.get(self, "outputs")

    @outputs.setter
    def outputs(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "outputs", value)

    @_builtins.property
    @pulumi.getter(name="parameterValues")
    def parameter_values(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        """
        return pulumi.get(self, "parameter_values")

    @parameter_values.setter
    def parameter_values(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parameter_values", value)

    @_builtins.property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input['ApplicationPlanArgs']]:
        """
        One `plan` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input['ApplicationPlanArgs']]):
        pulumi.set(self, "plan", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("azure:managedapplication/application:Application")
class Application(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameter_values: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input[Union['ApplicationPlanArgs', 'ApplicationPlanArgsDict']]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Managed Application.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_azure as azure
        import pulumi_std as std

        current = azure.core.get_client_config()
        builtin = azure.authorization.get_role_definition(name="Contributor")
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_definition = azure.managedapplication.Definition("example",
            name="examplemanagedapplicationdefinition",
            location=example.location,
            resource_group_name=example.name,
            lock_level="ReadOnly",
            package_file_uri="https://github.com/Azure/azure-managedapp-samples/raw/master/Managed Application Sample Packages/201-managed-storage-account/managedstorage.zip",
            display_name="TestManagedAppDefinition",
            description="Test Managed App Definition",
            authorizations=[{
                "service_principal_id": current.object_id,
                "role_definition_id": len(std.split(separator="/",
                    text=builtin.id).result).apply(lambda length: std.split(separator="/",
                    text=builtin.id).result[length - 1]),
            }])
        example_application = azure.managedapplication.Application("example",
            name="example-managedapplication",
            location=example.location,
            resource_group_name=example.name,
            kind="ServiceCatalog",
            managed_resource_group_name="infrastructureGroup",
            application_definition_id=example_definition.id,
            parameter_values=pulumi.Output.json_dumps({
                "location": {
                    "value": example.location,
                },
                "storageAccountNamePrefix": {
                    "value": "storeNamePrefix",
                },
                "storageAccountType": {
                    "value": "Standard_LRS",
                },
            }))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Solutions`: 2021-07-01

        ## Import

        Managed Application can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:managedapplication/application:Application example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Solutions/applications/app1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] application_definition_id: The application definition ID to deploy.
        :param pulumi.Input[_builtins.str] kind: The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managed_resource_group_name: The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] parameter_values: The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        :param pulumi.Input[Union['ApplicationPlanArgs', 'ApplicationPlanArgsDict']] plan: One `plan` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Managed Application.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_azure as azure
        import pulumi_std as std

        current = azure.core.get_client_config()
        builtin = azure.authorization.get_role_definition(name="Contributor")
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_definition = azure.managedapplication.Definition("example",
            name="examplemanagedapplicationdefinition",
            location=example.location,
            resource_group_name=example.name,
            lock_level="ReadOnly",
            package_file_uri="https://github.com/Azure/azure-managedapp-samples/raw/master/Managed Application Sample Packages/201-managed-storage-account/managedstorage.zip",
            display_name="TestManagedAppDefinition",
            description="Test Managed App Definition",
            authorizations=[{
                "service_principal_id": current.object_id,
                "role_definition_id": len(std.split(separator="/",
                    text=builtin.id).result).apply(lambda length: std.split(separator="/",
                    text=builtin.id).result[length - 1]),
            }])
        example_application = azure.managedapplication.Application("example",
            name="example-managedapplication",
            location=example.location,
            resource_group_name=example.name,
            kind="ServiceCatalog",
            managed_resource_group_name="infrastructureGroup",
            application_definition_id=example_definition.id,
            parameter_values=pulumi.Output.json_dumps({
                "location": {
                    "value": example.location,
                },
                "storageAccountNamePrefix": {
                    "value": "storeNamePrefix",
                },
                "storageAccountType": {
                    "value": "Standard_LRS",
                },
            }))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Solutions`: 2021-07-01

        ## Import

        Managed Application can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:managedapplication/application:Application example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Solutions/applications/app1
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameter_values: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input[Union['ApplicationPlanArgs', 'ApplicationPlanArgsDict']]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationArgs.__new__(ApplicationArgs)

            __props__.__dict__["application_definition_id"] = application_definition_id
            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__.__dict__["kind"] = kind
            __props__.__dict__["location"] = location
            if managed_resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'managed_resource_group_name'")
            __props__.__dict__["managed_resource_group_name"] = managed_resource_group_name
            __props__.__dict__["name"] = name
            __props__.__dict__["parameter_values"] = parameter_values
            __props__.__dict__["plan"] = plan
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["outputs"] = None
        super(Application, __self__).__init__(
            'azure:managedapplication/application:Application',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
            kind: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            managed_resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            outputs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            parameter_values: Optional[pulumi.Input[_builtins.str]] = None,
            plan: Optional[pulumi.Input[Union['ApplicationPlanArgs', 'ApplicationPlanArgsDict']]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'Application':
        """
        Get an existing Application resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] application_definition_id: The application definition ID to deploy.
        :param pulumi.Input[_builtins.str] kind: The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managed_resource_group_name: The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] outputs: The name and value pairs that define the managed application outputs.
        :param pulumi.Input[_builtins.str] parameter_values: The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        :param pulumi.Input[Union['ApplicationPlanArgs', 'ApplicationPlanArgsDict']] plan: One `plan` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationState.__new__(_ApplicationState)

        __props__.__dict__["application_definition_id"] = application_definition_id
        __props__.__dict__["kind"] = kind
        __props__.__dict__["location"] = location
        __props__.__dict__["managed_resource_group_name"] = managed_resource_group_name
        __props__.__dict__["name"] = name
        __props__.__dict__["outputs"] = outputs
        __props__.__dict__["parameter_values"] = parameter_values
        __props__.__dict__["plan"] = plan
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        return Application(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="applicationDefinitionId")
    def application_definition_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The application definition ID to deploy.
        """
        return pulumi.get(self, "application_definition_id")

    @_builtins.property
    @pulumi.getter
    def kind(self) -> pulumi.Output[_builtins.str]:
        """
        The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "kind")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="managedResourceGroupName")
    def managed_resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_resource_group_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Managed Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def outputs(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        The name and value pairs that define the managed application outputs.
        """
        return pulumi.get(self, "outputs")

    @_builtins.property
    @pulumi.getter(name="parameterValues")
    def parameter_values(self) -> pulumi.Output[_builtins.str]:
        """
        The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
        """
        return pulumi.get(self, "parameter_values")

    @_builtins.property
    @pulumi.getter
    def plan(self) -> pulumi.Output[Optional['outputs.ApplicationPlan']]:
        """
        One `plan` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "plan")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

