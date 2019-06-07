// Copyright 2016-2019, Pulumi Corporation.  All rights reserved.

import * as azure from '@pulumi/azure';
import { TableOutputBindingDefinition } from '@pulumi/azure/storage';
import { HttpRequest } from '@pulumi/azure/appservice';

const resourceGroup = new azure.core.ResourceGroup('example', { location: 'West US 2' });

const storageAccount = new azure.storage.Account("storage", {
  resourceGroupName: resourceGroup.name,
  accountReplicationType: "LRS",
  accountTier: "Standard",
});

var peopleOutput: TableOutputBindingDefinition = {
  "tableName": "Person",
  "connection": "StorageConnectionString",
  "name": "person",
  "type": "table",
  "direction": "out"
};

const greeting = new azure.appservice.HttpEventSubscription('greeting', {
  resourceGroup,
  callback: async (context, req: HttpRequest) => {

    context.bindings.person = [];
    context.bindings.person.push({
      PartitionKey: req.query.email,
      RowKey: req.query.email,
      Name: req.query.name
    });

    return {
      status: 200,
      body: `Hello ${req.query.name}!`
    };
  },
  methods: ["GET"],
  account: storageAccount,
  bindings: [peopleOutput],
  appSettings: {
    [peopleOutput.connection]: storageAccount.primaryConnectionString
  }
});

export const greetingUrl = greeting.url;