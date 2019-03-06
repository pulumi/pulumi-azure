## 0.17.1 (Unreleased)

## 0.17.0 (Released March 5, 2019)

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
