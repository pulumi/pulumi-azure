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
    'CloudVmClusterDataCollectionOptionsArgs',
    'CloudVmClusterDataCollectionOptionsArgsDict',
    'ExadataInfrastructureMaintenanceWindowArgs',
    'ExadataInfrastructureMaintenanceWindowArgsDict',
]

MYPY = False

if not MYPY:
    class CloudVmClusterDataCollectionOptionsArgsDict(TypedDict):
        diagnostics_events_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Indicates whether diagnostic collection is enabled for the VM Cluster/Cloud VM Cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM Cluster/Cloud VM Cluster provisioning. You can also disable or enable it at any time using the `UpdateVmCluster` or `updateCloudVmCluster` API. Changing this forces a new Cloud VM Cluster to be created.
        """
        health_monitoring_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Indicates whether health monitoring is enabled for the VM Cluster / Cloud VM Cluster / VMBM DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel. You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system. Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the `UpdateVmCluster`, `UpdateCloudVmCluster` or `updateDbsystem` API. Changing this forces a new Cloud VM Cluster to be created.
        """
        incident_logs_enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Indicates whether incident logs and trace collection are enabled for the VM Cluster / Cloud VM Cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them. Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the `UpdateVmCluster`, `updateCloudVmCluster` or `updateDbsystem` API. Changing this forces a new Cloud VM Cluster to be created.
        """
elif False:
    CloudVmClusterDataCollectionOptionsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class CloudVmClusterDataCollectionOptionsArgs:
    def __init__(__self__, *,
                 diagnostics_events_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 health_monitoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 incident_logs_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.bool] diagnostics_events_enabled: Indicates whether diagnostic collection is enabled for the VM Cluster/Cloud VM Cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM Cluster/Cloud VM Cluster provisioning. You can also disable or enable it at any time using the `UpdateVmCluster` or `updateCloudVmCluster` API. Changing this forces a new Cloud VM Cluster to be created.
        :param pulumi.Input[_builtins.bool] health_monitoring_enabled: Indicates whether health monitoring is enabled for the VM Cluster / Cloud VM Cluster / VMBM DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel. You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system. Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the `UpdateVmCluster`, `UpdateCloudVmCluster` or `updateDbsystem` API. Changing this forces a new Cloud VM Cluster to be created.
        :param pulumi.Input[_builtins.bool] incident_logs_enabled: Indicates whether incident logs and trace collection are enabled for the VM Cluster / Cloud VM Cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them. Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the `UpdateVmCluster`, `updateCloudVmCluster` or `updateDbsystem` API. Changing this forces a new Cloud VM Cluster to be created.
        """
        if diagnostics_events_enabled is not None:
            pulumi.set(__self__, "diagnostics_events_enabled", diagnostics_events_enabled)
        if health_monitoring_enabled is not None:
            pulumi.set(__self__, "health_monitoring_enabled", health_monitoring_enabled)
        if incident_logs_enabled is not None:
            pulumi.set(__self__, "incident_logs_enabled", incident_logs_enabled)

    @_builtins.property
    @pulumi.getter(name="diagnosticsEventsEnabled")
    def diagnostics_events_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether diagnostic collection is enabled for the VM Cluster/Cloud VM Cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service notifications for guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and proactive support for your Exadata system. You can enable diagnostic collection during VM Cluster/Cloud VM Cluster provisioning. You can also disable or enable it at any time using the `UpdateVmCluster` or `updateCloudVmCluster` API. Changing this forces a new Cloud VM Cluster to be created.
        """
        return pulumi.get(self, "diagnostics_events_enabled")

    @diagnostics_events_enabled.setter
    def diagnostics_events_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "diagnostics_events_enabled", value)

    @_builtins.property
    @pulumi.getter(name="healthMonitoringEnabled")
    def health_monitoring_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether health monitoring is enabled for the VM Cluster / Cloud VM Cluster / VMBM DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share it with its operations and support personnel. You may also receive notifications for some events. Collecting health diagnostics enables Oracle to provide proactive support and enhanced service for your system. Optionally enable health monitoring while provisioning a system. You can also disable or enable health monitoring anytime using the `UpdateVmCluster`, `UpdateCloudVmCluster` or `updateDbsystem` API. Changing this forces a new Cloud VM Cluster to be created.
        """
        return pulumi.get(self, "health_monitoring_enabled")

    @health_monitoring_enabled.setter
    def health_monitoring_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "health_monitoring_enabled", value)

    @_builtins.property
    @pulumi.getter(name="incidentLogsEnabled")
    def incident_logs_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether incident logs and trace collection are enabled for the VM Cluster / Cloud VM Cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive Events service notifications for guest VM issues, collect incident logs and traces, and use them to diagnose issues and resolve them. Optionally enable incident logs collection while provisioning a system. You can also disable or enable incident logs collection anytime using the `UpdateVmCluster`, `updateCloudVmCluster` or `updateDbsystem` API. Changing this forces a new Cloud VM Cluster to be created.
        """
        return pulumi.get(self, "incident_logs_enabled")

    @incident_logs_enabled.setter
    def incident_logs_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "incident_logs_enabled", value)


if not MYPY:
    class ExadataInfrastructureMaintenanceWindowArgsDict(TypedDict):
        days_of_weeks: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        Days during the week when maintenance should be performed. Valid values are: `0` - represents time slot `0:00 - 3:59 UTC - 4` - represents time slot `4:00 - 7:59 UTC - 8` - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot `20:00 - 23:59 UTC`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        hours_of_days: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]
        """
        The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        lead_time_in_weeks: NotRequired[pulumi.Input[_builtins.int]]
        """
        Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid value is between `1` to `4`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        months: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        Months during the year when maintenance should be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        patching_mode: NotRequired[pulumi.Input[_builtins.str]]
        """
        Cloud Exadata Infrastructure node patching method, either `ROLLING` or `NONROLLING`. Default value is `ROLLING`. IMPORTANT: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        preference: NotRequired[pulumi.Input[_builtins.str]]
        """
        The maintenance window scheduling preference. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        weeks_of_months: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]
        """
        Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
elif False:
    ExadataInfrastructureMaintenanceWindowArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ExadataInfrastructureMaintenanceWindowArgs:
    def __init__(__self__, *,
                 days_of_weeks: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 hours_of_days: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]] = None,
                 lead_time_in_weeks: Optional[pulumi.Input[_builtins.int]] = None,
                 months: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 patching_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 preference: Optional[pulumi.Input[_builtins.str]] = None,
                 weeks_of_months: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] days_of_weeks: Days during the week when maintenance should be performed. Valid values are: `0` - represents time slot `0:00 - 3:59 UTC - 4` - represents time slot `4:00 - 7:59 UTC - 8` - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot `20:00 - 23:59 UTC`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.int]]] hours_of_days: The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Changing this forces a new Cloud Exadata Infrastructure to be created.
        :param pulumi.Input[_builtins.int] lead_time_in_weeks: Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid value is between `1` to `4`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] months: Months during the year when maintenance should be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        :param pulumi.Input[_builtins.str] patching_mode: Cloud Exadata Infrastructure node patching method, either `ROLLING` or `NONROLLING`. Default value is `ROLLING`. IMPORTANT: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information. Changing this forces a new Cloud Exadata Infrastructure to be created.
        :param pulumi.Input[_builtins.str] preference: The maintenance window scheduling preference. Changing this forces a new Cloud Exadata Infrastructure to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.int]]] weeks_of_months: Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        if days_of_weeks is not None:
            pulumi.set(__self__, "days_of_weeks", days_of_weeks)
        if hours_of_days is not None:
            pulumi.set(__self__, "hours_of_days", hours_of_days)
        if lead_time_in_weeks is not None:
            pulumi.set(__self__, "lead_time_in_weeks", lead_time_in_weeks)
        if months is not None:
            pulumi.set(__self__, "months", months)
        if patching_mode is not None:
            pulumi.set(__self__, "patching_mode", patching_mode)
        if preference is not None:
            pulumi.set(__self__, "preference", preference)
        if weeks_of_months is not None:
            pulumi.set(__self__, "weeks_of_months", weeks_of_months)

    @_builtins.property
    @pulumi.getter(name="daysOfWeeks")
    def days_of_weeks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Days during the week when maintenance should be performed. Valid values are: `0` - represents time slot `0:00 - 3:59 UTC - 4` - represents time slot `4:00 - 7:59 UTC - 8` - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot `20:00 - 23:59 UTC`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "days_of_weeks")

    @days_of_weeks.setter
    def days_of_weeks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "days_of_weeks", value)

    @_builtins.property
    @pulumi.getter(name="hoursOfDays")
    def hours_of_days(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]:
        """
        The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "hours_of_days")

    @hours_of_days.setter
    def hours_of_days(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]):
        pulumi.set(self, "hours_of_days", value)

    @_builtins.property
    @pulumi.getter(name="leadTimeInWeeks")
    def lead_time_in_weeks(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid value is between `1` to `4`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "lead_time_in_weeks")

    @lead_time_in_weeks.setter
    def lead_time_in_weeks(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "lead_time_in_weeks", value)

    @_builtins.property
    @pulumi.getter
    def months(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Months during the year when maintenance should be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "months")

    @months.setter
    def months(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "months", value)

    @_builtins.property
    @pulumi.getter(name="patchingMode")
    def patching_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Cloud Exadata Infrastructure node patching method, either `ROLLING` or `NONROLLING`. Default value is `ROLLING`. IMPORTANT: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "patching_mode")

    @patching_mode.setter
    def patching_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "patching_mode", value)

    @_builtins.property
    @pulumi.getter
    def preference(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The maintenance window scheduling preference. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "preference")

    @preference.setter
    def preference(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "preference", value)

    @_builtins.property
    @pulumi.getter(name="weeksOfMonths")
    def weeks_of_months(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]:
        """
        Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        """
        return pulumi.get(self, "weeks_of_months")

    @weeks_of_months.setter
    def weeks_of_months(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]):
        pulumi.set(self, "weeks_of_months", value)


