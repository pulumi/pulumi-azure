// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Logz Sub Account Tag Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/monitoring"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLogzMonitor, err := monitoring.NewLogzMonitor(ctx, "exampleLogzMonitor", &monitoring.LogzMonitorArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Plan: &monitoring.LogzMonitorPlanArgs{
//					BillingCycle:  pulumi.String("MONTHLY"),
//					EffectiveDate: pulumi.String("2022-06-06T00:00:00Z"),
//					PlanId:        pulumi.String("100gb14days"),
//					UsageType:     pulumi.String("COMMITTED"),
//				},
//				User: &monitoring.LogzMonitorUserArgs{
//					Email:       pulumi.String("user@example.com"),
//					FirstName:   pulumi.String("Example"),
//					LastName:    pulumi.String("User"),
//					PhoneNumber: pulumi.String("+12313803556"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleLogzSubAccount, err := monitoring.NewLogzSubAccount(ctx, "exampleLogzSubAccount", &monitoring.LogzSubAccountArgs{
//				LogzMonitorId: exampleLogzMonitor.ID(),
//				User: &monitoring.LogzSubAccountUserArgs{
//					Email: exampleLogzMonitor.User.ApplyT(func(user monitoring.LogzMonitorUser) (string, error) {
//						return user.Email, nil
//					}).(pulumi.StringOutput),
//					FirstName: exampleLogzMonitor.User.ApplyT(func(user monitoring.LogzMonitorUser) (string, error) {
//						return user.FirstName, nil
//					}).(pulumi.StringOutput),
//					LastName: exampleLogzMonitor.User.ApplyT(func(user monitoring.LogzMonitorUser) (string, error) {
//						return user.LastName, nil
//					}).(pulumi.StringOutput),
//					PhoneNumber: exampleLogzMonitor.User.ApplyT(func(user monitoring.LogzMonitorUser) (string, error) {
//						return user.PhoneNumber, nil
//					}).(pulumi.StringOutput),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = monitoring.NewLogzSubAccountTagRule(ctx, "exampleLogzSubAccountTagRule", &monitoring.LogzSubAccountTagRuleArgs{
//				LogzSubAccountId:     exampleLogzSubAccount.ID(),
//				SendAadLogs:          pulumi.Bool(true),
//				SendActivityLogs:     pulumi.Bool(true),
//				SendSubscriptionLogs: pulumi.Bool(true),
//				TagFilters: monitoring.LogzSubAccountTagRuleTagFilterArray{
//					&monitoring.LogzSubAccountTagRuleTagFilterArgs{
//						Name:   pulumi.String("name1"),
//						Action: pulumi.String("Include"),
//						Value:  pulumi.String("value1"),
//					},
//					&monitoring.LogzSubAccountTagRuleTagFilterArgs{
//						Name:   pulumi.String("name2"),
//						Action: pulumi.String("Exclude"),
//						Value:  pulumi.String("value2"),
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
// ## Import
//
// Logz Sub Account Tag Rules can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/accounts/subAccount1/tagRules/ruleSet1
//
// ```
type LogzSubAccountTagRule struct {
	pulumi.CustomResourceState

	// The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
	LogzSubAccountId pulumi.StringOutput `pulumi:"logzSubAccountId"`
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs pulumi.BoolPtrOutput `pulumi:"sendAadLogs"`
	// Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
	SendActivityLogs pulumi.BoolPtrOutput `pulumi:"sendActivityLogs"`
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs pulumi.BoolPtrOutput `pulumi:"sendSubscriptionLogs"`
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters LogzSubAccountTagRuleTagFilterArrayOutput `pulumi:"tagFilters"`
}

// NewLogzSubAccountTagRule registers a new resource with the given unique name, arguments, and options.
func NewLogzSubAccountTagRule(ctx *pulumi.Context,
	name string, args *LogzSubAccountTagRuleArgs, opts ...pulumi.ResourceOption) (*LogzSubAccountTagRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LogzSubAccountId == nil {
		return nil, errors.New("invalid value for required argument 'LogzSubAccountId'")
	}
	var resource LogzSubAccountTagRule
	err := ctx.RegisterResource("azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogzSubAccountTagRule gets an existing LogzSubAccountTagRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogzSubAccountTagRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogzSubAccountTagRuleState, opts ...pulumi.ResourceOption) (*LogzSubAccountTagRule, error) {
	var resource LogzSubAccountTagRule
	err := ctx.ReadResource("azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogzSubAccountTagRule resources.
type logzSubAccountTagRuleState struct {
	// The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
	LogzSubAccountId *string `pulumi:"logzSubAccountId"`
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs *bool `pulumi:"sendAadLogs"`
	// Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
	SendActivityLogs *bool `pulumi:"sendActivityLogs"`
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs *bool `pulumi:"sendSubscriptionLogs"`
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters []LogzSubAccountTagRuleTagFilter `pulumi:"tagFilters"`
}

type LogzSubAccountTagRuleState struct {
	// The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
	LogzSubAccountId pulumi.StringPtrInput
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs pulumi.BoolPtrInput
	// Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
	SendActivityLogs pulumi.BoolPtrInput
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs pulumi.BoolPtrInput
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters LogzSubAccountTagRuleTagFilterArrayInput
}

func (LogzSubAccountTagRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*logzSubAccountTagRuleState)(nil)).Elem()
}

type logzSubAccountTagRuleArgs struct {
	// The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
	LogzSubAccountId string `pulumi:"logzSubAccountId"`
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs *bool `pulumi:"sendAadLogs"`
	// Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
	SendActivityLogs *bool `pulumi:"sendActivityLogs"`
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs *bool `pulumi:"sendSubscriptionLogs"`
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters []LogzSubAccountTagRuleTagFilter `pulumi:"tagFilters"`
}

// The set of arguments for constructing a LogzSubAccountTagRule resource.
type LogzSubAccountTagRuleArgs struct {
	// The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
	LogzSubAccountId pulumi.StringInput
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs pulumi.BoolPtrInput
	// Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
	SendActivityLogs pulumi.BoolPtrInput
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs pulumi.BoolPtrInput
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters LogzSubAccountTagRuleTagFilterArrayInput
}

func (LogzSubAccountTagRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logzSubAccountTagRuleArgs)(nil)).Elem()
}

type LogzSubAccountTagRuleInput interface {
	pulumi.Input

	ToLogzSubAccountTagRuleOutput() LogzSubAccountTagRuleOutput
	ToLogzSubAccountTagRuleOutputWithContext(ctx context.Context) LogzSubAccountTagRuleOutput
}

func (*LogzSubAccountTagRule) ElementType() reflect.Type {
	return reflect.TypeOf((**LogzSubAccountTagRule)(nil)).Elem()
}

func (i *LogzSubAccountTagRule) ToLogzSubAccountTagRuleOutput() LogzSubAccountTagRuleOutput {
	return i.ToLogzSubAccountTagRuleOutputWithContext(context.Background())
}

func (i *LogzSubAccountTagRule) ToLogzSubAccountTagRuleOutputWithContext(ctx context.Context) LogzSubAccountTagRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogzSubAccountTagRuleOutput)
}

// LogzSubAccountTagRuleArrayInput is an input type that accepts LogzSubAccountTagRuleArray and LogzSubAccountTagRuleArrayOutput values.
// You can construct a concrete instance of `LogzSubAccountTagRuleArrayInput` via:
//
//	LogzSubAccountTagRuleArray{ LogzSubAccountTagRuleArgs{...} }
type LogzSubAccountTagRuleArrayInput interface {
	pulumi.Input

	ToLogzSubAccountTagRuleArrayOutput() LogzSubAccountTagRuleArrayOutput
	ToLogzSubAccountTagRuleArrayOutputWithContext(context.Context) LogzSubAccountTagRuleArrayOutput
}

type LogzSubAccountTagRuleArray []LogzSubAccountTagRuleInput

func (LogzSubAccountTagRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogzSubAccountTagRule)(nil)).Elem()
}

func (i LogzSubAccountTagRuleArray) ToLogzSubAccountTagRuleArrayOutput() LogzSubAccountTagRuleArrayOutput {
	return i.ToLogzSubAccountTagRuleArrayOutputWithContext(context.Background())
}

func (i LogzSubAccountTagRuleArray) ToLogzSubAccountTagRuleArrayOutputWithContext(ctx context.Context) LogzSubAccountTagRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogzSubAccountTagRuleArrayOutput)
}

// LogzSubAccountTagRuleMapInput is an input type that accepts LogzSubAccountTagRuleMap and LogzSubAccountTagRuleMapOutput values.
// You can construct a concrete instance of `LogzSubAccountTagRuleMapInput` via:
//
//	LogzSubAccountTagRuleMap{ "key": LogzSubAccountTagRuleArgs{...} }
type LogzSubAccountTagRuleMapInput interface {
	pulumi.Input

	ToLogzSubAccountTagRuleMapOutput() LogzSubAccountTagRuleMapOutput
	ToLogzSubAccountTagRuleMapOutputWithContext(context.Context) LogzSubAccountTagRuleMapOutput
}

type LogzSubAccountTagRuleMap map[string]LogzSubAccountTagRuleInput

func (LogzSubAccountTagRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogzSubAccountTagRule)(nil)).Elem()
}

func (i LogzSubAccountTagRuleMap) ToLogzSubAccountTagRuleMapOutput() LogzSubAccountTagRuleMapOutput {
	return i.ToLogzSubAccountTagRuleMapOutputWithContext(context.Background())
}

func (i LogzSubAccountTagRuleMap) ToLogzSubAccountTagRuleMapOutputWithContext(ctx context.Context) LogzSubAccountTagRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogzSubAccountTagRuleMapOutput)
}

type LogzSubAccountTagRuleOutput struct{ *pulumi.OutputState }

func (LogzSubAccountTagRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogzSubAccountTagRule)(nil)).Elem()
}

func (o LogzSubAccountTagRuleOutput) ToLogzSubAccountTagRuleOutput() LogzSubAccountTagRuleOutput {
	return o
}

func (o LogzSubAccountTagRuleOutput) ToLogzSubAccountTagRuleOutputWithContext(ctx context.Context) LogzSubAccountTagRuleOutput {
	return o
}

// The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
func (o LogzSubAccountTagRuleOutput) LogzSubAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *LogzSubAccountTagRule) pulumi.StringOutput { return v.LogzSubAccountId }).(pulumi.StringOutput)
}

// Whether AAD logs should be sent to the Monitor resource?
func (o LogzSubAccountTagRuleOutput) SendAadLogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogzSubAccountTagRule) pulumi.BoolPtrOutput { return v.SendAadLogs }).(pulumi.BoolPtrOutput)
}

// Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
func (o LogzSubAccountTagRuleOutput) SendActivityLogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogzSubAccountTagRule) pulumi.BoolPtrOutput { return v.SendActivityLogs }).(pulumi.BoolPtrOutput)
}

// Whether subscription logs should be sent to the Monitor resource?
func (o LogzSubAccountTagRuleOutput) SendSubscriptionLogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogzSubAccountTagRule) pulumi.BoolPtrOutput { return v.SendSubscriptionLogs }).(pulumi.BoolPtrOutput)
}

// One or more (up to 10) `tagFilter` blocks as defined below.
func (o LogzSubAccountTagRuleOutput) TagFilters() LogzSubAccountTagRuleTagFilterArrayOutput {
	return o.ApplyT(func(v *LogzSubAccountTagRule) LogzSubAccountTagRuleTagFilterArrayOutput { return v.TagFilters }).(LogzSubAccountTagRuleTagFilterArrayOutput)
}

type LogzSubAccountTagRuleArrayOutput struct{ *pulumi.OutputState }

func (LogzSubAccountTagRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogzSubAccountTagRule)(nil)).Elem()
}

func (o LogzSubAccountTagRuleArrayOutput) ToLogzSubAccountTagRuleArrayOutput() LogzSubAccountTagRuleArrayOutput {
	return o
}

func (o LogzSubAccountTagRuleArrayOutput) ToLogzSubAccountTagRuleArrayOutputWithContext(ctx context.Context) LogzSubAccountTagRuleArrayOutput {
	return o
}

func (o LogzSubAccountTagRuleArrayOutput) Index(i pulumi.IntInput) LogzSubAccountTagRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogzSubAccountTagRule {
		return vs[0].([]*LogzSubAccountTagRule)[vs[1].(int)]
	}).(LogzSubAccountTagRuleOutput)
}

type LogzSubAccountTagRuleMapOutput struct{ *pulumi.OutputState }

func (LogzSubAccountTagRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogzSubAccountTagRule)(nil)).Elem()
}

func (o LogzSubAccountTagRuleMapOutput) ToLogzSubAccountTagRuleMapOutput() LogzSubAccountTagRuleMapOutput {
	return o
}

func (o LogzSubAccountTagRuleMapOutput) ToLogzSubAccountTagRuleMapOutputWithContext(ctx context.Context) LogzSubAccountTagRuleMapOutput {
	return o
}

func (o LogzSubAccountTagRuleMapOutput) MapIndex(k pulumi.StringInput) LogzSubAccountTagRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogzSubAccountTagRule {
		return vs[0].(map[string]*LogzSubAccountTagRule)[vs[1].(string)]
	}).(LogzSubAccountTagRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogzSubAccountTagRuleInput)(nil)).Elem(), &LogzSubAccountTagRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogzSubAccountTagRuleArrayInput)(nil)).Elem(), LogzSubAccountTagRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogzSubAccountTagRuleMapInput)(nil)).Elem(), LogzSubAccountTagRuleMap{})
	pulumi.RegisterOutputType(LogzSubAccountTagRuleOutput{})
	pulumi.RegisterOutputType(LogzSubAccountTagRuleArrayOutput{})
	pulumi.RegisterOutputType(LogzSubAccountTagRuleMapOutput{})
}