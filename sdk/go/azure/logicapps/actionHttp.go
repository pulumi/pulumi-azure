// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package logicapps

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an HTTP Action within a Logic App Workflow
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/logicapps"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("workflow-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleWorkflow, err := logicapps.NewWorkflow(ctx, "example", &logicapps.WorkflowArgs{
//				Name:              pulumi.String("workflow1"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = logicapps.NewActionHttp(ctx, "example", &logicapps.ActionHttpArgs{
//				Name:       pulumi.String("webhook"),
//				LogicAppId: exampleWorkflow.ID(),
//				Method:     pulumi.String("GET"),
//				Uri:        pulumi.String("http://example.com/some-webhook"),
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
// Logic App HTTP Actions can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:logicapps/actionHttp:ActionHttp webhook1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Logic/workflows/workflow1/actions/webhook1
// ```
type ActionHttp struct {
	pulumi.CustomResourceState

	// Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
	Body pulumi.StringPtrOutput `pulumi:"body"`
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Headers pulumi.StringMapOutput `pulumi:"headers"`
	// Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
	LogicAppId pulumi.StringOutput `pulumi:"logicAppId"`
	// Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
	Method pulumi.StringOutput `pulumi:"method"`
	// Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
	//
	// > **NOTE:** This name must be unique across all Actions within the Logic App Workflow.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Queries pulumi.StringMapOutput `pulumi:"queries"`
	// Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
	RunAfters ActionHttpRunAfterArrayOutput `pulumi:"runAfters"`
	// Specifies the URI which will be called when this HTTP Action is triggered.
	Uri pulumi.StringOutput `pulumi:"uri"`
}

// NewActionHttp registers a new resource with the given unique name, arguments, and options.
func NewActionHttp(ctx *pulumi.Context,
	name string, args *ActionHttpArgs, opts ...pulumi.ResourceOption) (*ActionHttp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LogicAppId == nil {
		return nil, errors.New("invalid value for required argument 'LogicAppId'")
	}
	if args.Method == nil {
		return nil, errors.New("invalid value for required argument 'Method'")
	}
	if args.Uri == nil {
		return nil, errors.New("invalid value for required argument 'Uri'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ActionHttp
	err := ctx.RegisterResource("azure:logicapps/actionHttp:ActionHttp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActionHttp gets an existing ActionHttp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActionHttp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionHttpState, opts ...pulumi.ResourceOption) (*ActionHttp, error) {
	var resource ActionHttp
	err := ctx.ReadResource("azure:logicapps/actionHttp:ActionHttp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActionHttp resources.
type actionHttpState struct {
	// Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
	Body *string `pulumi:"body"`
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Headers map[string]string `pulumi:"headers"`
	// Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
	LogicAppId *string `pulumi:"logicAppId"`
	// Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
	Method *string `pulumi:"method"`
	// Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
	//
	// > **NOTE:** This name must be unique across all Actions within the Logic App Workflow.
	Name *string `pulumi:"name"`
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Queries map[string]string `pulumi:"queries"`
	// Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
	RunAfters []ActionHttpRunAfter `pulumi:"runAfters"`
	// Specifies the URI which will be called when this HTTP Action is triggered.
	Uri *string `pulumi:"uri"`
}

type ActionHttpState struct {
	// Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
	Body pulumi.StringPtrInput
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Headers pulumi.StringMapInput
	// Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
	LogicAppId pulumi.StringPtrInput
	// Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
	Method pulumi.StringPtrInput
	// Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
	//
	// > **NOTE:** This name must be unique across all Actions within the Logic App Workflow.
	Name pulumi.StringPtrInput
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Queries pulumi.StringMapInput
	// Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
	RunAfters ActionHttpRunAfterArrayInput
	// Specifies the URI which will be called when this HTTP Action is triggered.
	Uri pulumi.StringPtrInput
}

func (ActionHttpState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionHttpState)(nil)).Elem()
}

type actionHttpArgs struct {
	// Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
	Body *string `pulumi:"body"`
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Headers map[string]string `pulumi:"headers"`
	// Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
	LogicAppId string `pulumi:"logicAppId"`
	// Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
	Method string `pulumi:"method"`
	// Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
	//
	// > **NOTE:** This name must be unique across all Actions within the Logic App Workflow.
	Name *string `pulumi:"name"`
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Queries map[string]string `pulumi:"queries"`
	// Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
	RunAfters []ActionHttpRunAfter `pulumi:"runAfters"`
	// Specifies the URI which will be called when this HTTP Action is triggered.
	Uri string `pulumi:"uri"`
}

// The set of arguments for constructing a ActionHttp resource.
type ActionHttpArgs struct {
	// Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
	Body pulumi.StringPtrInput
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Headers pulumi.StringMapInput
	// Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
	LogicAppId pulumi.StringInput
	// Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
	Method pulumi.StringInput
	// Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
	//
	// > **NOTE:** This name must be unique across all Actions within the Logic App Workflow.
	Name pulumi.StringPtrInput
	// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
	Queries pulumi.StringMapInput
	// Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
	RunAfters ActionHttpRunAfterArrayInput
	// Specifies the URI which will be called when this HTTP Action is triggered.
	Uri pulumi.StringInput
}

func (ActionHttpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionHttpArgs)(nil)).Elem()
}

type ActionHttpInput interface {
	pulumi.Input

	ToActionHttpOutput() ActionHttpOutput
	ToActionHttpOutputWithContext(ctx context.Context) ActionHttpOutput
}

func (*ActionHttp) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionHttp)(nil)).Elem()
}

func (i *ActionHttp) ToActionHttpOutput() ActionHttpOutput {
	return i.ToActionHttpOutputWithContext(context.Background())
}

func (i *ActionHttp) ToActionHttpOutputWithContext(ctx context.Context) ActionHttpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionHttpOutput)
}

// ActionHttpArrayInput is an input type that accepts ActionHttpArray and ActionHttpArrayOutput values.
// You can construct a concrete instance of `ActionHttpArrayInput` via:
//
//	ActionHttpArray{ ActionHttpArgs{...} }
type ActionHttpArrayInput interface {
	pulumi.Input

	ToActionHttpArrayOutput() ActionHttpArrayOutput
	ToActionHttpArrayOutputWithContext(context.Context) ActionHttpArrayOutput
}

type ActionHttpArray []ActionHttpInput

func (ActionHttpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionHttp)(nil)).Elem()
}

func (i ActionHttpArray) ToActionHttpArrayOutput() ActionHttpArrayOutput {
	return i.ToActionHttpArrayOutputWithContext(context.Background())
}

func (i ActionHttpArray) ToActionHttpArrayOutputWithContext(ctx context.Context) ActionHttpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionHttpArrayOutput)
}

// ActionHttpMapInput is an input type that accepts ActionHttpMap and ActionHttpMapOutput values.
// You can construct a concrete instance of `ActionHttpMapInput` via:
//
//	ActionHttpMap{ "key": ActionHttpArgs{...} }
type ActionHttpMapInput interface {
	pulumi.Input

	ToActionHttpMapOutput() ActionHttpMapOutput
	ToActionHttpMapOutputWithContext(context.Context) ActionHttpMapOutput
}

type ActionHttpMap map[string]ActionHttpInput

func (ActionHttpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionHttp)(nil)).Elem()
}

func (i ActionHttpMap) ToActionHttpMapOutput() ActionHttpMapOutput {
	return i.ToActionHttpMapOutputWithContext(context.Background())
}

func (i ActionHttpMap) ToActionHttpMapOutputWithContext(ctx context.Context) ActionHttpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionHttpMapOutput)
}

type ActionHttpOutput struct{ *pulumi.OutputState }

func (ActionHttpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionHttp)(nil)).Elem()
}

func (o ActionHttpOutput) ToActionHttpOutput() ActionHttpOutput {
	return o
}

func (o ActionHttpOutput) ToActionHttpOutputWithContext(ctx context.Context) ActionHttpOutput {
	return o
}

// Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
func (o ActionHttpOutput) Body() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringPtrOutput { return v.Body }).(pulumi.StringPtrOutput)
}

// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
func (o ActionHttpOutput) Headers() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringMapOutput { return v.Headers }).(pulumi.StringMapOutput)
}

// Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
func (o ActionHttpOutput) LogicAppId() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringOutput { return v.LogicAppId }).(pulumi.StringOutput)
}

// Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
func (o ActionHttpOutput) Method() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringOutput { return v.Method }).(pulumi.StringOutput)
}

// Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
//
// > **NOTE:** This name must be unique across all Actions within the Logic App Workflow.
func (o ActionHttpOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
func (o ActionHttpOutput) Queries() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringMapOutput { return v.Queries }).(pulumi.StringMapOutput)
}

// Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
func (o ActionHttpOutput) RunAfters() ActionHttpRunAfterArrayOutput {
	return o.ApplyT(func(v *ActionHttp) ActionHttpRunAfterArrayOutput { return v.RunAfters }).(ActionHttpRunAfterArrayOutput)
}

// Specifies the URI which will be called when this HTTP Action is triggered.
func (o ActionHttpOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionHttp) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

type ActionHttpArrayOutput struct{ *pulumi.OutputState }

func (ActionHttpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionHttp)(nil)).Elem()
}

func (o ActionHttpArrayOutput) ToActionHttpArrayOutput() ActionHttpArrayOutput {
	return o
}

func (o ActionHttpArrayOutput) ToActionHttpArrayOutputWithContext(ctx context.Context) ActionHttpArrayOutput {
	return o
}

func (o ActionHttpArrayOutput) Index(i pulumi.IntInput) ActionHttpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ActionHttp {
		return vs[0].([]*ActionHttp)[vs[1].(int)]
	}).(ActionHttpOutput)
}

type ActionHttpMapOutput struct{ *pulumi.OutputState }

func (ActionHttpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionHttp)(nil)).Elem()
}

func (o ActionHttpMapOutput) ToActionHttpMapOutput() ActionHttpMapOutput {
	return o
}

func (o ActionHttpMapOutput) ToActionHttpMapOutputWithContext(ctx context.Context) ActionHttpMapOutput {
	return o
}

func (o ActionHttpMapOutput) MapIndex(k pulumi.StringInput) ActionHttpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ActionHttp {
		return vs[0].(map[string]*ActionHttp)[vs[1].(string)]
	}).(ActionHttpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActionHttpInput)(nil)).Elem(), &ActionHttp{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionHttpArrayInput)(nil)).Elem(), ActionHttpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionHttpMapInput)(nil)).Elem(), ActionHttpMap{})
	pulumi.RegisterOutputType(ActionHttpOutput{})
	pulumi.RegisterOutputType(ActionHttpArrayOutput{})
	pulumi.RegisterOutputType(ActionHttpMapOutput{})
}
