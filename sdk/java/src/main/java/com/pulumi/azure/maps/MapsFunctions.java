// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maps;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.maps.inputs.GetAccountArgs;
import com.pulumi.azure.maps.inputs.GetAccountPlainArgs;
import com.pulumi.azure.maps.outputs.GetAccountResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MapsFunctions {
    /**
     * Use this data source to access information about an existing Azure Maps Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.maps.MapsFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = MapsFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;production&#34;)
     *             .resourceGroupName(&#34;maps&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mapsAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Azure Maps Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.maps.MapsFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = MapsFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;production&#34;)
     *             .resourceGroupName(&#34;maps&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mapsAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Azure Maps Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.maps.MapsFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = MapsFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;production&#34;)
     *             .resourceGroupName(&#34;maps&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mapsAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:maps/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Azure Maps Account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.maps.MapsFunctions;
     * import com.pulumi.azure.automation.inputs.GetAccountArgs;
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
     *         final var example = MapsFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;production&#34;)
     *             .resourceGroupName(&#34;maps&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mapsAccountId&#34;, example.applyValue(getAccountResult -&gt; getAccountResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:maps/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
}