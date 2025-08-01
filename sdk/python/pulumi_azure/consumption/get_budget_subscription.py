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

__all__ = [
    'GetBudgetSubscriptionResult',
    'AwaitableGetBudgetSubscriptionResult',
    'get_budget_subscription',
    'get_budget_subscription_output',
]

@pulumi.output_type
class GetBudgetSubscriptionResult:
    """
    A collection of values returned by getBudgetSubscription.
    """
    def __init__(__self__, amount=None, filters=None, id=None, name=None, notifications=None, subscription_id=None, time_grain=None, time_periods=None):
        if amount and not isinstance(amount, float):
            raise TypeError("Expected argument 'amount' to be a float")
        pulumi.set(__self__, "amount", amount)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if subscription_id and not isinstance(subscription_id, str):
            raise TypeError("Expected argument 'subscription_id' to be a str")
        pulumi.set(__self__, "subscription_id", subscription_id)
        if time_grain and not isinstance(time_grain, str):
            raise TypeError("Expected argument 'time_grain' to be a str")
        pulumi.set(__self__, "time_grain", time_grain)
        if time_periods and not isinstance(time_periods, list):
            raise TypeError("Expected argument 'time_periods' to be a list")
        pulumi.set(__self__, "time_periods", time_periods)

    @_builtins.property
    @pulumi.getter
    def amount(self) -> _builtins.float:
        """
        The total amount of cost to track with the budget.
        """
        return pulumi.get(self, "amount")

    @_builtins.property
    @pulumi.getter
    def filters(self) -> Sequence['outputs.GetBudgetSubscriptionFilterResult']:
        """
        A `filter` block as defined below.
        """
        return pulumi.get(self, "filters")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the tag to use for the filter.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetBudgetSubscriptionNotificationResult']:
        """
        A `notification` block as defined below.
        """
        return pulumi.get(self, "notifications")

    @_builtins.property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> _builtins.str:
        return pulumi.get(self, "subscription_id")

    @_builtins.property
    @pulumi.getter(name="timeGrain")
    def time_grain(self) -> _builtins.str:
        """
        The time covered by a budget.
        """
        return pulumi.get(self, "time_grain")

    @_builtins.property
    @pulumi.getter(name="timePeriods")
    def time_periods(self) -> Sequence['outputs.GetBudgetSubscriptionTimePeriodResult']:
        """
        A `time_period` block as defined below.
        """
        return pulumi.get(self, "time_periods")


class AwaitableGetBudgetSubscriptionResult(GetBudgetSubscriptionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBudgetSubscriptionResult(
            amount=self.amount,
            filters=self.filters,
            id=self.id,
            name=self.name,
            notifications=self.notifications,
            subscription_id=self.subscription_id,
            time_grain=self.time_grain,
            time_periods=self.time_periods)


def get_budget_subscription(name: Optional[_builtins.str] = None,
                            subscription_id: Optional[_builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBudgetSubscriptionResult:
    """
    Use this data source to access information about an existing Consumption Budget for a specific subscription.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.consumption.get_budget_subscription(name="existing",
        subscription_id="/subscriptions/00000000-0000-0000-0000-000000000000/")
    pulumi.export("id", example_azurerm_consumption_budget["id"])
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Consumption`: 2019-10-01


    :param _builtins.str name: The name of this Consumption Budget.
    :param _builtins.str subscription_id: The ID of the subscription.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['subscriptionId'] = subscription_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:consumption/getBudgetSubscription:getBudgetSubscription', __args__, opts=opts, typ=GetBudgetSubscriptionResult).value

    return AwaitableGetBudgetSubscriptionResult(
        amount=pulumi.get(__ret__, 'amount'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        notifications=pulumi.get(__ret__, 'notifications'),
        subscription_id=pulumi.get(__ret__, 'subscription_id'),
        time_grain=pulumi.get(__ret__, 'time_grain'),
        time_periods=pulumi.get(__ret__, 'time_periods'))
def get_budget_subscription_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                   subscription_id: Optional[pulumi.Input[_builtins.str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBudgetSubscriptionResult]:
    """
    Use this data source to access information about an existing Consumption Budget for a specific subscription.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.consumption.get_budget_subscription(name="existing",
        subscription_id="/subscriptions/00000000-0000-0000-0000-000000000000/")
    pulumi.export("id", example_azurerm_consumption_budget["id"])
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Consumption`: 2019-10-01


    :param _builtins.str name: The name of this Consumption Budget.
    :param _builtins.str subscription_id: The ID of the subscription.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['subscriptionId'] = subscription_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:consumption/getBudgetSubscription:getBudgetSubscription', __args__, opts=opts, typ=GetBudgetSubscriptionResult)
    return __ret__.apply(lambda __response__: GetBudgetSubscriptionResult(
        amount=pulumi.get(__response__, 'amount'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        notifications=pulumi.get(__response__, 'notifications'),
        subscription_id=pulumi.get(__response__, 'subscription_id'),
        time_grain=pulumi.get(__response__, 'time_grain'),
        time_periods=pulumi.get(__response__, 'time_periods')))
