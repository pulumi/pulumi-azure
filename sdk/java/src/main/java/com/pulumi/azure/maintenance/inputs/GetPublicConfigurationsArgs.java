// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicConfigurationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicConfigurationsArgs Empty = new GetPublicConfigurationsArgs();

    /**
     * The Azure location to filter the list of Public Maintenance Configurations against.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location to filter the list of Public Maintenance Configurations against.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The recurring window to filter the list of Public Maintenance Configurations against. Possible values are `Monday-Thursday` and `Friday-Sunday`
     * 
     */
    @Import(name="recurEvery")
    private @Nullable Output<String> recurEvery;

    /**
     * @return The recurring window to filter the list of Public Maintenance Configurations against. Possible values are `Monday-Thursday` and `Friday-Sunday`
     * 
     */
    public Optional<Output<String>> recurEvery() {
        return Optional.ofNullable(this.recurEvery);
    }

    /**
     * The scope to filter the list of Public Maintenance Configurations against. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` and `SQLManagedInstance`.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope to filter the list of Public Maintenance Configurations against. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` and `SQLManagedInstance`.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private GetPublicConfigurationsArgs() {}

    private GetPublicConfigurationsArgs(GetPublicConfigurationsArgs $) {
        this.location = $.location;
        this.recurEvery = $.recurEvery;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicConfigurationsArgs $;

        public Builder() {
            $ = new GetPublicConfigurationsArgs();
        }

        public Builder(GetPublicConfigurationsArgs defaults) {
            $ = new GetPublicConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure location to filter the list of Public Maintenance Configurations against.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location to filter the list of Public Maintenance Configurations against.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param recurEvery The recurring window to filter the list of Public Maintenance Configurations against. Possible values are `Monday-Thursday` and `Friday-Sunday`
         * 
         * @return builder
         * 
         */
        public Builder recurEvery(@Nullable Output<String> recurEvery) {
            $.recurEvery = recurEvery;
            return this;
        }

        /**
         * @param recurEvery The recurring window to filter the list of Public Maintenance Configurations against. Possible values are `Monday-Thursday` and `Friday-Sunday`
         * 
         * @return builder
         * 
         */
        public Builder recurEvery(String recurEvery) {
            return recurEvery(Output.of(recurEvery));
        }

        /**
         * @param scope The scope to filter the list of Public Maintenance Configurations against. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` and `SQLManagedInstance`.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope to filter the list of Public Maintenance Configurations against. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` and `SQLManagedInstance`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public GetPublicConfigurationsArgs build() {
            return $;
        }
    }

}
