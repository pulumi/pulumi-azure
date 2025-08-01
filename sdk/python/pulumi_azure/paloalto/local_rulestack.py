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

__all__ = ['LocalRulestackArgs', 'LocalRulestack']

@pulumi.input_type
class LocalRulestackArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 anti_spyware_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 anti_virus_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_subscription: Optional[pulumi.Input[_builtins.str]] = None,
                 file_blocking_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 url_filtering_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 vulnerability_profile: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a LocalRulestack resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] anti_spyware_profile: The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] anti_virus_profile: The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] description: The description for this Local Rulestack.
        :param pulumi.Input[_builtins.str] dns_subscription: TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] file_blocking_profile: The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] url_filtering_profile: The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] vulnerability_profile: The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if anti_spyware_profile is not None:
            pulumi.set(__self__, "anti_spyware_profile", anti_spyware_profile)
        if anti_virus_profile is not None:
            pulumi.set(__self__, "anti_virus_profile", anti_virus_profile)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns_subscription is not None:
            pulumi.set(__self__, "dns_subscription", dns_subscription)
        if file_blocking_profile is not None:
            pulumi.set(__self__, "file_blocking_profile", file_blocking_profile)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if url_filtering_profile is not None:
            pulumi.set(__self__, "url_filtering_profile", url_filtering_profile)
        if vulnerability_profile is not None:
            pulumi.set(__self__, "vulnerability_profile", vulnerability_profile)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="antiSpywareProfile")
    def anti_spyware_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "anti_spyware_profile")

    @anti_spyware_profile.setter
    def anti_spyware_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "anti_spyware_profile", value)

    @_builtins.property
    @pulumi.getter(name="antiVirusProfile")
    def anti_virus_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "anti_virus_profile")

    @anti_virus_profile.setter
    def anti_virus_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "anti_virus_profile", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for this Local Rulestack.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="dnsSubscription")
    def dns_subscription(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "dns_subscription")

    @dns_subscription.setter
    def dns_subscription(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_subscription", value)

    @_builtins.property
    @pulumi.getter(name="fileBlockingProfile")
    def file_blocking_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "file_blocking_profile")

    @file_blocking_profile.setter
    def file_blocking_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_blocking_profile", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="urlFilteringProfile")
    def url_filtering_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "url_filtering_profile")

    @url_filtering_profile.setter
    def url_filtering_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "url_filtering_profile", value)

    @_builtins.property
    @pulumi.getter(name="vulnerabilityProfile")
    def vulnerability_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "vulnerability_profile")

    @vulnerability_profile.setter
    def vulnerability_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vulnerability_profile", value)


@pulumi.input_type
class _LocalRulestackState:
    def __init__(__self__, *,
                 anti_spyware_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 anti_virus_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_subscription: Optional[pulumi.Input[_builtins.str]] = None,
                 file_blocking_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 url_filtering_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 vulnerability_profile: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LocalRulestack resources.
        :param pulumi.Input[_builtins.str] anti_spyware_profile: The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] anti_virus_profile: The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] description: The description for this Local Rulestack.
        :param pulumi.Input[_builtins.str] dns_subscription: TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] file_blocking_profile: The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] url_filtering_profile: The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] vulnerability_profile: The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        if anti_spyware_profile is not None:
            pulumi.set(__self__, "anti_spyware_profile", anti_spyware_profile)
        if anti_virus_profile is not None:
            pulumi.set(__self__, "anti_virus_profile", anti_virus_profile)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns_subscription is not None:
            pulumi.set(__self__, "dns_subscription", dns_subscription)
        if file_blocking_profile is not None:
            pulumi.set(__self__, "file_blocking_profile", file_blocking_profile)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if url_filtering_profile is not None:
            pulumi.set(__self__, "url_filtering_profile", url_filtering_profile)
        if vulnerability_profile is not None:
            pulumi.set(__self__, "vulnerability_profile", vulnerability_profile)

    @_builtins.property
    @pulumi.getter(name="antiSpywareProfile")
    def anti_spyware_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "anti_spyware_profile")

    @anti_spyware_profile.setter
    def anti_spyware_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "anti_spyware_profile", value)

    @_builtins.property
    @pulumi.getter(name="antiVirusProfile")
    def anti_virus_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "anti_virus_profile")

    @anti_virus_profile.setter
    def anti_virus_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "anti_virus_profile", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for this Local Rulestack.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="dnsSubscription")
    def dns_subscription(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "dns_subscription")

    @dns_subscription.setter
    def dns_subscription(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_subscription", value)

    @_builtins.property
    @pulumi.getter(name="fileBlockingProfile")
    def file_blocking_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "file_blocking_profile")

    @file_blocking_profile.setter
    def file_blocking_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_blocking_profile", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="urlFilteringProfile")
    def url_filtering_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "url_filtering_profile")

    @url_filtering_profile.setter
    def url_filtering_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "url_filtering_profile", value)

    @_builtins.property
    @pulumi.getter(name="vulnerabilityProfile")
    def vulnerability_profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "vulnerability_profile")

    @vulnerability_profile.setter
    def vulnerability_profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vulnerability_profile", value)


@pulumi.type_token("azure:paloalto/localRulestack:LocalRulestack")
class LocalRulestack(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anti_spyware_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 anti_virus_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_subscription: Optional[pulumi.Input[_builtins.str]] = None,
                 file_blocking_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 url_filtering_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 vulnerability_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Palo Alto Networks Rulestack.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="rg-example",
            location="West Europe")
        example_local_rulestack = azure.paloalto.LocalRulestack("example",
            name="example",
            resource_group_name=example.name,
            location=example.location)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `PaloAltoNetworks.Cloudngfw`: 2022-08-29

        ## Import

        Palo Alto Networks Rulestacks can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:paloalto/localRulestack:LocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/localRulestacks/myLocalRulestack
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] anti_spyware_profile: The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] anti_virus_profile: The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] description: The description for this Local Rulestack.
        :param pulumi.Input[_builtins.str] dns_subscription: TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] file_blocking_profile: The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] url_filtering_profile: The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] vulnerability_profile: The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocalRulestackArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Palo Alto Networks Rulestack.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="rg-example",
            location="West Europe")
        example_local_rulestack = azure.paloalto.LocalRulestack("example",
            name="example",
            resource_group_name=example.name,
            location=example.location)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `PaloAltoNetworks.Cloudngfw`: 2022-08-29

        ## Import

        Palo Alto Networks Rulestacks can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:paloalto/localRulestack:LocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/localRulestacks/myLocalRulestack
        ```

        :param str resource_name: The name of the resource.
        :param LocalRulestackArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocalRulestackArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anti_spyware_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 anti_virus_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_subscription: Optional[pulumi.Input[_builtins.str]] = None,
                 file_blocking_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 url_filtering_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 vulnerability_profile: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocalRulestackArgs.__new__(LocalRulestackArgs)

            __props__.__dict__["anti_spyware_profile"] = anti_spyware_profile
            __props__.__dict__["anti_virus_profile"] = anti_virus_profile
            __props__.__dict__["description"] = description
            __props__.__dict__["dns_subscription"] = dns_subscription
            __props__.__dict__["file_blocking_profile"] = file_blocking_profile
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["url_filtering_profile"] = url_filtering_profile
            __props__.__dict__["vulnerability_profile"] = vulnerability_profile
        super(LocalRulestack, __self__).__init__(
            'azure:paloalto/localRulestack:LocalRulestack',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            anti_spyware_profile: Optional[pulumi.Input[_builtins.str]] = None,
            anti_virus_profile: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            dns_subscription: Optional[pulumi.Input[_builtins.str]] = None,
            file_blocking_profile: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            url_filtering_profile: Optional[pulumi.Input[_builtins.str]] = None,
            vulnerability_profile: Optional[pulumi.Input[_builtins.str]] = None) -> 'LocalRulestack':
        """
        Get an existing LocalRulestack resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] anti_spyware_profile: The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] anti_virus_profile: The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] description: The description for this Local Rulestack.
        :param pulumi.Input[_builtins.str] dns_subscription: TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] file_blocking_profile: The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        :param pulumi.Input[_builtins.str] url_filtering_profile: The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        :param pulumi.Input[_builtins.str] vulnerability_profile: The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocalRulestackState.__new__(_LocalRulestackState)

        __props__.__dict__["anti_spyware_profile"] = anti_spyware_profile
        __props__.__dict__["anti_virus_profile"] = anti_virus_profile
        __props__.__dict__["description"] = description
        __props__.__dict__["dns_subscription"] = dns_subscription
        __props__.__dict__["file_blocking_profile"] = file_blocking_profile
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["url_filtering_profile"] = url_filtering_profile
        __props__.__dict__["vulnerability_profile"] = vulnerability_profile
        return LocalRulestack(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="antiSpywareProfile")
    def anti_spyware_profile(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The setting to use for Anti-Spyware. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "anti_spyware_profile")

    @_builtins.property
    @pulumi.getter(name="antiVirusProfile")
    def anti_virus_profile(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The setting to use for Anti-Virus. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "anti_virus_profile")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description for this Local Rulestack.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="dnsSubscription")
    def dns_subscription(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        TThe setting to use for DNS Subscription. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "dns_subscription")

    @_builtins.property
    @pulumi.getter(name="fileBlockingProfile")
    def file_blocking_profile(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The setting to use for the File Blocking Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "file_blocking_profile")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The Azure Region where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Palo Alto Networks Rulestack. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group where the Palo Alto Networks Rulestack should exist. Changing this forces a new Palo Alto Networks Rulestack to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="urlFilteringProfile")
    def url_filtering_profile(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The setting to use for the URL Filtering Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "url_filtering_profile")

    @_builtins.property
    @pulumi.getter(name="vulnerabilityProfile")
    def vulnerability_profile(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The setting to use for the Vulnerability Profile. Possible values include `BestPractice`, and `Custom`.
        """
        return pulumi.get(self, "vulnerability_profile")

