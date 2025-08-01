// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Front Door (standard/premium) Rule.
//
// !> **Note:** The Rules resource **must** include a `dependsOn` meta-argument which references the `cdn.FrontdoorOrigin` and the `cdn.FrontdoorOriginGroup`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cdn"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-cdn-frontdoor"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorProfile, err := cdn.NewFrontdoorProfile(ctx, "example", &cdn.FrontdoorProfileArgs{
//				Name:              pulumi.String("example-profile"),
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Premium_AzureFrontDoor"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorEndpoint, err := cdn.NewFrontdoorEndpoint(ctx, "example", &cdn.FrontdoorEndpointArgs{
//				Name:                  pulumi.String("example-endpoint"),
//				CdnFrontdoorProfileId: exampleFrontdoorProfile.ID(),
//				Tags: pulumi.StringMap{
//					"endpoint": pulumi.String("contoso.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorOriginGroup, err := cdn.NewFrontdoorOriginGroup(ctx, "example", &cdn.FrontdoorOriginGroupArgs{
//				Name:                   pulumi.String("example-originGroup"),
//				CdnFrontdoorProfileId:  exampleFrontdoorProfile.ID(),
//				SessionAffinityEnabled: pulumi.Bool(true),
//				RestoreTrafficTimeToHealedOrNewEndpointInMinutes: pulumi.Int(10),
//				HealthProbe: &cdn.FrontdoorOriginGroupHealthProbeArgs{
//					IntervalInSeconds: pulumi.Int(240),
//					Path:              pulumi.String("/healthProbe"),
//					Protocol:          pulumi.String("Https"),
//					RequestType:       pulumi.String("GET"),
//				},
//				LoadBalancing: &cdn.FrontdoorOriginGroupLoadBalancingArgs{
//					AdditionalLatencyInMilliseconds: pulumi.Int(0),
//					SampleSize:                      pulumi.Int(16),
//					SuccessfulSamplesRequired:       pulumi.Int(3),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorOrigin, err := cdn.NewFrontdoorOrigin(ctx, "example", &cdn.FrontdoorOriginArgs{
//				Name:                        pulumi.String("example-origin"),
//				CdnFrontdoorOriginGroupId:   exampleFrontdoorOriginGroup.ID(),
//				Enabled:                     pulumi.Bool(true),
//				CertificateNameCheckEnabled: pulumi.Bool(false),
//				HostName:                    exampleFrontdoorEndpoint.HostName,
//				HttpPort:                    pulumi.Int(80),
//				HttpsPort:                   pulumi.Int(443),
//				OriginHostHeader:            pulumi.String("contoso.com"),
//				Priority:                    pulumi.Int(1),
//				Weight:                      pulumi.Int(500),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorRuleSet, err := cdn.NewFrontdoorRuleSet(ctx, "example", &cdn.FrontdoorRuleSetArgs{
//				Name:                  pulumi.String("exampleruleset"),
//				CdnFrontdoorProfileId: exampleFrontdoorProfile.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cdn.NewFrontdoorRule(ctx, "example", &cdn.FrontdoorRuleArgs{
//				Name:                  pulumi.String("examplerule"),
//				CdnFrontdoorRuleSetId: exampleFrontdoorRuleSet.ID(),
//				Order:                 pulumi.Int(1),
//				BehaviorOnMatch:       pulumi.String("Continue"),
//				Actions: &cdn.FrontdoorRuleActionsArgs{
//					RouteConfigurationOverrideAction: &cdn.FrontdoorRuleActionsRouteConfigurationOverrideActionArgs{
//						CdnFrontdoorOriginGroupId:  exampleFrontdoorOriginGroup.ID(),
//						ForwardingProtocol:         pulumi.String("HttpsOnly"),
//						QueryStringCachingBehavior: pulumi.String("IncludeSpecifiedQueryStrings"),
//						QueryStringParameters: pulumi.StringArray{
//							pulumi.String("foo"),
//							pulumi.String("clientIp={client_ip}"),
//						},
//						CompressionEnabled: pulumi.Bool(true),
//						CacheBehavior:      pulumi.String("OverrideIfOriginMissing"),
//						CacheDuration:      pulumi.String("365.23:59:59"),
//					},
//					UrlRedirectAction: &cdn.FrontdoorRuleActionsUrlRedirectActionArgs{
//						RedirectType:        pulumi.String("PermanentRedirect"),
//						RedirectProtocol:    pulumi.String("MatchRequest"),
//						QueryString:         pulumi.String("clientIp={client_ip}"),
//						DestinationPath:     pulumi.String("/exampleredirection"),
//						DestinationHostname: pulumi.String("contoso.com"),
//						DestinationFragment: pulumi.String("UrlRedirect"),
//					},
//				},
//				Conditions: &cdn.FrontdoorRuleConditionsArgs{
//					HostNameConditions: cdn.FrontdoorRuleConditionsHostNameConditionArray{
//						&cdn.FrontdoorRuleConditionsHostNameConditionArgs{
//							Operator:        pulumi.String("Equal"),
//							NegateCondition: pulumi.Bool(false),
//							MatchValues: pulumi.StringArray{
//								pulumi.String("www.contoso.com"),
//								pulumi.String("images.contoso.com"),
//								pulumi.String("video.contoso.com"),
//							},
//							Transforms: pulumi.StringArray{
//								pulumi.String("Lowercase"),
//								pulumi.String("Trim"),
//							},
//						},
//					},
//					IsDeviceConditions: cdn.FrontdoorRuleConditionsIsDeviceConditionArray{
//						&cdn.FrontdoorRuleConditionsIsDeviceConditionArgs{
//							Operator:        pulumi.String("Equal"),
//							NegateCondition: pulumi.Bool(false),
//							MatchValues:     pulumi.String("Mobile"),
//						},
//					},
//					PostArgsConditions: cdn.FrontdoorRuleConditionsPostArgsConditionArray{
//						&cdn.FrontdoorRuleConditionsPostArgsConditionArgs{
//							PostArgsName: pulumi.String("customerName"),
//							Operator:     pulumi.String("BeginsWith"),
//							MatchValues: pulumi.StringArray{
//								pulumi.String("J"),
//								pulumi.String("K"),
//							},
//							Transforms: pulumi.StringArray{
//								pulumi.String("Uppercase"),
//							},
//						},
//					},
//					RequestMethodConditions: cdn.FrontdoorRuleConditionsRequestMethodConditionArray{
//						&cdn.FrontdoorRuleConditionsRequestMethodConditionArgs{
//							Operator:        pulumi.String("Equal"),
//							NegateCondition: pulumi.Bool(false),
//							MatchValues: pulumi.StringArray{
//								pulumi.String("DELETE"),
//							},
//						},
//					},
//					UrlFilenameConditions: cdn.FrontdoorRuleConditionsUrlFilenameConditionArray{
//						&cdn.FrontdoorRuleConditionsUrlFilenameConditionArgs{
//							Operator:        pulumi.String("Equal"),
//							NegateCondition: pulumi.Bool(false),
//							MatchValues: pulumi.StringArray{
//								pulumi.String("media.mp4"),
//							},
//							Transforms: pulumi.StringArray{
//								pulumi.String("Lowercase"),
//								pulumi.String("RemoveNulls"),
//								pulumi.String("Trim"),
//							},
//						},
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleFrontdoorOriginGroup,
//				exampleFrontdoorOrigin,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Specifying IP Address Ranges
//
// When specifying IP address ranges in the `socketAddressCondition` and the `remoteAddressCondition` `matchValues` use the following format:
//
// Use `CIDR` notation when specifying IP address blocks. This means that the syntax for an IP address block is the base IP address followed by a forward slash and the prefix size For example:
//
// * `IPv4` example: `5.5.5.64/26` matches any requests that arrive from addresses `5.5.5.64` through `5.5.5.127`.
// * `IPv6` example: `1:2:3:/48` matches any requests that arrive from addresses `1:2:3:0:0:0:0:0` through `1:2:3:ffff:ffff:ffff:ffff:ffff`.
//
// When you specify multiple IP addresses and IP address blocks, `OR` logic is applied.
//
// * `IPv4` example: if you add two IP addresses `1.2.3.4` and `10.20.30.40`, the condition is matched for any requests that arrive from either address `1.2.3.4` or `10.20.30.40`.
// * `IPv6` example: if you add two IP addresses `1:2:3:4:5:6:7:8` and `10:20:30:40:50:60:70:80`, the condition is matched for any requests that arrive from either address `1:2:3:4:5:6:7:8` or `10:20:30:40:50:60:70:80`.
//
// ***
//
// ## Action Server Variables
//
// Rule Set server variables provide access to structured information about the request. You can use server variables to dynamically change the request/response headers or URL rewrite paths/query strings, for example, when a new page load or when a form is posted.
//
// ### Supported Action Server Variables
//
// | Variable name | Description |
// |---------------|-------------|
// | `socketIp`      | The IP address of the direct connection to Front Door Profiles edge. If the client used an HTTP proxy or a load balancer to send the request, the value of `socketIp` is the IP address of the proxy or load balancer. |
// | `clientIp`      | The IP address of the client that made the original request. If there was an `X-Forwarded-For` header in the request, then the client IP address is picked from the header. |
// | `clientPort`    | The IP port of the client that made the request. |
// | `hostname`       | The host name in the request from the client. |
// | `geoCountry`    | Indicates the requester's country/region of origin through its country/region code. |
// | `httpMethod`    | The method used to make the URL request, such as `GET` or `POST`. |
// | `httpVersion`   | The request protocol. Usually `HTTP/1.0`, `HTTP/1.1`, or `HTTP/2.0`. |
// | `queryString`   | The list of variable/value pairs that follows the "?" in the requested URL. For example, in the request `http://contoso.com:8080/article.aspx?id=123&title=fabrikam`, the `queryString` value will be `id=123&title=fabrikam`. |
// | `requestScheme` | The request scheme: `http` or `https`. |
// | `requestUri`    | The full original request URI (with arguments). For example, in the request `http://contoso.com:8080/article.aspx?id=123&title=fabrikam`, the `requestUri` value will be `/article.aspx?id=123&title=fabrikam`. |
// | `sslProtocol`   | The protocol of an established TLS connection. |
// | `serverPort`    | The port of the server that accepted a request. |
// | `urlPath`       | Identifies the specific resource in the host that the web client wants to access. This is the part of the request URI without the arguments. For example, in the request `http://contoso.com:8080/article.aspx?id=123&title=fabrikam`, the `uriPath` value will be `/article.aspx`. |
//
// ### Action Server Variable Format
//
// Server variables can be specified using the following formats:
//
// * `{variable}` - Include the entire server variable. For example, if the client IP address is `111.222.333.444` then the `{client_ip}` token would evaluate to `111.222.333.444`.
//
// * `{variable:offset}` - Include the server variable after a specific offset, until the end of the variable. The offset is zero-based. For example, if the client IP address is `111.222.333.444` then the `{client_ip:3}` token would evaluate to `.222.333.444`.
//
// * `{variable:offset:length}` - Include the server variable after a specific offset, up to the specified length. The offset is zero-based. For example, if the client IP address is `111.222.333.444` then the `{client_ip:4:3}` token would evaluate to `222`.
//
// ### Action Server Variables Support
//
// Action Server variables are supported on the following actions:
//
// * `routeConfigurationOverrideAction`
// * `requestHeaderAction`
// * `responseHeaderAction`
// * `urlRedirectAction`
// * `urlRewriteAction`
//
// ***
//
// ## Condition Operator list
//
// For rules that accept values from the standard operator list, the following operators are valid:
//
// | Operator                   | Description | Condition Value |
// |----------------------------|-------------|-----------------|
// | Any                        |Matches when there is any value, regardless of what it is. | Any |
// | Equal                      | Matches when the value exactly matches the specified string. | Equal |
// | Contains                   | Matches when the value contains the specified string. | Contains |
// | Less Than                  | Matches when the length of the value is less than the specified integer. | LessThan |
// | Greater Than               | Matches when the length of the value is greater than the specified integer. | GreaterThan |
// | Less Than or Equal         | Matches when the length of the value is less than or equal to the specified integer. | LessThanOrEqual |
// | Greater Than or Equal      | Matches when the length of the value is greater than or equal to the specified integer. | GreaterThanOrEqual |
// | Begins With                | Matches when the value begins with the specified string. | BeginsWith |
// | Ends With                  | Matches when the value ends with the specified string. | EndsWith |
// | RegEx                      | Matches when the value matches the specified regular expression. See `Condition Regular Expressions` below for more details. | RegEx |
// | Wildcard                   | Matches when the request path matches a wildcard expression. See `Condition Wildcard Expression` below for more details. | Wildcard |
// | Not Any                    | Matches when there is no value. | Any and negateCondition = true |
// | Not Equal                  | Matches when the value does not match the specified string. | Equal and negateCondition : true |
// | Not Contains               | Matches when the value does not contain the specified string. | Contains and negateCondition = true |
// | Not Less Than              | Matches when the length of the value is not less than the specified integer. | LessThan and negateCondition = true |
// | Not Greater Than           | Matches when the length of the value is not greater than the specified integer. | GreaterThan and negateCondition = true |
// | Not Less Than or Equal     | Matches when the length of the value is not less than or equal to the specified integer. | LessThanOrEqual and negateCondition = true |
// | Not Greater Than or Equals | Matches when the length of the value is not greater than or equal to the specified integer. | GreaterThanOrEqual and negateCondition = true |
// | Not Begins With            | Matches when the value does not begin with the specified string. | BeginsWith and negateCondition = true |
// | Not Ends With              | Matches when the value does not end with the specified string. | EndsWith and negateCondition = true |
// | Not RegEx                  | Matches when the value does not match the specified regular expression. See `Condition Regular Expressions` for more details. | RegEx and negateCondition = true |
// | Not Wildcard               | Matches when the request path does not match a wildcard expression. See `Condition Wildcard Expression` below for more details. | Wildcard and negateCondition = true |
//
// ***
//
// ## Condition Regular Expressions
//
// Regular expressions **don't** support the following operations:
//
// * Backreferences and capturing subexpressions.
// * Arbitrary zero-width assertions.
// * Subroutine references and recursive patterns.
// * Conditional patterns.
// * Backtracking control verbs.
// * The `\C` single-byte directive.
// * The `\R` newline match directive.
// * The `\K` start of match reset directive.
// * Callouts and embedded code.
// * Atomic grouping and possessive quantifiers.
//
// ## Condition Wildcard Expression
//
// A wildcard expression can include the * character to match zero or more characters within the path. For example, the wildcard expression `files/customer*/file.pdf` matches the paths `files/customer1/file.pdf`, `files/customer109/file.pdf`, and `files/customer/file.pdf`, but doesn't match `files/customer2/anotherfile.pdf`.
//
// ***
//
// ## Condition Transform List
//
// For rules that can transform strings, the following transforms are valid:
//
// | Transform   | Description |
// |-------------|-------------|
// | Lowercase   | Converts the string to the lowercase representation. |
// | Uppercase   | Converts the string to the uppercase representation. |
// | Trim        | Trims leading and trailing whitespace from the string. |
// | RemoveNulls | Removes null values from the string. |
// | URLEncode   | URL-encodes the string. |
// | URLDecode   | URL-decodes the string. |
//
// ***
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Cdn`: 2024-09-01
//
// ## Import
//
// Front Door Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cdn/frontdoorRule:FrontdoorRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1/rules/rule1
// ```
type FrontdoorRule struct {
	pulumi.CustomResourceState

	// An `actions` block as defined below.
	Actions FrontdoorRuleActionsOutput `pulumi:"actions"`
	// If this rule is a match should the rules engine continue processing the remaining rules or stop? Possible values are `Continue` and `Stop`. Defaults to `Continue`.
	BehaviorOnMatch pulumi.StringPtrOutput `pulumi:"behaviorOnMatch"`
	// The resource ID of the Front Door Rule Set for this Front Door Rule. Changing this forces a new Front Door Rule to be created.
	CdnFrontdoorRuleSetId pulumi.StringOutput `pulumi:"cdnFrontdoorRuleSetId"`
	// The name of the Front Door Rule Set containing this Front Door Rule.
	CdnFrontdoorRuleSetName pulumi.StringOutput `pulumi:"cdnFrontdoorRuleSetName"`
	// A `conditions` block as defined below.
	Conditions FrontdoorRuleConditionsPtrOutput `pulumi:"conditions"`
	// The name which should be used for this Front Door Rule. Possible values must be between 1 and 260 characters in length, begin with a letter and may contain only letters and numbers. Changing this forces a new Front Door Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The order in which the rules will be applied for the Front Door Endpoint. The order value should be sequential and begin at `1`(e.g. `1`, `2`, `3`...). A Front Door Rule with a lesser order value will be applied before a rule with a greater order value.
	//
	// > **Note:** If the Front Door Rule has an order value of `0` they do not require any conditions and the actions will always be applied.
	Order pulumi.IntOutput `pulumi:"order"`
}

// NewFrontdoorRule registers a new resource with the given unique name, arguments, and options.
func NewFrontdoorRule(ctx *pulumi.Context,
	name string, args *FrontdoorRuleArgs, opts ...pulumi.ResourceOption) (*FrontdoorRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.CdnFrontdoorRuleSetId == nil {
		return nil, errors.New("invalid value for required argument 'CdnFrontdoorRuleSetId'")
	}
	if args.Order == nil {
		return nil, errors.New("invalid value for required argument 'Order'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FrontdoorRule
	err := ctx.RegisterResource("azure:cdn/frontdoorRule:FrontdoorRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFrontdoorRule gets an existing FrontdoorRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFrontdoorRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FrontdoorRuleState, opts ...pulumi.ResourceOption) (*FrontdoorRule, error) {
	var resource FrontdoorRule
	err := ctx.ReadResource("azure:cdn/frontdoorRule:FrontdoorRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FrontdoorRule resources.
type frontdoorRuleState struct {
	// An `actions` block as defined below.
	Actions *FrontdoorRuleActions `pulumi:"actions"`
	// If this rule is a match should the rules engine continue processing the remaining rules or stop? Possible values are `Continue` and `Stop`. Defaults to `Continue`.
	BehaviorOnMatch *string `pulumi:"behaviorOnMatch"`
	// The resource ID of the Front Door Rule Set for this Front Door Rule. Changing this forces a new Front Door Rule to be created.
	CdnFrontdoorRuleSetId *string `pulumi:"cdnFrontdoorRuleSetId"`
	// The name of the Front Door Rule Set containing this Front Door Rule.
	CdnFrontdoorRuleSetName *string `pulumi:"cdnFrontdoorRuleSetName"`
	// A `conditions` block as defined below.
	Conditions *FrontdoorRuleConditions `pulumi:"conditions"`
	// The name which should be used for this Front Door Rule. Possible values must be between 1 and 260 characters in length, begin with a letter and may contain only letters and numbers. Changing this forces a new Front Door Rule to be created.
	Name *string `pulumi:"name"`
	// The order in which the rules will be applied for the Front Door Endpoint. The order value should be sequential and begin at `1`(e.g. `1`, `2`, `3`...). A Front Door Rule with a lesser order value will be applied before a rule with a greater order value.
	//
	// > **Note:** If the Front Door Rule has an order value of `0` they do not require any conditions and the actions will always be applied.
	Order *int `pulumi:"order"`
}

type FrontdoorRuleState struct {
	// An `actions` block as defined below.
	Actions FrontdoorRuleActionsPtrInput
	// If this rule is a match should the rules engine continue processing the remaining rules or stop? Possible values are `Continue` and `Stop`. Defaults to `Continue`.
	BehaviorOnMatch pulumi.StringPtrInput
	// The resource ID of the Front Door Rule Set for this Front Door Rule. Changing this forces a new Front Door Rule to be created.
	CdnFrontdoorRuleSetId pulumi.StringPtrInput
	// The name of the Front Door Rule Set containing this Front Door Rule.
	CdnFrontdoorRuleSetName pulumi.StringPtrInput
	// A `conditions` block as defined below.
	Conditions FrontdoorRuleConditionsPtrInput
	// The name which should be used for this Front Door Rule. Possible values must be between 1 and 260 characters in length, begin with a letter and may contain only letters and numbers. Changing this forces a new Front Door Rule to be created.
	Name pulumi.StringPtrInput
	// The order in which the rules will be applied for the Front Door Endpoint. The order value should be sequential and begin at `1`(e.g. `1`, `2`, `3`...). A Front Door Rule with a lesser order value will be applied before a rule with a greater order value.
	//
	// > **Note:** If the Front Door Rule has an order value of `0` they do not require any conditions and the actions will always be applied.
	Order pulumi.IntPtrInput
}

func (FrontdoorRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorRuleState)(nil)).Elem()
}

type frontdoorRuleArgs struct {
	// An `actions` block as defined below.
	Actions FrontdoorRuleActions `pulumi:"actions"`
	// If this rule is a match should the rules engine continue processing the remaining rules or stop? Possible values are `Continue` and `Stop`. Defaults to `Continue`.
	BehaviorOnMatch *string `pulumi:"behaviorOnMatch"`
	// The resource ID of the Front Door Rule Set for this Front Door Rule. Changing this forces a new Front Door Rule to be created.
	CdnFrontdoorRuleSetId string `pulumi:"cdnFrontdoorRuleSetId"`
	// A `conditions` block as defined below.
	Conditions *FrontdoorRuleConditions `pulumi:"conditions"`
	// The name which should be used for this Front Door Rule. Possible values must be between 1 and 260 characters in length, begin with a letter and may contain only letters and numbers. Changing this forces a new Front Door Rule to be created.
	Name *string `pulumi:"name"`
	// The order in which the rules will be applied for the Front Door Endpoint. The order value should be sequential and begin at `1`(e.g. `1`, `2`, `3`...). A Front Door Rule with a lesser order value will be applied before a rule with a greater order value.
	//
	// > **Note:** If the Front Door Rule has an order value of `0` they do not require any conditions and the actions will always be applied.
	Order int `pulumi:"order"`
}

// The set of arguments for constructing a FrontdoorRule resource.
type FrontdoorRuleArgs struct {
	// An `actions` block as defined below.
	Actions FrontdoorRuleActionsInput
	// If this rule is a match should the rules engine continue processing the remaining rules or stop? Possible values are `Continue` and `Stop`. Defaults to `Continue`.
	BehaviorOnMatch pulumi.StringPtrInput
	// The resource ID of the Front Door Rule Set for this Front Door Rule. Changing this forces a new Front Door Rule to be created.
	CdnFrontdoorRuleSetId pulumi.StringInput
	// A `conditions` block as defined below.
	Conditions FrontdoorRuleConditionsPtrInput
	// The name which should be used for this Front Door Rule. Possible values must be between 1 and 260 characters in length, begin with a letter and may contain only letters and numbers. Changing this forces a new Front Door Rule to be created.
	Name pulumi.StringPtrInput
	// The order in which the rules will be applied for the Front Door Endpoint. The order value should be sequential and begin at `1`(e.g. `1`, `2`, `3`...). A Front Door Rule with a lesser order value will be applied before a rule with a greater order value.
	//
	// > **Note:** If the Front Door Rule has an order value of `0` they do not require any conditions and the actions will always be applied.
	Order pulumi.IntInput
}

func (FrontdoorRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorRuleArgs)(nil)).Elem()
}

type FrontdoorRuleInput interface {
	pulumi.Input

	ToFrontdoorRuleOutput() FrontdoorRuleOutput
	ToFrontdoorRuleOutputWithContext(ctx context.Context) FrontdoorRuleOutput
}

func (*FrontdoorRule) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorRule)(nil)).Elem()
}

func (i *FrontdoorRule) ToFrontdoorRuleOutput() FrontdoorRuleOutput {
	return i.ToFrontdoorRuleOutputWithContext(context.Background())
}

func (i *FrontdoorRule) ToFrontdoorRuleOutputWithContext(ctx context.Context) FrontdoorRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorRuleOutput)
}

// FrontdoorRuleArrayInput is an input type that accepts FrontdoorRuleArray and FrontdoorRuleArrayOutput values.
// You can construct a concrete instance of `FrontdoorRuleArrayInput` via:
//
//	FrontdoorRuleArray{ FrontdoorRuleArgs{...} }
type FrontdoorRuleArrayInput interface {
	pulumi.Input

	ToFrontdoorRuleArrayOutput() FrontdoorRuleArrayOutput
	ToFrontdoorRuleArrayOutputWithContext(context.Context) FrontdoorRuleArrayOutput
}

type FrontdoorRuleArray []FrontdoorRuleInput

func (FrontdoorRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorRule)(nil)).Elem()
}

func (i FrontdoorRuleArray) ToFrontdoorRuleArrayOutput() FrontdoorRuleArrayOutput {
	return i.ToFrontdoorRuleArrayOutputWithContext(context.Background())
}

func (i FrontdoorRuleArray) ToFrontdoorRuleArrayOutputWithContext(ctx context.Context) FrontdoorRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorRuleArrayOutput)
}

// FrontdoorRuleMapInput is an input type that accepts FrontdoorRuleMap and FrontdoorRuleMapOutput values.
// You can construct a concrete instance of `FrontdoorRuleMapInput` via:
//
//	FrontdoorRuleMap{ "key": FrontdoorRuleArgs{...} }
type FrontdoorRuleMapInput interface {
	pulumi.Input

	ToFrontdoorRuleMapOutput() FrontdoorRuleMapOutput
	ToFrontdoorRuleMapOutputWithContext(context.Context) FrontdoorRuleMapOutput
}

type FrontdoorRuleMap map[string]FrontdoorRuleInput

func (FrontdoorRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorRule)(nil)).Elem()
}

func (i FrontdoorRuleMap) ToFrontdoorRuleMapOutput() FrontdoorRuleMapOutput {
	return i.ToFrontdoorRuleMapOutputWithContext(context.Background())
}

func (i FrontdoorRuleMap) ToFrontdoorRuleMapOutputWithContext(ctx context.Context) FrontdoorRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorRuleMapOutput)
}

type FrontdoorRuleOutput struct{ *pulumi.OutputState }

func (FrontdoorRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorRule)(nil)).Elem()
}

func (o FrontdoorRuleOutput) ToFrontdoorRuleOutput() FrontdoorRuleOutput {
	return o
}

func (o FrontdoorRuleOutput) ToFrontdoorRuleOutputWithContext(ctx context.Context) FrontdoorRuleOutput {
	return o
}

// An `actions` block as defined below.
func (o FrontdoorRuleOutput) Actions() FrontdoorRuleActionsOutput {
	return o.ApplyT(func(v *FrontdoorRule) FrontdoorRuleActionsOutput { return v.Actions }).(FrontdoorRuleActionsOutput)
}

// If this rule is a match should the rules engine continue processing the remaining rules or stop? Possible values are `Continue` and `Stop`. Defaults to `Continue`.
func (o FrontdoorRuleOutput) BehaviorOnMatch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FrontdoorRule) pulumi.StringPtrOutput { return v.BehaviorOnMatch }).(pulumi.StringPtrOutput)
}

// The resource ID of the Front Door Rule Set for this Front Door Rule. Changing this forces a new Front Door Rule to be created.
func (o FrontdoorRuleOutput) CdnFrontdoorRuleSetId() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorRule) pulumi.StringOutput { return v.CdnFrontdoorRuleSetId }).(pulumi.StringOutput)
}

// The name of the Front Door Rule Set containing this Front Door Rule.
func (o FrontdoorRuleOutput) CdnFrontdoorRuleSetName() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorRule) pulumi.StringOutput { return v.CdnFrontdoorRuleSetName }).(pulumi.StringOutput)
}

// A `conditions` block as defined below.
func (o FrontdoorRuleOutput) Conditions() FrontdoorRuleConditionsPtrOutput {
	return o.ApplyT(func(v *FrontdoorRule) FrontdoorRuleConditionsPtrOutput { return v.Conditions }).(FrontdoorRuleConditionsPtrOutput)
}

// The name which should be used for this Front Door Rule. Possible values must be between 1 and 260 characters in length, begin with a letter and may contain only letters and numbers. Changing this forces a new Front Door Rule to be created.
func (o FrontdoorRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The order in which the rules will be applied for the Front Door Endpoint. The order value should be sequential and begin at `1`(e.g. `1`, `2`, `3`...). A Front Door Rule with a lesser order value will be applied before a rule with a greater order value.
//
// > **Note:** If the Front Door Rule has an order value of `0` they do not require any conditions and the actions will always be applied.
func (o FrontdoorRuleOutput) Order() pulumi.IntOutput {
	return o.ApplyT(func(v *FrontdoorRule) pulumi.IntOutput { return v.Order }).(pulumi.IntOutput)
}

type FrontdoorRuleArrayOutput struct{ *pulumi.OutputState }

func (FrontdoorRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorRule)(nil)).Elem()
}

func (o FrontdoorRuleArrayOutput) ToFrontdoorRuleArrayOutput() FrontdoorRuleArrayOutput {
	return o
}

func (o FrontdoorRuleArrayOutput) ToFrontdoorRuleArrayOutputWithContext(ctx context.Context) FrontdoorRuleArrayOutput {
	return o
}

func (o FrontdoorRuleArrayOutput) Index(i pulumi.IntInput) FrontdoorRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FrontdoorRule {
		return vs[0].([]*FrontdoorRule)[vs[1].(int)]
	}).(FrontdoorRuleOutput)
}

type FrontdoorRuleMapOutput struct{ *pulumi.OutputState }

func (FrontdoorRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorRule)(nil)).Elem()
}

func (o FrontdoorRuleMapOutput) ToFrontdoorRuleMapOutput() FrontdoorRuleMapOutput {
	return o
}

func (o FrontdoorRuleMapOutput) ToFrontdoorRuleMapOutputWithContext(ctx context.Context) FrontdoorRuleMapOutput {
	return o
}

func (o FrontdoorRuleMapOutput) MapIndex(k pulumi.StringInput) FrontdoorRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FrontdoorRule {
		return vs[0].(map[string]*FrontdoorRule)[vs[1].(string)]
	}).(FrontdoorRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorRuleInput)(nil)).Elem(), &FrontdoorRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorRuleArrayInput)(nil)).Elem(), FrontdoorRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorRuleMapInput)(nil)).Elem(), FrontdoorRuleMap{})
	pulumi.RegisterOutputType(FrontdoorRuleOutput{})
	pulumi.RegisterOutputType(FrontdoorRuleArrayOutput{})
	pulumi.RegisterOutputType(FrontdoorRuleMapOutput{})
}
