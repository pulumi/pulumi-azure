// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package appplatform

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Spring Cloud Application.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/appplatform"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := appplatform.LookupSpringCloudApp(ctx, &appplatform.LookupSpringCloudAppArgs{
// 			Name:              azurerm_spring_cloud_app.Example.Name,
// 			ResourceGroupName: azurerm_spring_cloud_app.Example.Resource_group_name,
// 			ServiceName:       azurerm_spring_cloud_app.Example.Service_name,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("springCloudAppId", example.Id)
// 		return nil
// 	})
// }
// ```
func LookupSpringCloudApp(ctx *pulumi.Context, args *LookupSpringCloudAppArgs, opts ...pulumi.InvokeOption) (*LookupSpringCloudAppResult, error) {
	var rv LookupSpringCloudAppResult
	err := ctx.Invoke("azure:appplatform/getSpringCloudApp:getSpringCloudApp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSpringCloudApp.
type LookupSpringCloudAppArgs struct {
	// The name of the Spring Cloud Application.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Spring Cloud Application exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name of the Spring Cloud Service.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getSpringCloudApp.
type LookupSpringCloudAppResult struct {
	// The Fully Qualified DNS Name.
	Fqdn string `pulumi:"fqdn"`
	// Is only https allowed?
	HttpsOnly bool `pulumi:"httpsOnly"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An `identity` block as defined below.
	Identities []GetSpringCloudAppIdentity `pulumi:"identities"`
	// Does the Spring Cloud Application have public endpoint?
	IsPublic bool   `pulumi:"isPublic"`
	Name     string `pulumi:"name"`
	// A `persistentDisk` block as defined below.
	PersistentDisks   []GetSpringCloudAppPersistentDisk `pulumi:"persistentDisks"`
	ResourceGroupName string                            `pulumi:"resourceGroupName"`
	ServiceName       string                            `pulumi:"serviceName"`
	// Is End to End TLS Enabled?
	TlsEnabled bool `pulumi:"tlsEnabled"`
	// The public endpoint of the Spring Cloud Application.
	Url string `pulumi:"url"`
}
