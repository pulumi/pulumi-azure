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

__all__ = ['SourceCodeTokenArgs', 'SourceCodeToken']

@pulumi.input_type
class SourceCodeTokenArgs:
    def __init__(__self__, *,
                 token: pulumi.Input[_builtins.str],
                 type: pulumi.Input[_builtins.str],
                 token_secret: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a SourceCodeToken resource.
        :param pulumi.Input[_builtins.str] token: The OAuth access token.
        :param pulumi.Input[_builtins.str] type: The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        :param pulumi.Input[_builtins.str] token_secret: The OAuth access token secret.
        """
        pulumi.set(__self__, "token", token)
        pulumi.set(__self__, "type", type)
        if token_secret is not None:
            pulumi.set(__self__, "token_secret", token_secret)

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Input[_builtins.str]:
        """
        The OAuth access token.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "token", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Input[_builtins.str]:
        """
        The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter(name="tokenSecret")
    def token_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The OAuth access token secret.
        """
        return pulumi.get(self, "token_secret")

    @token_secret.setter
    def token_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "token_secret", value)


@pulumi.input_type
class _SourceCodeTokenState:
    def __init__(__self__, *,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 token_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SourceCodeToken resources.
        :param pulumi.Input[_builtins.str] token: The OAuth access token.
        :param pulumi.Input[_builtins.str] token_secret: The OAuth access token secret.
        :param pulumi.Input[_builtins.str] type: The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        """
        if token is not None:
            pulumi.set(__self__, "token", token)
        if token_secret is not None:
            pulumi.set(__self__, "token_secret", token_secret)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The OAuth access token.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "token", value)

    @_builtins.property
    @pulumi.getter(name="tokenSecret")
    def token_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The OAuth access token secret.
        """
        return pulumi.get(self, "token_secret")

    @token_secret.setter
    def token_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "token_secret", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("azure:appservice/sourceCodeToken:SourceCodeToken")
class SourceCodeToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 token_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an App Service source control token.

        !> **NOTE:** This resource has been deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use `appservice.ServicePlan` resource instead.

        > **NOTE:** Source Control Tokens are configured at the subscription level, not on each App Service - as such this can only be configured Subscription-wide

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.appservice.SourceCodeToken("example",
            type="GitHub",
            token="7e57735e77e577e57")
        ```

        ## Import

        App Service Source Control Token's can be imported using the `type`, e.g.

        ```sh
        $ pulumi import azure:appservice/sourceCodeToken:SourceCodeToken example {type}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] token: The OAuth access token.
        :param pulumi.Input[_builtins.str] token_secret: The OAuth access token secret.
        :param pulumi.Input[_builtins.str] type: The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SourceCodeTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an App Service source control token.

        !> **NOTE:** This resource has been deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use `appservice.ServicePlan` resource instead.

        > **NOTE:** Source Control Tokens are configured at the subscription level, not on each App Service - as such this can only be configured Subscription-wide

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.appservice.SourceCodeToken("example",
            type="GitHub",
            token="7e57735e77e577e57")
        ```

        ## Import

        App Service Source Control Token's can be imported using the `type`, e.g.

        ```sh
        $ pulumi import azure:appservice/sourceCodeToken:SourceCodeToken example {type}
        ```

        :param str resource_name: The name of the resource.
        :param SourceCodeTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SourceCodeTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 token_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SourceCodeTokenArgs.__new__(SourceCodeTokenArgs)

            if token is None and not opts.urn:
                raise TypeError("Missing required property 'token'")
            __props__.__dict__["token"] = None if token is None else pulumi.Output.secret(token)
            __props__.__dict__["token_secret"] = None if token_secret is None else pulumi.Output.secret(token_secret)
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token", "tokenSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SourceCodeToken, __self__).__init__(
            'azure:appservice/sourceCodeToken:SourceCodeToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            token: Optional[pulumi.Input[_builtins.str]] = None,
            token_secret: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None) -> 'SourceCodeToken':
        """
        Get an existing SourceCodeToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] token: The OAuth access token.
        :param pulumi.Input[_builtins.str] token_secret: The OAuth access token secret.
        :param pulumi.Input[_builtins.str] type: The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SourceCodeTokenState.__new__(_SourceCodeTokenState)

        __props__.__dict__["token"] = token
        __props__.__dict__["token_secret"] = token_secret
        __props__.__dict__["type"] = type
        return SourceCodeToken(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Output[_builtins.str]:
        """
        The OAuth access token.
        """
        return pulumi.get(self, "token")

    @_builtins.property
    @pulumi.getter(name="tokenSecret")
    def token_secret(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The OAuth access token secret.
        """
        return pulumi.get(self, "token_secret")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
        """
        return pulumi.get(self, "type")

