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
    'ApplicationPlan',
    'DefinitionAuthorization',
]

@pulumi.output_type
class ApplicationPlan(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "promotionCode":
            suggest = "promotion_code"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ApplicationPlan. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ApplicationPlan.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ApplicationPlan.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: builtins.str,
                 product: builtins.str,
                 publisher: builtins.str,
                 version: builtins.str,
                 promotion_code: Optional[builtins.str] = None):
        """
        :param builtins.str name: Specifies the name of the plan from the marketplace. Changing this forces a new resource to be created.
        :param builtins.str product: Specifies the product of the plan from the marketplace. Changing this forces a new resource to be created.
        :param builtins.str publisher: Specifies the publisher of the plan. Changing this forces a new resource to be created.
        :param builtins.str version: Specifies the version of the plan from the marketplace. Changing this forces a new resource to be created.
        :param builtins.str promotion_code: Specifies the promotion code to use with the plan. Changing this forces a new resource to be created.
               
               > **Note:** When `plan` is specified, legal terms must be accepted for this item on this subscription before creating the Managed Application. The `marketplace.Agreement` resource or AZ CLI tool can be used to do this.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "product", product)
        pulumi.set(__self__, "publisher", publisher)
        pulumi.set(__self__, "version", version)
        if promotion_code is not None:
            pulumi.set(__self__, "promotion_code", promotion_code)

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Specifies the name of the plan from the marketplace. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def product(self) -> builtins.str:
        """
        Specifies the product of the plan from the marketplace. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "product")

    @property
    @pulumi.getter
    def publisher(self) -> builtins.str:
        """
        Specifies the publisher of the plan. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "publisher")

    @property
    @pulumi.getter
    def version(self) -> builtins.str:
        """
        Specifies the version of the plan from the marketplace. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="promotionCode")
    def promotion_code(self) -> Optional[builtins.str]:
        """
        Specifies the promotion code to use with the plan. Changing this forces a new resource to be created.

        > **Note:** When `plan` is specified, legal terms must be accepted for this item on this subscription before creating the Managed Application. The `marketplace.Agreement` resource or AZ CLI tool can be used to do this.
        """
        return pulumi.get(self, "promotion_code")


@pulumi.output_type
class DefinitionAuthorization(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "roleDefinitionId":
            suggest = "role_definition_id"
        elif key == "servicePrincipalId":
            suggest = "service_principal_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DefinitionAuthorization. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DefinitionAuthorization.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DefinitionAuthorization.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 role_definition_id: builtins.str,
                 service_principal_id: builtins.str):
        """
        :param builtins.str role_definition_id: Specifies a role definition identifier for the provider. This role will define all the permissions that the provider must have on the managed application's container resource group. This role definition cannot have permission to delete the resource group.
        :param builtins.str service_principal_id: Specifies a service principal identifier for the provider. This is the identity that the provider will use to call ARM to manage the managed application resources.
        """
        pulumi.set(__self__, "role_definition_id", role_definition_id)
        pulumi.set(__self__, "service_principal_id", service_principal_id)

    @property
    @pulumi.getter(name="roleDefinitionId")
    def role_definition_id(self) -> builtins.str:
        """
        Specifies a role definition identifier for the provider. This role will define all the permissions that the provider must have on the managed application's container resource group. This role definition cannot have permission to delete the resource group.
        """
        return pulumi.get(self, "role_definition_id")

    @property
    @pulumi.getter(name="servicePrincipalId")
    def service_principal_id(self) -> builtins.str:
        """
        Specifies a service principal identifier for the provider. This is the identity that the provider will use to call ARM to manage the managed application resources.
        """
        return pulumi.get(self, "service_principal_id")


