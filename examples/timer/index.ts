import * as azure from '@pulumi/azure';

const resourceGroup = new azure.core.ResourceGroup('example');

new azure.appservice.TimerSubscription('everyminute', {
    resourceGroup,
    nodeVersion: "~22",
    schedule: { second: 0 },
    callback: async (context, args) => {
        console.log(`Timer due at ${args.ScheduleStatus.Last}`);
    }
});
