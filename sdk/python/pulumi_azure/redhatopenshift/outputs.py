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

__all__ = [
    'ClusterApiServerProfile',
    'ClusterClusterProfile',
    'ClusterIngressProfile',
    'ClusterMainProfile',
    'ClusterNetworkProfile',
    'ClusterServicePrincipal',
    'ClusterWorkerProfile',
]

@pulumi.output_type
class ClusterApiServerProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ipAddress":
            suggest = "ip_address"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterApiServerProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterApiServerProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterApiServerProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 visibility: _builtins.str,
                 ip_address: Optional[_builtins.str] = None,
                 url: Optional[_builtins.str] = None):
        """
        :param _builtins.str visibility: Cluster API server visibility. Supported values are `Public` and `Private`. Changing this forces a new resource to be created.
        :param _builtins.str ip_address: The IP Address the Ingress Profile is associated with.
        :param _builtins.str url: The URL the API Server Profile is associated with.
        """
        pulumi.set(__self__, "visibility", visibility)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @_builtins.property
    @pulumi.getter
    def visibility(self) -> _builtins.str:
        """
        Cluster API server visibility. Supported values are `Public` and `Private`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "visibility")

    @_builtins.property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[_builtins.str]:
        """
        The IP Address the Ingress Profile is associated with.
        """
        return pulumi.get(self, "ip_address")

    @_builtins.property
    @pulumi.getter
    def url(self) -> Optional[_builtins.str]:
        """
        The URL the API Server Profile is associated with.
        """
        return pulumi.get(self, "url")


@pulumi.output_type
class ClusterClusterProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "fipsEnabled":
            suggest = "fips_enabled"
        elif key == "managedResourceGroupName":
            suggest = "managed_resource_group_name"
        elif key == "pullSecret":
            suggest = "pull_secret"
        elif key == "resourceGroupId":
            suggest = "resource_group_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterClusterProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterClusterProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterClusterProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 domain: _builtins.str,
                 version: _builtins.str,
                 fips_enabled: Optional[_builtins.bool] = None,
                 managed_resource_group_name: Optional[_builtins.str] = None,
                 pull_secret: Optional[_builtins.str] = None,
                 resource_group_id: Optional[_builtins.str] = None):
        """
        :param _builtins.str domain: The custom domain for the cluster. For more info, see [Prepare a custom domain for your cluster](https://docs.microsoft.com/azure/openshift/tutorial-create-cluster#prepare-a-custom-domain-for-your-cluster-optional). Changing this forces a new resource to be created.
        :param _builtins.str version: The version of the OpenShift cluster. Available versions can be found with the Azure CLI command `az aro get-versions --location <region>`. Changing this forces a new resource to be created.
        :param _builtins.bool fips_enabled: Whether Federal Information Processing Standard (FIPS) validated cryptographic modules are used. Defaults to `false`. Changing this forces a new resource to be created.
        :param _builtins.str managed_resource_group_name: The name of a Resource Group which will be created to host VMs of Azure Red Hat OpenShift Cluster. The value cannot contain uppercase characters. Defaults to `aro-{domain}`. Changing this forces a new resource to be created.
        :param _builtins.str pull_secret: The Red Hat pull secret for the cluster. For more info, see [Get a Red Hat pull secret](https://learn.microsoft.com/azure/openshift/tutorial-create-cluster#get-a-red-hat-pull-secret-optional). Changing this forces a new resource to be created.
        :param _builtins.str resource_group_id: The resource group that the cluster profile is attached to.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "version", version)
        if fips_enabled is not None:
            pulumi.set(__self__, "fips_enabled", fips_enabled)
        if managed_resource_group_name is not None:
            pulumi.set(__self__, "managed_resource_group_name", managed_resource_group_name)
        if pull_secret is not None:
            pulumi.set(__self__, "pull_secret", pull_secret)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)

    @_builtins.property
    @pulumi.getter
    def domain(self) -> _builtins.str:
        """
        The custom domain for the cluster. For more info, see [Prepare a custom domain for your cluster](https://docs.microsoft.com/azure/openshift/tutorial-create-cluster#prepare-a-custom-domain-for-your-cluster-optional). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "domain")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.str:
        """
        The version of the OpenShift cluster. Available versions can be found with the Azure CLI command `az aro get-versions --location <region>`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "version")

    @_builtins.property
    @pulumi.getter(name="fipsEnabled")
    def fips_enabled(self) -> Optional[_builtins.bool]:
        """
        Whether Federal Information Processing Standard (FIPS) validated cryptographic modules are used. Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "fips_enabled")

    @_builtins.property
    @pulumi.getter(name="managedResourceGroupName")
    def managed_resource_group_name(self) -> Optional[_builtins.str]:
        """
        The name of a Resource Group which will be created to host VMs of Azure Red Hat OpenShift Cluster. The value cannot contain uppercase characters. Defaults to `aro-{domain}`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_resource_group_name")

    @_builtins.property
    @pulumi.getter(name="pullSecret")
    def pull_secret(self) -> Optional[_builtins.str]:
        """
        The Red Hat pull secret for the cluster. For more info, see [Get a Red Hat pull secret](https://learn.microsoft.com/azure/openshift/tutorial-create-cluster#get-a-red-hat-pull-secret-optional). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "pull_secret")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[_builtins.str]:
        """
        The resource group that the cluster profile is attached to.
        """
        return pulumi.get(self, "resource_group_id")


@pulumi.output_type
class ClusterIngressProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ipAddress":
            suggest = "ip_address"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterIngressProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterIngressProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterIngressProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 visibility: _builtins.str,
                 ip_address: Optional[_builtins.str] = None,
                 name: Optional[_builtins.str] = None):
        """
        :param _builtins.str visibility: Cluster Ingress visibility. Supported values are `Public` and `Private`. Changing this forces a new resource to be created.
        :param _builtins.str ip_address: The IP Address the Ingress Profile is associated with.
        :param _builtins.str name: The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "visibility", visibility)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def visibility(self) -> _builtins.str:
        """
        Cluster Ingress visibility. Supported values are `Public` and `Private`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "visibility")

    @_builtins.property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[_builtins.str]:
        """
        The IP Address the Ingress Profile is associated with.
        """
        return pulumi.get(self, "ip_address")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        """
        The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class ClusterMainProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "subnetId":
            suggest = "subnet_id"
        elif key == "vmSize":
            suggest = "vm_size"
        elif key == "diskEncryptionSetId":
            suggest = "disk_encryption_set_id"
        elif key == "encryptionAtHostEnabled":
            suggest = "encryption_at_host_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterMainProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterMainProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterMainProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 subnet_id: _builtins.str,
                 vm_size: _builtins.str,
                 disk_encryption_set_id: Optional[_builtins.str] = None,
                 encryption_at_host_enabled: Optional[_builtins.bool] = None):
        """
        :param _builtins.str subnet_id: The ID of the subnet where main nodes will be hosted. Changing this forces a new resource to be created.
        :param _builtins.str vm_size: The size of the Virtual Machines for the main nodes. Changing this forces a new resource to be created.
        :param _builtins.str disk_encryption_set_id: The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
        :param _builtins.bool encryption_at_host_enabled: Whether main virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.
               
               > **Note:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
        """
        pulumi.set(__self__, "subnet_id", subnet_id)
        pulumi.set(__self__, "vm_size", vm_size)
        if disk_encryption_set_id is not None:
            pulumi.set(__self__, "disk_encryption_set_id", disk_encryption_set_id)
        if encryption_at_host_enabled is not None:
            pulumi.set(__self__, "encryption_at_host_enabled", encryption_at_host_enabled)

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> _builtins.str:
        """
        The ID of the subnet where main nodes will be hosted. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "subnet_id")

    @_builtins.property
    @pulumi.getter(name="vmSize")
    def vm_size(self) -> _builtins.str:
        """
        The size of the Virtual Machines for the main nodes. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vm_size")

    @_builtins.property
    @pulumi.getter(name="diskEncryptionSetId")
    def disk_encryption_set_id(self) -> Optional[_builtins.str]:
        """
        The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "disk_encryption_set_id")

    @_builtins.property
    @pulumi.getter(name="encryptionAtHostEnabled")
    def encryption_at_host_enabled(self) -> Optional[_builtins.bool]:
        """
        Whether main virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.

        > **Note:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
        """
        return pulumi.get(self, "encryption_at_host_enabled")


@pulumi.output_type
class ClusterNetworkProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "podCidr":
            suggest = "pod_cidr"
        elif key == "serviceCidr":
            suggest = "service_cidr"
        elif key == "outboundType":
            suggest = "outbound_type"
        elif key == "preconfiguredNetworkSecurityGroupEnabled":
            suggest = "preconfigured_network_security_group_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterNetworkProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterNetworkProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterNetworkProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pod_cidr: _builtins.str,
                 service_cidr: _builtins.str,
                 outbound_type: Optional[_builtins.str] = None,
                 preconfigured_network_security_group_enabled: Optional[_builtins.bool] = None):
        """
        :param _builtins.str pod_cidr: The CIDR to use for pod IP addresses. Changing this forces a new resource to be created.
        :param _builtins.str service_cidr: The network range used by the OpenShift service. Changing this forces a new resource to be created.
        :param _builtins.str outbound_type: The outbound (egress) routing method. Possible values are `Loadbalancer` and `UserDefinedRouting`. Defaults to `Loadbalancer`. Changing this forces a new resource to be created.
        :param _builtins.bool preconfigured_network_security_group_enabled: Whether a preconfigured network security group is being used on the subnets.  Defaults to `false`.  Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "pod_cidr", pod_cidr)
        pulumi.set(__self__, "service_cidr", service_cidr)
        if outbound_type is not None:
            pulumi.set(__self__, "outbound_type", outbound_type)
        if preconfigured_network_security_group_enabled is not None:
            pulumi.set(__self__, "preconfigured_network_security_group_enabled", preconfigured_network_security_group_enabled)

    @_builtins.property
    @pulumi.getter(name="podCidr")
    def pod_cidr(self) -> _builtins.str:
        """
        The CIDR to use for pod IP addresses. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "pod_cidr")

    @_builtins.property
    @pulumi.getter(name="serviceCidr")
    def service_cidr(self) -> _builtins.str:
        """
        The network range used by the OpenShift service. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "service_cidr")

    @_builtins.property
    @pulumi.getter(name="outboundType")
    def outbound_type(self) -> Optional[_builtins.str]:
        """
        The outbound (egress) routing method. Possible values are `Loadbalancer` and `UserDefinedRouting`. Defaults to `Loadbalancer`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "outbound_type")

    @_builtins.property
    @pulumi.getter(name="preconfiguredNetworkSecurityGroupEnabled")
    def preconfigured_network_security_group_enabled(self) -> Optional[_builtins.bool]:
        """
        Whether a preconfigured network security group is being used on the subnets.  Defaults to `false`.  Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "preconfigured_network_security_group_enabled")


@pulumi.output_type
class ClusterServicePrincipal(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "clientId":
            suggest = "client_id"
        elif key == "clientSecret":
            suggest = "client_secret"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterServicePrincipal. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterServicePrincipal.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterServicePrincipal.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 client_id: _builtins.str,
                 client_secret: _builtins.str):
        """
        :param _builtins.str client_id: The Client ID for the Service Principal.
        :param _builtins.str client_secret: The Client Secret for the Service Principal.
               
               > **Note:** Currently a service principal cannot be associated with more than one ARO clusters on the Azure subscription.
        """
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_secret", client_secret)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> _builtins.str:
        """
        The Client ID for the Service Principal.
        """
        return pulumi.get(self, "client_id")

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> _builtins.str:
        """
        The Client Secret for the Service Principal.

        > **Note:** Currently a service principal cannot be associated with more than one ARO clusters on the Azure subscription.
        """
        return pulumi.get(self, "client_secret")


@pulumi.output_type
class ClusterWorkerProfile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "diskSizeGb":
            suggest = "disk_size_gb"
        elif key == "nodeCount":
            suggest = "node_count"
        elif key == "subnetId":
            suggest = "subnet_id"
        elif key == "vmSize":
            suggest = "vm_size"
        elif key == "diskEncryptionSetId":
            suggest = "disk_encryption_set_id"
        elif key == "encryptionAtHostEnabled":
            suggest = "encryption_at_host_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterWorkerProfile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterWorkerProfile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterWorkerProfile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 disk_size_gb: _builtins.int,
                 node_count: _builtins.int,
                 subnet_id: _builtins.str,
                 vm_size: _builtins.str,
                 disk_encryption_set_id: Optional[_builtins.str] = None,
                 encryption_at_host_enabled: Optional[_builtins.bool] = None):
        """
        :param _builtins.int disk_size_gb: The internal OS disk size of the worker Virtual Machines in GB. Changing this forces a new resource to be created.
        :param _builtins.int node_count: The initial number of worker nodes which should exist in the cluster. Changing this forces a new resource to be created.
        :param _builtins.str subnet_id: The ID of the subnet where worker nodes will be hosted. Changing this forces a new resource to be created.
        :param _builtins.str vm_size: The size of the Virtual Machines for the worker nodes. Changing this forces a new resource to be created.
        :param _builtins.str disk_encryption_set_id: The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
        :param _builtins.bool encryption_at_host_enabled: Whether worker virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.
               
               > **Note:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
        """
        pulumi.set(__self__, "disk_size_gb", disk_size_gb)
        pulumi.set(__self__, "node_count", node_count)
        pulumi.set(__self__, "subnet_id", subnet_id)
        pulumi.set(__self__, "vm_size", vm_size)
        if disk_encryption_set_id is not None:
            pulumi.set(__self__, "disk_encryption_set_id", disk_encryption_set_id)
        if encryption_at_host_enabled is not None:
            pulumi.set(__self__, "encryption_at_host_enabled", encryption_at_host_enabled)

    @_builtins.property
    @pulumi.getter(name="diskSizeGb")
    def disk_size_gb(self) -> _builtins.int:
        """
        The internal OS disk size of the worker Virtual Machines in GB. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "disk_size_gb")

    @_builtins.property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> _builtins.int:
        """
        The initial number of worker nodes which should exist in the cluster. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "node_count")

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> _builtins.str:
        """
        The ID of the subnet where worker nodes will be hosted. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "subnet_id")

    @_builtins.property
    @pulumi.getter(name="vmSize")
    def vm_size(self) -> _builtins.str:
        """
        The size of the Virtual Machines for the worker nodes. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vm_size")

    @_builtins.property
    @pulumi.getter(name="diskEncryptionSetId")
    def disk_encryption_set_id(self) -> Optional[_builtins.str]:
        """
        The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "disk_encryption_set_id")

    @_builtins.property
    @pulumi.getter(name="encryptionAtHostEnabled")
    def encryption_at_host_enabled(self) -> Optional[_builtins.bool]:
        """
        Whether worker virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.

        > **Note:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
        """
        return pulumi.get(self, "encryption_at_host_enabled")


