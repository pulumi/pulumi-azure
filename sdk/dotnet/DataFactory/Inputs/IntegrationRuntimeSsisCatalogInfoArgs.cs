// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class IntegrationRuntimeSsisCatalogInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Administrator login name for the SQL Server.
        /// </summary>
        [Input("administratorLogin")]
        public Input<string>? AdministratorLogin { get; set; }

        [Input("administratorPassword")]
        private Input<string>? _administratorPassword;

        /// <summary>
        /// Administrator login password for the SQL Server.
        /// </summary>
        public Input<string>? AdministratorPassword
        {
            get => _administratorPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _administratorPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The dual standby Azure-SSIS Integration Runtime pair with SSISDB failover.
        /// </summary>
        [Input("dualStandbyPairName")]
        public Input<string>? DualStandbyPairName { get; set; }

        /// <summary>
        /// The name of SQL elastic pool where the database will be created for the SSIS catalog. Mutually exclusive with `pricing_tier`.
        /// </summary>
        [Input("elasticPoolName")]
        public Input<string>? ElasticPoolName { get; set; }

        /// <summary>
        /// Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `S0`, `S1`, `S2`, `S3`, `S4`, `S6`, `S7`, `S9`, `S12`, `P1`, `P2`, `P4`, `P6`, `P11`, `P15`, `GP_S_Gen5_1`, `GP_S_Gen5_2`, `GP_S_Gen5_4`, `GP_S_Gen5_6`, `GP_S_Gen5_8`, `GP_S_Gen5_10`, `GP_S_Gen5_12`, `GP_S_Gen5_14`, `GP_S_Gen5_16`, `GP_S_Gen5_18`, `GP_S_Gen5_20`, `GP_S_Gen5_24`, `GP_S_Gen5_32`, `GP_S_Gen5_40`, `GP_Gen5_2`, `GP_Gen5_4`, `GP_Gen5_6`, `GP_Gen5_8`, `GP_Gen5_10`, `GP_Gen5_12`, `GP_Gen5_14`, `GP_Gen5_16`, `GP_Gen5_18`, `GP_Gen5_20`, `GP_Gen5_24`, `GP_Gen5_32`, `GP_Gen5_40`, `GP_Gen5_80`, `BC_Gen5_2`, `BC_Gen5_4`, `BC_Gen5_6`, `BC_Gen5_8`, `BC_Gen5_10`, `BC_Gen5_12`, `BC_Gen5_14`, `BC_Gen5_16`, `BC_Gen5_18`, `BC_Gen5_20`, `BC_Gen5_24`, `BC_Gen5_32`, `BC_Gen5_40`, `BC_Gen5_80`, `HS_Gen5_2`, `HS_Gen5_4`, `HS_Gen5_6`, `HS_Gen5_8`, `HS_Gen5_10`, `HS_Gen5_12`, `HS_Gen5_14`, `HS_Gen5_16`, `HS_Gen5_18`, `HS_Gen5_20`, `HS_Gen5_24`, `HS_Gen5_32`, `HS_Gen5_40` and `HS_Gen5_80`. Mutually exclusive with `elastic_pool_name`.
        /// </summary>
        [Input("pricingTier")]
        public Input<string>? PricingTier { get; set; }

        /// <summary>
        /// The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
        /// </summary>
        [Input("serverEndpoint", required: true)]
        public Input<string> ServerEndpoint { get; set; } = null!;

        public IntegrationRuntimeSsisCatalogInfoArgs()
        {
        }
        public static new IntegrationRuntimeSsisCatalogInfoArgs Empty => new IntegrationRuntimeSsisCatalogInfoArgs();
    }
}
