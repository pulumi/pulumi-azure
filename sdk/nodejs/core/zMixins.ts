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

import { ServiceClientCredentials, AzureIdentityCredentialAdapter } from "@azure/ms-rest-js";
import * as identity from "@azure/identity";
import * as config from "../config";
import * as utilities from "../utilities";

/**
 * Obtain credentials to query Azure Management API. Depending on the environment configuration, this
 * are either based on MSI, a service principal, or Azure CLI user credentials.
 */
export async function getServiceClientCredentials(): Promise<ServiceClientCredentials> {
    const useMsi = config.useMsi || utilities.getEnvBoolean("ARM_USE_MSI");
    const clientId = config.clientId || utilities.getEnv("AZURE_CLIENT_ID", "ARM_CLIENT_ID");
    const clientSecret = config.clientSecret || utilities.getEnv("AZURE_CLIENT_SECRET", "ARM_CLIENT_SECRET");
    const clientCertPath = config.clientCertificatePath || utilities.getEnv("ARM_CLIENT_CERTIFICATE_PATH");
    const clientCertPassword = config.clientCertificatePassword || utilities.getEnv("ARM_CLIENT_CERTIFICATE_PASSWORD");
    const tenantId = config.tenantId || utilities.getEnv("AZURE_TENANT_ID", "ARM_TENANT_ID");
    config.oidcToken

    let tokenCredential: identity.TokenCredential = new identity.AzureCliCredential();
    if (useMsi) {
        tokenCredential = new identity.ManagedIdentityCredential();
    } else if (clientId && tenantId) {
        if (clientSecret) {
            tokenCredential = new identity.ClientSecretCredential(tenantId, clientId, clientSecret);
        } else if (clientCertPath) {
            tokenCredential = new identity.ClientCertificateCredential(tenantId, clientId, { certificatePath: clientCertPath, certificatePassword: clientCertPassword });
        }
    }

    console.log("Using Azure credentials:", tokenCredential.constructor.name);

    return new AzureIdentityCredentialAdapter(tokenCredential)
}
