# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = [
    'PrivateCloudCircuit',
    'PrivateCloudManagementCluster',
    'GetPrivateCloudCircuitResult',
    'GetPrivateCloudManagementClusterResult',
]

@pulumi.output_type
class PrivateCloudCircuit(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "expressRouteId":
            suggest = "express_route_id"
        elif key == "expressRoutePrivatePeeringId":
            suggest = "express_route_private_peering_id"
        elif key == "primarySubnetCidr":
            suggest = "primary_subnet_cidr"
        elif key == "secondarySubnetCidr":
            suggest = "secondary_subnet_cidr"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in PrivateCloudCircuit. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        PrivateCloudCircuit.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        PrivateCloudCircuit.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 express_route_id: Optional[builtins.str] = None,
                 express_route_private_peering_id: Optional[builtins.str] = None,
                 primary_subnet_cidr: Optional[builtins.str] = None,
                 secondary_subnet_cidr: Optional[builtins.str] = None):
        """
        :param builtins.str express_route_id: The ID of the ExpressRoute Circuit.
        :param builtins.str express_route_private_peering_id: The ID of the ExpressRoute Circuit private peering.
        :param builtins.str primary_subnet_cidr: The CIDR of the primary subnet.
        :param builtins.str secondary_subnet_cidr: The CIDR of the secondary subnet.
        """
        if express_route_id is not None:
            pulumi.set(__self__, "express_route_id", express_route_id)
        if express_route_private_peering_id is not None:
            pulumi.set(__self__, "express_route_private_peering_id", express_route_private_peering_id)
        if primary_subnet_cidr is not None:
            pulumi.set(__self__, "primary_subnet_cidr", primary_subnet_cidr)
        if secondary_subnet_cidr is not None:
            pulumi.set(__self__, "secondary_subnet_cidr", secondary_subnet_cidr)

    @property
    @pulumi.getter(name="expressRouteId")
    def express_route_id(self) -> Optional[builtins.str]:
        """
        The ID of the ExpressRoute Circuit.
        """
        return pulumi.get(self, "express_route_id")

    @property
    @pulumi.getter(name="expressRoutePrivatePeeringId")
    def express_route_private_peering_id(self) -> Optional[builtins.str]:
        """
        The ID of the ExpressRoute Circuit private peering.
        """
        return pulumi.get(self, "express_route_private_peering_id")

    @property
    @pulumi.getter(name="primarySubnetCidr")
    def primary_subnet_cidr(self) -> Optional[builtins.str]:
        """
        The CIDR of the primary subnet.
        """
        return pulumi.get(self, "primary_subnet_cidr")

    @property
    @pulumi.getter(name="secondarySubnetCidr")
    def secondary_subnet_cidr(self) -> Optional[builtins.str]:
        """
        The CIDR of the secondary subnet.
        """
        return pulumi.get(self, "secondary_subnet_cidr")


@pulumi.output_type
class PrivateCloudManagementCluster(dict):
    def __init__(__self__, *,
                 size: builtins.int,
                 hosts: Optional[Sequence[builtins.str]] = None,
                 id: Optional[builtins.int] = None):
        """
        :param builtins.int size: The size of the management cluster. This field can not updated with `internet_connection_enabled` together.
        :param Sequence[builtins.str] hosts: A list of hosts in the management cluster.
        :param builtins.int id: The ID of the management cluster.
        """
        pulumi.set(__self__, "size", size)
        if hosts is not None:
            pulumi.set(__self__, "hosts", hosts)
        if id is not None:
            pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def size(self) -> builtins.int:
        """
        The size of the management cluster. This field can not updated with `internet_connection_enabled` together.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def hosts(self) -> Optional[Sequence[builtins.str]]:
        """
        A list of hosts in the management cluster.
        """
        return pulumi.get(self, "hosts")

    @property
    @pulumi.getter
    def id(self) -> Optional[builtins.int]:
        """
        The ID of the management cluster.
        """
        return pulumi.get(self, "id")


@pulumi.output_type
class GetPrivateCloudCircuitResult(dict):
    def __init__(__self__, *,
                 express_route_id: builtins.str,
                 express_route_private_peering_id: builtins.str,
                 primary_subnet_cidr: builtins.str,
                 secondary_subnet_cidr: builtins.str):
        """
        :param builtins.str express_route_id: The ID of the ExpressRoute Circuit.
        :param builtins.str express_route_private_peering_id: The ID of the ExpressRoute Circuit private peering.
        :param builtins.str primary_subnet_cidr: The CIDR of the primary subnet.
        :param builtins.str secondary_subnet_cidr: The CIDR of the secondary subnet.
        """
        pulumi.set(__self__, "express_route_id", express_route_id)
        pulumi.set(__self__, "express_route_private_peering_id", express_route_private_peering_id)
        pulumi.set(__self__, "primary_subnet_cidr", primary_subnet_cidr)
        pulumi.set(__self__, "secondary_subnet_cidr", secondary_subnet_cidr)

    @property
    @pulumi.getter(name="expressRouteId")
    def express_route_id(self) -> builtins.str:
        """
        The ID of the ExpressRoute Circuit.
        """
        return pulumi.get(self, "express_route_id")

    @property
    @pulumi.getter(name="expressRoutePrivatePeeringId")
    def express_route_private_peering_id(self) -> builtins.str:
        """
        The ID of the ExpressRoute Circuit private peering.
        """
        return pulumi.get(self, "express_route_private_peering_id")

    @property
    @pulumi.getter(name="primarySubnetCidr")
    def primary_subnet_cidr(self) -> builtins.str:
        """
        The CIDR of the primary subnet.
        """
        return pulumi.get(self, "primary_subnet_cidr")

    @property
    @pulumi.getter(name="secondarySubnetCidr")
    def secondary_subnet_cidr(self) -> builtins.str:
        """
        The CIDR of the secondary subnet.
        """
        return pulumi.get(self, "secondary_subnet_cidr")


@pulumi.output_type
class GetPrivateCloudManagementClusterResult(dict):
    def __init__(__self__, *,
                 hosts: Sequence[builtins.str],
                 id: builtins.int,
                 size: builtins.int):
        """
        :param Sequence[builtins.str] hosts: The list of the hosts in the management cluster.
        :param builtins.int id: The ID of the management cluster.
        :param builtins.int size: The size of the management cluster.
        """
        pulumi.set(__self__, "hosts", hosts)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "size", size)

    @property
    @pulumi.getter
    def hosts(self) -> Sequence[builtins.str]:
        """
        The list of the hosts in the management cluster.
        """
        return pulumi.get(self, "hosts")

    @property
    @pulumi.getter
    def id(self) -> builtins.int:
        """
        The ID of the management cluster.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def size(self) -> builtins.int:
        """
        The size of the management cluster.
        """
        return pulumi.get(self, "size")


