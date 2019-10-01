module github.com/pulumi/pulumi-azure

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.3.0
	github.com/djherbis/times v1.2.0 // indirect
	github.com/gofrs/flock v0.7.1 // indirect
	github.com/grpc-ecosystem/grpc-opentracing v0.0.0-20180507213350-8e809c8a8645 // indirect
	github.com/hashicorp/go-multierror v1.0.0
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
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.2-0.20190403091019-9b3cdde74fbe
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v0.0.0-20190918155011-504a152d02d1
	github.com/zclconf/go-cty => github.com/zclconf/go-cty v1.0.1-0.20190708163926-19588f92a98f
	github.com/zclconf/go-cty-yaml => github.com/zclconf/go-cty-yaml v1.0.1
)

go 1.13
