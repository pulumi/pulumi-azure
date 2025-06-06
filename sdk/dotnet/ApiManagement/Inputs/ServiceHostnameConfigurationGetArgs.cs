// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class ServiceHostnameConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("developerPortals")]
        private InputList<Inputs.ServiceHostnameConfigurationDeveloperPortalGetArgs>? _developerPortals;

        /// <summary>
        /// One or more `developer_portal` blocks as documented below.
        /// </summary>
        public InputList<Inputs.ServiceHostnameConfigurationDeveloperPortalGetArgs> DeveloperPortals
        {
            get => _developerPortals ?? (_developerPortals = new InputList<Inputs.ServiceHostnameConfigurationDeveloperPortalGetArgs>());
            set => _developerPortals = value;
        }

        [Input("managements")]
        private InputList<Inputs.ServiceHostnameConfigurationManagementGetArgs>? _managements;

        /// <summary>
        /// One or more `management` blocks as documented below.
        /// </summary>
        public InputList<Inputs.ServiceHostnameConfigurationManagementGetArgs> Managements
        {
            get => _managements ?? (_managements = new InputList<Inputs.ServiceHostnameConfigurationManagementGetArgs>());
            set => _managements = value;
        }

        [Input("portals")]
        private InputList<Inputs.ServiceHostnameConfigurationPortalGetArgs>? _portals;

        /// <summary>
        /// One or more `portal` blocks as documented below.
        /// </summary>
        public InputList<Inputs.ServiceHostnameConfigurationPortalGetArgs> Portals
        {
            get => _portals ?? (_portals = new InputList<Inputs.ServiceHostnameConfigurationPortalGetArgs>());
            set => _portals = value;
        }

        [Input("proxies")]
        private InputList<Inputs.ServiceHostnameConfigurationProxyGetArgs>? _proxies;

        /// <summary>
        /// One or more `proxy` blocks as documented below.
        /// </summary>
        public InputList<Inputs.ServiceHostnameConfigurationProxyGetArgs> Proxies
        {
            get => _proxies ?? (_proxies = new InputList<Inputs.ServiceHostnameConfigurationProxyGetArgs>());
            set => _proxies = value;
        }

        [Input("scms")]
        private InputList<Inputs.ServiceHostnameConfigurationScmGetArgs>? _scms;

        /// <summary>
        /// One or more `scm` blocks as documented below.
        /// </summary>
        public InputList<Inputs.ServiceHostnameConfigurationScmGetArgs> Scms
        {
            get => _scms ?? (_scms = new InputList<Inputs.ServiceHostnameConfigurationScmGetArgs>());
            set => _scms = value;
        }

        public ServiceHostnameConfigurationGetArgs()
        {
        }
        public static new ServiceHostnameConfigurationGetArgs Empty => new ServiceHostnameConfigurationGetArgs();
    }
}
