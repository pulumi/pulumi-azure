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
    'GetAnalyticsWorkspaceResult',
    'AwaitableGetAnalyticsWorkspaceResult',
    'get_analytics_workspace',
    'get_analytics_workspace_output',
]

@pulumi.output_type
class GetAnalyticsWorkspaceResult:
    """
    A collection of values returned by getAnalyticsWorkspace.
    """
    def __init__(__self__, daily_quota_gb=None, id=None, location=None, name=None, primary_shared_key=None, resource_group_name=None, retention_in_days=None, secondary_shared_key=None, sku=None, tags=None, workspace_id=None):
        if daily_quota_gb and not isinstance(daily_quota_gb, float):
            raise TypeError("Expected argument 'daily_quota_gb' to be a float")
        pulumi.set(__self__, "daily_quota_gb", daily_quota_gb)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if primary_shared_key and not isinstance(primary_shared_key, str):
            raise TypeError("Expected argument 'primary_shared_key' to be a str")
        pulumi.set(__self__, "primary_shared_key", primary_shared_key)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if retention_in_days and not isinstance(retention_in_days, int):
            raise TypeError("Expected argument 'retention_in_days' to be a int")
        pulumi.set(__self__, "retention_in_days", retention_in_days)
        if secondary_shared_key and not isinstance(secondary_shared_key, str):
            raise TypeError("Expected argument 'secondary_shared_key' to be a str")
        pulumi.set(__self__, "secondary_shared_key", secondary_shared_key)
        if sku and not isinstance(sku, str):
            raise TypeError("Expected argument 'sku' to be a str")
        pulumi.set(__self__, "sku", sku)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if workspace_id and not isinstance(workspace_id, str):
            raise TypeError("Expected argument 'workspace_id' to be a str")
        pulumi.set(__self__, "workspace_id", workspace_id)

    @_builtins.property
    @pulumi.getter(name="dailyQuotaGb")
    def daily_quota_gb(self) -> _builtins.float:
        """
        The workspace daily quota for ingestion in GB.
        """
        return pulumi.get(self, "daily_quota_gb")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primarySharedKey")
    def primary_shared_key(self) -> _builtins.str:
        """
        The Primary shared key for the Log Analytics Workspace.
        """
        return pulumi.get(self, "primary_shared_key")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> _builtins.int:
        """
        The workspace data retention in days.
        """
        return pulumi.get(self, "retention_in_days")

    @_builtins.property
    @pulumi.getter(name="secondarySharedKey")
    def secondary_shared_key(self) -> _builtins.str:
        """
        The Secondary shared key for the Log Analytics Workspace.
        """
        return pulumi.get(self, "secondary_shared_key")

    @_builtins.property
    @pulumi.getter
    def sku(self) -> _builtins.str:
        """
        The SKU of the Log Analytics Workspace.
        """
        return pulumi.get(self, "sku")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> _builtins.str:
        """
        The Workspace (or Customer) ID for the Log Analytics Workspace.
        """
        return pulumi.get(self, "workspace_id")


class AwaitableGetAnalyticsWorkspaceResult(GetAnalyticsWorkspaceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAnalyticsWorkspaceResult(
            daily_quota_gb=self.daily_quota_gb,
            id=self.id,
            location=self.location,
            name=self.name,
            primary_shared_key=self.primary_shared_key,
            resource_group_name=self.resource_group_name,
            retention_in_days=self.retention_in_days,
            secondary_shared_key=self.secondary_shared_key,
            sku=self.sku,
            tags=self.tags,
            workspace_id=self.workspace_id)


def get_analytics_workspace(name: Optional[_builtins.str] = None,
                            resource_group_name: Optional[_builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAnalyticsWorkspaceResult:
    """
    Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.operationalinsights.get_analytics_workspace(name="acctest-01",
        resource_group_name="acctest")
    pulumi.export("logAnalyticsWorkspaceId", example.workspace_id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.OperationalInsights`: 2020-08-01


    :param _builtins.str name: Specifies the name of the Log Analytics Workspace.
    :param _builtins.str resource_group_name: The name of the resource group in which the Log Analytics workspace is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:operationalinsights/getAnalyticsWorkspace:getAnalyticsWorkspace', __args__, opts=opts, typ=GetAnalyticsWorkspaceResult).value

    return AwaitableGetAnalyticsWorkspaceResult(
        daily_quota_gb=pulumi.get(__ret__, 'daily_quota_gb'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        primary_shared_key=pulumi.get(__ret__, 'primary_shared_key'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        retention_in_days=pulumi.get(__ret__, 'retention_in_days'),
        secondary_shared_key=pulumi.get(__ret__, 'secondary_shared_key'),
        sku=pulumi.get(__ret__, 'sku'),
        tags=pulumi.get(__ret__, 'tags'),
        workspace_id=pulumi.get(__ret__, 'workspace_id'))
def get_analytics_workspace_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                   resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAnalyticsWorkspaceResult]:
    """
    Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.operationalinsights.get_analytics_workspace(name="acctest-01",
        resource_group_name="acctest")
    pulumi.export("logAnalyticsWorkspaceId", example.workspace_id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.OperationalInsights`: 2020-08-01


    :param _builtins.str name: Specifies the name of the Log Analytics Workspace.
    :param _builtins.str resource_group_name: The name of the resource group in which the Log Analytics workspace is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:operationalinsights/getAnalyticsWorkspace:getAnalyticsWorkspace', __args__, opts=opts, typ=GetAnalyticsWorkspaceResult)
    return __ret__.apply(lambda __response__: GetAnalyticsWorkspaceResult(
        daily_quota_gb=pulumi.get(__response__, 'daily_quota_gb'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        primary_shared_key=pulumi.get(__response__, 'primary_shared_key'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        retention_in_days=pulumi.get(__response__, 'retention_in_days'),
        secondary_shared_key=pulumi.get(__response__, 'secondary_shared_key'),
        sku=pulumi.get(__response__, 'sku'),
        tags=pulumi.get(__response__, 'tags'),
        workspace_id=pulumi.get(__response__, 'workspace_id')))
