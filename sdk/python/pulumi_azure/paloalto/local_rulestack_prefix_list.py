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

__all__ = ['LocalRulestackPrefixListArgs', 'LocalRulestackPrefixList']

@pulumi.input_type
class LocalRulestackPrefixListArgs:
    def __init__(__self__, *,
                 prefix_lists: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 rulestack_id: pulumi.Input[_builtins.str],
                 audit_comment: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a LocalRulestackPrefixList resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] prefix_lists: Specifies a list of Prefixes.
        :param pulumi.Input[_builtins.str] rulestack_id: The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        :param pulumi.Input[_builtins.str] audit_comment: The comment for Audit purposes.
        :param pulumi.Input[_builtins.str] description: The description for the Prefix List.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Local Rulestack Prefix List.
        """
        pulumi.set(__self__, "prefix_lists", prefix_lists)
        pulumi.set(__self__, "rulestack_id", rulestack_id)
        if audit_comment is not None:
            pulumi.set(__self__, "audit_comment", audit_comment)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="prefixLists")
    def prefix_lists(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        Specifies a list of Prefixes.
        """
        return pulumi.get(self, "prefix_lists")

    @prefix_lists.setter
    def prefix_lists(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "prefix_lists", value)

    @_builtins.property
    @pulumi.getter(name="rulestackId")
    def rulestack_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        """
        return pulumi.get(self, "rulestack_id")

    @rulestack_id.setter
    def rulestack_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "rulestack_id", value)

    @_builtins.property
    @pulumi.getter(name="auditComment")
    def audit_comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The comment for Audit purposes.
        """
        return pulumi.get(self, "audit_comment")

    @audit_comment.setter
    def audit_comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "audit_comment", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for the Prefix List.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Palo Alto Local Rulestack Prefix List.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _LocalRulestackPrefixListState:
    def __init__(__self__, *,
                 audit_comment: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 rulestack_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LocalRulestackPrefixList resources.
        :param pulumi.Input[_builtins.str] audit_comment: The comment for Audit purposes.
        :param pulumi.Input[_builtins.str] description: The description for the Prefix List.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Local Rulestack Prefix List.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] prefix_lists: Specifies a list of Prefixes.
        :param pulumi.Input[_builtins.str] rulestack_id: The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        """
        if audit_comment is not None:
            pulumi.set(__self__, "audit_comment", audit_comment)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if prefix_lists is not None:
            pulumi.set(__self__, "prefix_lists", prefix_lists)
        if rulestack_id is not None:
            pulumi.set(__self__, "rulestack_id", rulestack_id)

    @_builtins.property
    @pulumi.getter(name="auditComment")
    def audit_comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The comment for Audit purposes.
        """
        return pulumi.get(self, "audit_comment")

    @audit_comment.setter
    def audit_comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "audit_comment", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for the Prefix List.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Palo Alto Local Rulestack Prefix List.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="prefixLists")
    def prefix_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Specifies a list of Prefixes.
        """
        return pulumi.get(self, "prefix_lists")

    @prefix_lists.setter
    def prefix_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "prefix_lists", value)

    @_builtins.property
    @pulumi.getter(name="rulestackId")
    def rulestack_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        """
        return pulumi.get(self, "rulestack_id")

    @rulestack_id.setter
    def rulestack_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rulestack_id", value)


@pulumi.type_token("azure:paloalto/localRulestackPrefixList:LocalRulestackPrefixList")
class LocalRulestackPrefixList(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_comment: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 rulestack_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Palo Alto Local Rulestack Prefix List.

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
        example_local_rulestack_prefix_list = azure.paloalto.LocalRulestackPrefixList("example",
            name="example",
            rulestack_id=example_local_rulestack.id,
            prefix_lists=["10.0.1.0/24"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `PaloAltoNetworks.Cloudngfw`: 2022-08-29

        ## Import

        Palo Alto Local Rulestack Prefix Lists can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:paloalto/localRulestackPrefixList:LocalRulestackPrefixList example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/localRulestacks/myLocalRulestack/prefixLists/myFQDNList1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] audit_comment: The comment for Audit purposes.
        :param pulumi.Input[_builtins.str] description: The description for the Prefix List.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Local Rulestack Prefix List.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] prefix_lists: Specifies a list of Prefixes.
        :param pulumi.Input[_builtins.str] rulestack_id: The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocalRulestackPrefixListArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Palo Alto Local Rulestack Prefix List.

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
        example_local_rulestack_prefix_list = azure.paloalto.LocalRulestackPrefixList("example",
            name="example",
            rulestack_id=example_local_rulestack.id,
            prefix_lists=["10.0.1.0/24"])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `PaloAltoNetworks.Cloudngfw`: 2022-08-29

        ## Import

        Palo Alto Local Rulestack Prefix Lists can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:paloalto/localRulestackPrefixList:LocalRulestackPrefixList example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/localRulestacks/myLocalRulestack/prefixLists/myFQDNList1
        ```

        :param str resource_name: The name of the resource.
        :param LocalRulestackPrefixListArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocalRulestackPrefixListArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_comment: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 rulestack_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocalRulestackPrefixListArgs.__new__(LocalRulestackPrefixListArgs)

            __props__.__dict__["audit_comment"] = audit_comment
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if prefix_lists is None and not opts.urn:
                raise TypeError("Missing required property 'prefix_lists'")
            __props__.__dict__["prefix_lists"] = prefix_lists
            if rulestack_id is None and not opts.urn:
                raise TypeError("Missing required property 'rulestack_id'")
            __props__.__dict__["rulestack_id"] = rulestack_id
        super(LocalRulestackPrefixList, __self__).__init__(
            'azure:paloalto/localRulestackPrefixList:LocalRulestackPrefixList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            audit_comment: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            rulestack_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'LocalRulestackPrefixList':
        """
        Get an existing LocalRulestackPrefixList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] audit_comment: The comment for Audit purposes.
        :param pulumi.Input[_builtins.str] description: The description for the Prefix List.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Palo Alto Local Rulestack Prefix List.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] prefix_lists: Specifies a list of Prefixes.
        :param pulumi.Input[_builtins.str] rulestack_id: The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocalRulestackPrefixListState.__new__(_LocalRulestackPrefixListState)

        __props__.__dict__["audit_comment"] = audit_comment
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["prefix_lists"] = prefix_lists
        __props__.__dict__["rulestack_id"] = rulestack_id
        return LocalRulestackPrefixList(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="auditComment")
    def audit_comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The comment for Audit purposes.
        """
        return pulumi.get(self, "audit_comment")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description for the Prefix List.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Palo Alto Local Rulestack Prefix List.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="prefixLists")
    def prefix_lists(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        Specifies a list of Prefixes.
        """
        return pulumi.get(self, "prefix_lists")

    @_builtins.property
    @pulumi.getter(name="rulestackId")
    def rulestack_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Local Rulestack on which to create this Prefix List. Changing this forces a new Palo Alto Local Rulestack Prefix List to be created.
        """
        return pulumi.get(self, "rulestack_id")

