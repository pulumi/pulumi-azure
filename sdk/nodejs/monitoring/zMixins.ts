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

export interface PartPosition {
    x: number,
    y: number,
    colSpan: number,
    rowSpan: number
}

export interface PartMetadata {
    /** @internal */
    parametrize(partIndex: number): void;
    /** @internal */
    parameters(partIndex: number): { [key: string]: { type: string } }
    /** @internal */
    parameterValues(partIndex: number): { [key: string]: any }
}

export interface Part {
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

    constructor(name: pulumi.Input<string>, args: DashboardArgs) {

        var parameters: any = {};
        var parameterValues: any = {};
        let partIndex = 0;
        args.lenses.forEach(l => l.parts.forEach(p => {
            p.metadata.parametrize(partIndex);
            parameters = { ...parameters, ...p.metadata.parameters(partIndex) };
            parameterValues = { ...parameterValues, ...p.metadata.parameterValues(partIndex) };
            partIndex++;
        }));
        parameters["dashboard-name"] = { type: "string" };
        parameterValues["dashboard-name"] = name;

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

        pulumi.all([name]).apply(([n]) => {
            var template = new TemplateDeployment(n, {
                resourceGroupName: args.resourceGroupName,
                templateBody: JSON.stringify({
                    "$schema": "https://schema.management.azure.com/schemas/2015-01-01/deploymentTemplate.json#",
                    "contentVersion": "1.0.0.0",
                    "parameters": parameters,
                    "resources": [
                        {
                            "type": "Microsoft.Portal/dashboards",
                            "apiVersion": "2015-08-01-preview",
                            "name": "[parameters('dashboard-name')]",
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