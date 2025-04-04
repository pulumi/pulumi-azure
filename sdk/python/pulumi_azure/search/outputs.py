# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'ServiceIdentity',
    'ServiceQueryKey',
    'GetServiceIdentityResult',
    'GetServiceQueryKeyResult',
]

@pulumi.output_type
class ServiceIdentity(dict):
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
            pulumi.log.warn(f"Key '{key}' not found in ServiceIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ServiceIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ServiceIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: str,
                 identity_ids: Optional[Sequence[str]] = None,
                 principal_id: Optional[str] = None,
                 tenant_id: Optional[str] = None):
        """
        :param str type: Specifies the type of Managed Service Identity that should be configured on this Search Service. Possible values are `SystemAssigned`, `UserAssigned`, and `SystemAssigned, UserAssigned`.
        :param Sequence[str] identity_ids: Specifies the list of User Assigned Managed Service Identity IDs which should be assigned to this Search Service.
        :param str principal_id: The Principal ID associated with this Managed Service Identity.
        :param str tenant_id: The Tenant ID associated with this Managed Service Identity.
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
        Specifies the type of Managed Service Identity that should be configured on this Search Service. Possible values are `SystemAssigned`, `UserAssigned`, and `SystemAssigned, UserAssigned`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Optional[Sequence[str]]:
        """
        Specifies the list of User Assigned Managed Service Identity IDs which should be assigned to this Search Service.
        """
        return pulumi.get(self, "identity_ids")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[str]:
        """
        The Principal ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[str]:
        """
        The Tenant ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "tenant_id")


@pulumi.output_type
class ServiceQueryKey(dict):
    def __init__(__self__, *,
                 key: Optional[str] = None,
                 name: Optional[str] = None):
        """
        :param str key: The value of this Query Key.
        :param str name: The Name which should be used for this Search Service. Changing this forces a new Search Service to be created.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def key(self) -> Optional[str]:
        """
        The value of this Query Key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The Name which should be used for this Search Service. Changing this forces a new Search Service to be created.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class GetServiceIdentityResult(dict):
    def __init__(__self__, *,
                 identity_ids: Sequence[str],
                 principal_id: str,
                 tenant_id: str,
                 type: str):
        """
        :param Sequence[str] identity_ids: The list of User Assigned Managed Service Identity IDs assigned to this Search Service.
        :param str principal_id: The Principal ID associated with this Managed Service Identity.
        :param str tenant_id: The Tenant ID associated with this Managed Service Identity.
        :param str type: The identity type of this Managed Service Identity.
        """
        pulumi.set(__self__, "identity_ids", identity_ids)
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Sequence[str]:
        """
        The list of User Assigned Managed Service Identity IDs assigned to this Search Service.
        """
        return pulumi.get(self, "identity_ids")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> str:
        """
        The Principal ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        The Tenant ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The identity type of this Managed Service Identity.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetServiceQueryKeyResult(dict):
    def __init__(__self__, *,
                 key: str,
                 name: str):
        """
        :param str key: The value of this Query Key.
        :param str name: The Name of the Search Service.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The value of this Query Key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Name of the Search Service.
        """
        return pulumi.get(self, "name")


