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

__all__ = ['CacheAccessPolicyArgs', 'CacheAccessPolicy']

@pulumi.input_type
class CacheAccessPolicyArgs:
    def __init__(__self__, *,
                 access_rules: pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]],
                 hpc_cache_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a CacheAccessPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]] access_rules: One or more `access_rule` blocks (up to three) as defined below.
        :param pulumi.Input[_builtins.str] hpc_cache_id: The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        pulumi.set(__self__, "access_rules", access_rules)
        pulumi.set(__self__, "hpc_cache_id", hpc_cache_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="accessRules")
    def access_rules(self) -> pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]]:
        """
        One or more `access_rule` blocks (up to three) as defined below.
        """
        return pulumi.get(self, "access_rules")

    @access_rules.setter
    def access_rules(self, value: pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]]):
        pulumi.set(self, "access_rules", value)

    @_builtins.property
    @pulumi.getter(name="hpcCacheId")
    def hpc_cache_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "hpc_cache_id")

    @hpc_cache_id.setter
    def hpc_cache_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "hpc_cache_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CacheAccessPolicyState:
    def __init__(__self__, *,
                 access_rules: Optional[pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]]] = None,
                 hpc_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering CacheAccessPolicy resources.
        :param pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]] access_rules: One or more `access_rule` blocks (up to three) as defined below.
        :param pulumi.Input[_builtins.str] hpc_cache_id: The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        if access_rules is not None:
            pulumi.set(__self__, "access_rules", access_rules)
        if hpc_cache_id is not None:
            pulumi.set(__self__, "hpc_cache_id", hpc_cache_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="accessRules")
    def access_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]]]:
        """
        One or more `access_rule` blocks (up to three) as defined below.
        """
        return pulumi.get(self, "access_rules")

    @access_rules.setter
    def access_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CacheAccessPolicyAccessRuleArgs']]]]):
        pulumi.set(self, "access_rules", value)

    @_builtins.property
    @pulumi.getter(name="hpcCacheId")
    def hpc_cache_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "hpc_cache_id")

    @hpc_cache_id.setter
    def hpc_cache_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "hpc_cache_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.type_token("azure:hpc/cacheAccessPolicy:CacheAccessPolicy")
class CacheAccessPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CacheAccessPolicyAccessRuleArgs', 'CacheAccessPolicyAccessRuleArgsDict']]]]] = None,
                 hpc_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a HPC Cache Access Policy.

        !> **Note:** The `hpc.CacheAccessPolicy` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="examplevn",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="examplesubnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"])
        example_cache = azure.hpc.Cache("example",
            name="examplehpccache",
            resource_group_name=example.name,
            location=example.location,
            cache_size_in_gb=3072,
            subnet_id=example_subnet.id,
            sku_name="Standard_2G")
        example_cache_access_policy = azure.hpc.CacheAccessPolicy("example",
            name="example",
            hpc_cache_id=example_cache.id,
            access_rules=[{
                "scope": "default",
                "access": "rw",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StorageCache`: 2023-05-01

        ## Import

        HPC Cache Access Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:hpc/cacheAccessPolicy:CacheAccessPolicy example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/cacheAccessPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['CacheAccessPolicyAccessRuleArgs', 'CacheAccessPolicyAccessRuleArgsDict']]]] access_rules: One or more `access_rule` blocks (up to three) as defined below.
        :param pulumi.Input[_builtins.str] hpc_cache_id: The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CacheAccessPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a HPC Cache Access Policy.

        !> **Note:** The `hpc.CacheAccessPolicy` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="examplevn",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="examplesubnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"])
        example_cache = azure.hpc.Cache("example",
            name="examplehpccache",
            resource_group_name=example.name,
            location=example.location,
            cache_size_in_gb=3072,
            subnet_id=example_subnet.id,
            sku_name="Standard_2G")
        example_cache_access_policy = azure.hpc.CacheAccessPolicy("example",
            name="example",
            hpc_cache_id=example_cache.id,
            access_rules=[{
                "scope": "default",
                "access": "rw",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StorageCache`: 2023-05-01

        ## Import

        HPC Cache Access Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:hpc/cacheAccessPolicy:CacheAccessPolicy example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/cacheAccessPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param CacheAccessPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CacheAccessPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CacheAccessPolicyAccessRuleArgs', 'CacheAccessPolicyAccessRuleArgsDict']]]]] = None,
                 hpc_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CacheAccessPolicyArgs.__new__(CacheAccessPolicyArgs)

            if access_rules is None and not opts.urn:
                raise TypeError("Missing required property 'access_rules'")
            __props__.__dict__["access_rules"] = access_rules
            if hpc_cache_id is None and not opts.urn:
                raise TypeError("Missing required property 'hpc_cache_id'")
            __props__.__dict__["hpc_cache_id"] = hpc_cache_id
            __props__.__dict__["name"] = name
        super(CacheAccessPolicy, __self__).__init__(
            'azure:hpc/cacheAccessPolicy:CacheAccessPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CacheAccessPolicyAccessRuleArgs', 'CacheAccessPolicyAccessRuleArgsDict']]]]] = None,
            hpc_cache_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None) -> 'CacheAccessPolicy':
        """
        Get an existing CacheAccessPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['CacheAccessPolicyAccessRuleArgs', 'CacheAccessPolicyAccessRuleArgsDict']]]] access_rules: One or more `access_rule` blocks (up to three) as defined below.
        :param pulumi.Input[_builtins.str] hpc_cache_id: The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CacheAccessPolicyState.__new__(_CacheAccessPolicyState)

        __props__.__dict__["access_rules"] = access_rules
        __props__.__dict__["hpc_cache_id"] = hpc_cache_id
        __props__.__dict__["name"] = name
        return CacheAccessPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accessRules")
    def access_rules(self) -> pulumi.Output[Sequence['outputs.CacheAccessPolicyAccessRule']]:
        """
        One or more `access_rule` blocks (up to three) as defined below.
        """
        return pulumi.get(self, "access_rules")

    @_builtins.property
    @pulumi.getter(name="hpcCacheId")
    def hpc_cache_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "hpc_cache_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "name")

