// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package containerservice

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Kubernetes Node Pool Snapshot.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/containerservice"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := containerservice.GetKubernetesNodePoolSnapshot(ctx, &containerservice.GetKubernetesNodePoolSnapshotArgs{
//				Name:              "example",
//				ResourceGroupName: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetKubernetesNodePoolSnapshot(ctx *pulumi.Context, args *GetKubernetesNodePoolSnapshotArgs, opts ...pulumi.InvokeOption) (*GetKubernetesNodePoolSnapshotResult, error) {
	var rv GetKubernetesNodePoolSnapshotResult
	err := ctx.Invoke("azure:containerservice/getKubernetesNodePoolSnapshot:getKubernetesNodePoolSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubernetesNodePoolSnapshot.
type GetKubernetesNodePoolSnapshotArgs struct {
	// The name of the Kubernetes Node Pool Snapshot.
	Name string `pulumi:"name"`
	// The name of the Resource Group in which the Kubernetes Node Pool Snapshot exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getKubernetesNodePoolSnapshot.
type GetKubernetesNodePoolSnapshotResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The ID of the source Node Pool.
	SourceNodePoolId string            `pulumi:"sourceNodePoolId"`
	Tags             map[string]string `pulumi:"tags"`
}

func GetKubernetesNodePoolSnapshotOutput(ctx *pulumi.Context, args GetKubernetesNodePoolSnapshotOutputArgs, opts ...pulumi.InvokeOption) GetKubernetesNodePoolSnapshotResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetKubernetesNodePoolSnapshotResult, error) {
			args := v.(GetKubernetesNodePoolSnapshotArgs)
			r, err := GetKubernetesNodePoolSnapshot(ctx, &args, opts...)
			var s GetKubernetesNodePoolSnapshotResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetKubernetesNodePoolSnapshotResultOutput)
}

// A collection of arguments for invoking getKubernetesNodePoolSnapshot.
type GetKubernetesNodePoolSnapshotOutputArgs struct {
	// The name of the Kubernetes Node Pool Snapshot.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group in which the Kubernetes Node Pool Snapshot exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (GetKubernetesNodePoolSnapshotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKubernetesNodePoolSnapshotArgs)(nil)).Elem()
}

// A collection of values returned by getKubernetesNodePoolSnapshot.
type GetKubernetesNodePoolSnapshotResultOutput struct{ *pulumi.OutputState }

func (GetKubernetesNodePoolSnapshotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKubernetesNodePoolSnapshotResult)(nil)).Elem()
}

func (o GetKubernetesNodePoolSnapshotResultOutput) ToGetKubernetesNodePoolSnapshotResultOutput() GetKubernetesNodePoolSnapshotResultOutput {
	return o
}

func (o GetKubernetesNodePoolSnapshotResultOutput) ToGetKubernetesNodePoolSnapshotResultOutputWithContext(ctx context.Context) GetKubernetesNodePoolSnapshotResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetKubernetesNodePoolSnapshotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesNodePoolSnapshotResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetKubernetesNodePoolSnapshotResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesNodePoolSnapshotResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetKubernetesNodePoolSnapshotResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesNodePoolSnapshotResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The ID of the source Node Pool.
func (o GetKubernetesNodePoolSnapshotResultOutput) SourceNodePoolId() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesNodePoolSnapshotResult) string { return v.SourceNodePoolId }).(pulumi.StringOutput)
}

func (o GetKubernetesNodePoolSnapshotResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetKubernetesNodePoolSnapshotResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKubernetesNodePoolSnapshotResultOutput{})
}