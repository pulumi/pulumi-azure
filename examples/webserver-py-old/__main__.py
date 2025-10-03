# Copyright 2016-2020, Pulumi Corporation.  All rights reserved.

from pulumi_azure import core, compute, network

name = "webserver"

resource_group = core.ResourceGroup(name)

net = network.VirtualNetwork(
    name,
    resource_group_name=resource_group.name,
    address_spaces=["10.0.0.0/16"],
    subnets=[{
        "name": "default",
        "address_prefix": "10.0.1.0/24",
    }])

network_interface = network.NetworkInterface(
    name,
    resource_group_name=resource_group.name,
    ip_configurations=[{
        "name": "webserveripcfg",
        "subnet_id": net.subnets.apply(lambda subnets: subnets[0].get("id")),
        "private_ip_address_allocation": "dynamic",
    }])

vm = compute.VirtualMachine(
    "webservervm",
    resource_group_name=resource_group.name,
    network_interface_ids=[network_interface.id],
    vm_size="Standard_A0",
    delete_data_disks_on_termination=True,
    delete_os_disk_on_termination=True,
    os_profile={
        "computer_name": "hostname",
        "admin_username": "testadmin",
        "admin_password": "Password1234!",
    },
    os_profile_linux_config={
        "disable_password_authentication": False,
    },
    storage_os_disk={
        "create_option": "FromImage",
        "name": "myosdisk1",
    },
    storage_image_reference={
        "publisher": "Canonical",
        "offer": "ubuntu-24_04-lts",
        "sku": "minimal",
        "version": "latest",
    })
