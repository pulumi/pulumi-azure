---
title: Azure Classic v7 Migration Guide
meta_desc: How to upgrade from v6 to v7 of the Azure Classic provider
layout: package
---

Version 7 of the Azure Classic provider is based on version 5 of the Terraform AzureRM provider (v5.3.0). It removes properties that were deprecated throughout v6, renames many properties for consistency, and changes several defaults. The upstream release notes are in the [5.0 upgrade guide](https://registry.terraform.io/providers/hashicorp/azurerm/latest/docs/guides/5.0-upgrade-guide).

This guide covers resources and data sources that still exist in v7. It does not yet cover the resources that were removed.

Each section shows a v6 program and the same program after migrating to v7. The examples are in TypeScript. Property names translate to the other languages with the usual casing rules: `storageAccountId` becomes `storage_account_id` in Python and `StorageAccountId` in .NET and Go.

## Before you upgrade

### Upgrade to the latest v6 first

Upgrade to `6.40.0`, run `pulumi preview`, and resolve every deprecation warning. Most of the properties removed in v7 were deprecated in v6, and their replacements already work in v6.

Many sections below are marked **Can be applied on v6**. For those, the v7 form of the code also compiles against `6.40.0`. Apply those changes while still on v6 and run `pulumi preview`. It should report no changes. If it reports an update or a replacement, revert that change and make it as part of the v7 upgrade instead. Doing this shrinks the upgrade to a handful of v7-only changes.

### Update the package

| Language | v7 package |
| :---- | :---- |
| Node.js | `@pulumi/azure@^7` |
| Python | `pulumi-azure>=7,<8` |
| Go | `github.com/pulumi/pulumi-azure/sdk/v7/go/azure` |
| .NET | `Pulumi.Azure` `7.*` |
| Java | `com.pulumi:azure:7.+` |

In Go, update every import path from `sdk/v6` to `sdk/v7`.

### Upgrade procedure

1. Apply the v6-compatible changes, then confirm `pulumi preview` shows no changes.
2. Bump the package to v7 and fix the compile errors using the sections below.
3. Run `pulumi refresh`. This lets the provider rewrite existing state into the v7 shape before any diff is calculated. Several resources depend on this; see [Private DNS](#private-dns-records-and-links).
4. Run `pulumi preview --diff`. Review every replacement and every update to a property you didn't touch. Most unexpected updates come from [changed defaults](#changed-defaults).
5. Run `pulumi up`.

## Provider configuration

* **Resource provider registration.** `resourceProviderRegistrations` now defaults to `none` instead of `legacy`, so the roughly 60 resource providers that v6 registered automatically are no longer registered. On a subscription where a provider was never registered, deployments fail at `pulumi up` with a `MissingSubscriptionRegistration` error. Set `resourceProviderRegistrations: "legacy"` to keep the v6 behaviour, or list the providers your program needs in `resourceProvidersToRegisters`.
* **`skipProviderRegistration` was removed.** Delete it. Its effect is now the default.
* **`enhancedValidation` moved into `features`.** Both of its flags now default to `false`, so an invalid `location` is caught at `pulumi up` instead of `pulumi preview`.
* **`features.virtualMachine.gracefulShutdown` was removed.**
* The `ARM_PROVIDER_ENHANCED_VALIDATION` environment variable was removed. Use `ARM_PROVIDER_ENHANCED_VALIDATION_LOCATIONS` and `ARM_PROVIDER_ENHANCED_VALIDATION_RESOURCE_PROVIDERS`.

Explicit provider (**can be applied on v6**):

**v6**

```typescript
import * as azure from "@pulumi/azure";

const provider = new azure.Provider("azure", {
    features: {},
    // Relied on the implicit default: `legacy` (~60 RPs auto-registered).
    // Or opted out entirely with:
    skipProviderRegistration: true,
    enhancedValidation: {
        locations: true,
        resourceProviders: true,
    },
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const provider = new azure.Provider("azure", {
    features: {
        // Moved inside `features`. Both flags now default to `false`.
        enhancedValidation: {
            locations: true,
            resourceProviders: true,
        },
    },
    // `skipProviderRegistration` is gone: nothing is registered by default anymore.
    // To keep the v6 behaviour, opt back in to the legacy set:
    resourceProviderRegistrations: "legacy",
    // ...or, preferably, register only what the program needs:
    // resourceProviderRegistrations: "none",
    // resourceProvidersToRegisters: ["Microsoft.Compute", "Microsoft.Network", "Microsoft.Storage"],
});
```

The same settings for the default provider, in stack configuration:

```yaml
# v6
config:
  azure:skipProviderRegistration: "true"
  azure:enhancedValidation:
    locations: true
    resourceProviders: true
```

```yaml
# v7
config:
  azure:resourceProviderRegistrations: legacy   # or: none (the new default)
  azure:features:
    enhancedValidation:
      locations: true
      resourceProviders: true
```

## Storage

### Containers, queues, shares, tables and blobs reference their parent by ID

**Can be applied on v6.**

| Resource / data source | v6 | v7 |
| :---- | :---- | :---- |
| `storage.Container`, `storage.Queue`, `storage.Share`, `storage.Table` | `storageAccountName` | `storageAccountId` |
| `storage.Blob`, `storage.ZipBlob` | `storageAccountName` + `storageContainerName` | `storageContainerId` |
| `storage.ShareDirectory`, `storage.ShareFile` | `storageShareId` | `storageShareUrl` |
| `storage.getStorageContainer`, `getQueue`, `getShare`, `getTable` | `storageAccountName` | `storageAccountId` |
| `storage.getBlob` | `storageAccountName` + `storageContainerName` | `storageContainerId` |

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const account = new azure.storage.Account("account", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});

const container = new azure.storage.Container("container", {
    storageAccountName: account.name,
    containerAccessType: "private",
});
const queue = new azure.storage.Queue("queue", { storageAccountName: account.name });
const table = new azure.storage.Table("table", { storageAccountName: account.name });
const share = new azure.storage.Share("share", { storageAccountName: account.name, quota: 50 });

const blob = new azure.storage.Blob("blob", {
    storageAccountName: account.name,
    storageContainerName: container.name,
    type: "Block",
    source: new pulumi.asset.StringAsset("hello world"),
});

const directory = new azure.storage.ShareDirectory("directory", {
    name: "logs",
    storageShareId: share.id,
});
const file = new azure.storage.ShareFile("file", {
    name: "readme.txt",
    storageShareId: share.id,
    source: "readme.txt",
});

const existing = azure.storage.getStorageContainerOutput({
    name: "existing",
    storageAccountName: account.name,
});

export const containerArmId = container.resourceManagerId;
export const containerUrl = container.id; // data-plane URL in v6
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const account = new azure.storage.Account("account", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});

const container = new azure.storage.Container("container", {
    storageAccountId: account.id,
    containerAccessType: "private",
});
const queue = new azure.storage.Queue("queue", { storageAccountId: account.id });
const table = new azure.storage.Table("table", { storageAccountId: account.id });
const share = new azure.storage.Share("share", { storageAccountId: account.id, quota: 50 });

const blob = new azure.storage.Blob("blob", {
    storageContainerId: container.id,
    type: "Block",
    source: new pulumi.asset.StringAsset("hello world"),
});

const directory = new azure.storage.ShareDirectory("directory", {
    name: "logs",
    storageShareUrl: share.url,
});
const file = new azure.storage.ShareFile("file", {
    name: "readme.txt",
    storageShareUrl: share.url,
    source: "readme.txt",
});

const existing = azure.storage.getStorageContainerOutput({
    name: "existing",
    storageAccountId: account.id,
});

export const containerArmId = container.id; // `id` is now the ARM resource ID
export const containerUrl = container.url;
```

What to watch for:

* **`id` changes meaning.** A container, queue, share or table created with `storageAccountName` had a data-plane URL as its `id`. In v7, `id` is always the Azure Resource Manager ID. The provider migrates existing state automatically, so the resources are not replaced. However, anything that consumed `id` as a URL now receives an ARM ID. Use the `url` output instead. Watch especially for HDInsight's `storageContainerUrl` and any app settings or connection strings built from `id`.
* **`resourceManagerId` was removed** from `Container`, `Queue`, `Share` and their data sources. Use `id` instead.
* `ShareDirectory` and `ShareFile` take the share's `url`, not its `id`.

### Storage account: `staticWebsite` and `queueProperties` moved to their own resources

Remove the blocks from `storage.Account` and declare `storage.AccountStaticWebsite` and `storage.AccountQueueProperties` instead. Creating these resources writes the same settings to the existing account, and nothing is recreated. Make this change together with the v7 upgrade: if you do it on v6, the account and the new resource can both try to manage the same settings.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const account = new azure.storage.Account("site", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountKind: "StorageV2",
    accountTier: "Standard",
    accountReplicationType: "LRS",
    staticWebsite: {
        indexDocument: "index.html",
        error404Document: "404.html",
    },
    queueProperties: {
        logging: { delete: true, read: true, write: true, version: "1.0", retentionPolicyDays: 7 },
        hourMetrics: { version: "1.0", includeApis: true, retentionPolicyDays: 7 },
        minuteMetrics: { version: "1.0", includeApis: false, retentionPolicyDays: 7 },
    },
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const account = new azure.storage.Account("site", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountKind: "StorageV2",
    accountTier: "Standard",
    accountReplicationType: "LRS",
});

const website = new azure.storage.AccountStaticWebsite("site", {
    storageAccountId: account.id,
    indexDocument: "index.html",
    error404Document: "404.html",
});

const queueProperties = new azure.storage.AccountQueueProperties("site", {
    storageAccountId: account.id,
    logging: { delete: true, read: true, write: true, version: "1.0", retentionPolicyDays: 7 },
    hourMetrics: { version: "1.0", includeApis: true, retentionPolicyDays: 7 },
    minuteMetrics: { version: "1.0", includeApis: false, retentionPolicyDays: 7 },
});
```

### Customer-managed keys use a single key ID

**Can be applied on v6.** `storage.CustomerManagedKey` replaces `keyVaultId`, `keyName`, `keyVersion`, `keyVaultUri` and `managedHsmKeyId` with a single `keyVaultKeyId`. The `customerManagedKey` block on `storage.Account` likewise drops `managedHsmKeyId`, and `keyVaultKeyId` is now required there.

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const keyVaultId = config.require("keyVaultId");
const storageAccountId = config.require("storageAccountId");

const cmk = new azure.storage.CustomerManagedKey("cmk", {
    storageAccountId: storageAccountId,
    keyVaultId: keyVaultId,
    keyName: "storage-key",
    // keyVersion omitted => always use the latest version
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const keyVaultId = config.require("keyVaultId");
const storageAccountId = config.require("storageAccountId");

const key = azure.keyvault.getKeyOutput({ name: "storage-key", keyVaultId: keyVaultId });

const cmk = new azure.storage.CustomerManagedKey("cmk", {
    storageAccountId: storageAccountId,
    // Versionless ID => always use the latest version (same as omitting keyVersion).
    // Pass `key.id` instead to pin a specific version.
    // Managed HSM keys (formerly `managedHsmKeyId`) also go here.
    keyVaultKeyId: key.versionlessId,
});
```

The same `managedHsmKeyId` → `keyVaultKeyId` consolidation applies to `compute.DiskEncryptionSet` (where `keyVaultKeyId` is now required), `cosmosdb.Account`, `mssql.ServerTransparentDataEncryption`, `mssql.ManagedInstanceTransparentDataEncryption` and `mysql.FlexibleServer.customerManagedKey`.

## Private DNS records and links

The `ARecord`, `AAAARecord`, `CnameRecord`, `MxRecord`, `PTRRecord`, `SRVRecord` and `TxtRecord` resources, plus `ZoneVirtualNetworkLink`, replace `resourceGroupName` and `zoneName`/`privateDnsZoneName` with a single `privateDnsZoneId`.

This is a v7-only change; `privateDnsZoneId` does not exist in v6.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const vnet = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: rg.name,
    location: rg.location,
    addressSpaces: ["10.0.0.0/16"],
});
const zone = new azure.privatedns.Zone("zone", {
    name: "internal.example.com",
    resourceGroupName: rg.name,
});

const api = new azure.privatedns.ARecord("api", {
    name: "api",
    zoneName: zone.name,
    resourceGroupName: rg.name,
    ttl: 300,
    records: ["10.0.0.4"],
});

const link = new azure.privatedns.ZoneVirtualNetworkLink("link", {
    name: "vnet-link",
    privateDnsZoneName: zone.name,
    resourceGroupName: rg.name,
    virtualNetworkId: vnet.id,
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const vnet = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: rg.name,
    location: rg.location,
    addressSpaces: ["10.0.0.0/16"],
});
const zone = new azure.privatedns.Zone("zone", {
    name: "internal.example.com",
    resourceGroupName: rg.name,
});

const api = new azure.privatedns.ARecord("api", {
    name: "api",
    privateDnsZoneId: zone.id,
    ttl: 300,
    records: ["10.0.0.4"],
});

const link = new azure.privatedns.ZoneVirtualNetworkLink("link", {
    name: "vnet-link",
    privateDnsZoneId: zone.id,
    virtualNetworkId: vnet.id,
});
```

> **Run `pulumi refresh` before `pulumi up`.** `privateDnsZoneId` changes force a replacement, and v6 state does not contain the property. Until a refresh fills it in from the record's ID, `pulumi preview` will show each record and link being replaced. After a refresh the preview should show no changes. If it still proposes a replacement, check that `privateDnsZoneId` points at the same zone as before.

## Event Hubs and Service Bus

**Can be applied on v6.** `eventhub.EventHub` replaces `namespaceName` + `resourceGroupName` with `namespaceId`. The Service Bus lookups (`getQueue`, `getTopic`, `getNamespaceAuthorizationRule`, `getNamespaceDisasterRecoveryConfig`) take a `namespaceId`, and `getSubscription` takes a `topicId`.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const ns = new azure.eventhub.EventHubNamespace("ns", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard",
});

const hub = new azure.eventhub.EventHub("hub", {
    name: "events",
    namespaceName: ns.name,
    resourceGroupName: rg.name,
    partitionCount: 2,
    messageRetention: 1,
});

// Looking up existing Service Bus entities
const queue = azure.servicebus.getQueueOutput({
    name: "orders",
    namespaceName: "my-servicebus",
    resourceGroupName: "shared-rg",
});
const subscription = azure.servicebus.getSubscriptionOutput({
    name: "billing",
    topicName: "invoices",
    namespaceName: "my-servicebus",
    resourceGroupName: "shared-rg",
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const ns = new azure.eventhub.EventHubNamespace("ns", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard",
});

const hub = new azure.eventhub.EventHub("hub", {
    name: "events",
    namespaceId: ns.id,
    partitionCount: 2,
    messageRetention: 1,
});

// Looking up existing Service Bus entities: resolve the parent ID first
const sbNamespace = azure.servicebus.getNamespaceOutput({
    name: "my-servicebus",
    resourceGroupName: "shared-rg",
});
const queue = azure.servicebus.getQueueOutput({
    name: "orders",
    namespaceId: sbNamespace.id,
});
const topic = azure.servicebus.getTopicOutput({
    name: "invoices",
    namespaceId: sbNamespace.id,
});
const subscription = azure.servicebus.getSubscriptionOutput({
    name: "billing",
    topicId: topic.id,
});
```

`servicebus.getQueue`, `getTopic` and `getSubscription` also no longer return the old `enableBatchedOperations`, `enableExpress` and `enablePartitioning` outputs. Read `batchedOperationsEnabled`, `expressEnabled` and `partitioningEnabled` instead.

## Event Grid

* `eventgrid.SystemTopic`: `sourceArmResourceId` → `sourceResourceId` (**can be applied on v6**). The `metricArmResourceId` output was removed; use `metricResourceId`.
* `eventgrid.EventSubscription`, `eventgrid.SystemTopicEventSubscription` and the legacy `eventhub.EventSubscription` rename their endpoint inputs: `eventhubEndpointId` → `eventhubId`, `hybridConnectionEndpointId` → `hybridConnectionId`, `serviceBusQueueEndpointId` → `serviceBusQueueId`, `serviceBusTopicEndpointId` → `serviceBusTopicId`.
* `azureFunctionEndpoint.functionId` is now validated case-sensitively as an Azure Functions resource ID.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const account = new azure.storage.Account("account", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});
const sb = new azure.servicebus.Namespace("sb", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard",
});
const sbQueue = new azure.servicebus.Queue("events", { namespaceId: sb.id });

const systemTopic = new azure.eventgrid.SystemTopic("storage-events", {
    resourceGroupName: rg.name,
    location: rg.location,
    sourceArmResourceId: account.id,
    topicType: "Microsoft.Storage.StorageAccounts",
});

const subscription = new azure.eventgrid.SystemTopicEventSubscription("blob-created", {
    resourceGroupName: rg.name,
    systemTopic: systemTopic.name,
    serviceBusQueueEndpointId: sbQueue.id,
    includedEventTypes: ["Microsoft.Storage.BlobCreated"],
});

const custom = new azure.eventgrid.EventSubscription("account-events", {
    scope: account.id,
    serviceBusQueueEndpointId: sbQueue.id,
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const account = new azure.storage.Account("account", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});
const sb = new azure.servicebus.Namespace("sb", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard",
});
const sbQueue = new azure.servicebus.Queue("events", { namespaceId: sb.id });

const systemTopic = new azure.eventgrid.SystemTopic("storage-events", {
    resourceGroupName: rg.name,
    location: rg.location,
    sourceResourceId: account.id,
    topicType: "Microsoft.Storage.StorageAccounts",
});

const subscription = new azure.eventgrid.SystemTopicEventSubscription("blob-created", {
    resourceGroupName: rg.name,
    systemTopic: systemTopic.name,
    serviceBusQueueId: sbQueue.id,
    includedEventTypes: ["Microsoft.Storage.BlobCreated"],
});

const custom = new azure.eventgrid.EventSubscription("account-events", {
    scope: account.id,
    serviceBusQueueId: sbQueue.id,
});
```

## Key Vault

**Can be applied on v6.**

* `enableRbacAuthorization` was renamed to `rbacAuthorizationEnabled`, and it is now **required**. Vaults that never set it used access policies, so set `rbacAuthorizationEnabled: false` to keep them unchanged.
* The `contacts` block was removed. Manage contacts with `keyvault.CertificateContacts`, where `contacts` is now required.
* `keyvault.getKeyVault` returns `rbacAuthorizationEnabled` instead of `enableRbacAuthorization`.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const current = azure.core.getClientConfigOutput();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const vault = new azure.keyvault.KeyVault("vault", {
    resourceGroupName: rg.name,
    location: rg.location,
    tenantId: current.tenantId,
    skuName: "standard",
    enableRbacAuthorization: true,
    contacts: [{ email: "security@example.com", name: "Security Team" }],
});

const existing = azure.keyvault.getKeyVaultOutput({ name: "shared-kv", resourceGroupName: "shared-rg" });
export const existingUsesRbac = existing.enableRbacAuthorization;
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const current = azure.core.getClientConfigOutput();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const vault = new azure.keyvault.KeyVault("vault", {
    resourceGroupName: rg.name,
    location: rg.location,
    tenantId: current.tenantId,
    skuName: "standard",
    // Now required. Set `false` explicitly for vaults that use access policies.
    rbacAuthorizationEnabled: true,
});

// Certificate contacts are managed by a dedicated resource.
// With RBAC, the caller needs the "Key Vault Certificates Officer" role on the vault.
const contacts = new azure.keyvault.CertificateContacts("vault", {
    keyVaultId: vault.id,
    contacts: [{ email: "security@example.com", name: "Security Team" }],
});

const existing = azure.keyvault.getKeyVaultOutput({ name: "shared-kv", resourceGroupName: "shared-rg" });
export const existingUsesRbac = existing.rbacAuthorizationEnabled;
```

## Renamed boolean properties

**Can be applied on v6** except where marked "v7 only". Booleans named `enableX` or `xDisabled` were renamed to `xEnabled`. When the old name was `...Disabled`, the value flips: `disableIpMasking: true` becomes `ipMaskingEnabled: false`.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const pip = new azure.network.PublicIp("lb", {
    resourceGroupName: rg.name,
    location: rg.location,
    allocationMethod: "Static",
    sku: "Standard",
});
const lb = new azure.lb.LoadBalancer("lb", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard",
    frontendIpConfigurations: [{ name: "public", publicIpAddressId: pip.id }],
});
const pool = new azure.lb.BackendAddressPool("pool", { loadbalancerId: lb.id });

const rule = new azure.lb.Rule("https", {
    loadbalancerId: lb.id,
    protocol: "Tcp",
    frontendPort: 443,
    backendPort: 443,
    frontendIpConfigurationName: "public",
    backendAddressPoolIds: [pool.id],
    enableFloatingIp: false,
    enableTcpReset: true,
});

const insights = new azure.appinsights.Insights("insights", {
    resourceGroupName: rg.name,
    location: rg.location,
    applicationType: "web",
    disableIpMasking: true,
    localAuthenticationDisabled: true,
    dailyDataCapNotificationsDisabled: false,
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const pip = new azure.network.PublicIp("lb", {
    resourceGroupName: rg.name,
    location: rg.location,
    allocationMethod: "Static",
    sku: "Standard",
});
const lb = new azure.lb.LoadBalancer("lb", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard",
    frontendIpConfigurations: [{ name: "public", publicIpAddressId: pip.id }],
});
const pool = new azure.lb.BackendAddressPool("pool", { loadbalancerId: lb.id });

const rule = new azure.lb.Rule("https", {
    loadbalancerId: lb.id,
    protocol: "Tcp",
    frontendPort: 443,
    backendPort: 443,
    frontendIpConfigurationName: "public",
    backendAddressPoolIds: [pool.id],
    floatingIpEnabled: false,
    tcpResetEnabled: true,
});

// Note the inverted meaning: `xDisabled: true` becomes `xEnabled: false`.
const insights = new azure.appinsights.Insights("insights", {
    resourceGroupName: rg.name,
    location: rg.location,
    applicationType: "web",
    ipMaskingEnabled: false,
    localAuthenticationEnabled: false,
    dailyDataCapNotificationsEnabled: true,
});
```

| Resource | v6 | v7 |
| :---- | :---- | :---- |
| `appinsights.Insights` | `disableIpMasking`<br />`localAuthenticationDisabled`<br />`dailyDataCapNotificationsDisabled` | `ipMaskingEnabled` (inverted)<br />`localAuthenticationEnabled` (inverted)<br />`dailyDataCapNotificationsEnabled` (inverted) |
| `cosmosdb.Account` | `localAuthenticationDisabled` | `localAuthenticationEnabled` (inverted) |
| `operationalinsights.AnalyticsWorkspace` | `localAuthenticationDisabled` | `localAuthenticationEnabled` (inverted) |
| `lb.Rule`, `lb.NatRule` | `enableFloatingIp`<br />`enableTcpReset` | `floatingIpEnabled`<br />`tcpResetEnabled` |
| `lb.OutboundRule` | `enableTcpReset` | `tcpResetEnabled` |
| `network.ApplicationGateway` | `enableHttp2` | `http2Enabled` |
| `network.ExpressRouteConnection` | `enableInternetSecurity` | `internetSecurityEnabled` |
| `network.VirtualNetworkGateway`, `network.VirtualNetworkGatewayConnection` | `enableBgp` | `bgpEnabled` |
| `privatedns.LinkService` | `enableProxyProtocol` | `proxyProtocolEnabled` |
| `bot.ChannelTeams` | `enableCalling` | `callingEnabled` |
| `compute.WindowsVirtualMachine` | `enableAutomaticUpdates` | `automaticUpdatesEnabled` |
| `compute.WindowsVirtualMachineScaleSet` | `enableAutomaticUpdates` | `automaticUpdatesEnabled` (v7 only) |
| `mssql.ServerSecurityAlertPolicy` | `emailAccountAdmins` | `emailAccountAdminsEnabled` (v7 only) |
| `apimanagement.Service` `protocols` | `enableHttp2` | `http2Enabled` |
| `apimanagement.Service` `security` | `enableBackendSsl30`, `enableBackendTls10`, `enableBackendTls11`, `enableFrontendSsl30`, `enableFrontendTls10`, `enableFrontendTls11` | `backendSsl30Enabled`, `backendTls10Enabled`, `backendTls11Enabled`, `frontendSsl30Enabled`, `frontendTls10Enabled`, `frontendTls11Enabled` |

The data sources follow the same renames. For example, `lb.getLBRule` returns `floatingIpEnabled`/`tcpResetEnabled`, and `network.getGatewayConnection` returns `bgpEnabled`.

## Subnet service endpoints are now blocks

v7 only. On `network.Subnet` and on the inline `subnets` of `network.VirtualNetwork`, `serviceEndpoints` changed from a list of strings to a list of `{ service, networkIdentifier? }` objects. `network.getSubnet` returns the same object shape.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const vnet = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: rg.name,
    location: rg.location,
    addressSpaces: ["10.0.0.0/16"],
    subnets: [{
        name: "inline",
        addressPrefixes: ["10.0.1.0/24"],
        serviceEndpoints: ["Microsoft.Storage"],
    }],
});

const subnet = new azure.network.Subnet("apps", {
    resourceGroupName: rg.name,
    virtualNetworkName: vnet.name,
    addressPrefixes: ["10.0.2.0/24"],
    serviceEndpoints: ["Microsoft.Storage", "Microsoft.KeyVault"],
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const vnet = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: rg.name,
    location: rg.location,
    addressSpaces: ["10.0.0.0/16"],
    subnets: [{
        name: "inline",
        addressPrefixes: ["10.0.1.0/24"],
        serviceEndpoints: [{ service: "Microsoft.Storage" }],
    }],
});

const subnet = new azure.network.Subnet("apps", {
    resourceGroupName: rg.name,
    virtualNetworkName: vnet.name,
    addressPrefixes: ["10.0.2.0/24"],
    // Mechanical conversion of an existing list:
    serviceEndpoints: ["Microsoft.Storage", "Microsoft.KeyVault"].map(service => ({ service })),
});
```

## Network Watcher flow logs

**Can be applied on v6.** `networkSecurityGroupId` was replaced by `targetResourceId`. Pointing it at the same NSG keeps the existing flow log. Azure is retiring NSG flow logs, so create new flow logs against a virtual network, subnet or network interface.

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();

const flowLog = new azure.network.NetworkWatcherFlowLog("nsg", {
    networkWatcherName: "NetworkWatcher_westeurope",
    resourceGroupName: "NetworkWatcherRG",
    networkSecurityGroupId: config.require("nsgId"),
    storageAccountId: config.require("flowLogStorageAccountId"),
    enabled: true,
    retentionPolicy: { enabled: true, days: 7 },
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();

const flowLog = new azure.network.NetworkWatcherFlowLog("nsg", {
    networkWatcherName: "NetworkWatcher_westeurope",
    resourceGroupName: "NetworkWatcherRG",
    targetResourceId: config.require("nsgId"),
    storageAccountId: config.require("flowLogStorageAccountId"),
    enabled: true,
    retentionPolicy: { enabled: true, days: 7 },
});
```

## Virtual machines and scale sets

### Linux and Windows scale sets

v7 only. On `compute.LinuxVirtualMachineScaleSet` and `compute.WindowsVirtualMachineScaleSet`:

* `automaticOsUpgradePolicy.enableAutomaticOsUpgrade` → `automaticOsUpgradeEnabled`
* `automaticOsUpgradePolicy.disableAutomaticRollback` → `automaticRollbackEnabled`. The meaning is inverted.
* `networkInterfaces[].enableAcceleratedNetworking` → `acceleratedNetworkingEnabled`
* `networkInterfaces[].enableIpForwarding` → `ipForwardingEnabled`
* `dataDisks[].ultraSsdDiskIopsReadWrite` → `diskIopsReadWrite`, and `ultraSsdDiskMbpsReadWrite` → `diskMbpsReadWrite`

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const vmss = new azure.compute.LinuxVirtualMachineScaleSet("web", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard_D2s_v5",
    instances: 2,
    zones: ["1"],
    adminUsername: "azureuser",
    adminSshKeys: [{ username: "azureuser", publicKey: config.require("sshPublicKey") }],
    sourceImageReference: {
        publisher: "Canonical",
        offer: "ubuntu-24_04-lts",
        sku: "server",
        version: "latest",
    },
    osDisk: { caching: "ReadWrite", storageAccountType: "Premium_LRS" },
    additionalCapabilities: { ultraSsdEnabled: true },
    dataDisks: [{
        lun: 0,
        caching: "None",
        diskSizeGb: 64,
        storageAccountType: "UltraSSD_LRS",
        ultraSsdDiskIopsReadWrite: 2000,
        ultraSsdDiskMbpsReadWrite: 125,
    }],
    networkInterfaces: [{
        name: "primary",
        primary: true,
        enableAcceleratedNetworking: true,
        enableIpForwarding: false,
        ipConfigurations: [{ name: "internal", primary: true, subnetId: config.require("subnetId") }],
    }],
    upgradeMode: "Automatic",
    automaticOsUpgradePolicy: {
        enableAutomaticOsUpgrade: true,
        disableAutomaticRollback: false,
    },
    extensions: [{
        name: "health",
        publisher: "Microsoft.ManagedServices",
        type: "ApplicationHealthLinux",
        typeHandlerVersion: "1.0",
        settings: JSON.stringify({ protocol: "http", port: 80, requestPath: "/healthz" }),
    }],
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const vmss = new azure.compute.LinuxVirtualMachineScaleSet("web", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Standard_D2s_v5",
    instances: 2,
    zones: ["1"],
    adminUsername: "azureuser",
    adminSshKeys: [{ username: "azureuser", publicKey: config.require("sshPublicKey") }],
    sourceImageReference: {
        publisher: "Canonical",
        offer: "ubuntu-24_04-lts",
        sku: "server",
        version: "latest",
    },
    osDisk: { caching: "ReadWrite", storageAccountType: "Premium_LRS" },
    additionalCapabilities: { ultraSsdEnabled: true },
    dataDisks: [{
        lun: 0,
        caching: "None",
        diskSizeGb: 64,
        storageAccountType: "UltraSSD_LRS",
        diskIopsReadWrite: 2000,
        diskMbpsReadWrite: 125,
    }],
    networkInterfaces: [{
        name: "primary",
        primary: true,
        acceleratedNetworkingEnabled: true,
        ipForwardingEnabled: false,
        ipConfigurations: [{ name: "internal", primary: true, subnetId: config.require("subnetId") }],
    }],
    upgradeMode: "Automatic",
    automaticOsUpgradePolicy: {
        automaticOsUpgradeEnabled: true,
        automaticRollbackEnabled: true, // was `disableAutomaticRollback: false`
    },
    extensions: [{
        name: "health",
        publisher: "Microsoft.ManagedServices",
        type: "ApplicationHealthLinux",
        typeHandlerVersion: "1.0",
        settings: JSON.stringify({ protocol: "http", port: 80, requestPath: "/healthz" }),
    }],
});
```

`compute.OrchestratedVirtualMachineScaleSet` has the same `networkInterfaces` and `dataDisks` renames, plus:

* `osProfile.windowsConfiguration.enableAutomaticUpdates` → `automaticUpdatesEnabled`
* `skuProfile.vmSizes: ["Standard_D2s_v5", ...]` → `skuProfile.virtualMachineSizes: [{ name: "Standard_D2s_v5", rank?: 0 }, ...]`. This is now required.

### Linux and Windows virtual machines

**Can be applied on v6.** `vmAgentPlatformUpdatesEnabled` can no longer be set, because Azure made it read-only. Remove it; the output is still available. On Windows VMs, `enableAutomaticUpdates` was renamed to `automaticUpdatesEnabled`.

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const vm = new azure.compute.WindowsVirtualMachine("win", {
    resourceGroupName: rg.name,
    location: rg.location,
    size: "Standard_D2s_v5",
    adminUsername: "azureadmin",
    adminPassword: config.requireSecret("adminPassword"),
    networkInterfaceIds: [config.require("nicId")],
    osDisk: { caching: "ReadWrite", storageAccountType: "Premium_LRS" },
    sourceImageReference: {
        publisher: "MicrosoftWindowsServer",
        offer: "WindowsServer",
        sku: "2022-datacenter-azure-edition",
        version: "latest",
    },
    enableAutomaticUpdates: true,
    vmAgentPlatformUpdatesEnabled: true,
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const vm = new azure.compute.WindowsVirtualMachine("win", {
    resourceGroupName: rg.name,
    location: rg.location,
    size: "Standard_D2s_v5",
    adminUsername: "azureadmin",
    adminPassword: config.requireSecret("adminPassword"),
    networkInterfaceIds: [config.require("nicId")],
    osDisk: { caching: "ReadWrite", storageAccountType: "Premium_LRS" },
    sourceImageReference: {
        publisher: "MicrosoftWindowsServer",
        offer: "WindowsServer",
        sku: "2022-datacenter-azure-edition",
        version: "latest",
    },
    automaticUpdatesEnabled: true,
    // `vmAgentPlatformUpdatesEnabled` is now read-only: delete it from your program
    // and read it from `vm.vmAgentPlatformUpdatesEnabled` if you need the value.
});

export const platformUpdates = vm.vmAgentPlatformUpdatesEnabled;
```

## Kubernetes (AKS)

**Can be applied on v6.** On `containerservice.KubernetesCluster`:

* **`nodeProvisioningProfile` is now required.** Use `{ mode: "Manual" }` for the v6 behaviour, where you manage node pools yourself.
* **`oidcIssuerEnabled` now defaults to `true`.** For an existing cluster that never set it, the next `pulumi up` would turn the OIDC issuer on, and that cannot be undone. Set it explicitly (to `false` if you don't want it) before upgrading.
* `linuxOsConfig.transparentHugePageEnabled` → `transparentHugePage`, on `defaultNodePool` and on `KubernetesClusterNodePool`.
* `kubeletConfig.containerLogMaxLine` → `containerLogMaxFiles`, on `defaultNodePool` and on `KubernetesClusterNodePool`.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const cluster = new azure.containerservice.KubernetesCluster("aks", {
    resourceGroupName: rg.name,
    location: rg.location,
    dnsPrefix: "aks",
    identity: { type: "SystemAssigned" },
    defaultNodePool: {
        name: "system",
        vmSize: "Standard_D2s_v5",
        nodeCount: 2,
        linuxOsConfig: { transparentHugePageEnabled: "madvise" },
        kubeletConfig: { containerLogMaxLine: 5 },
    },
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const cluster = new azure.containerservice.KubernetesCluster("aks", {
    resourceGroupName: rg.name,
    location: rg.location,
    dnsPrefix: "aks",
    identity: { type: "SystemAssigned" },
    defaultNodePool: {
        name: "system",
        vmSize: "Standard_D2s_v5",
        nodeCount: 2,
        linuxOsConfig: { transparentHugePage: "madvise" },
        kubeletConfig: { containerLogMaxFiles: 5 },
    },
    // Now required. `Manual` is the v6 behaviour (you manage node pools yourself);
    // `Auto` turns on node auto-provisioning.
    nodeProvisioningProfile: { mode: "Manual" },
    // Now defaults to `true`, and enabling it cannot be undone.
    // Pin it to keep an existing cluster unchanged.
    oidcIssuerEnabled: false,
});
```

## Diagnostic settings

**Can be applied on v6.** On `monitoring.DiagnosticSetting`:

* The `metrics` block was replaced by `enabledMetrics`, which contains only `category`. Entries with `enabled: false` are dropped, and per-metric `retentionPolicy` is gone.
* `enabledLogs[].retentionPolicy` was removed. Azure no longer supports retention on diagnostic settings, so configure retention at the destination instead.

`monitoring.AadDiagnosticSetting` drops `enabledLogs[].retentionPolicy` too.

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();

const diagnostics = new azure.monitoring.DiagnosticSetting("kv-diagnostics", {
    targetResourceId: config.require("keyVaultId"),
    logAnalyticsWorkspaceId: config.require("workspaceId"),
    enabledLogs: [{
        category: "AuditEvent",
        retentionPolicy: { enabled: false, days: 0 },
    }],
    metrics: [
        { category: "AllMetrics", enabled: true },
    ],
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();

const diagnostics = new azure.monitoring.DiagnosticSetting("kv-diagnostics", {
    targetResourceId: config.require("keyVaultId"),
    logAnalyticsWorkspaceId: config.require("workspaceId"),
    enabledLogs: [{
        category: "AuditEvent",
        // `retentionPolicy` is gone. Use azure.storage.ManagementPolicy for
        // storage destinations, or the workspace's own retention settings.
    }],
    // Only list the metric categories you want enabled. An entry that had
    // `enabled: false` is simply dropped.
    enabledMetrics: [
        { category: "AllMetrics" },
    ],
});
```

## Front Door rules

v7 only. `cdn.FrontdoorRule` was rewritten to match the `cdn.FrontdoorBatchRuleSet` schema. Every condition and action block has a new name, and these patterns apply throughout:

* `behaviorOnMatch` → `behaviourOnMatch`
* Condition lists lose the `Conditions` suffix: `requestSchemeConditions` → `requestSchemes`.
* `matchValues` → `values`
* `negateCondition: true` was removed. Use the negated operator instead: `BeginsWith` becomes `NotBeginsWith`.
* Several operators that were optional are now required. `RemoteAddress` and `SocketAddress` no longer accept the `Any` operator.
* Action blocks lose the `Action` suffix. Header actions use `operator` and `headerValue` instead of `headerAction` and `value`.
* `urlRedirect` no longer accepts empty strings. To preserve part of the incoming request, omit that field.

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();

const rule = new azure.cdn.FrontdoorRule("redirect-http", {
    cdnFrontdoorRuleSetId: config.require("ruleSetId"),
    order: 1,
    behaviorOnMatch: "Continue",
    conditions: {
        requestSchemeConditions: [{ operator: "Equal", matchValues: "HTTP" }],
        urlPathConditions: [{
            operator: "BeginsWith",
            matchValues: ["internal/"],
            negateCondition: true,
        }],
    },
    actions: {
        urlRedirectAction: {
            redirectType: "PermanentRedirect",
            redirectProtocol: "Https",
            destinationHostname: "",
        },
        responseHeaderActions: [{
            headerAction: "Overwrite",
            headerName: "Strict-Transport-Security",
            value: "max-age=31536000",
        }],
    },
});

const cacheRule = new azure.cdn.FrontdoorRule("cache-static", {
    cdnFrontdoorRuleSetId: config.require("ruleSetId"),
    order: 2,
    conditions: {
        urlFileExtensionConditions: [{ operator: "Equal", matchValues: ["css", "js"] }],
    },
    actions: {
        routeConfigurationOverrideAction: {
            cacheBehavior: "OverrideAlways",
            cacheDuration: "1.00:00:00",
            compressionEnabled: true,
            queryStringCachingBehavior: "IgnoreQueryString",
        },
    },
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();

const rule = new azure.cdn.FrontdoorRule("redirect-http", {
    cdnFrontdoorRuleSetId: config.require("ruleSetId"),
    order: 1,
    behaviourOnMatch: "Continue",
    conditions: {
        // `...Conditions` lists drop the suffix; `matchValues` becomes `values`.
        requestSchemes: [{ operator: "Equal", values: "HTTP" }],
        // `negateCondition: true` is folded into the operator as `Not{Operator}`.
        requestPaths: [{ operator: "NotBeginsWith", values: ["internal/"] }],
    },
    actions: {
        urlRedirect: {
            redirectType: "PermanentRedirect",
            redirectProtocol: "Https",
            // Empty strings are rejected now: omit the field to preserve the incoming value.
        },
        modifyResponseHeaders: [{
            operator: "Overwrite",
            headerName: "Strict-Transport-Security",
            headerValue: "max-age=31536000",
        }],
    },
});

const cacheRule = new azure.cdn.FrontdoorRule("cache-static", {
    cdnFrontdoorRuleSetId: config.require("ruleSetId"),
    order: 2,
    conditions: {
        requestFileExtensions: [{ operator: "Equal", values: ["css", "js"] }],
    },
    actions: {
        routeConfigurationOverride: {
            caching: {
                behaviour: "OverrideAlways",
                duration: "1.00:00:00",
                compressionEnabled: true,
                queryStringBehaviour: "IgnoreQueryString",
            },
        },
    },
});
```

| v6 condition | v7 condition |
| :---- | :---- |
| `clientPortConditions` | `clientPorts` |
| `cookiesConditions` (`cookieName`) | `requestCookies` (`name`) |
| `hostNameConditions` | `hostNames` |
| `httpVersionConditions` | `httpVersions` |
| `isDeviceConditions` | `deviceTypes` |
| `postArgsConditions` (`postArgsName`) | `postArguments` (`name`) |
| `queryStringConditions` | `queryStrings` |
| `remoteAddressConditions` | `remoteAddresses` |
| `requestBodyConditions` | `requestBodies` |
| `requestHeaderConditions` (`headerName`) | `requestHeaders` (`name`) |
| `requestMethodConditions` | `requestMethods` |
| `requestSchemeConditions` | `requestSchemes` |
| `requestUriConditions` | `requestUrls` |
| `serverPortConditions` | `serverPorts` |
| `socketAddressConditions` | `socketAddresses` |
| `sslProtocolConditions` | `sslProtocols` |
| `urlFileExtensionConditions` | `requestFileExtensions` |
| `urlFilenameConditions` | `requestFilenames` |
| `urlPathConditions` | `requestPaths` |

| v6 action | v7 action |
| :---- | :---- |
| `requestHeaderActions` | `modifyRequestHeaders` |
| `responseHeaderActions` | `modifyResponseHeaders` |
| `urlRedirectAction` (`destinationHostname`) | `urlRedirect` (`destinationHostName`) |
| `urlRewriteAction` (`destination`, `preserveUnmatchedPath`) | `urlRewrite` |
| `routeConfigurationOverrideAction` | `routeConfigurationOverride` with nested `caching` (`behaviour`, `duration`, `compressionEnabled`, `queryStringBehaviour`, `queryStringParameters`) and `originGroup` (`cdnFrontdoorOriginGroupId`, `forwardingProtocol`) |

`cdn.FrontdoorCustomDomain` also changed: `tls.minimumTlsVersion` → `tls.minimumVersion` (**can be applied on v6**).

## SQL

* `mssql.ServerSecurityAlertPolicy`: `emailAccountAdmins` → `emailAccountAdminsEnabled`.
* `mssql.ServerExtendedAuditingPolicy`, `mssql.DatabaseExtendedAuditingPolicy`: `storageEndpoint` → `blobStorageEndpoint`.
* `mssql.Database`: `threatDetectionPolicy.emailAccountAdmins` (`"Enabled"`/`"Disabled"`) → `emailAccountAdminsEnabled` (boolean).
* `mssql.Database`, `mssql.ManagedDatabase`: `longTermRetentionPolicy.immutableBackupsEnabled` was removed. Unset `weeklyRetention`, `monthlyRetention` and `yearlyRetention` now default to `PT0S`.
* `mssql.VirtualMachine`: `autoBackup.encryptionEnabled` was removed. Encryption is on whenever `encryptionPassword` is set.

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const server = new azure.mssql.Server("sql", {
    resourceGroupName: rg.name,
    location: rg.location,
    version: "12.0",
    administratorLogin: "sqladmin",
    administratorLoginPassword: config.requireSecret("sqlPassword"),
    minimumTlsVersion: "1.2",
});

const alerts = new azure.mssql.ServerSecurityAlertPolicy("alerts", {
    resourceGroupName: rg.name,
    serverName: server.name,
    state: "Enabled",
    emailAccountAdmins: true,
});

const auditing = new azure.mssql.ServerExtendedAuditingPolicy("auditing", {
    serverId: server.id,
    storageEndpoint: "https://auditlogs.blob.core.windows.net/",
    retentionInDays: 30,
});

const db = new azure.mssql.Database("db", {
    serverId: server.id,
    skuName: "S0",
    threatDetectionPolicy: { state: "Enabled", emailAccountAdmins: "Enabled" },
    longTermRetentionPolicy: { weeklyRetention: "P4W", immutableBackupsEnabled: false },
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const server = new azure.mssql.Server("sql", {
    resourceGroupName: rg.name,
    location: rg.location,
    version: "12.0",
    administratorLogin: "sqladmin",
    administratorLoginPassword: config.requireSecret("sqlPassword"),
    minimumTlsVersion: "1.2", // `1.0`, `1.1` and `Disabled` are no longer accepted
});

const alerts = new azure.mssql.ServerSecurityAlertPolicy("alerts", {
    resourceGroupName: rg.name,
    serverName: server.name,
    state: "Enabled",
    emailAccountAdminsEnabled: true,
});

const auditing = new azure.mssql.ServerExtendedAuditingPolicy("auditing", {
    serverId: server.id,
    blobStorageEndpoint: "https://auditlogs.blob.core.windows.net/",
    retentionInDays: 30,
});

const db = new azure.mssql.Database("db", {
    serverId: server.id,
    skuName: "S0",
    // The string "Enabled"/"Disabled" became a boolean.
    threatDetectionPolicy: { state: "Enabled", emailAccountAdminsEnabled: true },
    // `immutableBackupsEnabled` was removed (it never did anything).
    // Unset monthly/yearly retentions now default to `PT0S` (no retention).
    longTermRetentionPolicy: { weeklyRetention: "P4W" },
});
```

## Data Factory, Stream Analytics and Data Explorer

* `datafactory.Pipeline`: the misspelled `moniterMetricsAfterDuration` is now `monitorMetricsAfterDuration`.
* `datafactory.LinkedServiceAzureBlobStorage`: `keyVaultSasToken` → `sasTokenLinkedKeyVaultKey` (**can be applied on v6**).
* `datafactory.LinkedServiceAzureDatabricks`: `msiWorkSpaceResourceId` → `msiWorkspaceId` (**can be applied on v6**).
* `streamanalytics.Job`: the `jobStorageAccounts` list became a single `jobStorageAccount` object.
* `kusto.Cluster`: **the v6 property `languageExtension` is now called `languageExtensions`.** This catches out anyone who followed the v6 deprecation warning. v6 recommended `languageExtension` over the deprecated `languageExtensions`. In v7 the deprecated property is gone and the surviving one takes the plural name, with the same shape. `virtualNetworkConfiguration` was also removed, because Azure no longer supports it.
* `kusto.AttachedDatabaseConfiguration`: `clusterResourceId` → `clusterId` (**can be applied on v6**).
* `kusto.EventGridDataConnection`: `eventgridResourceId` → `eventgridEventSubscriptionId`, and `managedIdentityResourceId` → `managedIdentityId` (**can be applied on v6**).

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const pipeline = new azure.datafactory.Pipeline("pipeline", {
    dataFactoryId: config.require("dataFactoryId"),
    moniterMetricsAfterDuration: "00:30:00",
});

const job = new azure.streamanalytics.Job("job", {
    resourceGroupName: rg.name,
    location: rg.location,
    streamingUnits: 3,
    transformationQuery: "SELECT * INTO [out] FROM [in]",
    contentStoragePolicy: "JobStorageAccount",
    jobStorageAccounts: [{
        accountName: "jobstorage",
        accountKey: config.requireSecret("jobStorageKey"),
        authenticationMode: "ConnectionString",
    }],
});

const kusto = new azure.kusto.Cluster("kusto", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: { name: "Standard_D13_v2", capacity: 2 },
    languageExtension: [{ name: "PYTHON", image: "Python3_11_7" }],
});
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const pipeline = new azure.datafactory.Pipeline("pipeline", {
    dataFactoryId: config.require("dataFactoryId"),
    monitorMetricsAfterDuration: "00:30:00", // typo fixed
});

const job = new azure.streamanalytics.Job("job", {
    resourceGroupName: rg.name,
    location: rg.location,
    streamingUnits: 3,
    transformationQuery: "SELECT * INTO [out] FROM [in]",
    contentStoragePolicy: "JobStorageAccount",
    // A single object instead of a one-element list.
    jobStorageAccount: {
        accountName: "jobstorage",
        accountKey: config.requireSecret("jobStorageKey"),
        authenticationMode: "ConnectionString",
    },
});

const kusto = new azure.kusto.Cluster("kusto", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: { name: "Standard_D13_v2", capacity: 2 },
    // v6 `languageExtension` is now `languageExtensions` (same shape).
    languageExtensions: [{ name: "PYTHON", image: "Python3_11_7" }],
});
```

## Managed identity and Log Analytics

* `armmsi.FederatedIdentityCredential`: `parentId` → `userAssignedIdentityId`. `resourceGroupName` was removed, because the identity ID already contains it (**can be applied on v6**).
* `operationalinsights.AnalyticsWorkspace`: `internetIngestionEnabled`/`internetQueryEnabled` (booleans) → `internetIngestionAccessType`/`internetQueryAccessType` (`"Enabled"`, `"Disabled"` or `"SecuredByPerimeter"`).
* `loganalytics.LinkedStorageAccount`: `workspaceResourceId` → `workspaceId`, which is now required.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const identity = new azure.authorization.UserAssignedIdentity("ci", {
    resourceGroupName: rg.name,
    location: rg.location,
});

const federated = new azure.armmsi.FederatedIdentityCredential("github", {
    resourceGroupName: rg.name,
    parentId: identity.id,
    audience: "api://AzureADTokenExchange",
    issuer: "https://token.actions.githubusercontent.com",
    subject: "repo:my-org/my-repo:ref:refs/heads/main",
});

const workspace = new azure.operationalinsights.AnalyticsWorkspace("logs", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "PerGB2018",
    retentionInDays: 30,
    internetIngestionEnabled: true,
    internetQueryEnabled: false,
    localAuthenticationDisabled: true,
});

const account = new azure.storage.Account("logstore", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});
const linked = new azure.loganalytics.LinkedStorageAccount("customlogs", {
    dataSourceType: "CustomLogs",
    resourceGroupName: rg.name,
    workspaceResourceId: workspace.id,
    storageAccountIds: [account.id],
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const identity = new azure.authorization.UserAssignedIdentity("ci", {
    resourceGroupName: rg.name,
    location: rg.location,
});

const federated = new azure.armmsi.FederatedIdentityCredential("github", {
    userAssignedIdentityId: identity.id,
    audience: "api://AzureADTokenExchange",
    issuer: "https://token.actions.githubusercontent.com",
    subject: "repo:my-org/my-repo:ref:refs/heads/main",
});

const workspace = new azure.operationalinsights.AnalyticsWorkspace("logs", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "PerGB2018",
    retentionInDays: 30,
    // Booleans became access types: "Enabled" | "Disabled" | "SecuredByPerimeter"
    internetIngestionAccessType: "Enabled",
    internetQueryAccessType: "Disabled",
    localAuthenticationEnabled: false,
});

const account = new azure.storage.Account("logstore", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});
const linked = new azure.loganalytics.LinkedStorageAccount("customlogs", {
    dataSourceType: "CustomLogs",
    resourceGroupName: rg.name,
    workspaceId: workspace.id,
    storageAccountIds: [account.id],
});
```

## Container Registry

v7 only. On `containerservice.Registry`:

* `georeplications[].regionalEndpointEnabled` → `globalEndpointRoutingEnabled`, which is now required.
* `trustPolicyEnabled` was removed.
* `encryption` is no longer computed. If you configure customer-managed encryption, keep the `encryption` block in your program.

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const registry = new azure.containerservice.Registry("acr", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Premium",
    trustPolicyEnabled: true,
    georeplications: [{
        location: "northeurope",
        regionalEndpointEnabled: true,
        zoneRedundancyEnabled: true,
    }],
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const registry = new azure.containerservice.Registry("acr", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "Premium",
    // `trustPolicyEnabled` removed: Docker Content Trust is retired in ACR.
    georeplications: [{
        location: "northeurope",
        // Now required, and the replacement for `regionalEndpointEnabled`.
        globalEndpointRoutingEnabled: true,
        zoneRedundancyEnabled: true,
    }],
});
```

## HDInsight and API Management

v7 only. These are large resources, so the example shows only the nested blocks that changed.

* **HDInsight** (`HadoopCluster`, `HBaseCluster`, `InteractiveQueryCluster`, `KafkaCluster`, `SparkCluster`):
  * `tlsMinVersion` is now required, and changing it replaces the cluster. Set it to the value the cluster already has, which you can find with `pulumi stack export`.
  * In `storageAccounts`: `storageResourceId` → `storageAccountId`, and `storageContainerId` → `storageContainerUrl`. This takes the container's data-plane URL, so use `container.url`, not `container.id`.
  * In `storageAccountGen2`: `storageResourceId` → `storageAccountId`, and `managedIdentityResourceId` → `userAssignedIdentityId`.
* **API Management**: in `apimanagement.Service` `hostnameConfiguration` (all hostname types) and in `apimanagement.CustomDomain`, `keyVaultId` → `keyVaultCertificateId` (**can be applied on v6**). The `security` and `protocols` renames are listed in [Renamed boolean properties](#renamed-boolean-properties).

**v6**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const account = azure.storage.getAccountOutput({ name: "hdistore", resourceGroupName: "data-rg" });
const container = azure.storage.getStorageContainerOutput({ name: "hdinsight", storageAccountName: "hdistore" });

// HDInsight (Hadoop / HBase / InteractiveQuery / Kafka / Spark clusters)
const storageAccounts: azure.types.input.hdinsight.HadoopClusterStorageAccount[] = [{
    isDefault: true,
    storageAccountKey: account.primaryAccessKey,
    storageContainerId: container.id,      // the container's data-plane URL in v6
    storageResourceId: account.id,
}];
const storageAccountGen2: azure.types.input.hdinsight.HadoopClusterStorageAccountGen2 = {
    isDefault: true,
    filesystemId: config.require("filesystemId"),
    storageResourceId: account.id,
    managedIdentityResourceId: config.require("identityId"),
};

// API Management (Service, CustomDomain)
const hostnames: azure.types.input.apimanagement.ServiceHostnameConfiguration = {
    proxies: [{ hostName: "api.example.com", keyVaultId: config.require("certSecretId") }],
};
const security: azure.types.input.apimanagement.ServiceSecurity = {
    enableBackendTls10: false,
    enableFrontendTls11: false,
};
const protocols: azure.types.input.apimanagement.ServiceProtocols = { enableHttp2: true };
```

**v7**

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const config = new pulumi.Config();
const account = azure.storage.getAccountOutput({ name: "hdistore", resourceGroupName: "data-rg" });
const container = azure.storage.getStorageContainerOutput({ name: "hdinsight", storageAccountId: account.id });

// HDInsight (Hadoop / HBase / InteractiveQuery / Kafka / Spark clusters)
// Note: every cluster type also requires `tlsMinVersion: "1.2"` at the top level now.
const storageAccounts: azure.types.input.hdinsight.HadoopClusterStorageAccount[] = [{
    isDefault: true,
    storageAccountKey: account.primaryAccessKey,
    storageContainerUrl: container.url,    // `container.id` is an ARM ID in v7, use `url`
    storageAccountId: account.id,
}];
const storageAccountGen2: azure.types.input.hdinsight.HadoopClusterStorageAccountGen2 = {
    isDefault: true,
    filesystemId: config.require("filesystemId"),
    storageAccountId: account.id,
    userAssignedIdentityId: config.require("identityId"),
};

// API Management (Service, CustomDomain)
const hostnames: azure.types.input.apimanagement.ServiceHostnameConfiguration = {
    proxies: [{ hostName: "api.example.com", keyVaultCertificateId: config.require("certSecretId") }],
};
const security: azure.types.input.apimanagement.ServiceSecurity = {
    backendTls10Enabled: false,
    frontendTls11Enabled: false,
};
const protocols: azure.types.input.apimanagement.ServiceProtocols = { http2Enabled: true };
```

## Newly required inputs

| Resource | Now required | Notes |
| :---- | :---- | :---- |
| `containerservice.KubernetesCluster` | `nodeProvisioningProfile` | `{ mode: "Manual" }` matches v6. See [AKS](#kubernetes-aks). |
| `keyvault.KeyVault` | `rbacAuthorizationEnabled` | Use `false` for vaults that use access policies. |
| `keyvault.CertificateContacts` | `contacts` | |
| `communication.Service` | `dataLocation` | Previously defaulted to `"United States"`. |
| `bot.ChannelsRegistration`, `bot.ServiceAzureBot`, `bot.WebApp` | `microsoftAppType` | `"MultiTenant"`, `"SingleTenant"` or `"UserAssignedMSI"` |
| `hdinsight.*Cluster` | `tlsMinVersion` | Changing it forces a replacement. Set it to the cluster's current value, which is in the stack's state (`pulumi stack export`). |
| `loganalytics.LinkedStorageAccount` | `workspaceId` | Replaces `workspaceResourceId`. |
| `datadog.MonitorSsoConfiguration` | `singleSignOn` | Replaces `singleSignOnEnabled`; same values. |
| `containerservice.Registry` `georeplications` | `globalEndpointRoutingEnabled` | |
| `compute.OrchestratedVirtualMachineScaleSet` `skuProfile` | `virtualMachineSizes` | Replaces `vmSizes`. |
| `siterecovery.ProtectionContainerMapping` `automaticUpdate` | `automationAccountId` | `automaticUpdate.enabled` was removed; omit the block to disable. |
| `securitycenter.Automation` `actions` | `type` | Values are now `LogicApp`, `EventHub` and `Workspace`, replacing `logicapp`, `eventhub` and `loganalytics`. |
| `storage.Account` `customerManagedKey` | `keyVaultKeyId` | |
| Parent references | `storageAccountId`, `storageContainerId`, `storageShareUrl`, `privateDnsZoneId`, `namespaceId`, `userAssignedIdentityId`, `clusterId`, `sourceResourceId`, `targetResourceId`, `keyVaultKeyId` | See the sections above. |

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

// Previously defaulted to "United States".
const acs = new azure.communication.Service("acs", {
    resourceGroupName: rg.name,
});

// Previously optional.
const bot = new azure.bot.ServiceAzureBot("bot", {
    resourceGroupName: rg.name,
    location: "global",
    sku: "F0",
    microsoftAppId: "00000000-0000-0000-0000-000000000000",
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });

const acs = new azure.communication.Service("acs", {
    resourceGroupName: rg.name,
    dataLocation: "United States", // the old default; changing it replaces the service
});

const bot = new azure.bot.ServiceAzureBot("bot", {
    resourceGroupName: rg.name,
    location: "global",
    sku: "F0",
    microsoftAppId: "00000000-0000-0000-0000-000000000000",
    microsoftAppType: "SingleTenant", // or "MultiTenant" / "UserAssignedMSI"
    microsoftAppTenantId: "11111111-1111-1111-1111-111111111111",
});
```

## Other renamed and removed properties

| Resource | v6 | v7 |
| :---- | :---- | :---- |
| `network.ApplicationGateway` | `authenticationCertificates`, `backendHttpSettings[].authenticationCertificates` | Removed (a v1 SKU feature). Use `trustedRootCertificates`. |
| `network.ApplicationGateway` | `sslProfiles[].verifyClientCertIssuerDn` | `verifyClientCertificateIssuerDn` |
| `network.ExpressRouteConnection` | `privateLinkFastPathEnabled` | Removed |
| `lb.LoadBalancer` | `subnetId`, `publicIpAddressId` (top level) | Removed. Set them on `frontendIpConfigurations`. |
| `containerapp.App`, `containerapp.Job` | `template.containers[].livenessProbes[]` / `startupProbe.terminationGracePeriodSeconds` | Removed |
| `appservice.LinuxWebApp`, `appservice.LinuxWebAppSlot` | `siteConfig.applicationStack.rubyVersion` | Removed |
| `logicapps.Standard` | `siteConfig.publicNetworkAccessEnabled` | `publicNetworkAccess` (top level) |
| `mysql.FlexibleServer` | `publicNetworkAccessEnabled` output | `publicNetworkAccess` |
| `netapp.Volume` | `exportPolicyRules[].protocolsEnabled` | `protocol` |
| `netapp.Volume`, `netapp.getVolume` | `mountIpAddresses` output | `mountTargets` |
| `iot.SecuritySolution` | `recommendationsEnabled` | `recommendations` (same fields) |
| `nginx.Deployment` | `loggingStorageAccounts` | Removed. Use `monitoring.DiagnosticSetting`. |
| `nginx.Deployment` | `diagnoseSupportEnabled`, `managedResourceGroup` | Removed |
| `policy.PolicySetDefinition` | `managementGroupId` | Use `management.GroupPolicySetDefinition` (see below). |
| `automation.Account` | `encryption.keySource` | Removed. Omit `encryption` to use platform-managed keys. |
| `batch.Pool` | `certificates` | Removed. Use the Key Vault VM extension. |
| `recoveryservices.Vault` | `softDeleteEnabled` | Removed. Soft delete is always on. |
| `sentinel.AlertRuleFusion` | `name` | Removed |
| `siterecovery.ReplicatedVM` | `networkInterfaces[].targetStaticIp`, `targetSubnetName`, `failoverTest*`, `recoveryPublicIpAddressId`, `recoveryLoadBalancerBackendAddressPoolIds` | Moved into `networkInterfaces[].ipConfigurations[]`, which requires a `name` matching the source VM's IP configuration. |
| `stack.HciLogicalNetwork` | `subnet.routes` (list) | `subnet.route` (single object) |

`policy.PolicySetDefinition` with `managementGroupId` maps to a different resource type, so switching your code to `management.GroupPolicySetDefinition` would delete the old definition and create a new one. To move it without recreating it, remove the old resource from state with `pulumi state delete <urn>`. Then declare the new resource with the [`import`](https://www.pulumi.com/docs/iac/concepts/options/import/) resource option set to the definition's ID, and run `pulumi up`.

### Outputs and data source results

| Resource / data source | v6 output | v7 output |
| :---- | :---- | :---- |
| `storage.Container`, `Queue`, `Share` (+ data sources) | `resourceManagerId` | `id` |
| `keyvault.getKeyVault` | `enableRbacAuthorization` | `rbacAuthorizationEnabled` |
| `eventgrid.SystemTopic`, `eventgrid.getSystemTopic` | `metricArmResourceId`, `sourceArmResourceId` | `metricResourceId`, `sourceResourceId` |
| `cdn.getFrontdoorProfile` | `identity` | `identities` |
| `cosmosdb.getAccount` | `ipRangeFilter` | `ipRangeFilters` |
| `logicapps.getStandard` | `siteConfig` | `siteConfigs` (list) |
| `lb.getLBRule`, `lb.getLBOutboundRule` | `enableFloatingIp`, `enableTcpReset` | `floatingIpEnabled`, `tcpResetEnabled` |
| `network.getVirtualNetworkGateway`, `network.getGatewayConnection` | `enableBgp` | `bgpEnabled` |
| `privatelink.getService` | `enableProxyProtocol` | `proxyProtocolEnabled` |
| `servicebus.getQueue`, `getTopic`, `getSubscription` | `enableBatchedOperations`, `enableExpress`, `enablePartitioning` | `batchedOperationsEnabled`, `expressEnabled`, `partitioningEnabled` |
| `compute.getVirtualMachineScaleSet` | `networkInterfaces[].enableAcceleratedNetworking`, `enableIpForwarding` | `acceleratedNetworkingEnabled`, `ipForwardingEnabled` |
| `apimanagement.getService` | `hostnameConfigurations[].*[].keyVaultId` | `keyVaultCertificateId` |

## Changes the compiler won't catch

The changes in this section don't produce compile errors. They appear as diffs or errors at `pulumi preview` or `pulumi up`.

### Changed defaults

When a default changes, any resource that relied on the old default shows an update on the first `pulumi preview` after upgrading. To keep the current behaviour, set the old value explicitly. The v6 program below compiles unchanged against v7 but behaves differently:

**v6**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const workspace = new azure.operationalinsights.AnalyticsWorkspace("logs", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "PerGB2018",
});

// Relies on allowNestedItemsToBePublic defaulting to `true`.
const account = new azure.storage.Account("public-assets", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
});
const assets = new azure.storage.Container("assets", {
    storageAccountId: account.id,
    containerAccessType: "blob",
});

// Relies on logsDestination being inferred from the workspace ID.
const env = new azure.containerapp.Environment("apps", {
    resourceGroupName: rg.name,
    location: rg.location,
    logAnalyticsWorkspaceId: workspace.id,
});
```

**v7**

```typescript
import * as azure from "@pulumi/azure";

const rg = new azure.core.ResourceGroup("rg", { location: "westeurope" });
const workspace = new azure.operationalinsights.AnalyticsWorkspace("logs", {
    resourceGroupName: rg.name,
    location: rg.location,
    sku: "PerGB2018",
});

const account = new azure.storage.Account("public-assets", {
    resourceGroupName: rg.name,
    location: rg.location,
    accountTier: "Standard",
    accountReplicationType: "LRS",
    // Default flipped to `false`, which would block the public container below.
    allowNestedItemsToBePublic: true,
});
const assets = new azure.storage.Container("assets", {
    storageAccountId: account.id,
    containerAccessType: "blob",
});

const env = new azure.containerapp.Environment("apps", {
    resourceGroupName: rg.name,
    location: rg.location,
    // No longer computed: must be set for the workspace ID to be accepted.
    logsDestination: "log-analytics",
    logAnalyticsWorkspaceId: workspace.id,
});
```

| Resource | Property | v6 default | v7 default |
| :---- | :---- | :---- | :---- |
| `containerservice.KubernetesCluster` | `oidcIssuerEnabled` | `false` | `true` (irreversible once applied) |
| `storage.Account` | `allowNestedItemsToBePublic` | `true` | `false` |
| `containerapp.Environment` | `logsDestination` | computed from `logAnalyticsWorkspaceId` | empty (streaming only); must be `"log-analytics"` to use a workspace |
| `containerservice.Registry` | `encryption` | computed | empty, meaning no customer-managed key |
| `appservice.WindowsWebApp`, `appservice.WindowsWebAppSlot` | `virtualNetworkImagePullEnabled` | computed | `false` |
| `mssql.ManagedInstance` | `proxyOverride` | `Default` | `Redirect` (`Default` is no longer accepted) |
| `mssql.Database`, `mssql.ElasticPool` | `enclaveType` | computed | not computed |
| `mssql.Database`, `mssql.ManagedDatabase` | `longTermRetentionPolicy.{weekly,monthly,yearly}Retention` | computed | `PT0S` |
| `logicapps.Standard` | `clientCertificateMode` | not set | `Required` |
| `logicapps.Standard` | `publicNetworkAccess` | computed | `Enabled` |
| `waf.Policy` | `policySettings.fileUploadEnforcement` | computed | `true` |
| `datafactory.LinkedServiceMysql` | `driverVersion` | `V1` | `V2` |
| `powerbi.Embedded` | `mode` | `Gen1` | `Gen2`. **This forces a replacement**: set `mode: "Gen1"` on existing Gen1 capacities. |
| `paloalto.NextGenerationFirewallVirtualHubLocalRulestack`, `...VirtualHubPanorama`, `...VirtualNetworkLocalRulestack`, `...VirtualNetworkPanorama` | `planId` | previous plan | `panw-cngfw-payg` |
| `lb.LoadBalancer` | `subnetId`, `publicIpAddressId` | computed | not computed |

### Values that are no longer accepted

| Resource | Property | Rejected values |
| :---- | :---- | :---- |
| `storage.Account` | `minTlsVersion` | `TLS1_0`, `TLS1_1` |
| `mssql.Server` | `minimumTlsVersion` | `Disabled`, `1.0`, `1.1` |
| `mssql.ManagedInstance` | `minimumTlsVersion` | `1.0`, `1.1` |
| `redis.Cache` | `minimumTlsVersion` | `1.0`, `1.1` |
| `eventhub.EventHubNamespace`, `servicebus.Namespace` | `minimumTlsVersion` | `1.0`, `1.1` |
| `cosmosdb.Account` | `minimalTlsVersion` | `Tls`, `Tls11` |
| `logicapps.Standard` | `siteConfig.minTlsVersion`, `siteConfig.scmMinTlsVersion` | `1.0`, `1.1` |
| `cdn.EndpointCustomDomain` | `cdnManagedHttps.tlsVersion`, `userManagedHttps.tlsVersion` | `None`, `TLS10` |
| `appservice.Linux/WindowsWebApp(Slot)`, `appservice.Linux/WindowsFunctionApp(Slot)` | `siteConfig.remoteDebuggingVersion` | `VS2017`, `VS2019` |
| `synapse.SparkPool` | `sparkVersion` | `3.2`, `3.3` |
| `dashboard.Grafana` | `sku` / `grafanaMajorVersion` | `Essential` / `11` |
| `appservice.StaticWebApp` | `identity.type` | `SystemAssigned, UserAssigned` |
| `compute.DedicatedHost` | `licenseType` | `None` (omit the property instead) |
| `appplatform.SpringCloudConnection` | `clientType` | `none` (omit the property instead) |
| `cdn.FrontdoorRule` | `conditions.remoteAddresses/socketAddresses[].operator` | `Any` |

### Stricter validation and new replacement triggers

* These inputs are now validated as resource IDs, case-sensitively: `datafactory.IntegrationRuntimeSelfHosted` `rbacAuthorizations[].resourceId`, `eventgrid` `azureFunctionEndpoint.functionId`, `logicapps.Standard.appServicePlanId`, `appservice.ManagedCertificate.customHostnameBindingId`, `cdn.FrontdoorSecurityPolicy` `...domains[].cdnFrontdoorDomainId`, and `maintenance.AssignmentVirtualMachineScaleSet.virtualMachineScaleSetId`. IDs read from other resources' outputs pass. Hand-written IDs with the wrong casing fail.
* `costmanagement.ScheduledAction` and `costmanagement.AnomalyAlert`: `displayName` is limited to 25 characters and `emailSubject` to 50.
* `storage.TableEntity.storageTableId` must be the table's Resource Manager ID (`table.id`). The data-plane URL is no longer accepted.
* `machinelearning.DatastoreFileshare.storageFileshareId` must be the share's `id`. The value from the removed `resourceManagerId` output is no longer accepted.
* Changing `loganalytics.StorageInsights.storageAccountId` now replaces the resource. So does changing `description`, `displayName` or `validateFromUtc` on `sentinel.ThreatIntelligenceIndicator`.
* `network.LocalNetworkGateway.addressSpaces` is now unordered, so don't rely on the order of items read from it.
