// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSiteConfigApplicationStack {
    /**
     * @return The Application Stack for the Windows Web App. Possible values include `dotnet`, `dotnetcore`, `node`, `python`, `php`, and `java`.
     * 
     */
    private @Nullable String currentStack;
    /**
     * @return The name of the Docker Container. For example `azure-app-service/samples/aspnethelloworld`
     * 
     */
    private @Nullable String dockerContainerName;
    /**
     * @return The registry Host on which the specified Docker Container can be located. For example `mcr.microsoft.com`
     * 
     */
    private @Nullable String dockerContainerRegistry;
    /**
     * @return The Image Tag of the specified Docker Container to use. For example `latest`
     * 
     */
    private @Nullable String dockerContainerTag;
    /**
     * @return The version of .NET to use when `current_stack` is set to `dotnet`. Possible values include  `v2.0`,`v3.0`,`core3.1`, `v4.0`, `v5.0`, and `v6.0`.
     * 
     */
    private @Nullable String dotnetVersion;
    /**
     * @return The Java container type to use when `current_stack` is set to `java`. Possible values include `JAVA`, `JETTY`, and `TOMCAT`. Required with `java_version` and `java_container_version`.
     * 
     */
    private @Nullable String javaContainer;
    /**
     * @return The Version of the `java_container` to use. Required with `java_version` and `java_container`.
     * 
     */
    private @Nullable String javaContainerVersion;
    /**
     * @return The version of Java to use when `current_stack` is set to `java`. Possible values include `1.7`, `1.8` and `11`. Required with `java_container` and `java_container_version`.
     * 
     */
    private @Nullable String javaVersion;
    /**
     * @return The version of node to use when `current_stack` is set to `node`. Possible values include `12-LTS`, `14-LTS`, and `16-LTS`.
     * 
     */
    private @Nullable String nodeVersion;
    /**
     * @return The version of PHP to use when `current_stack` is set to `php`. Possible values include `v7.4`.
     * 
     */
    private @Nullable String phpVersion;
    /**
     * @return The version of Python to use when `current_stack` is set to `python`. Possible values include `2.7` and `3.4.0`.
     * 
     */
    private @Nullable String pythonVersion;

    private WindowsWebAppSiteConfigApplicationStack() {}
    /**
     * @return The Application Stack for the Windows Web App. Possible values include `dotnet`, `dotnetcore`, `node`, `python`, `php`, and `java`.
     * 
     */
    public Optional<String> currentStack() {
        return Optional.ofNullable(this.currentStack);
    }
    /**
     * @return The name of the Docker Container. For example `azure-app-service/samples/aspnethelloworld`
     * 
     */
    public Optional<String> dockerContainerName() {
        return Optional.ofNullable(this.dockerContainerName);
    }
    /**
     * @return The registry Host on which the specified Docker Container can be located. For example `mcr.microsoft.com`
     * 
     */
    public Optional<String> dockerContainerRegistry() {
        return Optional.ofNullable(this.dockerContainerRegistry);
    }
    /**
     * @return The Image Tag of the specified Docker Container to use. For example `latest`
     * 
     */
    public Optional<String> dockerContainerTag() {
        return Optional.ofNullable(this.dockerContainerTag);
    }
    /**
     * @return The version of .NET to use when `current_stack` is set to `dotnet`. Possible values include  `v2.0`,`v3.0`,`core3.1`, `v4.0`, `v5.0`, and `v6.0`.
     * 
     */
    public Optional<String> dotnetVersion() {
        return Optional.ofNullable(this.dotnetVersion);
    }
    /**
     * @return The Java container type to use when `current_stack` is set to `java`. Possible values include `JAVA`, `JETTY`, and `TOMCAT`. Required with `java_version` and `java_container_version`.
     * 
     */
    public Optional<String> javaContainer() {
        return Optional.ofNullable(this.javaContainer);
    }
    /**
     * @return The Version of the `java_container` to use. Required with `java_version` and `java_container`.
     * 
     */
    public Optional<String> javaContainerVersion() {
        return Optional.ofNullable(this.javaContainerVersion);
    }
    /**
     * @return The version of Java to use when `current_stack` is set to `java`. Possible values include `1.7`, `1.8` and `11`. Required with `java_container` and `java_container_version`.
     * 
     */
    public Optional<String> javaVersion() {
        return Optional.ofNullable(this.javaVersion);
    }
    /**
     * @return The version of node to use when `current_stack` is set to `node`. Possible values include `12-LTS`, `14-LTS`, and `16-LTS`.
     * 
     */
    public Optional<String> nodeVersion() {
        return Optional.ofNullable(this.nodeVersion);
    }
    /**
     * @return The version of PHP to use when `current_stack` is set to `php`. Possible values include `v7.4`.
     * 
     */
    public Optional<String> phpVersion() {
        return Optional.ofNullable(this.phpVersion);
    }
    /**
     * @return The version of Python to use when `current_stack` is set to `python`. Possible values include `2.7` and `3.4.0`.
     * 
     */
    public Optional<String> pythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSiteConfigApplicationStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String currentStack;
        private @Nullable String dockerContainerName;
        private @Nullable String dockerContainerRegistry;
        private @Nullable String dockerContainerTag;
        private @Nullable String dotnetVersion;
        private @Nullable String javaContainer;
        private @Nullable String javaContainerVersion;
        private @Nullable String javaVersion;
        private @Nullable String nodeVersion;
        private @Nullable String phpVersion;
        private @Nullable String pythonVersion;
        public Builder() {}
        public Builder(WindowsWebAppSiteConfigApplicationStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentStack = defaults.currentStack;
    	      this.dockerContainerName = defaults.dockerContainerName;
    	      this.dockerContainerRegistry = defaults.dockerContainerRegistry;
    	      this.dockerContainerTag = defaults.dockerContainerTag;
    	      this.dotnetVersion = defaults.dotnetVersion;
    	      this.javaContainer = defaults.javaContainer;
    	      this.javaContainerVersion = defaults.javaContainerVersion;
    	      this.javaVersion = defaults.javaVersion;
    	      this.nodeVersion = defaults.nodeVersion;
    	      this.phpVersion = defaults.phpVersion;
    	      this.pythonVersion = defaults.pythonVersion;
        }

        @CustomType.Setter
        public Builder currentStack(@Nullable String currentStack) {
            this.currentStack = currentStack;
            return this;
        }
        @CustomType.Setter
        public Builder dockerContainerName(@Nullable String dockerContainerName) {
            this.dockerContainerName = dockerContainerName;
            return this;
        }
        @CustomType.Setter
        public Builder dockerContainerRegistry(@Nullable String dockerContainerRegistry) {
            this.dockerContainerRegistry = dockerContainerRegistry;
            return this;
        }
        @CustomType.Setter
        public Builder dockerContainerTag(@Nullable String dockerContainerTag) {
            this.dockerContainerTag = dockerContainerTag;
            return this;
        }
        @CustomType.Setter
        public Builder dotnetVersion(@Nullable String dotnetVersion) {
            this.dotnetVersion = dotnetVersion;
            return this;
        }
        @CustomType.Setter
        public Builder javaContainer(@Nullable String javaContainer) {
            this.javaContainer = javaContainer;
            return this;
        }
        @CustomType.Setter
        public Builder javaContainerVersion(@Nullable String javaContainerVersion) {
            this.javaContainerVersion = javaContainerVersion;
            return this;
        }
        @CustomType.Setter
        public Builder javaVersion(@Nullable String javaVersion) {
            this.javaVersion = javaVersion;
            return this;
        }
        @CustomType.Setter
        public Builder nodeVersion(@Nullable String nodeVersion) {
            this.nodeVersion = nodeVersion;
            return this;
        }
        @CustomType.Setter
        public Builder phpVersion(@Nullable String phpVersion) {
            this.phpVersion = phpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public WindowsWebAppSiteConfigApplicationStack build() {
            final var o = new WindowsWebAppSiteConfigApplicationStack();
            o.currentStack = currentStack;
            o.dockerContainerName = dockerContainerName;
            o.dockerContainerRegistry = dockerContainerRegistry;
            o.dockerContainerTag = dockerContainerTag;
            o.dotnetVersion = dotnetVersion;
            o.javaContainer = javaContainer;
            o.javaContainerVersion = javaContainerVersion;
            o.javaVersion = javaVersion;
            o.nodeVersion = nodeVersion;
            o.phpVersion = phpVersion;
            o.pythonVersion = pythonVersion;
            return o;
        }
    }
}