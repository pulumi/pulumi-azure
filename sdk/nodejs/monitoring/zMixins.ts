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

    /**
     * Specifies the lenses that form the actual dashboard content
     */
    readonly lenses: Lense[];
}

class DashboardPart extends pulumi.ComponentResource {
    constructor(part: Part, index: number, lense: DashboardLense) {
        const name = lense.name + "-part-" + index;
        super("azure:monitoring:DashboardPart", name, { parent: lense });

        this.name = name;
        this.index = index;
        this.template = part;

        this.registerOutputs({ name: this.name, index: this.index, template: this.template });
    }

    public readonly name: string;
    public readonly index: number;
    public readonly template: Part;
}

class DashboardLense extends pulumi.ComponentResource {
    constructor(lense: Lense, index: number, dashboard: Dashboard) {
        const name = dashboard.name + "-lense-" + index;
        super("azure:monitoring:DashboardLense", name, { parent: dashboard });

        this.name = name;
        this.index = index;
        this.parts = lense.parts.map((p, i) => new DashboardPart(p, i, this));

        this.template = {
            order: index.toString(),
            parts: {}
        };
        this.parts.forEach((p) => {
            this.template.parts[p.index.toString()] = p.template
        });

        this.registerOutputs({ parts: this.parts, name: this.name, index: this.index });
    }

    public readonly name: string;
    public readonly index: number;
    public readonly parts: DashboardPart[];
    public readonly template: { order: string, parts: { [partIndex: string]: Part } };
}

export class Dashboard extends pulumi.ComponentResource {

    constructor(name: string, args: DashboardArgs) {
        super("azure:monitoring:Dashboard", name, {});
        this.name = name;
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

        const lenses = args.lenses.map((l, i) => new DashboardLense(l, i, this));
        const lensesTemplate: any = {};
        lenses.forEach((l) => {
            lensesTemplate[l.index.toString()] = l.template;
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
                        "name": "[parameters('dashboard-name')]",
                        "tags": {
                            "hidden-title": args.title
                        },
                        "location": args.location ? "[parameters('location')]" : "[resourceGroup().location]",
                        "properties": {
                            "lenses": lensesTemplate,
                            "metadata": this.metadata
                        }
                    }
                ]
            }),
            parameters: parameterValues,
            deploymentMode: "Incremental"
        }, {
                parent: this
            });

        this.registerOutputs({
            template,
            name
        });
    }

    public readonly name: string;

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