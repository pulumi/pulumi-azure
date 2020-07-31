# Contributing to Pulumi

Do you want to hack on Pulumi?  Awesome!  We are so happy to have you.

Please refer to the [main Pulumi repo](https://github.com/pulumi/pulumi/)'s [CONTRIBUTING.md file](
https://github.com/pulumi/pulumi/blob/master/CONTRIBUTING.md) for details on how to do so.

## Committing Generated Code

Code generated for Pulumi SDKs should be checked in as part of the pull request containing a
particular change. To generate code after making changes, run `make -f Makefile.github development` from the root of this
repository.

## Running Integration Tests

The examples and integration tests in this repository will create and destroy real Azure
cloud resources while running. Before running these tests, make sure that you have
[configured Pulumi with Azure](https://pulumi.io/install/azure.html) successfully once before.

The only additional step you need to take to run tests in this repo is to set the
`ARM_ENVIRONMENT` environment variable to the ARM environment you'd like to create test resources in.
The integration tests do try to clean up after themselves by deleting everything that was
created, but in the event of bugs or test failures you may need to go into the Azure portal
and delete resources yourself.

Once you have set `ARM_ENVIRONMENT` and configured your Azure credentials, 
`cd examples && go test -v -count=1 -cover -timeout 2h` will run all integration tests.
