---
title: Azure Classic
meta_desc: Learn how to use Pulumi's Azure Classic Provider to reduce the complexity of managing and provisioning Azure resources with Azure Resource Manager (ARM) APIs.
layout: package
---

{{% notes %}}
We recommend using the [Azure Native provider](/registry/packages/azure-native) to provision Azure infrastructure. Azure Native provides complete coverage of Azure resources and same-day access to new resources and resource updates because it’s built and automatically from the Azure Resource Manager API.

Azure Classic is based on the Terraform AzureRM provider. It has fewer resources and resource options and receives new Azure features more slowly than Azure Native. However, Azure Classic remains fully supported for existing usage.
{{% /notes %}}

The Azure Classic provider for Pulumi can be used to provision many of the cloud resources available in [Azure](https://azure.microsoft.com/en-us/). It manages and provisions resources using the [Azure Resource Manager (ARM) APIs](https://docs.microsoft.com/en-us/rest/api/resources/).

Azure Classic must be configured with credentials to deploy and update resources in Azure; see [Installation & Configuration](./installation-configuration) for instructions.

If you're upgrading from v5 to v6, please refer to the [v6 migration guide](./v6-migration/).

## Example

{{< chooser language "typescript,yaml" >}}

{{% choosable language typescript %}}

```typescript
const azure = require("@pulumi/azure")

const resourceGroupName = new azure.core.ResourceGroup("my-group", {
    location: "westus2",
});
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  my-group:
    type: azure:core:ResourceGroup
    properties:
      location: westus2
```

{{% /choosable %}}

{{% /chooser %}}

Visit the [How-to Guides](./how-to-guides) to find step-by-step guides for specific scenarios like running an app in Azure App Service or setting up a serverless Azure Function.
