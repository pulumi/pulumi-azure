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
    'GetCacheResult',
    'AwaitableGetCacheResult',
    'get_cache',
    'get_cache_output',
]

@pulumi.output_type
class GetCacheResult:
    """
    A collection of values returned by getCache.
    """
    def __init__(__self__, access_keys_authentication_enabled=None, capacity=None, family=None, hostname=None, id=None, location=None, minimum_tls_version=None, name=None, non_ssl_port_enabled=None, patch_schedules=None, port=None, primary_access_key=None, primary_connection_string=None, private_static_ip_address=None, redis_configurations=None, resource_group_name=None, secondary_access_key=None, secondary_connection_string=None, shard_count=None, sku_name=None, ssl_port=None, subnet_id=None, tags=None, zones=None):
        if access_keys_authentication_enabled and not isinstance(access_keys_authentication_enabled, bool):
            raise TypeError("Expected argument 'access_keys_authentication_enabled' to be a bool")
        pulumi.set(__self__, "access_keys_authentication_enabled", access_keys_authentication_enabled)
        if capacity and not isinstance(capacity, int):
            raise TypeError("Expected argument 'capacity' to be a int")
        pulumi.set(__self__, "capacity", capacity)
        if family and not isinstance(family, str):
            raise TypeError("Expected argument 'family' to be a str")
        pulumi.set(__self__, "family", family)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if minimum_tls_version and not isinstance(minimum_tls_version, str):
            raise TypeError("Expected argument 'minimum_tls_version' to be a str")
        pulumi.set(__self__, "minimum_tls_version", minimum_tls_version)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if non_ssl_port_enabled and not isinstance(non_ssl_port_enabled, bool):
            raise TypeError("Expected argument 'non_ssl_port_enabled' to be a bool")
        pulumi.set(__self__, "non_ssl_port_enabled", non_ssl_port_enabled)
        if patch_schedules and not isinstance(patch_schedules, list):
            raise TypeError("Expected argument 'patch_schedules' to be a list")
        pulumi.set(__self__, "patch_schedules", patch_schedules)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if primary_access_key and not isinstance(primary_access_key, str):
            raise TypeError("Expected argument 'primary_access_key' to be a str")
        pulumi.set(__self__, "primary_access_key", primary_access_key)
        if primary_connection_string and not isinstance(primary_connection_string, str):
            raise TypeError("Expected argument 'primary_connection_string' to be a str")
        pulumi.set(__self__, "primary_connection_string", primary_connection_string)
        if private_static_ip_address and not isinstance(private_static_ip_address, str):
            raise TypeError("Expected argument 'private_static_ip_address' to be a str")
        pulumi.set(__self__, "private_static_ip_address", private_static_ip_address)
        if redis_configurations and not isinstance(redis_configurations, list):
            raise TypeError("Expected argument 'redis_configurations' to be a list")
        pulumi.set(__self__, "redis_configurations", redis_configurations)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_access_key and not isinstance(secondary_access_key, str):
            raise TypeError("Expected argument 'secondary_access_key' to be a str")
        pulumi.set(__self__, "secondary_access_key", secondary_access_key)
        if secondary_connection_string and not isinstance(secondary_connection_string, str):
            raise TypeError("Expected argument 'secondary_connection_string' to be a str")
        pulumi.set(__self__, "secondary_connection_string", secondary_connection_string)
        if shard_count and not isinstance(shard_count, int):
            raise TypeError("Expected argument 'shard_count' to be a int")
        pulumi.set(__self__, "shard_count", shard_count)
        if sku_name and not isinstance(sku_name, str):
            raise TypeError("Expected argument 'sku_name' to be a str")
        pulumi.set(__self__, "sku_name", sku_name)
        if ssl_port and not isinstance(ssl_port, int):
            raise TypeError("Expected argument 'ssl_port' to be a int")
        pulumi.set(__self__, "ssl_port", ssl_port)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @_builtins.property
    @pulumi.getter(name="accessKeysAuthenticationEnabled")
    def access_keys_authentication_enabled(self) -> _builtins.bool:
        """
        Specifies if access key authentication is enabled.
        """
        return pulumi.get(self, "access_keys_authentication_enabled")

    @_builtins.property
    @pulumi.getter
    def capacity(self) -> _builtins.int:
        """
        The size of the Redis Cache deployed.
        """
        return pulumi.get(self, "capacity")

    @_builtins.property
    @pulumi.getter
    def family(self) -> _builtins.str:
        """
        The SKU family/pricing group used. Possible values are `C` (for Basic/Standard SKU family) and `P` (for `Premium`)
        """
        return pulumi.get(self, "family")

    @_builtins.property
    @pulumi.getter
    def hostname(self) -> _builtins.str:
        """
        The Hostname of the Redis Instance
        """
        return pulumi.get(self, "hostname")

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
        """
        The location of the Redis Cache.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="minimumTlsVersion")
    def minimum_tls_version(self) -> _builtins.str:
        """
        The minimum TLS version.
        """
        return pulumi.get(self, "minimum_tls_version")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="nonSslPortEnabled")
    def non_ssl_port_enabled(self) -> _builtins.bool:
        return pulumi.get(self, "non_ssl_port_enabled")

    @_builtins.property
    @pulumi.getter(name="patchSchedules")
    def patch_schedules(self) -> Sequence['outputs.GetCachePatchScheduleResult']:
        """
        A list of `patch_schedule` blocks as defined below.
        """
        return pulumi.get(self, "patch_schedules")

    @_builtins.property
    @pulumi.getter
    def port(self) -> _builtins.int:
        """
        The non-SSL Port of the Redis Instance
        """
        return pulumi.get(self, "port")

    @_builtins.property
    @pulumi.getter(name="primaryAccessKey")
    def primary_access_key(self) -> _builtins.str:
        """
        The Primary Access Key for the Redis Instance
        """
        return pulumi.get(self, "primary_access_key")

    @_builtins.property
    @pulumi.getter(name="primaryConnectionString")
    def primary_connection_string(self) -> _builtins.str:
        """
        The primary connection string of the Redis Instance.
        """
        return pulumi.get(self, "primary_connection_string")

    @_builtins.property
    @pulumi.getter(name="privateStaticIpAddress")
    def private_static_ip_address(self) -> _builtins.str:
        """
        The Static IP Address assigned to the Redis Cache when hosted inside the Virtual Network.
        """
        return pulumi.get(self, "private_static_ip_address")

    @_builtins.property
    @pulumi.getter(name="redisConfigurations")
    def redis_configurations(self) -> Sequence['outputs.GetCacheRedisConfigurationResult']:
        """
        A `redis_configuration` block as defined below.
        """
        return pulumi.get(self, "redis_configurations")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="secondaryAccessKey")
    def secondary_access_key(self) -> _builtins.str:
        """
        The Secondary Access Key for the Redis Instance
        """
        return pulumi.get(self, "secondary_access_key")

    @_builtins.property
    @pulumi.getter(name="secondaryConnectionString")
    def secondary_connection_string(self) -> _builtins.str:
        """
        The secondary connection string of the Redis Instance.
        """
        return pulumi.get(self, "secondary_connection_string")

    @_builtins.property
    @pulumi.getter(name="shardCount")
    def shard_count(self) -> _builtins.int:
        return pulumi.get(self, "shard_count")

    @_builtins.property
    @pulumi.getter(name="skuName")
    def sku_name(self) -> _builtins.str:
        """
        The SKU of Redis used. Possible values are `Basic`, `Standard` and `Premium`.
        """
        return pulumi.get(self, "sku_name")

    @_builtins.property
    @pulumi.getter(name="sslPort")
    def ssl_port(self) -> _builtins.int:
        """
        The SSL Port of the Redis Instance
        """
        return pulumi.get(self, "ssl_port")

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> _builtins.str:
        return pulumi.get(self, "subnet_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def zones(self) -> Sequence[_builtins.str]:
        """
        A list of Availability Zones in which this Redis Cache is located.
        """
        return pulumi.get(self, "zones")


class AwaitableGetCacheResult(GetCacheResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCacheResult(
            access_keys_authentication_enabled=self.access_keys_authentication_enabled,
            capacity=self.capacity,
            family=self.family,
            hostname=self.hostname,
            id=self.id,
            location=self.location,
            minimum_tls_version=self.minimum_tls_version,
            name=self.name,
            non_ssl_port_enabled=self.non_ssl_port_enabled,
            patch_schedules=self.patch_schedules,
            port=self.port,
            primary_access_key=self.primary_access_key,
            primary_connection_string=self.primary_connection_string,
            private_static_ip_address=self.private_static_ip_address,
            redis_configurations=self.redis_configurations,
            resource_group_name=self.resource_group_name,
            secondary_access_key=self.secondary_access_key,
            secondary_connection_string=self.secondary_connection_string,
            shard_count=self.shard_count,
            sku_name=self.sku_name,
            ssl_port=self.ssl_port,
            subnet_id=self.subnet_id,
            tags=self.tags,
            zones=self.zones)


def get_cache(name: Optional[_builtins.str] = None,
              resource_group_name: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCacheResult:
    """
    Use this data source to access information about an existing Redis Cache

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.redis.get_cache(name="myrediscache",
        resource_group_name="redis-cache")
    pulumi.export("primaryAccessKey", example.primary_access_key)
    pulumi.export("hostname", example.hostname)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Cache`: 2024-11-01


    :param _builtins.str name: The name of the Redis cache
    :param _builtins.str resource_group_name: The name of the resource group the Redis cache instance is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:redis/getCache:getCache', __args__, opts=opts, typ=GetCacheResult).value

    return AwaitableGetCacheResult(
        access_keys_authentication_enabled=pulumi.get(__ret__, 'access_keys_authentication_enabled'),
        capacity=pulumi.get(__ret__, 'capacity'),
        family=pulumi.get(__ret__, 'family'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        minimum_tls_version=pulumi.get(__ret__, 'minimum_tls_version'),
        name=pulumi.get(__ret__, 'name'),
        non_ssl_port_enabled=pulumi.get(__ret__, 'non_ssl_port_enabled'),
        patch_schedules=pulumi.get(__ret__, 'patch_schedules'),
        port=pulumi.get(__ret__, 'port'),
        primary_access_key=pulumi.get(__ret__, 'primary_access_key'),
        primary_connection_string=pulumi.get(__ret__, 'primary_connection_string'),
        private_static_ip_address=pulumi.get(__ret__, 'private_static_ip_address'),
        redis_configurations=pulumi.get(__ret__, 'redis_configurations'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__ret__, 'secondary_access_key'),
        secondary_connection_string=pulumi.get(__ret__, 'secondary_connection_string'),
        shard_count=pulumi.get(__ret__, 'shard_count'),
        sku_name=pulumi.get(__ret__, 'sku_name'),
        ssl_port=pulumi.get(__ret__, 'ssl_port'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        tags=pulumi.get(__ret__, 'tags'),
        zones=pulumi.get(__ret__, 'zones'))
def get_cache_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                     resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCacheResult]:
    """
    Use this data source to access information about an existing Redis Cache

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.redis.get_cache(name="myrediscache",
        resource_group_name="redis-cache")
    pulumi.export("primaryAccessKey", example.primary_access_key)
    pulumi.export("hostname", example.hostname)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Cache`: 2024-11-01


    :param _builtins.str name: The name of the Redis cache
    :param _builtins.str resource_group_name: The name of the resource group the Redis cache instance is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:redis/getCache:getCache', __args__, opts=opts, typ=GetCacheResult)
    return __ret__.apply(lambda __response__: GetCacheResult(
        access_keys_authentication_enabled=pulumi.get(__response__, 'access_keys_authentication_enabled'),
        capacity=pulumi.get(__response__, 'capacity'),
        family=pulumi.get(__response__, 'family'),
        hostname=pulumi.get(__response__, 'hostname'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        minimum_tls_version=pulumi.get(__response__, 'minimum_tls_version'),
        name=pulumi.get(__response__, 'name'),
        non_ssl_port_enabled=pulumi.get(__response__, 'non_ssl_port_enabled'),
        patch_schedules=pulumi.get(__response__, 'patch_schedules'),
        port=pulumi.get(__response__, 'port'),
        primary_access_key=pulumi.get(__response__, 'primary_access_key'),
        primary_connection_string=pulumi.get(__response__, 'primary_connection_string'),
        private_static_ip_address=pulumi.get(__response__, 'private_static_ip_address'),
        redis_configurations=pulumi.get(__response__, 'redis_configurations'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__response__, 'secondary_access_key'),
        secondary_connection_string=pulumi.get(__response__, 'secondary_connection_string'),
        shard_count=pulumi.get(__response__, 'shard_count'),
        sku_name=pulumi.get(__response__, 'sku_name'),
        ssl_port=pulumi.get(__response__, 'ssl_port'),
        subnet_id=pulumi.get(__response__, 'subnet_id'),
        tags=pulumi.get(__response__, 'tags'),
        zones=pulumi.get(__response__, 'zones')))
