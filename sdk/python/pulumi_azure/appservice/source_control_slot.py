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

__all__ = ['SourceControlSlotArgs', 'SourceControlSlot']

@pulumi.input_type
class SourceControlSlotArgs:
    def __init__(__self__, *,
                 slot_id: pulumi.Input[_builtins.str],
                 branch: Optional[pulumi.Input[_builtins.str]] = None,
                 github_action_configuration: Optional[pulumi.Input['SourceControlSlotGithubActionConfigurationArgs']] = None,
                 repo_url: Optional[pulumi.Input[_builtins.str]] = None,
                 rollback_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_local_git: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_manual_integration: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_mercurial: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a SourceControlSlot resource.
        :param pulumi.Input[_builtins.str] slot_id: The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.
               
               > **Note:** Function App Slots are not supported at this time.
        :param pulumi.Input[_builtins.str] branch: The URL for the repository. Changing this forces a new resource to be created.
        :param pulumi.Input['SourceControlSlotGithubActionConfigurationArgs'] github_action_configuration: A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] repo_url: The branch name to use for deployments. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] rollback_enabled: Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_local_git: Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_manual_integration: Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_mercurial: The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "slot_id", slot_id)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if github_action_configuration is not None:
            pulumi.set(__self__, "github_action_configuration", github_action_configuration)
        if repo_url is not None:
            pulumi.set(__self__, "repo_url", repo_url)
        if rollback_enabled is not None:
            pulumi.set(__self__, "rollback_enabled", rollback_enabled)
        if use_local_git is not None:
            pulumi.set(__self__, "use_local_git", use_local_git)
        if use_manual_integration is not None:
            pulumi.set(__self__, "use_manual_integration", use_manual_integration)
        if use_mercurial is not None:
            pulumi.set(__self__, "use_mercurial", use_mercurial)

    @_builtins.property
    @pulumi.getter(name="slotId")
    def slot_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.

        > **Note:** Function App Slots are not supported at this time.
        """
        return pulumi.get(self, "slot_id")

    @slot_id.setter
    def slot_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "slot_id", value)

    @_builtins.property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL for the repository. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "branch", value)

    @_builtins.property
    @pulumi.getter(name="githubActionConfiguration")
    def github_action_configuration(self) -> Optional[pulumi.Input['SourceControlSlotGithubActionConfigurationArgs']]:
        """
        A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "github_action_configuration")

    @github_action_configuration.setter
    def github_action_configuration(self, value: Optional[pulumi.Input['SourceControlSlotGithubActionConfigurationArgs']]):
        pulumi.set(self, "github_action_configuration", value)

    @_builtins.property
    @pulumi.getter(name="repoUrl")
    def repo_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The branch name to use for deployments. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "repo_url")

    @repo_url.setter
    def repo_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_url", value)

    @_builtins.property
    @pulumi.getter(name="rollbackEnabled")
    def rollback_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "rollback_enabled")

    @rollback_enabled.setter
    def rollback_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "rollback_enabled", value)

    @_builtins.property
    @pulumi.getter(name="useLocalGit")
    def use_local_git(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_local_git")

    @use_local_git.setter
    def use_local_git(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "use_local_git", value)

    @_builtins.property
    @pulumi.getter(name="useManualIntegration")
    def use_manual_integration(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_manual_integration")

    @use_manual_integration.setter
    def use_manual_integration(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "use_manual_integration", value)

    @_builtins.property
    @pulumi.getter(name="useMercurial")
    def use_mercurial(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_mercurial")

    @use_mercurial.setter
    def use_mercurial(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "use_mercurial", value)


@pulumi.input_type
class _SourceControlSlotState:
    def __init__(__self__, *,
                 branch: Optional[pulumi.Input[_builtins.str]] = None,
                 github_action_configuration: Optional[pulumi.Input['SourceControlSlotGithubActionConfigurationArgs']] = None,
                 repo_url: Optional[pulumi.Input[_builtins.str]] = None,
                 rollback_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 scm_type: Optional[pulumi.Input[_builtins.str]] = None,
                 slot_id: Optional[pulumi.Input[_builtins.str]] = None,
                 use_local_git: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_manual_integration: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_mercurial: Optional[pulumi.Input[_builtins.bool]] = None,
                 uses_github_action: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering SourceControlSlot resources.
        :param pulumi.Input[_builtins.str] branch: The URL for the repository. Changing this forces a new resource to be created.
        :param pulumi.Input['SourceControlSlotGithubActionConfigurationArgs'] github_action_configuration: A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] repo_url: The branch name to use for deployments. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] rollback_enabled: Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] scm_type: The SCM Type in use. This value is decoded by the service from the repository information supplied.
        :param pulumi.Input[_builtins.str] slot_id: The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.
               
               > **Note:** Function App Slots are not supported at this time.
        :param pulumi.Input[_builtins.bool] use_local_git: Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_manual_integration: Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_mercurial: The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] uses_github_action: Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
        """
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if github_action_configuration is not None:
            pulumi.set(__self__, "github_action_configuration", github_action_configuration)
        if repo_url is not None:
            pulumi.set(__self__, "repo_url", repo_url)
        if rollback_enabled is not None:
            pulumi.set(__self__, "rollback_enabled", rollback_enabled)
        if scm_type is not None:
            pulumi.set(__self__, "scm_type", scm_type)
        if slot_id is not None:
            pulumi.set(__self__, "slot_id", slot_id)
        if use_local_git is not None:
            pulumi.set(__self__, "use_local_git", use_local_git)
        if use_manual_integration is not None:
            pulumi.set(__self__, "use_manual_integration", use_manual_integration)
        if use_mercurial is not None:
            pulumi.set(__self__, "use_mercurial", use_mercurial)
        if uses_github_action is not None:
            pulumi.set(__self__, "uses_github_action", uses_github_action)

    @_builtins.property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL for the repository. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "branch", value)

    @_builtins.property
    @pulumi.getter(name="githubActionConfiguration")
    def github_action_configuration(self) -> Optional[pulumi.Input['SourceControlSlotGithubActionConfigurationArgs']]:
        """
        A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "github_action_configuration")

    @github_action_configuration.setter
    def github_action_configuration(self, value: Optional[pulumi.Input['SourceControlSlotGithubActionConfigurationArgs']]):
        pulumi.set(self, "github_action_configuration", value)

    @_builtins.property
    @pulumi.getter(name="repoUrl")
    def repo_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The branch name to use for deployments. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "repo_url")

    @repo_url.setter
    def repo_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_url", value)

    @_builtins.property
    @pulumi.getter(name="rollbackEnabled")
    def rollback_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "rollback_enabled")

    @rollback_enabled.setter
    def rollback_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "rollback_enabled", value)

    @_builtins.property
    @pulumi.getter(name="scmType")
    def scm_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The SCM Type in use. This value is decoded by the service from the repository information supplied.
        """
        return pulumi.get(self, "scm_type")

    @scm_type.setter
    def scm_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scm_type", value)

    @_builtins.property
    @pulumi.getter(name="slotId")
    def slot_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.

        > **Note:** Function App Slots are not supported at this time.
        """
        return pulumi.get(self, "slot_id")

    @slot_id.setter
    def slot_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "slot_id", value)

    @_builtins.property
    @pulumi.getter(name="useLocalGit")
    def use_local_git(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_local_git")

    @use_local_git.setter
    def use_local_git(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "use_local_git", value)

    @_builtins.property
    @pulumi.getter(name="useManualIntegration")
    def use_manual_integration(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_manual_integration")

    @use_manual_integration.setter
    def use_manual_integration(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "use_manual_integration", value)

    @_builtins.property
    @pulumi.getter(name="useMercurial")
    def use_mercurial(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_mercurial")

    @use_mercurial.setter
    def use_mercurial(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "use_mercurial", value)

    @_builtins.property
    @pulumi.getter(name="usesGithubAction")
    def uses_github_action(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
        """
        return pulumi.get(self, "uses_github_action")

    @uses_github_action.setter
    def uses_github_action(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "uses_github_action", value)


@pulumi.type_token("azure:appservice/sourceControlSlot:SourceControlSlot")
class SourceControlSlot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branch: Optional[pulumi.Input[_builtins.str]] = None,
                 github_action_configuration: Optional[pulumi.Input[Union['SourceControlSlotGithubActionConfigurationArgs', 'SourceControlSlotGithubActionConfigurationArgsDict']]] = None,
                 repo_url: Optional[pulumi.Input[_builtins.str]] = None,
                 rollback_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 slot_id: Optional[pulumi.Input[_builtins.str]] = None,
                 use_local_git: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_manual_integration: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_mercurial: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        Manages an App Service Source Control Slot.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_service_plan = azure.appservice.ServicePlan("example",
            name="example-plan",
            resource_group_name=example.name,
            location=example.location,
            os_type="Linux",
            sku_name="P1v2")
        example_linux_web_app = azure.appservice.LinuxWebApp("example",
            name="example-web-app",
            resource_group_name=example.name,
            location=example_service_plan.location,
            service_plan_id=example_service_plan.id,
            site_config={})
        example_linux_web_app_slot = azure.appservice.LinuxWebAppSlot("example",
            name="example-slot",
            app_service_id=example_linux_web_app.id,
            site_config={})
        example_source_control_slot = azure.appservice.SourceControlSlot("example",
            slot_id=example_linux_web_app_slot.id,
            repo_url="https://github.com/Azure-Samples/python-docs-hello-world",
            branch="master")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Web`: 2023-12-01

        ## Import

        an App Service Source Control Slot can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:appservice/sourceControlSlot:SourceControlSlot example "/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1/slots/slot1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] branch: The URL for the repository. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['SourceControlSlotGithubActionConfigurationArgs', 'SourceControlSlotGithubActionConfigurationArgsDict']] github_action_configuration: A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] repo_url: The branch name to use for deployments. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] rollback_enabled: Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] slot_id: The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.
               
               > **Note:** Function App Slots are not supported at this time.
        :param pulumi.Input[_builtins.bool] use_local_git: Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_manual_integration: Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_mercurial: The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SourceControlSlotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an App Service Source Control Slot.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_service_plan = azure.appservice.ServicePlan("example",
            name="example-plan",
            resource_group_name=example.name,
            location=example.location,
            os_type="Linux",
            sku_name="P1v2")
        example_linux_web_app = azure.appservice.LinuxWebApp("example",
            name="example-web-app",
            resource_group_name=example.name,
            location=example_service_plan.location,
            service_plan_id=example_service_plan.id,
            site_config={})
        example_linux_web_app_slot = azure.appservice.LinuxWebAppSlot("example",
            name="example-slot",
            app_service_id=example_linux_web_app.id,
            site_config={})
        example_source_control_slot = azure.appservice.SourceControlSlot("example",
            slot_id=example_linux_web_app_slot.id,
            repo_url="https://github.com/Azure-Samples/python-docs-hello-world",
            branch="master")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Web`: 2023-12-01

        ## Import

        an App Service Source Control Slot can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:appservice/sourceControlSlot:SourceControlSlot example "/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1/slots/slot1"
        ```

        :param str resource_name: The name of the resource.
        :param SourceControlSlotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SourceControlSlotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branch: Optional[pulumi.Input[_builtins.str]] = None,
                 github_action_configuration: Optional[pulumi.Input[Union['SourceControlSlotGithubActionConfigurationArgs', 'SourceControlSlotGithubActionConfigurationArgsDict']]] = None,
                 repo_url: Optional[pulumi.Input[_builtins.str]] = None,
                 rollback_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 slot_id: Optional[pulumi.Input[_builtins.str]] = None,
                 use_local_git: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_manual_integration: Optional[pulumi.Input[_builtins.bool]] = None,
                 use_mercurial: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SourceControlSlotArgs.__new__(SourceControlSlotArgs)

            __props__.__dict__["branch"] = branch
            __props__.__dict__["github_action_configuration"] = github_action_configuration
            __props__.__dict__["repo_url"] = repo_url
            __props__.__dict__["rollback_enabled"] = rollback_enabled
            if slot_id is None and not opts.urn:
                raise TypeError("Missing required property 'slot_id'")
            __props__.__dict__["slot_id"] = slot_id
            __props__.__dict__["use_local_git"] = use_local_git
            __props__.__dict__["use_manual_integration"] = use_manual_integration
            __props__.__dict__["use_mercurial"] = use_mercurial
            __props__.__dict__["scm_type"] = None
            __props__.__dict__["uses_github_action"] = None
        super(SourceControlSlot, __self__).__init__(
            'azure:appservice/sourceControlSlot:SourceControlSlot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            branch: Optional[pulumi.Input[_builtins.str]] = None,
            github_action_configuration: Optional[pulumi.Input[Union['SourceControlSlotGithubActionConfigurationArgs', 'SourceControlSlotGithubActionConfigurationArgsDict']]] = None,
            repo_url: Optional[pulumi.Input[_builtins.str]] = None,
            rollback_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            scm_type: Optional[pulumi.Input[_builtins.str]] = None,
            slot_id: Optional[pulumi.Input[_builtins.str]] = None,
            use_local_git: Optional[pulumi.Input[_builtins.bool]] = None,
            use_manual_integration: Optional[pulumi.Input[_builtins.bool]] = None,
            use_mercurial: Optional[pulumi.Input[_builtins.bool]] = None,
            uses_github_action: Optional[pulumi.Input[_builtins.bool]] = None) -> 'SourceControlSlot':
        """
        Get an existing SourceControlSlot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] branch: The URL for the repository. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['SourceControlSlotGithubActionConfigurationArgs', 'SourceControlSlotGithubActionConfigurationArgsDict']] github_action_configuration: A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] repo_url: The branch name to use for deployments. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] rollback_enabled: Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] scm_type: The SCM Type in use. This value is decoded by the service from the repository information supplied.
        :param pulumi.Input[_builtins.str] slot_id: The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.
               
               > **Note:** Function App Slots are not supported at this time.
        :param pulumi.Input[_builtins.bool] use_local_git: Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_manual_integration: Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] use_mercurial: The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] uses_github_action: Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SourceControlSlotState.__new__(_SourceControlSlotState)

        __props__.__dict__["branch"] = branch
        __props__.__dict__["github_action_configuration"] = github_action_configuration
        __props__.__dict__["repo_url"] = repo_url
        __props__.__dict__["rollback_enabled"] = rollback_enabled
        __props__.__dict__["scm_type"] = scm_type
        __props__.__dict__["slot_id"] = slot_id
        __props__.__dict__["use_local_git"] = use_local_git
        __props__.__dict__["use_manual_integration"] = use_manual_integration
        __props__.__dict__["use_mercurial"] = use_mercurial
        __props__.__dict__["uses_github_action"] = uses_github_action
        return SourceControlSlot(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def branch(self) -> pulumi.Output[_builtins.str]:
        """
        The URL for the repository. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "branch")

    @_builtins.property
    @pulumi.getter(name="githubActionConfiguration")
    def github_action_configuration(self) -> pulumi.Output[Optional['outputs.SourceControlSlotGithubActionConfiguration']]:
        """
        A `github_action_configuration` block as detailed below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "github_action_configuration")

    @_builtins.property
    @pulumi.getter(name="repoUrl")
    def repo_url(self) -> pulumi.Output[_builtins.str]:
        """
        The branch name to use for deployments. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "repo_url")

    @_builtins.property
    @pulumi.getter(name="rollbackEnabled")
    def rollback_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Should the Deployment Rollback be enabled? Defaults to `false` Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "rollback_enabled")

    @_builtins.property
    @pulumi.getter(name="scmType")
    def scm_type(self) -> pulumi.Output[_builtins.str]:
        """
        The SCM Type in use. This value is decoded by the service from the repository information supplied.
        """
        return pulumi.get(self, "scm_type")

    @_builtins.property
    @pulumi.getter(name="slotId")
    def slot_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Linux or Windows Web App Slot. Changing this forces a new resource to be created.

        > **Note:** Function App Slots are not supported at this time.
        """
        return pulumi.get(self, "slot_id")

    @_builtins.property
    @pulumi.getter(name="useLocalGit")
    def use_local_git(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Should the Slot use local Git configuration. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_local_git")

    @_builtins.property
    @pulumi.getter(name="useManualIntegration")
    def use_manual_integration(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Should code be deployed manually. Set to `true` to disable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_manual_integration")

    @_builtins.property
    @pulumi.getter(name="useMercurial")
    def use_mercurial(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "use_mercurial")

    @_builtins.property
    @pulumi.getter(name="usesGithubAction")
    def uses_github_action(self) -> pulumi.Output[_builtins.bool]:
        """
        Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
        """
        return pulumi.get(self, "uses_github_action")

