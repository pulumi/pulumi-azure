# Ensure to add in a resource name, client ID, and client secret from Azure

import pulumi
from pulumi_azure import containerservice, core


containerservice.KubernetesCluster(
    resource_name='',
    default_node_pool={
        'min_count': 1,
        'max_count': 1,
        'name': '',
        'vm_size': 'Standard_D12_v2',
        'enable_auto_scaling': True
    },
    dns_prefix='devk8s',
    resource_group_name='Dev10',
    service_principal={
        'client_id': '',
        'client_secret': ''
    }
)