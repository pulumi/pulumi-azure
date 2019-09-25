import * as azure from '@pulumi/azure';

const resourceGroup = new azure.core.ResourceGroup("timer-rg");

new azure.appservice.TimerSubscription('everyminute', {
    resourceGroup,
    schedule: { second: 0 },
    callback: async (context, args) => {
        console.log(`Timer due at ${args.ScheduleStatus.Last}`);
    }
});
