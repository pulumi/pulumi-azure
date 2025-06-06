// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package automation

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Automation Python3 Package.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/automation"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("rg-example"),
//				Location: pulumi.String("%[2]s"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := automation.NewAccount(ctx, "example", &automation.AccountArgs{
//				Name:              pulumi.String("accexample"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Basic"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = automation.NewPython3Package(ctx, "example", &automation.Python3PackageArgs{
//				Name:                  pulumi.String("example"),
//				ResourceGroupName:     example.Name,
//				AutomationAccountName: exampleAccount.Name,
//				ContentUri:            pulumi.String("https://pypi.org/packages/source/r/requests/requests-2.31.0.tar.gz"),
//				ContentVersion:        pulumi.String("2.31.0"),
//				HashAlgorithm:         pulumi.String("sha256"),
//				HashValue:             pulumi.String("942c5a758f98d790eaed1a29cb6eefc7ffb0d1cf7af05c3d2791656dbd6ad1e1"),
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("foo"),
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
// * `Microsoft.Automation`: 2023-11-01
//
// ## Import
//
// Automation Python3 Packages can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:automation/python3Package:Python3Package example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/python3Packages/pkg
// ```
type Python3Package struct {
	pulumi.CustomResourceState

	// The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringOutput `pulumi:"automationAccountName"`
	// The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
	ContentUri pulumi.StringOutput `pulumi:"contentUri"`
	// Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
	ContentVersion pulumi.StringPtrOutput `pulumi:"contentVersion"`
	// Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
	HashAlgorithm pulumi.StringPtrOutput `pulumi:"hashAlgorithm"`
	// Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
	HashValue pulumi.StringPtrOutput `pulumi:"hashValue"`
	// The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Automation Python3 Package.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewPython3Package registers a new resource with the given unique name, arguments, and options.
func NewPython3Package(ctx *pulumi.Context,
	name string, args *Python3PackageArgs, opts ...pulumi.ResourceOption) (*Python3Package, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutomationAccountName == nil {
		return nil, errors.New("invalid value for required argument 'AutomationAccountName'")
	}
	if args.ContentUri == nil {
		return nil, errors.New("invalid value for required argument 'ContentUri'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Python3Package
	err := ctx.RegisterResource("azure:automation/python3Package:Python3Package", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPython3Package gets an existing Python3Package resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPython3Package(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Python3PackageState, opts ...pulumi.ResourceOption) (*Python3Package, error) {
	var resource Python3Package
	err := ctx.ReadResource("azure:automation/python3Package:Python3Package", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Python3Package resources.
type python3PackageState struct {
	// The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
	AutomationAccountName *string `pulumi:"automationAccountName"`
	// The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
	ContentUri *string `pulumi:"contentUri"`
	// Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
	ContentVersion *string `pulumi:"contentVersion"`
	// Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
	HashAlgorithm *string `pulumi:"hashAlgorithm"`
	// Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
	HashValue *string `pulumi:"hashValue"`
	// The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Automation Python3 Package.
	Tags map[string]string `pulumi:"tags"`
}

type Python3PackageState struct {
	// The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringPtrInput
	// The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
	ContentUri pulumi.StringPtrInput
	// Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
	ContentVersion pulumi.StringPtrInput
	// Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
	HashAlgorithm pulumi.StringPtrInput
	// Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
	HashValue pulumi.StringPtrInput
	// The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Automation Python3 Package.
	Tags pulumi.StringMapInput
}

func (Python3PackageState) ElementType() reflect.Type {
	return reflect.TypeOf((*python3PackageState)(nil)).Elem()
}

type python3PackageArgs struct {
	// The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
	AutomationAccountName string `pulumi:"automationAccountName"`
	// The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
	ContentUri string `pulumi:"contentUri"`
	// Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
	ContentVersion *string `pulumi:"contentVersion"`
	// Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
	HashAlgorithm *string `pulumi:"hashAlgorithm"`
	// Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
	HashValue *string `pulumi:"hashValue"`
	// The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Automation Python3 Package.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Python3Package resource.
type Python3PackageArgs struct {
	// The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringInput
	// The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
	ContentUri pulumi.StringInput
	// Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
	ContentVersion pulumi.StringPtrInput
	// Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
	HashAlgorithm pulumi.StringPtrInput
	// Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
	HashValue pulumi.StringPtrInput
	// The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Automation Python3 Package.
	Tags pulumi.StringMapInput
}

func (Python3PackageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*python3PackageArgs)(nil)).Elem()
}

type Python3PackageInput interface {
	pulumi.Input

	ToPython3PackageOutput() Python3PackageOutput
	ToPython3PackageOutputWithContext(ctx context.Context) Python3PackageOutput
}

func (*Python3Package) ElementType() reflect.Type {
	return reflect.TypeOf((**Python3Package)(nil)).Elem()
}

func (i *Python3Package) ToPython3PackageOutput() Python3PackageOutput {
	return i.ToPython3PackageOutputWithContext(context.Background())
}

func (i *Python3Package) ToPython3PackageOutputWithContext(ctx context.Context) Python3PackageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Python3PackageOutput)
}

// Python3PackageArrayInput is an input type that accepts Python3PackageArray and Python3PackageArrayOutput values.
// You can construct a concrete instance of `Python3PackageArrayInput` via:
//
//	Python3PackageArray{ Python3PackageArgs{...} }
type Python3PackageArrayInput interface {
	pulumi.Input

	ToPython3PackageArrayOutput() Python3PackageArrayOutput
	ToPython3PackageArrayOutputWithContext(context.Context) Python3PackageArrayOutput
}

type Python3PackageArray []Python3PackageInput

func (Python3PackageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Python3Package)(nil)).Elem()
}

func (i Python3PackageArray) ToPython3PackageArrayOutput() Python3PackageArrayOutput {
	return i.ToPython3PackageArrayOutputWithContext(context.Background())
}

func (i Python3PackageArray) ToPython3PackageArrayOutputWithContext(ctx context.Context) Python3PackageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Python3PackageArrayOutput)
}

// Python3PackageMapInput is an input type that accepts Python3PackageMap and Python3PackageMapOutput values.
// You can construct a concrete instance of `Python3PackageMapInput` via:
//
//	Python3PackageMap{ "key": Python3PackageArgs{...} }
type Python3PackageMapInput interface {
	pulumi.Input

	ToPython3PackageMapOutput() Python3PackageMapOutput
	ToPython3PackageMapOutputWithContext(context.Context) Python3PackageMapOutput
}

type Python3PackageMap map[string]Python3PackageInput

func (Python3PackageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Python3Package)(nil)).Elem()
}

func (i Python3PackageMap) ToPython3PackageMapOutput() Python3PackageMapOutput {
	return i.ToPython3PackageMapOutputWithContext(context.Background())
}

func (i Python3PackageMap) ToPython3PackageMapOutputWithContext(ctx context.Context) Python3PackageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Python3PackageMapOutput)
}

type Python3PackageOutput struct{ *pulumi.OutputState }

func (Python3PackageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Python3Package)(nil)).Elem()
}

func (o Python3PackageOutput) ToPython3PackageOutput() Python3PackageOutput {
	return o
}

func (o Python3PackageOutput) ToPython3PackageOutputWithContext(ctx context.Context) Python3PackageOutput {
	return o
}

// The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
func (o Python3PackageOutput) AutomationAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringOutput { return v.AutomationAccountName }).(pulumi.StringOutput)
}

// The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
func (o Python3PackageOutput) ContentUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringOutput { return v.ContentUri }).(pulumi.StringOutput)
}

// Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
func (o Python3PackageOutput) ContentVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringPtrOutput { return v.ContentVersion }).(pulumi.StringPtrOutput)
}

// Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
func (o Python3PackageOutput) HashAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringPtrOutput { return v.HashAlgorithm }).(pulumi.StringPtrOutput)
}

// Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
func (o Python3PackageOutput) HashValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringPtrOutput { return v.HashValue }).(pulumi.StringPtrOutput)
}

// The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
func (o Python3PackageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
func (o Python3PackageOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Automation Python3 Package.
func (o Python3PackageOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Python3Package) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type Python3PackageArrayOutput struct{ *pulumi.OutputState }

func (Python3PackageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Python3Package)(nil)).Elem()
}

func (o Python3PackageArrayOutput) ToPython3PackageArrayOutput() Python3PackageArrayOutput {
	return o
}

func (o Python3PackageArrayOutput) ToPython3PackageArrayOutputWithContext(ctx context.Context) Python3PackageArrayOutput {
	return o
}

func (o Python3PackageArrayOutput) Index(i pulumi.IntInput) Python3PackageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Python3Package {
		return vs[0].([]*Python3Package)[vs[1].(int)]
	}).(Python3PackageOutput)
}

type Python3PackageMapOutput struct{ *pulumi.OutputState }

func (Python3PackageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Python3Package)(nil)).Elem()
}

func (o Python3PackageMapOutput) ToPython3PackageMapOutput() Python3PackageMapOutput {
	return o
}

func (o Python3PackageMapOutput) ToPython3PackageMapOutputWithContext(ctx context.Context) Python3PackageMapOutput {
	return o
}

func (o Python3PackageMapOutput) MapIndex(k pulumi.StringInput) Python3PackageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Python3Package {
		return vs[0].(map[string]*Python3Package)[vs[1].(string)]
	}).(Python3PackageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Python3PackageInput)(nil)).Elem(), &Python3Package{})
	pulumi.RegisterInputType(reflect.TypeOf((*Python3PackageArrayInput)(nil)).Elem(), Python3PackageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*Python3PackageMapInput)(nil)).Elem(), Python3PackageMap{})
	pulumi.RegisterOutputType(Python3PackageOutput{})
	pulumi.RegisterOutputType(Python3PackageArrayOutput{})
	pulumi.RegisterOutputType(Python3PackageMapOutput{})
}
