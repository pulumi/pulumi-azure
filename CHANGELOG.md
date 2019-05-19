## 0.18.3 (Unreleased)

## Improvements

- Serverless mixins now support the Event Hubs and Cosmos DB triggers.
- Fixed bug #2511, which resulted in crashes when updating many properties of an
  `azure.containerservice.KubernetesCluster`.
- Fix a bug where omitting a location would result in the initial failure of `pulumi preview` (#239).
- Updated the provider to be based on version 1.28.0 of the AzureRM Terraform proivder.

## 0.18.2 (Released May 6th, 2019)

## Improvements

- Updated the Pulumi <-> Terraform Bridge embedded in the provider, adding non-null
  assertions to many properties in TypeScript.

## 0.18.1 (Released April 30th, 2019)

## Improvements
- `@pulumi/azure` gets 'serverless' functionality in line with `@pulumi/aws`.  Specifically:
  1. You can now easily create a FunctionApp from a JavaScript/TypeScript function using
     azure.appservice.CallbackFunctionApp.
  2. Subscribing and responding to HTTP events can be done easily with the new
     `azure.appservice.HttpEventSubsription` component. Custom routing is supported.
  3. You can subscribe to `azure.eventhub.Topic` events, invoking a FunctionApp containing the code
     you want, using `topic.onEvent(...)`.
  4. You can subscribe to `azure.storage.Container` blob events, invoking a FunctionApp containing
     the code you want, using `container.onBlobEvent(...)`.
  5. You can subscribe to `azure.storage.Queue` events, invoking a FunctionApp containing
     the code you want, using `queue.onEvent(...)`.

- The location for each resource attached to a provider instance is now set as
  part of the provider configuration. This means that the following code from
  v0.18.0:

  ```ts
  const rg = new azure.core.ResourceGroup("rg", { location" EastUS" });
  const sa = new azure.storage.Account("storage", {
      resourceGroupName: rg.name,
      location: "EastUS",
  });
  ```

  Can now be written as:

  ```ts
  const rg = new azure.core.ResourceGroup("rg");
  const sa = new azure.storage.Account("storage", {
      resourceGroupName: rg.name,
  });
  ```

  Location can then be set using the provider configuration block if using first
  class providers, or, for the default provider, by running:

  ```
  pulumi config set azure:location EastUS
  ```

- Add support for `client_certificate_password`, `client_certificate_path` and
  `partner_id` as per the upstream Terraform provider

- Update to v1.27.1 of the upstream Terraform provider.

## 0.18.0 (Released April 22nd, 2019)

## Breaking Changes

- `azure.api.API` has been renamed to `azure.api.Service`, and `azure.api.Api` now represents the Terraform `azure_api_management_api` resource.

## Improvements

- Updated to v1.25.0 of the AzureRM Terraform Provider.

## 0.17.4 (Released April 2nd, 2019)

## Improvements

- Objects returned by `getX()` functions now have output properties corresponding to their input arguments.

## 0.17.3 (Released March 19th, 2019)

## Improvements

- Fix a bug where setting a property value back to the default results in no change

- Resources can no longer be "adopted" by accident during creation if another resources with the same ID already exists. This is akin to using `ARM_PROVIDER_STRICT` with the AzureRM Terraform Provider.

- Numeric types in Python are now projected as `float` instead of `int`, fixing some crashes.

## 0.17.2 (Released March 11th, 2019)

## Improvements

- Updated to v1.23.0 of the AzureRM Terraform Provider.

- Fixed a bug where AppService or FunctionApp could not be created with `use32BitWorkerProcess` set to `true`.

## 0.17.1 (Released March 6th, 2019)

## Improvements

- Fix an issue where the Python `pulumi_azure` package was depending on an older `pulumi` package.

## 0.17.0 (Released March 5th, 2019)

### Important

Updating to v0.17.0 version of `@pulumi/pulumi`.  This is an update that will not play nicely
in side-by-side applications that pull in prior versions of this package.

See https://github.com/pulumi/pulumi/commit/7f5e089f043a70c02f7e03600d6404ff0e27cc9d for more details.

As such, we are rev'ing the minor version of the package from 0.16 to 0.17.  Recent version of `pulumi` will now detect, and warn, if different versions of `@pulumi/pulumi` are loaded into the same application.  If you encounter this warning, it is recommended you move to versions of the `@pulumi/...` packages that are compatible.  i.e. keep everything on 0.16.x until you are ready to move everything to 0.17.x.

## 0.16.9 (Released February 14th, 2019)

### Improvements

- Updated to v1.22.1 of the AzureRM Terraform Provider.

## 0.16.8 (Released February 11th, 2019)

### Improvements

- Updated to v1.22.0 of the AzureRM Terraform Provider.

- Support for the `deleteBeforeReplace` resource option and improved
  delete-before-replace behaviour introduced in [Pulumi
  0.16.14](https://github.com/pulumi/pulumi/blob/master/CHANGELOG.md#01614-released-january-31st-2019).

## 0.16.7 (Released January 19th, 2019)

### Improvements

- Updated to the v1.21.0 version of the AzureRM Terraform Provider.

- Documentation comments for the Node.js SDK now include examples

## 0.16.6 (Released December 17th, 2018)

### Improvements

- Updated to v1.20.0 of the Terraform AzureRM provider.

## 0.16.5 (Released December 5th, 2018)

### Major Changes

- RBAC is now enabled on managed Kubernetes clusters using the settings in `roleBasedAcessControl`
  instead of using the `enableRBAC` parameters.

### Improvements

- Updated to v1.19.0 of the Terraform AzureRM provider.

## 0.16.4 (Released Novemeber 13th, 2018)

### Major Changes

- If you're using Pulumi with Python, this release removes Python 2.7 support in favor of Python 3.6 and greater.
