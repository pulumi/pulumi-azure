// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import { PartMetadata, Part, PartPosition } from '../monitoring';
import { Insights } from './insights';

class ApplicationInsightsQueryPartMetadata implements PartMetadata {

    private insights: () => Insights;

    private asset = {
        idInputName: "ComponentId",
        type: "ApplicationInsights"
    };

    private settings = {
        content: {
            Query: ""
        }
    };

    private type = "Extension/AppInsightsExtension/PartType/AnalyticsPart";

    /** @internal */
    constructor(
        insights: Insights,
        private title: string,
        private query: string,
        private inputs?: { name: string, value: any }[]) {
            this.insights = () => insights;
    }

    /** @internal */
    parametrize(partIndex: number) {
        this.settings.content.Query = this.query;

        this.inputs = this.inputs || [];
        this.inputs.push({
            name: "ComponentId", value: {
                "SubscriptionId": "[subscription().subscriptionId]",
                "ResourceGroup": `[parameters('ai-rg-${partIndex}')]`,
                "Name": `[parameters('ai-name-${partIndex}')]`,
                "ResourceId": `[parameters('ai-id-${partIndex}')]`
            }
        });

        this.inputs.push({ name: "Query", value: this.query });
        this.inputs.push({ name: "PartTitle", value: this.title });
    }

    /** @internal */
    parameters(partIndex: number) {
        const paramerts: any = {};
        paramerts[`ai-rg-${partIndex}`] = { type: "string" };
        paramerts[`ai-name-${partIndex}`] = { type: "string" };
        paramerts[`ai-id-${partIndex}`] = { type: "string" };
        return paramerts;
    }

    /** @internal */
    parameterValues(partIndex: number) {
        const paramerts: any = {};
        paramerts[`ai-rg-${partIndex}`] = this.insights().resourceGroupName;
        paramerts[`ai-name-${partIndex}`] = this.insights().name;
        paramerts[`ai-id-${partIndex}`] = this.insights().id;
        return paramerts;
    }
}

declare module "./insights" {
    interface Insights {
        /**
         * Creates a new dashboard part to be used as a tile in Azure dashboards, based
         * on a query into the data of this Application Insights account
         */
        createDashboardPart(title: string, query: string, inputs?: { name: string, value: any }[], position?: PartPosition): Part;
    }
}

Insights.prototype.createDashboardPart = function (this: Insights, title: string, query: string, inputs?: { name: string, value: any }[], position?: PartPosition): Part {
    position = position || {
        x: 0,
        y: 0,
        rowSpan: 4,
        colSpan: 5
    }
    return {
        position,
        metadata: new ApplicationInsightsQueryPartMetadata(this, title, query, inputs)
    }
}

export const dummy = 3;