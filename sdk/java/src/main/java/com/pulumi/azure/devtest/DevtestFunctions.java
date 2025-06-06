// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.devtest.inputs.GetLabArgs;
import com.pulumi.azure.devtest.inputs.GetLabPlainArgs;
import com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs;
import com.pulumi.azure.devtest.inputs.GetVirtualNetworkPlainArgs;
import com.pulumi.azure.devtest.outputs.GetLabResult;
import com.pulumi.azure.devtest.outputs.GetVirtualNetworkResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class DevtestFunctions {
    /**
     * Use this data source to access information about an existing Dev Test Lab.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetLabArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getLab(GetLabArgs.builder()
     *             .name("example-lab")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("uniqueIdentifier", example.uniqueIdentifier());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static Output<GetLabResult> getLab(GetLabArgs args) {
        return getLab(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetLabArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getLab(GetLabArgs.builder()
     *             .name("example-lab")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("uniqueIdentifier", example.uniqueIdentifier());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static CompletableFuture<GetLabResult> getLabPlain(GetLabPlainArgs args) {
        return getLabPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetLabArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getLab(GetLabArgs.builder()
     *             .name("example-lab")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("uniqueIdentifier", example.uniqueIdentifier());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static Output<GetLabResult> getLab(GetLabArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:devtest/getLab:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetLabArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getLab(GetLabArgs.builder()
     *             .name("example-lab")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("uniqueIdentifier", example.uniqueIdentifier());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static Output<GetLabResult> getLab(GetLabArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:devtest/getLab:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetLabArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getLab(GetLabArgs.builder()
     *             .name("example-lab")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         ctx.export("uniqueIdentifier", example.uniqueIdentifier());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static CompletableFuture<GetLabResult> getLabPlain(GetLabPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:devtest/getLab:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab Virtual Network.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
     *             .name("example-network")
     *             .labName("examplelab")
     *             .resourceGroupName("example-resource")
     *             .build());
     * 
     *         ctx.export("labSubnetName", example.allowedSubnets()[0].labSubnetName());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static Output<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args) {
        return getVirtualNetwork(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab Virtual Network.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
     *             .name("example-network")
     *             .labName("examplelab")
     *             .resourceGroupName("example-resource")
     *             .build());
     * 
     *         ctx.export("labSubnetName", example.allowedSubnets()[0].labSubnetName());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static CompletableFuture<GetVirtualNetworkResult> getVirtualNetworkPlain(GetVirtualNetworkPlainArgs args) {
        return getVirtualNetworkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab Virtual Network.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
     *             .name("example-network")
     *             .labName("examplelab")
     *             .resourceGroupName("example-resource")
     *             .build());
     * 
     *         ctx.export("labSubnetName", example.allowedSubnets()[0].labSubnetName());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static Output<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:devtest/getVirtualNetwork:getVirtualNetwork", TypeShape.of(GetVirtualNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab Virtual Network.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
     *             .name("example-network")
     *             .labName("examplelab")
     *             .resourceGroupName("example-resource")
     *             .build());
     * 
     *         ctx.export("labSubnetName", example.allowedSubnets()[0].labSubnetName());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static Output<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:devtest/getVirtualNetwork:getVirtualNetwork", TypeShape.of(GetVirtualNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Dev Test Lab Virtual Network.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.devtest.DevtestFunctions;
     * import com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = DevtestFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
     *             .name("example-network")
     *             .labName("examplelab")
     *             .resourceGroupName("example-resource")
     *             .build());
     * 
     *         ctx.export("labSubnetName", example.allowedSubnets()[0].labSubnetName());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ## API Providers
     * 
     * &lt;!-- This section is generated, changes will be overwritten --&gt;
     * This data source uses the following Azure API Providers:
     * 
     * * `Microsoft.DevTestLab`: 2018-09-15
     * 
     */
    public static CompletableFuture<GetVirtualNetworkResult> getVirtualNetworkPlain(GetVirtualNetworkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:devtest/getVirtualNetwork:getVirtualNetwork", TypeShape.of(GetVirtualNetworkResult.class), args, Utilities.withVersion(options));
    }
}
