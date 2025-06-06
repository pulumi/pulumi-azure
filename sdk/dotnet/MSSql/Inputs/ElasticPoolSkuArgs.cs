// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class ElasticPoolSkuArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The scale up/out capacity, representing server's compute units. For more information see the documentation for your Elasticpool configuration: [vCore-based](https://docs.microsoft.com/azure/sql-database/sql-database-vcore-resource-limits-elastic-pools) or [DTU-based](https://docs.microsoft.com/azure/sql-database/sql-database-dtu-resource-limits-elastic-pools).
        /// </summary>
        [Input("capacity", required: true)]
        public Input<int> Capacity { get; set; } = null!;

        /// <summary>
        /// The `family` of hardware `Gen4`, `Gen5`, `Fsv2`, `MOPRMS`, `PRMS`, or `DC`.
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        /// <summary>
        /// Specifies the SKU Name for this Elasticpool. The name of the SKU, will be either `vCore` based or `DTU` based. Possible `DTU` based values are `BasicPool`, `StandardPool`, `PremiumPool` while possible `vCore` based values are `GP_Gen4`, `GP_Gen5`, `GP_Fsv2`, `GP_DC`, `BC_Gen4`, `BC_Gen5`, `BC_DC`, `HS_PRMS`, `HS_MOPRMS`, or `HS_Gen5`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The tier of the particular SKU. Possible values are `GeneralPurpose`, `BusinessCritical`, `Basic`, `Standard`, `Premium`, or `HyperScale`. For more information see the documentation for your Elasticpool configuration: [vCore-based](https://docs.microsoft.com/azure/sql-database/sql-database-vcore-resource-limits-elastic-pools) or [DTU-based](https://docs.microsoft.com/azure/sql-database/sql-database-dtu-resource-limits-elastic-pools).
        /// </summary>
        [Input("tier", required: true)]
        public Input<string> Tier { get; set; } = null!;

        public ElasticPoolSkuArgs()
        {
        }
        public static new ElasticPoolSkuArgs Empty => new ElasticPoolSkuArgs();
    }
}
