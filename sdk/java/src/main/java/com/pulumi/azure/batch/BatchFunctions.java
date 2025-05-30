// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.batch.inputs.GetAccountArgs;
import com.pulumi.azure.batch.inputs.GetAccountPlainArgs;
import com.pulumi.azure.batch.inputs.GetApplicationArgs;
import com.pulumi.azure.batch.inputs.GetApplicationPlainArgs;
import com.pulumi.azure.batch.inputs.GetCertificateArgs;
import com.pulumi.azure.batch.inputs.GetCertificatePlainArgs;
import com.pulumi.azure.batch.inputs.GetPoolArgs;
import com.pulumi.azure.batch.inputs.GetPoolPlainArgs;
import com.pulumi.azure.batch.outputs.GetAccountResult;
import com.pulumi.azure.batch.outputs.GetApplicationResult;
import com.pulumi.azure.batch.outputs.GetCertificateResult;
import com.pulumi.azure.batch.outputs.GetPoolResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class BatchFunctions {
    /**
     * Use this data source to access information about an existing Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetAccountArgs;
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
     *         final var example = BatchFunctions.getAccount(GetAccountArgs.builder()
     *             .name("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
     *         ctx.export("poolAllocationMode", example.poolAllocationMode());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetAccountArgs;
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
     *         final var example = BatchFunctions.getAccount(GetAccountArgs.builder()
     *             .name("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
     *         ctx.export("poolAllocationMode", example.poolAllocationMode());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetAccountArgs;
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
     *         final var example = BatchFunctions.getAccount(GetAccountArgs.builder()
     *             .name("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
     *         ctx.export("poolAllocationMode", example.poolAllocationMode());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetAccountArgs;
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
     *         final var example = BatchFunctions.getAccount(GetAccountArgs.builder()
     *             .name("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
     *         ctx.export("poolAllocationMode", example.poolAllocationMode());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetAccountArgs;
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
     *         final var example = BatchFunctions.getAccount(GetAccountArgs.builder()
     *             .name("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
     *         ctx.export("poolAllocationMode", example.poolAllocationMode());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:batch/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch Application instance.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetApplicationArgs;
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
     *         final var example = BatchFunctions.getApplication(GetApplicationArgs.builder()
     *             .name("testapplication")
     *             .resourceGroupName("test")
     *             .accountName("testbatchaccount")
     *             .build());
     * 
     *         ctx.export("batchApplicationId", example.id());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Batch Application instance.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetApplicationArgs;
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
     *         final var example = BatchFunctions.getApplication(GetApplicationArgs.builder()
     *             .name("testapplication")
     *             .resourceGroupName("test")
     *             .accountName("testbatchaccount")
     *             .build());
     * 
     *         ctx.export("batchApplicationId", example.id());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplicationPlain(GetApplicationPlainArgs args) {
        return getApplicationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Batch Application instance.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetApplicationArgs;
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
     *         final var example = BatchFunctions.getApplication(GetApplicationArgs.builder()
     *             .name("testapplication")
     *             .resourceGroupName("test")
     *             .accountName("testbatchaccount")
     *             .build());
     * 
     *         ctx.export("batchApplicationId", example.id());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch Application instance.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetApplicationArgs;
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
     *         final var example = BatchFunctions.getApplication(GetApplicationArgs.builder()
     *             .name("testapplication")
     *             .resourceGroupName("test")
     *             .accountName("testbatchaccount")
     *             .build());
     * 
     *         ctx.export("batchApplicationId", example.id());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch Application instance.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetApplicationArgs;
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
     *         final var example = BatchFunctions.getApplication(GetApplicationArgs.builder()
     *             .name("testapplication")
     *             .resourceGroupName("test")
     *             .accountName("testbatchaccount")
     *             .build());
     * 
     *         ctx.export("batchApplicationId", example.id());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplicationPlain(GetApplicationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:batch/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetCertificateArgs;
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
     *         final var example = BatchFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name("SHA1-42C107874FD0E4A9583292A2F1098E8FE4B2EDDA")
     *             .accountName("examplebatchaccount")
     *             .resourceGroupName("example")
     *             .build());
     * 
     *         ctx.export("thumbprint", example.thumbprint());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetCertificateArgs;
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
     *         final var example = BatchFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name("SHA1-42C107874FD0E4A9583292A2F1098E8FE4B2EDDA")
     *             .accountName("examplebatchaccount")
     *             .resourceGroupName("example")
     *             .build());
     * 
     *         ctx.export("thumbprint", example.thumbprint());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args) {
        return getCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetCertificateArgs;
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
     *         final var example = BatchFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name("SHA1-42C107874FD0E4A9583292A2F1098E8FE4B2EDDA")
     *             .accountName("examplebatchaccount")
     *             .resourceGroupName("example")
     *             .build());
     * 
     *         ctx.export("thumbprint", example.thumbprint());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getCertificate:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetCertificateArgs;
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
     *         final var example = BatchFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name("SHA1-42C107874FD0E4A9583292A2F1098E8FE4B2EDDA")
     *             .accountName("examplebatchaccount")
     *             .resourceGroupName("example")
     *             .build());
     * 
     *         ctx.export("thumbprint", example.thumbprint());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getCertificate:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetCertificateArgs;
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
     *         final var example = BatchFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name("SHA1-42C107874FD0E4A9583292A2F1098E8FE4B2EDDA")
     *             .accountName("examplebatchaccount")
     *             .resourceGroupName("example")
     *             .build());
     * 
     *         ctx.export("thumbprint", example.thumbprint());
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:batch/getCertificate:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch pool
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetPoolArgs;
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
     *         final var example = BatchFunctions.getPool(GetPoolArgs.builder()
     *             .name("testbatchpool")
     *             .accountName("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetPoolResult> getPool(GetPoolArgs args) {
        return getPool(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Batch pool
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetPoolArgs;
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
     *         final var example = BatchFunctions.getPool(GetPoolArgs.builder()
     *             .name("testbatchpool")
     *             .accountName("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetPoolResult> getPoolPlain(GetPoolPlainArgs args) {
        return getPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Batch pool
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetPoolArgs;
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
     *         final var example = BatchFunctions.getPool(GetPoolArgs.builder()
     *             .name("testbatchpool")
     *             .accountName("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetPoolResult> getPool(GetPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getPool:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch pool
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetPoolArgs;
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
     *         final var example = BatchFunctions.getPool(GetPoolArgs.builder()
     *             .name("testbatchpool")
     *             .accountName("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static Output<GetPoolResult> getPool(GetPoolArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:batch/getPool:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Batch pool
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
     * import com.pulumi.azure.batch.BatchFunctions;
     * import com.pulumi.azure.batch.inputs.GetPoolArgs;
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
     *         final var example = BatchFunctions.getPool(GetPoolArgs.builder()
     *             .name("testbatchpool")
     *             .accountName("testbatchaccount")
     *             .resourceGroupName("test")
     *             .build());
     * 
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
     * * `Microsoft.Batch`: 2024-07-01
     * 
     */
    public static CompletableFuture<GetPoolResult> getPoolPlain(GetPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:batch/getPool:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
}
