// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class AppTemplateInitContainerEnv
    {
        /// <summary>
        /// The name of the environment variable for the container.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the secret that contains the value for this environment variable.
        /// </summary>
        public readonly string? SecretName;
        /// <summary>
        /// The value for this environment variable.
        /// 
        /// &gt; **NOTE:** This value is ignored if `secret_name` is used
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private AppTemplateInitContainerEnv(
            string name,

            string? secretName,

            string? value)
        {
            Name = name;
            SecretName = secretName;
            Value = value;
        }
    }
}