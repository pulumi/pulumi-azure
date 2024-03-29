# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ServerIdentity',
]

@pulumi.output_type
class ServerIdentity(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "identityIds":
            suggest = "identity_ids"
        elif key == "principalId":
            suggest = "principal_id"
        elif key == "tenantId":
            suggest = "tenant_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ServerIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ServerIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ServerIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: str,
                 identity_ids: Optional[Sequence[str]] = None,
                 principal_id: Optional[str] = None,
                 tenant_id: Optional[str] = None):
        """
        :param str type: Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
        :param Sequence[str] identity_ids: Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
        :param str principal_id: The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
        :param str tenant_id: The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
        """
        pulumi.set(__self__, "type", type)
        if identity_ids is not None:
            pulumi.set(__self__, "identity_ids", identity_ids)
        if principal_id is not None:
            pulumi.set(__self__, "principal_id", principal_id)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Optional[Sequence[str]]:
        """
        Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
        """
        return pulumi.get(self, "identity_ids")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[str]:
        """
        The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[str]:
        """
        The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
        """
        return pulumi.get(self, "tenant_id")


