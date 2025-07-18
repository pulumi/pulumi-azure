// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package core

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages Portal Tenant Configuration.
//
// > **Note:** User has to be `Contributor` or `Owner` at scope `/` for managing this resource.
//
// > **Note:** The Service Principal with Tenant Admin can be created by `az ad sp create-for-rbac --name "<sp name>" --role="Contributor" --scopes="/"`.
//
// > **Note:** The Service Principal can be granted Tenant Admin permission by `az role assignment create --assignee "<app id>" --role "Contributor" --scope "/"`.
//
// > **Note:** While assigning the role to the existing/new Service Principal at the Tenant Scope, the user assigning role must already have the `Owner` role assigned at the Tenant Scope.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := core.NewPortalTenantConfiguration(ctx, "example", &core.PortalTenantConfigurationArgs{
//				PrivateMarkdownStorageEnforced: pulumi.Bool(true),
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
// * `Microsoft.Portal`: 2019-01-01-preview
//
// ## Import
//
// Portal Tenant Configurations can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:core/portalTenantConfiguration:PortalTenantConfiguration example /providers/Microsoft.Portal/tenantConfigurations/default
// ```
type PortalTenantConfiguration struct {
	pulumi.CustomResourceState

	// Is the private tile markdown storage which used to display custom dynamic and static content enabled?
	//
	// > **Note:** When `privateMarkdownStorageEnforced` is set to `true`, only external storage configuration (URI) is allowed for Markdown tiles. Inline content configuration will be prohibited.
	PrivateMarkdownStorageEnforced pulumi.BoolOutput `pulumi:"privateMarkdownStorageEnforced"`
}

// NewPortalTenantConfiguration registers a new resource with the given unique name, arguments, and options.
func NewPortalTenantConfiguration(ctx *pulumi.Context,
	name string, args *PortalTenantConfigurationArgs, opts ...pulumi.ResourceOption) (*PortalTenantConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PrivateMarkdownStorageEnforced == nil {
		return nil, errors.New("invalid value for required argument 'PrivateMarkdownStorageEnforced'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PortalTenantConfiguration
	err := ctx.RegisterResource("azure:core/portalTenantConfiguration:PortalTenantConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPortalTenantConfiguration gets an existing PortalTenantConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPortalTenantConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PortalTenantConfigurationState, opts ...pulumi.ResourceOption) (*PortalTenantConfiguration, error) {
	var resource PortalTenantConfiguration
	err := ctx.ReadResource("azure:core/portalTenantConfiguration:PortalTenantConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PortalTenantConfiguration resources.
type portalTenantConfigurationState struct {
	// Is the private tile markdown storage which used to display custom dynamic and static content enabled?
	//
	// > **Note:** When `privateMarkdownStorageEnforced` is set to `true`, only external storage configuration (URI) is allowed for Markdown tiles. Inline content configuration will be prohibited.
	PrivateMarkdownStorageEnforced *bool `pulumi:"privateMarkdownStorageEnforced"`
}

type PortalTenantConfigurationState struct {
	// Is the private tile markdown storage which used to display custom dynamic and static content enabled?
	//
	// > **Note:** When `privateMarkdownStorageEnforced` is set to `true`, only external storage configuration (URI) is allowed for Markdown tiles. Inline content configuration will be prohibited.
	PrivateMarkdownStorageEnforced pulumi.BoolPtrInput
}

func (PortalTenantConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*portalTenantConfigurationState)(nil)).Elem()
}

type portalTenantConfigurationArgs struct {
	// Is the private tile markdown storage which used to display custom dynamic and static content enabled?
	//
	// > **Note:** When `privateMarkdownStorageEnforced` is set to `true`, only external storage configuration (URI) is allowed for Markdown tiles. Inline content configuration will be prohibited.
	PrivateMarkdownStorageEnforced bool `pulumi:"privateMarkdownStorageEnforced"`
}

// The set of arguments for constructing a PortalTenantConfiguration resource.
type PortalTenantConfigurationArgs struct {
	// Is the private tile markdown storage which used to display custom dynamic and static content enabled?
	//
	// > **Note:** When `privateMarkdownStorageEnforced` is set to `true`, only external storage configuration (URI) is allowed for Markdown tiles. Inline content configuration will be prohibited.
	PrivateMarkdownStorageEnforced pulumi.BoolInput
}

func (PortalTenantConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*portalTenantConfigurationArgs)(nil)).Elem()
}

type PortalTenantConfigurationInput interface {
	pulumi.Input

	ToPortalTenantConfigurationOutput() PortalTenantConfigurationOutput
	ToPortalTenantConfigurationOutputWithContext(ctx context.Context) PortalTenantConfigurationOutput
}

func (*PortalTenantConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**PortalTenantConfiguration)(nil)).Elem()
}

func (i *PortalTenantConfiguration) ToPortalTenantConfigurationOutput() PortalTenantConfigurationOutput {
	return i.ToPortalTenantConfigurationOutputWithContext(context.Background())
}

func (i *PortalTenantConfiguration) ToPortalTenantConfigurationOutputWithContext(ctx context.Context) PortalTenantConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortalTenantConfigurationOutput)
}

// PortalTenantConfigurationArrayInput is an input type that accepts PortalTenantConfigurationArray and PortalTenantConfigurationArrayOutput values.
// You can construct a concrete instance of `PortalTenantConfigurationArrayInput` via:
//
//	PortalTenantConfigurationArray{ PortalTenantConfigurationArgs{...} }
type PortalTenantConfigurationArrayInput interface {
	pulumi.Input

	ToPortalTenantConfigurationArrayOutput() PortalTenantConfigurationArrayOutput
	ToPortalTenantConfigurationArrayOutputWithContext(context.Context) PortalTenantConfigurationArrayOutput
}

type PortalTenantConfigurationArray []PortalTenantConfigurationInput

func (PortalTenantConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PortalTenantConfiguration)(nil)).Elem()
}

func (i PortalTenantConfigurationArray) ToPortalTenantConfigurationArrayOutput() PortalTenantConfigurationArrayOutput {
	return i.ToPortalTenantConfigurationArrayOutputWithContext(context.Background())
}

func (i PortalTenantConfigurationArray) ToPortalTenantConfigurationArrayOutputWithContext(ctx context.Context) PortalTenantConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortalTenantConfigurationArrayOutput)
}

// PortalTenantConfigurationMapInput is an input type that accepts PortalTenantConfigurationMap and PortalTenantConfigurationMapOutput values.
// You can construct a concrete instance of `PortalTenantConfigurationMapInput` via:
//
//	PortalTenantConfigurationMap{ "key": PortalTenantConfigurationArgs{...} }
type PortalTenantConfigurationMapInput interface {
	pulumi.Input

	ToPortalTenantConfigurationMapOutput() PortalTenantConfigurationMapOutput
	ToPortalTenantConfigurationMapOutputWithContext(context.Context) PortalTenantConfigurationMapOutput
}

type PortalTenantConfigurationMap map[string]PortalTenantConfigurationInput

func (PortalTenantConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PortalTenantConfiguration)(nil)).Elem()
}

func (i PortalTenantConfigurationMap) ToPortalTenantConfigurationMapOutput() PortalTenantConfigurationMapOutput {
	return i.ToPortalTenantConfigurationMapOutputWithContext(context.Background())
}

func (i PortalTenantConfigurationMap) ToPortalTenantConfigurationMapOutputWithContext(ctx context.Context) PortalTenantConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortalTenantConfigurationMapOutput)
}

type PortalTenantConfigurationOutput struct{ *pulumi.OutputState }

func (PortalTenantConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PortalTenantConfiguration)(nil)).Elem()
}

func (o PortalTenantConfigurationOutput) ToPortalTenantConfigurationOutput() PortalTenantConfigurationOutput {
	return o
}

func (o PortalTenantConfigurationOutput) ToPortalTenantConfigurationOutputWithContext(ctx context.Context) PortalTenantConfigurationOutput {
	return o
}

// Is the private tile markdown storage which used to display custom dynamic and static content enabled?
//
// > **Note:** When `privateMarkdownStorageEnforced` is set to `true`, only external storage configuration (URI) is allowed for Markdown tiles. Inline content configuration will be prohibited.
func (o PortalTenantConfigurationOutput) PrivateMarkdownStorageEnforced() pulumi.BoolOutput {
	return o.ApplyT(func(v *PortalTenantConfiguration) pulumi.BoolOutput { return v.PrivateMarkdownStorageEnforced }).(pulumi.BoolOutput)
}

type PortalTenantConfigurationArrayOutput struct{ *pulumi.OutputState }

func (PortalTenantConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PortalTenantConfiguration)(nil)).Elem()
}

func (o PortalTenantConfigurationArrayOutput) ToPortalTenantConfigurationArrayOutput() PortalTenantConfigurationArrayOutput {
	return o
}

func (o PortalTenantConfigurationArrayOutput) ToPortalTenantConfigurationArrayOutputWithContext(ctx context.Context) PortalTenantConfigurationArrayOutput {
	return o
}

func (o PortalTenantConfigurationArrayOutput) Index(i pulumi.IntInput) PortalTenantConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PortalTenantConfiguration {
		return vs[0].([]*PortalTenantConfiguration)[vs[1].(int)]
	}).(PortalTenantConfigurationOutput)
}

type PortalTenantConfigurationMapOutput struct{ *pulumi.OutputState }

func (PortalTenantConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PortalTenantConfiguration)(nil)).Elem()
}

func (o PortalTenantConfigurationMapOutput) ToPortalTenantConfigurationMapOutput() PortalTenantConfigurationMapOutput {
	return o
}

func (o PortalTenantConfigurationMapOutput) ToPortalTenantConfigurationMapOutputWithContext(ctx context.Context) PortalTenantConfigurationMapOutput {
	return o
}

func (o PortalTenantConfigurationMapOutput) MapIndex(k pulumi.StringInput) PortalTenantConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PortalTenantConfiguration {
		return vs[0].(map[string]*PortalTenantConfiguration)[vs[1].(string)]
	}).(PortalTenantConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PortalTenantConfigurationInput)(nil)).Elem(), &PortalTenantConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortalTenantConfigurationArrayInput)(nil)).Elem(), PortalTenantConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortalTenantConfigurationMapInput)(nil)).Elem(), PortalTenantConfigurationMap{})
	pulumi.RegisterOutputType(PortalTenantConfigurationOutput{})
	pulumi.RegisterOutputType(PortalTenantConfigurationArrayOutput{})
	pulumi.RegisterOutputType(PortalTenantConfigurationMapOutput{})
}
