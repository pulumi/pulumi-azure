module github.com/pulumi/pulumi-azure/examples/v2

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.9.3-hashi-auth-subm
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/pulumi/pulumi/pkg v1.13.1
	github.com/stretchr/testify v1.5.1
)
