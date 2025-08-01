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

__all__ = ['NotificationRecipientUserArgs', 'NotificationRecipientUser']

@pulumi.input_type
class NotificationRecipientUserArgs:
    def __init__(__self__, *,
                 api_management_id: pulumi.Input[_builtins.str],
                 notification_type: pulumi.Input[_builtins.str],
                 user_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a NotificationRecipientUser resource.
        :param pulumi.Input[_builtins.str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[_builtins.str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[_builtins.str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        pulumi.set(__self__, "api_management_id", api_management_id)
        pulumi.set(__self__, "notification_type", notification_type)
        pulumi.set(__self__, "user_id", user_id)

    @_builtins.property
    @pulumi.getter(name="apiManagementId")
    def api_management_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "api_management_id")

    @api_management_id.setter
    def api_management_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_management_id", value)

    @_builtins.property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Input[_builtins.str]:
        """
        The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "notification_type", value)

    @_builtins.property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[_builtins.str]:
        """
        The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _NotificationRecipientUserState:
    def __init__(__self__, *,
                 api_management_id: Optional[pulumi.Input[_builtins.str]] = None,
                 notification_type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NotificationRecipientUser resources.
        :param pulumi.Input[_builtins.str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[_builtins.str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[_builtins.str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        if api_management_id is not None:
            pulumi.set(__self__, "api_management_id", api_management_id)
        if notification_type is not None:
            pulumi.set(__self__, "notification_type", notification_type)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @_builtins.property
    @pulumi.getter(name="apiManagementId")
    def api_management_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "api_management_id")

    @api_management_id.setter
    def api_management_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_management_id", value)

    @_builtins.property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "notification_type", value)

    @_builtins.property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_id", value)


@pulumi.type_token("azure:apimanagement/notificationRecipientUser:NotificationRecipientUser")
class NotificationRecipientUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_management_id: Optional[pulumi.Input[_builtins.str]] = None,
                 notification_type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a API Management Notification Recipient User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_service = azure.apimanagement.Service("example",
            name="example-apim",
            location=example.location,
            resource_group_name=example.name,
            publisher_name="My Company",
            publisher_email="company@terraform.io",
            sku_name="Developer_1")
        example_user = azure.apimanagement.User("example",
            user_id="123",
            api_management_name=example_service.name,
            resource_group_name=example.name,
            first_name="Example",
            last_name="User",
            email="foo@bar.com",
            state="active")
        example_notification_recipient_user = azure.apimanagement.NotificationRecipientUser("example",
            api_management_id=example_service.id,
            notification_type="AccountClosedPublisher",
            user_id=example_user.user_id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ApiManagement`: 2022-08-01

        ## Import

        API Management Notification Recipient Users can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:apimanagement/notificationRecipientUser:NotificationRecipientUser example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/notifications/notificationName1/recipientUsers/userid1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[_builtins.str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[_builtins.str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationRecipientUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a API Management Notification Recipient User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_service = azure.apimanagement.Service("example",
            name="example-apim",
            location=example.location,
            resource_group_name=example.name,
            publisher_name="My Company",
            publisher_email="company@terraform.io",
            sku_name="Developer_1")
        example_user = azure.apimanagement.User("example",
            user_id="123",
            api_management_name=example_service.name,
            resource_group_name=example.name,
            first_name="Example",
            last_name="User",
            email="foo@bar.com",
            state="active")
        example_notification_recipient_user = azure.apimanagement.NotificationRecipientUser("example",
            api_management_id=example_service.id,
            notification_type="AccountClosedPublisher",
            user_id=example_user.user_id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ApiManagement`: 2022-08-01

        ## Import

        API Management Notification Recipient Users can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:apimanagement/notificationRecipientUser:NotificationRecipientUser example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/notifications/notificationName1/recipientUsers/userid1
        ```

        :param str resource_name: The name of the resource.
        :param NotificationRecipientUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationRecipientUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_management_id: Optional[pulumi.Input[_builtins.str]] = None,
                 notification_type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationRecipientUserArgs.__new__(NotificationRecipientUserArgs)

            if api_management_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_management_id'")
            __props__.__dict__["api_management_id"] = api_management_id
            if notification_type is None and not opts.urn:
                raise TypeError("Missing required property 'notification_type'")
            __props__.__dict__["notification_type"] = notification_type
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(NotificationRecipientUser, __self__).__init__(
            'azure:apimanagement/notificationRecipientUser:NotificationRecipientUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_management_id: Optional[pulumi.Input[_builtins.str]] = None,
            notification_type: Optional[pulumi.Input[_builtins.str]] = None,
            user_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'NotificationRecipientUser':
        """
        Get an existing NotificationRecipientUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[_builtins.str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[_builtins.str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationRecipientUserState.__new__(_NotificationRecipientUserState)

        __props__.__dict__["api_management_id"] = api_management_id
        __props__.__dict__["notification_type"] = notification_type
        __props__.__dict__["user_id"] = user_id
        return NotificationRecipientUser(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="apiManagementId")
    def api_management_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "api_management_id")

    @_builtins.property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Output[_builtins.str]:
        """
        The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        """
        return pulumi.get(self, "notification_type")

    @_builtins.property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[_builtins.str]:
        """
        The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "user_id")

