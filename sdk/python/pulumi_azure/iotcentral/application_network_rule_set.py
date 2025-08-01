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

__all__ = ['ApplicationNetworkRuleSetArgs', 'ApplicationNetworkRuleSet']

@pulumi.input_type
class ApplicationNetworkRuleSetArgs:
    def __init__(__self__, *,
                 iotcentral_application_id: pulumi.Input[_builtins.str],
                 apply_to_device: Optional[pulumi.Input[_builtins.bool]] = None,
                 default_action: Optional[pulumi.Input[_builtins.str]] = None,
                 ip_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]]] = None):
        """
        The set of arguments for constructing a ApplicationNetworkRuleSet resource.
        :param pulumi.Input[_builtins.str] iotcentral_application_id: The ID of the IoT Central Application. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] apply_to_device: Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        :param pulumi.Input[_builtins.str] default_action: Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]] ip_rules: One or more `ip_rule` blocks as defined below.
        """
        pulumi.set(__self__, "iotcentral_application_id", iotcentral_application_id)
        if apply_to_device is not None:
            pulumi.set(__self__, "apply_to_device", apply_to_device)
        if default_action is not None:
            pulumi.set(__self__, "default_action", default_action)
        if ip_rules is not None:
            pulumi.set(__self__, "ip_rules", ip_rules)

    @_builtins.property
    @pulumi.getter(name="iotcentralApplicationId")
    def iotcentral_application_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the IoT Central Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iotcentral_application_id")

    @iotcentral_application_id.setter
    def iotcentral_application_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "iotcentral_application_id", value)

    @_builtins.property
    @pulumi.getter(name="applyToDevice")
    def apply_to_device(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        """
        return pulumi.get(self, "apply_to_device")

    @apply_to_device.setter
    def apply_to_device(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "apply_to_device", value)

    @_builtins.property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        """
        return pulumi.get(self, "default_action")

    @default_action.setter
    def default_action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_action", value)

    @_builtins.property
    @pulumi.getter(name="ipRules")
    def ip_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]]]:
        """
        One or more `ip_rule` blocks as defined below.
        """
        return pulumi.get(self, "ip_rules")

    @ip_rules.setter
    def ip_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]]]):
        pulumi.set(self, "ip_rules", value)


@pulumi.input_type
class _ApplicationNetworkRuleSetState:
    def __init__(__self__, *,
                 apply_to_device: Optional[pulumi.Input[_builtins.bool]] = None,
                 default_action: Optional[pulumi.Input[_builtins.str]] = None,
                 iotcentral_application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ip_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering ApplicationNetworkRuleSet resources.
        :param pulumi.Input[_builtins.bool] apply_to_device: Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        :param pulumi.Input[_builtins.str] default_action: Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        :param pulumi.Input[_builtins.str] iotcentral_application_id: The ID of the IoT Central Application. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]] ip_rules: One or more `ip_rule` blocks as defined below.
        """
        if apply_to_device is not None:
            pulumi.set(__self__, "apply_to_device", apply_to_device)
        if default_action is not None:
            pulumi.set(__self__, "default_action", default_action)
        if iotcentral_application_id is not None:
            pulumi.set(__self__, "iotcentral_application_id", iotcentral_application_id)
        if ip_rules is not None:
            pulumi.set(__self__, "ip_rules", ip_rules)

    @_builtins.property
    @pulumi.getter(name="applyToDevice")
    def apply_to_device(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        """
        return pulumi.get(self, "apply_to_device")

    @apply_to_device.setter
    def apply_to_device(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "apply_to_device", value)

    @_builtins.property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        """
        return pulumi.get(self, "default_action")

    @default_action.setter
    def default_action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_action", value)

    @_builtins.property
    @pulumi.getter(name="iotcentralApplicationId")
    def iotcentral_application_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the IoT Central Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iotcentral_application_id")

    @iotcentral_application_id.setter
    def iotcentral_application_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "iotcentral_application_id", value)

    @_builtins.property
    @pulumi.getter(name="ipRules")
    def ip_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]]]:
        """
        One or more `ip_rule` blocks as defined below.
        """
        return pulumi.get(self, "ip_rules")

    @ip_rules.setter
    def ip_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationNetworkRuleSetIpRuleArgs']]]]):
        pulumi.set(self, "ip_rules", value)


@pulumi.type_token("azure:iotcentral/applicationNetworkRuleSet:ApplicationNetworkRuleSet")
class ApplicationNetworkRuleSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apply_to_device: Optional[pulumi.Input[_builtins.bool]] = None,
                 default_action: Optional[pulumi.Input[_builtins.str]] = None,
                 iotcentral_application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ip_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplicationNetworkRuleSetIpRuleArgs', 'ApplicationNetworkRuleSetIpRuleArgsDict']]]]] = None,
                 __props__=None):
        """
        Manages an IoT Central Application Network Rule Set.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resource",
            location="West Europe")
        example_application = azure.iotcentral.Application("example",
            name="example-iotcentral-app",
            resource_group_name=example.name,
            location=example.location,
            sub_domain="example-iotcentral-app-subdomain",
            display_name="example-iotcentral-app-display-name",
            sku="ST1",
            tags={
                "Foo": "Bar",
            })
        example_application_network_rule_set = azure.iotcentral.ApplicationNetworkRuleSet("example",
            iotcentral_application_id=example_application.id,
            ip_rules=[
                {
                    "name": "rule1",
                    "ip_mask": "10.0.1.0/24",
                },
                {
                    "name": "rule2",
                    "ip_mask": "10.1.1.0/24",
                },
            ])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.IoTCentral`: 2021-11-01-preview

        ## Import

        IoT Central Application Network Rule Sets can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:iotcentral/applicationNetworkRuleSet:ApplicationNetworkRuleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.IoTCentral/iotApps/app1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] apply_to_device: Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        :param pulumi.Input[_builtins.str] default_action: Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        :param pulumi.Input[_builtins.str] iotcentral_application_id: The ID of the IoT Central Application. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplicationNetworkRuleSetIpRuleArgs', 'ApplicationNetworkRuleSetIpRuleArgsDict']]]] ip_rules: One or more `ip_rule` blocks as defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationNetworkRuleSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an IoT Central Application Network Rule Set.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resource",
            location="West Europe")
        example_application = azure.iotcentral.Application("example",
            name="example-iotcentral-app",
            resource_group_name=example.name,
            location=example.location,
            sub_domain="example-iotcentral-app-subdomain",
            display_name="example-iotcentral-app-display-name",
            sku="ST1",
            tags={
                "Foo": "Bar",
            })
        example_application_network_rule_set = azure.iotcentral.ApplicationNetworkRuleSet("example",
            iotcentral_application_id=example_application.id,
            ip_rules=[
                {
                    "name": "rule1",
                    "ip_mask": "10.0.1.0/24",
                },
                {
                    "name": "rule2",
                    "ip_mask": "10.1.1.0/24",
                },
            ])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.IoTCentral`: 2021-11-01-preview

        ## Import

        IoT Central Application Network Rule Sets can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:iotcentral/applicationNetworkRuleSet:ApplicationNetworkRuleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.IoTCentral/iotApps/app1
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationNetworkRuleSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationNetworkRuleSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apply_to_device: Optional[pulumi.Input[_builtins.bool]] = None,
                 default_action: Optional[pulumi.Input[_builtins.str]] = None,
                 iotcentral_application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ip_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplicationNetworkRuleSetIpRuleArgs', 'ApplicationNetworkRuleSetIpRuleArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationNetworkRuleSetArgs.__new__(ApplicationNetworkRuleSetArgs)

            __props__.__dict__["apply_to_device"] = apply_to_device
            __props__.__dict__["default_action"] = default_action
            if iotcentral_application_id is None and not opts.urn:
                raise TypeError("Missing required property 'iotcentral_application_id'")
            __props__.__dict__["iotcentral_application_id"] = iotcentral_application_id
            __props__.__dict__["ip_rules"] = ip_rules
        super(ApplicationNetworkRuleSet, __self__).__init__(
            'azure:iotcentral/applicationNetworkRuleSet:ApplicationNetworkRuleSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            apply_to_device: Optional[pulumi.Input[_builtins.bool]] = None,
            default_action: Optional[pulumi.Input[_builtins.str]] = None,
            iotcentral_application_id: Optional[pulumi.Input[_builtins.str]] = None,
            ip_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplicationNetworkRuleSetIpRuleArgs', 'ApplicationNetworkRuleSetIpRuleArgsDict']]]]] = None) -> 'ApplicationNetworkRuleSet':
        """
        Get an existing ApplicationNetworkRuleSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] apply_to_device: Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        :param pulumi.Input[_builtins.str] default_action: Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        :param pulumi.Input[_builtins.str] iotcentral_application_id: The ID of the IoT Central Application. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplicationNetworkRuleSetIpRuleArgs', 'ApplicationNetworkRuleSetIpRuleArgsDict']]]] ip_rules: One or more `ip_rule` blocks as defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationNetworkRuleSetState.__new__(_ApplicationNetworkRuleSetState)

        __props__.__dict__["apply_to_device"] = apply_to_device
        __props__.__dict__["default_action"] = default_action
        __props__.__dict__["iotcentral_application_id"] = iotcentral_application_id
        __props__.__dict__["ip_rules"] = ip_rules
        return ApplicationNetworkRuleSet(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="applyToDevice")
    def apply_to_device(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether these IP Rules apply for device connectivity to IoT Hub and Device Provisioning Service associated with this IoT Central Application. Possible values are `true`, `false`. Defaults to `true`
        """
        return pulumi.get(self, "apply_to_device")

    @_builtins.property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the default action for the IoT Central Application Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        """
        return pulumi.get(self, "default_action")

    @_builtins.property
    @pulumi.getter(name="iotcentralApplicationId")
    def iotcentral_application_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the IoT Central Application. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iotcentral_application_id")

    @_builtins.property
    @pulumi.getter(name="ipRules")
    def ip_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ApplicationNetworkRuleSetIpRule']]]:
        """
        One or more `ip_rule` blocks as defined below.
        """
        return pulumi.get(self, "ip_rules")

