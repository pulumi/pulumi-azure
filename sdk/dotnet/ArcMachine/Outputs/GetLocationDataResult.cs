// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArcMachine.Outputs
{

    [OutputType]
    public sealed class GetLocationDataResult
    {
        /// <summary>
        /// The city or locality where the resource is located.
        /// </summary>
        public readonly string City;
        /// <summary>
        /// The country or region where the resource is located.
        /// </summary>
        public readonly string CountryOrRegion;
        /// <summary>
        /// The district, state, or province where the resource is located.
        /// </summary>
        public readonly string District;
        /// <summary>
        /// The name of this Azure Arc machine.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetLocationDataResult(
            string city,

            string countryOrRegion,

            string district,

            string name)
        {
            City = city;
            CountryOrRegion = countryOrRegion;
            District = district;
            Name = name;
        }
    }
}
