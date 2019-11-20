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

using System;

namespace Pulumi.Azure.Storage
{
    /// <summary>
    /// Utility functions to manipulate Azure Storage Shared Access Signatures (SAS).
    /// </summary>
    public static class SharedAccessSignature
    {
        /// <summary>
        /// Produce a URL with read-only access to a Storage Blob with a Shared Access Signature (SAS).
        /// </summary>
        /// <param name="blob">Blob to construct the URL for.</param>
        /// <param name="account">Storage account containing the blob.</param>
        /// <returns>An <see cref="Output{String}"/> containing the blob access URL.</returns>
        public static Output<string> SignedBlobReadUrl(ZipBlob blob, Account account)
        {
            return Output
                .Tuple(account.Name, account.PrimaryConnectionString, blob.StorageContainerName, blob.Name)
                .Apply(async ((string accountName, string connectionString, string containerName, string blobName) v) =>
                {                    
                    var sas = await Invokes.GetAccountBlobContainerSAS(
                        new GetAccountBlobContainerSASArgs
                        {
                            ConnectionString = v.connectionString,
                            ContainerName = v.containerName,
                            Start = "2019-01-01",
                            Expiry = "2100-01-01",
                            Permissions = new Inputs.GetAccountBlobContainerSASPermissionsArgs
                            {
                                Read = true,
                                Write = false,
                                Delete = false,
                                List = false,
                                Add = false,
                                Create = false,
                            },
                        }
                    );
                    return $"https://{v.accountName}.blob.core.windows.net/{v.containerName}/{v.blobName}{sas.Sas}";
                });
        }
    }
}
