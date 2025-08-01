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

__all__ = ['FrontdoorSecurityPolicyArgs', 'FrontdoorSecurityPolicy']

@pulumi.input_type
class FrontdoorSecurityPolicyArgs:
    def __init__(__self__, *,
                 cdn_frontdoor_profile_id: pulumi.Input[_builtins.str],
                 security_policies: pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs'],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a FrontdoorSecurityPolicy resource.
        :param pulumi.Input[_builtins.str] cdn_frontdoor_profile_id: The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs'] security_policies: An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        """
        pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        pulumi.set(__self__, "security_policies", security_policies)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @cdn_frontdoor_profile_id.setter
    def cdn_frontdoor_profile_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cdn_frontdoor_profile_id", value)

    @_builtins.property
    @pulumi.getter(name="securityPolicies")
    def security_policies(self) -> pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs']:
        """
        An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "security_policies")

    @security_policies.setter
    def security_policies(self, value: pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs']):
        pulumi.set(self, "security_policies", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FrontdoorSecurityPolicyState:
    def __init__(__self__, *,
                 cdn_frontdoor_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 security_policies: Optional[pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs']] = None):
        """
        Input properties used for looking up and filtering FrontdoorSecurityPolicy resources.
        :param pulumi.Input[_builtins.str] cdn_frontdoor_profile_id: The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs'] security_policies: An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        """
        if cdn_frontdoor_profile_id is not None:
            pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if security_policies is not None:
            pulumi.set(__self__, "security_policies", security_policies)

    @_builtins.property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @cdn_frontdoor_profile_id.setter
    def cdn_frontdoor_profile_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cdn_frontdoor_profile_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="securityPolicies")
    def security_policies(self) -> Optional[pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs']]:
        """
        An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "security_policies")

    @security_policies.setter
    def security_policies(self, value: Optional[pulumi.Input['FrontdoorSecurityPolicySecurityPoliciesArgs']]):
        pulumi.set(self, "security_policies", value)


@pulumi.type_token("azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy")
class FrontdoorSecurityPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cdn_frontdoor_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 security_policies: Optional[pulumi.Input[Union['FrontdoorSecurityPolicySecurityPoliciesArgs', 'FrontdoorSecurityPolicySecurityPoliciesArgsDict']]] = None,
                 __props__=None):
        """
        Manages a Front Door (standard/premium) Security Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-cdn-frontdoor",
            location="West Europe")
        example_frontdoor_profile = azure.cdn.FrontdoorProfile("example",
            name="example-profile",
            resource_group_name=example.name,
            sku_name="Standard_AzureFrontDoor")
        example_frontdoor_firewall_policy = azure.cdn.FrontdoorFirewallPolicy("example",
            name="exampleWAF",
            resource_group_name=example.name,
            sku_name=example_frontdoor_profile.sku_name,
            enabled=True,
            mode="Prevention",
            redirect_url="https://www.contoso.com",
            custom_block_response_status_code=403,
            custom_block_response_body="PGh0bWw+CjxoZWFkZXI+PHRpdGxlPkhlbGxvPC90aXRsZT48L2hlYWRlcj4KPGJvZHk+CkhlbGxvIHdvcmxkCjwvYm9keT4KPC9odG1sPg==",
            custom_rules=[{
                "name": "Rule1",
                "enabled": True,
                "priority": 1,
                "rate_limit_duration_in_minutes": 1,
                "rate_limit_threshold": 10,
                "type": "MatchRule",
                "action": "Block",
                "match_conditions": [{
                    "match_variable": "RemoteAddr",
                    "operator": "IPMatch",
                    "negation_condition": False,
                    "match_values": [
                        "192.168.1.0/24",
                        "10.0.1.0/24",
                    ],
                }],
            }])
        example_zone = azure.dns.Zone("example",
            name="sub-domain.domain.com",
            resource_group_name=example.name)
        example_frontdoor_custom_domain = azure.cdn.FrontdoorCustomDomain("example",
            name="example-customDomain",
            cdn_frontdoor_profile_id=example_frontdoor_profile.id,
            dns_zone_id=example_zone.id,
            host_name="contoso.fabrikam.com",
            tls={
                "certificate_type": "ManagedCertificate",
                "minimum_tls_version": "TLS12",
            })
        example_frontdoor_security_policy = azure.cdn.FrontdoorSecurityPolicy("example",
            name="Example-Security-Policy",
            cdn_frontdoor_profile_id=example_frontdoor_profile.id,
            security_policies={
                "firewall": {
                    "cdn_frontdoor_firewall_policy_id": example_frontdoor_firewall_policy.id,
                    "association": {
                        "domains": [{
                            "cdn_frontdoor_domain_id": example_frontdoor_custom_domain.id,
                        }],
                        "patterns_to_match": "/*",
                    },
                },
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Cdn`: 2024-02-01

        ## Import

        Front Door Security Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/securityPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cdn_frontdoor_profile_id: The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input[Union['FrontdoorSecurityPolicySecurityPoliciesArgs', 'FrontdoorSecurityPolicySecurityPoliciesArgsDict']] security_policies: An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FrontdoorSecurityPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Front Door (standard/premium) Security Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-cdn-frontdoor",
            location="West Europe")
        example_frontdoor_profile = azure.cdn.FrontdoorProfile("example",
            name="example-profile",
            resource_group_name=example.name,
            sku_name="Standard_AzureFrontDoor")
        example_frontdoor_firewall_policy = azure.cdn.FrontdoorFirewallPolicy("example",
            name="exampleWAF",
            resource_group_name=example.name,
            sku_name=example_frontdoor_profile.sku_name,
            enabled=True,
            mode="Prevention",
            redirect_url="https://www.contoso.com",
            custom_block_response_status_code=403,
            custom_block_response_body="PGh0bWw+CjxoZWFkZXI+PHRpdGxlPkhlbGxvPC90aXRsZT48L2hlYWRlcj4KPGJvZHk+CkhlbGxvIHdvcmxkCjwvYm9keT4KPC9odG1sPg==",
            custom_rules=[{
                "name": "Rule1",
                "enabled": True,
                "priority": 1,
                "rate_limit_duration_in_minutes": 1,
                "rate_limit_threshold": 10,
                "type": "MatchRule",
                "action": "Block",
                "match_conditions": [{
                    "match_variable": "RemoteAddr",
                    "operator": "IPMatch",
                    "negation_condition": False,
                    "match_values": [
                        "192.168.1.0/24",
                        "10.0.1.0/24",
                    ],
                }],
            }])
        example_zone = azure.dns.Zone("example",
            name="sub-domain.domain.com",
            resource_group_name=example.name)
        example_frontdoor_custom_domain = azure.cdn.FrontdoorCustomDomain("example",
            name="example-customDomain",
            cdn_frontdoor_profile_id=example_frontdoor_profile.id,
            dns_zone_id=example_zone.id,
            host_name="contoso.fabrikam.com",
            tls={
                "certificate_type": "ManagedCertificate",
                "minimum_tls_version": "TLS12",
            })
        example_frontdoor_security_policy = azure.cdn.FrontdoorSecurityPolicy("example",
            name="Example-Security-Policy",
            cdn_frontdoor_profile_id=example_frontdoor_profile.id,
            security_policies={
                "firewall": {
                    "cdn_frontdoor_firewall_policy_id": example_frontdoor_firewall_policy.id,
                    "association": {
                        "domains": [{
                            "cdn_frontdoor_domain_id": example_frontdoor_custom_domain.id,
                        }],
                        "patterns_to_match": "/*",
                    },
                },
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Cdn`: 2024-02-01

        ## Import

        Front Door Security Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/securityPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param FrontdoorSecurityPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FrontdoorSecurityPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cdn_frontdoor_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 security_policies: Optional[pulumi.Input[Union['FrontdoorSecurityPolicySecurityPoliciesArgs', 'FrontdoorSecurityPolicySecurityPoliciesArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FrontdoorSecurityPolicyArgs.__new__(FrontdoorSecurityPolicyArgs)

            if cdn_frontdoor_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'cdn_frontdoor_profile_id'")
            __props__.__dict__["cdn_frontdoor_profile_id"] = cdn_frontdoor_profile_id
            __props__.__dict__["name"] = name
            if security_policies is None and not opts.urn:
                raise TypeError("Missing required property 'security_policies'")
            __props__.__dict__["security_policies"] = security_policies
        super(FrontdoorSecurityPolicy, __self__).__init__(
            'azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cdn_frontdoor_profile_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            security_policies: Optional[pulumi.Input[Union['FrontdoorSecurityPolicySecurityPoliciesArgs', 'FrontdoorSecurityPolicySecurityPoliciesArgsDict']]] = None) -> 'FrontdoorSecurityPolicy':
        """
        Get an existing FrontdoorSecurityPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cdn_frontdoor_profile_id: The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        :param pulumi.Input[Union['FrontdoorSecurityPolicySecurityPoliciesArgs', 'FrontdoorSecurityPolicySecurityPoliciesArgsDict']] security_policies: An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FrontdoorSecurityPolicyState.__new__(_FrontdoorSecurityPolicyState)

        __props__.__dict__["cdn_frontdoor_profile_id"] = cdn_frontdoor_profile_id
        __props__.__dict__["name"] = name
        __props__.__dict__["security_policies"] = security_policies
        return FrontdoorSecurityPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="securityPolicies")
    def security_policies(self) -> pulumi.Output['outputs.FrontdoorSecurityPolicySecurityPolicies']:
        """
        An `security_policies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        """
        return pulumi.get(self, "security_policies")

