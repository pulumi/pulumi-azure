// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.azure.appplatform.outputs.SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth;
import com.pulumi.azure.appplatform.outputs.SpringCloudServiceConfigServerGitSettingRepositorySshAuth;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudServiceConfigServerGitSettingRepository {
    /**
     * @return A `http_basic_auth` block as defined below.
     * 
     */
    private @Nullable SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth httpBasicAuth;
    /**
     * @return The default label of the Git repository, should be the branch name, tag name, or commit-id of the repository.
     * 
     */
    private @Nullable String label;
    /**
     * @return A name to identify on the Git repository, required only if repos exists.
     * 
     */
    private String name;
    /**
     * @return An array of strings used to match an application name. For each pattern, use the `{application}/{profile}` format with wildcards.
     * 
     */
    private @Nullable List<String> patterns;
    /**
     * @return An array of strings used to search subdirectories of the Git repository.
     * 
     */
    private @Nullable List<String> searchPaths;
    /**
     * @return A `ssh_auth` block as defined below.
     * 
     */
    private @Nullable SpringCloudServiceConfigServerGitSettingRepositorySshAuth sshAuth;
    /**
     * @return The URI of the Git repository that&#39;s used as the Config Server back end should be started with `http://`, `https://`, `git@`, or `ssh://`.
     * 
     */
    private String uri;

    private SpringCloudServiceConfigServerGitSettingRepository() {}
    /**
     * @return A `http_basic_auth` block as defined below.
     * 
     */
    public Optional<SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth> httpBasicAuth() {
        return Optional.ofNullable(this.httpBasicAuth);
    }
    /**
     * @return The default label of the Git repository, should be the branch name, tag name, or commit-id of the repository.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return A name to identify on the Git repository, required only if repos exists.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An array of strings used to match an application name. For each pattern, use the `{application}/{profile}` format with wildcards.
     * 
     */
    public List<String> patterns() {
        return this.patterns == null ? List.of() : this.patterns;
    }
    /**
     * @return An array of strings used to search subdirectories of the Git repository.
     * 
     */
    public List<String> searchPaths() {
        return this.searchPaths == null ? List.of() : this.searchPaths;
    }
    /**
     * @return A `ssh_auth` block as defined below.
     * 
     */
    public Optional<SpringCloudServiceConfigServerGitSettingRepositorySshAuth> sshAuth() {
        return Optional.ofNullable(this.sshAuth);
    }
    /**
     * @return The URI of the Git repository that&#39;s used as the Config Server back end should be started with `http://`, `https://`, `git@`, or `ssh://`.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudServiceConfigServerGitSettingRepository defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth httpBasicAuth;
        private @Nullable String label;
        private String name;
        private @Nullable List<String> patterns;
        private @Nullable List<String> searchPaths;
        private @Nullable SpringCloudServiceConfigServerGitSettingRepositorySshAuth sshAuth;
        private String uri;
        public Builder() {}
        public Builder(SpringCloudServiceConfigServerGitSettingRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpBasicAuth = defaults.httpBasicAuth;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.patterns = defaults.patterns;
    	      this.searchPaths = defaults.searchPaths;
    	      this.sshAuth = defaults.sshAuth;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder httpBasicAuth(@Nullable SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth httpBasicAuth) {
            this.httpBasicAuth = httpBasicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder patterns(@Nullable List<String> patterns) {
            this.patterns = patterns;
            return this;
        }
        public Builder patterns(String... patterns) {
            return patterns(List.of(patterns));
        }
        @CustomType.Setter
        public Builder searchPaths(@Nullable List<String> searchPaths) {
            this.searchPaths = searchPaths;
            return this;
        }
        public Builder searchPaths(String... searchPaths) {
            return searchPaths(List.of(searchPaths));
        }
        @CustomType.Setter
        public Builder sshAuth(@Nullable SpringCloudServiceConfigServerGitSettingRepositorySshAuth sshAuth) {
            this.sshAuth = sshAuth;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public SpringCloudServiceConfigServerGitSettingRepository build() {
            final var o = new SpringCloudServiceConfigServerGitSettingRepository();
            o.httpBasicAuth = httpBasicAuth;
            o.label = label;
            o.name = name;
            o.patterns = patterns;
            o.searchPaths = searchPaths;
            o.sshAuth = sshAuth;
            o.uri = uri;
            return o;
        }
    }
}