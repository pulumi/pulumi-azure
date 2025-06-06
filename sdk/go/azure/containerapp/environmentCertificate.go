// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package containerapp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Container App Environment Certificate.
//
// ## Import
//
// A Container App Environment Certificate can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:containerapp/environmentCertificate:EnvironmentCertificate example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.App/managedEnvironments/myenv/certificates/mycertificate"
// ```
type EnvironmentCertificate struct {
	pulumi.CustomResourceState

	// The Certificate Private Key as a base64 encoded PFX or PEM. Changing this forces a new resource to be created.
	CertificateBlobBase64 pulumi.StringOutput `pulumi:"certificateBlobBase64"`
	// The password for the Certificate. Changing this forces a new resource to be created.
	CertificatePassword pulumi.StringOutput `pulumi:"certificatePassword"`
	// The Container App Managed Environment ID to configure this Certificate on. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId pulumi.StringOutput `pulumi:"containerAppEnvironmentId"`
	// The expiration date for the Certificate.
	ExpirationDate pulumi.StringOutput `pulumi:"expirationDate"`
	// The date of issue for the Certificate.
	IssueDate pulumi.StringOutput `pulumi:"issueDate"`
	// The Certificate Issuer.
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// The name of the Container Apps Environment Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Subject Name for the Certificate.
	SubjectName pulumi.StringOutput `pulumi:"subjectName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The Thumbprint of the Certificate.
	Thumbprint pulumi.StringOutput `pulumi:"thumbprint"`
}

// NewEnvironmentCertificate registers a new resource with the given unique name, arguments, and options.
func NewEnvironmentCertificate(ctx *pulumi.Context,
	name string, args *EnvironmentCertificateArgs, opts ...pulumi.ResourceOption) (*EnvironmentCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateBlobBase64 == nil {
		return nil, errors.New("invalid value for required argument 'CertificateBlobBase64'")
	}
	if args.CertificatePassword == nil {
		return nil, errors.New("invalid value for required argument 'CertificatePassword'")
	}
	if args.ContainerAppEnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'ContainerAppEnvironmentId'")
	}
	if args.CertificatePassword != nil {
		args.CertificatePassword = pulumi.ToSecret(args.CertificatePassword).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"certificatePassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EnvironmentCertificate
	err := ctx.RegisterResource("azure:containerapp/environmentCertificate:EnvironmentCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvironmentCertificate gets an existing EnvironmentCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvironmentCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvironmentCertificateState, opts ...pulumi.ResourceOption) (*EnvironmentCertificate, error) {
	var resource EnvironmentCertificate
	err := ctx.ReadResource("azure:containerapp/environmentCertificate:EnvironmentCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnvironmentCertificate resources.
type environmentCertificateState struct {
	// The Certificate Private Key as a base64 encoded PFX or PEM. Changing this forces a new resource to be created.
	CertificateBlobBase64 *string `pulumi:"certificateBlobBase64"`
	// The password for the Certificate. Changing this forces a new resource to be created.
	CertificatePassword *string `pulumi:"certificatePassword"`
	// The Container App Managed Environment ID to configure this Certificate on. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId *string `pulumi:"containerAppEnvironmentId"`
	// The expiration date for the Certificate.
	ExpirationDate *string `pulumi:"expirationDate"`
	// The date of issue for the Certificate.
	IssueDate *string `pulumi:"issueDate"`
	// The Certificate Issuer.
	Issuer *string `pulumi:"issuer"`
	// The name of the Container Apps Environment Certificate. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The Subject Name for the Certificate.
	SubjectName *string `pulumi:"subjectName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Thumbprint of the Certificate.
	Thumbprint *string `pulumi:"thumbprint"`
}

type EnvironmentCertificateState struct {
	// The Certificate Private Key as a base64 encoded PFX or PEM. Changing this forces a new resource to be created.
	CertificateBlobBase64 pulumi.StringPtrInput
	// The password for the Certificate. Changing this forces a new resource to be created.
	CertificatePassword pulumi.StringPtrInput
	// The Container App Managed Environment ID to configure this Certificate on. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId pulumi.StringPtrInput
	// The expiration date for the Certificate.
	ExpirationDate pulumi.StringPtrInput
	// The date of issue for the Certificate.
	IssueDate pulumi.StringPtrInput
	// The Certificate Issuer.
	Issuer pulumi.StringPtrInput
	// The name of the Container Apps Environment Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The Subject Name for the Certificate.
	SubjectName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The Thumbprint of the Certificate.
	Thumbprint pulumi.StringPtrInput
}

func (EnvironmentCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentCertificateState)(nil)).Elem()
}

type environmentCertificateArgs struct {
	// The Certificate Private Key as a base64 encoded PFX or PEM. Changing this forces a new resource to be created.
	CertificateBlobBase64 string `pulumi:"certificateBlobBase64"`
	// The password for the Certificate. Changing this forces a new resource to be created.
	CertificatePassword string `pulumi:"certificatePassword"`
	// The Container App Managed Environment ID to configure this Certificate on. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId string `pulumi:"containerAppEnvironmentId"`
	// The name of the Container Apps Environment Certificate. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a EnvironmentCertificate resource.
type EnvironmentCertificateArgs struct {
	// The Certificate Private Key as a base64 encoded PFX or PEM. Changing this forces a new resource to be created.
	CertificateBlobBase64 pulumi.StringInput
	// The password for the Certificate. Changing this forces a new resource to be created.
	CertificatePassword pulumi.StringInput
	// The Container App Managed Environment ID to configure this Certificate on. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId pulumi.StringInput
	// The name of the Container Apps Environment Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (EnvironmentCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentCertificateArgs)(nil)).Elem()
}

type EnvironmentCertificateInput interface {
	pulumi.Input

	ToEnvironmentCertificateOutput() EnvironmentCertificateOutput
	ToEnvironmentCertificateOutputWithContext(ctx context.Context) EnvironmentCertificateOutput
}

func (*EnvironmentCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentCertificate)(nil)).Elem()
}

func (i *EnvironmentCertificate) ToEnvironmentCertificateOutput() EnvironmentCertificateOutput {
	return i.ToEnvironmentCertificateOutputWithContext(context.Background())
}

func (i *EnvironmentCertificate) ToEnvironmentCertificateOutputWithContext(ctx context.Context) EnvironmentCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentCertificateOutput)
}

// EnvironmentCertificateArrayInput is an input type that accepts EnvironmentCertificateArray and EnvironmentCertificateArrayOutput values.
// You can construct a concrete instance of `EnvironmentCertificateArrayInput` via:
//
//	EnvironmentCertificateArray{ EnvironmentCertificateArgs{...} }
type EnvironmentCertificateArrayInput interface {
	pulumi.Input

	ToEnvironmentCertificateArrayOutput() EnvironmentCertificateArrayOutput
	ToEnvironmentCertificateArrayOutputWithContext(context.Context) EnvironmentCertificateArrayOutput
}

type EnvironmentCertificateArray []EnvironmentCertificateInput

func (EnvironmentCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentCertificate)(nil)).Elem()
}

func (i EnvironmentCertificateArray) ToEnvironmentCertificateArrayOutput() EnvironmentCertificateArrayOutput {
	return i.ToEnvironmentCertificateArrayOutputWithContext(context.Background())
}

func (i EnvironmentCertificateArray) ToEnvironmentCertificateArrayOutputWithContext(ctx context.Context) EnvironmentCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentCertificateArrayOutput)
}

// EnvironmentCertificateMapInput is an input type that accepts EnvironmentCertificateMap and EnvironmentCertificateMapOutput values.
// You can construct a concrete instance of `EnvironmentCertificateMapInput` via:
//
//	EnvironmentCertificateMap{ "key": EnvironmentCertificateArgs{...} }
type EnvironmentCertificateMapInput interface {
	pulumi.Input

	ToEnvironmentCertificateMapOutput() EnvironmentCertificateMapOutput
	ToEnvironmentCertificateMapOutputWithContext(context.Context) EnvironmentCertificateMapOutput
}

type EnvironmentCertificateMap map[string]EnvironmentCertificateInput

func (EnvironmentCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentCertificate)(nil)).Elem()
}

func (i EnvironmentCertificateMap) ToEnvironmentCertificateMapOutput() EnvironmentCertificateMapOutput {
	return i.ToEnvironmentCertificateMapOutputWithContext(context.Background())
}

func (i EnvironmentCertificateMap) ToEnvironmentCertificateMapOutputWithContext(ctx context.Context) EnvironmentCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentCertificateMapOutput)
}

type EnvironmentCertificateOutput struct{ *pulumi.OutputState }

func (EnvironmentCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentCertificate)(nil)).Elem()
}

func (o EnvironmentCertificateOutput) ToEnvironmentCertificateOutput() EnvironmentCertificateOutput {
	return o
}

func (o EnvironmentCertificateOutput) ToEnvironmentCertificateOutputWithContext(ctx context.Context) EnvironmentCertificateOutput {
	return o
}

// The Certificate Private Key as a base64 encoded PFX or PEM. Changing this forces a new resource to be created.
func (o EnvironmentCertificateOutput) CertificateBlobBase64() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.CertificateBlobBase64 }).(pulumi.StringOutput)
}

// The password for the Certificate. Changing this forces a new resource to be created.
func (o EnvironmentCertificateOutput) CertificatePassword() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.CertificatePassword }).(pulumi.StringOutput)
}

// The Container App Managed Environment ID to configure this Certificate on. Changing this forces a new resource to be created.
func (o EnvironmentCertificateOutput) ContainerAppEnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.ContainerAppEnvironmentId }).(pulumi.StringOutput)
}

// The expiration date for the Certificate.
func (o EnvironmentCertificateOutput) ExpirationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.ExpirationDate }).(pulumi.StringOutput)
}

// The date of issue for the Certificate.
func (o EnvironmentCertificateOutput) IssueDate() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.IssueDate }).(pulumi.StringOutput)
}

// The Certificate Issuer.
func (o EnvironmentCertificateOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// The name of the Container Apps Environment Certificate. Changing this forces a new resource to be created.
func (o EnvironmentCertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Subject Name for the Certificate.
func (o EnvironmentCertificateOutput) SubjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.SubjectName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o EnvironmentCertificateOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The Thumbprint of the Certificate.
func (o EnvironmentCertificateOutput) Thumbprint() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentCertificate) pulumi.StringOutput { return v.Thumbprint }).(pulumi.StringOutput)
}

type EnvironmentCertificateArrayOutput struct{ *pulumi.OutputState }

func (EnvironmentCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentCertificate)(nil)).Elem()
}

func (o EnvironmentCertificateArrayOutput) ToEnvironmentCertificateArrayOutput() EnvironmentCertificateArrayOutput {
	return o
}

func (o EnvironmentCertificateArrayOutput) ToEnvironmentCertificateArrayOutputWithContext(ctx context.Context) EnvironmentCertificateArrayOutput {
	return o
}

func (o EnvironmentCertificateArrayOutput) Index(i pulumi.IntInput) EnvironmentCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnvironmentCertificate {
		return vs[0].([]*EnvironmentCertificate)[vs[1].(int)]
	}).(EnvironmentCertificateOutput)
}

type EnvironmentCertificateMapOutput struct{ *pulumi.OutputState }

func (EnvironmentCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentCertificate)(nil)).Elem()
}

func (o EnvironmentCertificateMapOutput) ToEnvironmentCertificateMapOutput() EnvironmentCertificateMapOutput {
	return o
}

func (o EnvironmentCertificateMapOutput) ToEnvironmentCertificateMapOutputWithContext(ctx context.Context) EnvironmentCertificateMapOutput {
	return o
}

func (o EnvironmentCertificateMapOutput) MapIndex(k pulumi.StringInput) EnvironmentCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnvironmentCertificate {
		return vs[0].(map[string]*EnvironmentCertificate)[vs[1].(string)]
	}).(EnvironmentCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentCertificateInput)(nil)).Elem(), &EnvironmentCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentCertificateArrayInput)(nil)).Elem(), EnvironmentCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentCertificateMapInput)(nil)).Elem(), EnvironmentCertificateMap{})
	pulumi.RegisterOutputType(EnvironmentCertificateOutput{})
	pulumi.RegisterOutputType(EnvironmentCertificateArrayOutput{})
	pulumi.RegisterOutputType(EnvironmentCertificateMapOutput{})
}
