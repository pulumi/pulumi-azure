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

__all__ = ['CacheAccessPolicyAssignmentArgs', 'CacheAccessPolicyAssignment']

@pulumi.input_type
class CacheAccessPolicyAssignmentArgs:
    def __init__(__self__, *,
                 access_policy_name: pulumi.Input[_builtins.str],
                 object_id: pulumi.Input[_builtins.str],
                 object_id_alias: pulumi.Input[_builtins.str],
                 redis_cache_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a CacheAccessPolicyAssignment resource.
        :param pulumi.Input[_builtins.str] access_policy_name: The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id: The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id_alias: The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] redis_cache_id: The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        pulumi.set(__self__, "access_policy_name", access_policy_name)
        pulumi.set(__self__, "object_id", object_id)
        pulumi.set(__self__, "object_id_alias", object_id_alias)
        pulumi.set(__self__, "redis_cache_id", redis_cache_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="accessPolicyName")
    def access_policy_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "access_policy_name")

    @access_policy_name.setter
    def access_policy_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "access_policy_name", value)

    @_builtins.property
    @pulumi.getter(name="objectId")
    def object_id(self) -> pulumi.Input[_builtins.str]:
        """
        The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "object_id")

    @object_id.setter
    def object_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "object_id", value)

    @_builtins.property
    @pulumi.getter(name="objectIdAlias")
    def object_id_alias(self) -> pulumi.Input[_builtins.str]:
        """
        The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "object_id_alias")

    @object_id_alias.setter
    def object_id_alias(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "object_id_alias", value)

    @_builtins.property
    @pulumi.getter(name="redisCacheId")
    def redis_cache_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "redis_cache_id")

    @redis_cache_id.setter
    def redis_cache_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "redis_cache_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CacheAccessPolicyAssignmentState:
    def __init__(__self__, *,
                 access_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 object_id: Optional[pulumi.Input[_builtins.str]] = None,
                 object_id_alias: Optional[pulumi.Input[_builtins.str]] = None,
                 redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering CacheAccessPolicyAssignment resources.
        :param pulumi.Input[_builtins.str] access_policy_name: The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id: The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id_alias: The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] redis_cache_id: The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        if access_policy_name is not None:
            pulumi.set(__self__, "access_policy_name", access_policy_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if object_id is not None:
            pulumi.set(__self__, "object_id", object_id)
        if object_id_alias is not None:
            pulumi.set(__self__, "object_id_alias", object_id_alias)
        if redis_cache_id is not None:
            pulumi.set(__self__, "redis_cache_id", redis_cache_id)

    @_builtins.property
    @pulumi.getter(name="accessPolicyName")
    def access_policy_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "access_policy_name")

    @access_policy_name.setter
    def access_policy_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "access_policy_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="objectId")
    def object_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "object_id")

    @object_id.setter
    def object_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "object_id", value)

    @_builtins.property
    @pulumi.getter(name="objectIdAlias")
    def object_id_alias(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "object_id_alias")

    @object_id_alias.setter
    def object_id_alias(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "object_id_alias", value)

    @_builtins.property
    @pulumi.getter(name="redisCacheId")
    def redis_cache_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "redis_cache_id")

    @redis_cache_id.setter
    def redis_cache_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "redis_cache_id", value)


@pulumi.type_token("azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment")
class CacheAccessPolicyAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 object_id: Optional[pulumi.Input[_builtins.str]] = None,
                 object_id_alias: Optional[pulumi.Input[_builtins.str]] = None,
                 redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Redis Cache Access Policy Assignment

        ## Import

        Redis Cache Policy Assignment can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/accessPolicyAssignments/assignment1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] access_policy_name: The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id: The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id_alias: The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] redis_cache_id: The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CacheAccessPolicyAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Redis Cache Access Policy Assignment

        ## Import

        Redis Cache Policy Assignment can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/accessPolicyAssignments/assignment1
        ```

        :param str resource_name: The name of the resource.
        :param CacheAccessPolicyAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CacheAccessPolicyAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 object_id: Optional[pulumi.Input[_builtins.str]] = None,
                 object_id_alias: Optional[pulumi.Input[_builtins.str]] = None,
                 redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CacheAccessPolicyAssignmentArgs.__new__(CacheAccessPolicyAssignmentArgs)

            if access_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'access_policy_name'")
            __props__.__dict__["access_policy_name"] = access_policy_name
            __props__.__dict__["name"] = name
            if object_id is None and not opts.urn:
                raise TypeError("Missing required property 'object_id'")
            __props__.__dict__["object_id"] = object_id
            if object_id_alias is None and not opts.urn:
                raise TypeError("Missing required property 'object_id_alias'")
            __props__.__dict__["object_id_alias"] = object_id_alias
            if redis_cache_id is None and not opts.urn:
                raise TypeError("Missing required property 'redis_cache_id'")
            __props__.__dict__["redis_cache_id"] = redis_cache_id
        super(CacheAccessPolicyAssignment, __self__).__init__(
            'azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            object_id: Optional[pulumi.Input[_builtins.str]] = None,
            object_id_alias: Optional[pulumi.Input[_builtins.str]] = None,
            redis_cache_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'CacheAccessPolicyAssignment':
        """
        Get an existing CacheAccessPolicyAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] access_policy_name: The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id: The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] object_id_alias: The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        :param pulumi.Input[_builtins.str] redis_cache_id: The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CacheAccessPolicyAssignmentState.__new__(_CacheAccessPolicyAssignmentState)

        __props__.__dict__["access_policy_name"] = access_policy_name
        __props__.__dict__["name"] = name
        __props__.__dict__["object_id"] = object_id
        __props__.__dict__["object_id_alias"] = object_id_alias
        __props__.__dict__["redis_cache_id"] = redis_cache_id
        return CacheAccessPolicyAssignment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accessPolicyName")
    def access_policy_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "access_policy_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="objectId")
    def object_id(self) -> pulumi.Output[_builtins.str]:
        """
        The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "object_id")

    @_builtins.property
    @pulumi.getter(name="objectIdAlias")
    def object_id_alias(self) -> pulumi.Output[_builtins.str]:
        """
        The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "object_id_alias")

    @_builtins.property
    @pulumi.getter(name="redisCacheId")
    def redis_cache_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
        """
        return pulumi.get(self, "redis_cache_id")

