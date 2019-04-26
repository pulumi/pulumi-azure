"use strict";
// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const azure = require("@pulumi/azure");
const eventhub = require("@pulumi/azure/eventhub");
const location = "West US 2";
const resourceGroup = new azure.core.ResourceGroup("test", {
    location: location,
});
const namespace = new eventhub.Namespace("test", {
    location: location,
    resourceGroupName: resourceGroup.name,
    sku: "standard",
});
const topic = new eventhub.Topic("test", {
    resourceGroupName: resourceGroup.name,
    namespaceName: namespace.name,
});
exports.subscription = topic.onEvent("test", (context, arg) => __awaiter(this, void 0, void 0, function* () {
    console.log("arg: " + JSON.stringify(arg, null, 4));
    console.log("context: " + JSON.stringify(context, null, 4));
}));
//# sourceMappingURL=index.js.map