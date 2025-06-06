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
    'ElasticsearchLogsArgs',
    'ElasticsearchLogsArgsDict',
    'ElasticsearchLogsFilteringTagArgs',
    'ElasticsearchLogsFilteringTagArgsDict',
    'GetElasticsearchLogArgs',
    'GetElasticsearchLogArgsDict',
    'GetElasticsearchLogFilteringTagArgs',
    'GetElasticsearchLogFilteringTagArgsDict',
]

MYPY = False

if not MYPY:
    class ElasticsearchLogsArgsDict(TypedDict):
        filtering_tags: NotRequired[pulumi.Input[Sequence[pulumi.Input['ElasticsearchLogsFilteringTagArgsDict']]]]
        """
        A list of `filtering_tag` blocks as defined above.
        """
        send_activity_logs: NotRequired[pulumi.Input[builtins.bool]]
        """
        Specifies if the Azure Activity Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
        send_azuread_logs: NotRequired[pulumi.Input[builtins.bool]]
        """
        Specifies if the AzureAD Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
        send_subscription_logs: NotRequired[pulumi.Input[builtins.bool]]
        """
        Specifies if the Azure Subscription Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
elif False:
    ElasticsearchLogsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ElasticsearchLogsArgs:
    def __init__(__self__, *,
                 filtering_tags: Optional[pulumi.Input[Sequence[pulumi.Input['ElasticsearchLogsFilteringTagArgs']]]] = None,
                 send_activity_logs: Optional[pulumi.Input[builtins.bool]] = None,
                 send_azuread_logs: Optional[pulumi.Input[builtins.bool]] = None,
                 send_subscription_logs: Optional[pulumi.Input[builtins.bool]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['ElasticsearchLogsFilteringTagArgs']]] filtering_tags: A list of `filtering_tag` blocks as defined above.
        :param pulumi.Input[builtins.bool] send_activity_logs: Specifies if the Azure Activity Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        :param pulumi.Input[builtins.bool] send_azuread_logs: Specifies if the AzureAD Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        :param pulumi.Input[builtins.bool] send_subscription_logs: Specifies if the Azure Subscription Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
        if filtering_tags is not None:
            pulumi.set(__self__, "filtering_tags", filtering_tags)
        if send_activity_logs is not None:
            pulumi.set(__self__, "send_activity_logs", send_activity_logs)
        if send_azuread_logs is not None:
            pulumi.set(__self__, "send_azuread_logs", send_azuread_logs)
        if send_subscription_logs is not None:
            pulumi.set(__self__, "send_subscription_logs", send_subscription_logs)

    @property
    @pulumi.getter(name="filteringTags")
    def filtering_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElasticsearchLogsFilteringTagArgs']]]]:
        """
        A list of `filtering_tag` blocks as defined above.
        """
        return pulumi.get(self, "filtering_tags")

    @filtering_tags.setter
    def filtering_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElasticsearchLogsFilteringTagArgs']]]]):
        pulumi.set(self, "filtering_tags", value)

    @property
    @pulumi.getter(name="sendActivityLogs")
    def send_activity_logs(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Specifies if the Azure Activity Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
        return pulumi.get(self, "send_activity_logs")

    @send_activity_logs.setter
    def send_activity_logs(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "send_activity_logs", value)

    @property
    @pulumi.getter(name="sendAzureadLogs")
    def send_azuread_logs(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Specifies if the AzureAD Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
        return pulumi.get(self, "send_azuread_logs")

    @send_azuread_logs.setter
    def send_azuread_logs(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "send_azuread_logs", value)

    @property
    @pulumi.getter(name="sendSubscriptionLogs")
    def send_subscription_logs(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Specifies if the Azure Subscription Logs should be sent to the Elasticsearch cluster. Defaults to `false`.
        """
        return pulumi.get(self, "send_subscription_logs")

    @send_subscription_logs.setter
    def send_subscription_logs(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "send_subscription_logs", value)


if not MYPY:
    class ElasticsearchLogsFilteringTagArgsDict(TypedDict):
        action: pulumi.Input[builtins.str]
        """
        Specifies the type of action which should be taken when the Tag matches the `name` and `value`. Possible values are `Exclude` and `Include`.
        """
        name: pulumi.Input[builtins.str]
        """
        Specifies the name (key) of the Tag which should be filtered.
        """
        value: pulumi.Input[builtins.str]
        """
        Specifies the value of the Tag which should be filtered.
        """
elif False:
    ElasticsearchLogsFilteringTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ElasticsearchLogsFilteringTagArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[builtins.str],
                 name: pulumi.Input[builtins.str],
                 value: pulumi.Input[builtins.str]):
        """
        :param pulumi.Input[builtins.str] action: Specifies the type of action which should be taken when the Tag matches the `name` and `value`. Possible values are `Exclude` and `Include`.
        :param pulumi.Input[builtins.str] name: Specifies the name (key) of the Tag which should be filtered.
        :param pulumi.Input[builtins.str] value: Specifies the value of the Tag which should be filtered.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[builtins.str]:
        """
        Specifies the type of action which should be taken when the Tag matches the `name` and `value`. Possible values are `Exclude` and `Include`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[builtins.str]:
        """
        Specifies the name (key) of the Tag which should be filtered.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[builtins.str]:
        """
        Specifies the value of the Tag which should be filtered.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "value", value)


if not MYPY:
    class GetElasticsearchLogArgsDict(TypedDict):
        filtering_tags: Sequence['GetElasticsearchLogFilteringTagArgsDict']
        """
        A list of `filtering_tag` blocks as defined above.
        """
        send_activity_logs: builtins.bool
        """
        Should the Azure Activity Logs should be sent to the Elasticsearch cluster?
        """
        send_azuread_logs: builtins.bool
        """
        Should the AzureAD Logs should be sent to the Elasticsearch cluster?
        """
        send_subscription_logs: builtins.bool
        """
        Should the Azure Subscription Logs should be sent to the Elasticsearch cluster?
        """
elif False:
    GetElasticsearchLogArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetElasticsearchLogArgs:
    def __init__(__self__, *,
                 filtering_tags: Sequence['GetElasticsearchLogFilteringTagArgs'],
                 send_activity_logs: builtins.bool,
                 send_azuread_logs: builtins.bool,
                 send_subscription_logs: builtins.bool):
        """
        :param Sequence['GetElasticsearchLogFilteringTagArgs'] filtering_tags: A list of `filtering_tag` blocks as defined above.
        :param builtins.bool send_activity_logs: Should the Azure Activity Logs should be sent to the Elasticsearch cluster?
        :param builtins.bool send_azuread_logs: Should the AzureAD Logs should be sent to the Elasticsearch cluster?
        :param builtins.bool send_subscription_logs: Should the Azure Subscription Logs should be sent to the Elasticsearch cluster?
        """
        pulumi.set(__self__, "filtering_tags", filtering_tags)
        pulumi.set(__self__, "send_activity_logs", send_activity_logs)
        pulumi.set(__self__, "send_azuread_logs", send_azuread_logs)
        pulumi.set(__self__, "send_subscription_logs", send_subscription_logs)

    @property
    @pulumi.getter(name="filteringTags")
    def filtering_tags(self) -> Sequence['GetElasticsearchLogFilteringTagArgs']:
        """
        A list of `filtering_tag` blocks as defined above.
        """
        return pulumi.get(self, "filtering_tags")

    @filtering_tags.setter
    def filtering_tags(self, value: Sequence['GetElasticsearchLogFilteringTagArgs']):
        pulumi.set(self, "filtering_tags", value)

    @property
    @pulumi.getter(name="sendActivityLogs")
    def send_activity_logs(self) -> builtins.bool:
        """
        Should the Azure Activity Logs should be sent to the Elasticsearch cluster?
        """
        return pulumi.get(self, "send_activity_logs")

    @send_activity_logs.setter
    def send_activity_logs(self, value: builtins.bool):
        pulumi.set(self, "send_activity_logs", value)

    @property
    @pulumi.getter(name="sendAzureadLogs")
    def send_azuread_logs(self) -> builtins.bool:
        """
        Should the AzureAD Logs should be sent to the Elasticsearch cluster?
        """
        return pulumi.get(self, "send_azuread_logs")

    @send_azuread_logs.setter
    def send_azuread_logs(self, value: builtins.bool):
        pulumi.set(self, "send_azuread_logs", value)

    @property
    @pulumi.getter(name="sendSubscriptionLogs")
    def send_subscription_logs(self) -> builtins.bool:
        """
        Should the Azure Subscription Logs should be sent to the Elasticsearch cluster?
        """
        return pulumi.get(self, "send_subscription_logs")

    @send_subscription_logs.setter
    def send_subscription_logs(self, value: builtins.bool):
        pulumi.set(self, "send_subscription_logs", value)


if not MYPY:
    class GetElasticsearchLogFilteringTagArgsDict(TypedDict):
        action: builtins.str
        """
        The type of action which is taken when the Tag matches the `name` and `value`.
        """
        name: builtins.str
        """
        The name of the Elasticsearch resource.
        """
        value: builtins.str
        """
        The value of the Tag which should be filtered.
        """
elif False:
    GetElasticsearchLogFilteringTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetElasticsearchLogFilteringTagArgs:
    def __init__(__self__, *,
                 action: builtins.str,
                 name: builtins.str,
                 value: builtins.str):
        """
        :param builtins.str action: The type of action which is taken when the Tag matches the `name` and `value`.
        :param builtins.str name: The name of the Elasticsearch resource.
        :param builtins.str value: The value of the Tag which should be filtered.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def action(self) -> builtins.str:
        """
        The type of action which is taken when the Tag matches the `name` and `value`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: builtins.str):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The name of the Elasticsearch resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: builtins.str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> builtins.str:
        """
        The value of the Tag which should be filtered.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: builtins.str):
        pulumi.set(self, "value", value)


