// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package sentinel

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Sentinel Watchlist.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/operationalinsights"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/sentinel"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "exampleAnalyticsWorkspace", &operationalinsights.AnalyticsWorkspaceArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Sku:               pulumi.String("PerGB2018"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleAnalyticsSolution, err := operationalinsights.NewAnalyticsSolution(ctx, "exampleAnalyticsSolution", &operationalinsights.AnalyticsSolutionArgs{
// 			SolutionName:        pulumi.String("SecurityInsights"),
// 			Location:            exampleResourceGroup.Location,
// 			ResourceGroupName:   exampleResourceGroup.Name,
// 			WorkspaceResourceId: exampleAnalyticsWorkspace.ID(),
// 			WorkspaceName:       exampleAnalyticsWorkspace.Name,
// 			Plan: &operationalinsights.AnalyticsSolutionPlanArgs{
// 				Publisher: pulumi.String("Microsoft"),
// 				Product:   pulumi.String("OMSGallery/SecurityInsights"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = sentinel.NewWatchlist(ctx, "exampleWatchlist", &sentinel.WatchlistArgs{
// 			LogAnalyticsWorkspaceId: exampleAnalyticsSolution.WorkspaceResourceId,
// 			DisplayName:             pulumi.String("example-wl"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Sentinel Watchlists can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:sentinel/watchlist:Watchlist example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/watchlists/list1
// ```
type Watchlist struct {
	pulumi.CustomResourceState

	// The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DefaultDuration pulumi.StringPtrOutput `pulumi:"defaultDuration"`
	// The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Labels pulumi.StringArrayOutput `pulumi:"labels"`
	// The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
	LogAnalyticsWorkspaceId pulumi.StringOutput `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewWatchlist registers a new resource with the given unique name, arguments, and options.
func NewWatchlist(ctx *pulumi.Context,
	name string, args *WatchlistArgs, opts ...pulumi.ResourceOption) (*Watchlist, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.LogAnalyticsWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'LogAnalyticsWorkspaceId'")
	}
	var resource Watchlist
	err := ctx.RegisterResource("azure:sentinel/watchlist:Watchlist", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWatchlist gets an existing Watchlist resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWatchlist(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WatchlistState, opts ...pulumi.ResourceOption) (*Watchlist, error) {
	var resource Watchlist
	err := ctx.ReadResource("azure:sentinel/watchlist:Watchlist", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Watchlist resources.
type watchlistState struct {
	// The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DefaultDuration *string `pulumi:"defaultDuration"`
	// The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Description *string `pulumi:"description"`
	// The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DisplayName *string `pulumi:"displayName"`
	// Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Labels []string `pulumi:"labels"`
	// The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Name *string `pulumi:"name"`
}

type WatchlistState struct {
	// The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DefaultDuration pulumi.StringPtrInput
	// The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Description pulumi.StringPtrInput
	// The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DisplayName pulumi.StringPtrInput
	// Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Labels pulumi.StringArrayInput
	// The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Name pulumi.StringPtrInput
}

func (WatchlistState) ElementType() reflect.Type {
	return reflect.TypeOf((*watchlistState)(nil)).Elem()
}

type watchlistArgs struct {
	// The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DefaultDuration *string `pulumi:"defaultDuration"`
	// The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Description *string `pulumi:"description"`
	// The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DisplayName string `pulumi:"displayName"`
	// Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Labels []string `pulumi:"labels"`
	// The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
	LogAnalyticsWorkspaceId string `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Watchlist resource.
type WatchlistArgs struct {
	// The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DefaultDuration pulumi.StringPtrInput
	// The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Description pulumi.StringPtrInput
	// The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	DisplayName pulumi.StringInput
	// Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Labels pulumi.StringArrayInput
	// The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
	LogAnalyticsWorkspaceId pulumi.StringInput
	// The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
	Name pulumi.StringPtrInput
}

func (WatchlistArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*watchlistArgs)(nil)).Elem()
}

type WatchlistInput interface {
	pulumi.Input

	ToWatchlistOutput() WatchlistOutput
	ToWatchlistOutputWithContext(ctx context.Context) WatchlistOutput
}

func (*Watchlist) ElementType() reflect.Type {
	return reflect.TypeOf((*Watchlist)(nil))
}

func (i *Watchlist) ToWatchlistOutput() WatchlistOutput {
	return i.ToWatchlistOutputWithContext(context.Background())
}

func (i *Watchlist) ToWatchlistOutputWithContext(ctx context.Context) WatchlistOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WatchlistOutput)
}

func (i *Watchlist) ToWatchlistPtrOutput() WatchlistPtrOutput {
	return i.ToWatchlistPtrOutputWithContext(context.Background())
}

func (i *Watchlist) ToWatchlistPtrOutputWithContext(ctx context.Context) WatchlistPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WatchlistPtrOutput)
}

type WatchlistPtrInput interface {
	pulumi.Input

	ToWatchlistPtrOutput() WatchlistPtrOutput
	ToWatchlistPtrOutputWithContext(ctx context.Context) WatchlistPtrOutput
}

type watchlistPtrType WatchlistArgs

func (*watchlistPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Watchlist)(nil))
}

func (i *watchlistPtrType) ToWatchlistPtrOutput() WatchlistPtrOutput {
	return i.ToWatchlistPtrOutputWithContext(context.Background())
}

func (i *watchlistPtrType) ToWatchlistPtrOutputWithContext(ctx context.Context) WatchlistPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WatchlistPtrOutput)
}

// WatchlistArrayInput is an input type that accepts WatchlistArray and WatchlistArrayOutput values.
// You can construct a concrete instance of `WatchlistArrayInput` via:
//
//          WatchlistArray{ WatchlistArgs{...} }
type WatchlistArrayInput interface {
	pulumi.Input

	ToWatchlistArrayOutput() WatchlistArrayOutput
	ToWatchlistArrayOutputWithContext(context.Context) WatchlistArrayOutput
}

type WatchlistArray []WatchlistInput

func (WatchlistArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Watchlist)(nil)).Elem()
}

func (i WatchlistArray) ToWatchlistArrayOutput() WatchlistArrayOutput {
	return i.ToWatchlistArrayOutputWithContext(context.Background())
}

func (i WatchlistArray) ToWatchlistArrayOutputWithContext(ctx context.Context) WatchlistArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WatchlistArrayOutput)
}

// WatchlistMapInput is an input type that accepts WatchlistMap and WatchlistMapOutput values.
// You can construct a concrete instance of `WatchlistMapInput` via:
//
//          WatchlistMap{ "key": WatchlistArgs{...} }
type WatchlistMapInput interface {
	pulumi.Input

	ToWatchlistMapOutput() WatchlistMapOutput
	ToWatchlistMapOutputWithContext(context.Context) WatchlistMapOutput
}

type WatchlistMap map[string]WatchlistInput

func (WatchlistMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Watchlist)(nil)).Elem()
}

func (i WatchlistMap) ToWatchlistMapOutput() WatchlistMapOutput {
	return i.ToWatchlistMapOutputWithContext(context.Background())
}

func (i WatchlistMap) ToWatchlistMapOutputWithContext(ctx context.Context) WatchlistMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WatchlistMapOutput)
}

type WatchlistOutput struct{ *pulumi.OutputState }

func (WatchlistOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Watchlist)(nil))
}

func (o WatchlistOutput) ToWatchlistOutput() WatchlistOutput {
	return o
}

func (o WatchlistOutput) ToWatchlistOutputWithContext(ctx context.Context) WatchlistOutput {
	return o
}

func (o WatchlistOutput) ToWatchlistPtrOutput() WatchlistPtrOutput {
	return o.ToWatchlistPtrOutputWithContext(context.Background())
}

func (o WatchlistOutput) ToWatchlistPtrOutputWithContext(ctx context.Context) WatchlistPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Watchlist) *Watchlist {
		return &v
	}).(WatchlistPtrOutput)
}

type WatchlistPtrOutput struct{ *pulumi.OutputState }

func (WatchlistPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Watchlist)(nil))
}

func (o WatchlistPtrOutput) ToWatchlistPtrOutput() WatchlistPtrOutput {
	return o
}

func (o WatchlistPtrOutput) ToWatchlistPtrOutputWithContext(ctx context.Context) WatchlistPtrOutput {
	return o
}

func (o WatchlistPtrOutput) Elem() WatchlistOutput {
	return o.ApplyT(func(v *Watchlist) Watchlist {
		if v != nil {
			return *v
		}
		var ret Watchlist
		return ret
	}).(WatchlistOutput)
}

type WatchlistArrayOutput struct{ *pulumi.OutputState }

func (WatchlistArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Watchlist)(nil))
}

func (o WatchlistArrayOutput) ToWatchlistArrayOutput() WatchlistArrayOutput {
	return o
}

func (o WatchlistArrayOutput) ToWatchlistArrayOutputWithContext(ctx context.Context) WatchlistArrayOutput {
	return o
}

func (o WatchlistArrayOutput) Index(i pulumi.IntInput) WatchlistOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Watchlist {
		return vs[0].([]Watchlist)[vs[1].(int)]
	}).(WatchlistOutput)
}

type WatchlistMapOutput struct{ *pulumi.OutputState }

func (WatchlistMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Watchlist)(nil))
}

func (o WatchlistMapOutput) ToWatchlistMapOutput() WatchlistMapOutput {
	return o
}

func (o WatchlistMapOutput) ToWatchlistMapOutputWithContext(ctx context.Context) WatchlistMapOutput {
	return o
}

func (o WatchlistMapOutput) MapIndex(k pulumi.StringInput) WatchlistOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Watchlist {
		return vs[0].(map[string]Watchlist)[vs[1].(string)]
	}).(WatchlistOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WatchlistInput)(nil)).Elem(), &Watchlist{})
	pulumi.RegisterInputType(reflect.TypeOf((*WatchlistPtrInput)(nil)).Elem(), &Watchlist{})
	pulumi.RegisterInputType(reflect.TypeOf((*WatchlistArrayInput)(nil)).Elem(), WatchlistArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WatchlistMapInput)(nil)).Elem(), WatchlistMap{})
	pulumi.RegisterOutputType(WatchlistOutput{})
	pulumi.RegisterOutputType(WatchlistPtrOutput{})
	pulumi.RegisterOutputType(WatchlistArrayOutput{})
	pulumi.RegisterOutputType(WatchlistMapOutput{})
}