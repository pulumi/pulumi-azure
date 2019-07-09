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

import * as msnodeauth from "@azure/ms-rest-nodeauth";
import { ServiceClientCredentials } from "@azure/ms-rest-js";
import * as config from "../config";

/**
 * Obtain credentials to query Azure Management API. Depending on the environment configuration, this
 * are either based on MSI, a service principal, or Azure CLI user credentials.
 */
export async function getServiceClientCredentials(): Promise<ServiceClientCredentials> {
    let credentials: ServiceClientCredentials;

    if (config.useMsi) {
        credentials = await msnodeauth.loginWithAppServiceMSI({ msiEndpoint: config.msiEndpoint });
    } else if (config.clientId && config.clientSecret && config.tenantId) {
        credentials = await msnodeauth.loginWithServicePrincipalSecret(config.clientId, config.clientSecret, config.tenantId);
    } else {
        // `create()` will throw an error if the Az CLI is not installed or `az login` has never been run.
        credentials = await msnodeauth.AzureCliCredentials.create();
    }

    return credentials;
}
