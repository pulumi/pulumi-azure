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

__all__ = ['NsRecordArgs', 'NsRecord']

@pulumi.input_type
class NsRecordArgs:
    def __init__(__self__, *,
                 records: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 resource_group_name: pulumi.Input[_builtins.str],
                 ttl: pulumi.Input[_builtins.int],
                 zone_name: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a NsRecord resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] records: A list of values that make up the NS record.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] ttl: The Time To Live (TTL) of the DNS record in seconds.
        :param pulumi.Input[_builtins.str] zone_name: Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the DNS NS Record. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "records", records)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "ttl", ttl)
        pulumi.set(__self__, "zone_name", zone_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def records(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        A list of values that make up the NS record.
        """
        return pulumi.get(self, "records")

    @records.setter
    def records(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "records", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def ttl(self) -> pulumi.Input[_builtins.int]:
        """
        The Time To Live (TTL) of the DNS record in seconds.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "ttl", value)

    @_builtins.property
    @pulumi.getter(name="zoneName")
    def zone_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "zone_name")

    @zone_name.setter
    def zone_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the DNS NS Record. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _NsRecordState:
    def __init__(__self__, *,
                 fqdn: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 records: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 zone_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NsRecord resources.
        :param pulumi.Input[_builtins.str] fqdn: The FQDN of the DNS NS Record.
        :param pulumi.Input[_builtins.str] name: The name of the DNS NS Record. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] records: A list of values that make up the NS record.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.int] ttl: The Time To Live (TTL) of the DNS record in seconds.
        :param pulumi.Input[_builtins.str] zone_name: Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        """
        if fqdn is not None:
            pulumi.set(__self__, "fqdn", fqdn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if records is not None:
            pulumi.set(__self__, "records", records)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)
        if zone_name is not None:
            pulumi.set(__self__, "zone_name", zone_name)

    @_builtins.property
    @pulumi.getter
    def fqdn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The FQDN of the DNS NS Record.
        """
        return pulumi.get(self, "fqdn")

    @fqdn.setter
    def fqdn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "fqdn", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the DNS NS Record. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of values that make up the NS record.
        """
        return pulumi.get(self, "records")

    @records.setter
    def records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "records", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The Time To Live (TTL) of the DNS record in seconds.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ttl", value)

    @_builtins.property
    @pulumi.getter(name="zoneName")
    def zone_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "zone_name")

    @zone_name.setter
    def zone_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_name", value)


@pulumi.type_token("azure:dns/nsRecord:NsRecord")
class NsRecord(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 records: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 zone_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_zone = azure.dns.Zone("example",
            name="mydomain.com",
            resource_group_name=example.name)
        example_ns_record = azure.dns.NsRecord("example",
            name="test",
            zone_name=example_zone.name,
            resource_group_name=example.name,
            ttl=300,
            records=[
                "ns1.contoso.com.",
                "ns2.contoso.com.",
            ],
            tags={
                "Environment": "Production",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2018-05-01

        ## Import

        NS records can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:dns/nsRecord:NsRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/dnsZones/zone1/NS/myrecord1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the DNS NS Record. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] records: A list of values that make up the NS record.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.int] ttl: The Time To Live (TTL) of the DNS record in seconds.
        :param pulumi.Input[_builtins.str] zone_name: Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NsRecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_zone = azure.dns.Zone("example",
            name="mydomain.com",
            resource_group_name=example.name)
        example_ns_record = azure.dns.NsRecord("example",
            name="test",
            zone_name=example_zone.name,
            resource_group_name=example.name,
            ttl=300,
            records=[
                "ns1.contoso.com.",
                "ns2.contoso.com.",
            ],
            tags={
                "Environment": "Production",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2018-05-01

        ## Import

        NS records can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:dns/nsRecord:NsRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/dnsZones/zone1/NS/myrecord1
        ```

        :param str resource_name: The name of the resource.
        :param NsRecordArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NsRecordArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 records: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 zone_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NsRecordArgs.__new__(NsRecordArgs)

            __props__.__dict__["name"] = name
            if records is None and not opts.urn:
                raise TypeError("Missing required property 'records'")
            __props__.__dict__["records"] = records
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            if ttl is None and not opts.urn:
                raise TypeError("Missing required property 'ttl'")
            __props__.__dict__["ttl"] = ttl
            if zone_name is None and not opts.urn:
                raise TypeError("Missing required property 'zone_name'")
            __props__.__dict__["zone_name"] = zone_name
            __props__.__dict__["fqdn"] = None
        super(NsRecord, __self__).__init__(
            'azure:dns/nsRecord:NsRecord',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            fqdn: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            records: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            ttl: Optional[pulumi.Input[_builtins.int]] = None,
            zone_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'NsRecord':
        """
        Get an existing NsRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] fqdn: The FQDN of the DNS NS Record.
        :param pulumi.Input[_builtins.str] name: The name of the DNS NS Record. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] records: A list of values that make up the NS record.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.int] ttl: The Time To Live (TTL) of the DNS record in seconds.
        :param pulumi.Input[_builtins.str] zone_name: Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NsRecordState.__new__(_NsRecordState)

        __props__.__dict__["fqdn"] = fqdn
        __props__.__dict__["name"] = name
        __props__.__dict__["records"] = records
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["ttl"] = ttl
        __props__.__dict__["zone_name"] = zone_name
        return NsRecord(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def fqdn(self) -> pulumi.Output[_builtins.str]:
        """
        The FQDN of the DNS NS Record.
        """
        return pulumi.get(self, "fqdn")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the DNS NS Record. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def records(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        A list of values that make up the NS record.
        """
        return pulumi.get(self, "records")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[_builtins.int]:
        """
        The Time To Live (TTL) of the DNS record in seconds.
        """
        return pulumi.get(self, "ttl")

    @_builtins.property
    @pulumi.getter(name="zoneName")
    def zone_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "zone_name")

