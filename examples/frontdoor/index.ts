import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";
import * as random from "@pulumi/random";

const rID = new random.RandomPet("test", {
    length: 3,
    separator: "-",
});

// Create an Azure Resource Group
const resourceGroup = new azure.core.ResourceGroup("resourceGroup");

let routingRuleName = "rule1";
let frontendEndpointName = "frontEndEndpoint1";
let healthProbeSettingName = "exampleHealthProbeSetting1";
let backendPoolName = "exampleBackendBing";
let loadBalancingName = "exampleLoadBalancingSettings1";

const fd = new azure.frontdoor.Frontdoor("example", {
    name: rID.id,
    resourceGroupName: resourceGroup.name,
    enforceBackendPoolsCertificateNameCheck: false,

    routingRules: [{
        name: routingRuleName,
        acceptedProtocols: ["Http", "Https"],
        patternsToMatches: ["/*"],
        frontendEndpoints: [frontendEndpointName],
        forwardingConfiguration: {
            forwardingProtocol: "MatchRequest",
            backendPoolName: backendPoolName,
        }
    }],

    backendPoolLoadBalancings: [{
        name: loadBalancingName,
    }],

    backendPoolHealthProbes: [{
        name: healthProbeSettingName,
    }],

    backendPools: [{
        name: backendPoolName,
        backends: [{
            hostHeader: "www.bing.com",
            address: "www.bing.com",
            httpPort: 80,
            httpsPort: 443,
        }],

        loadBalancingName: loadBalancingName,
        healthProbeName: healthProbeSettingName,
    }],

    frontendEndpoints: [{
        name: frontendEndpointName,
        hostName: rID.id.apply(x => `${x}.azurefd.net`),
    }]
});
