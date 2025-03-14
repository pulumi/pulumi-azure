// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs Empty = new SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs();

    /**
     * Specifies the password of git repository basic auth.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Specifies the password of git repository basic auth.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Specifies the username of git repository basic auth.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Specifies the username of git repository basic auth.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs() {}

    private SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs(SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs $;

        public Builder() {
            $ = new SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs();
        }

        public Builder(SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs defaults) {
            $ = new SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Specifies the password of git repository basic auth.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Specifies the password of git repository basic auth.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Specifies the username of git repository basic auth.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Specifies the username of git repository basic auth.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs", "username");
            }
            return $;
        }
    }

}
