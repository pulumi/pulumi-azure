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

__all__ = ['LinkedServerArgs', 'LinkedServer']

@pulumi.input_type
class LinkedServerArgs:
    def __init__(__self__, *,
                 linked_redis_cache_id: pulumi.Input[_builtins.str],
                 linked_redis_cache_location: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 server_role: pulumi.Input[_builtins.str],
                 target_redis_cache_name: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a LinkedServer resource.
        :param pulumi.Input[_builtins.str] linked_redis_cache_id: The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] linked_redis_cache_location: The location of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] server_role: The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        :param pulumi.Input[_builtins.str] target_redis_cache_name: The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        pulumi.set(__self__, "linked_redis_cache_id", linked_redis_cache_id)
        pulumi.set(__self__, "linked_redis_cache_location", linked_redis_cache_location)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "server_role", server_role)
        pulumi.set(__self__, "target_redis_cache_name", target_redis_cache_name)

    @_builtins.property
    @pulumi.getter(name="linkedRedisCacheId")
    def linked_redis_cache_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "linked_redis_cache_id")

    @linked_redis_cache_id.setter
    def linked_redis_cache_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "linked_redis_cache_id", value)

    @_builtins.property
    @pulumi.getter(name="linkedRedisCacheLocation")
    def linked_redis_cache_location(self) -> pulumi.Input[_builtins.str]:
        """
        The location of the linked Redis cache. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "linked_redis_cache_location")

    @linked_redis_cache_location.setter
    def linked_redis_cache_location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "linked_redis_cache_location", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="serverRole")
    def server_role(self) -> pulumi.Input[_builtins.str]:
        """
        The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        """
        return pulumi.get(self, "server_role")

    @server_role.setter
    def server_role(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "server_role", value)

    @_builtins.property
    @pulumi.getter(name="targetRedisCacheName")
    def target_redis_cache_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        return pulumi.get(self, "target_redis_cache_name")

    @target_redis_cache_name.setter
    def target_redis_cache_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "target_redis_cache_name", value)


@pulumi.input_type
class _LinkedServerState:
    def __init__(__self__, *,
                 geo_replicated_primary_host_name: Optional[pulumi.Input[_builtins.str]] = None,
                 linked_redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 linked_redis_cache_location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_role: Optional[pulumi.Input[_builtins.str]] = None,
                 target_redis_cache_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LinkedServer resources.
        :param pulumi.Input[_builtins.str] geo_replicated_primary_host_name: The geo-replicated primary hostname for this linked server.
        :param pulumi.Input[_builtins.str] linked_redis_cache_id: The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] linked_redis_cache_location: The location of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] name: The name of the linked server.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] server_role: The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        :param pulumi.Input[_builtins.str] target_redis_cache_name: The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        if geo_replicated_primary_host_name is not None:
            pulumi.set(__self__, "geo_replicated_primary_host_name", geo_replicated_primary_host_name)
        if linked_redis_cache_id is not None:
            pulumi.set(__self__, "linked_redis_cache_id", linked_redis_cache_id)
        if linked_redis_cache_location is not None:
            pulumi.set(__self__, "linked_redis_cache_location", linked_redis_cache_location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if server_role is not None:
            pulumi.set(__self__, "server_role", server_role)
        if target_redis_cache_name is not None:
            pulumi.set(__self__, "target_redis_cache_name", target_redis_cache_name)

    @_builtins.property
    @pulumi.getter(name="geoReplicatedPrimaryHostName")
    def geo_replicated_primary_host_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The geo-replicated primary hostname for this linked server.
        """
        return pulumi.get(self, "geo_replicated_primary_host_name")

    @geo_replicated_primary_host_name.setter
    def geo_replicated_primary_host_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "geo_replicated_primary_host_name", value)

    @_builtins.property
    @pulumi.getter(name="linkedRedisCacheId")
    def linked_redis_cache_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "linked_redis_cache_id")

    @linked_redis_cache_id.setter
    def linked_redis_cache_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "linked_redis_cache_id", value)

    @_builtins.property
    @pulumi.getter(name="linkedRedisCacheLocation")
    def linked_redis_cache_location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the linked Redis cache. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "linked_redis_cache_location")

    @linked_redis_cache_location.setter
    def linked_redis_cache_location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "linked_redis_cache_location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the linked server.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="serverRole")
    def server_role(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        """
        return pulumi.get(self, "server_role")

    @server_role.setter
    def server_role(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "server_role", value)

    @_builtins.property
    @pulumi.getter(name="targetRedisCacheName")
    def target_redis_cache_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        return pulumi.get(self, "target_redis_cache_name")

    @target_redis_cache_name.setter
    def target_redis_cache_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_redis_cache_name", value)


@pulumi.type_token("azure:redis/linkedServer:LinkedServer")
class LinkedServer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 linked_redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 linked_redis_cache_location: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_role: Optional[pulumi.Input[_builtins.str]] = None,
                 target_redis_cache_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Redis Linked Server (ie Geo Location)

        ## Import

        Redis can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:redis/linkedServer:LinkedServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/linkedServers/cache2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] linked_redis_cache_id: The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] linked_redis_cache_location: The location of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] server_role: The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        :param pulumi.Input[_builtins.str] target_redis_cache_name: The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LinkedServerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Redis Linked Server (ie Geo Location)

        ## Import

        Redis can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:redis/linkedServer:LinkedServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/linkedServers/cache2
        ```

        :param str resource_name: The name of the resource.
        :param LinkedServerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LinkedServerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 linked_redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 linked_redis_cache_location: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_role: Optional[pulumi.Input[_builtins.str]] = None,
                 target_redis_cache_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LinkedServerArgs.__new__(LinkedServerArgs)

            if linked_redis_cache_id is None and not opts.urn:
                raise TypeError("Missing required property 'linked_redis_cache_id'")
            __props__.__dict__["linked_redis_cache_id"] = linked_redis_cache_id
            if linked_redis_cache_location is None and not opts.urn:
                raise TypeError("Missing required property 'linked_redis_cache_location'")
            __props__.__dict__["linked_redis_cache_location"] = linked_redis_cache_location
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if server_role is None and not opts.urn:
                raise TypeError("Missing required property 'server_role'")
            __props__.__dict__["server_role"] = server_role
            if target_redis_cache_name is None and not opts.urn:
                raise TypeError("Missing required property 'target_redis_cache_name'")
            __props__.__dict__["target_redis_cache_name"] = target_redis_cache_name
            __props__.__dict__["geo_replicated_primary_host_name"] = None
            __props__.__dict__["name"] = None
        super(LinkedServer, __self__).__init__(
            'azure:redis/linkedServer:LinkedServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            geo_replicated_primary_host_name: Optional[pulumi.Input[_builtins.str]] = None,
            linked_redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
            linked_redis_cache_location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            server_role: Optional[pulumi.Input[_builtins.str]] = None,
            target_redis_cache_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'LinkedServer':
        """
        Get an existing LinkedServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] geo_replicated_primary_host_name: The geo-replicated primary hostname for this linked server.
        :param pulumi.Input[_builtins.str] linked_redis_cache_id: The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] linked_redis_cache_location: The location of the linked Redis cache. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] name: The name of the linked server.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        :param pulumi.Input[_builtins.str] server_role: The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        :param pulumi.Input[_builtins.str] target_redis_cache_name: The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LinkedServerState.__new__(_LinkedServerState)

        __props__.__dict__["geo_replicated_primary_host_name"] = geo_replicated_primary_host_name
        __props__.__dict__["linked_redis_cache_id"] = linked_redis_cache_id
        __props__.__dict__["linked_redis_cache_location"] = linked_redis_cache_location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["server_role"] = server_role
        __props__.__dict__["target_redis_cache_name"] = target_redis_cache_name
        return LinkedServer(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="geoReplicatedPrimaryHostName")
    def geo_replicated_primary_host_name(self) -> pulumi.Output[_builtins.str]:
        """
        The geo-replicated primary hostname for this linked server.
        """
        return pulumi.get(self, "geo_replicated_primary_host_name")

    @_builtins.property
    @pulumi.getter(name="linkedRedisCacheId")
    def linked_redis_cache_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the linked Redis cache. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "linked_redis_cache_id")

    @_builtins.property
    @pulumi.getter(name="linkedRedisCacheLocation")
    def linked_redis_cache_location(self) -> pulumi.Output[_builtins.str]:
        """
        The location of the linked Redis cache. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "linked_redis_cache_location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the linked server.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="serverRole")
    def server_role(self) -> pulumi.Output[_builtins.str]:
        """
        The role of the linked Redis cache (eg "Secondary"). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
        """
        return pulumi.get(self, "server_role")

    @_builtins.property
    @pulumi.getter(name="targetRedisCacheName")
    def target_redis_cache_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
        """
        return pulumi.get(self, "target_redis_cache_name")

