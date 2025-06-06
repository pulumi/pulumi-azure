// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Dynatrace.Outputs
{

    [OutputType]
    public sealed class MonitorUser
    {
        /// <summary>
        /// Country of the user.
        /// </summary>
        public readonly string Country;
        /// <summary>
        /// Email of the user used by Dynatrace for contacting them if needed.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// First name of the user.
        /// </summary>
        public readonly string FirstName;
        /// <summary>
        /// Last name of the user.
        /// </summary>
        public readonly string LastName;
        /// <summary>
        /// phone number of the user by Dynatrace for contacting them if needed.
        /// </summary>
        public readonly string PhoneNumber;

        [OutputConstructor]
        private MonitorUser(
            string country,

            string email,

            string firstName,

            string lastName,

            string phoneNumber)
        {
            Country = country;
            Email = email;
            FirstName = firstName;
            LastName = lastName;
            PhoneNumber = phoneNumber;
        }
    }
}
