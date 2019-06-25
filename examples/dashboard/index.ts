import * as azure from '@pulumi/azure';
import { HttpRequest } from '@pulumi/azure/appservice';

const resourceGroup = new azure.core.ResourceGroup('example', { location: 'West US 2' });

const appInsights = new azure.appinsights.Insights("insights", {
  resourceGroupName: resourceGroup.name,
  applicationType: "Node.JS"
});

const greeting = new azure.appservice.HttpEventSubscription('greeting', {
  resourceGroup,
  appSettings:{
    "APPINSIGHTS_INSTRUMENTATIONKEY": appInsights.instrumentationKey
  },
  callback: async (context, request:HttpRequest) => {
    if(request.query.fail){
      return {
        status: 400,
        body: "failed..."
      };
    }
    return {
      status: 200,
      body: `Hello World!`
    };
  }
});

const dashboard = new azure.monitoring.Dashboard("dashboard", {
resourceGroupName: resourceGroup.name,
title: "cheds pulumi dashboard",
lenses: [
  new azure.monitoring.Lense([
    {
      position:{
        x: 0,
        y: 0,
        colSpan: 6,
        rowSpan: 4
      },
      metadata: new azure.monitoring.ApplicationInsightsQueryPartMetadata(appInsights, "Request statistics", "requests \n| summarize count() by resultCode \n| render piechart \n")
    }
  ])
]
});

export const url = greeting.url;