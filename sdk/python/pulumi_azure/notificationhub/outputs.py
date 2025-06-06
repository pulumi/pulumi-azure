# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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
    'HubApnsCredential',
    'HubBrowserCredential',
    'HubGcmCredential',
    'GetHubApnsCredentialResult',
    'GetHubGcmCredentialResult',
    'GetNamespaceSkuResult',
]

@pulumi.output_type
class HubApnsCredential(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "applicationMode":
            suggest = "application_mode"
        elif key == "bundleId":
            suggest = "bundle_id"
        elif key == "keyId":
            suggest = "key_id"
        elif key == "teamId":
            suggest = "team_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in HubApnsCredential. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        HubApnsCredential.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        HubApnsCredential.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 application_mode: builtins.str,
                 bundle_id: builtins.str,
                 key_id: builtins.str,
                 team_id: builtins.str,
                 token: builtins.str):
        """
        :param builtins.str application_mode: The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
        :param builtins.str bundle_id: The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
        :param builtins.str key_id: The Apple Push Notifications Service (APNS) Key.
        :param builtins.str team_id: The ID of the team the Token.
        :param builtins.str token: The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
        """
        pulumi.set(__self__, "application_mode", application_mode)
        pulumi.set(__self__, "bundle_id", bundle_id)
        pulumi.set(__self__, "key_id", key_id)
        pulumi.set(__self__, "team_id", team_id)
        pulumi.set(__self__, "token", token)

    @property
    @pulumi.getter(name="applicationMode")
    def application_mode(self) -> builtins.str:
        """
        The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
        """
        return pulumi.get(self, "application_mode")

    @property
    @pulumi.getter(name="bundleId")
    def bundle_id(self) -> builtins.str:
        """
        The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
        """
        return pulumi.get(self, "bundle_id")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> builtins.str:
        """
        The Apple Push Notifications Service (APNS) Key.
        """
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> builtins.str:
        """
        The ID of the team the Token.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter
    def token(self) -> builtins.str:
        """
        The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
        """
        return pulumi.get(self, "token")


@pulumi.output_type
class HubBrowserCredential(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "vapidPrivateKey":
            suggest = "vapid_private_key"
        elif key == "vapidPublicKey":
            suggest = "vapid_public_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in HubBrowserCredential. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        HubBrowserCredential.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        HubBrowserCredential.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 subject: builtins.str,
                 vapid_private_key: builtins.str,
                 vapid_public_key: builtins.str):
        """
        :param builtins.str subject: The subject name of web push.
        :param builtins.str vapid_private_key: The Voluntary Application Server Identification (VAPID) private key.
        :param builtins.str vapid_public_key: The Voluntary Application Server Identification (VAPID) public key.
        """
        pulumi.set(__self__, "subject", subject)
        pulumi.set(__self__, "vapid_private_key", vapid_private_key)
        pulumi.set(__self__, "vapid_public_key", vapid_public_key)

    @property
    @pulumi.getter
    def subject(self) -> builtins.str:
        """
        The subject name of web push.
        """
        return pulumi.get(self, "subject")

    @property
    @pulumi.getter(name="vapidPrivateKey")
    def vapid_private_key(self) -> builtins.str:
        """
        The Voluntary Application Server Identification (VAPID) private key.
        """
        return pulumi.get(self, "vapid_private_key")

    @property
    @pulumi.getter(name="vapidPublicKey")
    def vapid_public_key(self) -> builtins.str:
        """
        The Voluntary Application Server Identification (VAPID) public key.
        """
        return pulumi.get(self, "vapid_public_key")


@pulumi.output_type
class HubGcmCredential(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "apiKey":
            suggest = "api_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in HubGcmCredential. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        HubGcmCredential.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        HubGcmCredential.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 api_key: builtins.str):
        """
        :param builtins.str api_key: The API Key associated with the Google Cloud Messaging service.
        """
        pulumi.set(__self__, "api_key", api_key)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> builtins.str:
        """
        The API Key associated with the Google Cloud Messaging service.
        """
        return pulumi.get(self, "api_key")


@pulumi.output_type
class GetHubApnsCredentialResult(dict):
    def __init__(__self__, *,
                 application_mode: builtins.str,
                 bundle_id: builtins.str,
                 key_id: builtins.str,
                 team_id: builtins.str,
                 token: builtins.str):
        """
        :param builtins.str application_mode: The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
        :param builtins.str bundle_id: The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
        :param builtins.str key_id: The Apple Push Notifications Service (APNS) Key.
        :param builtins.str team_id: The ID of the team the Token.
        :param builtins.str token: The Push Token associated with the Apple Developer Account.
        """
        pulumi.set(__self__, "application_mode", application_mode)
        pulumi.set(__self__, "bundle_id", bundle_id)
        pulumi.set(__self__, "key_id", key_id)
        pulumi.set(__self__, "team_id", team_id)
        pulumi.set(__self__, "token", token)

    @property
    @pulumi.getter(name="applicationMode")
    def application_mode(self) -> builtins.str:
        """
        The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
        """
        return pulumi.get(self, "application_mode")

    @property
    @pulumi.getter(name="bundleId")
    def bundle_id(self) -> builtins.str:
        """
        The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
        """
        return pulumi.get(self, "bundle_id")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> builtins.str:
        """
        The Apple Push Notifications Service (APNS) Key.
        """
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> builtins.str:
        """
        The ID of the team the Token.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter
    def token(self) -> builtins.str:
        """
        The Push Token associated with the Apple Developer Account.
        """
        return pulumi.get(self, "token")


@pulumi.output_type
class GetHubGcmCredentialResult(dict):
    def __init__(__self__, *,
                 api_key: builtins.str):
        """
        :param builtins.str api_key: The API Key associated with the Google Cloud Messaging service.
        """
        pulumi.set(__self__, "api_key", api_key)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> builtins.str:
        """
        The API Key associated with the Google Cloud Messaging service.
        """
        return pulumi.get(self, "api_key")


@pulumi.output_type
class GetNamespaceSkuResult(dict):
    def __init__(__self__, *,
                 name: builtins.str):
        """
        :param builtins.str name: Specifies the Name of the Notification Hub Namespace.
        """
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Specifies the Name of the Notification Hub Namespace.
        """
        return pulumi.get(self, "name")


