// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./location";
export * from "./provider";
import { Provider } from "./provider";

export * from "./util";

// Export sub-modules:
import * as aadb2c from "./aadb2c";
import * as advisor from "./advisor";
import * as aifoundry from "./aifoundry";
import * as analysisservices from "./analysisservices";
import * as apimanagement from "./apimanagement";
import * as appconfiguration from "./appconfiguration";
import * as appinsights from "./appinsights";
import * as appplatform from "./appplatform";
import * as appservice from "./appservice";
import * as arc from "./arc";
import * as arckubernetes from "./arckubernetes";
import * as arcmachine from "./arcmachine";
import * as armmsi from "./armmsi";
import * as attestation from "./attestation";
import * as authorization from "./authorization";
import * as automanage from "./automanage";
import * as automation from "./automation";
import * as avs from "./avs";
import * as backup from "./backup";
import * as batch from "./batch";
import * as billing from "./billing";
import * as blueprint from "./blueprint";
import * as bot from "./bot";
import * as cdn from "./cdn";
import * as chaosstudio from "./chaosstudio";
import * as cognitive from "./cognitive";
import * as communication from "./communication";
import * as compute from "./compute";
import * as confidentialledger from "./confidentialledger";
import * as config from "./config";
import * as connections from "./connections";
import * as consumption from "./consumption";
import * as containerapp from "./containerapp";
import * as containerservice from "./containerservice";
import * as core from "./core";
import * as cosmosdb from "./cosmosdb";
import * as costmanagement from "./costmanagement";
import * as customip from "./customip";
import * as dashboard from "./dashboard";
import * as databasemigration from "./databasemigration";
import * as databoxedge from "./databoxedge";
import * as databricks from "./databricks";
import * as datadog from "./datadog";
import * as datafactory from "./datafactory";
import * as dataprotection from "./dataprotection";
import * as datashare from "./datashare";
import * as desktopvirtualization from "./desktopvirtualization";
import * as devcenter from "./devcenter";
import * as devtest from "./devtest";
import * as digitaltwins from "./digitaltwins";
import * as dns from "./dns";
import * as domainservices from "./domainservices";
import * as dynatrace from "./dynatrace";
import * as elasticcloud from "./elasticcloud";
import * as elasticsan from "./elasticsan";
import * as eventgrid from "./eventgrid";
import * as eventhub from "./eventhub";
import * as expressroute from "./expressroute";
import * as extendedlocation from "./extendedlocation";
import * as fabric from "./fabric";
import * as fluidrelay from "./fluidrelay";
import * as frontdoor from "./frontdoor";
import * as graph from "./graph";
import * as hdinsight from "./hdinsight";
import * as healthcare from "./healthcare";
import * as hpc from "./hpc";
import * as hsm from "./hsm";
import * as iot from "./iot";
import * as iotcentral from "./iotcentral";
import * as keyvault from "./keyvault";
import * as kusto from "./kusto";
import * as lb from "./lb";
import * as lighthouse from "./lighthouse";
import * as loadtest from "./loadtest";
import * as loganalytics from "./loganalytics";
import * as logicapps from "./logicapps";
import * as machinelearning from "./machinelearning";
import * as maintenance from "./maintenance";
import * as managedapplication from "./managedapplication";
import * as managedlustre from "./managedlustre";
import * as management from "./management";
import * as managementgroups from "./managementgroups";
import * as managementresource from "./managementresource";
import * as maps from "./maps";
import * as marketplace from "./marketplace";
import * as mixedreality from "./mixedreality";
import * as mobile from "./mobile";
import * as monitoring from "./monitoring";
import * as msi from "./msi";
import * as mssql from "./mssql";
import * as mysql from "./mysql";
import * as netapp from "./netapp";
import * as network from "./network";
import * as networkfunction from "./networkfunction";
import * as newrelic from "./newrelic";
import * as nginx from "./nginx";
import * as notificationhub from "./notificationhub";
import * as operationalinsights from "./operationalinsights";
import * as oracle from "./oracle";
import * as orbital from "./orbital";
import * as paloalto from "./paloalto";
import * as pim from "./pim";
import * as policy from "./policy";
import * as portal from "./portal";
import * as postgresql from "./postgresql";
import * as powerbi from "./powerbi";
import * as privatedns from "./privatedns";
import * as privatelink from "./privatelink";
import * as proximity from "./proximity";
import * as purview from "./purview";
import * as qumulo from "./qumulo";
import * as recoveryservices from "./recoveryservices";
import * as redhatopenshift from "./redhatopenshift";
import * as redis from "./redis";
import * as relay from "./relay";
import * as role from "./role";
import * as search from "./search";
import * as securitycenter from "./securitycenter";
import * as sentinel from "./sentinel";
import * as servicebus from "./servicebus";
import * as servicefabric from "./servicefabric";
import * as signalr from "./signalr";
import * as siterecovery from "./siterecovery";
import * as stack from "./stack";
import * as storage from "./storage";
import * as streamanalytics from "./streamanalytics";
import * as synapse from "./synapse";
import * as systemcenter from "./systemcenter";
import * as trafficmanager from "./trafficmanager";
import * as trustedsigning from "./trustedsigning";
import * as types from "./types";
import * as videoindexer from "./videoindexer";
import * as voice from "./voice";
import * as waf from "./waf";
import * as webpubsub from "./webpubsub";
import * as workloadssap from "./workloadssap";

export {
    aadb2c,
    advisor,
    aifoundry,
    analysisservices,
    apimanagement,
    appconfiguration,
    appinsights,
    appplatform,
    appservice,
    arc,
    arckubernetes,
    arcmachine,
    armmsi,
    attestation,
    authorization,
    automanage,
    automation,
    avs,
    backup,
    batch,
    billing,
    blueprint,
    bot,
    cdn,
    chaosstudio,
    cognitive,
    communication,
    compute,
    confidentialledger,
    config,
    connections,
    consumption,
    containerapp,
    containerservice,
    core,
    cosmosdb,
    costmanagement,
    customip,
    dashboard,
    databasemigration,
    databoxedge,
    databricks,
    datadog,
    datafactory,
    dataprotection,
    datashare,
    desktopvirtualization,
    devcenter,
    devtest,
    digitaltwins,
    dns,
    domainservices,
    dynatrace,
    elasticcloud,
    elasticsan,
    eventgrid,
    eventhub,
    expressroute,
    extendedlocation,
    fabric,
    fluidrelay,
    frontdoor,
    graph,
    hdinsight,
    healthcare,
    hpc,
    hsm,
    iot,
    iotcentral,
    keyvault,
    kusto,
    lb,
    lighthouse,
    loadtest,
    loganalytics,
    logicapps,
    machinelearning,
    maintenance,
    managedapplication,
    managedlustre,
    management,
    managementgroups,
    managementresource,
    maps,
    marketplace,
    mixedreality,
    mobile,
    monitoring,
    msi,
    mssql,
    mysql,
    netapp,
    network,
    networkfunction,
    newrelic,
    nginx,
    notificationhub,
    operationalinsights,
    oracle,
    orbital,
    paloalto,
    pim,
    policy,
    portal,
    postgresql,
    powerbi,
    privatedns,
    privatelink,
    proximity,
    purview,
    qumulo,
    recoveryservices,
    redhatopenshift,
    redis,
    relay,
    role,
    search,
    securitycenter,
    sentinel,
    servicebus,
    servicefabric,
    signalr,
    siterecovery,
    stack,
    storage,
    streamanalytics,
    synapse,
    systemcenter,
    trafficmanager,
    trustedsigning,
    types,
    videoindexer,
    voice,
    waf,
    webpubsub,
    workloadssap,
};
pulumi.runtime.registerResourcePackage("azure", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:azure") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
