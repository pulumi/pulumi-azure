# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['CacheAccessPolicy']


class CacheAccessPolicy(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CacheAccessPolicyAccessRuleArgs']]]]] = None,
                 hpc_cache_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a HPC Cache Access Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("exampleVirtualNetwork",
            address_spaces=["10.0.0.0/16"],
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name)
        example_subnet = azure.network.Subnet("exampleSubnet",
            resource_group_name=example_resource_group.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"])
        example_cache = azure.hpc.Cache("exampleCache",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cache_size_in_gb=3072,
            subnet_id=example_subnet.id,
            sku_name="Standard_2G")
        example_cache_access_policy = azure.hpc.CacheAccessPolicy("exampleCacheAccessPolicy",
            hpc_cache_id=example_cache.id,
            access_rules=[azure.hpc.CacheAccessPolicyAccessRuleArgs(
                scope="default",
                access="rw",
            )])
        ```

        ## Import

        HPC Cache Access Policys can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:hpc/cacheAccessPolicy:CacheAccessPolicy example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/cacheAccessPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CacheAccessPolicyAccessRuleArgs']]]] access_rules: Up to three `access_rule` blocks as defined below.
        :param pulumi.Input[str] hpc_cache_id: The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        :param pulumi.Input[str] name: The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if access_rules is None and not opts.urn:
                raise TypeError("Missing required property 'access_rules'")
            __props__['access_rules'] = access_rules
            if hpc_cache_id is None and not opts.urn:
                raise TypeError("Missing required property 'hpc_cache_id'")
            __props__['hpc_cache_id'] = hpc_cache_id
            __props__['name'] = name
        super(CacheAccessPolicy, __self__).__init__(
            'azure:hpc/cacheAccessPolicy:CacheAccessPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CacheAccessPolicyAccessRuleArgs']]]]] = None,
            hpc_cache_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'CacheAccessPolicy':
        """
        Get an existing CacheAccessPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CacheAccessPolicyAccessRuleArgs']]]] access_rules: Up to three `access_rule` blocks as defined below.
        :param pulumi.Input[str] hpc_cache_id: The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        :param pulumi.Input[str] name: The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_rules"] = access_rules
        __props__["hpc_cache_id"] = hpc_cache_id
        __props__["name"] = name
        return CacheAccessPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessRules")
    def access_rules(self) -> pulumi.Output[Sequence['outputs.CacheAccessPolicyAccessRule']]:
        """
        Up to three `access_rule` blocks as defined below.
        """
        return pulumi.get(self, "access_rules")

    @property
    @pulumi.getter(name="hpcCacheId")
    def hpc_cache_id(self) -> pulumi.Output[str]:
        """
        The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "hpc_cache_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
        """
        return pulumi.get(self, "name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
