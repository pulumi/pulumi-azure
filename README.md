[![Build Status](https://travis-ci.com/pulumi/pulumi-azure.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-azure)

# Microsoft Azure Resource Provider

The Microsoft Azure resource provider for Pulumi lets you use Azure resources in your cloud programs.  To use
this package, please [install the Pulumi CLI first](https://pulumi.io/). For a streamlined Pulumi walkthrough, including language runtime installation and Azure configuration, click "Get Started" below.

<div>
    <a href="https://www.pulumi.com/docs/get-started/azure" title="Get Started">
       <img src="https://www.pulumi.com/images/get-started.svg" width="120">
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

    $ go get github.com/pulumi/pulumi-azure/sdk/go/...

## Concepts

The `@pulumi/azure` package provides a strongly-typed means to build cloud applications that create
and interact closely with Azure resources.  Resources are exposed for the entire Azure surface area,
including (but not limited to), 'appinsights', 'compute', 'cosmosdb', 'keyvault', and more.

## Configuring credentials

There are a variety of ways credentials may be configured for the Azure provider, appropriate for
different use cases. They are enumerated [in the quickstart guide](
https://pulumi.io/quickstart/azure/setup.html).

## Reference

For detailed reference documentation, please visit [the API docs](
https://pulumi.io/reference/pkg/nodejs/@pulumi/azure/index.html).
