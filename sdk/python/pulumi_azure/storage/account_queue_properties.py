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

__all__ = ['AccountQueuePropertiesInitArgs', 'AccountQueueProperties']

@pulumi.input_type
class AccountQueuePropertiesInitArgs:
    def __init__(__self__, *,
                 storage_account_id: pulumi.Input[_builtins.str],
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]]] = None,
                 hour_metrics: Optional[pulumi.Input['AccountQueuePropertiesHourMetricsArgs']] = None,
                 logging: Optional[pulumi.Input['AccountQueuePropertiesLoggingArgs']] = None,
                 minute_metrics: Optional[pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs']] = None):
        """
        The set of arguments for constructing a AccountQueueProperties resource.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]] cors_rules: A `cors_rule` block as defined above.
        :param pulumi.Input['AccountQueuePropertiesHourMetricsArgs'] hour_metrics: A `hour_metrics` block as defined below.
               
               > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        :param pulumi.Input['AccountQueuePropertiesLoggingArgs'] logging: A `logging` block as defined below.
        :param pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs'] minute_metrics: A `minute_metrics` block as defined below.
        """
        pulumi.set(__self__, "storage_account_id", storage_account_id)
        if cors_rules is not None:
            pulumi.set(__self__, "cors_rules", cors_rules)
        if hour_metrics is not None:
            pulumi.set(__self__, "hour_metrics", hour_metrics)
        if logging is not None:
            pulumi.set(__self__, "logging", logging)
        if minute_metrics is not None:
            pulumi.set(__self__, "minute_metrics", minute_metrics)

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]]]:
        """
        A `cors_rule` block as defined above.
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]]]):
        pulumi.set(self, "cors_rules", value)

    @_builtins.property
    @pulumi.getter(name="hourMetrics")
    def hour_metrics(self) -> Optional[pulumi.Input['AccountQueuePropertiesHourMetricsArgs']]:
        """
        A `hour_metrics` block as defined below.

        > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        """
        return pulumi.get(self, "hour_metrics")

    @hour_metrics.setter
    def hour_metrics(self, value: Optional[pulumi.Input['AccountQueuePropertiesHourMetricsArgs']]):
        pulumi.set(self, "hour_metrics", value)

    @_builtins.property
    @pulumi.getter
    def logging(self) -> Optional[pulumi.Input['AccountQueuePropertiesLoggingArgs']]:
        """
        A `logging` block as defined below.
        """
        return pulumi.get(self, "logging")

    @logging.setter
    def logging(self, value: Optional[pulumi.Input['AccountQueuePropertiesLoggingArgs']]):
        pulumi.set(self, "logging", value)

    @_builtins.property
    @pulumi.getter(name="minuteMetrics")
    def minute_metrics(self) -> Optional[pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs']]:
        """
        A `minute_metrics` block as defined below.
        """
        return pulumi.get(self, "minute_metrics")

    @minute_metrics.setter
    def minute_metrics(self, value: Optional[pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs']]):
        pulumi.set(self, "minute_metrics", value)


@pulumi.input_type
class _AccountQueuePropertiesState:
    def __init__(__self__, *,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]]] = None,
                 hour_metrics: Optional[pulumi.Input['AccountQueuePropertiesHourMetricsArgs']] = None,
                 logging: Optional[pulumi.Input['AccountQueuePropertiesLoggingArgs']] = None,
                 minute_metrics: Optional[pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs']] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AccountQueueProperties resources.
        :param pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]] cors_rules: A `cors_rule` block as defined above.
        :param pulumi.Input['AccountQueuePropertiesHourMetricsArgs'] hour_metrics: A `hour_metrics` block as defined below.
               
               > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        :param pulumi.Input['AccountQueuePropertiesLoggingArgs'] logging: A `logging` block as defined below.
        :param pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs'] minute_metrics: A `minute_metrics` block as defined below.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        """
        if cors_rules is not None:
            pulumi.set(__self__, "cors_rules", cors_rules)
        if hour_metrics is not None:
            pulumi.set(__self__, "hour_metrics", hour_metrics)
        if logging is not None:
            pulumi.set(__self__, "logging", logging)
        if minute_metrics is not None:
            pulumi.set(__self__, "minute_metrics", minute_metrics)
        if storage_account_id is not None:
            pulumi.set(__self__, "storage_account_id", storage_account_id)

    @_builtins.property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]]]:
        """
        A `cors_rule` block as defined above.
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccountQueuePropertiesCorsRuleArgs']]]]):
        pulumi.set(self, "cors_rules", value)

    @_builtins.property
    @pulumi.getter(name="hourMetrics")
    def hour_metrics(self) -> Optional[pulumi.Input['AccountQueuePropertiesHourMetricsArgs']]:
        """
        A `hour_metrics` block as defined below.

        > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        """
        return pulumi.get(self, "hour_metrics")

    @hour_metrics.setter
    def hour_metrics(self, value: Optional[pulumi.Input['AccountQueuePropertiesHourMetricsArgs']]):
        pulumi.set(self, "hour_metrics", value)

    @_builtins.property
    @pulumi.getter
    def logging(self) -> Optional[pulumi.Input['AccountQueuePropertiesLoggingArgs']]:
        """
        A `logging` block as defined below.
        """
        return pulumi.get(self, "logging")

    @logging.setter
    def logging(self, value: Optional[pulumi.Input['AccountQueuePropertiesLoggingArgs']]):
        pulumi.set(self, "logging", value)

    @_builtins.property
    @pulumi.getter(name="minuteMetrics")
    def minute_metrics(self) -> Optional[pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs']]:
        """
        A `minute_metrics` block as defined below.
        """
        return pulumi.get(self, "minute_metrics")

    @minute_metrics.setter
    def minute_metrics(self, value: Optional[pulumi.Input['AccountQueuePropertiesMinuteMetricsArgs']]):
        pulumi.set(self, "minute_metrics", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_id", value)


@pulumi.type_token("azure:storage/accountQueueProperties:AccountQueueProperties")
class AccountQueueProperties(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountQueuePropertiesCorsRuleArgs', 'AccountQueuePropertiesCorsRuleArgsDict']]]]] = None,
                 hour_metrics: Optional[pulumi.Input[Union['AccountQueuePropertiesHourMetricsArgs', 'AccountQueuePropertiesHourMetricsArgsDict']]] = None,
                 logging: Optional[pulumi.Input[Union['AccountQueuePropertiesLoggingArgs', 'AccountQueuePropertiesLoggingArgsDict']]] = None,
                 minute_metrics: Optional[pulumi.Input[Union['AccountQueuePropertiesMinuteMetricsArgs', 'AccountQueuePropertiesMinuteMetricsArgsDict']]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages the Queue Properties of an Azure Storage Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="storageaccountname",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="GRS",
            tags={
                "environment": "staging",
            })
        example_account_queue_properties = azure.storage.AccountQueueProperties("example",
            storage_account_id=example_account.id,
            cors_rules=[{
                "allowed_origins": ["http://www.example.com"],
                "exposed_headers": ["x-tempo-*"],
                "allowed_headers": ["x-tempo-*"],
                "allowed_methods": [
                    "GET",
                    "PUT",
                ],
                "max_age_in_seconds": 500,
            }],
            logging={
                "version": "1.0",
                "delete": True,
                "read": True,
                "write": True,
                "retention_policy_days": 7,
            },
            hour_metrics={
                "version": "1.0",
                "retention_policy_days": 7,
            },
            minute_metrics={
                "version": "1.0",
                "retention_policy_days": 7,
            })
        ```

        ## Import

        Storage Account Queue Properties can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/accountQueueProperties:AccountQueueProperties queueprops /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AccountQueuePropertiesCorsRuleArgs', 'AccountQueuePropertiesCorsRuleArgsDict']]]] cors_rules: A `cors_rule` block as defined above.
        :param pulumi.Input[Union['AccountQueuePropertiesHourMetricsArgs', 'AccountQueuePropertiesHourMetricsArgsDict']] hour_metrics: A `hour_metrics` block as defined below.
               
               > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        :param pulumi.Input[Union['AccountQueuePropertiesLoggingArgs', 'AccountQueuePropertiesLoggingArgsDict']] logging: A `logging` block as defined below.
        :param pulumi.Input[Union['AccountQueuePropertiesMinuteMetricsArgs', 'AccountQueuePropertiesMinuteMetricsArgsDict']] minute_metrics: A `minute_metrics` block as defined below.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountQueuePropertiesInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the Queue Properties of an Azure Storage Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="storageaccountname",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="GRS",
            tags={
                "environment": "staging",
            })
        example_account_queue_properties = azure.storage.AccountQueueProperties("example",
            storage_account_id=example_account.id,
            cors_rules=[{
                "allowed_origins": ["http://www.example.com"],
                "exposed_headers": ["x-tempo-*"],
                "allowed_headers": ["x-tempo-*"],
                "allowed_methods": [
                    "GET",
                    "PUT",
                ],
                "max_age_in_seconds": 500,
            }],
            logging={
                "version": "1.0",
                "delete": True,
                "read": True,
                "write": True,
                "retention_policy_days": 7,
            },
            hour_metrics={
                "version": "1.0",
                "retention_policy_days": 7,
            },
            minute_metrics={
                "version": "1.0",
                "retention_policy_days": 7,
            })
        ```

        ## Import

        Storage Account Queue Properties can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/accountQueueProperties:AccountQueueProperties queueprops /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount
        ```

        :param str resource_name: The name of the resource.
        :param AccountQueuePropertiesInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountQueuePropertiesInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountQueuePropertiesCorsRuleArgs', 'AccountQueuePropertiesCorsRuleArgsDict']]]]] = None,
                 hour_metrics: Optional[pulumi.Input[Union['AccountQueuePropertiesHourMetricsArgs', 'AccountQueuePropertiesHourMetricsArgsDict']]] = None,
                 logging: Optional[pulumi.Input[Union['AccountQueuePropertiesLoggingArgs', 'AccountQueuePropertiesLoggingArgsDict']]] = None,
                 minute_metrics: Optional[pulumi.Input[Union['AccountQueuePropertiesMinuteMetricsArgs', 'AccountQueuePropertiesMinuteMetricsArgsDict']]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountQueuePropertiesInitArgs.__new__(AccountQueuePropertiesInitArgs)

            __props__.__dict__["cors_rules"] = cors_rules
            __props__.__dict__["hour_metrics"] = hour_metrics
            __props__.__dict__["logging"] = logging
            __props__.__dict__["minute_metrics"] = minute_metrics
            if storage_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_account_id'")
            __props__.__dict__["storage_account_id"] = storage_account_id
        super(AccountQueueProperties, __self__).__init__(
            'azure:storage/accountQueueProperties:AccountQueueProperties',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountQueuePropertiesCorsRuleArgs', 'AccountQueuePropertiesCorsRuleArgsDict']]]]] = None,
            hour_metrics: Optional[pulumi.Input[Union['AccountQueuePropertiesHourMetricsArgs', 'AccountQueuePropertiesHourMetricsArgsDict']]] = None,
            logging: Optional[pulumi.Input[Union['AccountQueuePropertiesLoggingArgs', 'AccountQueuePropertiesLoggingArgsDict']]] = None,
            minute_metrics: Optional[pulumi.Input[Union['AccountQueuePropertiesMinuteMetricsArgs', 'AccountQueuePropertiesMinuteMetricsArgsDict']]] = None,
            storage_account_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'AccountQueueProperties':
        """
        Get an existing AccountQueueProperties resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AccountQueuePropertiesCorsRuleArgs', 'AccountQueuePropertiesCorsRuleArgsDict']]]] cors_rules: A `cors_rule` block as defined above.
        :param pulumi.Input[Union['AccountQueuePropertiesHourMetricsArgs', 'AccountQueuePropertiesHourMetricsArgsDict']] hour_metrics: A `hour_metrics` block as defined below.
               
               > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        :param pulumi.Input[Union['AccountQueuePropertiesLoggingArgs', 'AccountQueuePropertiesLoggingArgsDict']] logging: A `logging` block as defined below.
        :param pulumi.Input[Union['AccountQueuePropertiesMinuteMetricsArgs', 'AccountQueuePropertiesMinuteMetricsArgsDict']] minute_metrics: A `minute_metrics` block as defined below.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountQueuePropertiesState.__new__(_AccountQueuePropertiesState)

        __props__.__dict__["cors_rules"] = cors_rules
        __props__.__dict__["hour_metrics"] = hour_metrics
        __props__.__dict__["logging"] = logging
        __props__.__dict__["minute_metrics"] = minute_metrics
        __props__.__dict__["storage_account_id"] = storage_account_id
        return AccountQueueProperties(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> pulumi.Output[Optional[Sequence['outputs.AccountQueuePropertiesCorsRule']]]:
        """
        A `cors_rule` block as defined above.
        """
        return pulumi.get(self, "cors_rules")

    @_builtins.property
    @pulumi.getter(name="hourMetrics")
    def hour_metrics(self) -> pulumi.Output['outputs.AccountQueuePropertiesHourMetrics']:
        """
        A `hour_metrics` block as defined below.

        > **Note:** At least one of `cors_rule`, `logging`, `minute_metrics`, or `hour_metrics` must be specified.
        """
        return pulumi.get(self, "hour_metrics")

    @_builtins.property
    @pulumi.getter
    def logging(self) -> pulumi.Output['outputs.AccountQueuePropertiesLogging']:
        """
        A `logging` block as defined below.
        """
        return pulumi.get(self, "logging")

    @_builtins.property
    @pulumi.getter(name="minuteMetrics")
    def minute_metrics(self) -> pulumi.Output['outputs.AccountQueuePropertiesMinuteMetrics']:
        """
        A `minute_metrics` block as defined below.
        """
        return pulumi.get(self, "minute_metrics")

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Storage Account to set Queue Properties on. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_account_id")

