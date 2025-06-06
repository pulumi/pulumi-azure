// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package streamanalytics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Stream Analytics Output powerBI.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/streamanalytics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.LookupResourceGroup(ctx, &core.LookupResourceGroupArgs{
//				Name: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetJob, err := streamanalytics.LookupJob(ctx, &streamanalytics.LookupJobArgs{
//				Name:              "example-job",
//				ResourceGroupName: example.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = streamanalytics.NewOutputPowerbi(ctx, "example", &streamanalytics.OutputPowerbiArgs{
//				Name:                 pulumi.String("output-to-powerbi"),
//				StreamAnalyticsJobId: pulumi.String(exampleGetJob.Id),
//				Dataset:              pulumi.String("example-dataset"),
//				Table:                pulumi.String("example-table"),
//				GroupId:              pulumi.String("00000000-0000-0000-0000-000000000000"),
//				GroupName:            pulumi.String("some-group-name"),
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
// * `Microsoft.StreamAnalytics`: 2021-10-01-preview
//
// ## Import
//
// Stream Analytics Output to Power BI can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:streamanalytics/outputPowerbi:OutputPowerbi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/outputs/output1
// ```
type OutputPowerbi struct {
	pulumi.CustomResourceState

	// The name of the Power BI dataset.
	Dataset pulumi.StringOutput `pulumi:"dataset"`
	// The ID of the Power BI group, this must be a valid UUID.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// The name of the Stream Output. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringOutput `pulumi:"streamAnalyticsJobId"`
	// The name of the Power BI table under the specified dataset.
	Table pulumi.StringOutput `pulumi:"table"`
	// The user display name of the user that was used to obtain the refresh token.
	TokenUserDisplayName pulumi.StringPtrOutput `pulumi:"tokenUserDisplayName"`
	// The user principal name (UPN) of the user that was used to obtain the refresh token.
	TokenUserPrincipalName pulumi.StringPtrOutput `pulumi:"tokenUserPrincipalName"`
}

// NewOutputPowerbi registers a new resource with the given unique name, arguments, and options.
func NewOutputPowerbi(ctx *pulumi.Context,
	name string, args *OutputPowerbiArgs, opts ...pulumi.ResourceOption) (*OutputPowerbi, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Dataset == nil {
		return nil, errors.New("invalid value for required argument 'Dataset'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.GroupName == nil {
		return nil, errors.New("invalid value for required argument 'GroupName'")
	}
	if args.StreamAnalyticsJobId == nil {
		return nil, errors.New("invalid value for required argument 'StreamAnalyticsJobId'")
	}
	if args.Table == nil {
		return nil, errors.New("invalid value for required argument 'Table'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OutputPowerbi
	err := ctx.RegisterResource("azure:streamanalytics/outputPowerbi:OutputPowerbi", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOutputPowerbi gets an existing OutputPowerbi resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOutputPowerbi(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OutputPowerbiState, opts ...pulumi.ResourceOption) (*OutputPowerbi, error) {
	var resource OutputPowerbi
	err := ctx.ReadResource("azure:streamanalytics/outputPowerbi:OutputPowerbi", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OutputPowerbi resources.
type outputPowerbiState struct {
	// The name of the Power BI dataset.
	Dataset *string `pulumi:"dataset"`
	// The ID of the Power BI group, this must be a valid UUID.
	GroupId *string `pulumi:"groupId"`
	// The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
	GroupName *string `pulumi:"groupName"`
	// The name of the Stream Output. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId *string `pulumi:"streamAnalyticsJobId"`
	// The name of the Power BI table under the specified dataset.
	Table *string `pulumi:"table"`
	// The user display name of the user that was used to obtain the refresh token.
	TokenUserDisplayName *string `pulumi:"tokenUserDisplayName"`
	// The user principal name (UPN) of the user that was used to obtain the refresh token.
	TokenUserPrincipalName *string `pulumi:"tokenUserPrincipalName"`
}

type OutputPowerbiState struct {
	// The name of the Power BI dataset.
	Dataset pulumi.StringPtrInput
	// The ID of the Power BI group, this must be a valid UUID.
	GroupId pulumi.StringPtrInput
	// The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
	GroupName pulumi.StringPtrInput
	// The name of the Stream Output. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringPtrInput
	// The name of the Power BI table under the specified dataset.
	Table pulumi.StringPtrInput
	// The user display name of the user that was used to obtain the refresh token.
	TokenUserDisplayName pulumi.StringPtrInput
	// The user principal name (UPN) of the user that was used to obtain the refresh token.
	TokenUserPrincipalName pulumi.StringPtrInput
}

func (OutputPowerbiState) ElementType() reflect.Type {
	return reflect.TypeOf((*outputPowerbiState)(nil)).Elem()
}

type outputPowerbiArgs struct {
	// The name of the Power BI dataset.
	Dataset string `pulumi:"dataset"`
	// The ID of the Power BI group, this must be a valid UUID.
	GroupId string `pulumi:"groupId"`
	// The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
	GroupName string `pulumi:"groupName"`
	// The name of the Stream Output. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId string `pulumi:"streamAnalyticsJobId"`
	// The name of the Power BI table under the specified dataset.
	Table string `pulumi:"table"`
	// The user display name of the user that was used to obtain the refresh token.
	TokenUserDisplayName *string `pulumi:"tokenUserDisplayName"`
	// The user principal name (UPN) of the user that was used to obtain the refresh token.
	TokenUserPrincipalName *string `pulumi:"tokenUserPrincipalName"`
}

// The set of arguments for constructing a OutputPowerbi resource.
type OutputPowerbiArgs struct {
	// The name of the Power BI dataset.
	Dataset pulumi.StringInput
	// The ID of the Power BI group, this must be a valid UUID.
	GroupId pulumi.StringInput
	// The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
	GroupName pulumi.StringInput
	// The name of the Stream Output. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringInput
	// The name of the Power BI table under the specified dataset.
	Table pulumi.StringInput
	// The user display name of the user that was used to obtain the refresh token.
	TokenUserDisplayName pulumi.StringPtrInput
	// The user principal name (UPN) of the user that was used to obtain the refresh token.
	TokenUserPrincipalName pulumi.StringPtrInput
}

func (OutputPowerbiArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*outputPowerbiArgs)(nil)).Elem()
}

type OutputPowerbiInput interface {
	pulumi.Input

	ToOutputPowerbiOutput() OutputPowerbiOutput
	ToOutputPowerbiOutputWithContext(ctx context.Context) OutputPowerbiOutput
}

func (*OutputPowerbi) ElementType() reflect.Type {
	return reflect.TypeOf((**OutputPowerbi)(nil)).Elem()
}

func (i *OutputPowerbi) ToOutputPowerbiOutput() OutputPowerbiOutput {
	return i.ToOutputPowerbiOutputWithContext(context.Background())
}

func (i *OutputPowerbi) ToOutputPowerbiOutputWithContext(ctx context.Context) OutputPowerbiOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OutputPowerbiOutput)
}

// OutputPowerbiArrayInput is an input type that accepts OutputPowerbiArray and OutputPowerbiArrayOutput values.
// You can construct a concrete instance of `OutputPowerbiArrayInput` via:
//
//	OutputPowerbiArray{ OutputPowerbiArgs{...} }
type OutputPowerbiArrayInput interface {
	pulumi.Input

	ToOutputPowerbiArrayOutput() OutputPowerbiArrayOutput
	ToOutputPowerbiArrayOutputWithContext(context.Context) OutputPowerbiArrayOutput
}

type OutputPowerbiArray []OutputPowerbiInput

func (OutputPowerbiArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OutputPowerbi)(nil)).Elem()
}

func (i OutputPowerbiArray) ToOutputPowerbiArrayOutput() OutputPowerbiArrayOutput {
	return i.ToOutputPowerbiArrayOutputWithContext(context.Background())
}

func (i OutputPowerbiArray) ToOutputPowerbiArrayOutputWithContext(ctx context.Context) OutputPowerbiArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OutputPowerbiArrayOutput)
}

// OutputPowerbiMapInput is an input type that accepts OutputPowerbiMap and OutputPowerbiMapOutput values.
// You can construct a concrete instance of `OutputPowerbiMapInput` via:
//
//	OutputPowerbiMap{ "key": OutputPowerbiArgs{...} }
type OutputPowerbiMapInput interface {
	pulumi.Input

	ToOutputPowerbiMapOutput() OutputPowerbiMapOutput
	ToOutputPowerbiMapOutputWithContext(context.Context) OutputPowerbiMapOutput
}

type OutputPowerbiMap map[string]OutputPowerbiInput

func (OutputPowerbiMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OutputPowerbi)(nil)).Elem()
}

func (i OutputPowerbiMap) ToOutputPowerbiMapOutput() OutputPowerbiMapOutput {
	return i.ToOutputPowerbiMapOutputWithContext(context.Background())
}

func (i OutputPowerbiMap) ToOutputPowerbiMapOutputWithContext(ctx context.Context) OutputPowerbiMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OutputPowerbiMapOutput)
}

type OutputPowerbiOutput struct{ *pulumi.OutputState }

func (OutputPowerbiOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OutputPowerbi)(nil)).Elem()
}

func (o OutputPowerbiOutput) ToOutputPowerbiOutput() OutputPowerbiOutput {
	return o
}

func (o OutputPowerbiOutput) ToOutputPowerbiOutputWithContext(ctx context.Context) OutputPowerbiOutput {
	return o
}

// The name of the Power BI dataset.
func (o OutputPowerbiOutput) Dataset() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringOutput { return v.Dataset }).(pulumi.StringOutput)
}

// The ID of the Power BI group, this must be a valid UUID.
func (o OutputPowerbiOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
func (o OutputPowerbiOutput) GroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringOutput { return v.GroupName }).(pulumi.StringOutput)
}

// The name of the Stream Output. Changing this forces a new resource to be created.
func (o OutputPowerbiOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
func (o OutputPowerbiOutput) StreamAnalyticsJobId() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringOutput { return v.StreamAnalyticsJobId }).(pulumi.StringOutput)
}

// The name of the Power BI table under the specified dataset.
func (o OutputPowerbiOutput) Table() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringOutput { return v.Table }).(pulumi.StringOutput)
}

// The user display name of the user that was used to obtain the refresh token.
func (o OutputPowerbiOutput) TokenUserDisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringPtrOutput { return v.TokenUserDisplayName }).(pulumi.StringPtrOutput)
}

// The user principal name (UPN) of the user that was used to obtain the refresh token.
func (o OutputPowerbiOutput) TokenUserPrincipalName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OutputPowerbi) pulumi.StringPtrOutput { return v.TokenUserPrincipalName }).(pulumi.StringPtrOutput)
}

type OutputPowerbiArrayOutput struct{ *pulumi.OutputState }

func (OutputPowerbiArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OutputPowerbi)(nil)).Elem()
}

func (o OutputPowerbiArrayOutput) ToOutputPowerbiArrayOutput() OutputPowerbiArrayOutput {
	return o
}

func (o OutputPowerbiArrayOutput) ToOutputPowerbiArrayOutputWithContext(ctx context.Context) OutputPowerbiArrayOutput {
	return o
}

func (o OutputPowerbiArrayOutput) Index(i pulumi.IntInput) OutputPowerbiOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OutputPowerbi {
		return vs[0].([]*OutputPowerbi)[vs[1].(int)]
	}).(OutputPowerbiOutput)
}

type OutputPowerbiMapOutput struct{ *pulumi.OutputState }

func (OutputPowerbiMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OutputPowerbi)(nil)).Elem()
}

func (o OutputPowerbiMapOutput) ToOutputPowerbiMapOutput() OutputPowerbiMapOutput {
	return o
}

func (o OutputPowerbiMapOutput) ToOutputPowerbiMapOutputWithContext(ctx context.Context) OutputPowerbiMapOutput {
	return o
}

func (o OutputPowerbiMapOutput) MapIndex(k pulumi.StringInput) OutputPowerbiOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OutputPowerbi {
		return vs[0].(map[string]*OutputPowerbi)[vs[1].(string)]
	}).(OutputPowerbiOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OutputPowerbiInput)(nil)).Elem(), &OutputPowerbi{})
	pulumi.RegisterInputType(reflect.TypeOf((*OutputPowerbiArrayInput)(nil)).Elem(), OutputPowerbiArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OutputPowerbiMapInput)(nil)).Elem(), OutputPowerbiMap{})
	pulumi.RegisterOutputType(OutputPowerbiOutput{})
	pulumi.RegisterOutputType(OutputPowerbiArrayOutput{})
	pulumi.RegisterOutputType(OutputPowerbiMapOutput{})
}
