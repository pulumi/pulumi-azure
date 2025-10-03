# Install Pulumi and plugins required at build time.
install_plugins: .make/install_plugins
.make/install_plugins: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
.make/install_plugins:
	pulumi plugin install resource random 4.16.1
	pulumi plugin install resource azuread 5.48.0
	pulumi plugin install resource time 0.0.17
	pulumi plugin install resource local 0.0.1
	pulumi plugin install resource std 1.6.2
	pulumi plugin install converter terraform 1.0.16
	@touch $@
.PHONY: install_plugins
