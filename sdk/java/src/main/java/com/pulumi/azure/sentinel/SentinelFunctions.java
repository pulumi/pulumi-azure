// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyPlainArgs;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
import com.pulumi.azure.sentinel.inputs.GetAlertRulePlainArgs;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplatePlainArgs;
import com.pulumi.azure.sentinel.outputs.GetAlertRuleAnomalyResult;
import com.pulumi.azure.sentinel.outputs.GetAlertRuleResult;
import com.pulumi.azure.sentinel.outputs.GetAlertRuleTemplateResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class SentinelFunctions {
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     * import com.pulumi.azure.operationalinsights.OperationalinsightsFunctions;
     * import com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
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
     *         final var example = OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name("example")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         final var exampleGetAlertRule = SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name("existing")
     *             .logAnalyticsWorkspaceId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetAlertRule.id());
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
     * * `Microsoft.OperationalInsights`: 2023-12-01-preview
     * 
     */
    public static Output<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args) {
        return getAlertRule(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     * import com.pulumi.azure.operationalinsights.OperationalinsightsFunctions;
     * import com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
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
     *         final var example = OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name("example")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         final var exampleGetAlertRule = SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name("existing")
     *             .logAnalyticsWorkspaceId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetAlertRule.id());
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
     * * `Microsoft.OperationalInsights`: 2023-12-01-preview
     * 
     */
    public static CompletableFuture<GetAlertRuleResult> getAlertRulePlain(GetAlertRulePlainArgs args) {
        return getAlertRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     * import com.pulumi.azure.operationalinsights.OperationalinsightsFunctions;
     * import com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
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
     *         final var example = OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name("example")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         final var exampleGetAlertRule = SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name("existing")
     *             .logAnalyticsWorkspaceId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetAlertRule.id());
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
     * * `Microsoft.OperationalInsights`: 2023-12-01-preview
     * 
     */
    public static Output<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:sentinel/getAlertRule:getAlertRule", TypeShape.of(GetAlertRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     * import com.pulumi.azure.operationalinsights.OperationalinsightsFunctions;
     * import com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
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
     *         final var example = OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name("example")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         final var exampleGetAlertRule = SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name("existing")
     *             .logAnalyticsWorkspaceId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetAlertRule.id());
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
     * * `Microsoft.OperationalInsights`: 2023-12-01-preview
     * 
     */
    public static Output<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:sentinel/getAlertRule:getAlertRule", TypeShape.of(GetAlertRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     * import com.pulumi.azure.operationalinsights.OperationalinsightsFunctions;
     * import com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
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
     *         final var example = OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name("example")
     *             .resourceGroupName("example-resources")
     *             .build());
     * 
     *         final var exampleGetAlertRule = SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name("existing")
     *             .logAnalyticsWorkspaceId(example.id())
     *             .build());
     * 
     *         ctx.export("id", exampleGetAlertRule.id());
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
     * * `Microsoft.OperationalInsights`: 2023-12-01-preview
     * 
     */
    public static CompletableFuture<GetAlertRuleResult> getAlertRulePlain(GetAlertRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sentinel/getAlertRule:getAlertRule", TypeShape.of(GetAlertRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Anomaly Alert Rule.
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
     * import com.pulumi.azure.core.ResourceGroup;
     * import com.pulumi.azure.core.ResourceGroupArgs;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs;
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
     *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
     *             .name("example-resources")
     *             .location("West Europe")
     *             .build());
     * 
     *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
     *             .name("example-law")
     *             .location(exampleResourceGroup.location())
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .sku("PerGB2018")
     *             .build());
     * 
     *         var exampleLogAnalyticsWorkspaceOnboarding = new LogAnalyticsWorkspaceOnboarding("exampleLogAnalyticsWorkspaceOnboarding", LogAnalyticsWorkspaceOnboardingArgs.builder()
     *             .workspaceId(exampleAnalyticsWorkspace.id())
     *             .customerManagedKeyEnabled(false)
     *             .build());
     * 
     *         final var example = SentinelFunctions.getAlertRuleAnomaly(GetAlertRuleAnomalyArgs.builder()
     *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
     *             .displayName("Potential data staging")
     *             .build());
     * 
     *         ctx.export("id", example.applyValue(_example -> _example.id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetAlertRuleAnomalyResult> getAlertRuleAnomaly(GetAlertRuleAnomalyArgs args) {
        return getAlertRuleAnomaly(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Anomaly Alert Rule.
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
     * import com.pulumi.azure.core.ResourceGroup;
     * import com.pulumi.azure.core.ResourceGroupArgs;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs;
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
     *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
     *             .name("example-resources")
     *             .location("West Europe")
     *             .build());
     * 
     *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
     *             .name("example-law")
     *             .location(exampleResourceGroup.location())
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .sku("PerGB2018")
     *             .build());
     * 
     *         var exampleLogAnalyticsWorkspaceOnboarding = new LogAnalyticsWorkspaceOnboarding("exampleLogAnalyticsWorkspaceOnboarding", LogAnalyticsWorkspaceOnboardingArgs.builder()
     *             .workspaceId(exampleAnalyticsWorkspace.id())
     *             .customerManagedKeyEnabled(false)
     *             .build());
     * 
     *         final var example = SentinelFunctions.getAlertRuleAnomaly(GetAlertRuleAnomalyArgs.builder()
     *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
     *             .displayName("Potential data staging")
     *             .build());
     * 
     *         ctx.export("id", example.applyValue(_example -> _example.id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetAlertRuleAnomalyResult> getAlertRuleAnomalyPlain(GetAlertRuleAnomalyPlainArgs args) {
        return getAlertRuleAnomalyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Anomaly Alert Rule.
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
     * import com.pulumi.azure.core.ResourceGroup;
     * import com.pulumi.azure.core.ResourceGroupArgs;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs;
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
     *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
     *             .name("example-resources")
     *             .location("West Europe")
     *             .build());
     * 
     *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
     *             .name("example-law")
     *             .location(exampleResourceGroup.location())
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .sku("PerGB2018")
     *             .build());
     * 
     *         var exampleLogAnalyticsWorkspaceOnboarding = new LogAnalyticsWorkspaceOnboarding("exampleLogAnalyticsWorkspaceOnboarding", LogAnalyticsWorkspaceOnboardingArgs.builder()
     *             .workspaceId(exampleAnalyticsWorkspace.id())
     *             .customerManagedKeyEnabled(false)
     *             .build());
     * 
     *         final var example = SentinelFunctions.getAlertRuleAnomaly(GetAlertRuleAnomalyArgs.builder()
     *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
     *             .displayName("Potential data staging")
     *             .build());
     * 
     *         ctx.export("id", example.applyValue(_example -> _example.id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetAlertRuleAnomalyResult> getAlertRuleAnomaly(GetAlertRuleAnomalyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:sentinel/getAlertRuleAnomaly:getAlertRuleAnomaly", TypeShape.of(GetAlertRuleAnomalyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Anomaly Alert Rule.
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
     * import com.pulumi.azure.core.ResourceGroup;
     * import com.pulumi.azure.core.ResourceGroupArgs;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs;
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
     *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
     *             .name("example-resources")
     *             .location("West Europe")
     *             .build());
     * 
     *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
     *             .name("example-law")
     *             .location(exampleResourceGroup.location())
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .sku("PerGB2018")
     *             .build());
     * 
     *         var exampleLogAnalyticsWorkspaceOnboarding = new LogAnalyticsWorkspaceOnboarding("exampleLogAnalyticsWorkspaceOnboarding", LogAnalyticsWorkspaceOnboardingArgs.builder()
     *             .workspaceId(exampleAnalyticsWorkspace.id())
     *             .customerManagedKeyEnabled(false)
     *             .build());
     * 
     *         final var example = SentinelFunctions.getAlertRuleAnomaly(GetAlertRuleAnomalyArgs.builder()
     *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
     *             .displayName("Potential data staging")
     *             .build());
     * 
     *         ctx.export("id", example.applyValue(_example -> _example.id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetAlertRuleAnomalyResult> getAlertRuleAnomaly(GetAlertRuleAnomalyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:sentinel/getAlertRuleAnomaly:getAlertRuleAnomaly", TypeShape.of(GetAlertRuleAnomalyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Anomaly Alert Rule.
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
     * import com.pulumi.azure.core.ResourceGroup;
     * import com.pulumi.azure.core.ResourceGroupArgs;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
     * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding;
     * import com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs;
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs;
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
     *         var exampleResourceGroup = new ResourceGroup("exampleResourceGroup", ResourceGroupArgs.builder()
     *             .name("example-resources")
     *             .location("West Europe")
     *             .build());
     * 
     *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace("exampleAnalyticsWorkspace", AnalyticsWorkspaceArgs.builder()
     *             .name("example-law")
     *             .location(exampleResourceGroup.location())
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .sku("PerGB2018")
     *             .build());
     * 
     *         var exampleLogAnalyticsWorkspaceOnboarding = new LogAnalyticsWorkspaceOnboarding("exampleLogAnalyticsWorkspaceOnboarding", LogAnalyticsWorkspaceOnboardingArgs.builder()
     *             .workspaceId(exampleAnalyticsWorkspace.id())
     *             .customerManagedKeyEnabled(false)
     *             .build());
     * 
     *         final var example = SentinelFunctions.getAlertRuleAnomaly(GetAlertRuleAnomalyArgs.builder()
     *             .logAnalyticsWorkspaceId(exampleLogAnalyticsWorkspaceOnboarding.workspaceId())
     *             .displayName("Potential data staging")
     *             .build());
     * 
     *         ctx.export("id", example.applyValue(_example -> _example.id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetAlertRuleAnomalyResult> getAlertRuleAnomalyPlain(GetAlertRuleAnomalyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sentinel/getAlertRuleAnomaly:getAlertRuleAnomaly", TypeShape.of(GetAlertRuleAnomalyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
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
     *         final var example = SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1")
     *             .displayName("Create incidents based on Azure Security Center for IoT alerts")
     *             .build());
     * 
     *         ctx.export("id", example.id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetAlertRuleTemplateResult> getAlertRuleTemplate(GetAlertRuleTemplateArgs args) {
        return getAlertRuleTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
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
     *         final var example = SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1")
     *             .displayName("Create incidents based on Azure Security Center for IoT alerts")
     *             .build());
     * 
     *         ctx.export("id", example.id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetAlertRuleTemplateResult> getAlertRuleTemplatePlain(GetAlertRuleTemplatePlainArgs args) {
        return getAlertRuleTemplatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
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
     *         final var example = SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1")
     *             .displayName("Create incidents based on Azure Security Center for IoT alerts")
     *             .build());
     * 
     *         ctx.export("id", example.id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetAlertRuleTemplateResult> getAlertRuleTemplate(GetAlertRuleTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:sentinel/getAlertRuleTemplate:getAlertRuleTemplate", TypeShape.of(GetAlertRuleTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
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
     *         final var example = SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1")
     *             .displayName("Create incidents based on Azure Security Center for IoT alerts")
     *             .build());
     * 
     *         ctx.export("id", example.id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetAlertRuleTemplateResult> getAlertRuleTemplate(GetAlertRuleTemplateArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:sentinel/getAlertRuleTemplate:getAlertRuleTemplate", TypeShape.of(GetAlertRuleTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     * import com.pulumi.azure.sentinel.SentinelFunctions;
     * import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
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
     *         final var example = SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1")
     *             .displayName("Create incidents based on Azure Security Center for IoT alerts")
     *             .build());
     * 
     *         ctx.export("id", example.id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetAlertRuleTemplateResult> getAlertRuleTemplatePlain(GetAlertRuleTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sentinel/getAlertRuleTemplate:getAlertRuleTemplate", TypeShape.of(GetAlertRuleTemplateResult.class), args, Utilities.withVersion(options));
    }
}
