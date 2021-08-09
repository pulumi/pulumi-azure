// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing API Management Gateway.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/apimanagement"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleService, err := apimanagement.LookupService(ctx, &apimanagement.LookupServiceArgs{
// 			Name:              "example-apim",
// 			ResourceGroupName: "example-rg",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = apimanagement.LookupGateway(ctx, &apimanagement.LookupGatewayArgs{
// 			Name:            "example-api-gateway",
// 			ApiManagementId: exampleService.Id,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupGateway(ctx *pulumi.Context, args *LookupGatewayArgs, opts ...pulumi.InvokeOption) (*LookupGatewayResult, error) {
	var rv LookupGatewayResult
	err := ctx.Invoke("azure:apimanagement/getGateway:getGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGateway.
type LookupGatewayArgs struct {
	// The ID of the API Management Service in which the Gateway exists.
	ApiManagementId string `pulumi:"apiManagementId"`
	// The name of the API Management Gateway.
	Name string `pulumi:"name"`
}

// A collection of values returned by getGateway.
type LookupGatewayResult struct {
	ApiManagementId string `pulumi:"apiManagementId"`
	// The description of the API Management Gateway.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A `locationData` block as documented below.
	LocationDatas []GetGatewayLocationData `pulumi:"locationDatas"`
	// A canonical name for the geographic or physical location.
	Name string `pulumi:"name"`
}