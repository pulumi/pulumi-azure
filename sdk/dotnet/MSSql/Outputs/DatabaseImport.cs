// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Outputs
{

    [OutputType]
    public sealed class DatabaseImport
    {
        /// <summary>
        /// Specifies the name of the SQL administrator.
        /// </summary>
        public readonly string AdministratorLogin;
        /// <summary>
        /// Specifies the password of the SQL administrator.
        /// </summary>
        public readonly string AdministratorLoginPassword;
        /// <summary>
        /// Specifies the type of authentication used to access the server. Valid values are `SQL` or `ADPassword`.
        /// </summary>
        public readonly string AuthenticationType;
        /// <summary>
        /// The resource id for the storage account used to store BACPAC file. If set, private endpoint connection will be created for the storage account. Must match storage account used for storage_uri parameter.
        /// </summary>
        public readonly string? StorageAccountId;
        /// <summary>
        /// Specifies the access key for the storage account.
        /// </summary>
        public readonly string StorageKey;
        /// <summary>
        /// Specifies the type of access key for the storage account. Valid values are `StorageAccessKey` or `SharedAccessKey`.
        /// </summary>
        public readonly string StorageKeyType;
        /// <summary>
        /// Specifies the blob URI of the .bacpac file.
        /// </summary>
        public readonly string StorageUri;

        [OutputConstructor]
        private DatabaseImport(
            string administratorLogin,

            string administratorLoginPassword,

            string authenticationType,

            string? storageAccountId,

            string storageKey,

            string storageKeyType,

            string storageUri)
        {
            AdministratorLogin = administratorLogin;
            AdministratorLoginPassword = administratorLoginPassword;
            AuthenticationType = authenticationType;
            StorageAccountId = storageAccountId;
            StorageKey = storageKey;
            StorageKeyType = storageKeyType;
            StorageUri = storageUri;
        }
    }
}
