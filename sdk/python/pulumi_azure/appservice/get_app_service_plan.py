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
    'GetAppServicePlanResult',
    'AwaitableGetAppServicePlanResult',
    'get_app_service_plan',
    'get_app_service_plan_output',
]

@pulumi.output_type
class GetAppServicePlanResult:
    """
    A collection of values returned by getAppServicePlan.
    """
    def __init__(__self__, app_service_environment_id=None, id=None, is_xenon=None, kind=None, location=None, maximum_elastic_worker_count=None, maximum_number_of_workers=None, name=None, per_site_scaling=None, reserved=None, resource_group_name=None, sku=None, tags=None, zone_redundant=None):
        if app_service_environment_id and not isinstance(app_service_environment_id, str):
            raise TypeError("Expected argument 'app_service_environment_id' to be a str")
        pulumi.set(__self__, "app_service_environment_id", app_service_environment_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_xenon and not isinstance(is_xenon, bool):
            raise TypeError("Expected argument 'is_xenon' to be a bool")
        pulumi.set(__self__, "is_xenon", is_xenon)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if maximum_elastic_worker_count and not isinstance(maximum_elastic_worker_count, int):
            raise TypeError("Expected argument 'maximum_elastic_worker_count' to be a int")
        pulumi.set(__self__, "maximum_elastic_worker_count", maximum_elastic_worker_count)
        if maximum_number_of_workers and not isinstance(maximum_number_of_workers, int):
            raise TypeError("Expected argument 'maximum_number_of_workers' to be a int")
        pulumi.set(__self__, "maximum_number_of_workers", maximum_number_of_workers)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if per_site_scaling and not isinstance(per_site_scaling, bool):
            raise TypeError("Expected argument 'per_site_scaling' to be a bool")
        pulumi.set(__self__, "per_site_scaling", per_site_scaling)
        if reserved and not isinstance(reserved, bool):
            raise TypeError("Expected argument 'reserved' to be a bool")
        pulumi.set(__self__, "reserved", reserved)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if sku and not isinstance(sku, dict):
            raise TypeError("Expected argument 'sku' to be a dict")
        pulumi.set(__self__, "sku", sku)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if zone_redundant and not isinstance(zone_redundant, bool):
            raise TypeError("Expected argument 'zone_redundant' to be a bool")
        pulumi.set(__self__, "zone_redundant", zone_redundant)

    @_builtins.property
    @pulumi.getter(name="appServiceEnvironmentId")
    def app_service_environment_id(self) -> _builtins.str:
        """
        The ID of the App Service Environment where the App Service Plan is located.
        """
        return pulumi.get(self, "app_service_environment_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="isXenon")
    def is_xenon(self) -> _builtins.bool:
        """
        A flag that indicates if it's a xenon plan (support for Windows Container)
        """
        return pulumi.get(self, "is_xenon")

    @_builtins.property
    @pulumi.getter
    def kind(self) -> _builtins.str:
        """
        The Operating System type of the App Service Plan
        """
        return pulumi.get(self, "kind")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure location where the App Service Plan exists
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="maximumElasticWorkerCount")
    def maximum_elastic_worker_count(self) -> _builtins.int:
        """
        The maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan.
        """
        return pulumi.get(self, "maximum_elastic_worker_count")

    @_builtins.property
    @pulumi.getter(name="maximumNumberOfWorkers")
    def maximum_number_of_workers(self) -> _builtins.int:
        """
        The maximum number of workers supported with the App Service Plan's sku.
        """
        return pulumi.get(self, "maximum_number_of_workers")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="perSiteScaling")
    def per_site_scaling(self) -> _builtins.bool:
        """
        Can Apps assigned to this App Service Plan be scaled independently?
        """
        return pulumi.get(self, "per_site_scaling")

    @_builtins.property
    @pulumi.getter
    def reserved(self) -> _builtins.bool:
        """
        Is this App Service Plan `Reserved`?
        """
        return pulumi.get(self, "reserved")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def sku(self) -> 'outputs.GetAppServicePlanSkuResult':
        """
        A `sku` block as documented below.
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
    @pulumi.getter(name="zoneRedundant")
    def zone_redundant(self) -> _builtins.bool:
        """
        App Service Plan perform availability zone balancing.
        """
        return pulumi.get(self, "zone_redundant")


class AwaitableGetAppServicePlanResult(GetAppServicePlanResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppServicePlanResult(
            app_service_environment_id=self.app_service_environment_id,
            id=self.id,
            is_xenon=self.is_xenon,
            kind=self.kind,
            location=self.location,
            maximum_elastic_worker_count=self.maximum_elastic_worker_count,
            maximum_number_of_workers=self.maximum_number_of_workers,
            name=self.name,
            per_site_scaling=self.per_site_scaling,
            reserved=self.reserved,
            resource_group_name=self.resource_group_name,
            sku=self.sku,
            tags=self.tags,
            zone_redundant=self.zone_redundant)


def get_app_service_plan(name: Optional[_builtins.str] = None,
                         resource_group_name: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppServicePlanResult:
    """
    Use this data source to access information about an existing App Service Plan (formerly known as a `Server Farm`).

    !> **Note:** The `appservice.Plan` data source is deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use the `appservice.ServicePlan` data source instead.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appservice.get_app_service_plan(name="search-app-service-plan",
        resource_group_name="search-service")
    pulumi.export("appServicePlanId", example.id)
    ```


    :param _builtins.str name: The name of the App Service Plan.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the App Service Plan exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:appservice/getAppServicePlan:getAppServicePlan', __args__, opts=opts, typ=GetAppServicePlanResult).value

    return AwaitableGetAppServicePlanResult(
        app_service_environment_id=pulumi.get(__ret__, 'app_service_environment_id'),
        id=pulumi.get(__ret__, 'id'),
        is_xenon=pulumi.get(__ret__, 'is_xenon'),
        kind=pulumi.get(__ret__, 'kind'),
        location=pulumi.get(__ret__, 'location'),
        maximum_elastic_worker_count=pulumi.get(__ret__, 'maximum_elastic_worker_count'),
        maximum_number_of_workers=pulumi.get(__ret__, 'maximum_number_of_workers'),
        name=pulumi.get(__ret__, 'name'),
        per_site_scaling=pulumi.get(__ret__, 'per_site_scaling'),
        reserved=pulumi.get(__ret__, 'reserved'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        sku=pulumi.get(__ret__, 'sku'),
        tags=pulumi.get(__ret__, 'tags'),
        zone_redundant=pulumi.get(__ret__, 'zone_redundant'))
def get_app_service_plan_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppServicePlanResult]:
    """
    Use this data source to access information about an existing App Service Plan (formerly known as a `Server Farm`).

    !> **Note:** The `appservice.Plan` data source is deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use the `appservice.ServicePlan` data source instead.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appservice.get_app_service_plan(name="search-app-service-plan",
        resource_group_name="search-service")
    pulumi.export("appServicePlanId", example.id)
    ```


    :param _builtins.str name: The name of the App Service Plan.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the App Service Plan exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:appservice/getAppServicePlan:getAppServicePlan', __args__, opts=opts, typ=GetAppServicePlanResult)
    return __ret__.apply(lambda __response__: GetAppServicePlanResult(
        app_service_environment_id=pulumi.get(__response__, 'app_service_environment_id'),
        id=pulumi.get(__response__, 'id'),
        is_xenon=pulumi.get(__response__, 'is_xenon'),
        kind=pulumi.get(__response__, 'kind'),
        location=pulumi.get(__response__, 'location'),
        maximum_elastic_worker_count=pulumi.get(__response__, 'maximum_elastic_worker_count'),
        maximum_number_of_workers=pulumi.get(__response__, 'maximum_number_of_workers'),
        name=pulumi.get(__response__, 'name'),
        per_site_scaling=pulumi.get(__response__, 'per_site_scaling'),
        reserved=pulumi.get(__response__, 'reserved'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        sku=pulumi.get(__response__, 'sku'),
        tags=pulumi.get(__response__, 'tags'),
        zone_redundant=pulumi.get(__response__, 'zone_redundant')))
