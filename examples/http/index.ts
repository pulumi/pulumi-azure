import * as azure from '@pulumi/azure'

const resourceGroup = new azure.core.ResourceGroup('example', { location: 'West US 2' })

const greeting = new azure.appservice.HttpEventSubscription('greeting', {
  resourceGroup,
  callback: async (context, args) => {
    return {
      status: 200,
      body: `Hello ${args.body.name || 'World'}!`
    }
  }
})

export const url = greeting.url