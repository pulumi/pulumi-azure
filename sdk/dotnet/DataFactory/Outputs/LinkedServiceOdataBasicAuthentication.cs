// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class LinkedServiceOdataBasicAuthentication
    {
        /// <summary>
        /// The password associated with the username, which can be used to authenticate to the OData endpoint.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The username which can be used to authenticate to the OData endpoint.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private LinkedServiceOdataBasicAuthentication(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}