[![Actions Status](https://github.com/pulumi/pulumi-azure/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-azure/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fazure.svg)](https://npmjs.com/package/@pulumi/azure)
[![Python version](https://badge.fury.io/py/pulumi-azure.svg)](https://pypi.org/project/pulumi-azure)
[![NuGet version](https://badge.fury.io/nu/pulumi.azure.svg)](https://badge.fury.io/nu/pulumi.azure)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-azure/sdk/v5/go)](https://pkg.go.dev/github.com/pulumi/pulumi-azure/sdk/v5/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-azure/blob/master/LICENSE)

# Microsoft Azure Resource Provider

> **_NOTE:_** We recommend using the [Azure Native provider](https://github.com/pulumi/pulumi-azure-native) to provision Azure infrastructure. Azure Native provides complete coverage of Azure resources and same-day access to new resources and resource updates because it’s built and automatically from the Azure Resource Manager API.
>
> Azure Classic is based on the Terraform azurerm provider. It has fewer resources and resource options and receives new Azure features more slowly than Azure Native. However, Azure Classic remains fully-supported for existing usage.

The Azure Classic resource provider for Pulumi lets you use Azure resources in your cloud programs.  To use
this package, please [install the Pulumi CLI first](https://pulumi.io/). For a streamlined Pulumi walkthrough, including language runtime installation and Azure configuration, select "Get Started" below.

<div>
    <a href="https://www.pulumi.com/docs/get-started/azure" title="Get Started">
       <img src="https://www.pulumi.com/images/get-started.svg?" width="120">
    </a>
</div>

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/azure

or `yarn`:

    $ yarn add @pulumi/azure

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_azure

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-azure/sdk/v5

### .NET 

To use from .NET, install using `dotnet add package`:

   $ dotnet add package Pulumi.Azure

## Concepts

The `@pulumi/azure` package provides a strongly-typed means to build cloud applications that create
and interact closely with Azure resources.  Resources are exposed for the entire Azure surface area,
including (but not limited to), 'appinsights', 'compute', 'cosmosdb', 'keyvault', and more.

## Configuring credentials

There are a variety of ways credentials may be configured for the Azure provider, appropriate for
different use cases. Refer to the [Azure configuration options](
https://www.pulumi.com/registry/packages/azure-native/installation-configuration/#configuration-options).

## Reference

For further information, visit [Azure in the Pulumi Registry](https://www.pulumi.com/registry/packages/azure-native/)
or for detailed API reference documentation, visit [Azure API Docs in the Pulumi Registry](https://www.pulumi.com/registry/packages/azure-native/api-docs/).
