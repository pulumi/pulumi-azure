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

__all__ = ['DefinitionArgs', 'Definition']

@pulumi.input_type
class DefinitionArgs:
    def __init__(__self__, *,
                 authorizations: pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]],
                 managing_tenant_id: pulumi.Input[_builtins.str],
                 scope: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eligible_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]]] = None,
                 lighthouse_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input['DefinitionPlanArgs']] = None):
        """
        The set of arguments for constructing a Definition resource.
        :param pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]] authorizations: An `authorization` block as defined below.
        :param pulumi.Input[_builtins.str] managing_tenant_id: The ID of the managing tenant. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] scope: The ID of the managed subscription. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: A description of the Lighthouse Definition.
        :param pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]] eligible_authorizations: An `eligible_authorization` block as defined below.
        :param pulumi.Input[_builtins.str] lighthouse_definition_id: A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        :param pulumi.Input['DefinitionPlanArgs'] plan: A `plan` block as defined below.
        """
        pulumi.set(__self__, "authorizations", authorizations)
        pulumi.set(__self__, "managing_tenant_id", managing_tenant_id)
        pulumi.set(__self__, "scope", scope)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if eligible_authorizations is not None:
            pulumi.set(__self__, "eligible_authorizations", eligible_authorizations)
        if lighthouse_definition_id is not None:
            pulumi.set(__self__, "lighthouse_definition_id", lighthouse_definition_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)

    @_builtins.property
    @pulumi.getter
    def authorizations(self) -> pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]]:
        """
        An `authorization` block as defined below.
        """
        return pulumi.get(self, "authorizations")

    @authorizations.setter
    def authorizations(self, value: pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]]):
        pulumi.set(self, "authorizations", value)

    @_builtins.property
    @pulumi.getter(name="managingTenantId")
    def managing_tenant_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the managing tenant. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managing_tenant_id")

    @managing_tenant_id.setter
    def managing_tenant_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "managing_tenant_id", value)

    @_builtins.property
    @pulumi.getter
    def scope(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the managed subscription. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "scope", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the Lighthouse Definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="eligibleAuthorizations")
    def eligible_authorizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]]]:
        """
        An `eligible_authorization` block as defined below.
        """
        return pulumi.get(self, "eligible_authorizations")

    @eligible_authorizations.setter
    def eligible_authorizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]]]):
        pulumi.set(self, "eligible_authorizations", value)

    @_builtins.property
    @pulumi.getter(name="lighthouseDefinitionId")
    def lighthouse_definition_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lighthouse_definition_id")

    @lighthouse_definition_id.setter
    def lighthouse_definition_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lighthouse_definition_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input['DefinitionPlanArgs']]:
        """
        A `plan` block as defined below.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input['DefinitionPlanArgs']]):
        pulumi.set(self, "plan", value)


@pulumi.input_type
class _DefinitionState:
    def __init__(__self__, *,
                 authorizations: Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eligible_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]]] = None,
                 lighthouse_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 managing_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input['DefinitionPlanArgs']] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Definition resources.
        :param pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]] authorizations: An `authorization` block as defined below.
        :param pulumi.Input[_builtins.str] description: A description of the Lighthouse Definition.
        :param pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]] eligible_authorizations: An `eligible_authorization` block as defined below.
        :param pulumi.Input[_builtins.str] lighthouse_definition_id: A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managing_tenant_id: The ID of the managing tenant. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        :param pulumi.Input['DefinitionPlanArgs'] plan: A `plan` block as defined below.
        :param pulumi.Input[_builtins.str] scope: The ID of the managed subscription. Changing this forces a new resource to be created.
        """
        if authorizations is not None:
            pulumi.set(__self__, "authorizations", authorizations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if eligible_authorizations is not None:
            pulumi.set(__self__, "eligible_authorizations", eligible_authorizations)
        if lighthouse_definition_id is not None:
            pulumi.set(__self__, "lighthouse_definition_id", lighthouse_definition_id)
        if managing_tenant_id is not None:
            pulumi.set(__self__, "managing_tenant_id", managing_tenant_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @_builtins.property
    @pulumi.getter
    def authorizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]]]:
        """
        An `authorization` block as defined below.
        """
        return pulumi.get(self, "authorizations")

    @authorizations.setter
    def authorizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionAuthorizationArgs']]]]):
        pulumi.set(self, "authorizations", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the Lighthouse Definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="eligibleAuthorizations")
    def eligible_authorizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]]]:
        """
        An `eligible_authorization` block as defined below.
        """
        return pulumi.get(self, "eligible_authorizations")

    @eligible_authorizations.setter
    def eligible_authorizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefinitionEligibleAuthorizationArgs']]]]):
        pulumi.set(self, "eligible_authorizations", value)

    @_builtins.property
    @pulumi.getter(name="lighthouseDefinitionId")
    def lighthouse_definition_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lighthouse_definition_id")

    @lighthouse_definition_id.setter
    def lighthouse_definition_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lighthouse_definition_id", value)

    @_builtins.property
    @pulumi.getter(name="managingTenantId")
    def managing_tenant_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the managing tenant. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managing_tenant_id")

    @managing_tenant_id.setter
    def managing_tenant_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "managing_tenant_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input['DefinitionPlanArgs']]:
        """
        A `plan` block as defined below.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input['DefinitionPlanArgs']]):
        pulumi.set(self, "plan", value)

    @_builtins.property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the managed subscription. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scope", value)


@pulumi.type_token("azure:lighthouse/definition:Definition")
class Definition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DefinitionAuthorizationArgs', 'DefinitionAuthorizationArgsDict']]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eligible_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DefinitionEligibleAuthorizationArgs', 'DefinitionEligibleAuthorizationArgsDict']]]]] = None,
                 lighthouse_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 managing_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input[Union['DefinitionPlanArgs', 'DefinitionPlanArgsDict']]] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Definition.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        contributor = azure.authorization.get_role_definition(role_definition_id="b24988ac-6180-42a0-ab88-20f7382dd24c")
        example = azure.lighthouse.Definition("example",
            name="Sample definition",
            description="This is a lighthouse definition created IaC",
            managing_tenant_id="00000000-0000-0000-0000-000000000000",
            scope="/subscriptions/00000000-0000-0000-0000-000000000000",
            authorizations=[{
                "principal_id": "00000000-0000-0000-0000-000000000000",
                "role_definition_id": contributor.role_definition_id,
                "principal_display_name": "Tier 1 Support",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ManagedServices`: 2022-10-01

        ## Import

        Lighthouse Definitions can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:lighthouse/definition:Definition example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.ManagedServices/registrationDefinitions/00000000-0000-0000-0000-000000000000
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DefinitionAuthorizationArgs', 'DefinitionAuthorizationArgsDict']]]] authorizations: An `authorization` block as defined below.
        :param pulumi.Input[_builtins.str] description: A description of the Lighthouse Definition.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DefinitionEligibleAuthorizationArgs', 'DefinitionEligibleAuthorizationArgsDict']]]] eligible_authorizations: An `eligible_authorization` block as defined below.
        :param pulumi.Input[_builtins.str] lighthouse_definition_id: A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managing_tenant_id: The ID of the managing tenant. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['DefinitionPlanArgs', 'DefinitionPlanArgsDict']] plan: A `plan` block as defined below.
        :param pulumi.Input[_builtins.str] scope: The ID of the managed subscription. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Definition.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        contributor = azure.authorization.get_role_definition(role_definition_id="b24988ac-6180-42a0-ab88-20f7382dd24c")
        example = azure.lighthouse.Definition("example",
            name="Sample definition",
            description="This is a lighthouse definition created IaC",
            managing_tenant_id="00000000-0000-0000-0000-000000000000",
            scope="/subscriptions/00000000-0000-0000-0000-000000000000",
            authorizations=[{
                "principal_id": "00000000-0000-0000-0000-000000000000",
                "role_definition_id": contributor.role_definition_id,
                "principal_display_name": "Tier 1 Support",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ManagedServices`: 2022-10-01

        ## Import

        Lighthouse Definitions can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:lighthouse/definition:Definition example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.ManagedServices/registrationDefinitions/00000000-0000-0000-0000-000000000000
        ```

        :param str resource_name: The name of the resource.
        :param DefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DefinitionAuthorizationArgs', 'DefinitionAuthorizationArgsDict']]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eligible_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DefinitionEligibleAuthorizationArgs', 'DefinitionEligibleAuthorizationArgsDict']]]]] = None,
                 lighthouse_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                 managing_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 plan: Optional[pulumi.Input[Union['DefinitionPlanArgs', 'DefinitionPlanArgsDict']]] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DefinitionArgs.__new__(DefinitionArgs)

            if authorizations is None and not opts.urn:
                raise TypeError("Missing required property 'authorizations'")
            __props__.__dict__["authorizations"] = authorizations
            __props__.__dict__["description"] = description
            __props__.__dict__["eligible_authorizations"] = eligible_authorizations
            __props__.__dict__["lighthouse_definition_id"] = lighthouse_definition_id
            if managing_tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'managing_tenant_id'")
            __props__.__dict__["managing_tenant_id"] = managing_tenant_id
            __props__.__dict__["name"] = name
            __props__.__dict__["plan"] = plan
            if scope is None and not opts.urn:
                raise TypeError("Missing required property 'scope'")
            __props__.__dict__["scope"] = scope
        super(Definition, __self__).__init__(
            'azure:lighthouse/definition:Definition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DefinitionAuthorizationArgs', 'DefinitionAuthorizationArgsDict']]]]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            eligible_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DefinitionEligibleAuthorizationArgs', 'DefinitionEligibleAuthorizationArgsDict']]]]] = None,
            lighthouse_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
            managing_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            plan: Optional[pulumi.Input[Union['DefinitionPlanArgs', 'DefinitionPlanArgsDict']]] = None,
            scope: Optional[pulumi.Input[_builtins.str]] = None) -> 'Definition':
        """
        Get an existing Definition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DefinitionAuthorizationArgs', 'DefinitionAuthorizationArgsDict']]]] authorizations: An `authorization` block as defined below.
        :param pulumi.Input[_builtins.str] description: A description of the Lighthouse Definition.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DefinitionEligibleAuthorizationArgs', 'DefinitionEligibleAuthorizationArgsDict']]]] eligible_authorizations: An `eligible_authorization` block as defined below.
        :param pulumi.Input[_builtins.str] lighthouse_definition_id: A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] managing_tenant_id: The ID of the managing tenant. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['DefinitionPlanArgs', 'DefinitionPlanArgsDict']] plan: A `plan` block as defined below.
        :param pulumi.Input[_builtins.str] scope: The ID of the managed subscription. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DefinitionState.__new__(_DefinitionState)

        __props__.__dict__["authorizations"] = authorizations
        __props__.__dict__["description"] = description
        __props__.__dict__["eligible_authorizations"] = eligible_authorizations
        __props__.__dict__["lighthouse_definition_id"] = lighthouse_definition_id
        __props__.__dict__["managing_tenant_id"] = managing_tenant_id
        __props__.__dict__["name"] = name
        __props__.__dict__["plan"] = plan
        __props__.__dict__["scope"] = scope
        return Definition(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def authorizations(self) -> pulumi.Output[Sequence['outputs.DefinitionAuthorization']]:
        """
        An `authorization` block as defined below.
        """
        return pulumi.get(self, "authorizations")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description of the Lighthouse Definition.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="eligibleAuthorizations")
    def eligible_authorizations(self) -> pulumi.Output[Optional[Sequence['outputs.DefinitionEligibleAuthorization']]]:
        """
        An `eligible_authorization` block as defined below.
        """
        return pulumi.get(self, "eligible_authorizations")

    @_builtins.property
    @pulumi.getter(name="lighthouseDefinitionId")
    def lighthouse_definition_id(self) -> pulumi.Output[_builtins.str]:
        """
        A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "lighthouse_definition_id")

    @_builtins.property
    @pulumi.getter(name="managingTenantId")
    def managing_tenant_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the managing tenant. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managing_tenant_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Lighthouse Definition. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def plan(self) -> pulumi.Output[Optional['outputs.DefinitionPlan']]:
        """
        A `plan` block as defined below.
        """
        return pulumi.get(self, "plan")

    @_builtins.property
    @pulumi.getter
    def scope(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the managed subscription. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "scope")

