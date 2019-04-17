module github.com/pulumi/pulumi-azure

go 1.12

require (
	git.apache.org/thrift.git v0.12.0 // indirect
	github.com/djherbis/times v1.2.0 // indirect
	github.com/gofrs/flock v0.7.1 // indirect
	github.com/googleapis/gax-go v2.0.2+incompatible // indirect
	github.com/grpc-ecosystem/grpc-opentracing v0.0.0-20180507213350-8e809c8a8645 // indirect
	github.com/hashicorp/terraform v0.12.0-alpha4.0.20190401213546-16778fea9219
	github.com/opentracing/opentracing-go v1.1.0 // indirect
	github.com/pelletier/go-toml v1.3.0 // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v0.17.6-0.20190410045519-ef5e148a73c0
	github.com/pulumi/pulumi-terraform v0.14.1-dev.0.20190410175858-788550dffb09
	github.com/reconquest/loreley v0.0.0-20190408221007-9e95b93c818f // indirect
	github.com/spf13/cast v1.3.0 // indirect
	github.com/stretchr/testify v1.3.0
	github.com/terraform-providers/terraform-provider-azurerm v1.24.0
	github.com/uber/jaeger-client-go v2.16.0+incompatible // indirect
	github.com/uber/jaeger-lib v2.0.0+incompatible // indirect
	gopkg.in/AlecAivazis/survey.v1 v1.8.2 // indirect
	gopkg.in/src-d/go-git.v4 v4.10.0 // indirect
)

replace (
	contrib.go.opencensus.io/exporter/ocagent => contrib.go.opencensus.io/exporter/ocagent v0.4.12
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.2-0.20190403091019-9b3cdde74fbe
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v0.0.0-20190411072213-10e8f9c34cd8
)
