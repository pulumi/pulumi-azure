# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ClusterManagedPrivateEndpointArgs', 'ClusterManagedPrivateEndpoint']

@pulumi.input_type
class ClusterManagedPrivateEndpointArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 group_id: pulumi.Input[str],
                 private_link_resource_id: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_resource_region: Optional[pulumi.Input[str]] = None,
                 request_message: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ClusterManagedPrivateEndpoint resource.
        :param pulumi.Input[str] cluster_name: The name of the Kusto Cluster. Changing this forces a new resource to be created.
        :param pulumi.Input[str] group_id: The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_id: The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_region: The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] request_message: The user request message.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "private_link_resource_id", private_link_resource_id)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_link_resource_region is not None:
            pulumi.set(__self__, "private_link_resource_region", private_link_resource_region)
        if request_message is not None:
            pulumi.set(__self__, "request_message", request_message)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        The name of the Kusto Cluster. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="privateLinkResourceId")
    def private_link_resource_id(self) -> pulumi.Input[str]:
        """
        The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "private_link_resource_id")

    @private_link_resource_id.setter
    def private_link_resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_link_resource_id", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateLinkResourceRegion")
    def private_link_resource_region(self) -> Optional[pulumi.Input[str]]:
        """
        The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "private_link_resource_region")

    @private_link_resource_region.setter
    def private_link_resource_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_resource_region", value)

    @property
    @pulumi.getter(name="requestMessage")
    def request_message(self) -> Optional[pulumi.Input[str]]:
        """
        The user request message.
        """
        return pulumi.get(self, "request_message")

    @request_message.setter
    def request_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_message", value)


@pulumi.input_type
class _ClusterManagedPrivateEndpointState:
    def __init__(__self__, *,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_resource_id: Optional[pulumi.Input[str]] = None,
                 private_link_resource_region: Optional[pulumi.Input[str]] = None,
                 request_message: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClusterManagedPrivateEndpoint resources.
        :param pulumi.Input[str] cluster_name: The name of the Kusto Cluster. Changing this forces a new resource to be created.
        :param pulumi.Input[str] group_id: The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_id: The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_region: The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] request_message: The user request message.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        """
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_link_resource_id is not None:
            pulumi.set(__self__, "private_link_resource_id", private_link_resource_id)
        if private_link_resource_region is not None:
            pulumi.set(__self__, "private_link_resource_region", private_link_resource_region)
        if request_message is not None:
            pulumi.set(__self__, "request_message", request_message)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Kusto Cluster. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateLinkResourceId")
    def private_link_resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "private_link_resource_id")

    @private_link_resource_id.setter
    def private_link_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_resource_id", value)

    @property
    @pulumi.getter(name="privateLinkResourceRegion")
    def private_link_resource_region(self) -> Optional[pulumi.Input[str]]:
        """
        The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "private_link_resource_region")

    @private_link_resource_region.setter
    def private_link_resource_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_resource_region", value)

    @property
    @pulumi.getter(name="requestMessage")
    def request_message(self) -> Optional[pulumi.Input[str]]:
        """
        The user request message.
        """
        return pulumi.get(self, "request_message")

    @request_message.setter
    def request_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_message", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)


class ClusterManagedPrivateEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_resource_id: Optional[pulumi.Input[str]] = None,
                 private_link_resource_region: Optional[pulumi.Input[str]] = None,
                 request_message: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Managed Private Endpoint for a Kusto Cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_cluster = azure.kusto.Cluster("exampleCluster",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku=azure.kusto.ClusterSkuArgs(
                name="Dev(No SLA)_Standard_D11_v2",
                capacity=1,
            ))
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_cluster_managed_private_endpoint = azure.kusto.ClusterManagedPrivateEndpoint("exampleClusterManagedPrivateEndpoint",
            resource_group_name=example_resource_group.name,
            cluster_name=example_cluster.name,
            private_link_resource_id=example_account.id,
            private_link_resource_region=example_account.location,
            group_id="blob",
            request_message="Please Approve")
        ```

        ## Import

        Managed Private Endpoint for a Kusto Cluster can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:kusto/clusterManagedPrivateEndpoint:ClusterManagedPrivateEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/Clusters/cluster1/managedPrivateEndpoints/managedPrivateEndpoint1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Kusto Cluster. Changing this forces a new resource to be created.
        :param pulumi.Input[str] group_id: The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_id: The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_region: The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] request_message: The user request message.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterManagedPrivateEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Managed Private Endpoint for a Kusto Cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_cluster = azure.kusto.Cluster("exampleCluster",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku=azure.kusto.ClusterSkuArgs(
                name="Dev(No SLA)_Standard_D11_v2",
                capacity=1,
            ))
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_cluster_managed_private_endpoint = azure.kusto.ClusterManagedPrivateEndpoint("exampleClusterManagedPrivateEndpoint",
            resource_group_name=example_resource_group.name,
            cluster_name=example_cluster.name,
            private_link_resource_id=example_account.id,
            private_link_resource_region=example_account.location,
            group_id="blob",
            request_message="Please Approve")
        ```

        ## Import

        Managed Private Endpoint for a Kusto Cluster can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:kusto/clusterManagedPrivateEndpoint:ClusterManagedPrivateEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/Clusters/cluster1/managedPrivateEndpoints/managedPrivateEndpoint1
        ```

        :param str resource_name: The name of the resource.
        :param ClusterManagedPrivateEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterManagedPrivateEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_resource_id: Optional[pulumi.Input[str]] = None,
                 private_link_resource_region: Optional[pulumi.Input[str]] = None,
                 request_message: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterManagedPrivateEndpointArgs.__new__(ClusterManagedPrivateEndpointArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["name"] = name
            if private_link_resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'private_link_resource_id'")
            __props__.__dict__["private_link_resource_id"] = private_link_resource_id
            __props__.__dict__["private_link_resource_region"] = private_link_resource_region
            __props__.__dict__["request_message"] = request_message
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        super(ClusterManagedPrivateEndpoint, __self__).__init__(
            'azure:kusto/clusterManagedPrivateEndpoint:ClusterManagedPrivateEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            private_link_resource_id: Optional[pulumi.Input[str]] = None,
            private_link_resource_region: Optional[pulumi.Input[str]] = None,
            request_message: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None) -> 'ClusterManagedPrivateEndpoint':
        """
        Get an existing ClusterManagedPrivateEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: The name of the Kusto Cluster. Changing this forces a new resource to be created.
        :param pulumi.Input[str] group_id: The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_id: The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] private_link_resource_region: The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] request_message: The user request message.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterManagedPrivateEndpointState.__new__(_ClusterManagedPrivateEndpointState)

        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["name"] = name
        __props__.__dict__["private_link_resource_id"] = private_link_resource_id
        __props__.__dict__["private_link_resource_region"] = private_link_resource_region
        __props__.__dict__["request_message"] = request_message
        __props__.__dict__["resource_group_name"] = resource_group_name
        return ClusterManagedPrivateEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        The name of the Kusto Cluster. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateLinkResourceId")
    def private_link_resource_id(self) -> pulumi.Output[str]:
        """
        The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "private_link_resource_id")

    @property
    @pulumi.getter(name="privateLinkResourceRegion")
    def private_link_resource_region(self) -> pulumi.Output[Optional[str]]:
        """
        The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "private_link_resource_region")

    @property
    @pulumi.getter(name="requestMessage")
    def request_message(self) -> pulumi.Output[Optional[str]]:
        """
        The user request message.
        """
        return pulumi.get(self, "request_message")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")
