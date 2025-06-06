// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dashboard;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardArgs;
import com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardPlainArgs;
import com.pulumi.azure.dashboard.inputs.GetGrafanaArgs;
import com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs;
import com.pulumi.azure.dashboard.outputs.Azurerm_portal_dashboardResult;
import com.pulumi.azure.dashboard.outputs.GetGrafanaResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class DashboardFunctions {
    /**
     * Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurerm_dashboard` resource.
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
     * import com.pulumi.azure.portal.PortalFunctions;
     * import com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs;
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
     *         final var example = PortalFunctions.azurerm_portal_dashboard(Azurerm_portal_dashboardArgs.builder()
     *             .name("existing-dashboard")
     *             .resourceGroupName("dashboard-rg")
     *             .build());
     * 
     *         ctx.export("id", exampleAzurermDashboard.id());
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
     * * `Microsoft.Portal`: 2019-01-01-preview
     * 
     * @deprecated
     * azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard
     * 
     */
    @Deprecated /* azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard */
    public static Output<Azurerm_portal_dashboardResult> azurerm_portal_dashboard(Azurerm_portal_dashboardArgs args) {
        return azurerm_portal_dashboard(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurerm_dashboard` resource.
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
     * import com.pulumi.azure.portal.PortalFunctions;
     * import com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs;
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
     *         final var example = PortalFunctions.azurerm_portal_dashboard(Azurerm_portal_dashboardArgs.builder()
     *             .name("existing-dashboard")
     *             .resourceGroupName("dashboard-rg")
     *             .build());
     * 
     *         ctx.export("id", exampleAzurermDashboard.id());
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
     * * `Microsoft.Portal`: 2019-01-01-preview
     * 
     * @deprecated
     * azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard
     * 
     */
    @Deprecated /* azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard */
    public static CompletableFuture<Azurerm_portal_dashboardResult> azurerm_portal_dashboardPlain(Azurerm_portal_dashboardPlainArgs args) {
        return azurerm_portal_dashboardPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurerm_dashboard` resource.
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
     * import com.pulumi.azure.portal.PortalFunctions;
     * import com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs;
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
     *         final var example = PortalFunctions.azurerm_portal_dashboard(Azurerm_portal_dashboardArgs.builder()
     *             .name("existing-dashboard")
     *             .resourceGroupName("dashboard-rg")
     *             .build());
     * 
     *         ctx.export("id", exampleAzurermDashboard.id());
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
     * * `Microsoft.Portal`: 2019-01-01-preview
     * 
     * @deprecated
     * azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard
     * 
     */
    @Deprecated /* azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard */
    public static Output<Azurerm_portal_dashboardResult> azurerm_portal_dashboard(Azurerm_portal_dashboardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:dashboard/azurerm_portal_dashboard:azurerm_portal_dashboard", TypeShape.of(Azurerm_portal_dashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurerm_dashboard` resource.
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
     * import com.pulumi.azure.portal.PortalFunctions;
     * import com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs;
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
     *         final var example = PortalFunctions.azurerm_portal_dashboard(Azurerm_portal_dashboardArgs.builder()
     *             .name("existing-dashboard")
     *             .resourceGroupName("dashboard-rg")
     *             .build());
     * 
     *         ctx.export("id", exampleAzurermDashboard.id());
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
     * * `Microsoft.Portal`: 2019-01-01-preview
     * 
     * @deprecated
     * azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard
     * 
     */
    @Deprecated /* azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard */
    public static Output<Azurerm_portal_dashboardResult> azurerm_portal_dashboard(Azurerm_portal_dashboardArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:dashboard/azurerm_portal_dashboard:azurerm_portal_dashboard", TypeShape.of(Azurerm_portal_dashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurerm_dashboard` resource.
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
     * import com.pulumi.azure.portal.PortalFunctions;
     * import com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs;
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
     *         final var example = PortalFunctions.azurerm_portal_dashboard(Azurerm_portal_dashboardArgs.builder()
     *             .name("existing-dashboard")
     *             .resourceGroupName("dashboard-rg")
     *             .build());
     * 
     *         ctx.export("id", exampleAzurermDashboard.id());
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
     * * `Microsoft.Portal`: 2019-01-01-preview
     * 
     * @deprecated
     * azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard
     * 
     */
    @Deprecated /* azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard */
    public static CompletableFuture<Azurerm_portal_dashboardResult> azurerm_portal_dashboardPlain(Azurerm_portal_dashboardPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:dashboard/azurerm_portal_dashboard:azurerm_portal_dashboard", TypeShape.of(Azurerm_portal_dashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Grafana Dashboard.
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
     * import com.pulumi.azure.dashboard.DashboardFunctions;
     * import com.pulumi.azure.dashboard.inputs.GetGrafanaArgs;
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
     *         final var example = DashboardFunctions.getGrafana(GetGrafanaArgs.builder()
     *             .name("example-grafana-dashboard")
     *             .resourceGroupName("example-rg")
     *             .build());
     * 
     *         ctx.export("name", example.name());
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
     * * `Microsoft.Dashboard`: 2023-09-01
     * 
     */
    public static Output<GetGrafanaResult> getGrafana(GetGrafanaArgs args) {
        return getGrafana(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Grafana Dashboard.
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
     * import com.pulumi.azure.dashboard.DashboardFunctions;
     * import com.pulumi.azure.dashboard.inputs.GetGrafanaArgs;
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
     *         final var example = DashboardFunctions.getGrafana(GetGrafanaArgs.builder()
     *             .name("example-grafana-dashboard")
     *             .resourceGroupName("example-rg")
     *             .build());
     * 
     *         ctx.export("name", example.name());
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
     * * `Microsoft.Dashboard`: 2023-09-01
     * 
     */
    public static CompletableFuture<GetGrafanaResult> getGrafanaPlain(GetGrafanaPlainArgs args) {
        return getGrafanaPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Grafana Dashboard.
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
     * import com.pulumi.azure.dashboard.DashboardFunctions;
     * import com.pulumi.azure.dashboard.inputs.GetGrafanaArgs;
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
     *         final var example = DashboardFunctions.getGrafana(GetGrafanaArgs.builder()
     *             .name("example-grafana-dashboard")
     *             .resourceGroupName("example-rg")
     *             .build());
     * 
     *         ctx.export("name", example.name());
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
     * * `Microsoft.Dashboard`: 2023-09-01
     * 
     */
    public static Output<GetGrafanaResult> getGrafana(GetGrafanaArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:dashboard/getGrafana:getGrafana", TypeShape.of(GetGrafanaResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Grafana Dashboard.
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
     * import com.pulumi.azure.dashboard.DashboardFunctions;
     * import com.pulumi.azure.dashboard.inputs.GetGrafanaArgs;
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
     *         final var example = DashboardFunctions.getGrafana(GetGrafanaArgs.builder()
     *             .name("example-grafana-dashboard")
     *             .resourceGroupName("example-rg")
     *             .build());
     * 
     *         ctx.export("name", example.name());
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
     * * `Microsoft.Dashboard`: 2023-09-01
     * 
     */
    public static Output<GetGrafanaResult> getGrafana(GetGrafanaArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("azure:dashboard/getGrafana:getGrafana", TypeShape.of(GetGrafanaResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Grafana Dashboard.
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
     * import com.pulumi.azure.dashboard.DashboardFunctions;
     * import com.pulumi.azure.dashboard.inputs.GetGrafanaArgs;
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
     *         final var example = DashboardFunctions.getGrafana(GetGrafanaArgs.builder()
     *             .name("example-grafana-dashboard")
     *             .resourceGroupName("example-rg")
     *             .build());
     * 
     *         ctx.export("name", example.name());
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
     * * `Microsoft.Dashboard`: 2023-09-01
     * 
     */
    public static CompletableFuture<GetGrafanaResult> getGrafanaPlain(GetGrafanaPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:dashboard/getGrafana:getGrafana", TypeShape.of(GetGrafanaResult.class), args, Utilities.withVersion(options));
    }
}
