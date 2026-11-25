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

If you're upgrading from v5 to v6, please refer to the [v6 migration guide](./guides/v6-migration/).

## Example

{{< chooser language "typescript,python,go,csharp,java,yaml,hcl" >}}

{{% choosable language typescript %}}

```typescript
const azure = require("@pulumi/azure")

const resourceGroupName = new azure.core.ResourceGroup("my-group", {
    location: "westus2",
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi_azure as azure

my_group = azure.core.ResourceGroup("my-group", location="westus2")
```

{{% /choosable %}}

{{% choosable language go %}}

```go
package main

import (
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := core.NewResourceGroup(ctx, "my-group", &core.ResourceGroupArgs{
			Location: pulumi.String("westus2"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
using Pulumi;
using Azure = Pulumi.Azure;

return await Deployment.RunAsync(() =>
{
    var myGroup = new Azure.Core.ResourceGroup("my-group", new()
    {
        Location = "westus2",
    });
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.azure.core.ResourceGroup;
import com.pulumi.azure.core.ResourceGroupArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    private static void stack(Context ctx) {
        final var myGroup = new ResourceGroup("my-group", ResourceGroupArgs.builder()
            .location("westus2")
            .build());
    }
}
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

{{% choosable language hcl %}}

```hcl
terraform {
  required_providers {
    azure = {
      source = "pulumi/azure"
    }
  }
}

resource "azure_core_resource_group" "my-group" {
  location = "westus2"
}
```

{{% /choosable %}}

{{% /chooser %}}

Visit the [Guides](./guides/) for the v6 migration guide.
