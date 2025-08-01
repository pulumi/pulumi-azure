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

__all__ = ['AccountRaiPolicyArgs', 'AccountRaiPolicy']

@pulumi.input_type
class AccountRaiPolicyArgs:
    def __init__(__self__, *,
                 base_policy_name: pulumi.Input[_builtins.str],
                 cognitive_account_id: pulumi.Input[_builtins.str],
                 content_filters: pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]],
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a AccountRaiPolicy resource.
        :param pulumi.Input[_builtins.str] base_policy_name: The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] cognitive_account_id: The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]] content_filters: A `content_filter` block as defined below.
        :param pulumi.Input[_builtins.str] mode: The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        :param pulumi.Input[_builtins.str] name: The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "base_policy_name", base_policy_name)
        pulumi.set(__self__, "cognitive_account_id", cognitive_account_id)
        pulumi.set(__self__, "content_filters", content_filters)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="basePolicyName")
    def base_policy_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "base_policy_name")

    @base_policy_name.setter
    def base_policy_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "base_policy_name", value)

    @_builtins.property
    @pulumi.getter(name="cognitiveAccountId")
    def cognitive_account_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cognitive_account_id")

    @cognitive_account_id.setter
    def cognitive_account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cognitive_account_id", value)

    @_builtins.property
    @pulumi.getter(name="contentFilters")
    def content_filters(self) -> pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]]:
        """
        A `content_filter` block as defined below.
        """
        return pulumi.get(self, "content_filters")

    @content_filters.setter
    def content_filters(self, value: pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]]):
        pulumi.set(self, "content_filters", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
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
class _AccountRaiPolicyState:
    def __init__(__self__, *,
                 base_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 cognitive_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 content_filters: Optional[pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering AccountRaiPolicy resources.
        :param pulumi.Input[_builtins.str] base_policy_name: The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] cognitive_account_id: The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]] content_filters: A `content_filter` block as defined below.
        :param pulumi.Input[_builtins.str] mode: The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        :param pulumi.Input[_builtins.str] name: The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if base_policy_name is not None:
            pulumi.set(__self__, "base_policy_name", base_policy_name)
        if cognitive_account_id is not None:
            pulumi.set(__self__, "cognitive_account_id", cognitive_account_id)
        if content_filters is not None:
            pulumi.set(__self__, "content_filters", content_filters)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="basePolicyName")
    def base_policy_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "base_policy_name")

    @base_policy_name.setter
    def base_policy_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "base_policy_name", value)

    @_builtins.property
    @pulumi.getter(name="cognitiveAccountId")
    def cognitive_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cognitive_account_id")

    @cognitive_account_id.setter
    def cognitive_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cognitive_account_id", value)

    @_builtins.property
    @pulumi.getter(name="contentFilters")
    def content_filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]]]:
        """
        A `content_filter` block as defined below.
        """
        return pulumi.get(self, "content_filters")

    @content_filters.setter
    def content_filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccountRaiPolicyContentFilterArgs']]]]):
        pulumi.set(self, "content_filters", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
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


@pulumi.type_token("azure:cognitive/accountRaiPolicy:AccountRaiPolicy")
class AccountRaiPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 cognitive_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 content_filters: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountRaiPolicyContentFilterArgs', 'AccountRaiPolicyContentFilterArgsDict']]]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Cognitive Services Account RAI Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="East US")
        example_account = azure.cognitive.Account("example",
            name="example-account",
            location=example.location,
            resource_group_name=example.name,
            kind="OpenAI",
            sku_name="S0")
        example_account_rai_policy = azure.cognitive.AccountRaiPolicy("example",
            name="example-rai-policy",
            cognitive_account_id=example_account.id,
            base_policy_name="Microsoft.Default",
            content_filters=[{
                "name": "Hate",
                "filter_enabled": True,
                "block_enabled": True,
                "severity_threshold": "High",
                "source": "Prompt",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.CognitiveServices`: 2024-10-01

        ## Import

        Cognitive Service Account RAI Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:cognitive/accountRaiPolicy:AccountRaiPolicy policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.CognitiveServices/accounts/account1/raiPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] base_policy_name: The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] cognitive_account_id: The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AccountRaiPolicyContentFilterArgs', 'AccountRaiPolicyContentFilterArgsDict']]]] content_filters: A `content_filter` block as defined below.
        :param pulumi.Input[_builtins.str] mode: The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        :param pulumi.Input[_builtins.str] name: The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountRaiPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Cognitive Services Account RAI Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="East US")
        example_account = azure.cognitive.Account("example",
            name="example-account",
            location=example.location,
            resource_group_name=example.name,
            kind="OpenAI",
            sku_name="S0")
        example_account_rai_policy = azure.cognitive.AccountRaiPolicy("example",
            name="example-rai-policy",
            cognitive_account_id=example_account.id,
            base_policy_name="Microsoft.Default",
            content_filters=[{
                "name": "Hate",
                "filter_enabled": True,
                "block_enabled": True,
                "severity_threshold": "High",
                "source": "Prompt",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.CognitiveServices`: 2024-10-01

        ## Import

        Cognitive Service Account RAI Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:cognitive/accountRaiPolicy:AccountRaiPolicy policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.CognitiveServices/accounts/account1/raiPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param AccountRaiPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountRaiPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 cognitive_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 content_filters: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountRaiPolicyContentFilterArgs', 'AccountRaiPolicyContentFilterArgsDict']]]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountRaiPolicyArgs.__new__(AccountRaiPolicyArgs)

            if base_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'base_policy_name'")
            __props__.__dict__["base_policy_name"] = base_policy_name
            if cognitive_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'cognitive_account_id'")
            __props__.__dict__["cognitive_account_id"] = cognitive_account_id
            if content_filters is None and not opts.urn:
                raise TypeError("Missing required property 'content_filters'")
            __props__.__dict__["content_filters"] = content_filters
            __props__.__dict__["mode"] = mode
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
        super(AccountRaiPolicy, __self__).__init__(
            'azure:cognitive/accountRaiPolicy:AccountRaiPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            base_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
            cognitive_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            content_filters: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountRaiPolicyContentFilterArgs', 'AccountRaiPolicyContentFilterArgsDict']]]]] = None,
            mode: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'AccountRaiPolicy':
        """
        Get an existing AccountRaiPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] base_policy_name: The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] cognitive_account_id: The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AccountRaiPolicyContentFilterArgs', 'AccountRaiPolicyContentFilterArgsDict']]]] content_filters: A `content_filter` block as defined below.
        :param pulumi.Input[_builtins.str] mode: The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        :param pulumi.Input[_builtins.str] name: The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountRaiPolicyState.__new__(_AccountRaiPolicyState)

        __props__.__dict__["base_policy_name"] = base_policy_name
        __props__.__dict__["cognitive_account_id"] = cognitive_account_id
        __props__.__dict__["content_filters"] = content_filters
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        return AccountRaiPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="basePolicyName")
    def base_policy_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the base policy to use for this RAI Policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "base_policy_name")

    @_builtins.property
    @pulumi.getter(name="cognitiveAccountId")
    def cognitive_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Cognitive Service Account to which this RAI Policy should be associated. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cognitive_account_id")

    @_builtins.property
    @pulumi.getter(name="contentFilters")
    def content_filters(self) -> pulumi.Output[Sequence['outputs.AccountRaiPolicyContentFilter']]:
        """
        A `content_filter` block as defined below.
        """
        return pulumi.get(self, "content_filters")

    @_builtins.property
    @pulumi.getter
    def mode(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The mode of the RAI Policy. Possible values are `Default`, `Deferred`, `Blocking` or `Asynchronous_filter`.
        """
        return pulumi.get(self, "mode")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Cognitive Service Account RAI Policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

