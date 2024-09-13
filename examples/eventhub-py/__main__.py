# Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

import pulumi
from pulumi_azure import core, eventhub
resource_group = core.ResourceGroup('eventhub-py-example', location='WestUS')

namespace = eventhub.EventHubNamespace('eventhub-py-eg',
    resource_group_name=resource_group.name,
    sku="Standard")

eventhub = eventhub.EventHub('eventhub-py-eg',
    resource_group_name=resource_group.name,
    namespace_name=namespace.name,
    partition_count=2,
    message_retention=7)

pulumi.export('eventhub-name', eventhub.name)
