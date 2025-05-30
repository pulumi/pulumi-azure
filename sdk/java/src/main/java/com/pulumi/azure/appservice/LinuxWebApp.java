// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.LinuxWebAppArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppState;
import com.pulumi.azure.appservice.outputs.LinuxWebAppAuthSettings;
import com.pulumi.azure.appservice.outputs.LinuxWebAppAuthSettingsV2;
import com.pulumi.azure.appservice.outputs.LinuxWebAppBackup;
import com.pulumi.azure.appservice.outputs.LinuxWebAppConnectionString;
import com.pulumi.azure.appservice.outputs.LinuxWebAppIdentity;
import com.pulumi.azure.appservice.outputs.LinuxWebAppLogs;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteConfig;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteCredential;
import com.pulumi.azure.appservice.outputs.LinuxWebAppStickySettings;
import com.pulumi.azure.appservice.outputs.LinuxWebAppStorageAccount;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linux Web App.
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
 * import com.pulumi.azure.appservice.ServicePlan;
 * import com.pulumi.azure.appservice.ServicePlanArgs;
 * import com.pulumi.azure.appservice.LinuxWebApp;
 * import com.pulumi.azure.appservice.LinuxWebAppArgs;
 * import com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs;
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
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan("exampleServicePlan", ServicePlanArgs.builder()
 *             .name("example")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .osType("Linux")
 *             .skuName("P1v2")
 *             .build());
 * 
 *         var exampleLinuxWebApp = new LinuxWebApp("exampleLinuxWebApp", LinuxWebAppArgs.builder()
 *             .name("example")
 *             .resourceGroupName(example.name())
 *             .location(exampleServicePlan.location())
 *             .servicePlanId(exampleServicePlan.id())
 *             .siteConfig(LinuxWebAppSiteConfigArgs.builder()
 *                 .build())
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
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.Web`: 2023-12-01, 2023-01-01
 * 
 * ## Import
 * 
 * Linux Web Apps can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:appservice/linuxWebApp:LinuxWebApp example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/linuxWebApp:LinuxWebApp")
public class LinuxWebApp extends com.pulumi.resources.CustomResource {
    /**
     * A map of key-value pairs of App Settings.
     * 
     */
    @Export(name="appSettings", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> appSettings;

    /**
     * @return A map of key-value pairs of App Settings.
     * 
     */
    public Output<Optional<Map<String,String>>> appSettings() {
        return Codegen.optional(this.appSettings);
    }
    /**
     * A `auth_settings` block as defined below.
     * 
     */
    @Export(name="authSettings", refs={LinuxWebAppAuthSettings.class}, tree="[0]")
    private Output</* @Nullable */ LinuxWebAppAuthSettings> authSettings;

    /**
     * @return A `auth_settings` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppAuthSettings>> authSettings() {
        return Codegen.optional(this.authSettings);
    }
    /**
     * An `auth_settings_v2` block as defined below.
     * 
     */
    @Export(name="authSettingsV2", refs={LinuxWebAppAuthSettingsV2.class}, tree="[0]")
    private Output</* @Nullable */ LinuxWebAppAuthSettingsV2> authSettingsV2;

    /**
     * @return An `auth_settings_v2` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppAuthSettingsV2>> authSettingsV2() {
        return Codegen.optional(this.authSettingsV2);
    }
    /**
     * A `backup` block as defined below.
     * 
     */
    @Export(name="backup", refs={LinuxWebAppBackup.class}, tree="[0]")
    private Output</* @Nullable */ LinuxWebAppBackup> backup;

    /**
     * @return A `backup` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppBackup>> backup() {
        return Codegen.optional(this.backup);
    }
    /**
     * Should Client Affinity be enabled?
     * 
     */
    @Export(name="clientAffinityEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> clientAffinityEnabled;

    /**
     * @return Should Client Affinity be enabled?
     * 
     */
    public Output<Optional<Boolean>> clientAffinityEnabled() {
        return Codegen.optional(this.clientAffinityEnabled);
    }
    /**
     * Should Client Certificates be enabled?
     * 
     */
    @Export(name="clientCertificateEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> clientCertificateEnabled;

    /**
     * @return Should Client Certificates be enabled?
     * 
     */
    public Output<Optional<Boolean>> clientCertificateEnabled() {
        return Codegen.optional(this.clientCertificateEnabled);
    }
    /**
     * Paths to exclude when using client certificates, separated by ;
     * 
     */
    @Export(name="clientCertificateExclusionPaths", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientCertificateExclusionPaths;

    /**
     * @return Paths to exclude when using client certificates, separated by ;
     * 
     */
    public Output<Optional<String>> clientCertificateExclusionPaths() {
        return Codegen.optional(this.clientCertificateExclusionPaths);
    }
    /**
     * The Client Certificate mode. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`. This property has no effect when `client_certificate_enabled` is `false`. Defaults to `Required`.
     * 
     */
    @Export(name="clientCertificateMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientCertificateMode;

    /**
     * @return The Client Certificate mode. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`. This property has no effect when `client_certificate_enabled` is `false`. Defaults to `Required`.
     * 
     */
    public Output<Optional<String>> clientCertificateMode() {
        return Codegen.optional(this.clientCertificateMode);
    }
    /**
     * One or more `connection_string` blocks as defined below.
     * 
     */
    @Export(name="connectionStrings", refs={List.class,LinuxWebAppConnectionString.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LinuxWebAppConnectionString>> connectionStrings;

    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxWebAppConnectionString>>> connectionStrings() {
        return Codegen.optional(this.connectionStrings);
    }
    /**
     * The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    @Export(name="customDomainVerificationId", refs={String.class}, tree="[0]")
    private Output<String> customDomainVerificationId;

    /**
     * @return The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    public Output<String> customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * The default hostname of the Linux Web App.
     * 
     */
    @Export(name="defaultHostname", refs={String.class}, tree="[0]")
    private Output<String> defaultHostname;

    /**
     * @return The default hostname of the Linux Web App.
     * 
     */
    public Output<String> defaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Should the Linux Web App be enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Should the Linux Web App be enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Should the default FTP Basic Authentication publishing profile be enabled. Defaults to `true`.
     * 
     */
    @Export(name="ftpPublishBasicAuthenticationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ftpPublishBasicAuthenticationEnabled;

    /**
     * @return Should the default FTP Basic Authentication publishing profile be enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> ftpPublishBasicAuthenticationEnabled() {
        return Codegen.optional(this.ftpPublishBasicAuthenticationEnabled);
    }
    /**
     * The ID of the App Service Environment used by App Service.
     * 
     */
    @Export(name="hostingEnvironmentId", refs={String.class}, tree="[0]")
    private Output<String> hostingEnvironmentId;

    /**
     * @return The ID of the App Service Environment used by App Service.
     * 
     */
    public Output<String> hostingEnvironmentId() {
        return this.hostingEnvironmentId;
    }
    /**
     * Should the Linux Web App require HTTPS connections. Defaults to `false`.
     * 
     */
    @Export(name="httpsOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> httpsOnly;

    /**
     * @return Should the Linux Web App require HTTPS connections. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> httpsOnly() {
        return Codegen.optional(this.httpsOnly);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", refs={LinuxWebAppIdentity.class}, tree="[0]")
    private Output</* @Nullable */ LinuxWebAppIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity).
     * 
     */
    @Export(name="keyVaultReferenceIdentityId", refs={String.class}, tree="[0]")
    private Output<String> keyVaultReferenceIdentityId;

    /**
     * @return The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity).
     * 
     */
    public Output<String> keyVaultReferenceIdentityId() {
        return this.keyVaultReferenceIdentityId;
    }
    /**
     * The Kind value for this Linux Web App.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return The Kind value for this Linux Web App.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The Azure Region where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `logs` block as defined below.
     * 
     */
    @Export(name="logs", refs={LinuxWebAppLogs.class}, tree="[0]")
    private Output</* @Nullable */ LinuxWebAppLogs> logs;

    /**
     * @return A `logs` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppLogs>> logs() {
        return Codegen.optional(this.logs);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    @Export(name="outboundIpAddressLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> outboundIpAddressLists;

    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    public Output<List<String>> outboundIpAddressLists() {
        return this.outboundIpAddressLists;
    }
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    @Export(name="outboundIpAddresses", refs={String.class}, tree="[0]")
    private Output<String> outboundIpAddresses;

    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    public Output<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * A list of possible outbound ip address.
     * 
     */
    @Export(name="possibleOutboundIpAddressLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> possibleOutboundIpAddressLists;

    /**
     * @return A list of possible outbound ip address.
     * 
     */
    public Output<List<String>> possibleOutboundIpAddressLists() {
        return this.possibleOutboundIpAddressLists;
    }
    /**
     * A comma-separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    @Export(name="possibleOutboundIpAddresses", refs={String.class}, tree="[0]")
    private Output<String> possibleOutboundIpAddresses;

    /**
     * @return A comma-separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    public Output<String> possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    /**
     * Should public network access be enabled for the Web App. Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Should public network access be enabled for the Web App. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The name of the Resource Group where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Service Plan that this Linux App Service will be created in.
     * 
     */
    @Export(name="servicePlanId", refs={String.class}, tree="[0]")
    private Output<String> servicePlanId;

    /**
     * @return The ID of the Service Plan that this Linux App Service will be created in.
     * 
     */
    public Output<String> servicePlanId() {
        return this.servicePlanId;
    }
    /**
     * A `site_config` block as defined below.
     * 
     */
    @Export(name="siteConfig", refs={LinuxWebAppSiteConfig.class}, tree="[0]")
    private Output<LinuxWebAppSiteConfig> siteConfig;

    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public Output<LinuxWebAppSiteConfig> siteConfig() {
        return this.siteConfig;
    }
    /**
     * A `site_credential` block as defined below.
     * 
     */
    @Export(name="siteCredentials", refs={List.class,LinuxWebAppSiteCredential.class}, tree="[0,1]")
    private Output<List<LinuxWebAppSiteCredential>> siteCredentials;

    /**
     * @return A `site_credential` block as defined below.
     * 
     */
    public Output<List<LinuxWebAppSiteCredential>> siteCredentials() {
        return this.siteCredentials;
    }
    /**
     * A `sticky_settings` block as defined below.
     * 
     */
    @Export(name="stickySettings", refs={LinuxWebAppStickySettings.class}, tree="[0]")
    private Output</* @Nullable */ LinuxWebAppStickySettings> stickySettings;

    /**
     * @return A `sticky_settings` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppStickySettings>> stickySettings() {
        return Codegen.optional(this.stickySettings);
    }
    /**
     * One or more `storage_account` blocks as defined below.
     * 
     */
    @Export(name="storageAccounts", refs={List.class,LinuxWebAppStorageAccount.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LinuxWebAppStorageAccount>> storageAccounts;

    /**
     * @return One or more `storage_account` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxWebAppStorageAccount>>> storageAccounts() {
        return Codegen.optional(this.storageAccounts);
    }
    /**
     * A mapping of tags which should be assigned to the Linux Web App.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Linux Web App.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether backup and restore operations over the linked virtual network are enabled. Defaults to `false`.
     * 
     */
    @Export(name="virtualNetworkBackupRestoreEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> virtualNetworkBackupRestoreEnabled;

    /**
     * @return Whether backup and restore operations over the linked virtual network are enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> virtualNetworkBackupRestoreEnabled() {
        return Codegen.optional(this.virtualNetworkBackupRestoreEnabled);
    }
    @Export(name="virtualNetworkSubnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> virtualNetworkSubnetId;

    public Output<Optional<String>> virtualNetworkSubnetId() {
        return Codegen.optional(this.virtualNetworkSubnetId);
    }
    /**
     * Should the default WebDeploy Basic Authentication publishing credentials enabled. Defaults to `true`.
     * 
     * &gt; **Note:** Setting this value to true will disable the ability to use `zip_deploy_file` which currently relies on the default publishing profile.
     * 
     */
    @Export(name="webdeployPublishBasicAuthenticationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> webdeployPublishBasicAuthenticationEnabled;

    /**
     * @return Should the default WebDeploy Basic Authentication publishing credentials enabled. Defaults to `true`.
     * 
     * &gt; **Note:** Setting this value to true will disable the ability to use `zip_deploy_file` which currently relies on the default publishing profile.
     * 
     */
    public Output<Optional<Boolean>> webdeployPublishBasicAuthenticationEnabled() {
        return Codegen.optional(this.webdeployPublishBasicAuthenticationEnabled);
    }
    /**
     * The local path and filename of the Zip packaged application to deploy to this Linux Web App.
     * 
     * &gt; **Note:** Using this value requires either `WEBSITE_RUN_FROM_PACKAGE=1` or `SCM_DO_BUILD_DURING_DEPLOYMENT=true` to be set on the App in `app_settings`. Refer to the Azure docs on [running the Web App directly from the Zip package](https://learn.microsoft.com/en-us/azure/app-service/deploy-run-package), or [automating the build for Zip deploy](https://learn.microsoft.com/en-us/azure/app-service/deploy-zip#enable-build-automation-for-zip-deploy) for further details.
     * 
     */
    @Export(name="zipDeployFile", refs={String.class}, tree="[0]")
    private Output<String> zipDeployFile;

    /**
     * @return The local path and filename of the Zip packaged application to deploy to this Linux Web App.
     * 
     * &gt; **Note:** Using this value requires either `WEBSITE_RUN_FROM_PACKAGE=1` or `SCM_DO_BUILD_DURING_DEPLOYMENT=true` to be set on the App in `app_settings`. Refer to the Azure docs on [running the Web App directly from the Zip package](https://learn.microsoft.com/en-us/azure/app-service/deploy-run-package), or [automating the build for Zip deploy](https://learn.microsoft.com/en-us/azure/app-service/deploy-zip#enable-build-automation-for-zip-deploy) for further details.
     * 
     */
    public Output<String> zipDeployFile() {
        return this.zipDeployFile;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinuxWebApp(java.lang.String name) {
        this(name, LinuxWebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinuxWebApp(java.lang.String name, LinuxWebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinuxWebApp(java.lang.String name, LinuxWebAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/linuxWebApp:LinuxWebApp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LinuxWebApp(java.lang.String name, Output<java.lang.String> id, @Nullable LinuxWebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/linuxWebApp:LinuxWebApp", name, state, makeResourceOptions(options, id), false);
    }

    private static LinuxWebAppArgs makeArgs(LinuxWebAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LinuxWebAppArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "customDomainVerificationId",
                "siteCredentials"
            ))
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
    public static LinuxWebApp get(java.lang.String name, Output<java.lang.String> id, @Nullable LinuxWebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinuxWebApp(name, id, state, options);
    }
}
