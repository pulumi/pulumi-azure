// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package keyvault

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Encrypts or Decrypts a value using a Key Vault Key.
func GetEncryptedValue(ctx *pulumi.Context, args *GetEncryptedValueArgs, opts ...pulumi.InvokeOption) (*GetEncryptedValueResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEncryptedValueResult
	err := ctx.Invoke("azure:keyvault/getEncryptedValue:getEncryptedValue", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncryptedValue.
type GetEncryptedValueArgs struct {
	// The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
	Algorithm string `pulumi:"algorithm"`
	// The Base64 URL Encoded Encrypted Data which should be decrypted into `plainTextValue`.
	EncryptedData *string `pulumi:"encryptedData"`
	// The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
	KeyVaultKeyId string `pulumi:"keyVaultKeyId"`
	// The plain-text value which should be Encrypted into `encryptedData`.
	//
	// > **Note:** One of either `encryptedData` or `plainTextValue` must be specified and is used to populate the encrypted/decrypted value for the other field.
	PlainTextValue *string `pulumi:"plainTextValue"`
}

// A collection of values returned by getEncryptedValue.
type GetEncryptedValueResult struct {
	Algorithm string `pulumi:"algorithm"`
	// The Base64URL decoded string of `plainTextValue`. Because the API would remove padding characters of `plainTextValue` when encrypting, this attribute is useful to get the original value.
	DecodedPlainTextValue string  `pulumi:"decodedPlainTextValue"`
	EncryptedData         *string `pulumi:"encryptedData"`
	// The provider-assigned unique ID for this managed resource.
	Id             string  `pulumi:"id"`
	KeyVaultKeyId  string  `pulumi:"keyVaultKeyId"`
	PlainTextValue *string `pulumi:"plainTextValue"`
}

func GetEncryptedValueOutput(ctx *pulumi.Context, args GetEncryptedValueOutputArgs, opts ...pulumi.InvokeOption) GetEncryptedValueResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEncryptedValueResultOutput, error) {
			args := v.(GetEncryptedValueArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:keyvault/getEncryptedValue:getEncryptedValue", args, GetEncryptedValueResultOutput{}, options).(GetEncryptedValueResultOutput), nil
		}).(GetEncryptedValueResultOutput)
}

// A collection of arguments for invoking getEncryptedValue.
type GetEncryptedValueOutputArgs struct {
	// The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
	Algorithm pulumi.StringInput `pulumi:"algorithm"`
	// The Base64 URL Encoded Encrypted Data which should be decrypted into `plainTextValue`.
	EncryptedData pulumi.StringPtrInput `pulumi:"encryptedData"`
	// The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
	KeyVaultKeyId pulumi.StringInput `pulumi:"keyVaultKeyId"`
	// The plain-text value which should be Encrypted into `encryptedData`.
	//
	// > **Note:** One of either `encryptedData` or `plainTextValue` must be specified and is used to populate the encrypted/decrypted value for the other field.
	PlainTextValue pulumi.StringPtrInput `pulumi:"plainTextValue"`
}

func (GetEncryptedValueOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEncryptedValueArgs)(nil)).Elem()
}

// A collection of values returned by getEncryptedValue.
type GetEncryptedValueResultOutput struct{ *pulumi.OutputState }

func (GetEncryptedValueResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEncryptedValueResult)(nil)).Elem()
}

func (o GetEncryptedValueResultOutput) ToGetEncryptedValueResultOutput() GetEncryptedValueResultOutput {
	return o
}

func (o GetEncryptedValueResultOutput) ToGetEncryptedValueResultOutputWithContext(ctx context.Context) GetEncryptedValueResultOutput {
	return o
}

func (o GetEncryptedValueResultOutput) Algorithm() pulumi.StringOutput {
	return o.ApplyT(func(v GetEncryptedValueResult) string { return v.Algorithm }).(pulumi.StringOutput)
}

// The Base64URL decoded string of `plainTextValue`. Because the API would remove padding characters of `plainTextValue` when encrypting, this attribute is useful to get the original value.
func (o GetEncryptedValueResultOutput) DecodedPlainTextValue() pulumi.StringOutput {
	return o.ApplyT(func(v GetEncryptedValueResult) string { return v.DecodedPlainTextValue }).(pulumi.StringOutput)
}

func (o GetEncryptedValueResultOutput) EncryptedData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEncryptedValueResult) *string { return v.EncryptedData }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEncryptedValueResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEncryptedValueResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEncryptedValueResultOutput) KeyVaultKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetEncryptedValueResult) string { return v.KeyVaultKeyId }).(pulumi.StringOutput)
}

func (o GetEncryptedValueResultOutput) PlainTextValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEncryptedValueResult) *string { return v.PlainTextValue }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEncryptedValueResultOutput{})
}
