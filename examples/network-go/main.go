// Copyright 2016-2019, Pulumi Corporation.  All rights reserved.

package main

import (
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		rg, err := core.NewResourceGroup(ctx, "server-rg", &core.ResourceGroupArgs{
			Location: pulumi.String("WestUS"),
		})
		if err != nil {
			return err
		}

		// Create a network and subnet for all VMs.
		vnet, err := network.NewVirtualNetwork(ctx, "server-network", &network.VirtualNetworkArgs{
			ResourceGroupName: rg.Name,
			AddressSpaces:     pulumi.StringArray{pulumi.String("10.0.0.0/16")},
		})
		if err != nil {
			return err
		}

		_, err = network.NewSubnet(ctx, "subnet", &network.SubnetArgs{
			ResourceGroupName:  rg.Name,
			VirtualNetworkName: vnet.Name,
			AddressPrefixes:    pulumi.StringArray{pulumi.String("10.0.0.0/16")},
		})
		if err != nil {
			return err
		}

		return nil
	})
}
