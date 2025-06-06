// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class GetAccountBlobContainerSASPermissionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Should Add permissions be enabled for this SAS?
        /// </summary>
        [Input("add", required: true)]
        public bool Add { get; set; }

        /// <summary>
        /// Should Create permissions be enabled for this SAS?
        /// </summary>
        [Input("create", required: true)]
        public bool Create { get; set; }

        /// <summary>
        /// Should Delete permissions be enabled for this SAS?
        /// </summary>
        [Input("delete", required: true)]
        public bool Delete { get; set; }

        /// <summary>
        /// Should List permissions be enabled for this SAS?
        /// 
        /// Refer to the [SAS creation reference from Azure](https://docs.microsoft.com/rest/api/storageservices/create-service-sas)
        /// for additional details on the fields above.
        /// </summary>
        [Input("list", required: true)]
        public bool List { get; set; }

        /// <summary>
        /// Should Read permissions be enabled for this SAS?
        /// </summary>
        [Input("read", required: true)]
        public bool Read { get; set; }

        /// <summary>
        /// Should Write permissions be enabled for this SAS?
        /// </summary>
        [Input("write", required: true)]
        public bool Write { get; set; }

        public GetAccountBlobContainerSASPermissionsArgs()
        {
        }
        public static new GetAccountBlobContainerSASPermissionsArgs Empty => new GetAccountBlobContainerSASPermissionsArgs();
    }
}
