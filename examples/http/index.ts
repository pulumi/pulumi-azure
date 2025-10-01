import * as azure from '@pulumi/azure';

const resourceGroup = new azure.core.ResourceGroup('example');

const greeting = new azure.appservice.HttpEventSubscription('greeting', {
  resourceGroup,
  nodeVersion: "~22",
  callback: async (context, args) => {
    return {
      status: 200,
      body: `Hello World!`
    };
  }
});

export const url = greeting.url;