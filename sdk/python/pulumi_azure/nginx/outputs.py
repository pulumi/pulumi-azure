# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
    'ConfigurationConfigFile',
    'ConfigurationProtectedFile',
    'DeploymentAutoScaleProfile',
    'DeploymentFrontendPrivate',
    'DeploymentFrontendPublic',
    'DeploymentIdentity',
    'DeploymentLoggingStorageAccount',
    'DeploymentNetworkInterface',
    'GetConfigurationConfigFileResult',
    'GetConfigurationProtectedFileResult',
    'GetDeploymentAutoScaleProfileResult',
    'GetDeploymentFrontendPrivateResult',
    'GetDeploymentFrontendPublicResult',
    'GetDeploymentIdentityResult',
    'GetDeploymentLoggingStorageAccountResult',
    'GetDeploymentNetworkInterfaceResult',
]

@pulumi.output_type
class ConfigurationConfigFile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "virtualPath":
            suggest = "virtual_path"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ConfigurationConfigFile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ConfigurationConfigFile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ConfigurationConfigFile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 content: builtins.str,
                 virtual_path: builtins.str):
        """
        :param builtins.str content: Specifies the base-64 encoded contents of this config file.
        :param builtins.str virtual_path: Specifies the path of this config file.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "virtual_path", virtual_path)

    @property
    @pulumi.getter
    def content(self) -> builtins.str:
        """
        Specifies the base-64 encoded contents of this config file.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="virtualPath")
    def virtual_path(self) -> builtins.str:
        """
        Specifies the path of this config file.
        """
        return pulumi.get(self, "virtual_path")


@pulumi.output_type
class ConfigurationProtectedFile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "virtualPath":
            suggest = "virtual_path"
        elif key == "contentHash":
            suggest = "content_hash"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ConfigurationProtectedFile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ConfigurationProtectedFile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ConfigurationProtectedFile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 content: builtins.str,
                 virtual_path: builtins.str,
                 content_hash: Optional[builtins.str] = None):
        """
        :param builtins.str content: Specifies the base-64 encoded contents of this config file (Sensitive).
        :param builtins.str virtual_path: Specifies the path of this config file.
        :param builtins.str content_hash: The hash of the contents of this configuration file prefixed by the algorithm used.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "virtual_path", virtual_path)
        if content_hash is not None:
            pulumi.set(__self__, "content_hash", content_hash)

    @property
    @pulumi.getter
    def content(self) -> builtins.str:
        """
        Specifies the base-64 encoded contents of this config file (Sensitive).
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="virtualPath")
    def virtual_path(self) -> builtins.str:
        """
        Specifies the path of this config file.
        """
        return pulumi.get(self, "virtual_path")

    @property
    @pulumi.getter(name="contentHash")
    def content_hash(self) -> Optional[builtins.str]:
        """
        The hash of the contents of this configuration file prefixed by the algorithm used.
        """
        return pulumi.get(self, "content_hash")


@pulumi.output_type
class DeploymentAutoScaleProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "maxCapacity":
            suggest = "max_capacity"
        elif key == "minCapacity":
            suggest = "min_capacity"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeploymentAutoScaleProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeploymentAutoScaleProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeploymentAutoScaleProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 max_capacity: builtins.int,
                 min_capacity: builtins.int,
                 name: builtins.str):
        """
        :param builtins.int min_capacity: Specify the minimum number of NGINX capacity units for this NGINX Deployment.
        :param builtins.str name: Specify the name of the autoscaling profile.
        """
        pulumi.set(__self__, "max_capacity", max_capacity)
        pulumi.set(__self__, "min_capacity", min_capacity)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="maxCapacity")
    def max_capacity(self) -> builtins.int:
        return pulumi.get(self, "max_capacity")

    @property
    @pulumi.getter(name="minCapacity")
    def min_capacity(self) -> builtins.int:
        """
        Specify the minimum number of NGINX capacity units for this NGINX Deployment.
        """
        return pulumi.get(self, "min_capacity")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Specify the name of the autoscaling profile.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class DeploymentFrontendPrivate(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "allocationMethod":
            suggest = "allocation_method"
        elif key == "ipAddress":
            suggest = "ip_address"
        elif key == "subnetId":
            suggest = "subnet_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeploymentFrontendPrivate. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeploymentFrontendPrivate.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeploymentFrontendPrivate.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 allocation_method: builtins.str,
                 ip_address: builtins.str,
                 subnet_id: builtins.str):
        """
        :param builtins.str allocation_method: Specify the method for allocating the private IP. Possible values are `Static` and `Dynamic`. Changing this forces a new NGINX Deployment to be created.
        :param builtins.str ip_address: Specify the private IP Address. Changing this forces a new NGINX Deployment to be created.
        :param builtins.str subnet_id: Specify the Subnet Resource ID for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        pulumi.set(__self__, "allocation_method", allocation_method)
        pulumi.set(__self__, "ip_address", ip_address)
        pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="allocationMethod")
    def allocation_method(self) -> builtins.str:
        """
        Specify the method for allocating the private IP. Possible values are `Static` and `Dynamic`. Changing this forces a new NGINX Deployment to be created.
        """
        return pulumi.get(self, "allocation_method")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> builtins.str:
        """
        Specify the private IP Address. Changing this forces a new NGINX Deployment to be created.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> builtins.str:
        """
        Specify the Subnet Resource ID for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        return pulumi.get(self, "subnet_id")


@pulumi.output_type
class DeploymentFrontendPublic(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ipAddresses":
            suggest = "ip_addresses"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeploymentFrontendPublic. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeploymentFrontendPublic.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeploymentFrontendPublic.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ip_addresses: Optional[Sequence[builtins.str]] = None):
        """
        :param Sequence[builtins.str] ip_addresses: Specifies a list of Public IP Resource ID to this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        if ip_addresses is not None:
            pulumi.set(__self__, "ip_addresses", ip_addresses)

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> Optional[Sequence[builtins.str]]:
        """
        Specifies a list of Public IP Resource ID to this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        return pulumi.get(self, "ip_addresses")


@pulumi.output_type
class DeploymentIdentity(dict):
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
            pulumi.log.warn(f"Key '{key}' not found in DeploymentIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeploymentIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeploymentIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: builtins.str,
                 identity_ids: Optional[Sequence[builtins.str]] = None,
                 principal_id: Optional[builtins.str] = None,
                 tenant_id: Optional[builtins.str] = None):
        """
        :param builtins.str type: Specifies the identity type of the NGINX Deployment. Possible values are `SystemAssigned`, `UserAssigned` or `SystemAssigned, UserAssigned`.
        :param Sequence[builtins.str] identity_ids: Specifies a list of user managed identity ids to be assigned.
               
               > **NOTE:** This is required when `type` is set to `UserAssigned`.
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
    def type(self) -> builtins.str:
        """
        Specifies the identity type of the NGINX Deployment. Possible values are `SystemAssigned`, `UserAssigned` or `SystemAssigned, UserAssigned`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Optional[Sequence[builtins.str]]:
        """
        Specifies a list of user managed identity ids to be assigned.

        > **NOTE:** This is required when `type` is set to `UserAssigned`.
        """
        return pulumi.get(self, "identity_ids")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "tenant_id")


@pulumi.output_type
class DeploymentLoggingStorageAccount(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "containerName":
            suggest = "container_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeploymentLoggingStorageAccount. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeploymentLoggingStorageAccount.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeploymentLoggingStorageAccount.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 container_name: Optional[builtins.str] = None,
                 name: Optional[builtins.str] = None):
        """
        :param builtins.str name: The name which should be used for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        if container_name is not None:
            pulumi.set(__self__, "container_name", container_name)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> Optional[builtins.str]:
        return pulumi.get(self, "container_name")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        """
        The name which should be used for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class DeploymentNetworkInterface(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "subnetId":
            suggest = "subnet_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeploymentNetworkInterface. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeploymentNetworkInterface.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeploymentNetworkInterface.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 subnet_id: builtins.str):
        """
        :param builtins.str subnet_id: Specify The Subnet Resource ID for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> builtins.str:
        """
        Specify The Subnet Resource ID for this NGINX Deployment. Changing this forces a new NGINX Deployment to be created.
        """
        return pulumi.get(self, "subnet_id")


@pulumi.output_type
class GetConfigurationConfigFileResult(dict):
    def __init__(__self__, *,
                 content: builtins.str,
                 virtual_path: builtins.str):
        """
        :param builtins.str content: The base-64 encoded contents of this configuration file.
        :param builtins.str virtual_path: The path of this configuration file.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "virtual_path", virtual_path)

    @property
    @pulumi.getter
    def content(self) -> builtins.str:
        """
        The base-64 encoded contents of this configuration file.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="virtualPath")
    def virtual_path(self) -> builtins.str:
        """
        The path of this configuration file.
        """
        return pulumi.get(self, "virtual_path")


@pulumi.output_type
class GetConfigurationProtectedFileResult(dict):
    def __init__(__self__, *,
                 content: builtins.str,
                 content_hash: builtins.str,
                 virtual_path: builtins.str):
        """
        :param builtins.str content: The base-64 encoded contents of this configuration file.
        :param builtins.str content_hash: The hash of the contents of this configuration file prefixed by the algorithm used.
        :param builtins.str virtual_path: The path of this configuration file.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "content_hash", content_hash)
        pulumi.set(__self__, "virtual_path", virtual_path)

    @property
    @pulumi.getter
    @_utilities.deprecated("""the `content` property is deprecated and will be removed in v5.0 of the AzureRM Provider.""")
    def content(self) -> builtins.str:
        """
        The base-64 encoded contents of this configuration file.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="contentHash")
    def content_hash(self) -> builtins.str:
        """
        The hash of the contents of this configuration file prefixed by the algorithm used.
        """
        return pulumi.get(self, "content_hash")

    @property
    @pulumi.getter(name="virtualPath")
    def virtual_path(self) -> builtins.str:
        """
        The path of this configuration file.
        """
        return pulumi.get(self, "virtual_path")


@pulumi.output_type
class GetDeploymentAutoScaleProfileResult(dict):
    def __init__(__self__, *,
                 max_capacity: builtins.int,
                 min_capacity: builtins.int,
                 name: builtins.str):
        """
        :param builtins.int max_capacity: The maximum number of NGINX capacity units for this NGINX Deployment.
        :param builtins.int min_capacity: The minimum number of NGINX capacity units for this NGINX Deployment.
        :param builtins.str name: The name of this NGINX Deployment.
        """
        pulumi.set(__self__, "max_capacity", max_capacity)
        pulumi.set(__self__, "min_capacity", min_capacity)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="maxCapacity")
    def max_capacity(self) -> builtins.int:
        """
        The maximum number of NGINX capacity units for this NGINX Deployment.
        """
        return pulumi.get(self, "max_capacity")

    @property
    @pulumi.getter(name="minCapacity")
    def min_capacity(self) -> builtins.int:
        """
        The minimum number of NGINX capacity units for this NGINX Deployment.
        """
        return pulumi.get(self, "min_capacity")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The name of this NGINX Deployment.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class GetDeploymentFrontendPrivateResult(dict):
    def __init__(__self__, *,
                 allocation_method: builtins.str,
                 ip_address: builtins.str,
                 subnet_id: builtins.str):
        """
        :param builtins.str allocation_method: The method of allocating the private IP to the NGINX Deployment.
        :param builtins.str ip_address: The list of Public IP Resource IDs for this NGINX Deployment.
        :param builtins.str subnet_id: The subnet resource ID of the NGINX Deployment.
        """
        pulumi.set(__self__, "allocation_method", allocation_method)
        pulumi.set(__self__, "ip_address", ip_address)
        pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="allocationMethod")
    def allocation_method(self) -> builtins.str:
        """
        The method of allocating the private IP to the NGINX Deployment.
        """
        return pulumi.get(self, "allocation_method")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> builtins.str:
        """
        The list of Public IP Resource IDs for this NGINX Deployment.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> builtins.str:
        """
        The subnet resource ID of the NGINX Deployment.
        """
        return pulumi.get(self, "subnet_id")


@pulumi.output_type
class GetDeploymentFrontendPublicResult(dict):
    def __init__(__self__, *,
                 ip_addresses: Sequence[builtins.str]):
        """
        :param Sequence[builtins.str] ip_addresses: The list of Public IP Resource IDs for this NGINX Deployment.
        """
        pulumi.set(__self__, "ip_addresses", ip_addresses)

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> Sequence[builtins.str]:
        """
        The list of Public IP Resource IDs for this NGINX Deployment.
        """
        return pulumi.get(self, "ip_addresses")


@pulumi.output_type
class GetDeploymentIdentityResult(dict):
    def __init__(__self__, *,
                 identity_ids: Sequence[builtins.str],
                 principal_id: builtins.str,
                 tenant_id: builtins.str,
                 type: builtins.str):
        """
        :param Sequence[builtins.str] identity_ids: List of identities attached to the NGINX Deployment.
        :param builtins.str type: Type of identity attached to the NGINX Deployment.
        """
        pulumi.set(__self__, "identity_ids", identity_ids)
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Sequence[builtins.str]:
        """
        List of identities attached to the NGINX Deployment.
        """
        return pulumi.get(self, "identity_ids")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> builtins.str:
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> builtins.str:
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        Type of identity attached to the NGINX Deployment.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetDeploymentLoggingStorageAccountResult(dict):
    def __init__(__self__, *,
                 container_name: builtins.str,
                 name: builtins.str):
        """
        :param builtins.str name: The name of this NGINX Deployment.
        """
        pulumi.set(__self__, "container_name", container_name)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> builtins.str:
        return pulumi.get(self, "container_name")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The name of this NGINX Deployment.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class GetDeploymentNetworkInterfaceResult(dict):
    def __init__(__self__, *,
                 subnet_id: builtins.str):
        """
        :param builtins.str subnet_id: The subnet resource ID of the NGINX Deployment.
        """
        pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> builtins.str:
        """
        The subnet resource ID of the NGINX Deployment.
        """
        return pulumi.get(self, "subnet_id")


