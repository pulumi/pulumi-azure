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

__all__ = [
    'GetVolumeResult',
    'AwaitableGetVolumeResult',
    'get_volume',
    'get_volume_output',
]

@pulumi.output_type
class GetVolumeResult:
    """
    A collection of values returned by getVolume.
    """
    def __init__(__self__, account_name=None, data_protection_backup_policies=None, data_protection_replications=None, encryption_key_source=None, id=None, key_vault_private_endpoint_id=None, large_volume_enabled=None, location=None, mount_ip_addresses=None, name=None, network_features=None, pool_name=None, protocols=None, resource_group_name=None, security_style=None, service_level=None, smb_access_based_enumeration_enabled=None, smb_non_browsable_enabled=None, storage_quota_in_gb=None, subnet_id=None, volume_path=None, zone=None):
        if account_name and not isinstance(account_name, str):
            raise TypeError("Expected argument 'account_name' to be a str")
        pulumi.set(__self__, "account_name", account_name)
        if data_protection_backup_policies and not isinstance(data_protection_backup_policies, list):
            raise TypeError("Expected argument 'data_protection_backup_policies' to be a list")
        pulumi.set(__self__, "data_protection_backup_policies", data_protection_backup_policies)
        if data_protection_replications and not isinstance(data_protection_replications, list):
            raise TypeError("Expected argument 'data_protection_replications' to be a list")
        pulumi.set(__self__, "data_protection_replications", data_protection_replications)
        if encryption_key_source and not isinstance(encryption_key_source, str):
            raise TypeError("Expected argument 'encryption_key_source' to be a str")
        pulumi.set(__self__, "encryption_key_source", encryption_key_source)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_vault_private_endpoint_id and not isinstance(key_vault_private_endpoint_id, str):
            raise TypeError("Expected argument 'key_vault_private_endpoint_id' to be a str")
        pulumi.set(__self__, "key_vault_private_endpoint_id", key_vault_private_endpoint_id)
        if large_volume_enabled and not isinstance(large_volume_enabled, bool):
            raise TypeError("Expected argument 'large_volume_enabled' to be a bool")
        pulumi.set(__self__, "large_volume_enabled", large_volume_enabled)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if mount_ip_addresses and not isinstance(mount_ip_addresses, list):
            raise TypeError("Expected argument 'mount_ip_addresses' to be a list")
        pulumi.set(__self__, "mount_ip_addresses", mount_ip_addresses)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_features and not isinstance(network_features, str):
            raise TypeError("Expected argument 'network_features' to be a str")
        pulumi.set(__self__, "network_features", network_features)
        if pool_name and not isinstance(pool_name, str):
            raise TypeError("Expected argument 'pool_name' to be a str")
        pulumi.set(__self__, "pool_name", pool_name)
        if protocols and not isinstance(protocols, list):
            raise TypeError("Expected argument 'protocols' to be a list")
        pulumi.set(__self__, "protocols", protocols)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if security_style and not isinstance(security_style, str):
            raise TypeError("Expected argument 'security_style' to be a str")
        pulumi.set(__self__, "security_style", security_style)
        if service_level and not isinstance(service_level, str):
            raise TypeError("Expected argument 'service_level' to be a str")
        pulumi.set(__self__, "service_level", service_level)
        if smb_access_based_enumeration_enabled and not isinstance(smb_access_based_enumeration_enabled, bool):
            raise TypeError("Expected argument 'smb_access_based_enumeration_enabled' to be a bool")
        pulumi.set(__self__, "smb_access_based_enumeration_enabled", smb_access_based_enumeration_enabled)
        if smb_non_browsable_enabled and not isinstance(smb_non_browsable_enabled, bool):
            raise TypeError("Expected argument 'smb_non_browsable_enabled' to be a bool")
        pulumi.set(__self__, "smb_non_browsable_enabled", smb_non_browsable_enabled)
        if storage_quota_in_gb and not isinstance(storage_quota_in_gb, int):
            raise TypeError("Expected argument 'storage_quota_in_gb' to be a int")
        pulumi.set(__self__, "storage_quota_in_gb", storage_quota_in_gb)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if volume_path and not isinstance(volume_path, str):
            raise TypeError("Expected argument 'volume_path' to be a str")
        pulumi.set(__self__, "volume_path", volume_path)
        if zone and not isinstance(zone, str):
            raise TypeError("Expected argument 'zone' to be a str")
        pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter(name="accountName")
    def account_name(self) -> _builtins.str:
        return pulumi.get(self, "account_name")

    @_builtins.property
    @pulumi.getter(name="dataProtectionBackupPolicies")
    def data_protection_backup_policies(self) -> Sequence['outputs.GetVolumeDataProtectionBackupPolicyResult']:
        """
        A data protecion backup policy block
        """
        return pulumi.get(self, "data_protection_backup_policies")

    @_builtins.property
    @pulumi.getter(name="dataProtectionReplications")
    def data_protection_replications(self) -> Sequence['outputs.GetVolumeDataProtectionReplicationResult']:
        """
        Volume data protection replication block
        """
        return pulumi.get(self, "data_protection_replications")

    @_builtins.property
    @pulumi.getter(name="encryptionKeySource")
    def encryption_key_source(self) -> _builtins.str:
        return pulumi.get(self, "encryption_key_source")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="keyVaultPrivateEndpointId")
    def key_vault_private_endpoint_id(self) -> _builtins.str:
        return pulumi.get(self, "key_vault_private_endpoint_id")

    @_builtins.property
    @pulumi.getter(name="largeVolumeEnabled")
    def large_volume_enabled(self) -> _builtins.bool:
        """
        Indicates if the volume is a large volume.
        """
        return pulumi.get(self, "large_volume_enabled")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure Region where the NetApp Volume exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="mountIpAddresses")
    def mount_ip_addresses(self) -> Sequence[_builtins.str]:
        """
        A list of IPv4 Addresses which should be used to mount the volume.
        """
        return pulumi.get(self, "mount_ip_addresses")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkFeatures")
    def network_features(self) -> _builtins.str:
        """
        Network features in use `Basic` or `Standard`.
        """
        return pulumi.get(self, "network_features")

    @_builtins.property
    @pulumi.getter(name="poolName")
    def pool_name(self) -> _builtins.str:
        return pulumi.get(self, "pool_name")

    @_builtins.property
    @pulumi.getter
    def protocols(self) -> Sequence[_builtins.str]:
        """
        A list of protocol types enabled on volume.
        """
        return pulumi.get(self, "protocols")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="securityStyle")
    def security_style(self) -> Optional[_builtins.str]:
        """
        Volume security style
        """
        return pulumi.get(self, "security_style")

    @_builtins.property
    @pulumi.getter(name="serviceLevel")
    def service_level(self) -> _builtins.str:
        """
        The service level of the file system.
        """
        return pulumi.get(self, "service_level")

    @_builtins.property
    @pulumi.getter(name="smbAccessBasedEnumerationEnabled")
    def smb_access_based_enumeration_enabled(self) -> _builtins.bool:
        """
        Limits enumeration of files and folders (that is, listing the contents) in SMB only to users with allowed access on the share.
        """
        return pulumi.get(self, "smb_access_based_enumeration_enabled")

    @_builtins.property
    @pulumi.getter(name="smbNonBrowsableEnabled")
    def smb_non_browsable_enabled(self) -> _builtins.bool:
        """
        Limits clients from browsing for an SMB share.
        """
        return pulumi.get(self, "smb_non_browsable_enabled")

    @_builtins.property
    @pulumi.getter(name="storageQuotaInGb")
    def storage_quota_in_gb(self) -> _builtins.int:
        """
        The maximum Storage Quota in Gigabytes allowed for a file system.
        """
        return pulumi.get(self, "storage_quota_in_gb")

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> _builtins.str:
        """
        The ID of a Subnet in which the NetApp Volume resides.
        """
        return pulumi.get(self, "subnet_id")

    @_builtins.property
    @pulumi.getter(name="volumePath")
    def volume_path(self) -> _builtins.str:
        """
        The unique file path of the volume.
        """
        return pulumi.get(self, "volume_path")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> _builtins.str:
        """
        The Availability Zone in which the Volume is located.
        """
        return pulumi.get(self, "zone")


class AwaitableGetVolumeResult(GetVolumeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumeResult(
            account_name=self.account_name,
            data_protection_backup_policies=self.data_protection_backup_policies,
            data_protection_replications=self.data_protection_replications,
            encryption_key_source=self.encryption_key_source,
            id=self.id,
            key_vault_private_endpoint_id=self.key_vault_private_endpoint_id,
            large_volume_enabled=self.large_volume_enabled,
            location=self.location,
            mount_ip_addresses=self.mount_ip_addresses,
            name=self.name,
            network_features=self.network_features,
            pool_name=self.pool_name,
            protocols=self.protocols,
            resource_group_name=self.resource_group_name,
            security_style=self.security_style,
            service_level=self.service_level,
            smb_access_based_enumeration_enabled=self.smb_access_based_enumeration_enabled,
            smb_non_browsable_enabled=self.smb_non_browsable_enabled,
            storage_quota_in_gb=self.storage_quota_in_gb,
            subnet_id=self.subnet_id,
            volume_path=self.volume_path,
            zone=self.zone)


def get_volume(account_name: Optional[_builtins.str] = None,
               name: Optional[_builtins.str] = None,
               pool_name: Optional[_builtins.str] = None,
               resource_group_name: Optional[_builtins.str] = None,
               security_style: Optional[_builtins.str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumeResult:
    """
    Uses this data source to access information about an existing NetApp Volume.

    ## NetApp Volume Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.netapp.get_volume(resource_group_name="acctestRG",
        account_name="acctestnetappaccount",
        pool_name="acctestnetapppool",
        name="example-volume")
    pulumi.export("netappVolumeId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NetApp`: 2025-01-01


    :param _builtins.str account_name: The name of the NetApp account where the NetApp pool exists.
    :param _builtins.str name: The name of the NetApp Volume.
    :param _builtins.str pool_name: The name of the NetApp pool where the NetApp volume exists.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the NetApp Volume exists.
    :param _builtins.str security_style: Volume security style
    """
    __args__ = dict()
    __args__['accountName'] = account_name
    __args__['name'] = name
    __args__['poolName'] = pool_name
    __args__['resourceGroupName'] = resource_group_name
    __args__['securityStyle'] = security_style
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:netapp/getVolume:getVolume', __args__, opts=opts, typ=GetVolumeResult).value

    return AwaitableGetVolumeResult(
        account_name=pulumi.get(__ret__, 'account_name'),
        data_protection_backup_policies=pulumi.get(__ret__, 'data_protection_backup_policies'),
        data_protection_replications=pulumi.get(__ret__, 'data_protection_replications'),
        encryption_key_source=pulumi.get(__ret__, 'encryption_key_source'),
        id=pulumi.get(__ret__, 'id'),
        key_vault_private_endpoint_id=pulumi.get(__ret__, 'key_vault_private_endpoint_id'),
        large_volume_enabled=pulumi.get(__ret__, 'large_volume_enabled'),
        location=pulumi.get(__ret__, 'location'),
        mount_ip_addresses=pulumi.get(__ret__, 'mount_ip_addresses'),
        name=pulumi.get(__ret__, 'name'),
        network_features=pulumi.get(__ret__, 'network_features'),
        pool_name=pulumi.get(__ret__, 'pool_name'),
        protocols=pulumi.get(__ret__, 'protocols'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        security_style=pulumi.get(__ret__, 'security_style'),
        service_level=pulumi.get(__ret__, 'service_level'),
        smb_access_based_enumeration_enabled=pulumi.get(__ret__, 'smb_access_based_enumeration_enabled'),
        smb_non_browsable_enabled=pulumi.get(__ret__, 'smb_non_browsable_enabled'),
        storage_quota_in_gb=pulumi.get(__ret__, 'storage_quota_in_gb'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        volume_path=pulumi.get(__ret__, 'volume_path'),
        zone=pulumi.get(__ret__, 'zone'))
def get_volume_output(account_name: Optional[pulumi.Input[_builtins.str]] = None,
                      name: Optional[pulumi.Input[_builtins.str]] = None,
                      pool_name: Optional[pulumi.Input[_builtins.str]] = None,
                      resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                      security_style: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVolumeResult]:
    """
    Uses this data source to access information about an existing NetApp Volume.

    ## NetApp Volume Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.netapp.get_volume(resource_group_name="acctestRG",
        account_name="acctestnetappaccount",
        pool_name="acctestnetapppool",
        name="example-volume")
    pulumi.export("netappVolumeId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NetApp`: 2025-01-01


    :param _builtins.str account_name: The name of the NetApp account where the NetApp pool exists.
    :param _builtins.str name: The name of the NetApp Volume.
    :param _builtins.str pool_name: The name of the NetApp pool where the NetApp volume exists.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the NetApp Volume exists.
    :param _builtins.str security_style: Volume security style
    """
    __args__ = dict()
    __args__['accountName'] = account_name
    __args__['name'] = name
    __args__['poolName'] = pool_name
    __args__['resourceGroupName'] = resource_group_name
    __args__['securityStyle'] = security_style
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:netapp/getVolume:getVolume', __args__, opts=opts, typ=GetVolumeResult)
    return __ret__.apply(lambda __response__: GetVolumeResult(
        account_name=pulumi.get(__response__, 'account_name'),
        data_protection_backup_policies=pulumi.get(__response__, 'data_protection_backup_policies'),
        data_protection_replications=pulumi.get(__response__, 'data_protection_replications'),
        encryption_key_source=pulumi.get(__response__, 'encryption_key_source'),
        id=pulumi.get(__response__, 'id'),
        key_vault_private_endpoint_id=pulumi.get(__response__, 'key_vault_private_endpoint_id'),
        large_volume_enabled=pulumi.get(__response__, 'large_volume_enabled'),
        location=pulumi.get(__response__, 'location'),
        mount_ip_addresses=pulumi.get(__response__, 'mount_ip_addresses'),
        name=pulumi.get(__response__, 'name'),
        network_features=pulumi.get(__response__, 'network_features'),
        pool_name=pulumi.get(__response__, 'pool_name'),
        protocols=pulumi.get(__response__, 'protocols'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        security_style=pulumi.get(__response__, 'security_style'),
        service_level=pulumi.get(__response__, 'service_level'),
        smb_access_based_enumeration_enabled=pulumi.get(__response__, 'smb_access_based_enumeration_enabled'),
        smb_non_browsable_enabled=pulumi.get(__response__, 'smb_non_browsable_enabled'),
        storage_quota_in_gb=pulumi.get(__response__, 'storage_quota_in_gb'),
        subnet_id=pulumi.get(__response__, 'subnet_id'),
        volume_path=pulumi.get(__response__, 'volume_path'),
        zone=pulumi.get(__response__, 'zone')))
