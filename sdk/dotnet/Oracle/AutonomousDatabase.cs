// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Oracle
{
    /// <summary>
    /// Manages an Autonomous Database.
    /// 
    /// ## Import
    /// 
    /// Autonomous Databases can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:oracle/autonomousDatabase:AutonomousDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup/providers/Oracle.Database/autonomousDatabases/autonomousDatabases1
    /// ```
    /// </summary>
    [AzureResourceType("azure:oracle/autonomousDatabase:AutonomousDatabase")]
    public partial class AutonomousDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The password must be between `12` and `30 `characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("adminPassword")]
        public Output<string> AdminPassword { get; private set; } = null!;

        /// <summary>
        /// Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default value is `true`.
        /// </summary>
        [Output("autoScalingEnabled")]
        public Output<bool> AutoScalingEnabled { get; private set; } = null!;

        /// <summary>
        /// Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is `false`.
        /// </summary>
        [Output("autoScalingForStorageEnabled")]
        public Output<bool> AutoScalingForStorageEnabled { get; private set; } = null!;

        /// <summary>
        /// (Updatable) Retention period, in days, for backups. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("backupRetentionPeriodInDays")]
        public Output<int> BackupRetentionPeriodInDays { get; private set; } = null!;

        /// <summary>
        /// The character set for the autonomous database.  The default is `AL32UTF8`. Allowed values are:  `AL32UTF8`, `AR8ADOS710`, `AR8ADOS720`, `AR8APTEC715`, `AR8ARABICMACS`, `AR8ASMO8X`, `AR8ISO8859P6`, `AR8MSWIN1256`, `AR8MUSSAD768`, `AR8NAFITHA711`, `AR8NAFITHA721`, `AR8SAKHR706`, `AR8SAKHR707`, `AZ8ISO8859P9E`, `BG8MSWIN`, `BG8PC437S`, `BLT8CP921`, `BLT8ISO8859P13`, `BLT8MSWIN1257`, `BLT8PC775`, `BN8BSCII`, `CDN8PC863`, `CEL8ISO8859P14`, `CL8ISO8859P5`, `CL8ISOIR111`, `CL8KOI8R`, `CL8KOI8U`, `CL8MACCYRILLICS`, `CL8MSWIN1251`, `EE8ISO8859P2`, `EE8MACCES`, `EE8MACCROATIANS`, `EE8MSWIN1250`, `EE8PC852`, `EL8DEC`, `EL8ISO8859P7`, `EL8MACGREEKS`, `EL8MSWIN1253`, `EL8PC437S`, `EL8PC851`, `EL8PC869`, `ET8MSWIN923`, `HU8ABMOD`, `HU8CWI2`, `IN8ISCII`, `IS8PC861`, `IW8ISO8859P8`, `IW8MACHEBREWS`, `IW8MSWIN1255`, `IW8PC1507`, `JA16EUC`, `JA16EUCTILDE`, `JA16SJIS`, `JA16SJISTILDE`, `JA16VMS`, `KO16KSC5601`, `KO16KSCCS`, `KO16MSWIN949`, `LA8ISO6937`, `LA8PASSPORT`, `LT8MSWIN921`, `LT8PC772`, `LT8PC774`, `LV8PC1117`, `LV8PC8LR`, `LV8RST104090`, `N8PC865`, `NE8ISO8859P10`, `NEE8ISO8859P4`, `RU8BESTA`, `RU8PC855`, `RU8PC866`, `SE8ISO8859P3`, `TH8MACTHAIS`, `TH8TISASCII`, `TR8DEC`, `TR8MACTURKISHS`, `TR8MSWIN1254`, `TR8PC857`, `US7ASCII`, `US8PC437`, `UTF8`, `VN8MSWIN1258`, `VN8VN3`, `WE8DEC`, `WE8DG`, `WE8ISO8859P1`, `WE8ISO8859P15`, `WE8ISO8859P9`, `WE8MACROMAN8S`, `WE8MSWIN1252`, `WE8NCR4970`, `WE8NEXTSTEP`, `WE8PC850`, `WE8PC858`, `WE8PC860`, `WE8ROMAN8`, `ZHS16CGB231280`, `ZHS16GBK`, `ZHT16BIG5`, `ZHT16CCDC`, `ZHT16DBT`, `ZHT16HKSCS`, `ZHT16MSWIN950`, `ZHT32EUC`, `ZHT32SOPS`, `ZHT32TRIS`. Changing this forces a new Autonomous Database to be created
        /// </summary>
        [Output("characterSet")]
        public Output<string> CharacterSet { get; private set; } = null!;

        /// <summary>
        /// The compute amount (CPUs) available to the database. Minimum and maximum values depend on the compute model and whether the database is an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.  For an Autonomous Database Serverless instance, the `ECPU` compute model requires a minimum value of one, for databases in the elastic resource pool and minimum value of two, otherwise. Required when using the `computeModel` parameter. When using `cpuCoreCount` parameter, it is an error to specify computeCount to a non-null value. Providing `computeModel` and `computeCount` is the preferred method for both OCPU and ECPU.
        /// </summary>
        [Output("computeCount")]
        public Output<double> ComputeCount { get; private set; } = null!;

        /// <summary>
        /// The compute model of the Autonomous Database. This is required if using the `computeCount` parameter. If using `cpuCoreCount` then it is an error to specify `computeModel` to a non-null value. ECPU compute model is the recommended model and OCPU compute model is legacy. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("computeModel")]
        public Output<string> ComputeModel { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of customer contacts as email addresses. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("customerContacts")]
        public Output<ImmutableArray<string>> CustomerContacts { get; private set; } = null!;

        /// <summary>
        /// The maximum storage that can be allocated for the database, in terabytes.
        /// </summary>
        [Output("dataStorageSizeInTbs")]
        public Output<int> DataStorageSizeInTbs { get; private set; } = null!;

        /// <summary>
        /// A valid Oracle Database version for Autonomous Database. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("dbVersion")]
        public Output<string> DbVersion { get; private set; } = null!;

        /// <summary>
        /// The Autonomous Database workload type. Changing this forces a new Autonomous Database to be created. The following values are valid:
        /// * OLTP - indicates an Autonomous Transaction Processing database
        /// * DW - indicates an Autonomous Data Warehouse database
        /// * AJD - indicates an Autonomous JSON Database
        /// * APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
        /// </summary>
        [Output("dbWorkload")]
        public Output<string> DbWorkload { get; private set; } = null!;

        /// <summary>
        /// The user-friendly name for the Autonomous Database. The name does not have to be unique. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The Oracle license model that applies to the Oracle Autonomous Database. Changing this forces a new Autonomous Database to be created. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle services in the cloud. License Included allows you to subscribe to new Oracle Database software licenses and the Oracle Database service. Note that when provisioning an [Autonomous Database on dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null. It is already set at the Autonomous Exadata Infrastructure level. When provisioning an [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value is not specified, the system defaults the value to `BRING_YOUR_OWN_LICENSE`. Bring your own license (BYOL) also allows you to select the DB edition using the optional parameter.
        /// </summary>
        [Output("licenseModel")]
        public Output<string> LicenseModel { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Autonomous Database should exist. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies if the Autonomous Database requires mTLS connections. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("mtlsConnectionRequired")]
        public Output<bool> MtlsConnectionRequired { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Autonomous Database. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The national character set for the autonomous database. Changing this forces a new Autonomous Database to be created. The default is AL16UTF16. Allowed values are: AL16UTF16 or UTF8.
        /// </summary>
        [Output("nationalCharacterSet")]
        public Output<string> NationalCharacterSet { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Autonomous Database should exist. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Autonomous Database.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the vnet associated with the cloud VM cluster. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Output("virtualNetworkId")]
        public Output<string> VirtualNetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a AutonomousDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutonomousDatabase(string name, AutonomousDatabaseArgs args, CustomResourceOptions? options = null)
            : base("azure:oracle/autonomousDatabase:AutonomousDatabase", name, args ?? new AutonomousDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutonomousDatabase(string name, Input<string> id, AutonomousDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("azure:oracle/autonomousDatabase:AutonomousDatabase", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "adminPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AutonomousDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutonomousDatabase Get(string name, Input<string> id, AutonomousDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new AutonomousDatabase(name, id, state, options);
        }
    }

    public sealed class AutonomousDatabaseArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminPassword", required: true)]
        private Input<string>? _adminPassword;

        /// <summary>
        /// The password must be between `12` and `30 `characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default value is `true`.
        /// </summary>
        [Input("autoScalingEnabled", required: true)]
        public Input<bool> AutoScalingEnabled { get; set; } = null!;

        /// <summary>
        /// Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is `false`.
        /// </summary>
        [Input("autoScalingForStorageEnabled", required: true)]
        public Input<bool> AutoScalingForStorageEnabled { get; set; } = null!;

        /// <summary>
        /// (Updatable) Retention period, in days, for backups. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("backupRetentionPeriodInDays", required: true)]
        public Input<int> BackupRetentionPeriodInDays { get; set; } = null!;

        /// <summary>
        /// The character set for the autonomous database.  The default is `AL32UTF8`. Allowed values are:  `AL32UTF8`, `AR8ADOS710`, `AR8ADOS720`, `AR8APTEC715`, `AR8ARABICMACS`, `AR8ASMO8X`, `AR8ISO8859P6`, `AR8MSWIN1256`, `AR8MUSSAD768`, `AR8NAFITHA711`, `AR8NAFITHA721`, `AR8SAKHR706`, `AR8SAKHR707`, `AZ8ISO8859P9E`, `BG8MSWIN`, `BG8PC437S`, `BLT8CP921`, `BLT8ISO8859P13`, `BLT8MSWIN1257`, `BLT8PC775`, `BN8BSCII`, `CDN8PC863`, `CEL8ISO8859P14`, `CL8ISO8859P5`, `CL8ISOIR111`, `CL8KOI8R`, `CL8KOI8U`, `CL8MACCYRILLICS`, `CL8MSWIN1251`, `EE8ISO8859P2`, `EE8MACCES`, `EE8MACCROATIANS`, `EE8MSWIN1250`, `EE8PC852`, `EL8DEC`, `EL8ISO8859P7`, `EL8MACGREEKS`, `EL8MSWIN1253`, `EL8PC437S`, `EL8PC851`, `EL8PC869`, `ET8MSWIN923`, `HU8ABMOD`, `HU8CWI2`, `IN8ISCII`, `IS8PC861`, `IW8ISO8859P8`, `IW8MACHEBREWS`, `IW8MSWIN1255`, `IW8PC1507`, `JA16EUC`, `JA16EUCTILDE`, `JA16SJIS`, `JA16SJISTILDE`, `JA16VMS`, `KO16KSC5601`, `KO16KSCCS`, `KO16MSWIN949`, `LA8ISO6937`, `LA8PASSPORT`, `LT8MSWIN921`, `LT8PC772`, `LT8PC774`, `LV8PC1117`, `LV8PC8LR`, `LV8RST104090`, `N8PC865`, `NE8ISO8859P10`, `NEE8ISO8859P4`, `RU8BESTA`, `RU8PC855`, `RU8PC866`, `SE8ISO8859P3`, `TH8MACTHAIS`, `TH8TISASCII`, `TR8DEC`, `TR8MACTURKISHS`, `TR8MSWIN1254`, `TR8PC857`, `US7ASCII`, `US8PC437`, `UTF8`, `VN8MSWIN1258`, `VN8VN3`, `WE8DEC`, `WE8DG`, `WE8ISO8859P1`, `WE8ISO8859P15`, `WE8ISO8859P9`, `WE8MACROMAN8S`, `WE8MSWIN1252`, `WE8NCR4970`, `WE8NEXTSTEP`, `WE8PC850`, `WE8PC858`, `WE8PC860`, `WE8ROMAN8`, `ZHS16CGB231280`, `ZHS16GBK`, `ZHT16BIG5`, `ZHT16CCDC`, `ZHT16DBT`, `ZHT16HKSCS`, `ZHT16MSWIN950`, `ZHT32EUC`, `ZHT32SOPS`, `ZHT32TRIS`. Changing this forces a new Autonomous Database to be created
        /// </summary>
        [Input("characterSet", required: true)]
        public Input<string> CharacterSet { get; set; } = null!;

        /// <summary>
        /// The compute amount (CPUs) available to the database. Minimum and maximum values depend on the compute model and whether the database is an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.  For an Autonomous Database Serverless instance, the `ECPU` compute model requires a minimum value of one, for databases in the elastic resource pool and minimum value of two, otherwise. Required when using the `computeModel` parameter. When using `cpuCoreCount` parameter, it is an error to specify computeCount to a non-null value. Providing `computeModel` and `computeCount` is the preferred method for both OCPU and ECPU.
        /// </summary>
        [Input("computeCount", required: true)]
        public Input<double> ComputeCount { get; set; } = null!;

        /// <summary>
        /// The compute model of the Autonomous Database. This is required if using the `computeCount` parameter. If using `cpuCoreCount` then it is an error to specify `computeModel` to a non-null value. ECPU compute model is the recommended model and OCPU compute model is legacy. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("computeModel", required: true)]
        public Input<string> ComputeModel { get; set; } = null!;

        [Input("customerContacts")]
        private InputList<string>? _customerContacts;

        /// <summary>
        /// Specifies a list of customer contacts as email addresses. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        public InputList<string> CustomerContacts
        {
            get => _customerContacts ?? (_customerContacts = new InputList<string>());
            set => _customerContacts = value;
        }

        /// <summary>
        /// The maximum storage that can be allocated for the database, in terabytes.
        /// </summary>
        [Input("dataStorageSizeInTbs", required: true)]
        public Input<int> DataStorageSizeInTbs { get; set; } = null!;

        /// <summary>
        /// A valid Oracle Database version for Autonomous Database. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("dbVersion", required: true)]
        public Input<string> DbVersion { get; set; } = null!;

        /// <summary>
        /// The Autonomous Database workload type. Changing this forces a new Autonomous Database to be created. The following values are valid:
        /// * OLTP - indicates an Autonomous Transaction Processing database
        /// * DW - indicates an Autonomous Data Warehouse database
        /// * AJD - indicates an Autonomous JSON Database
        /// * APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
        /// </summary>
        [Input("dbWorkload", required: true)]
        public Input<string> DbWorkload { get; set; } = null!;

        /// <summary>
        /// The user-friendly name for the Autonomous Database. The name does not have to be unique. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The Oracle license model that applies to the Oracle Autonomous Database. Changing this forces a new Autonomous Database to be created. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle services in the cloud. License Included allows you to subscribe to new Oracle Database software licenses and the Oracle Database service. Note that when provisioning an [Autonomous Database on dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null. It is already set at the Autonomous Exadata Infrastructure level. When provisioning an [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value is not specified, the system defaults the value to `BRING_YOUR_OWN_LICENSE`. Bring your own license (BYOL) also allows you to select the DB edition using the optional parameter.
        /// </summary>
        [Input("licenseModel", required: true)]
        public Input<string> LicenseModel { get; set; } = null!;

        /// <summary>
        /// The Azure Region where the Autonomous Database should exist. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies if the Autonomous Database requires mTLS connections. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("mtlsConnectionRequired", required: true)]
        public Input<bool> MtlsConnectionRequired { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Autonomous Database. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The national character set for the autonomous database. Changing this forces a new Autonomous Database to be created. The default is AL16UTF16. Allowed values are: AL16UTF16 or UTF8.
        /// </summary>
        [Input("nationalCharacterSet", required: true)]
        public Input<string> NationalCharacterSet { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Autonomous Database should exist. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Autonomous Database.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the vnet associated with the cloud VM cluster. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("virtualNetworkId", required: true)]
        public Input<string> VirtualNetworkId { get; set; } = null!;

        public AutonomousDatabaseArgs()
        {
        }
        public static new AutonomousDatabaseArgs Empty => new AutonomousDatabaseArgs();
    }

    public sealed class AutonomousDatabaseState : global::Pulumi.ResourceArgs
    {
        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// The password must be between `12` and `30 `characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default value is `true`.
        /// </summary>
        [Input("autoScalingEnabled")]
        public Input<bool>? AutoScalingEnabled { get; set; }

        /// <summary>
        /// Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is `false`.
        /// </summary>
        [Input("autoScalingForStorageEnabled")]
        public Input<bool>? AutoScalingForStorageEnabled { get; set; }

        /// <summary>
        /// (Updatable) Retention period, in days, for backups. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("backupRetentionPeriodInDays")]
        public Input<int>? BackupRetentionPeriodInDays { get; set; }

        /// <summary>
        /// The character set for the autonomous database.  The default is `AL32UTF8`. Allowed values are:  `AL32UTF8`, `AR8ADOS710`, `AR8ADOS720`, `AR8APTEC715`, `AR8ARABICMACS`, `AR8ASMO8X`, `AR8ISO8859P6`, `AR8MSWIN1256`, `AR8MUSSAD768`, `AR8NAFITHA711`, `AR8NAFITHA721`, `AR8SAKHR706`, `AR8SAKHR707`, `AZ8ISO8859P9E`, `BG8MSWIN`, `BG8PC437S`, `BLT8CP921`, `BLT8ISO8859P13`, `BLT8MSWIN1257`, `BLT8PC775`, `BN8BSCII`, `CDN8PC863`, `CEL8ISO8859P14`, `CL8ISO8859P5`, `CL8ISOIR111`, `CL8KOI8R`, `CL8KOI8U`, `CL8MACCYRILLICS`, `CL8MSWIN1251`, `EE8ISO8859P2`, `EE8MACCES`, `EE8MACCROATIANS`, `EE8MSWIN1250`, `EE8PC852`, `EL8DEC`, `EL8ISO8859P7`, `EL8MACGREEKS`, `EL8MSWIN1253`, `EL8PC437S`, `EL8PC851`, `EL8PC869`, `ET8MSWIN923`, `HU8ABMOD`, `HU8CWI2`, `IN8ISCII`, `IS8PC861`, `IW8ISO8859P8`, `IW8MACHEBREWS`, `IW8MSWIN1255`, `IW8PC1507`, `JA16EUC`, `JA16EUCTILDE`, `JA16SJIS`, `JA16SJISTILDE`, `JA16VMS`, `KO16KSC5601`, `KO16KSCCS`, `KO16MSWIN949`, `LA8ISO6937`, `LA8PASSPORT`, `LT8MSWIN921`, `LT8PC772`, `LT8PC774`, `LV8PC1117`, `LV8PC8LR`, `LV8RST104090`, `N8PC865`, `NE8ISO8859P10`, `NEE8ISO8859P4`, `RU8BESTA`, `RU8PC855`, `RU8PC866`, `SE8ISO8859P3`, `TH8MACTHAIS`, `TH8TISASCII`, `TR8DEC`, `TR8MACTURKISHS`, `TR8MSWIN1254`, `TR8PC857`, `US7ASCII`, `US8PC437`, `UTF8`, `VN8MSWIN1258`, `VN8VN3`, `WE8DEC`, `WE8DG`, `WE8ISO8859P1`, `WE8ISO8859P15`, `WE8ISO8859P9`, `WE8MACROMAN8S`, `WE8MSWIN1252`, `WE8NCR4970`, `WE8NEXTSTEP`, `WE8PC850`, `WE8PC858`, `WE8PC860`, `WE8ROMAN8`, `ZHS16CGB231280`, `ZHS16GBK`, `ZHT16BIG5`, `ZHT16CCDC`, `ZHT16DBT`, `ZHT16HKSCS`, `ZHT16MSWIN950`, `ZHT32EUC`, `ZHT32SOPS`, `ZHT32TRIS`. Changing this forces a new Autonomous Database to be created
        /// </summary>
        [Input("characterSet")]
        public Input<string>? CharacterSet { get; set; }

        /// <summary>
        /// The compute amount (CPUs) available to the database. Minimum and maximum values depend on the compute model and whether the database is an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.  For an Autonomous Database Serverless instance, the `ECPU` compute model requires a minimum value of one, for databases in the elastic resource pool and minimum value of two, otherwise. Required when using the `computeModel` parameter. When using `cpuCoreCount` parameter, it is an error to specify computeCount to a non-null value. Providing `computeModel` and `computeCount` is the preferred method for both OCPU and ECPU.
        /// </summary>
        [Input("computeCount")]
        public Input<double>? ComputeCount { get; set; }

        /// <summary>
        /// The compute model of the Autonomous Database. This is required if using the `computeCount` parameter. If using `cpuCoreCount` then it is an error to specify `computeModel` to a non-null value. ECPU compute model is the recommended model and OCPU compute model is legacy. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("computeModel")]
        public Input<string>? ComputeModel { get; set; }

        [Input("customerContacts")]
        private InputList<string>? _customerContacts;

        /// <summary>
        /// Specifies a list of customer contacts as email addresses. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        public InputList<string> CustomerContacts
        {
            get => _customerContacts ?? (_customerContacts = new InputList<string>());
            set => _customerContacts = value;
        }

        /// <summary>
        /// The maximum storage that can be allocated for the database, in terabytes.
        /// </summary>
        [Input("dataStorageSizeInTbs")]
        public Input<int>? DataStorageSizeInTbs { get; set; }

        /// <summary>
        /// A valid Oracle Database version for Autonomous Database. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("dbVersion")]
        public Input<string>? DbVersion { get; set; }

        /// <summary>
        /// The Autonomous Database workload type. Changing this forces a new Autonomous Database to be created. The following values are valid:
        /// * OLTP - indicates an Autonomous Transaction Processing database
        /// * DW - indicates an Autonomous Data Warehouse database
        /// * AJD - indicates an Autonomous JSON Database
        /// * APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
        /// </summary>
        [Input("dbWorkload")]
        public Input<string>? DbWorkload { get; set; }

        /// <summary>
        /// The user-friendly name for the Autonomous Database. The name does not have to be unique. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The Oracle license model that applies to the Oracle Autonomous Database. Changing this forces a new Autonomous Database to be created. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle services in the cloud. License Included allows you to subscribe to new Oracle Database software licenses and the Oracle Database service. Note that when provisioning an [Autonomous Database on dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null. It is already set at the Autonomous Exadata Infrastructure level. When provisioning an [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value is not specified, the system defaults the value to `BRING_YOUR_OWN_LICENSE`. Bring your own license (BYOL) also allows you to select the DB edition using the optional parameter.
        /// </summary>
        [Input("licenseModel")]
        public Input<string>? LicenseModel { get; set; }

        /// <summary>
        /// The Azure Region where the Autonomous Database should exist. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies if the Autonomous Database requires mTLS connections. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("mtlsConnectionRequired")]
        public Input<bool>? MtlsConnectionRequired { get; set; }

        /// <summary>
        /// The name which should be used for this Autonomous Database. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The national character set for the autonomous database. Changing this forces a new Autonomous Database to be created. The default is AL16UTF16. Allowed values are: AL16UTF16 or UTF8.
        /// </summary>
        [Input("nationalCharacterSet")]
        public Input<string>? NationalCharacterSet { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Autonomous Database should exist. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Autonomous Database.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the vnet associated with the cloud VM cluster. Changing this forces a new Autonomous Database to be created.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        public AutonomousDatabaseState()
        {
        }
        public static new AutonomousDatabaseState Empty => new AutonomousDatabaseState();
    }
}
