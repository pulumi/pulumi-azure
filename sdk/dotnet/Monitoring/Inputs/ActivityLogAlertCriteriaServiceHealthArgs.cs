// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class ActivityLogAlertCriteriaServiceHealthArgs : Pulumi.ResourceArgs
    {
        [Input("events")]
        private InputList<string>? _events;

        /// <summary>
        /// Events this alert will monitor Possible values are `Incident`, `Maintenance`, `Informational`, `ActionRequired` and `Security`.
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("locations")]
        private InputList<string>? _locations;

        /// <summary>
        /// Locations this alert will monitor. For example, `West Europe`. Defaults to `Global`.
        /// </summary>
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// Services this alert will monitor. For example, `Activity Logs &amp; Alerts`, `Action Groups`. Defaults to all Services.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        public ActivityLogAlertCriteriaServiceHealthArgs()
        {
        }
    }
}