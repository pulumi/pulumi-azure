// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery
{
    /// <summary>
    /// Manages a VMWare replicated VM using Azure Site Recovery (VMWare to Azure only). A replicated VM keeps a copiously updated image of the VM in Azure in order to be able to start the VM in Azure in case of a disaster.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-rg",
    ///         Location = "West US",
    ///     });
    /// 
    ///     var exampleVault = new Azure.RecoveryServices.Vault("example", new()
    ///     {
    ///         Name = "example-recovery-vault",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Sku = "Standard",
    ///     });
    /// 
    ///     var exampleVMWareReplicationPolicy = new Azure.SiteRecovery.VMWareReplicationPolicy("example", new()
    ///     {
    ///         RecoveryVaultId = exampleVault.Id,
    ///         Name = "example-policy",
    ///         RecoveryPointRetentionInMinutes = 1440,
    ///         ApplicationConsistentSnapshotFrequencyInMinutes = 240,
    ///     });
    /// 
    ///     var test = new Azure.SiteRecovery.VmwareReplicationPolicyAssociation("test", new()
    ///     {
    ///         Name = "example-association",
    ///         RecoveryVaultId = exampleVault.Id,
    ///         PolicyId = exampleVMWareReplicationPolicy.Id,
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplestorageacc",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountKind = "StorageV2",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-net",
    ///         ResourceGroupName = example.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "192.168.2.0/24",
    ///         },
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "example-subnet",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "192.168.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleVmwareReplicatedVm = new Azure.SiteRecovery.VmwareReplicatedVm("example", new()
    ///     {
    ///         Name = "example-vmware-vm",
    ///         RecoveryVaultId = exampleVault.Id,
    ///         SourceVmName = "example-vm",
    ///         ApplianceName = "example-appliance",
    ///         RecoveryReplicationPolicyId = exampleAzurermSiteRecoveryVmwareReplicationPolicyAssociation.PolicyId,
    ///         PhysicalServerCredentialName = "example-creds",
    ///         LicenseType = "NotSpecified",
    ///         TargetBootDiagnosticsStorageAccountId = exampleAccount.Id,
    ///         TargetVmName = "example_replicated_vm",
    ///         TargetResourceGroupId = example.Id,
    ///         DefaultLogStorageAccountId = exampleAccount.Id,
    ///         DefaultRecoveryDiskType = "Standard_LRS",
    ///         TargetNetworkId = exampleVirtualNetwork.Id,
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Azure.SiteRecovery.Inputs.VmwareReplicatedVmNetworkInterfaceArgs
    ///             {
    ///                 SourceMacAddress = "00:00:00:00:00:00",
    ///                 TargetSubnetName = exampleSubnet.Name,
    ///                 IsPrimary = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.OffAzure`: 2020-01-01
    /// 
    /// * `Microsoft.RecoveryServices`: 2024-04-01
    /// 
    /// ## Import
    /// 
    /// Site Recovery VMWare Replicated VM's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:siterecovery/vmwareReplicatedVm:VmwareReplicatedVm vmreplication /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/fabric-name/replicationProtectionContainers/protection-container-name/replicationProtectedItems/vm-replication-name
    /// ```
    /// </summary>
    [AzureResourceType("azure:siterecovery/vmwareReplicatedVm:VmwareReplicatedVm")]
    public partial class VmwareReplicatedVm : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of VMWare appliance which handles the replication. Changing this forces a new resource to be created.
        /// </summary>
        [Output("applianceName")]
        public Output<string> ApplianceName { get; private set; } = null!;

        /// <summary>
        /// The ID of the stroage account that should be used for logging during replication. 
        /// 
        /// &gt; **Note:** Only standard types of storage accounts are allowed.
        /// 
        /// &gt; **Note:** Only one of `default_log_storage_account_id` or `managed_disk` must be specified.
        /// 
        /// &gt; **Note:** Changing `default_log_storage_account_id` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_log_storage_account_id` co-exist with `managed_disk`, the value of `default_log_storage_account_id` must be as same as `log_storage_account_id` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Output("defaultLogStorageAccountId")]
        public Output<string?> DefaultLogStorageAccountId { get; private set; } = null!;

        /// <summary>
        /// The type of storage account that should be used for recovery disks when a failover is done. Possible values are `Premium_LRS`, `Standard_LRS` and `StandardSSD_LRS`.
        /// 
        /// &gt; **Note:** Only one of `default_recovery_disk_type` or `managed_disk` must be specified.
        /// 
        /// &gt; **Note:** Changing `default_recovery_disk_type` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_recovery_disk_type` co-exist with `managed_disk`, the value of `default_recovery_disk_type` must be as same as `target_disk_type` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Output("defaultRecoveryDiskType")]
        public Output<string?> DefaultRecoveryDiskType { get; private set; } = null!;

        /// <summary>
        /// The ID of the default Disk Encryption Set that should be used for the disks when a failover is done.
        /// 
        /// &gt; **Note:** Changing `default_target_disk_encryption_set_id` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_target_disk_encryption_set_id` co-exist with `managed_disk`, the value of `default_target_disk_encryption_set_id` must be as same as `target_disk_encryption_set_id` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Output("defaultTargetDiskEncryptionSetId")]
        public Output<string?> DefaultTargetDiskEncryptionSetId { get; private set; } = null!;

        /// <summary>
        /// The license type of the VM. Possible values are `NoLicenseType`, `NotSpecified` and `WindowsServer`. Defaults to `NotSpecified`.
        /// </summary>
        [Output("licenseType")]
        public Output<string?> LicenseType { get; private set; } = null!;

        /// <summary>
        /// One or more `managed_disk` block as defined below. It's available only if mobility service is already installed on the source VM.
        /// 
        /// &gt; **Note:** A replicated VM could be created without `managed_disk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
        /// </summary>
        [Output("managedDisks")]
        public Output<ImmutableArray<Outputs.VmwareReplicatedVmManagedDisk>> ManagedDisks { get; private set; } = null!;

        /// <summary>
        /// Name of group in which all machines will replicate together and have shared crash consistent and app-consistent recovery points when failed over.
        /// </summary>
        [Output("multiVmGroupName")]
        public Output<string?> MultiVmGroupName { get; private set; } = null!;

        /// <summary>
        /// The name of the replicated VM. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// One or more `network_interface` block as defined below.
        /// </summary>
        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.VmwareReplicatedVmNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        /// <summary>
        /// The name of the credential to access the source VM. Changing this forces a new resource to be created. More information about the credentials could be found [here](https://learn.microsoft.com/en-us/azure/site-recovery/deploy-vmware-azure-replication-appliance-modernized).
        /// </summary>
        [Output("physicalServerCredentialName")]
        public Output<string> PhysicalServerCredentialName { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy to use for this replicated VM.
        /// </summary>
        [Output("recoveryReplicationPolicyId")]
        public Output<string> RecoveryReplicationPolicyId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Recovery Services Vault where the replicated VM is created.
        /// </summary>
        [Output("recoveryVaultId")]
        public Output<string> RecoveryVaultId { get; private set; } = null!;

        /// <summary>
        /// The name of the source VM in VMWare. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sourceVmName")]
        public Output<string> SourceVmName { get; private set; } = null!;

        /// <summary>
        /// The ID of availability set that the new VM should belong to when a failover is done.
        /// </summary>
        [Output("targetAvailabilitySetId")]
        public Output<string?> TargetAvailabilitySetId { get; private set; } = null!;

        /// <summary>
        /// The ID of the storage account that should be used for boot diagnostics when a failover is done.
        /// </summary>
        [Output("targetBootDiagnosticsStorageAccountId")]
        public Output<string?> TargetBootDiagnosticsStorageAccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of network to use when a failover is done.
        /// 
        /// &gt; **Note:** `target_network_id` is required when `network_interface` is specified.
        /// </summary>
        [Output("targetNetworkId")]
        public Output<string?> TargetNetworkId { get; private set; } = null!;

        /// <summary>
        /// The ID of Proximity Placement Group the new VM should belong to when a failover is done.
        /// 
        /// &gt; **Note:** Only one of `target_availability_set_id` or `target_zone` can be specified.
        /// </summary>
        [Output("targetProximityPlacementGroupId")]
        public Output<string?> TargetProximityPlacementGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of resource group where the VM should be created when a failover is done.
        /// </summary>
        [Output("targetResourceGroupId")]
        public Output<string> TargetResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// Name of the VM that should be created when a failover is done. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetVmName")]
        public Output<string> TargetVmName { get; private set; } = null!;

        /// <summary>
        /// Size of the VM that should be created when a failover is done, such as `Standard_F2`. If it's not specified, it will automatically be set by detecting the source VM size.
        /// </summary>
        [Output("targetVmSize")]
        public Output<string?> TargetVmSize { get; private set; } = null!;

        /// <summary>
        /// Specifies the Availability Zone where the Failover VM should exist.
        /// </summary>
        [Output("targetZone")]
        public Output<string?> TargetZone { get; private set; } = null!;

        /// <summary>
        /// The ID of network to use when a test failover is done.
        /// </summary>
        [Output("testNetworkId")]
        public Output<string?> TestNetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a VmwareReplicatedVm resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VmwareReplicatedVm(string name, VmwareReplicatedVmArgs args, CustomResourceOptions? options = null)
            : base("azure:siterecovery/vmwareReplicatedVm:VmwareReplicatedVm", name, args ?? new VmwareReplicatedVmArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VmwareReplicatedVm(string name, Input<string> id, VmwareReplicatedVmState? state = null, CustomResourceOptions? options = null)
            : base("azure:siterecovery/vmwareReplicatedVm:VmwareReplicatedVm", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VmwareReplicatedVm resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VmwareReplicatedVm Get(string name, Input<string> id, VmwareReplicatedVmState? state = null, CustomResourceOptions? options = null)
        {
            return new VmwareReplicatedVm(name, id, state, options);
        }
    }

    public sealed class VmwareReplicatedVmArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of VMWare appliance which handles the replication. Changing this forces a new resource to be created.
        /// </summary>
        [Input("applianceName", required: true)]
        public Input<string> ApplianceName { get; set; } = null!;

        /// <summary>
        /// The ID of the stroage account that should be used for logging during replication. 
        /// 
        /// &gt; **Note:** Only standard types of storage accounts are allowed.
        /// 
        /// &gt; **Note:** Only one of `default_log_storage_account_id` or `managed_disk` must be specified.
        /// 
        /// &gt; **Note:** Changing `default_log_storage_account_id` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_log_storage_account_id` co-exist with `managed_disk`, the value of `default_log_storage_account_id` must be as same as `log_storage_account_id` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Input("defaultLogStorageAccountId")]
        public Input<string>? DefaultLogStorageAccountId { get; set; }

        /// <summary>
        /// The type of storage account that should be used for recovery disks when a failover is done. Possible values are `Premium_LRS`, `Standard_LRS` and `StandardSSD_LRS`.
        /// 
        /// &gt; **Note:** Only one of `default_recovery_disk_type` or `managed_disk` must be specified.
        /// 
        /// &gt; **Note:** Changing `default_recovery_disk_type` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_recovery_disk_type` co-exist with `managed_disk`, the value of `default_recovery_disk_type` must be as same as `target_disk_type` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Input("defaultRecoveryDiskType")]
        public Input<string>? DefaultRecoveryDiskType { get; set; }

        /// <summary>
        /// The ID of the default Disk Encryption Set that should be used for the disks when a failover is done.
        /// 
        /// &gt; **Note:** Changing `default_target_disk_encryption_set_id` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_target_disk_encryption_set_id` co-exist with `managed_disk`, the value of `default_target_disk_encryption_set_id` must be as same as `target_disk_encryption_set_id` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Input("defaultTargetDiskEncryptionSetId")]
        public Input<string>? DefaultTargetDiskEncryptionSetId { get; set; }

        /// <summary>
        /// The license type of the VM. Possible values are `NoLicenseType`, `NotSpecified` and `WindowsServer`. Defaults to `NotSpecified`.
        /// </summary>
        [Input("licenseType")]
        public Input<string>? LicenseType { get; set; }

        [Input("managedDisks")]
        private InputList<Inputs.VmwareReplicatedVmManagedDiskArgs>? _managedDisks;

        /// <summary>
        /// One or more `managed_disk` block as defined below. It's available only if mobility service is already installed on the source VM.
        /// 
        /// &gt; **Note:** A replicated VM could be created without `managed_disk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.VmwareReplicatedVmManagedDiskArgs> ManagedDisks
        {
            get => _managedDisks ?? (_managedDisks = new InputList<Inputs.VmwareReplicatedVmManagedDiskArgs>());
            set => _managedDisks = value;
        }

        /// <summary>
        /// Name of group in which all machines will replicate together and have shared crash consistent and app-consistent recovery points when failed over.
        /// </summary>
        [Input("multiVmGroupName")]
        public Input<string>? MultiVmGroupName { get; set; }

        /// <summary>
        /// The name of the replicated VM. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.VmwareReplicatedVmNetworkInterfaceArgs>? _networkInterfaces;

        /// <summary>
        /// One or more `network_interface` block as defined below.
        /// </summary>
        public InputList<Inputs.VmwareReplicatedVmNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.VmwareReplicatedVmNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// The name of the credential to access the source VM. Changing this forces a new resource to be created. More information about the credentials could be found [here](https://learn.microsoft.com/en-us/azure/site-recovery/deploy-vmware-azure-replication-appliance-modernized).
        /// </summary>
        [Input("physicalServerCredentialName", required: true)]
        public Input<string> PhysicalServerCredentialName { get; set; } = null!;

        /// <summary>
        /// The ID of the policy to use for this replicated VM.
        /// </summary>
        [Input("recoveryReplicationPolicyId", required: true)]
        public Input<string> RecoveryReplicationPolicyId { get; set; } = null!;

        /// <summary>
        /// The ID of the Recovery Services Vault where the replicated VM is created.
        /// </summary>
        [Input("recoveryVaultId", required: true)]
        public Input<string> RecoveryVaultId { get; set; } = null!;

        /// <summary>
        /// The name of the source VM in VMWare. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceVmName", required: true)]
        public Input<string> SourceVmName { get; set; } = null!;

        /// <summary>
        /// The ID of availability set that the new VM should belong to when a failover is done.
        /// </summary>
        [Input("targetAvailabilitySetId")]
        public Input<string>? TargetAvailabilitySetId { get; set; }

        /// <summary>
        /// The ID of the storage account that should be used for boot diagnostics when a failover is done.
        /// </summary>
        [Input("targetBootDiagnosticsStorageAccountId")]
        public Input<string>? TargetBootDiagnosticsStorageAccountId { get; set; }

        /// <summary>
        /// The ID of network to use when a failover is done.
        /// 
        /// &gt; **Note:** `target_network_id` is required when `network_interface` is specified.
        /// </summary>
        [Input("targetNetworkId")]
        public Input<string>? TargetNetworkId { get; set; }

        /// <summary>
        /// The ID of Proximity Placement Group the new VM should belong to when a failover is done.
        /// 
        /// &gt; **Note:** Only one of `target_availability_set_id` or `target_zone` can be specified.
        /// </summary>
        [Input("targetProximityPlacementGroupId")]
        public Input<string>? TargetProximityPlacementGroupId { get; set; }

        /// <summary>
        /// The ID of resource group where the VM should be created when a failover is done.
        /// </summary>
        [Input("targetResourceGroupId", required: true)]
        public Input<string> TargetResourceGroupId { get; set; } = null!;

        /// <summary>
        /// Name of the VM that should be created when a failover is done. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetVmName", required: true)]
        public Input<string> TargetVmName { get; set; } = null!;

        /// <summary>
        /// Size of the VM that should be created when a failover is done, such as `Standard_F2`. If it's not specified, it will automatically be set by detecting the source VM size.
        /// </summary>
        [Input("targetVmSize")]
        public Input<string>? TargetVmSize { get; set; }

        /// <summary>
        /// Specifies the Availability Zone where the Failover VM should exist.
        /// </summary>
        [Input("targetZone")]
        public Input<string>? TargetZone { get; set; }

        /// <summary>
        /// The ID of network to use when a test failover is done.
        /// </summary>
        [Input("testNetworkId")]
        public Input<string>? TestNetworkId { get; set; }

        public VmwareReplicatedVmArgs()
        {
        }
        public static new VmwareReplicatedVmArgs Empty => new VmwareReplicatedVmArgs();
    }

    public sealed class VmwareReplicatedVmState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of VMWare appliance which handles the replication. Changing this forces a new resource to be created.
        /// </summary>
        [Input("applianceName")]
        public Input<string>? ApplianceName { get; set; }

        /// <summary>
        /// The ID of the stroage account that should be used for logging during replication. 
        /// 
        /// &gt; **Note:** Only standard types of storage accounts are allowed.
        /// 
        /// &gt; **Note:** Only one of `default_log_storage_account_id` or `managed_disk` must be specified.
        /// 
        /// &gt; **Note:** Changing `default_log_storage_account_id` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_log_storage_account_id` co-exist with `managed_disk`, the value of `default_log_storage_account_id` must be as same as `log_storage_account_id` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Input("defaultLogStorageAccountId")]
        public Input<string>? DefaultLogStorageAccountId { get; set; }

        /// <summary>
        /// The type of storage account that should be used for recovery disks when a failover is done. Possible values are `Premium_LRS`, `Standard_LRS` and `StandardSSD_LRS`.
        /// 
        /// &gt; **Note:** Only one of `default_recovery_disk_type` or `managed_disk` must be specified.
        /// 
        /// &gt; **Note:** Changing `default_recovery_disk_type` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_recovery_disk_type` co-exist with `managed_disk`, the value of `default_recovery_disk_type` must be as same as `target_disk_type` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Input("defaultRecoveryDiskType")]
        public Input<string>? DefaultRecoveryDiskType { get; set; }

        /// <summary>
        /// The ID of the default Disk Encryption Set that should be used for the disks when a failover is done.
        /// 
        /// &gt; **Note:** Changing `default_target_disk_encryption_set_id` forces a new resource to be created. But removing it does not.
        /// 
        /// &gt; **Note:** When `default_target_disk_encryption_set_id` co-exist with `managed_disk`, the value of `default_target_disk_encryption_set_id` must be as same as `target_disk_encryption_set_id` of every `managed_disk` or it forces a new resource to be created.
        /// </summary>
        [Input("defaultTargetDiskEncryptionSetId")]
        public Input<string>? DefaultTargetDiskEncryptionSetId { get; set; }

        /// <summary>
        /// The license type of the VM. Possible values are `NoLicenseType`, `NotSpecified` and `WindowsServer`. Defaults to `NotSpecified`.
        /// </summary>
        [Input("licenseType")]
        public Input<string>? LicenseType { get; set; }

        [Input("managedDisks")]
        private InputList<Inputs.VmwareReplicatedVmManagedDiskGetArgs>? _managedDisks;

        /// <summary>
        /// One or more `managed_disk` block as defined below. It's available only if mobility service is already installed on the source VM.
        /// 
        /// &gt; **Note:** A replicated VM could be created without `managed_disk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.VmwareReplicatedVmManagedDiskGetArgs> ManagedDisks
        {
            get => _managedDisks ?? (_managedDisks = new InputList<Inputs.VmwareReplicatedVmManagedDiskGetArgs>());
            set => _managedDisks = value;
        }

        /// <summary>
        /// Name of group in which all machines will replicate together and have shared crash consistent and app-consistent recovery points when failed over.
        /// </summary>
        [Input("multiVmGroupName")]
        public Input<string>? MultiVmGroupName { get; set; }

        /// <summary>
        /// The name of the replicated VM. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.VmwareReplicatedVmNetworkInterfaceGetArgs>? _networkInterfaces;

        /// <summary>
        /// One or more `network_interface` block as defined below.
        /// </summary>
        public InputList<Inputs.VmwareReplicatedVmNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.VmwareReplicatedVmNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// The name of the credential to access the source VM. Changing this forces a new resource to be created. More information about the credentials could be found [here](https://learn.microsoft.com/en-us/azure/site-recovery/deploy-vmware-azure-replication-appliance-modernized).
        /// </summary>
        [Input("physicalServerCredentialName")]
        public Input<string>? PhysicalServerCredentialName { get; set; }

        /// <summary>
        /// The ID of the policy to use for this replicated VM.
        /// </summary>
        [Input("recoveryReplicationPolicyId")]
        public Input<string>? RecoveryReplicationPolicyId { get; set; }

        /// <summary>
        /// The ID of the Recovery Services Vault where the replicated VM is created.
        /// </summary>
        [Input("recoveryVaultId")]
        public Input<string>? RecoveryVaultId { get; set; }

        /// <summary>
        /// The name of the source VM in VMWare. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sourceVmName")]
        public Input<string>? SourceVmName { get; set; }

        /// <summary>
        /// The ID of availability set that the new VM should belong to when a failover is done.
        /// </summary>
        [Input("targetAvailabilitySetId")]
        public Input<string>? TargetAvailabilitySetId { get; set; }

        /// <summary>
        /// The ID of the storage account that should be used for boot diagnostics when a failover is done.
        /// </summary>
        [Input("targetBootDiagnosticsStorageAccountId")]
        public Input<string>? TargetBootDiagnosticsStorageAccountId { get; set; }

        /// <summary>
        /// The ID of network to use when a failover is done.
        /// 
        /// &gt; **Note:** `target_network_id` is required when `network_interface` is specified.
        /// </summary>
        [Input("targetNetworkId")]
        public Input<string>? TargetNetworkId { get; set; }

        /// <summary>
        /// The ID of Proximity Placement Group the new VM should belong to when a failover is done.
        /// 
        /// &gt; **Note:** Only one of `target_availability_set_id` or `target_zone` can be specified.
        /// </summary>
        [Input("targetProximityPlacementGroupId")]
        public Input<string>? TargetProximityPlacementGroupId { get; set; }

        /// <summary>
        /// The ID of resource group where the VM should be created when a failover is done.
        /// </summary>
        [Input("targetResourceGroupId")]
        public Input<string>? TargetResourceGroupId { get; set; }

        /// <summary>
        /// Name of the VM that should be created when a failover is done. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetVmName")]
        public Input<string>? TargetVmName { get; set; }

        /// <summary>
        /// Size of the VM that should be created when a failover is done, such as `Standard_F2`. If it's not specified, it will automatically be set by detecting the source VM size.
        /// </summary>
        [Input("targetVmSize")]
        public Input<string>? TargetVmSize { get; set; }

        /// <summary>
        /// Specifies the Availability Zone where the Failover VM should exist.
        /// </summary>
        [Input("targetZone")]
        public Input<string>? TargetZone { get; set; }

        /// <summary>
        /// The ID of network to use when a test failover is done.
        /// </summary>
        [Input("testNetworkId")]
        public Input<string>? TestNetworkId { get; set; }

        public VmwareReplicatedVmState()
        {
        }
        public static new VmwareReplicatedVmState Empty => new VmwareReplicatedVmState();
    }
}
