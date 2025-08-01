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

__all__ = ['DataSourceWindowsEventArgs', 'DataSourceWindowsEvent']

@pulumi.input_type
class DataSourceWindowsEventArgs:
    def __init__(__self__, *,
                 event_log_name: pulumi.Input[_builtins.str],
                 event_types: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 resource_group_name: pulumi.Input[_builtins.str],
                 workspace_name: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a DataSourceWindowsEvent resource.
        :param pulumi.Input[_builtins.str] event_log_name: Specifies the name of the Windows Event Log to collect events from.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] event_types: Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] workspace_name: The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        pulumi.set(__self__, "event_log_name", event_log_name)
        pulumi.set(__self__, "event_types", event_types)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "workspace_name", workspace_name)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="eventLogName")
    def event_log_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Windows Event Log to collect events from.
        """
        return pulumi.get(self, "event_log_name")

    @event_log_name.setter
    def event_log_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "event_log_name", value)

    @_builtins.property
    @pulumi.getter(name="eventTypes")
    def event_types(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        """
        return pulumi.get(self, "event_types")

    @event_types.setter
    def event_types(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "event_types", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "workspace_name")

    @workspace_name.setter
    def workspace_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "workspace_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DataSourceWindowsEventState:
    def __init__(__self__, *,
                 event_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 workspace_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering DataSourceWindowsEvent resources.
        :param pulumi.Input[_builtins.str] event_log_name: Specifies the name of the Windows Event Log to collect events from.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] event_types: Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] workspace_name: The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        if event_log_name is not None:
            pulumi.set(__self__, "event_log_name", event_log_name)
        if event_types is not None:
            pulumi.set(__self__, "event_types", event_types)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if workspace_name is not None:
            pulumi.set(__self__, "workspace_name", workspace_name)

    @_builtins.property
    @pulumi.getter(name="eventLogName")
    def event_log_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Windows Event Log to collect events from.
        """
        return pulumi.get(self, "event_log_name")

    @event_log_name.setter
    def event_log_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_log_name", value)

    @_builtins.property
    @pulumi.getter(name="eventTypes")
    def event_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        """
        return pulumi.get(self, "event_types")

    @event_types.setter
    def event_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "event_types", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "workspace_name")

    @workspace_name.setter
    def workspace_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "workspace_name", value)


@pulumi.type_token("azure:loganalytics/dataSourceWindowsEvent:DataSourceWindowsEvent")
class DataSourceWindowsEvent(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 workspace_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Log Analytics Windows Event DataSource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_analytics_workspace = azure.operationalinsights.AnalyticsWorkspace("example",
            name="example-law",
            location=example.location,
            resource_group_name=example.name,
            sku="PerGB2018")
        example_data_source_windows_event = azure.loganalytics.DataSourceWindowsEvent("example",
            name="example-lad-wpc",
            resource_group_name=example.name,
            workspace_name=example_analytics_workspace.name,
            event_log_name="Application",
            event_types=["Error"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.OperationalInsights`: 2020-08-01

        ## Import

        Log Analytics Windows Event DataSources can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:loganalytics/dataSourceWindowsEvent:DataSourceWindowsEvent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/dataSources/datasource1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] event_log_name: Specifies the name of the Windows Event Log to collect events from.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] event_types: Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] workspace_name: The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataSourceWindowsEventArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Log Analytics Windows Event DataSource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_analytics_workspace = azure.operationalinsights.AnalyticsWorkspace("example",
            name="example-law",
            location=example.location,
            resource_group_name=example.name,
            sku="PerGB2018")
        example_data_source_windows_event = azure.loganalytics.DataSourceWindowsEvent("example",
            name="example-lad-wpc",
            resource_group_name=example.name,
            workspace_name=example_analytics_workspace.name,
            event_log_name="Application",
            event_types=["Error"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.OperationalInsights`: 2020-08-01

        ## Import

        Log Analytics Windows Event DataSources can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:loganalytics/dataSourceWindowsEvent:DataSourceWindowsEvent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/dataSources/datasource1
        ```

        :param str resource_name: The name of the resource.
        :param DataSourceWindowsEventArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataSourceWindowsEventArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 workspace_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataSourceWindowsEventArgs.__new__(DataSourceWindowsEventArgs)

            if event_log_name is None and not opts.urn:
                raise TypeError("Missing required property 'event_log_name'")
            __props__.__dict__["event_log_name"] = event_log_name
            if event_types is None and not opts.urn:
                raise TypeError("Missing required property 'event_types'")
            __props__.__dict__["event_types"] = event_types
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if workspace_name is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_name'")
            __props__.__dict__["workspace_name"] = workspace_name
        super(DataSourceWindowsEvent, __self__).__init__(
            'azure:loganalytics/dataSourceWindowsEvent:DataSourceWindowsEvent',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            event_log_name: Optional[pulumi.Input[_builtins.str]] = None,
            event_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            workspace_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'DataSourceWindowsEvent':
        """
        Get an existing DataSourceWindowsEvent resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] event_log_name: Specifies the name of the Windows Event Log to collect events from.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] event_types: Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        :param pulumi.Input[_builtins.str] workspace_name: The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataSourceWindowsEventState.__new__(_DataSourceWindowsEventState)

        __props__.__dict__["event_log_name"] = event_log_name
        __props__.__dict__["event_types"] = event_types
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["workspace_name"] = workspace_name
        return DataSourceWindowsEvent(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="eventLogName")
    def event_log_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Windows Event Log to collect events from.
        """
        return pulumi.get(self, "event_log_name")

    @_builtins.property
    @pulumi.getter(name="eventTypes")
    def event_types(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
        """
        return pulumi.get(self, "event_types")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
        """
        return pulumi.get(self, "workspace_name")

