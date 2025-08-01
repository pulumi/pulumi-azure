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

__all__ = ['ChannelTeamsArgs', 'ChannelTeams']

@pulumi.input_type
class ChannelTeamsArgs:
    def __init__(__self__, *,
                 bot_name: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 calling_web_hook: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_calling: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ChannelTeams resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] calling_web_hook: Specifies the webhook for Microsoft Teams channel calls.
        :param pulumi.Input[_builtins.str] deployment_environment: The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        :param pulumi.Input[_builtins.bool] enable_calling: Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "bot_name", bot_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if calling_web_hook is not None:
            pulumi.set(__self__, "calling_web_hook", calling_web_hook)
        if deployment_environment is not None:
            pulumi.set(__self__, "deployment_environment", deployment_environment)
        if enable_calling is not None:
            pulumi.set(__self__, "enable_calling", enable_calling)
        if location is not None:
            pulumi.set(__self__, "location", location)

    @_builtins.property
    @pulumi.getter(name="botName")
    def bot_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "bot_name")

    @bot_name.setter
    def bot_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "bot_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="callingWebHook")
    def calling_web_hook(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the webhook for Microsoft Teams channel calls.
        """
        return pulumi.get(self, "calling_web_hook")

    @calling_web_hook.setter
    def calling_web_hook(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "calling_web_hook", value)

    @_builtins.property
    @pulumi.getter(name="deploymentEnvironment")
    def deployment_environment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        """
        return pulumi.get(self, "deployment_environment")

    @deployment_environment.setter
    def deployment_environment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "deployment_environment", value)

    @_builtins.property
    @pulumi.getter(name="enableCalling")
    def enable_calling(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        """
        return pulumi.get(self, "enable_calling")

    @enable_calling.setter
    def enable_calling(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_calling", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)


@pulumi.input_type
class _ChannelTeamsState:
    def __init__(__self__, *,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 calling_web_hook: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_calling: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ChannelTeams resources.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] calling_web_hook: Specifies the webhook for Microsoft Teams channel calls.
        :param pulumi.Input[_builtins.str] deployment_environment: The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        :param pulumi.Input[_builtins.bool] enable_calling: Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        if bot_name is not None:
            pulumi.set(__self__, "bot_name", bot_name)
        if calling_web_hook is not None:
            pulumi.set(__self__, "calling_web_hook", calling_web_hook)
        if deployment_environment is not None:
            pulumi.set(__self__, "deployment_environment", deployment_environment)
        if enable_calling is not None:
            pulumi.set(__self__, "enable_calling", enable_calling)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)

    @_builtins.property
    @pulumi.getter(name="botName")
    def bot_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "bot_name")

    @bot_name.setter
    def bot_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bot_name", value)

    @_builtins.property
    @pulumi.getter(name="callingWebHook")
    def calling_web_hook(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the webhook for Microsoft Teams channel calls.
        """
        return pulumi.get(self, "calling_web_hook")

    @calling_web_hook.setter
    def calling_web_hook(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "calling_web_hook", value)

    @_builtins.property
    @pulumi.getter(name="deploymentEnvironment")
    def deployment_environment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        """
        return pulumi.get(self, "deployment_environment")

    @deployment_environment.setter
    def deployment_environment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "deployment_environment", value)

    @_builtins.property
    @pulumi.getter(name="enableCalling")
    def enable_calling(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        """
        return pulumi.get(self, "enable_calling")

    @enable_calling.setter
    def enable_calling(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_calling", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)


@pulumi.type_token("azure:bot/channelTeams:ChannelTeams")
class ChannelTeams(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 calling_web_hook: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_calling: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a MS Teams integration for a Bot Channel

        > **Note:** A bot can only have a single MS Teams Channel associated with it.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_channels_registration = azure.bot.ChannelsRegistration("example",
            name="example",
            location="global",
            resource_group_name=example.name,
            sku="F0",
            microsoft_app_id=current.client_id)
        example_channel_teams = azure.bot.ChannelTeams("example",
            bot_name=example_channels_registration.name,
            location=example_channels_registration.location,
            resource_group_name=example.name)
        ```

        ## Import

        The Microsoft Teams Integration for a Bot Channel can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:bot/channelTeams:ChannelTeams example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example/channels/MsTeamsChannel
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] calling_web_hook: Specifies the webhook for Microsoft Teams channel calls.
        :param pulumi.Input[_builtins.str] deployment_environment: The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        :param pulumi.Input[_builtins.bool] enable_calling: Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ChannelTeamsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a MS Teams integration for a Bot Channel

        > **Note:** A bot can only have a single MS Teams Channel associated with it.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_channels_registration = azure.bot.ChannelsRegistration("example",
            name="example",
            location="global",
            resource_group_name=example.name,
            sku="F0",
            microsoft_app_id=current.client_id)
        example_channel_teams = azure.bot.ChannelTeams("example",
            bot_name=example_channels_registration.name,
            location=example_channels_registration.location,
            resource_group_name=example.name)
        ```

        ## Import

        The Microsoft Teams Integration for a Bot Channel can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:bot/channelTeams:ChannelTeams example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example/channels/MsTeamsChannel
        ```

        :param str resource_name: The name of the resource.
        :param ChannelTeamsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ChannelTeamsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 calling_web_hook: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_calling: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ChannelTeamsArgs.__new__(ChannelTeamsArgs)

            if bot_name is None and not opts.urn:
                raise TypeError("Missing required property 'bot_name'")
            __props__.__dict__["bot_name"] = bot_name
            __props__.__dict__["calling_web_hook"] = calling_web_hook
            __props__.__dict__["deployment_environment"] = deployment_environment
            __props__.__dict__["enable_calling"] = enable_calling
            __props__.__dict__["location"] = location
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        super(ChannelTeams, __self__).__init__(
            'azure:bot/channelTeams:ChannelTeams',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bot_name: Optional[pulumi.Input[_builtins.str]] = None,
            calling_web_hook: Optional[pulumi.Input[_builtins.str]] = None,
            deployment_environment: Optional[pulumi.Input[_builtins.str]] = None,
            enable_calling: Optional[pulumi.Input[_builtins.bool]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'ChannelTeams':
        """
        Get an existing ChannelTeams resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] calling_web_hook: Specifies the webhook for Microsoft Teams channel calls.
        :param pulumi.Input[_builtins.str] deployment_environment: The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        :param pulumi.Input[_builtins.bool] enable_calling: Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ChannelTeamsState.__new__(_ChannelTeamsState)

        __props__.__dict__["bot_name"] = bot_name
        __props__.__dict__["calling_web_hook"] = calling_web_hook
        __props__.__dict__["deployment_environment"] = deployment_environment
        __props__.__dict__["enable_calling"] = enable_calling
        __props__.__dict__["location"] = location
        __props__.__dict__["resource_group_name"] = resource_group_name
        return ChannelTeams(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="botName")
    def bot_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "bot_name")

    @_builtins.property
    @pulumi.getter(name="callingWebHook")
    def calling_web_hook(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the webhook for Microsoft Teams channel calls.
        """
        return pulumi.get(self, "calling_web_hook")

    @_builtins.property
    @pulumi.getter(name="deploymentEnvironment")
    def deployment_environment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The deployment environment for Microsoft Teams channel calls. Possible values are `CommercialDeployment` and `GCCModerateDeployment`. Defaults to `CommercialDeployment`.
        """
        return pulumi.get(self, "deployment_environment")

    @_builtins.property
    @pulumi.getter(name="enableCalling")
    def enable_calling(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
        """
        return pulumi.get(self, "enable_calling")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

