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

__all__ = ['ChannelEmailArgs', 'ChannelEmail']

@pulumi.input_type
class ChannelEmailArgs:
    def __init__(__self__, *,
                 bot_name: pulumi.Input[_builtins.str],
                 email_address: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 email_password: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 magic_code: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ChannelEmail resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] email_address: The email address that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] email_password: The email password that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] magic_code: The magic code used to set up OAUTH authentication.
        """
        pulumi.set(__self__, "bot_name", bot_name)
        pulumi.set(__self__, "email_address", email_address)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if email_password is not None:
            pulumi.set(__self__, "email_password", email_password)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if magic_code is not None:
            pulumi.set(__self__, "magic_code", magic_code)

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
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> pulumi.Input[_builtins.str]:
        """
        The email address that the Bot will authenticate with.
        """
        return pulumi.get(self, "email_address")

    @email_address.setter
    def email_address(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "email_address", value)

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
    @pulumi.getter(name="emailPassword")
    def email_password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The email password that the Bot will authenticate with.
        """
        return pulumi.get(self, "email_password")

    @email_password.setter
    def email_password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email_password", value)

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
    @pulumi.getter(name="magicCode")
    def magic_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The magic code used to set up OAUTH authentication.
        """
        return pulumi.get(self, "magic_code")

    @magic_code.setter
    def magic_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "magic_code", value)


@pulumi.input_type
class _ChannelEmailState:
    def __init__(__self__, *,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 email_address: Optional[pulumi.Input[_builtins.str]] = None,
                 email_password: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 magic_code: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ChannelEmail resources.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] email_address: The email address that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] email_password: The email password that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] magic_code: The magic code used to set up OAUTH authentication.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        if bot_name is not None:
            pulumi.set(__self__, "bot_name", bot_name)
        if email_address is not None:
            pulumi.set(__self__, "email_address", email_address)
        if email_password is not None:
            pulumi.set(__self__, "email_password", email_password)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if magic_code is not None:
            pulumi.set(__self__, "magic_code", magic_code)
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
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The email address that the Bot will authenticate with.
        """
        return pulumi.get(self, "email_address")

    @email_address.setter
    def email_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email_address", value)

    @_builtins.property
    @pulumi.getter(name="emailPassword")
    def email_password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The email password that the Bot will authenticate with.
        """
        return pulumi.get(self, "email_password")

    @email_password.setter
    def email_password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email_password", value)

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
    @pulumi.getter(name="magicCode")
    def magic_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The magic code used to set up OAUTH authentication.
        """
        return pulumi.get(self, "magic_code")

    @magic_code.setter
    def magic_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "magic_code", value)

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


@pulumi.type_token("azure:bot/channelEmail:ChannelEmail")
class ChannelEmail(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 email_address: Optional[pulumi.Input[_builtins.str]] = None,
                 email_password: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 magic_code: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Email integration for a Bot Channel

        > **Note:** A bot can only have a single Email Channel associated with it.

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
        example_channel_email = azure.bot.ChannelEmail("example",
            bot_name=example_channels_registration.name,
            location=example_channels_registration.location,
            resource_group_name=example.name,
            email_address="example.com",
            email_password="123456")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.BotService`: 2022-09-15

        ## Import

        The Email Integration for a Bot Channel can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:bot/channelEmail:ChannelEmail example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example/channels/EmailChannel
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] email_address: The email address that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] email_password: The email password that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] magic_code: The magic code used to set up OAUTH authentication.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ChannelEmailArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Email integration for a Bot Channel

        > **Note:** A bot can only have a single Email Channel associated with it.

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
        example_channel_email = azure.bot.ChannelEmail("example",
            bot_name=example_channels_registration.name,
            location=example_channels_registration.location,
            resource_group_name=example.name,
            email_address="example.com",
            email_password="123456")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.BotService`: 2022-09-15

        ## Import

        The Email Integration for a Bot Channel can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:bot/channelEmail:ChannelEmail example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example/channels/EmailChannel
        ```

        :param str resource_name: The name of the resource.
        :param ChannelEmailArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ChannelEmailArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 email_address: Optional[pulumi.Input[_builtins.str]] = None,
                 email_password: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 magic_code: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ChannelEmailArgs.__new__(ChannelEmailArgs)

            if bot_name is None and not opts.urn:
                raise TypeError("Missing required property 'bot_name'")
            __props__.__dict__["bot_name"] = bot_name
            if email_address is None and not opts.urn:
                raise TypeError("Missing required property 'email_address'")
            __props__.__dict__["email_address"] = email_address
            __props__.__dict__["email_password"] = None if email_password is None else pulumi.Output.secret(email_password)
            __props__.__dict__["location"] = location
            __props__.__dict__["magic_code"] = None if magic_code is None else pulumi.Output.secret(magic_code)
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["emailPassword", "magicCode"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ChannelEmail, __self__).__init__(
            'azure:bot/channelEmail:ChannelEmail',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bot_name: Optional[pulumi.Input[_builtins.str]] = None,
            email_address: Optional[pulumi.Input[_builtins.str]] = None,
            email_password: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            magic_code: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'ChannelEmail':
        """
        Get an existing ChannelEmail resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bot_name: The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] email_address: The email address that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] email_password: The email password that the Bot will authenticate with.
        :param pulumi.Input[_builtins.str] location: The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] magic_code: The magic code used to set up OAUTH authentication.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ChannelEmailState.__new__(_ChannelEmailState)

        __props__.__dict__["bot_name"] = bot_name
        __props__.__dict__["email_address"] = email_address
        __props__.__dict__["email_password"] = email_password
        __props__.__dict__["location"] = location
        __props__.__dict__["magic_code"] = magic_code
        __props__.__dict__["resource_group_name"] = resource_group_name
        return ChannelEmail(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="botName")
    def bot_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "bot_name")

    @_builtins.property
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> pulumi.Output[_builtins.str]:
        """
        The email address that the Bot will authenticate with.
        """
        return pulumi.get(self, "email_address")

    @_builtins.property
    @pulumi.getter(name="emailPassword")
    def email_password(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The email password that the Bot will authenticate with.
        """
        return pulumi.get(self, "email_password")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="magicCode")
    def magic_code(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The magic code used to set up OAUTH authentication.
        """
        return pulumi.get(self, "magic_code")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

