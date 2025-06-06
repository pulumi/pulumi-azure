// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoolSecurityProfile {
    /**
     * @return Whether to enable host encryption for the Virtual Machine or Virtual Machine Scale Set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. Possible values are `true` and `false`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Boolean hostEncryptionEnabled;
    /**
     * @return Whether to enable secure boot for the Virtual Machine or Virtual Machine Scale Set. Possible values are `true` and `false`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Boolean secureBootEnabled;
    /**
     * @return The security type of the Virtual Machine. Possible values are `confidentialVM` and `trustedLaunch`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String securityType;
    /**
     * @return Whether to enable virtual trusted platform module (vTPM) for the Virtual Machine or Virtual Machine Scale Set. Possible values are `true` and `false`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `security_profile` block can only be specified during creation and does not support updates.
     * 
     * &gt; **Note:** `security_type` must be specified to set UEFI related properties including `secure_boot_enabled` and `vtpm_enabled`.
     * 
     */
    private @Nullable Boolean vtpmEnabled;

    private PoolSecurityProfile() {}
    /**
     * @return Whether to enable host encryption for the Virtual Machine or Virtual Machine Scale Set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. Possible values are `true` and `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> hostEncryptionEnabled() {
        return Optional.ofNullable(this.hostEncryptionEnabled);
    }
    /**
     * @return Whether to enable secure boot for the Virtual Machine or Virtual Machine Scale Set. Possible values are `true` and `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> secureBootEnabled() {
        return Optional.ofNullable(this.secureBootEnabled);
    }
    /**
     * @return The security type of the Virtual Machine. Possible values are `confidentialVM` and `trustedLaunch`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> securityType() {
        return Optional.ofNullable(this.securityType);
    }
    /**
     * @return Whether to enable virtual trusted platform module (vTPM) for the Virtual Machine or Virtual Machine Scale Set. Possible values are `true` and `false`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `security_profile` block can only be specified during creation and does not support updates.
     * 
     * &gt; **Note:** `security_type` must be specified to set UEFI related properties including `secure_boot_enabled` and `vtpm_enabled`.
     * 
     */
    public Optional<Boolean> vtpmEnabled() {
        return Optional.ofNullable(this.vtpmEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolSecurityProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean hostEncryptionEnabled;
        private @Nullable Boolean secureBootEnabled;
        private @Nullable String securityType;
        private @Nullable Boolean vtpmEnabled;
        public Builder() {}
        public Builder(PoolSecurityProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostEncryptionEnabled = defaults.hostEncryptionEnabled;
    	      this.secureBootEnabled = defaults.secureBootEnabled;
    	      this.securityType = defaults.securityType;
    	      this.vtpmEnabled = defaults.vtpmEnabled;
        }

        @CustomType.Setter
        public Builder hostEncryptionEnabled(@Nullable Boolean hostEncryptionEnabled) {

            this.hostEncryptionEnabled = hostEncryptionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder secureBootEnabled(@Nullable Boolean secureBootEnabled) {

            this.secureBootEnabled = secureBootEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder securityType(@Nullable String securityType) {

            this.securityType = securityType;
            return this;
        }
        @CustomType.Setter
        public Builder vtpmEnabled(@Nullable Boolean vtpmEnabled) {

            this.vtpmEnabled = vtpmEnabled;
            return this;
        }
        public PoolSecurityProfile build() {
            final var _resultValue = new PoolSecurityProfile();
            _resultValue.hostEncryptionEnabled = hostEncryptionEnabled;
            _resultValue.secureBootEnabled = secureBootEnabled;
            _resultValue.securityType = securityType;
            _resultValue.vtpmEnabled = vtpmEnabled;
            return _resultValue;
        }
    }
}
