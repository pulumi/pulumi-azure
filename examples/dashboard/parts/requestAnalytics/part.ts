import * as azure from '@pulumi/azure';
import { dummy } from '@pulumi/azure/appinsights/zMixins';
import query from './query';

console.log(dummy);

export const part = (insights: azure.appinsights.Insights) => {
    return insights.createDashboardPart(
        "Request statistics",
        query,
        [
            {
                name: "ControlType",
                value: "AnalyticsDonut"
            },
            {
                name: "Dimensions",
                value: {
                    xAxis: {
                        name: "resultCode",
                        type: "String"
                    },
                    yAxis: [
                        {
                            name: "count_",
                            type: "Int64"
                        }
                    ],
                    aggregation: "Sum"
                }
            }]);
}