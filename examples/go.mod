module github.com/pulumi/pulumi-azure/examples/v3

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.9.3-hashi-auth-subm
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/onsi/ginkgo v1.12.0 // indirect
	github.com/onsi/gomega v1.9.0 // indirect
	github.com/pulumi/pulumi/pkg/v2 v2.0.0
	github.com/stretchr/testify v1.5.1
	gopkg.in/airbrake/gobrake.v2 v2.0.9 // indirect
	gopkg.in/gemnasium/logrus-airbrake-hook.v2 v2.1.2 // indirect
)
