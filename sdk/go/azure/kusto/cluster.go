// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kusto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Kusto (also known as Azure Data Explorer) Cluster
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/kusto"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("my-kusto-cluster-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kusto.NewCluster(ctx, "example", &kusto.ClusterArgs{
//				Name:              pulumi.String("kustocluster"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku: &kusto.ClusterSkuArgs{
//					Name:     pulumi.String("Standard_D13_v2"),
//					Capacity: pulumi.Int(2),
//				},
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("Production"),
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
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Kusto`: 2024-04-13
//
// ## Import
//
// Kusto Clusters can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:kusto/cluster:Cluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/clusters/cluster1
// ```
type Cluster struct {
	pulumi.CustomResourceState

	// List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
	AllowedFqdns pulumi.StringArrayOutput `pulumi:"allowedFqdns"`
	// The list of ips in the format of CIDR allowed to connect to the cluster.
	AllowedIpRanges pulumi.StringArrayOutput `pulumi:"allowedIpRanges"`
	// Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
	AutoStopEnabled pulumi.BoolPtrOutput `pulumi:"autoStopEnabled"`
	// The Kusto Cluster URI to be used for data ingestion.
	DataIngestionUri pulumi.StringOutput `pulumi:"dataIngestionUri"`
	// Specifies if the cluster's disks are encrypted.
	DiskEncryptionEnabled pulumi.BoolPtrOutput `pulumi:"diskEncryptionEnabled"`
	// Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
	DoubleEncryptionEnabled pulumi.BoolPtrOutput `pulumi:"doubleEncryptionEnabled"`
	// An `identity` block as defined below.
	Identity ClusterIdentityPtrOutput `pulumi:"identity"`
	// An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
	//
	// > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
	LanguageExtensions ClusterLanguageExtensionArrayOutput `pulumi:"languageExtensions"`
	// The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// An `optimizedAutoScale` block as defined below.
	OptimizedAutoScale ClusterOptimizedAutoScalePtrOutput `pulumi:"optimizedAutoScale"`
	// Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
	OutboundNetworkAccessRestricted pulumi.BoolPtrOutput `pulumi:"outboundNetworkAccessRestricted"`
	// Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
	PublicIpType pulumi.StringPtrOutput `pulumi:"publicIpType"`
	// Is the public network access enabled? Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrOutput `pulumi:"publicNetworkAccessEnabled"`
	// Specifies if the purge operations are enabled.
	PurgeEnabled pulumi.BoolPtrOutput `pulumi:"purgeEnabled"`
	// Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `sku` block as defined below.
	Sku ClusterSkuOutput `pulumi:"sku"`
	// Specifies if the streaming ingest is enabled.
	StreamingIngestionEnabled pulumi.BoolPtrOutput `pulumi:"streamingIngestionEnabled"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
	//
	// > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
	TrustedExternalTenants pulumi.StringArrayOutput `pulumi:"trustedExternalTenants"`
	// The FQDN of the Azure Kusto Cluster.
	Uri pulumi.StringOutput `pulumi:"uri"`
	// A `virtualNetworkConfiguration` block as defined below.
	//
	// > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
	VirtualNetworkConfiguration ClusterVirtualNetworkConfigurationPtrOutput `pulumi:"virtualNetworkConfiguration"`
	// Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
	Zones pulumi.StringArrayOutput `pulumi:"zones"`
}

// NewCluster registers a new resource with the given unique name, arguments, and options.
func NewCluster(ctx *pulumi.Context,
	name string, args *ClusterArgs, opts ...pulumi.ResourceOption) (*Cluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Sku == nil {
		return nil, errors.New("invalid value for required argument 'Sku'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Cluster
	err := ctx.RegisterResource("azure:kusto/cluster:Cluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCluster gets an existing Cluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterState, opts ...pulumi.ResourceOption) (*Cluster, error) {
	var resource Cluster
	err := ctx.ReadResource("azure:kusto/cluster:Cluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cluster resources.
type clusterState struct {
	// List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
	AllowedFqdns []string `pulumi:"allowedFqdns"`
	// The list of ips in the format of CIDR allowed to connect to the cluster.
	AllowedIpRanges []string `pulumi:"allowedIpRanges"`
	// Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
	AutoStopEnabled *bool `pulumi:"autoStopEnabled"`
	// The Kusto Cluster URI to be used for data ingestion.
	DataIngestionUri *string `pulumi:"dataIngestionUri"`
	// Specifies if the cluster's disks are encrypted.
	DiskEncryptionEnabled *bool `pulumi:"diskEncryptionEnabled"`
	// Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
	DoubleEncryptionEnabled *bool `pulumi:"doubleEncryptionEnabled"`
	// An `identity` block as defined below.
	Identity *ClusterIdentity `pulumi:"identity"`
	// An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
	//
	// > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
	LanguageExtensions []ClusterLanguageExtension `pulumi:"languageExtensions"`
	// The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An `optimizedAutoScale` block as defined below.
	OptimizedAutoScale *ClusterOptimizedAutoScale `pulumi:"optimizedAutoScale"`
	// Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
	OutboundNetworkAccessRestricted *bool `pulumi:"outboundNetworkAccessRestricted"`
	// Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
	PublicIpType *string `pulumi:"publicIpType"`
	// Is the public network access enabled? Defaults to `true`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// Specifies if the purge operations are enabled.
	PurgeEnabled *bool `pulumi:"purgeEnabled"`
	// Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `sku` block as defined below.
	Sku *ClusterSku `pulumi:"sku"`
	// Specifies if the streaming ingest is enabled.
	StreamingIngestionEnabled *bool `pulumi:"streamingIngestionEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
	//
	// > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
	TrustedExternalTenants []string `pulumi:"trustedExternalTenants"`
	// The FQDN of the Azure Kusto Cluster.
	Uri *string `pulumi:"uri"`
	// A `virtualNetworkConfiguration` block as defined below.
	//
	// > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
	VirtualNetworkConfiguration *ClusterVirtualNetworkConfiguration `pulumi:"virtualNetworkConfiguration"`
	// Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
	Zones []string `pulumi:"zones"`
}

type ClusterState struct {
	// List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
	AllowedFqdns pulumi.StringArrayInput
	// The list of ips in the format of CIDR allowed to connect to the cluster.
	AllowedIpRanges pulumi.StringArrayInput
	// Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
	AutoStopEnabled pulumi.BoolPtrInput
	// The Kusto Cluster URI to be used for data ingestion.
	DataIngestionUri pulumi.StringPtrInput
	// Specifies if the cluster's disks are encrypted.
	DiskEncryptionEnabled pulumi.BoolPtrInput
	// Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
	DoubleEncryptionEnabled pulumi.BoolPtrInput
	// An `identity` block as defined below.
	Identity ClusterIdentityPtrInput
	// An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
	//
	// > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
	LanguageExtensions ClusterLanguageExtensionArrayInput
	// The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An `optimizedAutoScale` block as defined below.
	OptimizedAutoScale ClusterOptimizedAutoScalePtrInput
	// Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
	OutboundNetworkAccessRestricted pulumi.BoolPtrInput
	// Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
	PublicIpType pulumi.StringPtrInput
	// Is the public network access enabled? Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// Specifies if the purge operations are enabled.
	PurgeEnabled pulumi.BoolPtrInput
	// Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `sku` block as defined below.
	Sku ClusterSkuPtrInput
	// Specifies if the streaming ingest is enabled.
	StreamingIngestionEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
	//
	// > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
	TrustedExternalTenants pulumi.StringArrayInput
	// The FQDN of the Azure Kusto Cluster.
	Uri pulumi.StringPtrInput
	// A `virtualNetworkConfiguration` block as defined below.
	//
	// > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
	VirtualNetworkConfiguration ClusterVirtualNetworkConfigurationPtrInput
	// Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
	Zones pulumi.StringArrayInput
}

func (ClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterState)(nil)).Elem()
}

type clusterArgs struct {
	// List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
	AllowedFqdns []string `pulumi:"allowedFqdns"`
	// The list of ips in the format of CIDR allowed to connect to the cluster.
	AllowedIpRanges []string `pulumi:"allowedIpRanges"`
	// Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
	AutoStopEnabled *bool `pulumi:"autoStopEnabled"`
	// Specifies if the cluster's disks are encrypted.
	DiskEncryptionEnabled *bool `pulumi:"diskEncryptionEnabled"`
	// Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
	DoubleEncryptionEnabled *bool `pulumi:"doubleEncryptionEnabled"`
	// An `identity` block as defined below.
	Identity *ClusterIdentity `pulumi:"identity"`
	// An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
	//
	// > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
	LanguageExtensions []ClusterLanguageExtension `pulumi:"languageExtensions"`
	// The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An `optimizedAutoScale` block as defined below.
	OptimizedAutoScale *ClusterOptimizedAutoScale `pulumi:"optimizedAutoScale"`
	// Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
	OutboundNetworkAccessRestricted *bool `pulumi:"outboundNetworkAccessRestricted"`
	// Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
	PublicIpType *string `pulumi:"publicIpType"`
	// Is the public network access enabled? Defaults to `true`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// Specifies if the purge operations are enabled.
	PurgeEnabled *bool `pulumi:"purgeEnabled"`
	// Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `sku` block as defined below.
	Sku ClusterSku `pulumi:"sku"`
	// Specifies if the streaming ingest is enabled.
	StreamingIngestionEnabled *bool `pulumi:"streamingIngestionEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
	//
	// > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
	TrustedExternalTenants []string `pulumi:"trustedExternalTenants"`
	// A `virtualNetworkConfiguration` block as defined below.
	//
	// > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
	VirtualNetworkConfiguration *ClusterVirtualNetworkConfiguration `pulumi:"virtualNetworkConfiguration"`
	// Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
	Zones []string `pulumi:"zones"`
}

// The set of arguments for constructing a Cluster resource.
type ClusterArgs struct {
	// List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
	AllowedFqdns pulumi.StringArrayInput
	// The list of ips in the format of CIDR allowed to connect to the cluster.
	AllowedIpRanges pulumi.StringArrayInput
	// Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
	AutoStopEnabled pulumi.BoolPtrInput
	// Specifies if the cluster's disks are encrypted.
	DiskEncryptionEnabled pulumi.BoolPtrInput
	// Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
	DoubleEncryptionEnabled pulumi.BoolPtrInput
	// An `identity` block as defined below.
	Identity ClusterIdentityPtrInput
	// An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
	//
	// > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
	LanguageExtensions ClusterLanguageExtensionArrayInput
	// The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An `optimizedAutoScale` block as defined below.
	OptimizedAutoScale ClusterOptimizedAutoScalePtrInput
	// Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
	OutboundNetworkAccessRestricted pulumi.BoolPtrInput
	// Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
	PublicIpType pulumi.StringPtrInput
	// Is the public network access enabled? Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// Specifies if the purge operations are enabled.
	PurgeEnabled pulumi.BoolPtrInput
	// Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `sku` block as defined below.
	Sku ClusterSkuInput
	// Specifies if the streaming ingest is enabled.
	StreamingIngestionEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
	//
	// > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
	TrustedExternalTenants pulumi.StringArrayInput
	// A `virtualNetworkConfiguration` block as defined below.
	//
	// > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
	VirtualNetworkConfiguration ClusterVirtualNetworkConfigurationPtrInput
	// Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
	Zones pulumi.StringArrayInput
}

func (ClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterArgs)(nil)).Elem()
}

type ClusterInput interface {
	pulumi.Input

	ToClusterOutput() ClusterOutput
	ToClusterOutputWithContext(ctx context.Context) ClusterOutput
}

func (*Cluster) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (i *Cluster) ToClusterOutput() ClusterOutput {
	return i.ToClusterOutputWithContext(context.Background())
}

func (i *Cluster) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutput)
}

// ClusterArrayInput is an input type that accepts ClusterArray and ClusterArrayOutput values.
// You can construct a concrete instance of `ClusterArrayInput` via:
//
//	ClusterArray{ ClusterArgs{...} }
type ClusterArrayInput interface {
	pulumi.Input

	ToClusterArrayOutput() ClusterArrayOutput
	ToClusterArrayOutputWithContext(context.Context) ClusterArrayOutput
}

type ClusterArray []ClusterInput

func (ClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (i ClusterArray) ToClusterArrayOutput() ClusterArrayOutput {
	return i.ToClusterArrayOutputWithContext(context.Background())
}

func (i ClusterArray) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterArrayOutput)
}

// ClusterMapInput is an input type that accepts ClusterMap and ClusterMapOutput values.
// You can construct a concrete instance of `ClusterMapInput` via:
//
//	ClusterMap{ "key": ClusterArgs{...} }
type ClusterMapInput interface {
	pulumi.Input

	ToClusterMapOutput() ClusterMapOutput
	ToClusterMapOutputWithContext(context.Context) ClusterMapOutput
}

type ClusterMap map[string]ClusterInput

func (ClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (i ClusterMap) ToClusterMapOutput() ClusterMapOutput {
	return i.ToClusterMapOutputWithContext(context.Background())
}

func (i ClusterMap) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterMapOutput)
}

type ClusterOutput struct{ *pulumi.OutputState }

func (ClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (o ClusterOutput) ToClusterOutput() ClusterOutput {
	return o
}

func (o ClusterOutput) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return o
}

// List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
func (o ClusterOutput) AllowedFqdns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringArrayOutput { return v.AllowedFqdns }).(pulumi.StringArrayOutput)
}

// The list of ips in the format of CIDR allowed to connect to the cluster.
func (o ClusterOutput) AllowedIpRanges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringArrayOutput { return v.AllowedIpRanges }).(pulumi.StringArrayOutput)
}

// Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
func (o ClusterOutput) AutoStopEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.AutoStopEnabled }).(pulumi.BoolPtrOutput)
}

// The Kusto Cluster URI to be used for data ingestion.
func (o ClusterOutput) DataIngestionUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.DataIngestionUri }).(pulumi.StringOutput)
}

// Specifies if the cluster's disks are encrypted.
func (o ClusterOutput) DiskEncryptionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.DiskEncryptionEnabled }).(pulumi.BoolPtrOutput)
}

// Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
func (o ClusterOutput) DoubleEncryptionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.DoubleEncryptionEnabled }).(pulumi.BoolPtrOutput)
}

// An `identity` block as defined below.
func (o ClusterOutput) Identity() ClusterIdentityPtrOutput {
	return o.ApplyT(func(v *Cluster) ClusterIdentityPtrOutput { return v.Identity }).(ClusterIdentityPtrOutput)
}

// An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
//
// > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
func (o ClusterOutput) LanguageExtensions() ClusterLanguageExtensionArrayOutput {
	return o.ApplyT(func(v *Cluster) ClusterLanguageExtensionArrayOutput { return v.LanguageExtensions }).(ClusterLanguageExtensionArrayOutput)
}

// The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
func (o ClusterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
func (o ClusterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// An `optimizedAutoScale` block as defined below.
func (o ClusterOutput) OptimizedAutoScale() ClusterOptimizedAutoScalePtrOutput {
	return o.ApplyT(func(v *Cluster) ClusterOptimizedAutoScalePtrOutput { return v.OptimizedAutoScale }).(ClusterOptimizedAutoScalePtrOutput)
}

// Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
func (o ClusterOutput) OutboundNetworkAccessRestricted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.OutboundNetworkAccessRestricted }).(pulumi.BoolPtrOutput)
}

// Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
func (o ClusterOutput) PublicIpType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringPtrOutput { return v.PublicIpType }).(pulumi.StringPtrOutput)
}

// Is the public network access enabled? Defaults to `true`.
func (o ClusterOutput) PublicNetworkAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.PublicNetworkAccessEnabled }).(pulumi.BoolPtrOutput)
}

// Specifies if the purge operations are enabled.
func (o ClusterOutput) PurgeEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.PurgeEnabled }).(pulumi.BoolPtrOutput)
}

// Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
func (o ClusterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `sku` block as defined below.
func (o ClusterOutput) Sku() ClusterSkuOutput {
	return o.ApplyT(func(v *Cluster) ClusterSkuOutput { return v.Sku }).(ClusterSkuOutput)
}

// Specifies if the streaming ingest is enabled.
func (o ClusterOutput) StreamingIngestionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.StreamingIngestionEnabled }).(pulumi.BoolPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o ClusterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
//
// > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
func (o ClusterOutput) TrustedExternalTenants() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringArrayOutput { return v.TrustedExternalTenants }).(pulumi.StringArrayOutput)
}

// The FQDN of the Azure Kusto Cluster.
func (o ClusterOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

// A `virtualNetworkConfiguration` block as defined below.
//
// > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
func (o ClusterOutput) VirtualNetworkConfiguration() ClusterVirtualNetworkConfigurationPtrOutput {
	return o.ApplyT(func(v *Cluster) ClusterVirtualNetworkConfigurationPtrOutput { return v.VirtualNetworkConfiguration }).(ClusterVirtualNetworkConfigurationPtrOutput)
}

// Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
func (o ClusterOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringArrayOutput { return v.Zones }).(pulumi.StringArrayOutput)
}

type ClusterArrayOutput struct{ *pulumi.OutputState }

func (ClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (o ClusterArrayOutput) ToClusterArrayOutput() ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) Index(i pulumi.IntInput) ClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].([]*Cluster)[vs[1].(int)]
	}).(ClusterOutput)
}

type ClusterMapOutput struct{ *pulumi.OutputState }

func (ClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (o ClusterMapOutput) ToClusterMapOutput() ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) MapIndex(k pulumi.StringInput) ClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].(map[string]*Cluster)[vs[1].(string)]
	}).(ClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInput)(nil)).Elem(), &Cluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterArrayInput)(nil)).Elem(), ClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterMapInput)(nil)).Elem(), ClusterMap{})
	pulumi.RegisterOutputType(ClusterOutput{})
	pulumi.RegisterOutputType(ClusterArrayOutput{})
	pulumi.RegisterOutputType(ClusterMapOutput{})
}
