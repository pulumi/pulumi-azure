// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package keyvault

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Key Vault Certificate.
//
// ## Example Usage
//
// ### Importing A PFX)
//
// > **Note:** this example assumed the PFX file is located in the same directory at `certificate-to-import.pfx`.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleKeyVault, err := keyvault.NewKeyVault(ctx, "example", &keyvault.KeyVaultArgs{
//				Name:              pulumi.String("examplekeyvault"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				TenantId:          pulumi.String(current.TenantId),
//				SkuName:           pulumi.String("premium"),
//				AccessPolicies: keyvault.KeyVaultAccessPolicyArray{
//					&keyvault.KeyVaultAccessPolicyArgs{
//						TenantId: pulumi.String(current.TenantId),
//						ObjectId: pulumi.String(current.ObjectId),
//						CertificatePermissions: pulumi.StringArray{
//							pulumi.String("Create"),
//							pulumi.String("Delete"),
//							pulumi.String("DeleteIssuers"),
//							pulumi.String("Get"),
//							pulumi.String("GetIssuers"),
//							pulumi.String("Import"),
//							pulumi.String("List"),
//							pulumi.String("ListIssuers"),
//							pulumi.String("ManageContacts"),
//							pulumi.String("ManageIssuers"),
//							pulumi.String("SetIssuers"),
//							pulumi.String("Update"),
//						},
//						KeyPermissions: pulumi.StringArray{
//							pulumi.String("Backup"),
//							pulumi.String("Create"),
//							pulumi.String("Decrypt"),
//							pulumi.String("Delete"),
//							pulumi.String("Encrypt"),
//							pulumi.String("Get"),
//							pulumi.String("Import"),
//							pulumi.String("List"),
//							pulumi.String("Purge"),
//							pulumi.String("Recover"),
//							pulumi.String("Restore"),
//							pulumi.String("Sign"),
//							pulumi.String("UnwrapKey"),
//							pulumi.String("Update"),
//							pulumi.String("Verify"),
//							pulumi.String("WrapKey"),
//						},
//						SecretPermissions: pulumi.StringArray{
//							pulumi.String("Backup"),
//							pulumi.String("Delete"),
//							pulumi.String("Get"),
//							pulumi.String("List"),
//							pulumi.String("Purge"),
//							pulumi.String("Recover"),
//							pulumi.String("Restore"),
//							pulumi.String("Set"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			invokeFilebase64, err := std.Filebase64(ctx, &std.Filebase64Args{
//				Input: "certificate-to-import.pfx",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = keyvault.NewCertificate(ctx, "example", &keyvault.CertificateArgs{
//				Name:       pulumi.String("imported-cert"),
//				KeyVaultId: exampleKeyVault.ID(),
//				Certificate: &keyvault.CertificateCertificateArgs{
//					Contents: pulumi.String(invokeFilebase64.Result),
//					Password: pulumi.String(""),
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
// ### Generating a new certificate
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleKeyVault, err := keyvault.NewKeyVault(ctx, "example", &keyvault.KeyVaultArgs{
//				Name:                    pulumi.String("examplekeyvault"),
//				Location:                example.Location,
//				ResourceGroupName:       example.Name,
//				TenantId:                pulumi.String(current.TenantId),
//				SkuName:                 pulumi.String("standard"),
//				SoftDeleteRetentionDays: pulumi.Int(7),
//				AccessPolicies: keyvault.KeyVaultAccessPolicyArray{
//					&keyvault.KeyVaultAccessPolicyArgs{
//						TenantId: pulumi.String(current.TenantId),
//						ObjectId: pulumi.String(current.ObjectId),
//						CertificatePermissions: pulumi.StringArray{
//							pulumi.String("Create"),
//							pulumi.String("Delete"),
//							pulumi.String("DeleteIssuers"),
//							pulumi.String("Get"),
//							pulumi.String("GetIssuers"),
//							pulumi.String("Import"),
//							pulumi.String("List"),
//							pulumi.String("ListIssuers"),
//							pulumi.String("ManageContacts"),
//							pulumi.String("ManageIssuers"),
//							pulumi.String("Purge"),
//							pulumi.String("SetIssuers"),
//							pulumi.String("Update"),
//						},
//						KeyPermissions: pulumi.StringArray{
//							pulumi.String("Backup"),
//							pulumi.String("Create"),
//							pulumi.String("Decrypt"),
//							pulumi.String("Delete"),
//							pulumi.String("Encrypt"),
//							pulumi.String("Get"),
//							pulumi.String("Import"),
//							pulumi.String("List"),
//							pulumi.String("Purge"),
//							pulumi.String("Recover"),
//							pulumi.String("Restore"),
//							pulumi.String("Sign"),
//							pulumi.String("UnwrapKey"),
//							pulumi.String("Update"),
//							pulumi.String("Verify"),
//							pulumi.String("WrapKey"),
//						},
//						SecretPermissions: pulumi.StringArray{
//							pulumi.String("Backup"),
//							pulumi.String("Delete"),
//							pulumi.String("Get"),
//							pulumi.String("List"),
//							pulumi.String("Purge"),
//							pulumi.String("Recover"),
//							pulumi.String("Restore"),
//							pulumi.String("Set"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = keyvault.NewCertificate(ctx, "example", &keyvault.CertificateArgs{
//				Name:       pulumi.String("generated-cert"),
//				KeyVaultId: exampleKeyVault.ID(),
//				CertificatePolicy: &keyvault.CertificateCertificatePolicyArgs{
//					IssuerParameters: &keyvault.CertificateCertificatePolicyIssuerParametersArgs{
//						Name: pulumi.String("Self"),
//					},
//					KeyProperties: &keyvault.CertificateCertificatePolicyKeyPropertiesArgs{
//						Exportable: pulumi.Bool(true),
//						KeySize:    pulumi.Int(2048),
//						KeyType:    pulumi.String("RSA"),
//						ReuseKey:   pulumi.Bool(true),
//					},
//					LifetimeActions: keyvault.CertificateCertificatePolicyLifetimeActionArray{
//						&keyvault.CertificateCertificatePolicyLifetimeActionArgs{
//							Action: &keyvault.CertificateCertificatePolicyLifetimeActionActionArgs{
//								ActionType: pulumi.String("AutoRenew"),
//							},
//							Trigger: &keyvault.CertificateCertificatePolicyLifetimeActionTriggerArgs{
//								DaysBeforeExpiry: pulumi.Int(30),
//							},
//						},
//					},
//					SecretProperties: &keyvault.CertificateCertificatePolicySecretPropertiesArgs{
//						ContentType: pulumi.String("application/x-pkcs12"),
//					},
//					X509CertificateProperties: &keyvault.CertificateCertificatePolicyX509CertificatePropertiesArgs{
//						ExtendedKeyUsages: pulumi.StringArray{
//							pulumi.String("1.3.6.1.5.5.7.3.1"),
//						},
//						KeyUsages: pulumi.StringArray{
//							pulumi.String("cRLSign"),
//							pulumi.String("dataEncipherment"),
//							pulumi.String("digitalSignature"),
//							pulumi.String("keyAgreement"),
//							pulumi.String("keyCertSign"),
//							pulumi.String("keyEncipherment"),
//						},
//						SubjectAlternativeNames: &keyvault.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs{
//							DnsNames: pulumi.StringArray{
//								pulumi.String("internal.contoso.com"),
//								pulumi.String("domain.hello.world"),
//							},
//						},
//						Subject:          pulumi.String("CN=hello-world"),
//						ValidityInMonths: pulumi.Int(12),
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
// Key Vault Certificates can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:keyvault/certificate:Certificate example "https://example-keyvault.vault.azure.net/certificates/example/fdf067c93bbb4b22bff4d8b7a9a56217"
// ```
type Certificate struct {
	pulumi.CustomResourceState

	// A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
	Certificate CertificateCertificatePtrOutput `pulumi:"certificate"`
	// A `certificateAttribute` block as defined below.
	CertificateAttributes CertificateCertificateAttributeArrayOutput `pulumi:"certificateAttributes"`
	// The raw Key Vault Certificate data represented as a hexadecimal string.
	CertificateData pulumi.StringOutput `pulumi:"certificateData"`
	// The Base64 encoded Key Vault Certificate data.
	CertificateDataBase64 pulumi.StringOutput `pulumi:"certificateDataBase64"`
	// A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
	//
	// > **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
	CertificatePolicy CertificateCertificatePolicyOutput `pulumi:"certificatePolicy"`
	// The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
	KeyVaultId pulumi.StringOutput `pulumi:"keyVaultId"`
	// Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The (Versioned) ID for this Key Vault Certificate. This property points to a specific version of a Key Vault Certificate, as such using this won't auto-rotate values if used in other Azure Services.
	ResourceManagerId pulumi.StringOutput `pulumi:"resourceManagerId"`
	// The Versionless ID of the Key Vault Certificate. This property allows other Azure Services (that support it) to auto-rotate their value when the Key Vault Certificate is updated.
	ResourceManagerVersionlessId pulumi.StringOutput `pulumi:"resourceManagerVersionlessId"`
	// The ID of the associated Key Vault Secret.
	SecretId pulumi.StringOutput `pulumi:"secretId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
	Thumbprint pulumi.StringOutput `pulumi:"thumbprint"`
	// The current version of the Key Vault Certificate.
	Version pulumi.StringOutput `pulumi:"version"`
	// The Base ID of the Key Vault Certificate.
	VersionlessId pulumi.StringOutput `pulumi:"versionlessId"`
	// The Base ID of the Key Vault Secret.
	VersionlessSecretId pulumi.StringOutput `pulumi:"versionlessSecretId"`
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyVaultId == nil {
		return nil, errors.New("invalid value for required argument 'KeyVaultId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("azure:keyvault/certifiate:Certifiate"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Certificate
	err := ctx.RegisterResource("azure:keyvault/certificate:Certificate", name, args, &resource, opts...)
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
	err := ctx.ReadResource("azure:keyvault/certificate:Certificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certificate resources.
type certificateState struct {
	// A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
	Certificate *CertificateCertificate `pulumi:"certificate"`
	// A `certificateAttribute` block as defined below.
	CertificateAttributes []CertificateCertificateAttribute `pulumi:"certificateAttributes"`
	// The raw Key Vault Certificate data represented as a hexadecimal string.
	CertificateData *string `pulumi:"certificateData"`
	// The Base64 encoded Key Vault Certificate data.
	CertificateDataBase64 *string `pulumi:"certificateDataBase64"`
	// A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
	//
	// > **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
	CertificatePolicy *CertificateCertificatePolicy `pulumi:"certificatePolicy"`
	// The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
	KeyVaultId *string `pulumi:"keyVaultId"`
	// Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The (Versioned) ID for this Key Vault Certificate. This property points to a specific version of a Key Vault Certificate, as such using this won't auto-rotate values if used in other Azure Services.
	ResourceManagerId *string `pulumi:"resourceManagerId"`
	// The Versionless ID of the Key Vault Certificate. This property allows other Azure Services (that support it) to auto-rotate their value when the Key Vault Certificate is updated.
	ResourceManagerVersionlessId *string `pulumi:"resourceManagerVersionlessId"`
	// The ID of the associated Key Vault Secret.
	SecretId *string `pulumi:"secretId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
	Thumbprint *string `pulumi:"thumbprint"`
	// The current version of the Key Vault Certificate.
	Version *string `pulumi:"version"`
	// The Base ID of the Key Vault Certificate.
	VersionlessId *string `pulumi:"versionlessId"`
	// The Base ID of the Key Vault Secret.
	VersionlessSecretId *string `pulumi:"versionlessSecretId"`
}

type CertificateState struct {
	// A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
	Certificate CertificateCertificatePtrInput
	// A `certificateAttribute` block as defined below.
	CertificateAttributes CertificateCertificateAttributeArrayInput
	// The raw Key Vault Certificate data represented as a hexadecimal string.
	CertificateData pulumi.StringPtrInput
	// The Base64 encoded Key Vault Certificate data.
	CertificateDataBase64 pulumi.StringPtrInput
	// A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
	//
	// > **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
	CertificatePolicy CertificateCertificatePolicyPtrInput
	// The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
	KeyVaultId pulumi.StringPtrInput
	// Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The (Versioned) ID for this Key Vault Certificate. This property points to a specific version of a Key Vault Certificate, as such using this won't auto-rotate values if used in other Azure Services.
	ResourceManagerId pulumi.StringPtrInput
	// The Versionless ID of the Key Vault Certificate. This property allows other Azure Services (that support it) to auto-rotate their value when the Key Vault Certificate is updated.
	ResourceManagerVersionlessId pulumi.StringPtrInput
	// The ID of the associated Key Vault Secret.
	SecretId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
	Thumbprint pulumi.StringPtrInput
	// The current version of the Key Vault Certificate.
	Version pulumi.StringPtrInput
	// The Base ID of the Key Vault Certificate.
	VersionlessId pulumi.StringPtrInput
	// The Base ID of the Key Vault Secret.
	VersionlessSecretId pulumi.StringPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
	Certificate *CertificateCertificate `pulumi:"certificate"`
	// A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
	//
	// > **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
	CertificatePolicy *CertificateCertificatePolicy `pulumi:"certificatePolicy"`
	// The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
	KeyVaultId string `pulumi:"keyVaultId"`
	// Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
	Certificate CertificateCertificatePtrInput
	// A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
	//
	// > **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
	CertificatePolicy CertificateCertificatePolicyPtrInput
	// The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
	KeyVaultId pulumi.StringInput
	// Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
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

// A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
func (o CertificateOutput) Certificate() CertificateCertificatePtrOutput {
	return o.ApplyT(func(v *Certificate) CertificateCertificatePtrOutput { return v.Certificate }).(CertificateCertificatePtrOutput)
}

// A `certificateAttribute` block as defined below.
func (o CertificateOutput) CertificateAttributes() CertificateCertificateAttributeArrayOutput {
	return o.ApplyT(func(v *Certificate) CertificateCertificateAttributeArrayOutput { return v.CertificateAttributes }).(CertificateCertificateAttributeArrayOutput)
}

// The raw Key Vault Certificate data represented as a hexadecimal string.
func (o CertificateOutput) CertificateData() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.CertificateData }).(pulumi.StringOutput)
}

// The Base64 encoded Key Vault Certificate data.
func (o CertificateOutput) CertificateDataBase64() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.CertificateDataBase64 }).(pulumi.StringOutput)
}

// A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
//
// > **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
func (o CertificateOutput) CertificatePolicy() CertificateCertificatePolicyOutput {
	return o.ApplyT(func(v *Certificate) CertificateCertificatePolicyOutput { return v.CertificatePolicy }).(CertificateCertificatePolicyOutput)
}

// The ID of the Key Vault where the Certificate should be created. Changing this forces a new resource to be created.
func (o CertificateOutput) KeyVaultId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.KeyVaultId }).(pulumi.StringOutput)
}

// Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
func (o CertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The (Versioned) ID for this Key Vault Certificate. This property points to a specific version of a Key Vault Certificate, as such using this won't auto-rotate values if used in other Azure Services.
func (o CertificateOutput) ResourceManagerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.ResourceManagerId }).(pulumi.StringOutput)
}

// The Versionless ID of the Key Vault Certificate. This property allows other Azure Services (that support it) to auto-rotate their value when the Key Vault Certificate is updated.
func (o CertificateOutput) ResourceManagerVersionlessId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.ResourceManagerVersionlessId }).(pulumi.StringOutput)
}

// The ID of the associated Key Vault Secret.
func (o CertificateOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.SecretId }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o CertificateOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
func (o CertificateOutput) Thumbprint() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Thumbprint }).(pulumi.StringOutput)
}

// The current version of the Key Vault Certificate.
func (o CertificateOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

// The Base ID of the Key Vault Certificate.
func (o CertificateOutput) VersionlessId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.VersionlessId }).(pulumi.StringOutput)
}

// The Base ID of the Key Vault Secret.
func (o CertificateOutput) VersionlessSecretId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.VersionlessSecretId }).(pulumi.StringOutput)
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
