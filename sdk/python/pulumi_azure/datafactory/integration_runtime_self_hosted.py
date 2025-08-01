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

__all__ = ['IntegrationRuntimeSelfHostedArgs', 'IntegrationRuntimeSelfHosted']

@pulumi.input_type
class IntegrationRuntimeSelfHostedArgs:
    def __init__(__self__, *,
                 data_factory_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 rbac_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]]] = None,
                 self_contained_interactive_authoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a IntegrationRuntimeSelfHosted resource.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        :param pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]] rbac_authorizations: A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] self_contained_interactive_authoring_enabled: Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        pulumi.set(__self__, "data_factory_id", data_factory_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rbac_authorizations is not None:
            pulumi.set(__self__, "rbac_authorizations", rbac_authorizations)
        if self_contained_interactive_authoring_enabled is not None:
            pulumi.set(__self__, "self_contained_interactive_authoring_enabled", self_contained_interactive_authoring_enabled)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @data_factory_id.setter
    def data_factory_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_factory_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="rbacAuthorizations")
    def rbac_authorizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]]]:
        """
        A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "rbac_authorizations")

    @rbac_authorizations.setter
    def rbac_authorizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]]]):
        pulumi.set(self, "rbac_authorizations", value)

    @_builtins.property
    @pulumi.getter(name="selfContainedInteractiveAuthoringEnabled")
    def self_contained_interactive_authoring_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        return pulumi.get(self, "self_contained_interactive_authoring_enabled")

    @self_contained_interactive_authoring_enabled.setter
    def self_contained_interactive_authoring_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "self_contained_interactive_authoring_enabled", value)


@pulumi.input_type
class _IntegrationRuntimeSelfHostedState:
    def __init__(__self__, *,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 primary_authorization_key: Optional[pulumi.Input[_builtins.str]] = None,
                 rbac_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]]] = None,
                 secondary_authorization_key: Optional[pulumi.Input[_builtins.str]] = None,
                 self_contained_interactive_authoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering IntegrationRuntimeSelfHosted resources.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] primary_authorization_key: The primary integration runtime authentication key.
        :param pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]] rbac_authorizations: A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secondary_authorization_key: The secondary integration runtime authentication key.
        :param pulumi.Input[_builtins.bool] self_contained_interactive_authoring_enabled: Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        if data_factory_id is not None:
            pulumi.set(__self__, "data_factory_id", data_factory_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_authorization_key is not None:
            pulumi.set(__self__, "primary_authorization_key", primary_authorization_key)
        if rbac_authorizations is not None:
            pulumi.set(__self__, "rbac_authorizations", rbac_authorizations)
        if secondary_authorization_key is not None:
            pulumi.set(__self__, "secondary_authorization_key", secondary_authorization_key)
        if self_contained_interactive_authoring_enabled is not None:
            pulumi.set(__self__, "self_contained_interactive_authoring_enabled", self_contained_interactive_authoring_enabled)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @data_factory_id.setter
    def data_factory_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_factory_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="primaryAuthorizationKey")
    def primary_authorization_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The primary integration runtime authentication key.
        """
        return pulumi.get(self, "primary_authorization_key")

    @primary_authorization_key.setter
    def primary_authorization_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "primary_authorization_key", value)

    @_builtins.property
    @pulumi.getter(name="rbacAuthorizations")
    def rbac_authorizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]]]:
        """
        A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "rbac_authorizations")

    @rbac_authorizations.setter
    def rbac_authorizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationRuntimeSelfHostedRbacAuthorizationArgs']]]]):
        pulumi.set(self, "rbac_authorizations", value)

    @_builtins.property
    @pulumi.getter(name="secondaryAuthorizationKey")
    def secondary_authorization_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secondary integration runtime authentication key.
        """
        return pulumi.get(self, "secondary_authorization_key")

    @secondary_authorization_key.setter
    def secondary_authorization_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_authorization_key", value)

    @_builtins.property
    @pulumi.getter(name="selfContainedInteractiveAuthoringEnabled")
    def self_contained_interactive_authoring_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        return pulumi.get(self, "self_contained_interactive_authoring_enabled")

    @self_contained_interactive_authoring_enabled.setter
    def self_contained_interactive_authoring_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "self_contained_interactive_authoring_enabled", value)


@pulumi.type_token("azure:datafactory/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted")
class IntegrationRuntimeSelfHosted(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 rbac_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IntegrationRuntimeSelfHostedRbacAuthorizationArgs', 'IntegrationRuntimeSelfHostedRbacAuthorizationArgsDict']]]]] = None,
                 self_contained_interactive_authoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        Manages a Data Factory Self-hosted Integration Runtime.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_factory = azure.datafactory.Factory("example",
            name="example",
            location=example.location,
            resource_group_name=example.name)
        example_integration_runtime_self_hosted = azure.datafactory.IntegrationRuntimeSelfHosted("example",
            name="example",
            data_factory_id=example_factory.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DataFactory`: 2018-06-01

        ## Import

        Data Factories can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datafactory/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/integrationRuntimes/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['IntegrationRuntimeSelfHostedRbacAuthorizationArgs', 'IntegrationRuntimeSelfHostedRbacAuthorizationArgsDict']]]] rbac_authorizations: A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] self_contained_interactive_authoring_enabled: Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationRuntimeSelfHostedArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Data Factory Self-hosted Integration Runtime.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_factory = azure.datafactory.Factory("example",
            name="example",
            location=example.location,
            resource_group_name=example.name)
        example_integration_runtime_self_hosted = azure.datafactory.IntegrationRuntimeSelfHosted("example",
            name="example",
            data_factory_id=example_factory.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DataFactory`: 2018-06-01

        ## Import

        Data Factories can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datafactory/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/integrationRuntimes/example
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationRuntimeSelfHostedArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationRuntimeSelfHostedArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 rbac_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IntegrationRuntimeSelfHostedRbacAuthorizationArgs', 'IntegrationRuntimeSelfHostedRbacAuthorizationArgsDict']]]]] = None,
                 self_contained_interactive_authoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationRuntimeSelfHostedArgs.__new__(IntegrationRuntimeSelfHostedArgs)

            if data_factory_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_factory_id'")
            __props__.__dict__["data_factory_id"] = data_factory_id
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["rbac_authorizations"] = rbac_authorizations
            __props__.__dict__["self_contained_interactive_authoring_enabled"] = self_contained_interactive_authoring_enabled
            __props__.__dict__["primary_authorization_key"] = None
            __props__.__dict__["secondary_authorization_key"] = None
        super(IntegrationRuntimeSelfHosted, __self__).__init__(
            'azure:datafactory/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            primary_authorization_key: Optional[pulumi.Input[_builtins.str]] = None,
            rbac_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IntegrationRuntimeSelfHostedRbacAuthorizationArgs', 'IntegrationRuntimeSelfHostedRbacAuthorizationArgsDict']]]]] = None,
            secondary_authorization_key: Optional[pulumi.Input[_builtins.str]] = None,
            self_contained_interactive_authoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None) -> 'IntegrationRuntimeSelfHosted':
        """
        Get an existing IntegrationRuntimeSelfHosted resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] primary_authorization_key: The primary integration runtime authentication key.
        :param pulumi.Input[Sequence[pulumi.Input[Union['IntegrationRuntimeSelfHostedRbacAuthorizationArgs', 'IntegrationRuntimeSelfHostedRbacAuthorizationArgsDict']]]] rbac_authorizations: A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] secondary_authorization_key: The secondary integration runtime authentication key.
        :param pulumi.Input[_builtins.bool] self_contained_interactive_authoring_enabled: Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationRuntimeSelfHostedState.__new__(_IntegrationRuntimeSelfHostedState)

        __props__.__dict__["data_factory_id"] = data_factory_id
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["primary_authorization_key"] = primary_authorization_key
        __props__.__dict__["rbac_authorizations"] = rbac_authorizations
        __props__.__dict__["secondary_authorization_key"] = secondary_authorization_key
        __props__.__dict__["self_contained_interactive_authoring_enabled"] = self_contained_interactive_authoring_enabled
        return IntegrationRuntimeSelfHosted(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryAuthorizationKey")
    def primary_authorization_key(self) -> pulumi.Output[_builtins.str]:
        """
        The primary integration runtime authentication key.
        """
        return pulumi.get(self, "primary_authorization_key")

    @_builtins.property
    @pulumi.getter(name="rbacAuthorizations")
    def rbac_authorizations(self) -> pulumi.Output[Optional[Sequence['outputs.IntegrationRuntimeSelfHostedRbacAuthorization']]]:
        """
        A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "rbac_authorizations")

    @_builtins.property
    @pulumi.getter(name="secondaryAuthorizationKey")
    def secondary_authorization_key(self) -> pulumi.Output[_builtins.str]:
        """
        The secondary integration runtime authentication key.
        """
        return pulumi.get(self, "secondary_authorization_key")

    @_builtins.property
    @pulumi.getter(name="selfContainedInteractiveAuthoringEnabled")
    def self_contained_interactive_authoring_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Specifies whether enable interactive authoring function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
        """
        return pulumi.get(self, "self_contained_interactive_authoring_enabled")

