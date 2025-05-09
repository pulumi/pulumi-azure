// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnGatewayConnectionVpnLinkIpsecPolicy {
    /**
     * @return The DH Group used in IKE Phase 1 for initial SA. Possible values are `None`, `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384`.
     * 
     */
    private String dhGroup;
    /**
     * @return The IPSec encryption algorithm (IKE phase 1). Possible values are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, `None`.
     * 
     */
    private String encryptionAlgorithm;
    /**
     * @return The IKE encryption algorithm (IKE phase 2). Possible values are `DES`, `DES3`, `AES128`, `AES192`, `AES256`, `GCMAES128`, `GCMAES256`.
     * 
     */
    private String ikeEncryptionAlgorithm;
    /**
     * @return The IKE integrity algorithm (IKE phase 2). Possible values are `MD5`, `SHA1`, `SHA256`, `SHA384`, `GCMAES128`, `GCMAES256`.
     * 
     */
    private String ikeIntegrityAlgorithm;
    /**
     * @return The IPSec integrity algorithm (IKE phase 1). Possible values are `MD5`, `SHA1`, `SHA256`, `GCMAES128`, `GCMAES192`, `GCMAES256`.
     * 
     */
    private String integrityAlgorithm;
    /**
     * @return The Pfs Group used in IKE Phase 2 for the new child SA. Possible values are `None`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM`, `ECP256`, `ECP384`.
     * 
     */
    private String pfsGroup;
    /**
     * @return The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for the site to site VPN tunnel.
     * 
     */
    private Integer saDataSizeKb;
    /**
     * @return The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for the site to site VPN tunnel.
     * 
     */
    private Integer saLifetimeSec;

    private VpnGatewayConnectionVpnLinkIpsecPolicy() {}
    /**
     * @return The DH Group used in IKE Phase 1 for initial SA. Possible values are `None`, `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384`.
     * 
     */
    public String dhGroup() {
        return this.dhGroup;
    }
    /**
     * @return The IPSec encryption algorithm (IKE phase 1). Possible values are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, `None`.
     * 
     */
    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    /**
     * @return The IKE encryption algorithm (IKE phase 2). Possible values are `DES`, `DES3`, `AES128`, `AES192`, `AES256`, `GCMAES128`, `GCMAES256`.
     * 
     */
    public String ikeEncryptionAlgorithm() {
        return this.ikeEncryptionAlgorithm;
    }
    /**
     * @return The IKE integrity algorithm (IKE phase 2). Possible values are `MD5`, `SHA1`, `SHA256`, `SHA384`, `GCMAES128`, `GCMAES256`.
     * 
     */
    public String ikeIntegrityAlgorithm() {
        return this.ikeIntegrityAlgorithm;
    }
    /**
     * @return The IPSec integrity algorithm (IKE phase 1). Possible values are `MD5`, `SHA1`, `SHA256`, `GCMAES128`, `GCMAES192`, `GCMAES256`.
     * 
     */
    public String integrityAlgorithm() {
        return this.integrityAlgorithm;
    }
    /**
     * @return The Pfs Group used in IKE Phase 2 for the new child SA. Possible values are `None`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM`, `ECP256`, `ECP384`.
     * 
     */
    public String pfsGroup() {
        return this.pfsGroup;
    }
    /**
     * @return The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for the site to site VPN tunnel.
     * 
     */
    public Integer saDataSizeKb() {
        return this.saDataSizeKb;
    }
    /**
     * @return The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for the site to site VPN tunnel.
     * 
     */
    public Integer saLifetimeSec() {
        return this.saLifetimeSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayConnectionVpnLinkIpsecPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dhGroup;
        private String encryptionAlgorithm;
        private String ikeEncryptionAlgorithm;
        private String ikeIntegrityAlgorithm;
        private String integrityAlgorithm;
        private String pfsGroup;
        private Integer saDataSizeKb;
        private Integer saLifetimeSec;
        public Builder() {}
        public Builder(VpnGatewayConnectionVpnLinkIpsecPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhGroup = defaults.dhGroup;
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.ikeEncryptionAlgorithm = defaults.ikeEncryptionAlgorithm;
    	      this.ikeIntegrityAlgorithm = defaults.ikeIntegrityAlgorithm;
    	      this.integrityAlgorithm = defaults.integrityAlgorithm;
    	      this.pfsGroup = defaults.pfsGroup;
    	      this.saDataSizeKb = defaults.saDataSizeKb;
    	      this.saLifetimeSec = defaults.saLifetimeSec;
        }

        @CustomType.Setter
        public Builder dhGroup(String dhGroup) {
            if (dhGroup == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "dhGroup");
            }
            this.dhGroup = dhGroup;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            if (encryptionAlgorithm == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "encryptionAlgorithm");
            }
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder ikeEncryptionAlgorithm(String ikeEncryptionAlgorithm) {
            if (ikeEncryptionAlgorithm == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "ikeEncryptionAlgorithm");
            }
            this.ikeEncryptionAlgorithm = ikeEncryptionAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder ikeIntegrityAlgorithm(String ikeIntegrityAlgorithm) {
            if (ikeIntegrityAlgorithm == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "ikeIntegrityAlgorithm");
            }
            this.ikeIntegrityAlgorithm = ikeIntegrityAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder integrityAlgorithm(String integrityAlgorithm) {
            if (integrityAlgorithm == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "integrityAlgorithm");
            }
            this.integrityAlgorithm = integrityAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder pfsGroup(String pfsGroup) {
            if (pfsGroup == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "pfsGroup");
            }
            this.pfsGroup = pfsGroup;
            return this;
        }
        @CustomType.Setter
        public Builder saDataSizeKb(Integer saDataSizeKb) {
            if (saDataSizeKb == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "saDataSizeKb");
            }
            this.saDataSizeKb = saDataSizeKb;
            return this;
        }
        @CustomType.Setter
        public Builder saLifetimeSec(Integer saLifetimeSec) {
            if (saLifetimeSec == null) {
              throw new MissingRequiredPropertyException("VpnGatewayConnectionVpnLinkIpsecPolicy", "saLifetimeSec");
            }
            this.saLifetimeSec = saLifetimeSec;
            return this;
        }
        public VpnGatewayConnectionVpnLinkIpsecPolicy build() {
            final var _resultValue = new VpnGatewayConnectionVpnLinkIpsecPolicy();
            _resultValue.dhGroup = dhGroup;
            _resultValue.encryptionAlgorithm = encryptionAlgorithm;
            _resultValue.ikeEncryptionAlgorithm = ikeEncryptionAlgorithm;
            _resultValue.ikeIntegrityAlgorithm = ikeIntegrityAlgorithm;
            _resultValue.integrityAlgorithm = integrityAlgorithm;
            _resultValue.pfsGroup = pfsGroup;
            _resultValue.saDataSizeKb = saDataSizeKb;
            _resultValue.saLifetimeSec = saLifetimeSec;
            return _resultValue;
        }
    }
}
