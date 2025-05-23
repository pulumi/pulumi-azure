// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerAzureadAdministrator {
    /**
     * @return Specifies whether only AD Users and administrators (e.g. `azuread_administrator[0].login_username`) can be used to login, or also local database users (e.g. `administrator_login`). When `true`, the `administrator_login` and `administrator_login_password` properties can be omitted.
     * 
     */
    private @Nullable Boolean azureadAuthenticationOnly;
    /**
     * @return The login username of the Azure AD Administrator of this SQL Server.
     * 
     */
    private String loginUsername;
    /**
     * @return The object id of the Azure AD Administrator of this SQL Server.
     * 
     */
    private String objectId;
    /**
     * @return The tenant id of the Azure AD Administrator of this SQL Server.
     * 
     */
    private @Nullable String tenantId;

    private ServerAzureadAdministrator() {}
    /**
     * @return Specifies whether only AD Users and administrators (e.g. `azuread_administrator[0].login_username`) can be used to login, or also local database users (e.g. `administrator_login`). When `true`, the `administrator_login` and `administrator_login_password` properties can be omitted.
     * 
     */
    public Optional<Boolean> azureadAuthenticationOnly() {
        return Optional.ofNullable(this.azureadAuthenticationOnly);
    }
    /**
     * @return The login username of the Azure AD Administrator of this SQL Server.
     * 
     */
    public String loginUsername() {
        return this.loginUsername;
    }
    /**
     * @return The object id of the Azure AD Administrator of this SQL Server.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return The tenant id of the Azure AD Administrator of this SQL Server.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerAzureadAdministrator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean azureadAuthenticationOnly;
        private String loginUsername;
        private String objectId;
        private @Nullable String tenantId;
        public Builder() {}
        public Builder(ServerAzureadAdministrator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureadAuthenticationOnly = defaults.azureadAuthenticationOnly;
    	      this.loginUsername = defaults.loginUsername;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder azureadAuthenticationOnly(@Nullable Boolean azureadAuthenticationOnly) {

            this.azureadAuthenticationOnly = azureadAuthenticationOnly;
            return this;
        }
        @CustomType.Setter
        public Builder loginUsername(String loginUsername) {
            if (loginUsername == null) {
              throw new MissingRequiredPropertyException("ServerAzureadAdministrator", "loginUsername");
            }
            this.loginUsername = loginUsername;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(String objectId) {
            if (objectId == null) {
              throw new MissingRequiredPropertyException("ServerAzureadAdministrator", "objectId");
            }
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        public ServerAzureadAdministrator build() {
            final var _resultValue = new ServerAzureadAdministrator();
            _resultValue.azureadAuthenticationOnly = azureadAuthenticationOnly;
            _resultValue.loginUsername = loginUsername;
            _resultValue.objectId = objectId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
