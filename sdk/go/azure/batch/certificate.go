// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package batch

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a certificate in an Azure Batch account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/batch"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("testbatch"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("teststorage"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount2, err := batch.NewAccount(ctx, "example", &batch.AccountArgs{
//				Name:                             pulumi.String("testbatchaccount"),
//				ResourceGroupName:                example.Name,
//				Location:                         example.Location,
//				PoolAllocationMode:               pulumi.String("BatchService"),
//				StorageAccountId:                 exampleAccount.ID(),
//				StorageAccountAuthenticationMode: pulumi.String("StorageKeys"),
//				Tags: pulumi.StringMap{
//					"env": pulumi.String("test"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			invokeFilebase64, err := std.Filebase64(ctx, &std.Filebase64Args{
//				Input: "certificate.pfx",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = batch.NewCertificate(ctx, "example", &batch.CertificateArgs{
//				ResourceGroupName:   example.Name,
//				AccountName:         exampleAccount2.Name,
//				Certificate:         pulumi.String(invokeFilebase64.Result),
//				Format:              pulumi.String("Pfx"),
//				Password:            pulumi.String("password"),
//				Thumbprint:          pulumi.String("42C107874FD0E4A9583292A2F1098E8FE4B2EDDA"),
//				ThumbprintAlgorithm: pulumi.String("SHA1"),
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
// * `Microsoft.Batch`: 2024-07-01
//
// ## Import
//
// Batch Certificates can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:batch/certificate:Certificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Batch/batchAccounts/batch1/certificates/certificate1
// ```
type Certificate struct {
	pulumi.CustomResourceState

	// Specifies the name of the Batch account. Changing this forces a new resource to be created.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// The base64-encoded contents of the certificate.
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// The format of the certificate. Possible values are `Cer` or `Pfx`.
	Format pulumi.StringOutput `pulumi:"format"`
	// The generated name of the certificate.
	Name pulumi.StringOutput `pulumi:"name"`
	// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The public key of the certificate.
	PublicData pulumi.StringOutput `pulumi:"publicData"`
	// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The thumbprint of the certificate. Changing this forces a new resource to be created.
	Thumbprint pulumi.StringOutput `pulumi:"thumbprint"`
	// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
	ThumbprintAlgorithm pulumi.StringOutput `pulumi:"thumbprintAlgorithm"`
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.Format == nil {
		return nil, errors.New("invalid value for required argument 'Format'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Thumbprint == nil {
		return nil, errors.New("invalid value for required argument 'Thumbprint'")
	}
	if args.ThumbprintAlgorithm == nil {
		return nil, errors.New("invalid value for required argument 'ThumbprintAlgorithm'")
	}
	if args.Certificate != nil {
		args.Certificate = pulumi.ToSecret(args.Certificate).(pulumi.StringInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"certificate",
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Certificate
	err := ctx.RegisterResource("azure:batch/certificate:Certificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificate gets an existing Certificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateState, opts ...pulumi.ResourceOption) (*Certificate, error) {
	var resource Certificate
	err := ctx.ReadResource("azure:batch/certificate:Certificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certificate resources.
type certificateState struct {
	// Specifies the name of the Batch account. Changing this forces a new resource to be created.
	AccountName *string `pulumi:"accountName"`
	// The base64-encoded contents of the certificate.
	Certificate *string `pulumi:"certificate"`
	// The format of the certificate. Possible values are `Cer` or `Pfx`.
	Format *string `pulumi:"format"`
	// The generated name of the certificate.
	Name *string `pulumi:"name"`
	// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
	Password *string `pulumi:"password"`
	// The public key of the certificate.
	PublicData *string `pulumi:"publicData"`
	// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The thumbprint of the certificate. Changing this forces a new resource to be created.
	Thumbprint *string `pulumi:"thumbprint"`
	// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
	ThumbprintAlgorithm *string `pulumi:"thumbprintAlgorithm"`
}

type CertificateState struct {
	// Specifies the name of the Batch account. Changing this forces a new resource to be created.
	AccountName pulumi.StringPtrInput
	// The base64-encoded contents of the certificate.
	Certificate pulumi.StringPtrInput
	// The format of the certificate. Possible values are `Cer` or `Pfx`.
	Format pulumi.StringPtrInput
	// The generated name of the certificate.
	Name pulumi.StringPtrInput
	// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
	Password pulumi.StringPtrInput
	// The public key of the certificate.
	PublicData pulumi.StringPtrInput
	// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The thumbprint of the certificate. Changing this forces a new resource to be created.
	Thumbprint pulumi.StringPtrInput
	// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
	ThumbprintAlgorithm pulumi.StringPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// Specifies the name of the Batch account. Changing this forces a new resource to be created.
	AccountName string `pulumi:"accountName"`
	// The base64-encoded contents of the certificate.
	Certificate string `pulumi:"certificate"`
	// The format of the certificate. Possible values are `Cer` or `Pfx`.
	Format string `pulumi:"format"`
	// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
	Password *string `pulumi:"password"`
	// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The thumbprint of the certificate. Changing this forces a new resource to be created.
	Thumbprint string `pulumi:"thumbprint"`
	// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
	ThumbprintAlgorithm string `pulumi:"thumbprintAlgorithm"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// Specifies the name of the Batch account. Changing this forces a new resource to be created.
	AccountName pulumi.StringInput
	// The base64-encoded contents of the certificate.
	Certificate pulumi.StringInput
	// The format of the certificate. Possible values are `Cer` or `Pfx`.
	Format pulumi.StringInput
	// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
	Password pulumi.StringPtrInput
	// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The thumbprint of the certificate. Changing this forces a new resource to be created.
	Thumbprint pulumi.StringInput
	// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
	ThumbprintAlgorithm pulumi.StringInput
}

func (CertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateArgs)(nil)).Elem()
}

type CertificateInput interface {
	pulumi.Input

	ToCertificateOutput() CertificateOutput
	ToCertificateOutputWithContext(ctx context.Context) CertificateOutput
}

func (*Certificate) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (i *Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

// CertificateArrayInput is an input type that accepts CertificateArray and CertificateArrayOutput values.
// You can construct a concrete instance of `CertificateArrayInput` via:
//
//	CertificateArray{ CertificateArgs{...} }
type CertificateArrayInput interface {
	pulumi.Input

	ToCertificateArrayOutput() CertificateArrayOutput
	ToCertificateArrayOutputWithContext(context.Context) CertificateArrayOutput
}

type CertificateArray []CertificateInput

func (CertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (i CertificateArray) ToCertificateArrayOutput() CertificateArrayOutput {
	return i.ToCertificateArrayOutputWithContext(context.Background())
}

func (i CertificateArray) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateArrayOutput)
}

// CertificateMapInput is an input type that accepts CertificateMap and CertificateMapOutput values.
// You can construct a concrete instance of `CertificateMapInput` via:
//
//	CertificateMap{ "key": CertificateArgs{...} }
type CertificateMapInput interface {
	pulumi.Input

	ToCertificateMapOutput() CertificateMapOutput
	ToCertificateMapOutputWithContext(context.Context) CertificateMapOutput
}

type CertificateMap map[string]CertificateInput

func (CertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (i CertificateMap) ToCertificateMapOutput() CertificateMapOutput {
	return i.ToCertificateMapOutputWithContext(context.Background())
}

func (i CertificateMap) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateMapOutput)
}

type CertificateOutput struct{ *pulumi.OutputState }

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

// Specifies the name of the Batch account. Changing this forces a new resource to be created.
func (o CertificateOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// The base64-encoded contents of the certificate.
func (o CertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// The format of the certificate. Possible values are `Cer` or `Pfx`.
func (o CertificateOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Format }).(pulumi.StringOutput)
}

// The generated name of the certificate.
func (o CertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password to access the certificate's private key. This can only be specified when `format` is `Pfx`.
func (o CertificateOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The public key of the certificate.
func (o CertificateOutput) PublicData() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.PublicData }).(pulumi.StringOutput)
}

// The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
func (o CertificateOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The thumbprint of the certificate. Changing this forces a new resource to be created.
func (o CertificateOutput) Thumbprint() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Thumbprint }).(pulumi.StringOutput)
}

// The algorithm of the certificate thumbprint. At this time the only supported value is `SHA1`. Changing this forces a new resource to be created.
func (o CertificateOutput) ThumbprintAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.ThumbprintAlgorithm }).(pulumi.StringOutput)
}

type CertificateArrayOutput struct{ *pulumi.OutputState }

func (CertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (o CertificateArrayOutput) ToCertificateArrayOutput() CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) Index(i pulumi.IntInput) CertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].([]*Certificate)[vs[1].(int)]
	}).(CertificateOutput)
}

type CertificateMapOutput struct{ *pulumi.OutputState }

func (CertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (o CertificateMapOutput) ToCertificateMapOutput() CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) MapIndex(k pulumi.StringInput) CertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].(map[string]*Certificate)[vs[1].(string)]
	}).(CertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateInput)(nil)).Elem(), &Certificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateArrayInput)(nil)).Elem(), CertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateMapInput)(nil)).Elem(), CertificateMap{})
	pulumi.RegisterOutputType(CertificateOutput{})
	pulumi.RegisterOutputType(CertificateArrayOutput{})
	pulumi.RegisterOutputType(CertificateMapOutput{})
}
