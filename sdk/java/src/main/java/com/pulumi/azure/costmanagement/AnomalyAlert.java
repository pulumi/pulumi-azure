// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.costmanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.costmanagement.AnomalyAlertArgs;
import com.pulumi.azure.costmanagement.inputs.AnomalyAlertState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cost Anomaly Alert.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.costmanagement.AnomalyAlert;
 * import com.pulumi.azure.costmanagement.AnomalyAlertArgs;
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
 *         var example = new AnomalyAlert(&#34;example&#34;, AnomalyAlertArgs.builder()        
 *             .displayName(&#34;Alert DisplayName&#34;)
 *             .emailAddresses(&#34;example@test.net&#34;)
 *             .emailSubject(&#34;My Test Anomaly Alert&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cost Anomaly Alerts can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:costmanagement/anomalyAlert:AnomalyAlert example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.CostManagement/scheduledActions/dailyanomalybyresourcegroup
 * ```
 * 
 */
@ResourceType(type="azure:costmanagement/anomalyAlert:AnomalyAlert")
public class AnomalyAlert extends com.pulumi.resources.CustomResource {
    /**
     * The display name which should be used for this Cost Anomaly Alert.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name which should be used for this Cost Anomaly Alert.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Specifies a list of email addresses which the Anomaly Alerts are send to.
     * 
     */
    @Export(name="emailAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> emailAddresses;

    /**
     * @return Specifies a list of email addresses which the Anomaly Alerts are send to.
     * 
     */
    public Output<List<String>> emailAddresses() {
        return this.emailAddresses;
    }
    /**
     * The email subject of the Cost Anomaly Alerts. Maximum length of the subject is 70.
     * 
     */
    @Export(name="emailSubject", type=String.class, parameters={})
    private Output<String> emailSubject;

    /**
     * @return The email subject of the Cost Anomaly Alerts. Maximum length of the subject is 70.
     * 
     */
    public Output<String> emailSubject() {
        return this.emailSubject;
    }
    /**
     * The message of the Cost Anomaly Alert. Maximum length of the message is 250.
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output</* @Nullable */ String> message;

    /**
     * @return The message of the Cost Anomaly Alert. Maximum length of the message is 250.
     * 
     */
    public Output<Optional<String>> message() {
        return Codegen.optional(this.message);
    }
    /**
     * The name which should be used for this Cost Anomaly Alert. Changing this forces a new resource to be created. The name can contain only lowercase letters, numbers and hyphens.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Cost Anomaly Alert. Changing this forces a new resource to be created. The name can contain only lowercase letters, numbers and hyphens.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnomalyAlert(String name) {
        this(name, AnomalyAlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnomalyAlert(String name, AnomalyAlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnomalyAlert(String name, AnomalyAlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:costmanagement/anomalyAlert:AnomalyAlert", name, args == null ? AnomalyAlertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AnomalyAlert(String name, Output<String> id, @Nullable AnomalyAlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:costmanagement/anomalyAlert:AnomalyAlert", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AnomalyAlert get(String name, Output<String> id, @Nullable AnomalyAlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AnomalyAlert(name, id, state, options);
    }
}