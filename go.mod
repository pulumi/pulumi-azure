module github.com/pulumi/pulumi-azure

require (
	github.com/Azure/go-autorest/autorest v0.9.0 // indirect
	github.com/Azure/go-autorest/autorest/azure/auth v0.1.0 // indirect
	github.com/Azure/go-autorest/autorest/azure/cli v0.1.0
	github.com/djherbis/times v1.2.0 // indirect
	github.com/gofrs/flock v0.7.1 // indirect
	github.com/grpc-ecosystem/grpc-opentracing v0.0.0-20180507213350-8e809c8a8645 // indirect
	github.com/hashicorp/terraform v0.12.8
	github.com/opentracing/opentracing-go v1.1.0 // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.1.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20190924145130-e75e14d70f0f
	github.com/reconquest/loreley v0.0.0-20190408221007-9e95b93c818f // indirect
	github.com/stretchr/testify v1.3.1-0.20190311161405-34c6fa2dc709
	github.com/terraform-providers/terraform-provider-azurerm v1.31.0
	github.com/uber/jaeger-client-go v2.16.0+incompatible // indirect
	github.com/uber/jaeger-lib v2.0.0+incompatible // indirect
	golang.org/x/xerrors v0.0.0-20190717185122-a985d3407aa7 // indirect
	gopkg.in/AlecAivazis/survey.v1 v1.8.2 // indirect
	gopkg.in/src-d/go-git.v4 v4.10.0 // indirect
)

replace (
	contrib.go.opencensus.io/exporter/ocagent => contrib.go.opencensus.io/exporter/ocagent v0.4.12
	github.com/Azure/azure-sdk-for-go => github.com/Azure/azure-sdk-for-go v31.1.0+incompatible
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.2-0.20190403091019-9b3cdde74fbe
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v0.0.0-20190827111041-e23ae7e6cb81
)

go 1.13
