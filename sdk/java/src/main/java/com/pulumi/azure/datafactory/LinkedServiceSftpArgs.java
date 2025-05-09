// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceSftpArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceSftpArgs Empty = new LinkedServiceSftpArgs();

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     * The following supported arguments are specific to SFTP Linked Service:
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     * The following supported arguments are specific to SFTP Linked Service:
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The type of authentication used to connect to the web table source. Valid options are `Anonymous`, `Basic` and `ClientCertificate`.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    /**
     * @return The type of authentication used to connect to the web table source. Valid options are `Anonymous`, `Basic` and `ClientCertificate`.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId", required=true)
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }

    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The SFTP server hostname.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The SFTP server hostname.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The host key fingerprint of the SFTP server.
     * 
     */
    @Import(name="hostKeyFingerprint")
    private @Nullable Output<String> hostKeyFingerprint;

    /**
     * @return The host key fingerprint of the SFTP server.
     * 
     */
    public Optional<Output<String>> hostKeyFingerprint() {
        return Optional.ofNullable(this.hostKeyFingerprint);
    }

    /**
     * The name of the integration runtime to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The name of the integration runtime to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Password to logon to the SFTP Server for Basic Authentication.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password to logon to the SFTP Server for Basic Authentication.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The TCP port number that the SFTP server uses to listen for client connection. Default value is 22.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The TCP port number that the SFTP server uses to listen for client connection. Default value is 22.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Whether to validate host key fingerprint while connecting. If set to `false`, `host_key_fingerprint` must also be set.
     * 
     */
    @Import(name="skipHostKeyValidation")
    private @Nullable Output<Boolean> skipHostKeyValidation;

    /**
     * @return Whether to validate host key fingerprint while connecting. If set to `false`, `host_key_fingerprint` must also be set.
     * 
     */
    public Optional<Output<Boolean>> skipHostKeyValidation() {
        return Optional.ofNullable(this.skipHostKeyValidation);
    }

    /**
     * The username used to log on to the SFTP server.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username used to log on to the SFTP server.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private LinkedServiceSftpArgs() {}

    private LinkedServiceSftpArgs(LinkedServiceSftpArgs $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.host = $.host;
        this.hostKeyFingerprint = $.hostKeyFingerprint;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.name = $.name;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.skipHostKeyValidation = $.skipHostKeyValidation;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceSftpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceSftpArgs $;

        public Builder() {
            $ = new LinkedServiceSftpArgs();
        }

        public Builder(LinkedServiceSftpArgs defaults) {
            $ = new LinkedServiceSftpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * The following supported arguments are specific to SFTP Linked Service:
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * The following supported arguments are specific to SFTP Linked Service:
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param authenticationType The type of authentication used to connect to the web table source. Valid options are `Anonymous`, `Basic` and `ClientCertificate`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The type of authentication used to connect to the web table source. Valid options are `Anonymous`, `Basic` and `ClientCertificate`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param host The SFTP server hostname.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The SFTP server hostname.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param hostKeyFingerprint The host key fingerprint of the SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder hostKeyFingerprint(@Nullable Output<String> hostKeyFingerprint) {
            $.hostKeyFingerprint = hostKeyFingerprint;
            return this;
        }

        /**
         * @param hostKeyFingerprint The host key fingerprint of the SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder hostKeyFingerprint(String hostKeyFingerprint) {
            return hostKeyFingerprint(Output.of(hostKeyFingerprint));
        }

        /**
         * @param integrationRuntimeName The name of the integration runtime to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The name of the integration runtime to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param password Password to logon to the SFTP Server for Basic Authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password to logon to the SFTP Server for Basic Authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port The TCP port number that the SFTP server uses to listen for client connection. Default value is 22.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port number that the SFTP server uses to listen for client connection. Default value is 22.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param skipHostKeyValidation Whether to validate host key fingerprint while connecting. If set to `false`, `host_key_fingerprint` must also be set.
         * 
         * @return builder
         * 
         */
        public Builder skipHostKeyValidation(@Nullable Output<Boolean> skipHostKeyValidation) {
            $.skipHostKeyValidation = skipHostKeyValidation;
            return this;
        }

        /**
         * @param skipHostKeyValidation Whether to validate host key fingerprint while connecting. If set to `false`, `host_key_fingerprint` must also be set.
         * 
         * @return builder
         * 
         */
        public Builder skipHostKeyValidation(Boolean skipHostKeyValidation) {
            return skipHostKeyValidation(Output.of(skipHostKeyValidation));
        }

        /**
         * @param username The username used to log on to the SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username used to log on to the SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public LinkedServiceSftpArgs build() {
            if ($.authenticationType == null) {
                throw new MissingRequiredPropertyException("LinkedServiceSftpArgs", "authenticationType");
            }
            if ($.dataFactoryId == null) {
                throw new MissingRequiredPropertyException("LinkedServiceSftpArgs", "dataFactoryId");
            }
            if ($.host == null) {
                throw new MissingRequiredPropertyException("LinkedServiceSftpArgs", "host");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("LinkedServiceSftpArgs", "password");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("LinkedServiceSftpArgs", "port");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("LinkedServiceSftpArgs", "username");
            }
            return $;
        }
    }

}
