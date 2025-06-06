// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arckubernetes

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Arc Kubernetes Cluster.
//
// > **Note:** Installing and configuring the Azure Arc Agent on your Kubernetes Cluster to establish connectivity is outside the scope of this document. For more details refer to [Deploy agents to your cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/conceptual-agent-overview#deploy-agents-to-your-cluster) and [Connect an existing Kubernetes Cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/quickstart-connect-cluster?tabs=azure-cli#connect-an-existing-kubernetes-cluster). If you encounter issues connecting your Kubernetes Cluster to Azure Arc, we'd recommend opening a ticket with Microsoft Support.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/arckubernetes"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
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
//			invokeFilebase64, err := std.Filebase64(ctx, &std.Filebase64Args{
//				Input: "testdata/public.cer",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = arckubernetes.NewCluster(ctx, "example", &arckubernetes.ClusterArgs{
//				Name:                      pulumi.String("example-akcc"),
//				ResourceGroupName:         example.Name,
//				Location:                  pulumi.String("West Europe"),
//				AgentPublicKeyCertificate: pulumi.String(invokeFilebase64.Result),
//				Identity: &arckubernetes.ClusterIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				Tags: pulumi.StringMap{
//					"ENV": pulumi.String("Test"),
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
// > **Note:** An extensive example on connecting the `arckubernetes.Cluster` to an external kubernetes cluster can be found in the `./examples/arckubernetes` directory within the GitHub Repository.
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Kubernetes`: 2024-01-01
//
// ## Import
//
// Arc Kubernetes Cluster can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:arckubernetes/cluster:Cluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Kubernetes/connectedClusters/cluster1
// ```
type Cluster struct {
	pulumi.CustomResourceState

	// Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
	AgentPublicKeyCertificate pulumi.StringOutput `pulumi:"agentPublicKeyCertificate"`
	// Version of the agent running on the cluster resource.
	AgentVersion pulumi.StringOutput `pulumi:"agentVersion"`
	// The distribution running on this Arc Kubernetes Cluster.
	Distribution pulumi.StringOutput `pulumi:"distribution"`
	// An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
	Identity ClusterIdentityOutput `pulumi:"identity"`
	// The infrastructure on which the Arc Kubernetes Cluster is running on.
	Infrastructure pulumi.StringOutput `pulumi:"infrastructure"`
	// The Kubernetes version of the cluster resource.
	KubernetesVersion pulumi.StringOutput `pulumi:"kubernetesVersion"`
	// Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The cluster offering.
	Offering pulumi.StringOutput `pulumi:"offering"`
	// Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Number of CPU cores present in the cluster resource.
	TotalCoreCount pulumi.IntOutput `pulumi:"totalCoreCount"`
	// Number of nodes present in the cluster resource.
	TotalNodeCount pulumi.IntOutput `pulumi:"totalNodeCount"`
}

// NewCluster registers a new resource with the given unique name, arguments, and options.
func NewCluster(ctx *pulumi.Context,
	name string, args *ClusterArgs, opts ...pulumi.ResourceOption) (*Cluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AgentPublicKeyCertificate == nil {
		return nil, errors.New("invalid value for required argument 'AgentPublicKeyCertificate'")
	}
	if args.Identity == nil {
		return nil, errors.New("invalid value for required argument 'Identity'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Cluster
	err := ctx.RegisterResource("azure:arckubernetes/cluster:Cluster", name, args, &resource, opts...)
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
	err := ctx.ReadResource("azure:arckubernetes/cluster:Cluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cluster resources.
type clusterState struct {
	// Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
	AgentPublicKeyCertificate *string `pulumi:"agentPublicKeyCertificate"`
	// Version of the agent running on the cluster resource.
	AgentVersion *string `pulumi:"agentVersion"`
	// The distribution running on this Arc Kubernetes Cluster.
	Distribution *string `pulumi:"distribution"`
	// An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
	Identity *ClusterIdentity `pulumi:"identity"`
	// The infrastructure on which the Arc Kubernetes Cluster is running on.
	Infrastructure *string `pulumi:"infrastructure"`
	// The Kubernetes version of the cluster resource.
	KubernetesVersion *string `pulumi:"kubernetesVersion"`
	// Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
	Name *string `pulumi:"name"`
	// The cluster offering.
	Offering *string `pulumi:"offering"`
	// Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
	Tags map[string]string `pulumi:"tags"`
	// Number of CPU cores present in the cluster resource.
	TotalCoreCount *int `pulumi:"totalCoreCount"`
	// Number of nodes present in the cluster resource.
	TotalNodeCount *int `pulumi:"totalNodeCount"`
}

type ClusterState struct {
	// Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
	AgentPublicKeyCertificate pulumi.StringPtrInput
	// Version of the agent running on the cluster resource.
	AgentVersion pulumi.StringPtrInput
	// The distribution running on this Arc Kubernetes Cluster.
	Distribution pulumi.StringPtrInput
	// An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
	Identity ClusterIdentityPtrInput
	// The infrastructure on which the Arc Kubernetes Cluster is running on.
	Infrastructure pulumi.StringPtrInput
	// The Kubernetes version of the cluster resource.
	KubernetesVersion pulumi.StringPtrInput
	// Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
	Name pulumi.StringPtrInput
	// The cluster offering.
	Offering pulumi.StringPtrInput
	// Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
	Tags pulumi.StringMapInput
	// Number of CPU cores present in the cluster resource.
	TotalCoreCount pulumi.IntPtrInput
	// Number of nodes present in the cluster resource.
	TotalNodeCount pulumi.IntPtrInput
}

func (ClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterState)(nil)).Elem()
}

type clusterArgs struct {
	// Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
	AgentPublicKeyCertificate string `pulumi:"agentPublicKeyCertificate"`
	// An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
	Identity ClusterIdentity `pulumi:"identity"`
	// Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Cluster resource.
type ClusterArgs struct {
	// Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
	AgentPublicKeyCertificate pulumi.StringInput
	// An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
	Identity ClusterIdentityInput
	// Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
	Tags pulumi.StringMapInput
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

// Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
func (o ClusterOutput) AgentPublicKeyCertificate() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.AgentPublicKeyCertificate }).(pulumi.StringOutput)
}

// Version of the agent running on the cluster resource.
func (o ClusterOutput) AgentVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.AgentVersion }).(pulumi.StringOutput)
}

// The distribution running on this Arc Kubernetes Cluster.
func (o ClusterOutput) Distribution() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Distribution }).(pulumi.StringOutput)
}

// An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
func (o ClusterOutput) Identity() ClusterIdentityOutput {
	return o.ApplyT(func(v *Cluster) ClusterIdentityOutput { return v.Identity }).(ClusterIdentityOutput)
}

// The infrastructure on which the Arc Kubernetes Cluster is running on.
func (o ClusterOutput) Infrastructure() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Infrastructure }).(pulumi.StringOutput)
}

// The Kubernetes version of the cluster resource.
func (o ClusterOutput) KubernetesVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.KubernetesVersion }).(pulumi.StringOutput)
}

// Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
func (o ClusterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
func (o ClusterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The cluster offering.
func (o ClusterOutput) Offering() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Offering }).(pulumi.StringOutput)
}

// Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
func (o ClusterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
func (o ClusterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Number of CPU cores present in the cluster resource.
func (o ClusterOutput) TotalCoreCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Cluster) pulumi.IntOutput { return v.TotalCoreCount }).(pulumi.IntOutput)
}

// Number of nodes present in the cluster resource.
func (o ClusterOutput) TotalNodeCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Cluster) pulumi.IntOutput { return v.TotalNodeCount }).(pulumi.IntOutput)
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
