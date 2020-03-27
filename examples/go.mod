module github.com/pulumi/pulumi-azure/examples

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.9.3-hashi-auth-subm
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/pulumi/pulumi/pkg v0.0.0-20200325225746-80f1989600a3
	github.com/stretchr/testify v1.5.1
)
