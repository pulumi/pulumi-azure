module github.com/pulumi/pulumi-azure

go 1.12

require (
	git.apache.org/thrift.git v0.12.0 // indirect
	github.com/Azure/go-autorest/autorest v0.8.0 // indirect
	github.com/Azure/go-autorest/autorest/azure/auth v0.1.0 // indirect
	github.com/Azure/go-autorest/autorest/azure/cli v0.1.0
	github.com/Azure/go-autorest/autorest/to v0.2.0 // indirect
	github.com/Azure/go-autorest/autorest/validation v0.1.0 // indirect
	github.com/Nvveen/Gotty v0.0.0-20170406111628-a8b993ba6abd // indirect
	github.com/chzyer/logex v1.1.11-0.20160617073814-96a4d311aa9b // indirect
	github.com/coreos/bbolt v1.3.1-coreos.1 // indirect
	github.com/djherbis/times v1.2.0 // indirect
	github.com/go-ini/ini v1.31.0 // indirect
	github.com/gofrs/flock v0.7.1 // indirect
	github.com/gopherjs/gopherjs v0.0.0-20181103185306-d547d1d9531e // indirect
	github.com/grpc-ecosystem/grpc-opentracing v0.0.0-20180507213350-8e809c8a8645 // indirect
	github.com/hashicorp/aws-sdk-go-base v0.3.0 // indirect
	github.com/hashicorp/terraform v0.12.6
	github.com/opentracing/opentracing-go v1.1.0 // indirect
	github.com/pelletier/go-toml v1.3.0 // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.0.0-beta.2
	github.com/pulumi/pulumi-terraform v0.18.4-0.20190816182908-14e049b09dcf
	github.com/reconquest/loreley v0.0.0-20190408221007-9e95b93c818f // indirect
	github.com/smartystreets/assertions v0.0.0-20190116191733-b6c0e53d7304 // indirect
	github.com/stretchr/testify v1.3.1-0.20190311161405-34c6fa2dc709
	github.com/terraform-providers/terraform-provider-azurerm v1.31.0
	github.com/uber/jaeger-client-go v2.16.0+incompatible // indirect
	github.com/uber/jaeger-lib v2.0.0+incompatible // indirect
	golang.org/x/build v0.0.0-20190314133821-5284462c4bec // indirect
	gopkg.in/AlecAivazis/survey.v1 v1.8.2 // indirect
	gopkg.in/src-d/go-git.v4 v4.10.0 // indirect
	gopkg.in/vmihailenco/msgpack.v2 v2.9.1 // indirect
	labix.org/v2/mgo v0.0.0-20140701140051-000000000287 // indirect
	launchpad.net/gocheck v0.0.0-20140225173054-000000000087 // indirect
)

replace (
	contrib.go.opencensus.io/exporter/ocagent => contrib.go.opencensus.io/exporter/ocagent v0.4.12
	github.com/Azure/azure-sdk-for-go => github.com/Azure/azure-sdk-for-go v31.1.0+incompatible
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.2-0.20190403091019-9b3cdde74fbe
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v0.0.0-20190802205635-509cc1c361f3
)
