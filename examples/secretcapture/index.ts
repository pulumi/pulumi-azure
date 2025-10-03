import * as pulumi from '@pulumi/pulumi';
import * as azure from '@pulumi/azure';

const resourceGroup = new azure.core.ResourceGroup('example');

const secret = pulumi.secret("s3cr3t");

const greeting = new azure.appservice.HttpEventSubscription('greeting', {
  resourceGroup,
  nodeVersion: "~22",
  callback: async (context, args) => {
    console.log(secret.get());
    return {
      status: 200,
      body: `Hello World!`
    };
  }
});

export const url = greeting.url;