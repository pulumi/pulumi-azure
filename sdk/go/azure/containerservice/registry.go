// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package containerservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Container Registry.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/containerservice"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = containerservice.NewRegistry(ctx, "acr", &containerservice.RegistryArgs{
//				Name:              pulumi.String("containerRegistry1"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku:               pulumi.String("Premium"),
//				AdminEnabled:      pulumi.Bool(false),
//				Georeplications: containerservice.RegistryGeoreplicationArray{
//					&containerservice.RegistryGeoreplicationArgs{
//						Location:              pulumi.String("East US"),
//						ZoneRedundancyEnabled: pulumi.Bool(true),
//						Tags:                  pulumi.StringMap{},
//					},
//					&containerservice.RegistryGeoreplicationArgs{
//						Location:              pulumi.String("North Europe"),
//						ZoneRedundancyEnabled: pulumi.Bool(true),
//						Tags:                  pulumi.StringMap{},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Encryption)
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/containerservice"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleUserAssignedIdentity, err := authorization.NewUserAssignedIdentity(ctx, "example", &authorization.UserAssignedIdentityArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Name:              pulumi.String("registry-uai"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := keyvault.LookupKey(ctx, &keyvault.LookupKeyArgs{
//				Name:       "super-secret",
//				KeyVaultId: existing.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = containerservice.NewRegistry(ctx, "acr", &containerservice.RegistryArgs{
//				Name:              pulumi.String("containerRegistry1"),
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Sku:               pulumi.String("Premium"),
//				Identity: &containerservice.RegistryIdentityArgs{
//					Type: pulumi.String("UserAssigned"),
//					IdentityIds: pulumi.StringArray{
//						exampleUserAssignedIdentity.ID(),
//					},
//				},
//				Encryption: &containerservice.RegistryEncryptionArgs{
//					KeyVaultKeyId:    pulumi.String(example.Id),
//					IdentityClientId: exampleUserAssignedIdentity.ClientId,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Attaching A Container Registry To A Kubernetes Cluster)
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/containerservice"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleRegistry, err := containerservice.NewRegistry(ctx, "example", &containerservice.RegistryArgs{
//				Name:              pulumi.String("containerRegistry1"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku:               pulumi.String("Premium"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleKubernetesCluster, err := containerservice.NewKubernetesCluster(ctx, "example", &containerservice.KubernetesClusterArgs{
//				Name:              pulumi.String("example-aks1"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				DnsPrefix:         pulumi.String("exampleaks1"),
//				DefaultNodePool: &containerservice.KubernetesClusterDefaultNodePoolArgs{
//					Name:      pulumi.String("default"),
//					NodeCount: pulumi.Int(1),
//					VmSize:    pulumi.String("Standard_D2_v2"),
//				},
//				Identity: &containerservice.KubernetesClusterIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("Production"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = authorization.NewAssignment(ctx, "example", &authorization.AssignmentArgs{
//				PrincipalId: pulumi.String(exampleKubernetesCluster.KubeletIdentity.ApplyT(func(kubeletIdentity containerservice.KubernetesClusterKubeletIdentity) (*string, error) {
//					return &kubeletIdentity.ObjectId, nil
//				}).(pulumi.StringPtrOutput)),
//				RoleDefinitionName:           pulumi.String("AcrPull"),
//				Scope:                        exampleRegistry.ID(),
//				SkipServicePrincipalAadCheck: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.ContainerRegistry`: 2023-11-01-preview
//
// ## Import
//
// Container Registries can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:containerservice/registry:Registry example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ContainerRegistry/registries/myregistry1
// ```
type Registry struct {
	pulumi.CustomResourceState

	// Specifies whether the admin user is enabled. Defaults to `false`.
	AdminEnabled pulumi.BoolPtrOutput `pulumi:"adminEnabled"`
	// The Password associated with the Container Registry Admin account - if the admin account is enabled.
	AdminPassword pulumi.StringOutput `pulumi:"adminPassword"`
	// The Username associated with the Container Registry Admin account - if the admin account is enabled.
	AdminUsername pulumi.StringOutput `pulumi:"adminUsername"`
	// Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
	AnonymousPullEnabled pulumi.BoolPtrOutput `pulumi:"anonymousPullEnabled"`
	// Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
	DataEndpointEnabled pulumi.BoolPtrOutput `pulumi:"dataEndpointEnabled"`
	// An `encryption` block as documented below.
	Encryption RegistryEncryptionOutput `pulumi:"encryption"`
	// Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `publicNetworkAccessEnabled` is also set to `false`.
	//
	// > **Note:** `quarantinePolicyEnabled`, `retentionPolicyInDays`, `trustPolicyEnabled`, `exportPolicyEnabled` and `zoneRedundancyEnabled` are only supported on resources with the `Premium` SKU.
	ExportPolicyEnabled pulumi.BoolPtrOutput `pulumi:"exportPolicyEnabled"`
	// One or more `georeplications` blocks as documented below.
	//
	// > **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
	//
	// > **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
	//
	// > **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
	Georeplications RegistryGeoreplicationArrayOutput `pulumi:"georeplications"`
	// An `identity` block as defined below.
	Identity RegistryIdentityPtrOutput `pulumi:"identity"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The URL that can be used to log into the container registry.
	LoginServer pulumi.StringOutput `pulumi:"loginServer"`
	// Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
	NetworkRuleBypassOption pulumi.StringPtrOutput `pulumi:"networkRuleBypassOption"`
	// A `networkRuleSet` block as documented below.
	NetworkRuleSet RegistryNetworkRuleSetOutput `pulumi:"networkRuleSet"`
	// Whether public network access is allowed for the container registry. Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrOutput `pulumi:"publicNetworkAccessEnabled"`
	// Boolean value that indicates whether quarantine policy is enabled.
	QuarantinePolicyEnabled pulumi.BoolPtrOutput `pulumi:"quarantinePolicyEnabled"`
	// The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
	RetentionPolicyInDays pulumi.IntPtrOutput `pulumi:"retentionPolicyInDays"`
	// The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
	Sku pulumi.StringOutput `pulumi:"sku"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
	TrustPolicyEnabled pulumi.BoolPtrOutput `pulumi:"trustPolicyEnabled"`
	// Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
	ZoneRedundancyEnabled pulumi.BoolPtrOutput `pulumi:"zoneRedundancyEnabled"`
}

// NewRegistry registers a new resource with the given unique name, arguments, and options.
func NewRegistry(ctx *pulumi.Context,
	name string, args *RegistryArgs, opts ...pulumi.ResourceOption) (*Registry, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Sku == nil {
		return nil, errors.New("invalid value for required argument 'Sku'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"adminPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Registry
	err := ctx.RegisterResource("azure:containerservice/registry:Registry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistry gets an existing Registry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryState, opts ...pulumi.ResourceOption) (*Registry, error) {
	var resource Registry
	err := ctx.ReadResource("azure:containerservice/registry:Registry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Registry resources.
type registryState struct {
	// Specifies whether the admin user is enabled. Defaults to `false`.
	AdminEnabled *bool `pulumi:"adminEnabled"`
	// The Password associated with the Container Registry Admin account - if the admin account is enabled.
	AdminPassword *string `pulumi:"adminPassword"`
	// The Username associated with the Container Registry Admin account - if the admin account is enabled.
	AdminUsername *string `pulumi:"adminUsername"`
	// Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
	AnonymousPullEnabled *bool `pulumi:"anonymousPullEnabled"`
	// Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
	DataEndpointEnabled *bool `pulumi:"dataEndpointEnabled"`
	// An `encryption` block as documented below.
	Encryption *RegistryEncryption `pulumi:"encryption"`
	// Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `publicNetworkAccessEnabled` is also set to `false`.
	//
	// > **Note:** `quarantinePolicyEnabled`, `retentionPolicyInDays`, `trustPolicyEnabled`, `exportPolicyEnabled` and `zoneRedundancyEnabled` are only supported on resources with the `Premium` SKU.
	ExportPolicyEnabled *bool `pulumi:"exportPolicyEnabled"`
	// One or more `georeplications` blocks as documented below.
	//
	// > **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
	//
	// > **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
	//
	// > **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
	Georeplications []RegistryGeoreplication `pulumi:"georeplications"`
	// An `identity` block as defined below.
	Identity *RegistryIdentity `pulumi:"identity"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The URL that can be used to log into the container registry.
	LoginServer *string `pulumi:"loginServer"`
	// Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
	NetworkRuleBypassOption *string `pulumi:"networkRuleBypassOption"`
	// A `networkRuleSet` block as documented below.
	NetworkRuleSet *RegistryNetworkRuleSet `pulumi:"networkRuleSet"`
	// Whether public network access is allowed for the container registry. Defaults to `true`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// Boolean value that indicates whether quarantine policy is enabled.
	QuarantinePolicyEnabled *bool `pulumi:"quarantinePolicyEnabled"`
	// The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
	RetentionPolicyInDays *int `pulumi:"retentionPolicyInDays"`
	// The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
	Sku *string `pulumi:"sku"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
	TrustPolicyEnabled *bool `pulumi:"trustPolicyEnabled"`
	// Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
	ZoneRedundancyEnabled *bool `pulumi:"zoneRedundancyEnabled"`
}

type RegistryState struct {
	// Specifies whether the admin user is enabled. Defaults to `false`.
	AdminEnabled pulumi.BoolPtrInput
	// The Password associated with the Container Registry Admin account - if the admin account is enabled.
	AdminPassword pulumi.StringPtrInput
	// The Username associated with the Container Registry Admin account - if the admin account is enabled.
	AdminUsername pulumi.StringPtrInput
	// Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
	AnonymousPullEnabled pulumi.BoolPtrInput
	// Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
	DataEndpointEnabled pulumi.BoolPtrInput
	// An `encryption` block as documented below.
	Encryption RegistryEncryptionPtrInput
	// Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `publicNetworkAccessEnabled` is also set to `false`.
	//
	// > **Note:** `quarantinePolicyEnabled`, `retentionPolicyInDays`, `trustPolicyEnabled`, `exportPolicyEnabled` and `zoneRedundancyEnabled` are only supported on resources with the `Premium` SKU.
	ExportPolicyEnabled pulumi.BoolPtrInput
	// One or more `georeplications` blocks as documented below.
	//
	// > **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
	//
	// > **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
	//
	// > **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
	Georeplications RegistryGeoreplicationArrayInput
	// An `identity` block as defined below.
	Identity RegistryIdentityPtrInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The URL that can be used to log into the container registry.
	LoginServer pulumi.StringPtrInput
	// Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
	NetworkRuleBypassOption pulumi.StringPtrInput
	// A `networkRuleSet` block as documented below.
	NetworkRuleSet RegistryNetworkRuleSetPtrInput
	// Whether public network access is allowed for the container registry. Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// Boolean value that indicates whether quarantine policy is enabled.
	QuarantinePolicyEnabled pulumi.BoolPtrInput
	// The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
	RetentionPolicyInDays pulumi.IntPtrInput
	// The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
	Sku pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
	TrustPolicyEnabled pulumi.BoolPtrInput
	// Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
	ZoneRedundancyEnabled pulumi.BoolPtrInput
}

func (RegistryState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryState)(nil)).Elem()
}

type registryArgs struct {
	// Specifies whether the admin user is enabled. Defaults to `false`.
	AdminEnabled *bool `pulumi:"adminEnabled"`
	// Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
	AnonymousPullEnabled *bool `pulumi:"anonymousPullEnabled"`
	// Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
	DataEndpointEnabled *bool `pulumi:"dataEndpointEnabled"`
	// An `encryption` block as documented below.
	Encryption *RegistryEncryption `pulumi:"encryption"`
	// Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `publicNetworkAccessEnabled` is also set to `false`.
	//
	// > **Note:** `quarantinePolicyEnabled`, `retentionPolicyInDays`, `trustPolicyEnabled`, `exportPolicyEnabled` and `zoneRedundancyEnabled` are only supported on resources with the `Premium` SKU.
	ExportPolicyEnabled *bool `pulumi:"exportPolicyEnabled"`
	// One or more `georeplications` blocks as documented below.
	//
	// > **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
	//
	// > **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
	//
	// > **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
	Georeplications []RegistryGeoreplication `pulumi:"georeplications"`
	// An `identity` block as defined below.
	Identity *RegistryIdentity `pulumi:"identity"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
	NetworkRuleBypassOption *string `pulumi:"networkRuleBypassOption"`
	// A `networkRuleSet` block as documented below.
	NetworkRuleSet *RegistryNetworkRuleSet `pulumi:"networkRuleSet"`
	// Whether public network access is allowed for the container registry. Defaults to `true`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// Boolean value that indicates whether quarantine policy is enabled.
	QuarantinePolicyEnabled *bool `pulumi:"quarantinePolicyEnabled"`
	// The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
	RetentionPolicyInDays *int `pulumi:"retentionPolicyInDays"`
	// The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
	Sku string `pulumi:"sku"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
	TrustPolicyEnabled *bool `pulumi:"trustPolicyEnabled"`
	// Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
	ZoneRedundancyEnabled *bool `pulumi:"zoneRedundancyEnabled"`
}

// The set of arguments for constructing a Registry resource.
type RegistryArgs struct {
	// Specifies whether the admin user is enabled. Defaults to `false`.
	AdminEnabled pulumi.BoolPtrInput
	// Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
	AnonymousPullEnabled pulumi.BoolPtrInput
	// Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
	DataEndpointEnabled pulumi.BoolPtrInput
	// An `encryption` block as documented below.
	Encryption RegistryEncryptionPtrInput
	// Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `publicNetworkAccessEnabled` is also set to `false`.
	//
	// > **Note:** `quarantinePolicyEnabled`, `retentionPolicyInDays`, `trustPolicyEnabled`, `exportPolicyEnabled` and `zoneRedundancyEnabled` are only supported on resources with the `Premium` SKU.
	ExportPolicyEnabled pulumi.BoolPtrInput
	// One or more `georeplications` blocks as documented below.
	//
	// > **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
	//
	// > **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
	//
	// > **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
	Georeplications RegistryGeoreplicationArrayInput
	// An `identity` block as defined below.
	Identity RegistryIdentityPtrInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
	NetworkRuleBypassOption pulumi.StringPtrInput
	// A `networkRuleSet` block as documented below.
	NetworkRuleSet RegistryNetworkRuleSetPtrInput
	// Whether public network access is allowed for the container registry. Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// Boolean value that indicates whether quarantine policy is enabled.
	QuarantinePolicyEnabled pulumi.BoolPtrInput
	// The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
	RetentionPolicyInDays pulumi.IntPtrInput
	// The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
	Sku pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
	TrustPolicyEnabled pulumi.BoolPtrInput
	// Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
	ZoneRedundancyEnabled pulumi.BoolPtrInput
}

func (RegistryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryArgs)(nil)).Elem()
}

type RegistryInput interface {
	pulumi.Input

	ToRegistryOutput() RegistryOutput
	ToRegistryOutputWithContext(ctx context.Context) RegistryOutput
}

func (*Registry) ElementType() reflect.Type {
	return reflect.TypeOf((**Registry)(nil)).Elem()
}

func (i *Registry) ToRegistryOutput() RegistryOutput {
	return i.ToRegistryOutputWithContext(context.Background())
}

func (i *Registry) ToRegistryOutputWithContext(ctx context.Context) RegistryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryOutput)
}

// RegistryArrayInput is an input type that accepts RegistryArray and RegistryArrayOutput values.
// You can construct a concrete instance of `RegistryArrayInput` via:
//
//	RegistryArray{ RegistryArgs{...} }
type RegistryArrayInput interface {
	pulumi.Input

	ToRegistryArrayOutput() RegistryArrayOutput
	ToRegistryArrayOutputWithContext(context.Context) RegistryArrayOutput
}

type RegistryArray []RegistryInput

func (RegistryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Registry)(nil)).Elem()
}

func (i RegistryArray) ToRegistryArrayOutput() RegistryArrayOutput {
	return i.ToRegistryArrayOutputWithContext(context.Background())
}

func (i RegistryArray) ToRegistryArrayOutputWithContext(ctx context.Context) RegistryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryArrayOutput)
}

// RegistryMapInput is an input type that accepts RegistryMap and RegistryMapOutput values.
// You can construct a concrete instance of `RegistryMapInput` via:
//
//	RegistryMap{ "key": RegistryArgs{...} }
type RegistryMapInput interface {
	pulumi.Input

	ToRegistryMapOutput() RegistryMapOutput
	ToRegistryMapOutputWithContext(context.Context) RegistryMapOutput
}

type RegistryMap map[string]RegistryInput

func (RegistryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Registry)(nil)).Elem()
}

func (i RegistryMap) ToRegistryMapOutput() RegistryMapOutput {
	return i.ToRegistryMapOutputWithContext(context.Background())
}

func (i RegistryMap) ToRegistryMapOutputWithContext(ctx context.Context) RegistryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryMapOutput)
}

type RegistryOutput struct{ *pulumi.OutputState }

func (RegistryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Registry)(nil)).Elem()
}

func (o RegistryOutput) ToRegistryOutput() RegistryOutput {
	return o
}

func (o RegistryOutput) ToRegistryOutputWithContext(ctx context.Context) RegistryOutput {
	return o
}

// Specifies whether the admin user is enabled. Defaults to `false`.
func (o RegistryOutput) AdminEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.AdminEnabled }).(pulumi.BoolPtrOutput)
}

// The Password associated with the Container Registry Admin account - if the admin account is enabled.
func (o RegistryOutput) AdminPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.AdminPassword }).(pulumi.StringOutput)
}

// The Username associated with the Container Registry Admin account - if the admin account is enabled.
func (o RegistryOutput) AdminUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.AdminUsername }).(pulumi.StringOutput)
}

// Whether to allow anonymous (unauthenticated) pull access to this Container Registry. This is only supported on resources with the `Standard` or `Premium` SKU.
func (o RegistryOutput) AnonymousPullEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.AnonymousPullEnabled }).(pulumi.BoolPtrOutput)
}

// Whether to enable dedicated data endpoints for this Container Registry? This is only supported on resources with the `Premium` SKU.
func (o RegistryOutput) DataEndpointEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.DataEndpointEnabled }).(pulumi.BoolPtrOutput)
}

// An `encryption` block as documented below.
func (o RegistryOutput) Encryption() RegistryEncryptionOutput {
	return o.ApplyT(func(v *Registry) RegistryEncryptionOutput { return v.Encryption }).(RegistryEncryptionOutput)
}

// Boolean value that indicates whether export policy is enabled. Defaults to `true`. In order to set it to `false`, make sure the `publicNetworkAccessEnabled` is also set to `false`.
//
// > **Note:** `quarantinePolicyEnabled`, `retentionPolicyInDays`, `trustPolicyEnabled`, `exportPolicyEnabled` and `zoneRedundancyEnabled` are only supported on resources with the `Premium` SKU.
func (o RegistryOutput) ExportPolicyEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.ExportPolicyEnabled }).(pulumi.BoolPtrOutput)
}

// One or more `georeplications` blocks as documented below.
//
// > **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
//
// > **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
//
// > **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
func (o RegistryOutput) Georeplications() RegistryGeoreplicationArrayOutput {
	return o.ApplyT(func(v *Registry) RegistryGeoreplicationArrayOutput { return v.Georeplications }).(RegistryGeoreplicationArrayOutput)
}

// An `identity` block as defined below.
func (o RegistryOutput) Identity() RegistryIdentityPtrOutput {
	return o.ApplyT(func(v *Registry) RegistryIdentityPtrOutput { return v.Identity }).(RegistryIdentityPtrOutput)
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o RegistryOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The URL that can be used to log into the container registry.
func (o RegistryOutput) LoginServer() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.LoginServer }).(pulumi.StringOutput)
}

// Specifies the name of the Container Registry. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
func (o RegistryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Whether to allow trusted Azure services to access a network-restricted Container Registry? Possible values are `None` and `AzureServices`. Defaults to `AzureServices`.
func (o RegistryOutput) NetworkRuleBypassOption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringPtrOutput { return v.NetworkRuleBypassOption }).(pulumi.StringPtrOutput)
}

// A `networkRuleSet` block as documented below.
func (o RegistryOutput) NetworkRuleSet() RegistryNetworkRuleSetOutput {
	return o.ApplyT(func(v *Registry) RegistryNetworkRuleSetOutput { return v.NetworkRuleSet }).(RegistryNetworkRuleSetOutput)
}

// Whether public network access is allowed for the container registry. Defaults to `true`.
func (o RegistryOutput) PublicNetworkAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.PublicNetworkAccessEnabled }).(pulumi.BoolPtrOutput)
}

// Boolean value that indicates whether quarantine policy is enabled.
func (o RegistryOutput) QuarantinePolicyEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.QuarantinePolicyEnabled }).(pulumi.BoolPtrOutput)
}

// The name of the resource group in which to create the Container Registry. Changing this forces a new resource to be created.
func (o RegistryOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The number of days to retain and untagged manifest after which it gets purged. Defaults to `7`.
func (o RegistryOutput) RetentionPolicyInDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.IntPtrOutput { return v.RetentionPolicyInDays }).(pulumi.IntPtrOutput)
}

// The SKU name of the container registry. Possible values are `Basic`, `Standard` and `Premium`.
func (o RegistryOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringOutput { return v.Sku }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o RegistryOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Registry) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Boolean value that indicated whether trust policy is enabled. Defaults to `false`.
func (o RegistryOutput) TrustPolicyEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.TrustPolicyEnabled }).(pulumi.BoolPtrOutput)
}

// Whether zone redundancy is enabled for this Container Registry? Changing this forces a new resource to be created. Defaults to `false`.
func (o RegistryOutput) ZoneRedundancyEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Registry) pulumi.BoolPtrOutput { return v.ZoneRedundancyEnabled }).(pulumi.BoolPtrOutput)
}

type RegistryArrayOutput struct{ *pulumi.OutputState }

func (RegistryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Registry)(nil)).Elem()
}

func (o RegistryArrayOutput) ToRegistryArrayOutput() RegistryArrayOutput {
	return o
}

func (o RegistryArrayOutput) ToRegistryArrayOutputWithContext(ctx context.Context) RegistryArrayOutput {
	return o
}

func (o RegistryArrayOutput) Index(i pulumi.IntInput) RegistryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Registry {
		return vs[0].([]*Registry)[vs[1].(int)]
	}).(RegistryOutput)
}

type RegistryMapOutput struct{ *pulumi.OutputState }

func (RegistryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Registry)(nil)).Elem()
}

func (o RegistryMapOutput) ToRegistryMapOutput() RegistryMapOutput {
	return o
}

func (o RegistryMapOutput) ToRegistryMapOutputWithContext(ctx context.Context) RegistryMapOutput {
	return o
}

func (o RegistryMapOutput) MapIndex(k pulumi.StringInput) RegistryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Registry {
		return vs[0].(map[string]*Registry)[vs[1].(string)]
	}).(RegistryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryInput)(nil)).Elem(), &Registry{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryArrayInput)(nil)).Elem(), RegistryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryMapInput)(nil)).Elem(), RegistryMap{})
	pulumi.RegisterOutputType(RegistryOutput{})
	pulumi.RegisterOutputType(RegistryArrayOutput{})
	pulumi.RegisterOutputType(RegistryMapOutput{})
}
