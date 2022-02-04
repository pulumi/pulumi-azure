# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ResourceGroupExportArgs', 'ResourceGroupExport']

@pulumi.input_type
class ResourceGroupExportArgs:
    def __init__(__self__, *,
                 delivery_info: pulumi.Input['ResourceGroupExportDeliveryInfoArgs'],
                 query: pulumi.Input['ResourceGroupExportQueryArgs'],
                 recurrence_period_end: pulumi.Input[str],
                 recurrence_period_start: pulumi.Input[str],
                 recurrence_type: pulumi.Input[str],
                 resource_group_id: pulumi.Input[str],
                 active: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ResourceGroupExport resource.
        :param pulumi.Input['ResourceGroupExportDeliveryInfoArgs'] delivery_info: A `delivery_info` block as defined below.
        :param pulumi.Input['ResourceGroupExportQueryArgs'] query: A `query` block as defined below.
        :param pulumi.Input[str] recurrence_period_end: The date the export will stop capturing information.
        :param pulumi.Input[str] recurrence_period_start: The date the export will start capturing information.
        :param pulumi.Input[str] recurrence_type: How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group in which to export information.
        :param pulumi.Input[bool] active: Is the cost management export active? Default is `true`.
        :param pulumi.Input[str] name: Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "delivery_info", delivery_info)
        pulumi.set(__self__, "query", query)
        pulumi.set(__self__, "recurrence_period_end", recurrence_period_end)
        pulumi.set(__self__, "recurrence_period_start", recurrence_period_start)
        pulumi.set(__self__, "recurrence_type", recurrence_type)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="deliveryInfo")
    def delivery_info(self) -> pulumi.Input['ResourceGroupExportDeliveryInfoArgs']:
        """
        A `delivery_info` block as defined below.
        """
        return pulumi.get(self, "delivery_info")

    @delivery_info.setter
    def delivery_info(self, value: pulumi.Input['ResourceGroupExportDeliveryInfoArgs']):
        pulumi.set(self, "delivery_info", value)

    @property
    @pulumi.getter
    def query(self) -> pulumi.Input['ResourceGroupExportQueryArgs']:
        """
        A `query` block as defined below.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: pulumi.Input['ResourceGroupExportQueryArgs']):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter(name="recurrencePeriodEnd")
    def recurrence_period_end(self) -> pulumi.Input[str]:
        """
        The date the export will stop capturing information.
        """
        return pulumi.get(self, "recurrence_period_end")

    @recurrence_period_end.setter
    def recurrence_period_end(self, value: pulumi.Input[str]):
        pulumi.set(self, "recurrence_period_end", value)

    @property
    @pulumi.getter(name="recurrencePeriodStart")
    def recurrence_period_start(self) -> pulumi.Input[str]:
        """
        The date the export will start capturing information.
        """
        return pulumi.get(self, "recurrence_period_start")

    @recurrence_period_start.setter
    def recurrence_period_start(self, value: pulumi.Input[str]):
        pulumi.set(self, "recurrence_period_start", value)

    @property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> pulumi.Input[str]:
        """
        How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        """
        return pulumi.get(self, "recurrence_type")

    @recurrence_type.setter
    def recurrence_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "recurrence_type", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Input[str]:
        """
        The id of the resource group in which to export information.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Is the cost management export active? Default is `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ResourceGroupExportState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 delivery_info: Optional[pulumi.Input['ResourceGroupExportDeliveryInfoArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input['ResourceGroupExportQueryArgs']] = None,
                 recurrence_period_end: Optional[pulumi.Input[str]] = None,
                 recurrence_period_start: Optional[pulumi.Input[str]] = None,
                 recurrence_type: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ResourceGroupExport resources.
        :param pulumi.Input[bool] active: Is the cost management export active? Default is `true`.
        :param pulumi.Input['ResourceGroupExportDeliveryInfoArgs'] delivery_info: A `delivery_info` block as defined below.
        :param pulumi.Input[str] name: Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        :param pulumi.Input['ResourceGroupExportQueryArgs'] query: A `query` block as defined below.
        :param pulumi.Input[str] recurrence_period_end: The date the export will stop capturing information.
        :param pulumi.Input[str] recurrence_period_start: The date the export will start capturing information.
        :param pulumi.Input[str] recurrence_type: How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group in which to export information.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if delivery_info is not None:
            pulumi.set(__self__, "delivery_info", delivery_info)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query is not None:
            pulumi.set(__self__, "query", query)
        if recurrence_period_end is not None:
            pulumi.set(__self__, "recurrence_period_end", recurrence_period_end)
        if recurrence_period_start is not None:
            pulumi.set(__self__, "recurrence_period_start", recurrence_period_start)
        if recurrence_type is not None:
            pulumi.set(__self__, "recurrence_type", recurrence_type)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Is the cost management export active? Default is `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="deliveryInfo")
    def delivery_info(self) -> Optional[pulumi.Input['ResourceGroupExportDeliveryInfoArgs']]:
        """
        A `delivery_info` block as defined below.
        """
        return pulumi.get(self, "delivery_info")

    @delivery_info.setter
    def delivery_info(self, value: Optional[pulumi.Input['ResourceGroupExportDeliveryInfoArgs']]):
        pulumi.set(self, "delivery_info", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input['ResourceGroupExportQueryArgs']]:
        """
        A `query` block as defined below.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input['ResourceGroupExportQueryArgs']]):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter(name="recurrencePeriodEnd")
    def recurrence_period_end(self) -> Optional[pulumi.Input[str]]:
        """
        The date the export will stop capturing information.
        """
        return pulumi.get(self, "recurrence_period_end")

    @recurrence_period_end.setter
    def recurrence_period_end(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "recurrence_period_end", value)

    @property
    @pulumi.getter(name="recurrencePeriodStart")
    def recurrence_period_start(self) -> Optional[pulumi.Input[str]]:
        """
        The date the export will start capturing information.
        """
        return pulumi.get(self, "recurrence_period_start")

    @recurrence_period_start.setter
    def recurrence_period_start(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "recurrence_period_start", value)

    @property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> Optional[pulumi.Input[str]]:
        """
        How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        """
        return pulumi.get(self, "recurrence_type")

    @recurrence_type.setter
    def recurrence_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "recurrence_type", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the resource group in which to export information.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)


class ResourceGroupExport(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 delivery_info: Optional[pulumi.Input[pulumi.InputType['ResourceGroupExportDeliveryInfoArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[pulumi.InputType['ResourceGroupExportQueryArgs']]] = None,
                 recurrence_period_end: Optional[pulumi.Input[str]] = None,
                 recurrence_period_start: Optional[pulumi.Input[str]] = None,
                 recurrence_type: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Azure Cost Management Export for a Resource Group.

        !> **Note:** The `costmanagement.ResourceGroupExport` resource has been deprecated in favour of the `core.ResourceGroupCostManagementExport` resource and will be removed in v3.0 of the Azure Provider.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_resource_group_export = azure.costmanagement.ResourceGroupExport("exampleResourceGroupExport",
            resource_group_id=example_resource_group.id,
            recurrence_type="Monthly",
            recurrence_period_start="2020-08-18T00:00:00Z",
            recurrence_period_end="2020-09-18T00:00:00Z",
            delivery_info=azure.costmanagement.ResourceGroupExportDeliveryInfoArgs(
                storage_account_id=example_account.id,
                container_name="examplecontainer",
                root_folder_path="/root/updated",
            ),
            query=azure.costmanagement.ResourceGroupExportQueryArgs(
                type="Usage",
                time_frame="WeekToDate",
            ))
        ```

        ## Import

        Cost Management Export for a Resource Group can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:costmanagement/resourceGroupExport:ResourceGroupExport example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.CostManagement/exports/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Is the cost management export active? Default is `true`.
        :param pulumi.Input[pulumi.InputType['ResourceGroupExportDeliveryInfoArgs']] delivery_info: A `delivery_info` block as defined below.
        :param pulumi.Input[str] name: Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        :param pulumi.Input[pulumi.InputType['ResourceGroupExportQueryArgs']] query: A `query` block as defined below.
        :param pulumi.Input[str] recurrence_period_end: The date the export will stop capturing information.
        :param pulumi.Input[str] recurrence_period_start: The date the export will start capturing information.
        :param pulumi.Input[str] recurrence_type: How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group in which to export information.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceGroupExportArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure Cost Management Export for a Resource Group.

        !> **Note:** The `costmanagement.ResourceGroupExport` resource has been deprecated in favour of the `core.ResourceGroupCostManagementExport` resource and will be removed in v3.0 of the Azure Provider.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_resource_group_export = azure.costmanagement.ResourceGroupExport("exampleResourceGroupExport",
            resource_group_id=example_resource_group.id,
            recurrence_type="Monthly",
            recurrence_period_start="2020-08-18T00:00:00Z",
            recurrence_period_end="2020-09-18T00:00:00Z",
            delivery_info=azure.costmanagement.ResourceGroupExportDeliveryInfoArgs(
                storage_account_id=example_account.id,
                container_name="examplecontainer",
                root_folder_path="/root/updated",
            ),
            query=azure.costmanagement.ResourceGroupExportQueryArgs(
                type="Usage",
                time_frame="WeekToDate",
            ))
        ```

        ## Import

        Cost Management Export for a Resource Group can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:costmanagement/resourceGroupExport:ResourceGroupExport example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.CostManagement/exports/example
        ```

        :param str resource_name: The name of the resource.
        :param ResourceGroupExportArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceGroupExportArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 delivery_info: Optional[pulumi.Input[pulumi.InputType['ResourceGroupExportDeliveryInfoArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[pulumi.InputType['ResourceGroupExportQueryArgs']]] = None,
                 recurrence_period_end: Optional[pulumi.Input[str]] = None,
                 recurrence_period_start: Optional[pulumi.Input[str]] = None,
                 recurrence_type: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceGroupExportArgs.__new__(ResourceGroupExportArgs)

            __props__.__dict__["active"] = active
            if delivery_info is None and not opts.urn:
                raise TypeError("Missing required property 'delivery_info'")
            __props__.__dict__["delivery_info"] = delivery_info
            __props__.__dict__["name"] = name
            if query is None and not opts.urn:
                raise TypeError("Missing required property 'query'")
            __props__.__dict__["query"] = query
            if recurrence_period_end is None and not opts.urn:
                raise TypeError("Missing required property 'recurrence_period_end'")
            __props__.__dict__["recurrence_period_end"] = recurrence_period_end
            if recurrence_period_start is None and not opts.urn:
                raise TypeError("Missing required property 'recurrence_period_start'")
            __props__.__dict__["recurrence_period_start"] = recurrence_period_start
            if recurrence_type is None and not opts.urn:
                raise TypeError("Missing required property 'recurrence_type'")
            __props__.__dict__["recurrence_type"] = recurrence_type
            if resource_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_id'")
            __props__.__dict__["resource_group_id"] = resource_group_id
        super(ResourceGroupExport, __self__).__init__(
            'azure:costmanagement/resourceGroupExport:ResourceGroupExport',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            delivery_info: Optional[pulumi.Input[pulumi.InputType['ResourceGroupExportDeliveryInfoArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            query: Optional[pulumi.Input[pulumi.InputType['ResourceGroupExportQueryArgs']]] = None,
            recurrence_period_end: Optional[pulumi.Input[str]] = None,
            recurrence_period_start: Optional[pulumi.Input[str]] = None,
            recurrence_type: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None) -> 'ResourceGroupExport':
        """
        Get an existing ResourceGroupExport resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Is the cost management export active? Default is `true`.
        :param pulumi.Input[pulumi.InputType['ResourceGroupExportDeliveryInfoArgs']] delivery_info: A `delivery_info` block as defined below.
        :param pulumi.Input[str] name: Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        :param pulumi.Input[pulumi.InputType['ResourceGroupExportQueryArgs']] query: A `query` block as defined below.
        :param pulumi.Input[str] recurrence_period_end: The date the export will stop capturing information.
        :param pulumi.Input[str] recurrence_period_start: The date the export will start capturing information.
        :param pulumi.Input[str] recurrence_type: How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group in which to export information.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceGroupExportState.__new__(_ResourceGroupExportState)

        __props__.__dict__["active"] = active
        __props__.__dict__["delivery_info"] = delivery_info
        __props__.__dict__["name"] = name
        __props__.__dict__["query"] = query
        __props__.__dict__["recurrence_period_end"] = recurrence_period_end
        __props__.__dict__["recurrence_period_start"] = recurrence_period_start
        __props__.__dict__["recurrence_type"] = recurrence_type
        __props__.__dict__["resource_group_id"] = resource_group_id
        return ResourceGroupExport(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        """
        Is the cost management export active? Default is `true`.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="deliveryInfo")
    def delivery_info(self) -> pulumi.Output['outputs.ResourceGroupExportDeliveryInfo']:
        """
        A `delivery_info` block as defined below.
        """
        return pulumi.get(self, "delivery_info")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def query(self) -> pulumi.Output['outputs.ResourceGroupExportQuery']:
        """
        A `query` block as defined below.
        """
        return pulumi.get(self, "query")

    @property
    @pulumi.getter(name="recurrencePeriodEnd")
    def recurrence_period_end(self) -> pulumi.Output[str]:
        """
        The date the export will stop capturing information.
        """
        return pulumi.get(self, "recurrence_period_end")

    @property
    @pulumi.getter(name="recurrencePeriodStart")
    def recurrence_period_start(self) -> pulumi.Output[str]:
        """
        The date the export will start capturing information.
        """
        return pulumi.get(self, "recurrence_period_start")

    @property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> pulumi.Output[str]:
        """
        How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        """
        return pulumi.get(self, "recurrence_type")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The id of the resource group in which to export information.
        """
        return pulumi.get(self, "resource_group_id")
