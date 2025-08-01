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

__all__ = ['ChannelFacebookArgs', 'ChannelFacebook']

@pulumi.input_type
class ChannelFacebookArgs:
    def __init__(__self__, *,
                 bot_name: pulumi.Input[_builtins.str],
                 facebook_application_id: pulumi.Input[_builtins.str],
                 facebook_application_secret: pulumi.Input[_builtins.str],
                 pages: pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]],
                 resource_group_name: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ChannelFacebook resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] facebook_application_id: The Facebook Application ID for the Facebook Channel.
        :param pulumi.Input[_builtins.str] facebook_application_secret: The Facebook Application Secret for the Facebook Channel.
        :param pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]] pages: One or more `page` blocks as defined below.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "bot_name", bot_name)
        pulumi.set(__self__, "facebook_application_id", facebook_application_id)
        pulumi.set(__self__, "facebook_application_secret", facebook_application_secret)
        pulumi.set(__self__, "pages", pages)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
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
    @pulumi.getter(name="facebookApplicationId")
    def facebook_application_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Facebook Application ID for the Facebook Channel.
        """
        return pulumi.get(self, "facebook_application_id")

    @facebook_application_id.setter
    def facebook_application_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "facebook_application_id", value)

    @_builtins.property
    @pulumi.getter(name="facebookApplicationSecret")
    def facebook_application_secret(self) -> pulumi.Input[_builtins.str]:
        """
        The Facebook Application Secret for the Facebook Channel.
        """
        return pulumi.get(self, "facebook_application_secret")

    @facebook_application_secret.setter
    def facebook_application_secret(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "facebook_application_secret", value)

    @_builtins.property
    @pulumi.getter
    def pages(self) -> pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]]:
        """
        One or more `page` blocks as defined below.
        """
        return pulumi.get(self, "pages")

    @pages.setter
    def pages(self, value: pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]]):
        pulumi.set(self, "pages", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

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


@pulumi.input_type
class _ChannelFacebookState:
    def __init__(__self__, *,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 facebook_application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 facebook_application_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 pages: Optional[pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ChannelFacebook resources.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] facebook_application_id: The Facebook Application ID for the Facebook Channel.
        :param pulumi.Input[_builtins.str] facebook_application_secret: The Facebook Application Secret for the Facebook Channel.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]] pages: One or more `page` blocks as defined below.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        """
        if bot_name is not None:
            pulumi.set(__self__, "bot_name", bot_name)
        if facebook_application_id is not None:
            pulumi.set(__self__, "facebook_application_id", facebook_application_id)
        if facebook_application_secret is not None:
            pulumi.set(__self__, "facebook_application_secret", facebook_application_secret)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if pages is not None:
            pulumi.set(__self__, "pages", pages)
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
    @pulumi.getter(name="facebookApplicationId")
    def facebook_application_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Facebook Application ID for the Facebook Channel.
        """
        return pulumi.get(self, "facebook_application_id")

    @facebook_application_id.setter
    def facebook_application_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "facebook_application_id", value)

    @_builtins.property
    @pulumi.getter(name="facebookApplicationSecret")
    def facebook_application_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Facebook Application Secret for the Facebook Channel.
        """
        return pulumi.get(self, "facebook_application_secret")

    @facebook_application_secret.setter
    def facebook_application_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "facebook_application_secret", value)

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
    def pages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]]]:
        """
        One or more `page` blocks as defined below.
        """
        return pulumi.get(self, "pages")

    @pages.setter
    def pages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ChannelFacebookPageArgs']]]]):
        pulumi.set(self, "pages", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)


@pulumi.type_token("azure:bot/channelFacebook:ChannelFacebook")
class ChannelFacebook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 facebook_application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 facebook_application_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 pages: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ChannelFacebookPageArgs', 'ChannelFacebookPageArgsDict']]]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Facebook integration for a Bot Channel

        > **Note:** A bot can only have a single Facebook Channel associated with it.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_channels_registration = azure.bot.ChannelsRegistration("example",
            name="example-bcr",
            location="global",
            resource_group_name=example.name,
            sku="F0",
            microsoft_app_id=current.client_id)
        example_channel_facebook = azure.bot.ChannelFacebook("example",
            bot_name=example_channels_registration.name,
            location=example_channels_registration.location,
            resource_group_name=example.name,
            facebook_application_id="563490254873576",
            facebook_application_secret="8976d2536445ad5b976dee8437b9beb0",
            pages=[{
                "id": "876248795081953",
                "access_token": "CGGCec3UAFPMBAKwK3Ft8SEpO8ZCuvpNBI5DClaJCDfqJj2BgEHCKxcY0FDarmUQap6XxpZC9GWCW4nZCzjcKosAZAP7SO44X8Q8gAntbDIXgYUBGp9xtS8wUkwgKPobUePcOOVFkvClxvYZByuiQxoTiK9fQ9jZCPEorbmZCsKDZAx4VLnrNwCTZAPUwXxO61gfq4ZD",
            }])
        ```

        ## Import

        The Facebook Integration for a Bot Channel can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:bot/channelFacebook:ChannelFacebook example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.BotService/botServices/botService1/channels/FacebookChannel
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] facebook_application_id: The Facebook Application ID for the Facebook Channel.
        :param pulumi.Input[_builtins.str] facebook_application_secret: The Facebook Application Secret for the Facebook Channel.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ChannelFacebookPageArgs', 'ChannelFacebookPageArgsDict']]]] pages: One or more `page` blocks as defined below.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ChannelFacebookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Facebook integration for a Bot Channel

        > **Note:** A bot can only have a single Facebook Channel associated with it.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_channels_registration = azure.bot.ChannelsRegistration("example",
            name="example-bcr",
            location="global",
            resource_group_name=example.name,
            sku="F0",
            microsoft_app_id=current.client_id)
        example_channel_facebook = azure.bot.ChannelFacebook("example",
            bot_name=example_channels_registration.name,
            location=example_channels_registration.location,
            resource_group_name=example.name,
            facebook_application_id="563490254873576",
            facebook_application_secret="8976d2536445ad5b976dee8437b9beb0",
            pages=[{
                "id": "876248795081953",
                "access_token": "CGGCec3UAFPMBAKwK3Ft8SEpO8ZCuvpNBI5DClaJCDfqJj2BgEHCKxcY0FDarmUQap6XxpZC9GWCW4nZCzjcKosAZAP7SO44X8Q8gAntbDIXgYUBGp9xtS8wUkwgKPobUePcOOVFkvClxvYZByuiQxoTiK9fQ9jZCPEorbmZCsKDZAx4VLnrNwCTZAPUwXxO61gfq4ZD",
            }])
        ```

        ## Import

        The Facebook Integration for a Bot Channel can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:bot/channelFacebook:ChannelFacebook example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.BotService/botServices/botService1/channels/FacebookChannel
        ```

        :param str resource_name: The name of the resource.
        :param ChannelFacebookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ChannelFacebookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 facebook_application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 facebook_application_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 pages: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ChannelFacebookPageArgs', 'ChannelFacebookPageArgsDict']]]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ChannelFacebookArgs.__new__(ChannelFacebookArgs)

            if bot_name is None and not opts.urn:
                raise TypeError("Missing required property 'bot_name'")
            __props__.__dict__["bot_name"] = bot_name
            if facebook_application_id is None and not opts.urn:
                raise TypeError("Missing required property 'facebook_application_id'")
            __props__.__dict__["facebook_application_id"] = facebook_application_id
            if facebook_application_secret is None and not opts.urn:
                raise TypeError("Missing required property 'facebook_application_secret'")
            __props__.__dict__["facebook_application_secret"] = None if facebook_application_secret is None else pulumi.Output.secret(facebook_application_secret)
            __props__.__dict__["location"] = location
            if pages is None and not opts.urn:
                raise TypeError("Missing required property 'pages'")
            __props__.__dict__["pages"] = pages
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["facebookApplicationSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ChannelFacebook, __self__).__init__(
            'azure:bot/channelFacebook:ChannelFacebook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bot_name: Optional[pulumi.Input[_builtins.str]] = None,
            facebook_application_id: Optional[pulumi.Input[_builtins.str]] = None,
            facebook_application_secret: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            pages: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ChannelFacebookPageArgs', 'ChannelFacebookPageArgsDict']]]]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'ChannelFacebook':
        """
        Get an existing ChannelFacebook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] facebook_application_id: The Facebook Application ID for the Facebook Channel.
        :param pulumi.Input[_builtins.str] facebook_application_secret: The Facebook Application Secret for the Facebook Channel.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ChannelFacebookPageArgs', 'ChannelFacebookPageArgsDict']]]] pages: One or more `page` blocks as defined below.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ChannelFacebookState.__new__(_ChannelFacebookState)

        __props__.__dict__["bot_name"] = bot_name
        __props__.__dict__["facebook_application_id"] = facebook_application_id
        __props__.__dict__["facebook_application_secret"] = facebook_application_secret
        __props__.__dict__["location"] = location
        __props__.__dict__["pages"] = pages
        __props__.__dict__["resource_group_name"] = resource_group_name
        return ChannelFacebook(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="botName")
    def bot_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "bot_name")

    @_builtins.property
    @pulumi.getter(name="facebookApplicationId")
    def facebook_application_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Facebook Application ID for the Facebook Channel.
        """
        return pulumi.get(self, "facebook_application_id")

    @_builtins.property
    @pulumi.getter(name="facebookApplicationSecret")
    def facebook_application_secret(self) -> pulumi.Output[_builtins.str]:
        """
        The Facebook Application Secret for the Facebook Channel.
        """
        return pulumi.get(self, "facebook_application_secret")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def pages(self) -> pulumi.Output[Sequence['outputs.ChannelFacebookPage']]:
        """
        One or more `page` blocks as defined below.
        """
        return pulumi.get(self, "pages")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

