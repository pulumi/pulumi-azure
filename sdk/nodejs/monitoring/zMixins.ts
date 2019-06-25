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

import * as pulumi from "@pulumi/pulumi";
import { TemplateDeployment } from "../core/templateDeployment";
import { Insights } from "../appinsights";

export interface PartPosition {
    x: number,
    y: number,
    colSpan: number,
    rowSpan: number
}

/** @internal */
export interface PartMetadata {
    [key: string]: any,
    parameters(): { [key: string]: { type: string } }
    parameterValues(): { [key: string]: any }
}

export class ApplicationInsightsQueryPartMetadata implements PartMetadata {

    private asset = {
        idInputName: "ComponentId",
        type: "ApplicationInsights"
    };

    private settings = {
        content: {
            Query: ""
        }
    };

    private inputs: { name: string, value: any }[] = [];

    private type = "Extension/AppInsightsExtension/PartType/AnalyticsPart";

    constructor(private insights: Insights, title: string, query: string) {
        this.settings.content.Query = query;

        this.inputs.push({
            name: "ComponentId", value: {
                "SubscriptionId": "[subscription().subscriptionId]",
                "ResourceGroup": "[parameters('ai-resourceGroup')]",
                "Name": "[parameters('ai-name')]",
                "ResourceId": "[parameters('ai-id')]"
            }
        });

        this.inputs.push({ name: "Query", value: query });
        this.inputs.push({ name: "PartTitle", value: title });

    }

    parameters() {
        return {
            "ai-resourceGroup": {type: "string"},
            "ai-name": {type: "string"},
            "ai-id": { type: "string" }
        }
    }

    parameterValues() {
        return {
            "ai-resourceGroup": this.insights.resourceGroupName,
            "ai-name": this.insights.name,
            "ai-id": this.insights.id
        }
    }
}

interface Part {
    position: PartPosition;
    metadata: PartMetadata;
}

export class Lense {
    constructor(public parts: Part[]) { }
}

export interface DashboardArgs {
    /**
     * The name of the resource group in which to
     * create the template deployment.
     */
    readonly resourceGroupName: pulumi.Input<string>;

    /**
    * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
    */
    readonly location?: pulumi.Input<string>;

    /**
    * Specifies the display title for the dashboard.
    */
    readonly title: string;

    readonly lenses: Lense[];
}

export class Dashboard {

    constructor(name: string, args: DashboardArgs) {

        var parameters: any = {};
        var parameterValues: any = {};
        args.lenses.forEach(l => l.parts.forEach(p => {
            parameters = { ...parameters, ...p.metadata.parameters() };
            parameterValues = { ...parameterValues, ...p.metadata.parameterValues() };
        }));

        if (args.location) {
            parameters["location"] = { type: "string" };
            parameterValues["location"] = args.location;
        }

        const lenses: any = {};
        args.lenses.forEach((l, i) => {
            const lense = {
                order: i.toString(),
                parts: <any>{}
            };
            l.parts.forEach((p, pi) => {
                lense.parts[pi.toString()] = p
            });
            lenses[i.toString()] = lense;
        });

        var template = new TemplateDeployment(name, {
            resourceGroupName: args.resourceGroupName,
            templateBody: JSON.stringify({
                "$schema": "https://schema.management.azure.com/schemas/2015-01-01/deploymentTemplate.json#",
                "contentVersion": "1.0.0.0",
                "parameters": parameters,
                "resources": [
                    {
                        "type": "Microsoft.Portal/dashboards",
                        "apiVersion": "2015-08-01-preview",
                        "name": "[concat(uniquestring(resourceGroup().id), 'dashboard')]",
                        "tags": {
                            "hidden-title": args.title
                        },
                        "location": args.location ? "[parameters('location')]" : "[resourceGroup().location]",
                        "properties": {
                            "lenses": lenses,
                            "metadata": this.metadata
                        }
                    }
                ]
            }),
            parameters: parameterValues,
            deploymentMode: "Incremental"
        });
    }

    private metadata = {
        "model": {
            "timeRange": {
                "value": {
                    "relative": {
                        "duration": 24,
                        "timeUnit": 1
                    }
                },
                "type": "MsPortalFx.Composition.Configuration.ValueTypes.TimeRange"
            },
            "filterLocale": {
                "value": "en-us"
            },
            "filters": {
                "value": {
                    "MsPortalFx_TimeRange": {
                        "model": {
                            "format": "utc",
                            "granularity": "auto",
                            "relative": "12h"
                        },
                        "displayCache": {
                            "name": "UTC Time",
                            "value": "Past 12 hours"
                        },
                        "filteredPartIds": [
                        ]
                    }
                }
            }
        }
    }
}