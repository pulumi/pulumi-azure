CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to pulumi-terraform-bridge v2.3.3

---

## 3.5.2 (2020-05-14)
* Add retries on Function App host keys
  
## 3.5.1 (2020-05-13)
* Upgrade to pulumi-terraform-bridge v2.3.2

## 3.5.0 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1
* Fix `error404document` mapping on `azure.storage.Account`
* Upgrade to v2.9.0 of the AzureRM Terraform Provider
* Update ArchiveFunctionApp to pass correct params to FunctionApp

## 3.4.0 (2020-05-01)
* Upgrade to v2.8.0 of the AzureRM Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.1.1

## 3.3.0 (2020-04-29)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 3.2.0 (2020-04-24)
* Upgrade to v2.7.0 of the AzureRM Terraform Provider

## 3.1.0 (2020-04-20)
* Upgrade to v2.6.0 of the AzureRM Terraform Provider

## 3.0.0 (2020-04-16)
* Upgrade to v2.0.0 of Pulumi
* Upgrade to v2.0.0 of pulumi-terraform-bridge

## 2.5.0 (2020-04-13)
* Add several properties to ArchiveFunctionApp.
  ([#514](https://github.com/pulumi/pulumi-azure/pull/514))
* Upgrade to v2.5.0 of the AzureRM Terraform Provider
  ** PLEASE NOTE:** 
  There are some breaking changes to `azurerm_kubernetes_cluster` due 
  to a breaking change in the Azure AKS API,
  Mixed Mode Authentication clusters are no longer supported

## 2.4.1 (2020-04-03)
* Fix the release version of the azure binary

## 2.4.0 (2020-04-03)
* Upgrade to v2.4.0 of the AzureRM Terraform Provider

## 2.3.1 (2020-03-30)
* Bump consumable git modules to v2 as per [go documentation](https://github.com/golang/go/wiki/Modules#releasing-modules-v2-or-higher)

## 2.3.0 (2020-03-30)
* Upgrade to v2.3.0 of the AzureRM Terraform Provider
* Upgrade to pulumi-terraform-bridge v1.8.4

## 2.2.0 (2020-03-24)
* Rename resource `containerService.Webook` to `containerService.Webhook`
* Upgrade to v2.2.0 of the AzureRM Terraform Provider

## 2.1.0 (2020-03-10)
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2
* Upgrade to v2.1.0 of the AzureRM Terraform Provider

## 2.0.0 (2020-03-10)
* BREAKING: Upgrade to v2.0.0 of the AzureRM Terraform Provider
  Please note that a number of the old deprecated resources have been removed as well as
  a number of deprecated properties on resources. You can check the full list of
  changes in the [upstream CHANGELOG](https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/CHANGELOG.md)
* BREAKING: Set the default version of Azure Functions runtime to ~3 and Node.js to ~12.
  ([#478](https://github.com/pulumi/pulumi-azure/pull/478))
* BREAKING: Support assets and archives in azure.storage.Blob, deprecate azure.storage.ZipBlob resource.
  ([#479](https://github.com/pulumi/pulumi-azure/pull/479), [#482](https://github.com/pulumi/pulumi-azure/pull/482))
* Update AppService Mixins to match AppService SiteConfig parameters
* Add support for Azure Durable Functions

## 1.14.0 (2020-02-12)
* Upgrade to v1.44.0 of the AzureRM Terraform Provider

## 1.13.0 (2020-02-06)
* Upgrade to v1.43.0 of the AzureRM Terraform Provider
  This release introduces some new experimental features that will be part of the 2.0 release of the AzureRM Terraform Provider
  to use these new features, you can read the [2.0 Beta Guide](https://www.terraform.io/docs/providers/azurerm/guides/2.0-beta.html)

## 1.12.0 (2020-01-29)
* Upgrade to v1.42.0 of the AzureRM Terraform Provider
* Upgrade to v1.6.4 of pulumi-terraform-bridge

## 1.11.0 (2020-01-16)
* Upgrade to v1.41.0 of the AzureRM Terraform Provider

## 1.10.0 (2020-01-09)
* Upgrade to v1.40.0 of the AzureRM Terraform Provider

## 1.9.0 (2019-12-18)
* Upgrade to v1.39.0 of the AzureRM Terraform Provider

## 1.8.0 (2019-12-12)
* Upgrade to v1.5.2 of pulumi-terraform-bridge

## 1.7.0 (2019-12-09)
* Upgrade to v1.38.0 of the AzureRM Terraform Provider

## 1.6.0 (2019-12-02)
* Upgrade to v1.4.3 of pulumi-terraform-bridge

## 1.5.0 (2019-11-27)
* Upgrade to support go 1.13.x
* Allow service principle credentials to be specified via environment variables prefixed with `AZURE_` as per the documented standard in addition to those with the prefix `ARM_`.
* Upgrade to v1.4.2 of pulumi-terraform-bridge
* Upgrade to v1.37.0 of the AzureRM Terraform Provider

## 1.4.0 (2019-11-07)
* Add **preview** support for .NET

## 1.3.1 (2019-10-29)
* Upgrade to v1.36.1 of the AzureRM Terraform Provider

## 1.3.0 (2019-10-29)
* Use Blob Container SAS instead of Account SAS for zip packages for Function App deployments
  [#378](https://github.com/pulumi/pulumi-azure/pull/378)
* Upgrade to v1.36.0 of the AzureRM Terraform Provider

## 1.2.0 (2019-10-07)
* Upgrade to v1.35.0 of the Azurerm Terraform Provider

## 1.1.0 (2019-10-04)
* Fix an issue where `pulumi-azure` would fail to install on Windows (fixes [#356](https://github.com/pulumi/pulumi-azure/issues/356))
* Fix an issue where `records` property of `dns.NsRecord` was mistakenly mapped to the deprecated `record` property (fixes [#243](https://github.com/pulumi/pulumi-azure/issues/243))
  [#361](https://github.com/pulumi/pulumi-azure/pull/361)
* Upgrade to support go1.13
* Upgrade to v1.34.0 of the Azurerm Terraform Provider
* Regenerate SDK against tf2pulumi 0.6.0

## 1.0.0 (2019-09-03)
* Use 1.0 version of Pulumi dependency

## 1.0.0-rc.1 (2019-08-28)
* Upgrade to pulumi-terraform 3f206601e7
* Upgrade to v1.33.1 of the Azurerm Terraform Provider

## 1.0.0-beta.2 (2019-08-26)
* Several modules have been renamed to better align with their terraform equivalents. The existing modules are still
  available, but will be deprecated and removed in the future. 'Aliases' have been used to ensure that moving to the new
  modules will not result in any changes to existing resources. The renamed modules are:
  azure.role.* -> azure.authorization.*
  azure.msi.* -> azure.authorization.*
  azure.managementgroups.* -> azure.management.*
  azure.managementresource.* -> azure.management.*
  azure.eventhub.eventGrid* -> azure.eventgrid.*
  azure.eventhub.servicebus* -> azure.servicebus.*
  azure.trafficmanager.* -> azure.network.*s
* Upgrade to pulumi-terraform@14e049b09d
* Update pulumi-terraform reference to 58c7473d0
* Use 1.0-beta versions of python dependencies

## 1.0.0-beta.1 (2019-08-13)
* Fix the location of callback functions ([#328](https://github.com/pulumi/pulumi-azure/pull/328))

## 0.19.5 (2019-08-09)
* Update to pulumi-terraform 9db2fc93cd

## 0.19.4 (2019-08-05)
* Update pulumi-terraform to 6bcafb609dd
* Update Terraform dependency to v0.12.5.
* Out-of-the-box Azure Cloud Shell support ([#74](https://github.com/pulumi/pulumi-azure/issues/74))
* Add constants for Azure AppService Plan Kind types.
* Individual Azure Functions can be created by getEventFunction helpers directly on event sources.

## 0.19.3 (2019-07-22)
* BREAKING: Default data type of a Storage Queue-triggered Callback Function is changed from 'binary' to 'string'.
  This means that the type of second argument of a callback changes from 'Buffer' to 'string' or 'object' depending on the payload.
  To restore the past behavior, pass `dataType: "binary"` to the arguments of `QueueFunction` class or `queue.onEvent` function.
* Support Input and Output bindings for callback-based Azure Functions (all triggers, but inputs and outputs to/from Queue/Blob/Table only)
* Introduce `listHostKeys` and `listFunctionKeys` mix-in functions to retrieve Azure Functions management keys
* Event Grid as a trigger for callback-based Azure Functions
* Upgrade to pulumi-terraform@98fabcf506

## 0.19.2 (2019-07-09)
* Fix detailed diffs with nested computed values.
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.19.1 (2019-06-28)
* Update to v1.31.0 of the AzureRM Terraform provider

## 0.19.0 (2019-06-21)
* BREAKING: Types related to ServiceBus Topic subscriptions: TopicContext, TopicHostSettings, and TopicCallback were replaced by more general types ServiceBusContext, ServiceBusHostSettings, and ServiceBusCallback to support queue-based scenarios.
* Update to pulumi-terraform@3635bed3a5 which stops maps containing `.` being treated as nested maps.
* Azure Function types for Blob, Service Bus, Event Hub, IoT Hub, and Cosmos DB triggers

## 0.18.8 (2019-06-19)
* Add constants for the Azure Location types
* The type of all SubscriptionArgs has changed from Overwrite<T> to interfaces derived from FunctionAppArgsBase. The shape is preserved.
* Introduce MultiCallbackFunctionApp which can hold several callback functions in the same Function App
* Introduce ArchiveFunctionApp which accept an archive of an Azure Functions deployment artifact
* Introduce HttpFunction, TimerFunction, and QueueFunction - to be hosted within MultiCallbackFunctionApp


## 0.18.7 (2019-06-07)
* Update to v1.30.1 of the AzureRM Terraform provider

## 0.18.6 (2019-06-07)
* Add TypeScript type guards for each resource class ([7ace3e9b5f](https://github.com/pulumi/pulumi-terraform/commit/7ace3e9b5f2dcd4692b029ba4b80360582d7949a))
* Serverless mixins now support the EventHubTrigger for IoT Hub.
* Update to v1.30.0 of the AzureRM Terraform provider

## 0.18.5 (2019-05-26)
* Update to v1.29.0 of the AzureRM Terraform provider
* Expose `signedBlobReadUrl` to produce SAS URLs for Blobs

## 0.18.4 (2019-05-22)
* Update the Pulumi-Terraform bridge, fixing an issue where all resources were marked as needing recreation in some cases

## 0.18.3 (2019-05-21)
* Add support for Event Hubs, CosmosDB and Timer triggers to serverless mixins
* Add extension-level host settings in serverless functions
* Fix bug #2511, which resulted in crashes when updating many properties of an `azure.containerservice.KubernetesCluster`
* Fix a bug where omitting a location would result in the initial failure of `pulumi preview`
* Update to v1.28.0 of the AzureRM Terraform provider
* Relax the maximum length of names on several resource types

## 0.18.2 (2019-05-06)
* Update the Pulumi-Terraform bridge, adding non-null assertions to many properties in the TypeScript definitions for the Node.js SDK

## 0.18.1 (2019-04-30)
* Update to v1.27.1 of the AzureRM Terraform provider
* Add support for authenticating with , , and
* Add support for authenticating with `clientCertificatePassword`, `clientCertificatePath`, and `partnerId`
* Add 'serverless' functionality in line with `@pulumi/aws`. Specifically:
  1. You can now easily create a FunctionApp from a JavaScript/TypeScript function using azure.appservice.CallbackFunctionApp.
  2. Subscribing and responding to HTTP events can be done easily with the new `azure.appservice.HttpEventSubsription` component. Custom routing is supported.
  3. You can subscribe to `azure.eventhub.Topic` events, invoking a FunctionApp containing the code you want, using `topic.onEvent(...)`.
  4. You can subscribe to `azure.storage.Container` blob events, invoking a FunctionApp containing the code you want, using `container.onBlobEvent(...)`.
  5. You can subscribe to `azure.storage.Queue` events, invoking a FunctionApp containin the code you want, using `queue.onEvent(...)`.
* The location for each resource attached to a provider instance is now set as part of the provider configuration. This means that the following code from v0.18.0:

  ```ts
  const rg = new azure.core.ResourceGroup("rg", { location" EastUS" });
  const sa = new azure.storage.Account("storage", {
      resourceGroupName: rg.name,
      location: "EastUS",
  });
  ```
  can now be written as:
  ```ts
  const rg = new azure.core.ResourceGroup("rg");
  const sa = new azure.storage.Account("storage", {
      resourceGroupName: rg.name,
  });
  ```
  Location can then be set using the provider configuration block if using first class providers, or, for the default provider, by running:
  ```
  pulumi config set azure:location EastUS
  ```

## 0.18.0 (2019-04-22)
* Update to v1.25.0 of the AzureRM Terraform provider
* BREAKING: Rename `azure.api.API` to `azure.api.Service`. `azure.api.Api` now represents the Terraform `azurerm_api_management_api` resource

## 0.17.4 (2019-04-02)
* Objects returned by `getX()` functions now have output properties corresponding to their input arguments

## 0.17.3 (2019-03-19)
* Fix a bug where setting a property value back to a default value results in no change
* Resources can no longer be "adopted" by accident during creation if another resource with the same ID already exists. This is the equivalent of enabling `ARM_PROVIDER_STRICT` in the AzureRM Terraform provider
* Project numeric types in Python as `float` instead of `int`, fixing some crashes

## 0.17.2 (2019-03-11)
* Update to v1.23.0 of the AzureRM Terraform provider
* Fix a bug resulting in an inability to set `use32BitWorkerProcess` to `true` for `AppService` and `FunctionApp` resources

## 0.17.1 (2019-03-06)
* Depend on the latest `pulumi` package in the `pulumi_gcp` Python SDK

## 0.17.0 (2019-03-05)
* Update to the latest version of the `pulumi` SDK
* BREAKING: This version of the Azure provider will not work side-by-side with previous versions

## 0.16.9 (2019-02-14)
* Update to v1.22.1 of the AzureRM Terraform provider

## 0.16.8 (2019-02-11)
* Update to v1.22.0 of the AzureRM Terraform provider
* Add support for the `deleteBeforeReplace` resource option and improved delete-before-replace behaviour introduced in Pulumi v0.16.14

## 0.16.7 (2019-01-19)
* Update to v1.21.0 of the AzureRM Terraform provider
* Add documentation comments to the Node.js SDK

## 0.16.6 (2018-12-17)
* Update to v1.20.0 of the AzureRM Terraform provider

## 0.16.5 (2019-12-05)
* Update to v1.19.0 of the AzureRM Terraform provider
* BREAKING: RBAC must now be enabled on managed Kubernetes clusters using `roleBasedAccessControl` instead of the `enableRBAC` parameter

## 0.16.4 (2019-11-13)
* Support Python 3.6 and higher, instead of only Python 3.7

## 0.16.3 (2018-10-24)
* Update to the v1.17.0 version of the Azure Provider [pulumi/pulumi-azure#137](https://github.com/pulumi/pulumi-azure/pull/137)
* Fix an issue where the provider could fail with an error about a Go type converison failing [pulumi/pulumi-azure#138](https://github.com/pulumi/pulumi-azure/pull/138)

## 0.16.0 (2018-10-12)
* Adopted `v1.15.0` of the AzureRM Terraform Provider. [pulumi/pulumi-azure#125](https://github.com/pulumi/pulumi-azure/pull/125)
* Many improvements to autoname generation to match Azure resource name requirements.
* **[Breaking Change]** Fix name of `azure.role.Assignment` from previous `azure.role.assignment`. [pulumi/pulumi-azure#127](https://github.com/pulumi/pulumi-azure/pull/127)

## 0.15.2 (2018-09-10)
* Consume newer terraform-provider from upstream. [pulumi/pulumi-azure#93](https://github.com/pulumi/pulumi-azure/pull/93)
* Fix name limit for azure container groups. [pulumi/pulumi-azure#94](https://github.com/pulumi/pulumi-azure/pull/94)
* Support provider configuration and property values provided by environment variaibles. [pulumi/pulumi-azure#98](https://github.com/pulumi/pulumi-azure/pull/98)

## 0.15.0 (2018-08-13)
* Adopted `terraform-provider-azurerm` version 1.12.0, with new support for Azure Service Fabric, Azure Notification Hubs, Azure Data Lake, and much more.

## 0.14.2 (2018-07-20)
* Only apply AutoName to inputs ([pulumi/pulumi-azure#78](https://github.com/pulumi/pulumi-azure/pull/78)). Terraform properties named `name` but are not inputs do not have auto naming applied to them.

## 0.14.1 (2018-07-03)
* The result of calls to data sources now include an `id` property. Special thanks to [@Frassle](https://github.com/Frassle) for adding this support in [pulumi/pulumi-terraform#189](https://github.com/pulumi/pulumi-terraform/pull/189).

