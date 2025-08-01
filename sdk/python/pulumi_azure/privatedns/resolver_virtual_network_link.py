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

__all__ = ['ResolverVirtualNetworkLinkArgs', 'ResolverVirtualNetworkLink']

@pulumi.input_type
class ResolverVirtualNetworkLinkArgs:
    def __init__(__self__, *,
                 dns_forwarding_ruleset_id: pulumi.Input[_builtins.str],
                 virtual_network_id: pulumi.Input[_builtins.str],
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ResolverVirtualNetworkLink resource.
        :param pulumi.Input[_builtins.str] dns_forwarding_ruleset_id: Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[_builtins.str] virtual_network_id: The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata attached to the Private DNS Resolver Virtual Network Link.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        pulumi.set(__self__, "dns_forwarding_ruleset_id", dns_forwarding_ruleset_id)
        pulumi.set(__self__, "virtual_network_id", virtual_network_id)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="dnsForwardingRulesetId")
    def dns_forwarding_ruleset_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        return pulumi.get(self, "dns_forwarding_ruleset_id")

    @dns_forwarding_ruleset_id.setter
    def dns_forwarding_ruleset_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "dns_forwarding_ruleset_id", value)

    @_builtins.property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "virtual_network_id")

    @virtual_network_id.setter
    def virtual_network_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "virtual_network_id", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Metadata attached to the Private DNS Resolver Virtual Network Link.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ResolverVirtualNetworkLinkState:
    def __init__(__self__, *,
                 dns_forwarding_ruleset_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 virtual_network_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ResolverVirtualNetworkLink resources.
        :param pulumi.Input[_builtins.str] dns_forwarding_ruleset_id: Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata attached to the Private DNS Resolver Virtual Network Link.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[_builtins.str] virtual_network_id: The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        """
        if dns_forwarding_ruleset_id is not None:
            pulumi.set(__self__, "dns_forwarding_ruleset_id", dns_forwarding_ruleset_id)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if virtual_network_id is not None:
            pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @_builtins.property
    @pulumi.getter(name="dnsForwardingRulesetId")
    def dns_forwarding_ruleset_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        return pulumi.get(self, "dns_forwarding_ruleset_id")

    @dns_forwarding_ruleset_id.setter
    def dns_forwarding_ruleset_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_forwarding_ruleset_id", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Metadata attached to the Private DNS Resolver Virtual Network Link.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "virtual_network_id")

    @virtual_network_id.setter
    def virtual_network_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "virtual_network_id", value)


@pulumi.type_token("azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink")
class ResolverVirtualNetworkLink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_forwarding_ruleset_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 virtual_network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Private DNS Resolver Virtual Network Link.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="west europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            resource_group_name=example.name,
            location=example.location,
            address_spaces=["10.0.0.0/16"])
        example_subnet = azure.network.Subnet("example",
            name="outbounddns",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.0.64/28"],
            delegations=[{
                "name": "Microsoft.Network.dnsResolvers",
                "service_delegation": {
                    "actions": ["Microsoft.Network/virtualNetworks/subnets/join/action"],
                    "name": "Microsoft.Network/dnsResolvers",
                },
            }])
        example_resolver = azure.privatedns.Resolver("example",
            name="example-resolver",
            resource_group_name=example.name,
            location=example.location,
            virtual_network_id=example_virtual_network.id)
        example_resolver_outbound_endpoint = azure.privatedns.ResolverOutboundEndpoint("example",
            name="example-endpoint",
            private_dns_resolver_id=example_resolver.id,
            location=example_resolver.location,
            subnet_id=example_subnet.id,
            tags={
                "key": "value",
            })
        example_resolver_dns_forwarding_ruleset = azure.privatedns.ResolverDnsForwardingRuleset("example",
            name="example-ruleset",
            resource_group_name=example.name,
            location=example.location,
            private_dns_resolver_outbound_endpoint_ids=[example_resolver_outbound_endpoint.id],
            tags={
                "key": "value",
            })
        example_resolver_virtual_network_link = azure.privatedns.ResolverVirtualNetworkLink("example",
            name="example-link",
            dns_forwarding_ruleset_id=example_resolver_dns_forwarding_ruleset.id,
            virtual_network_id=example_virtual_network.id,
            metadata={
                "key": "value",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2022-07-01

        ## Import

        Private DNS Resolver Virtual Network Link can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsForwardingRulesets/dnsForwardingRuleset1/virtualNetworkLinks/virtualNetworkLink1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dns_forwarding_ruleset_id: Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata attached to the Private DNS Resolver Virtual Network Link.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[_builtins.str] virtual_network_id: The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResolverVirtualNetworkLinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Private DNS Resolver Virtual Network Link.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="west europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            resource_group_name=example.name,
            location=example.location,
            address_spaces=["10.0.0.0/16"])
        example_subnet = azure.network.Subnet("example",
            name="outbounddns",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.0.64/28"],
            delegations=[{
                "name": "Microsoft.Network.dnsResolvers",
                "service_delegation": {
                    "actions": ["Microsoft.Network/virtualNetworks/subnets/join/action"],
                    "name": "Microsoft.Network/dnsResolvers",
                },
            }])
        example_resolver = azure.privatedns.Resolver("example",
            name="example-resolver",
            resource_group_name=example.name,
            location=example.location,
            virtual_network_id=example_virtual_network.id)
        example_resolver_outbound_endpoint = azure.privatedns.ResolverOutboundEndpoint("example",
            name="example-endpoint",
            private_dns_resolver_id=example_resolver.id,
            location=example_resolver.location,
            subnet_id=example_subnet.id,
            tags={
                "key": "value",
            })
        example_resolver_dns_forwarding_ruleset = azure.privatedns.ResolverDnsForwardingRuleset("example",
            name="example-ruleset",
            resource_group_name=example.name,
            location=example.location,
            private_dns_resolver_outbound_endpoint_ids=[example_resolver_outbound_endpoint.id],
            tags={
                "key": "value",
            })
        example_resolver_virtual_network_link = azure.privatedns.ResolverVirtualNetworkLink("example",
            name="example-link",
            dns_forwarding_ruleset_id=example_resolver_dns_forwarding_ruleset.id,
            virtual_network_id=example_virtual_network.id,
            metadata={
                "key": "value",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2022-07-01

        ## Import

        Private DNS Resolver Virtual Network Link can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsForwardingRulesets/dnsForwardingRuleset1/virtualNetworkLinks/virtualNetworkLink1
        ```

        :param str resource_name: The name of the resource.
        :param ResolverVirtualNetworkLinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResolverVirtualNetworkLinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_forwarding_ruleset_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 virtual_network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResolverVirtualNetworkLinkArgs.__new__(ResolverVirtualNetworkLinkArgs)

            if dns_forwarding_ruleset_id is None and not opts.urn:
                raise TypeError("Missing required property 'dns_forwarding_ruleset_id'")
            __props__.__dict__["dns_forwarding_ruleset_id"] = dns_forwarding_ruleset_id
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            if virtual_network_id is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_network_id'")
            __props__.__dict__["virtual_network_id"] = virtual_network_id
        super(ResolverVirtualNetworkLink, __self__).__init__(
            'azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dns_forwarding_ruleset_id: Optional[pulumi.Input[_builtins.str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            virtual_network_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ResolverVirtualNetworkLink':
        """
        Get an existing ResolverVirtualNetworkLink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dns_forwarding_ruleset_id: Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata attached to the Private DNS Resolver Virtual Network Link.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        :param pulumi.Input[_builtins.str] virtual_network_id: The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResolverVirtualNetworkLinkState.__new__(_ResolverVirtualNetworkLinkState)

        __props__.__dict__["dns_forwarding_ruleset_id"] = dns_forwarding_ruleset_id
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["virtual_network_id"] = virtual_network_id
        return ResolverVirtualNetworkLink(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dnsForwardingRulesetId")
    def dns_forwarding_ruleset_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        return pulumi.get(self, "dns_forwarding_ruleset_id")

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Metadata attached to the Private DNS Resolver Virtual Network Link.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "virtual_network_id")

