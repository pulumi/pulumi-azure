// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticsan;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.elasticsan.inputs.GetArgs;
import com.pulumi.azure.elasticsan.inputs.GetPlainArgs;
import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupPlainArgs;
import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs;
import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotPlainArgs;
import com.pulumi.azure.elasticsan.outputs.GetResult;
import com.pulumi.azure.elasticsan.outputs.GetVolumeGroupResult;
import com.pulumi.azure.elasticsan.outputs.GetVolumeSnapshotResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class ElasticsanFunctions {
    /**
     * Use this data source to access information about an existing Elastic SAN.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         ctx.export("id", example.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetResult> get(GetArgs args) {
        return get(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elastic SAN.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         ctx.export("id", example.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static CompletableFuture<GetResult> getPlain(GetPlainArgs args) {
        return getPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elastic SAN.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         ctx.export("id", example.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetResult> get(GetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:elasticsan/get:get", TypeShape.of(GetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         ctx.export("id", example.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetResult> get(GetArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:elasticsan/get:get", TypeShape.of(GetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         ctx.export("id", example.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static CompletableFuture<GetResult> getPlain(GetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:elasticsan/get:get", TypeShape.of(GetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Group.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeGroup.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetVolumeGroupResult> getVolumeGroup(GetVolumeGroupArgs args) {
        return getVolumeGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Group.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeGroup.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static CompletableFuture<GetVolumeGroupResult> getVolumeGroupPlain(GetVolumeGroupPlainArgs args) {
        return getVolumeGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Group.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeGroup.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetVolumeGroupResult> getVolumeGroup(GetVolumeGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:elasticsan/getVolumeGroup:getVolumeGroup", TypeShape.of(GetVolumeGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Group.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeGroup.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetVolumeGroupResult> getVolumeGroup(GetVolumeGroupArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:elasticsan/getVolumeGroup:getVolumeGroup", TypeShape.of(GetVolumeGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Group.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeGroup.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static CompletableFuture<GetVolumeGroupResult> getVolumeGroupPlain(GetVolumeGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:elasticsan/getVolumeGroup:getVolumeGroup", TypeShape.of(GetVolumeGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Snapshot.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         final var exampleGetVolumeSnapshot = ElasticsanFunctions.getVolumeSnapshot(GetVolumeSnapshotArgs.builder()
     *             .name("existing")
     *             .volumeGroupId(exampleGetVolumeGroup.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeSnapshot.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetVolumeSnapshotResult> getVolumeSnapshot(GetVolumeSnapshotArgs args) {
        return getVolumeSnapshot(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Snapshot.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         final var exampleGetVolumeSnapshot = ElasticsanFunctions.getVolumeSnapshot(GetVolumeSnapshotArgs.builder()
     *             .name("existing")
     *             .volumeGroupId(exampleGetVolumeGroup.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeSnapshot.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static CompletableFuture<GetVolumeSnapshotResult> getVolumeSnapshotPlain(GetVolumeSnapshotPlainArgs args) {
        return getVolumeSnapshotPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Snapshot.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         final var exampleGetVolumeSnapshot = ElasticsanFunctions.getVolumeSnapshot(GetVolumeSnapshotArgs.builder()
     *             .name("existing")
     *             .volumeGroupId(exampleGetVolumeGroup.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeSnapshot.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetVolumeSnapshotResult> getVolumeSnapshot(GetVolumeSnapshotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:elasticsan/getVolumeSnapshot:getVolumeSnapshot", TypeShape.of(GetVolumeSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Snapshot.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         final var exampleGetVolumeSnapshot = ElasticsanFunctions.getVolumeSnapshot(GetVolumeSnapshotArgs.builder()
     *             .name("existing")
     *             .volumeGroupId(exampleGetVolumeGroup.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeSnapshot.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static Output<GetVolumeSnapshotResult> getVolumeSnapshot(GetVolumeSnapshotArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:elasticsan/getVolumeSnapshot:getVolumeSnapshot", TypeShape.of(GetVolumeSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Elastic SAN Volume Snapshot.
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
     * import com.pulumi.azure.elasticsan.ElasticsanFunctions;
     * import com.pulumi.azure.elasticsan.inputs.GetArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeGroupArgs;
     * import com.pulumi.azure.elasticsan.inputs.GetVolumeSnapshotArgs;
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
     *         final var example = ElasticsanFunctions.get(GetArgs.builder()
     *             .name("existing")
     *             .resourceGroupName("existing")
     *             .build());
     * 
     *         final var exampleGetVolumeGroup = ElasticsanFunctions.getVolumeGroup(GetVolumeGroupArgs.builder()
     *             .name("existing")
     *             .elasticSanId(example.id())
     *             .build());
     * 
     *         final var exampleGetVolumeSnapshot = ElasticsanFunctions.getVolumeSnapshot(GetVolumeSnapshotArgs.builder()
     *             .name("existing")
     *             .volumeGroupId(exampleGetVolumeGroup.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetVolumeSnapshot.id());
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
     * * `Microsoft.ElasticSan`: 2023-01-01
     * 
     */
    public static CompletableFuture<GetVolumeSnapshotResult> getVolumeSnapshotPlain(GetVolumeSnapshotPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:elasticsan/getVolumeSnapshot:getVolumeSnapshot", TypeShape.of(GetVolumeSnapshotResult.class), args, Utilities.withVersion(options));
    }
}
