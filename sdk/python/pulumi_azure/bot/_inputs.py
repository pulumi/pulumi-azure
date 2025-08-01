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

__all__ = [
    'ChannelDirectLineSiteArgs',
    'ChannelDirectLineSiteArgsDict',
    'ChannelFacebookPageArgs',
    'ChannelFacebookPageArgsDict',
    'ChannelLineLineChannelArgs',
    'ChannelLineLineChannelArgsDict',
    'ChannelWebChatSiteArgs',
    'ChannelWebChatSiteArgsDict',
]

MYPY = False

if not MYPY:
    class ChannelDirectLineSiteArgsDict(TypedDict):
        name: pulumi.Input[_builtins.str]
        """
        The name of the site
        """
        enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enables/Disables this site. Defaults to `true`.
        """
        endpoint_parameters_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Is the endpoint parameters enabled for this site?
        """
        enhanced_authentication_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
        """
        id: NotRequired[pulumi.Input[_builtins.str]]
        """
        Id for the site
        """
        key: NotRequired[pulumi.Input[_builtins.str]]
        """
        Primary key for accessing this site
        """
        key2: NotRequired[pulumi.Input[_builtins.str]]
        """
        Secondary key for accessing this site
        """
        storage_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Is the storage site enabled for detailed logging? Defaults to `true`.
        """
        trusted_origins: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
        """
        user_upload_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Is the user upload enabled for this site? Defaults to `true`.
        """
        v1_allowed: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enables v1 of the Directline protocol for this site. Defaults to `true`.
        """
        v3_allowed: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enables v3 of the Directline protocol for this site. Defaults to `true`.
        """
elif False:
    ChannelDirectLineSiteArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelDirectLineSiteArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoint_parameters_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 enhanced_authentication_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 id: Optional[pulumi.Input[_builtins.str]] = None,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 key2: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 trusted_origins: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 user_upload_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 v1_allowed: Optional[pulumi.Input[_builtins.bool]] = None,
                 v3_allowed: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.str] name: The name of the site
        :param pulumi.Input[_builtins.bool] enabled: Enables/Disables this site. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] endpoint_parameters_enabled: Is the endpoint parameters enabled for this site?
        :param pulumi.Input[_builtins.bool] enhanced_authentication_enabled: Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
        :param pulumi.Input[_builtins.str] id: Id for the site
        :param pulumi.Input[_builtins.str] key: Primary key for accessing this site
        :param pulumi.Input[_builtins.str] key2: Secondary key for accessing this site
        :param pulumi.Input[_builtins.bool] storage_enabled: Is the storage site enabled for detailed logging? Defaults to `true`.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] trusted_origins: This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
        :param pulumi.Input[_builtins.bool] user_upload_enabled: Is the user upload enabled for this site? Defaults to `true`.
        :param pulumi.Input[_builtins.bool] v1_allowed: Enables v1 of the Directline protocol for this site. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] v3_allowed: Enables v3 of the Directline protocol for this site. Defaults to `true`.
        """
        pulumi.set(__self__, "name", name)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if endpoint_parameters_enabled is not None:
            pulumi.set(__self__, "endpoint_parameters_enabled", endpoint_parameters_enabled)
        if enhanced_authentication_enabled is not None:
            pulumi.set(__self__, "enhanced_authentication_enabled", enhanced_authentication_enabled)
        if id is not None:
            pulumi.set(__self__, "id", id)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if key2 is not None:
            pulumi.set(__self__, "key2", key2)
        if storage_enabled is not None:
            pulumi.set(__self__, "storage_enabled", storage_enabled)
        if trusted_origins is not None:
            pulumi.set(__self__, "trusted_origins", trusted_origins)
        if user_upload_enabled is not None:
            pulumi.set(__self__, "user_upload_enabled", user_upload_enabled)
        if v1_allowed is not None:
            pulumi.set(__self__, "v1_allowed", v1_allowed)
        if v3_allowed is not None:
            pulumi.set(__self__, "v3_allowed", v3_allowed)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the site
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enables/Disables this site. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="endpointParametersEnabled")
    def endpoint_parameters_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is the endpoint parameters enabled for this site?
        """
        return pulumi.get(self, "endpoint_parameters_enabled")

    @endpoint_parameters_enabled.setter
    def endpoint_parameters_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "endpoint_parameters_enabled", value)

    @_builtins.property
    @pulumi.getter(name="enhancedAuthenticationEnabled")
    def enhanced_authentication_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
        """
        return pulumi.get(self, "enhanced_authentication_enabled")

    @enhanced_authentication_enabled.setter
    def enhanced_authentication_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enhanced_authentication_enabled", value)

    @_builtins.property
    @pulumi.getter
    def id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Id for the site
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "id", value)

    @_builtins.property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Primary key for accessing this site
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key", value)

    @_builtins.property
    @pulumi.getter
    def key2(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Secondary key for accessing this site
        """
        return pulumi.get(self, "key2")

    @key2.setter
    def key2(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key2", value)

    @_builtins.property
    @pulumi.getter(name="storageEnabled")
    def storage_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is the storage site enabled for detailed logging? Defaults to `true`.
        """
        return pulumi.get(self, "storage_enabled")

    @storage_enabled.setter
    def storage_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "storage_enabled", value)

    @_builtins.property
    @pulumi.getter(name="trustedOrigins")
    def trusted_origins(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
        """
        return pulumi.get(self, "trusted_origins")

    @trusted_origins.setter
    def trusted_origins(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "trusted_origins", value)

    @_builtins.property
    @pulumi.getter(name="userUploadEnabled")
    def user_upload_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is the user upload enabled for this site? Defaults to `true`.
        """
        return pulumi.get(self, "user_upload_enabled")

    @user_upload_enabled.setter
    def user_upload_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "user_upload_enabled", value)

    @_builtins.property
    @pulumi.getter(name="v1Allowed")
    def v1_allowed(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enables v1 of the Directline protocol for this site. Defaults to `true`.
        """
        return pulumi.get(self, "v1_allowed")

    @v1_allowed.setter
    def v1_allowed(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "v1_allowed", value)

    @_builtins.property
    @pulumi.getter(name="v3Allowed")
    def v3_allowed(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enables v3 of the Directline protocol for this site. Defaults to `true`.
        """
        return pulumi.get(self, "v3_allowed")

    @v3_allowed.setter
    def v3_allowed(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "v3_allowed", value)


if not MYPY:
    class ChannelFacebookPageArgsDict(TypedDict):
        access_token: pulumi.Input[_builtins.str]
        """
        The Facebook Page Access Token for the Facebook Channel.
        """
        id: pulumi.Input[_builtins.str]
        """
        The Facebook Page ID for the Facebook Channel.
        """
elif False:
    ChannelFacebookPageArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelFacebookPageArgs:
    def __init__(__self__, *,
                 access_token: pulumi.Input[_builtins.str],
                 id: pulumi.Input[_builtins.str]):
        """
        :param pulumi.Input[_builtins.str] access_token: The Facebook Page Access Token for the Facebook Channel.
        :param pulumi.Input[_builtins.str] id: The Facebook Page ID for the Facebook Channel.
        """
        pulumi.set(__self__, "access_token", access_token)
        pulumi.set(__self__, "id", id)

    @_builtins.property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> pulumi.Input[_builtins.str]:
        """
        The Facebook Page Access Token for the Facebook Channel.
        """
        return pulumi.get(self, "access_token")

    @access_token.setter
    def access_token(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "access_token", value)

    @_builtins.property
    @pulumi.getter
    def id(self) -> pulumi.Input[_builtins.str]:
        """
        The Facebook Page ID for the Facebook Channel.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "id", value)


if not MYPY:
    class ChannelLineLineChannelArgsDict(TypedDict):
        access_token: pulumi.Input[_builtins.str]
        """
        The access token which is used to call the Line Channel API.
        """
        secret: pulumi.Input[_builtins.str]
        """
        The secret which is used to access the Line Channel.
        """
elif False:
    ChannelLineLineChannelArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelLineLineChannelArgs:
    def __init__(__self__, *,
                 access_token: pulumi.Input[_builtins.str],
                 secret: pulumi.Input[_builtins.str]):
        """
        :param pulumi.Input[_builtins.str] access_token: The access token which is used to call the Line Channel API.
        :param pulumi.Input[_builtins.str] secret: The secret which is used to access the Line Channel.
        """
        pulumi.set(__self__, "access_token", access_token)
        pulumi.set(__self__, "secret", secret)

    @_builtins.property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> pulumi.Input[_builtins.str]:
        """
        The access token which is used to call the Line Channel API.
        """
        return pulumi.get(self, "access_token")

    @access_token.setter
    def access_token(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "access_token", value)

    @_builtins.property
    @pulumi.getter
    def secret(self) -> pulumi.Input[_builtins.str]:
        """
        The secret which is used to access the Line Channel.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "secret", value)


if not MYPY:
    class ChannelWebChatSiteArgsDict(TypedDict):
        name: pulumi.Input[_builtins.str]
        """
        The name of the site.
        """
        endpoint_parameters_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Is the endpoint parameters enabled for this site?
        """
        storage_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Is the storage site enabled for detailed logging? Defaults to `true`.
        """
        user_upload_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Is the user upload enabled for this site? Defaults to `true`.
        """
elif False:
    ChannelWebChatSiteArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelWebChatSiteArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[_builtins.str],
                 endpoint_parameters_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 storage_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 user_upload_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.str] name: The name of the site.
        :param pulumi.Input[_builtins.bool] endpoint_parameters_enabled: Is the endpoint parameters enabled for this site?
        :param pulumi.Input[_builtins.bool] storage_enabled: Is the storage site enabled for detailed logging? Defaults to `true`.
        :param pulumi.Input[_builtins.bool] user_upload_enabled: Is the user upload enabled for this site? Defaults to `true`.
        """
        pulumi.set(__self__, "name", name)
        if endpoint_parameters_enabled is not None:
            pulumi.set(__self__, "endpoint_parameters_enabled", endpoint_parameters_enabled)
        if storage_enabled is not None:
            pulumi.set(__self__, "storage_enabled", storage_enabled)
        if user_upload_enabled is not None:
            pulumi.set(__self__, "user_upload_enabled", user_upload_enabled)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the site.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="endpointParametersEnabled")
    def endpoint_parameters_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is the endpoint parameters enabled for this site?
        """
        return pulumi.get(self, "endpoint_parameters_enabled")

    @endpoint_parameters_enabled.setter
    def endpoint_parameters_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "endpoint_parameters_enabled", value)

    @_builtins.property
    @pulumi.getter(name="storageEnabled")
    def storage_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is the storage site enabled for detailed logging? Defaults to `true`.
        """
        return pulumi.get(self, "storage_enabled")

    @storage_enabled.setter
    def storage_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "storage_enabled", value)

    @_builtins.property
    @pulumi.getter(name="userUploadEnabled")
    def user_upload_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is the user upload enabled for this site? Defaults to `true`.
        """
        return pulumi.get(self, "user_upload_enabled")

    @user_upload_enabled.setter
    def user_upload_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "user_upload_enabled", value)


