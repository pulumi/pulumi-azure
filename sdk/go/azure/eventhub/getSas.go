// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventhub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Event Hub.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/eventhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEventHubNamespace, err := eventhub.NewEventHubNamespace(ctx, "example", &eventhub.EventHubNamespaceArgs{
//				Name:              pulumi.String("example-ehn"),
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Sku:               pulumi.String("Basic"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEventHub, err := eventhub.NewEventHub(ctx, "example", &eventhub.EventHubArgs{
//				Name:              pulumi.String("example-eh"),
//				NamespaceName:     exampleEventHubNamespace.Name,
//				ResourceGroupName: exampleResourceGroup.Name,
//				PartitionCount:    pulumi.Int(1),
//				MessageRetention:  pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAuthorizationRule, err := eventhub.NewAuthorizationRule(ctx, "example", &eventhub.AuthorizationRuleArgs{
//				Name:              pulumi.String("example-ehar"),
//				NamespaceName:     exampleEventHubNamespace.Name,
//				EventhubName:      exampleEventHub.Name,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Listen:            pulumi.Bool(true),
//				Send:              pulumi.Bool(true),
//				Manage:            pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			example := eventhub.LookupAuthorizationRuleOutput(ctx, eventhub.GetAuthorizationRuleOutputArgs{
//				Name:              exampleAuthorizationRule.Name,
//				NamespaceName:     exampleEventHubNamespace.Name,
//				EventhubName:      exampleEventHub.Name,
//				ResourceGroupName: exampleResourceGroup.Name,
//			}, nil)
//			_ = example.ApplyT(func(example eventhub.GetAuthorizationRuleResult) (eventhub.GetSasResult, error) {
//				return eventhub.GetSasResult(interface{}(eventhub.GetSasOutput(ctx, eventhub.GetSasOutputArgs{
//					ConnectionString: example.PrimaryConnectionString,
//					Expiry:           "2023-06-23T00:00:00Z",
//				}, nil))), nil
//			}).(eventhub.GetSasResultOutput)
//			return nil
//		})
//	}
//
// ```
func GetSas(ctx *pulumi.Context, args *GetSasArgs, opts ...pulumi.InvokeOption) (*GetSasResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSasResult
	err := ctx.Invoke("azure:eventhub/getSas:getSas", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSas.
type GetSasArgs struct {
	// The connection string for the Event Hub to which this SAS applies.
	ConnectionString string `pulumi:"connectionString"`
	// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
	Expiry string `pulumi:"expiry"`
}

// A collection of values returned by getSas.
type GetSasResult struct {
	ConnectionString string `pulumi:"connectionString"`
	Expiry           string `pulumi:"expiry"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The computed Event Hub Shared Access Signature (SAS).
	Sas string `pulumi:"sas"`
}

func GetSasOutput(ctx *pulumi.Context, args GetSasOutputArgs, opts ...pulumi.InvokeOption) GetSasResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSasResultOutput, error) {
			args := v.(GetSasArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:eventhub/getSas:getSas", args, GetSasResultOutput{}, options).(GetSasResultOutput), nil
		}).(GetSasResultOutput)
}

// A collection of arguments for invoking getSas.
type GetSasOutputArgs struct {
	// The connection string for the Event Hub to which this SAS applies.
	ConnectionString pulumi.StringInput `pulumi:"connectionString"`
	// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
	Expiry pulumi.StringInput `pulumi:"expiry"`
}

func (GetSasOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSasArgs)(nil)).Elem()
}

// A collection of values returned by getSas.
type GetSasResultOutput struct{ *pulumi.OutputState }

func (GetSasResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSasResult)(nil)).Elem()
}

func (o GetSasResultOutput) ToGetSasResultOutput() GetSasResultOutput {
	return o
}

func (o GetSasResultOutput) ToGetSasResultOutputWithContext(ctx context.Context) GetSasResultOutput {
	return o
}

func (o GetSasResultOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v GetSasResult) string { return v.ConnectionString }).(pulumi.StringOutput)
}

func (o GetSasResultOutput) Expiry() pulumi.StringOutput {
	return o.ApplyT(func(v GetSasResult) string { return v.Expiry }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSasResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSasResult) string { return v.Id }).(pulumi.StringOutput)
}

// The computed Event Hub Shared Access Signature (SAS).
func (o GetSasResultOutput) Sas() pulumi.StringOutput {
	return o.ApplyT(func(v GetSasResult) string { return v.Sas }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSasResultOutput{})
}
