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

// Manages a Kusto Script.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleCluster, err := kusto.NewCluster(ctx, "example", &kusto.ClusterArgs{
//				Name:              pulumi.String("example"),
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Sku: &kusto.ClusterSkuArgs{
//					Name:     pulumi.String("Dev(No SLA)_Standard_D11_v2"),
//					Capacity: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleDatabase, err := kusto.NewDatabase(ctx, "example", &kusto.DatabaseArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				ClusterName:       exampleCluster.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("example"),
//				ResourceGroupName:      exampleResourceGroup.Name,
//				Location:               exampleResourceGroup.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleContainer, err := storage.NewContainer(ctx, "example", &storage.ContainerArgs{
//				Name:                pulumi.String("setup-files"),
//				StorageAccountName:  exampleAccount.Name,
//				ContainerAccessType: pulumi.String("private"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBlob, err := storage.NewBlob(ctx, "example", &storage.BlobArgs{
//				Name:                 pulumi.String("script.txt"),
//				StorageAccountName:   exampleAccount.Name,
//				StorageContainerName: exampleContainer.Name,
//				Type:                 pulumi.String("Block"),
//				SourceContent:        pulumi.String(".create table MyTable (Level:string, Timestamp:datetime, UserId:string, TraceId:string, Message:string, ProcessId:int32)"),
//			})
//			if err != nil {
//				return err
//			}
//			example := storage.GetAccountBlobContainerSASOutput(ctx, storage.GetAccountBlobContainerSASOutputArgs{
//				ConnectionString: exampleAccount.PrimaryConnectionString,
//				ContainerName:    exampleContainer.Name,
//				HttpsOnly:        pulumi.Bool(true),
//				Start:            pulumi.String("2017-03-21"),
//				Expiry:           pulumi.String("2022-03-21"),
//				Permissions: &storage.GetAccountBlobContainerSASPermissionsArgs{
//					Read:   pulumi.Bool(true),
//					Add:    pulumi.Bool(false),
//					Create: pulumi.Bool(false),
//					Write:  pulumi.Bool(true),
//					Delete: pulumi.Bool(false),
//					List:   pulumi.Bool(true),
//				},
//			}, nil)
//			_, err = kusto.NewScript(ctx, "example", &kusto.ScriptArgs{
//				Name:       pulumi.String("example"),
//				DatabaseId: exampleDatabase.ID(),
//				Url:        exampleBlob.ID(),
//				SasToken: pulumi.String(example.ApplyT(func(example storage.GetAccountBlobContainerSASResult) (*string, error) {
//					return &example.Sas, nil
//				}).(pulumi.StringPtrOutput)),
//				ContinueOnErrorsEnabled:       pulumi.Bool(true),
//				ForceAnUpdateWhenValueChanged: pulumi.String("first"),
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
// Kusto Scripts can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:kusto/script:Script example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Kusto/clusters/cluster1/databases/database1/scripts/script1
// ```
type Script struct {
	pulumi.CustomResourceState

	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled pulumi.BoolPtrOutput `pulumi:"continueOnErrorsEnabled"`
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId pulumi.StringOutput `pulumi:"databaseId"`
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged pulumi.StringOutput `pulumi:"forceAnUpdateWhenValueChanged"`
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The SAS token used to access the script. Must be provided when using scriptUrl property. Changing this forces a new resource to be created.
	SasToken pulumi.StringPtrOutput `pulumi:"sasToken"`
	// The script content. This property should be used when the script is provide inline and not through file in a SA. Must not be used together with `url` and `sasToken` properties. Changing this forces a new resource to be created.
	ScriptContent pulumi.StringPtrOutput `pulumi:"scriptContent"`
	// The url to the KQL script blob file. Must not be used together with scriptContent property. Please reference [this documentation](https://docs.microsoft.com/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url pulumi.StringPtrOutput `pulumi:"url"`
}

// NewScript registers a new resource with the given unique name, arguments, and options.
func NewScript(ctx *pulumi.Context,
	name string, args *ScriptArgs, opts ...pulumi.ResourceOption) (*Script, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseId == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseId'")
	}
	if args.SasToken != nil {
		args.SasToken = pulumi.ToSecret(args.SasToken).(pulumi.StringPtrInput)
	}
	if args.ScriptContent != nil {
		args.ScriptContent = pulumi.ToSecret(args.ScriptContent).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"sasToken",
		"scriptContent",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Script
	err := ctx.RegisterResource("azure:kusto/script:Script", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScript gets an existing Script resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScriptState, opts ...pulumi.ResourceOption) (*Script, error) {
	var resource Script
	err := ctx.ReadResource("azure:kusto/script:Script", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Script resources.
type scriptState struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled *bool `pulumi:"continueOnErrorsEnabled"`
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId *string `pulumi:"databaseId"`
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged *string `pulumi:"forceAnUpdateWhenValueChanged"`
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name *string `pulumi:"name"`
	// The SAS token used to access the script. Must be provided when using scriptUrl property. Changing this forces a new resource to be created.
	SasToken *string `pulumi:"sasToken"`
	// The script content. This property should be used when the script is provide inline and not through file in a SA. Must not be used together with `url` and `sasToken` properties. Changing this forces a new resource to be created.
	ScriptContent *string `pulumi:"scriptContent"`
	// The url to the KQL script blob file. Must not be used together with scriptContent property. Please reference [this documentation](https://docs.microsoft.com/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url *string `pulumi:"url"`
}

type ScriptState struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled pulumi.BoolPtrInput
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId pulumi.StringPtrInput
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged pulumi.StringPtrInput
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name pulumi.StringPtrInput
	// The SAS token used to access the script. Must be provided when using scriptUrl property. Changing this forces a new resource to be created.
	SasToken pulumi.StringPtrInput
	// The script content. This property should be used when the script is provide inline and not through file in a SA. Must not be used together with `url` and `sasToken` properties. Changing this forces a new resource to be created.
	ScriptContent pulumi.StringPtrInput
	// The url to the KQL script blob file. Must not be used together with scriptContent property. Please reference [this documentation](https://docs.microsoft.com/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url pulumi.StringPtrInput
}

func (ScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*scriptState)(nil)).Elem()
}

type scriptArgs struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled *bool `pulumi:"continueOnErrorsEnabled"`
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId string `pulumi:"databaseId"`
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged *string `pulumi:"forceAnUpdateWhenValueChanged"`
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name *string `pulumi:"name"`
	// The SAS token used to access the script. Must be provided when using scriptUrl property. Changing this forces a new resource to be created.
	SasToken *string `pulumi:"sasToken"`
	// The script content. This property should be used when the script is provide inline and not through file in a SA. Must not be used together with `url` and `sasToken` properties. Changing this forces a new resource to be created.
	ScriptContent *string `pulumi:"scriptContent"`
	// The url to the KQL script blob file. Must not be used together with scriptContent property. Please reference [this documentation](https://docs.microsoft.com/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url *string `pulumi:"url"`
}

// The set of arguments for constructing a Script resource.
type ScriptArgs struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled pulumi.BoolPtrInput
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId pulumi.StringInput
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged pulumi.StringPtrInput
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name pulumi.StringPtrInput
	// The SAS token used to access the script. Must be provided when using scriptUrl property. Changing this forces a new resource to be created.
	SasToken pulumi.StringPtrInput
	// The script content. This property should be used when the script is provide inline and not through file in a SA. Must not be used together with `url` and `sasToken` properties. Changing this forces a new resource to be created.
	ScriptContent pulumi.StringPtrInput
	// The url to the KQL script blob file. Must not be used together with scriptContent property. Please reference [this documentation](https://docs.microsoft.com/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url pulumi.StringPtrInput
}

func (ScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scriptArgs)(nil)).Elem()
}

type ScriptInput interface {
	pulumi.Input

	ToScriptOutput() ScriptOutput
	ToScriptOutputWithContext(ctx context.Context) ScriptOutput
}

func (*Script) ElementType() reflect.Type {
	return reflect.TypeOf((**Script)(nil)).Elem()
}

func (i *Script) ToScriptOutput() ScriptOutput {
	return i.ToScriptOutputWithContext(context.Background())
}

func (i *Script) ToScriptOutputWithContext(ctx context.Context) ScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptOutput)
}

// ScriptArrayInput is an input type that accepts ScriptArray and ScriptArrayOutput values.
// You can construct a concrete instance of `ScriptArrayInput` via:
//
//	ScriptArray{ ScriptArgs{...} }
type ScriptArrayInput interface {
	pulumi.Input

	ToScriptArrayOutput() ScriptArrayOutput
	ToScriptArrayOutputWithContext(context.Context) ScriptArrayOutput
}

type ScriptArray []ScriptInput

func (ScriptArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Script)(nil)).Elem()
}

func (i ScriptArray) ToScriptArrayOutput() ScriptArrayOutput {
	return i.ToScriptArrayOutputWithContext(context.Background())
}

func (i ScriptArray) ToScriptArrayOutputWithContext(ctx context.Context) ScriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptArrayOutput)
}

// ScriptMapInput is an input type that accepts ScriptMap and ScriptMapOutput values.
// You can construct a concrete instance of `ScriptMapInput` via:
//
//	ScriptMap{ "key": ScriptArgs{...} }
type ScriptMapInput interface {
	pulumi.Input

	ToScriptMapOutput() ScriptMapOutput
	ToScriptMapOutputWithContext(context.Context) ScriptMapOutput
}

type ScriptMap map[string]ScriptInput

func (ScriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Script)(nil)).Elem()
}

func (i ScriptMap) ToScriptMapOutput() ScriptMapOutput {
	return i.ToScriptMapOutputWithContext(context.Background())
}

func (i ScriptMap) ToScriptMapOutputWithContext(ctx context.Context) ScriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptMapOutput)
}

type ScriptOutput struct{ *pulumi.OutputState }

func (ScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Script)(nil)).Elem()
}

func (o ScriptOutput) ToScriptOutput() ScriptOutput {
	return o
}

func (o ScriptOutput) ToScriptOutputWithContext(ctx context.Context) ScriptOutput {
	return o
}

// Flag that indicates whether to continue if one of the command fails.
func (o ScriptOutput) ContinueOnErrorsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Script) pulumi.BoolPtrOutput { return v.ContinueOnErrorsEnabled }).(pulumi.BoolPtrOutput)
}

// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
func (o ScriptOutput) DatabaseId() pulumi.StringOutput {
	return o.ApplyT(func(v *Script) pulumi.StringOutput { return v.DatabaseId }).(pulumi.StringOutput)
}

// A unique string. If changed the script will be applied again.
func (o ScriptOutput) ForceAnUpdateWhenValueChanged() pulumi.StringOutput {
	return o.ApplyT(func(v *Script) pulumi.StringOutput { return v.ForceAnUpdateWhenValueChanged }).(pulumi.StringOutput)
}

// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
func (o ScriptOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Script) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The SAS token used to access the script. Must be provided when using scriptUrl property. Changing this forces a new resource to be created.
func (o ScriptOutput) SasToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Script) pulumi.StringPtrOutput { return v.SasToken }).(pulumi.StringPtrOutput)
}

// The script content. This property should be used when the script is provide inline and not through file in a SA. Must not be used together with `url` and `sasToken` properties. Changing this forces a new resource to be created.
func (o ScriptOutput) ScriptContent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Script) pulumi.StringPtrOutput { return v.ScriptContent }).(pulumi.StringPtrOutput)
}

// The url to the KQL script blob file. Must not be used together with scriptContent property. Please reference [this documentation](https://docs.microsoft.com/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
func (o ScriptOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Script) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

type ScriptArrayOutput struct{ *pulumi.OutputState }

func (ScriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Script)(nil)).Elem()
}

func (o ScriptArrayOutput) ToScriptArrayOutput() ScriptArrayOutput {
	return o
}

func (o ScriptArrayOutput) ToScriptArrayOutputWithContext(ctx context.Context) ScriptArrayOutput {
	return o
}

func (o ScriptArrayOutput) Index(i pulumi.IntInput) ScriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Script {
		return vs[0].([]*Script)[vs[1].(int)]
	}).(ScriptOutput)
}

type ScriptMapOutput struct{ *pulumi.OutputState }

func (ScriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Script)(nil)).Elem()
}

func (o ScriptMapOutput) ToScriptMapOutput() ScriptMapOutput {
	return o
}

func (o ScriptMapOutput) ToScriptMapOutputWithContext(ctx context.Context) ScriptMapOutput {
	return o
}

func (o ScriptMapOutput) MapIndex(k pulumi.StringInput) ScriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Script {
		return vs[0].(map[string]*Script)[vs[1].(string)]
	}).(ScriptOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScriptInput)(nil)).Elem(), &Script{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScriptArrayInput)(nil)).Elem(), ScriptArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScriptMapInput)(nil)).Elem(), ScriptMap{})
	pulumi.RegisterOutputType(ScriptOutput{})
	pulumi.RegisterOutputType(ScriptArrayOutput{})
	pulumi.RegisterOutputType(ScriptMapOutput{})
}
