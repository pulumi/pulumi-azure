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

__all__ = ['Powershell72ModuleArgs', 'Powershell72Module']

@pulumi.input_type
class Powershell72ModuleArgs:
    def __init__(__self__, *,
                 automation_account_id: pulumi.Input[_builtins.str],
                 module_link: pulumi.Input['Powershell72ModuleModuleLinkArgs'],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Powershell72Module resource.
        :param pulumi.Input[_builtins.str] automation_account_id: The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        :param pulumi.Input['Powershell72ModuleModuleLinkArgs'] module_link: A `module_link` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Module. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "automation_account_id", automation_account_id)
        pulumi.set(__self__, "module_link", module_link)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="automationAccountId")
    def automation_account_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        """
        return pulumi.get(self, "automation_account_id")

    @automation_account_id.setter
    def automation_account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "automation_account_id", value)

    @_builtins.property
    @pulumi.getter(name="moduleLink")
    def module_link(self) -> pulumi.Input['Powershell72ModuleModuleLinkArgs']:
        """
        A `module_link` block as defined below.
        """
        return pulumi.get(self, "module_link")

    @module_link.setter
    def module_link(self, value: pulumi.Input['Powershell72ModuleModuleLinkArgs']):
        pulumi.set(self, "module_link", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Module. Changing this forces a new resource to be created.
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
class _Powershell72ModuleState:
    def __init__(__self__, *,
                 automation_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 module_link: Optional[pulumi.Input['Powershell72ModuleModuleLinkArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Powershell72Module resources.
        :param pulumi.Input[_builtins.str] automation_account_id: The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        :param pulumi.Input['Powershell72ModuleModuleLinkArgs'] module_link: A `module_link` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Module. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if automation_account_id is not None:
            pulumi.set(__self__, "automation_account_id", automation_account_id)
        if module_link is not None:
            pulumi.set(__self__, "module_link", module_link)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="automationAccountId")
    def automation_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        """
        return pulumi.get(self, "automation_account_id")

    @automation_account_id.setter
    def automation_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "automation_account_id", value)

    @_builtins.property
    @pulumi.getter(name="moduleLink")
    def module_link(self) -> Optional[pulumi.Input['Powershell72ModuleModuleLinkArgs']]:
        """
        A `module_link` block as defined below.
        """
        return pulumi.get(self, "module_link")

    @module_link.setter
    def module_link(self, value: Optional[pulumi.Input['Powershell72ModuleModuleLinkArgs']]):
        pulumi.set(self, "module_link", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Module. Changing this forces a new resource to be created.
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


@pulumi.type_token("azure:automation/powershell72Module:Powershell72Module")
class Powershell72Module(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automation_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 module_link: Optional[pulumi.Input[Union['Powershell72ModuleModuleLinkArgs', 'Powershell72ModuleModuleLinkArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Automation Powershell 7.2 Module.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.automation.Account("example",
            name="account1",
            location=example.location,
            resource_group_name=example.name,
            sku_name="Basic")
        example_powershell72_module = azure.automation.Powershell72Module("example",
            name="xActiveDirectory",
            automation_account_id=example_account.id,
            module_link={
                "uri": "https://devopsgallerystorage.blob.core.windows.net/packages/xactivedirectory.2.19.0.nupkg",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Automation`: 2023-11-01

        ## Import

        Automation Modules can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:automation/powershell72Module:Powershell72Module module1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/powerShell72Modules/module1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] automation_account_id: The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        :param pulumi.Input[Union['Powershell72ModuleModuleLinkArgs', 'Powershell72ModuleModuleLinkArgsDict']] module_link: A `module_link` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Module. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Powershell72ModuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Automation Powershell 7.2 Module.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.automation.Account("example",
            name="account1",
            location=example.location,
            resource_group_name=example.name,
            sku_name="Basic")
        example_powershell72_module = azure.automation.Powershell72Module("example",
            name="xActiveDirectory",
            automation_account_id=example_account.id,
            module_link={
                "uri": "https://devopsgallerystorage.blob.core.windows.net/packages/xactivedirectory.2.19.0.nupkg",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Automation`: 2023-11-01

        ## Import

        Automation Modules can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:automation/powershell72Module:Powershell72Module module1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/powerShell72Modules/module1
        ```

        :param str resource_name: The name of the resource.
        :param Powershell72ModuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(Powershell72ModuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automation_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 module_link: Optional[pulumi.Input[Union['Powershell72ModuleModuleLinkArgs', 'Powershell72ModuleModuleLinkArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = Powershell72ModuleArgs.__new__(Powershell72ModuleArgs)

            if automation_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'automation_account_id'")
            __props__.__dict__["automation_account_id"] = automation_account_id
            if module_link is None and not opts.urn:
                raise TypeError("Missing required property 'module_link'")
            __props__.__dict__["module_link"] = module_link
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
        super(Powershell72Module, __self__).__init__(
            'azure:automation/powershell72Module:Powershell72Module',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            automation_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            module_link: Optional[pulumi.Input[Union['Powershell72ModuleModuleLinkArgs', 'Powershell72ModuleModuleLinkArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'Powershell72Module':
        """
        Get an existing Powershell72Module resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] automation_account_id: The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        :param pulumi.Input[Union['Powershell72ModuleModuleLinkArgs', 'Powershell72ModuleModuleLinkArgsDict']] module_link: A `module_link` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Module. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _Powershell72ModuleState.__new__(_Powershell72ModuleState)

        __props__.__dict__["automation_account_id"] = automation_account_id
        __props__.__dict__["module_link"] = module_link
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        return Powershell72Module(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="automationAccountId")
    def automation_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
        """
        return pulumi.get(self, "automation_account_id")

    @_builtins.property
    @pulumi.getter(name="moduleLink")
    def module_link(self) -> pulumi.Output['outputs.Powershell72ModuleModuleLink']:
        """
        A `module_link` block as defined below.
        """
        return pulumi.get(self, "module_link")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Module. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

