import pulumi
from pulumi_azure import network as nsg


def create_nsg(nsg_name, resource_group_name):
    nsg.NetworkSecurityGroup(
        resource_name=nsg_name,
        resource_group_name=resource_group_name
    )

if __name__ == '__main__':
    create_nsg(nsg_name, resource_group_name)