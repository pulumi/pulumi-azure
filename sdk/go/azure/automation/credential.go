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

// Manages a Automation Credential.
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
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := automation.NewAccount(ctx, "example", &automation.AccountArgs{
//				Name:              pulumi.String("account1"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Basic"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = automation.NewCredential(ctx, "example", &automation.CredentialArgs{
//				Name:                  pulumi.String("credential1"),
//				ResourceGroupName:     example.Name,
//				AutomationAccountName: exampleAccount.Name,
//				Username:              pulumi.String("example_user"),
//				Password:              pulumi.String("example_pwd"),
//				Description:           pulumi.String("This is an example credential"),
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
// Automation Credentials can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:automation/credential:Credential credential1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/credentials/credential1
// ```
type Credential struct {
	pulumi.CustomResourceState

	// The name of the automation account in which the Credential is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringOutput `pulumi:"automationAccountName"`
	// The description associated with this Automation Credential.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies the name of the Credential. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The password associated with this Automation Credential.
	Password pulumi.StringOutput `pulumi:"password"`
	// The name of the resource group in which the Credential is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The username associated with this Automation Credential.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewCredential registers a new resource with the given unique name, arguments, and options.
func NewCredential(ctx *pulumi.Context,
	name string, args *CredentialArgs, opts ...pulumi.ResourceOption) (*Credential, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutomationAccountName == nil {
		return nil, errors.New("invalid value for required argument 'AutomationAccountName'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Credential
	err := ctx.RegisterResource("azure:automation/credential:Credential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCredential gets an existing Credential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CredentialState, opts ...pulumi.ResourceOption) (*Credential, error) {
	var resource Credential
	err := ctx.ReadResource("azure:automation/credential:Credential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Credential resources.
type credentialState struct {
	// The name of the automation account in which the Credential is created. Changing this forces a new resource to be created.
	AutomationAccountName *string `pulumi:"automationAccountName"`
	// The description associated with this Automation Credential.
	Description *string `pulumi:"description"`
	// Specifies the name of the Credential. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The password associated with this Automation Credential.
	Password *string `pulumi:"password"`
	// The name of the resource group in which the Credential is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The username associated with this Automation Credential.
	Username *string `pulumi:"username"`
}

type CredentialState struct {
	// The name of the automation account in which the Credential is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringPtrInput
	// The description associated with this Automation Credential.
	Description pulumi.StringPtrInput
	// Specifies the name of the Credential. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The password associated with this Automation Credential.
	Password pulumi.StringPtrInput
	// The name of the resource group in which the Credential is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The username associated with this Automation Credential.
	Username pulumi.StringPtrInput
}

func (CredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*credentialState)(nil)).Elem()
}

type credentialArgs struct {
	// The name of the automation account in which the Credential is created. Changing this forces a new resource to be created.
	AutomationAccountName string `pulumi:"automationAccountName"`
	// The description associated with this Automation Credential.
	Description *string `pulumi:"description"`
	// Specifies the name of the Credential. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The password associated with this Automation Credential.
	Password string `pulumi:"password"`
	// The name of the resource group in which the Credential is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The username associated with this Automation Credential.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a Credential resource.
type CredentialArgs struct {
	// The name of the automation account in which the Credential is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringInput
	// The description associated with this Automation Credential.
	Description pulumi.StringPtrInput
	// Specifies the name of the Credential. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The password associated with this Automation Credential.
	Password pulumi.StringInput
	// The name of the resource group in which the Credential is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The username associated with this Automation Credential.
	Username pulumi.StringInput
}

func (CredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*credentialArgs)(nil)).Elem()
}

type CredentialInput interface {
	pulumi.Input

	ToCredentialOutput() CredentialOutput
	ToCredentialOutputWithContext(ctx context.Context) CredentialOutput
}

func (*Credential) ElementType() reflect.Type {
	return reflect.TypeOf((**Credential)(nil)).Elem()
}

func (i *Credential) ToCredentialOutput() CredentialOutput {
	return i.ToCredentialOutputWithContext(context.Background())
}

func (i *Credential) ToCredentialOutputWithContext(ctx context.Context) CredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialOutput)
}

// CredentialArrayInput is an input type that accepts CredentialArray and CredentialArrayOutput values.
// You can construct a concrete instance of `CredentialArrayInput` via:
//
//	CredentialArray{ CredentialArgs{...} }
type CredentialArrayInput interface {
	pulumi.Input

	ToCredentialArrayOutput() CredentialArrayOutput
	ToCredentialArrayOutputWithContext(context.Context) CredentialArrayOutput
}

type CredentialArray []CredentialInput

func (CredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Credential)(nil)).Elem()
}

func (i CredentialArray) ToCredentialArrayOutput() CredentialArrayOutput {
	return i.ToCredentialArrayOutputWithContext(context.Background())
}

func (i CredentialArray) ToCredentialArrayOutputWithContext(ctx context.Context) CredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialArrayOutput)
}

// CredentialMapInput is an input type that accepts CredentialMap and CredentialMapOutput values.
// You can construct a concrete instance of `CredentialMapInput` via:
//
//	CredentialMap{ "key": CredentialArgs{...} }
type CredentialMapInput interface {
	pulumi.Input

	ToCredentialMapOutput() CredentialMapOutput
	ToCredentialMapOutputWithContext(context.Context) CredentialMapOutput
}

type CredentialMap map[string]CredentialInput

func (CredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Credential)(nil)).Elem()
}

func (i CredentialMap) ToCredentialMapOutput() CredentialMapOutput {
	return i.ToCredentialMapOutputWithContext(context.Background())
}

func (i CredentialMap) ToCredentialMapOutputWithContext(ctx context.Context) CredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialMapOutput)
}

type CredentialOutput struct{ *pulumi.OutputState }

func (CredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Credential)(nil)).Elem()
}

func (o CredentialOutput) ToCredentialOutput() CredentialOutput {
	return o
}

func (o CredentialOutput) ToCredentialOutputWithContext(ctx context.Context) CredentialOutput {
	return o
}

// The name of the automation account in which the Credential is created. Changing this forces a new resource to be created.
func (o CredentialOutput) AutomationAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Credential) pulumi.StringOutput { return v.AutomationAccountName }).(pulumi.StringOutput)
}

// The description associated with this Automation Credential.
func (o CredentialOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Credential) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies the name of the Credential. Changing this forces a new resource to be created.
func (o CredentialOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Credential) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password associated with this Automation Credential.
func (o CredentialOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *Credential) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The name of the resource group in which the Credential is created. Changing this forces a new resource to be created.
func (o CredentialOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Credential) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The username associated with this Automation Credential.
func (o CredentialOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *Credential) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type CredentialArrayOutput struct{ *pulumi.OutputState }

func (CredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Credential)(nil)).Elem()
}

func (o CredentialArrayOutput) ToCredentialArrayOutput() CredentialArrayOutput {
	return o
}

func (o CredentialArrayOutput) ToCredentialArrayOutputWithContext(ctx context.Context) CredentialArrayOutput {
	return o
}

func (o CredentialArrayOutput) Index(i pulumi.IntInput) CredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Credential {
		return vs[0].([]*Credential)[vs[1].(int)]
	}).(CredentialOutput)
}

type CredentialMapOutput struct{ *pulumi.OutputState }

func (CredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Credential)(nil)).Elem()
}

func (o CredentialMapOutput) ToCredentialMapOutput() CredentialMapOutput {
	return o
}

func (o CredentialMapOutput) ToCredentialMapOutputWithContext(ctx context.Context) CredentialMapOutput {
	return o
}

func (o CredentialMapOutput) MapIndex(k pulumi.StringInput) CredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Credential {
		return vs[0].(map[string]*Credential)[vs[1].(string)]
	}).(CredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialInput)(nil)).Elem(), &Credential{})
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialArrayInput)(nil)).Elem(), CredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialMapInput)(nil)).Elem(), CredentialMap{})
	pulumi.RegisterOutputType(CredentialOutput{})
	pulumi.RegisterOutputType(CredentialArrayOutput{})
	pulumi.RegisterOutputType(CredentialMapOutput{})
}
