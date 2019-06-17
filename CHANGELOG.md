=======
CHANGELOG
=========

## HEAD (Unreleased)
* Add constants for the Azure Location types
* Introduce MultiCallbackFunctionApp which can hold several callback functions in the same Function App
* Introduce ArchiveFunctionApp which accept an archive of an Azure Functions deployment artifact

---

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

