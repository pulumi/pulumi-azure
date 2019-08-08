# Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

import pulumi
from pulumi_azure import core

subscription = pulumi.Output.from_input(core.get_subscription())

pulumi.export('sub-display-name', subscription.display_name)