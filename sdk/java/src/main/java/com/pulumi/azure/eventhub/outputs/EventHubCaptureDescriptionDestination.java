// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventHubCaptureDescriptionDestination {
    /**
     * @return The Blob naming convention for archiving. e.g. `{Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}`. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    private String archiveNameFormat;
    /**
     * @return The name of the Container within the Blob Storage Account where messages should be archived.
     * 
     */
    private String blobContainerName;
    /**
     * @return The Name of the Destination where the capture should take place. At this time the only supported value is `EventHubArchive.AzureBlockBlob`.
     * 
     */
    private String name;
    /**
     * @return The ID of the Blob Storage Account where messages should be archived.
     * 
     */
    private String storageAccountId;

    private EventHubCaptureDescriptionDestination() {}
    /**
     * @return The Blob naming convention for archiving. e.g. `{Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}`. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    public String archiveNameFormat() {
        return this.archiveNameFormat;
    }
    /**
     * @return The name of the Container within the Blob Storage Account where messages should be archived.
     * 
     */
    public String blobContainerName() {
        return this.blobContainerName;
    }
    /**
     * @return The Name of the Destination where the capture should take place. At this time the only supported value is `EventHubArchive.AzureBlockBlob`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the Blob Storage Account where messages should be archived.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubCaptureDescriptionDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String archiveNameFormat;
        private String blobContainerName;
        private String name;
        private String storageAccountId;
        public Builder() {}
        public Builder(EventHubCaptureDescriptionDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveNameFormat = defaults.archiveNameFormat;
    	      this.blobContainerName = defaults.blobContainerName;
    	      this.name = defaults.name;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder archiveNameFormat(String archiveNameFormat) {
            this.archiveNameFormat = Objects.requireNonNull(archiveNameFormat);
            return this;
        }
        @CustomType.Setter
        public Builder blobContainerName(String blobContainerName) {
            this.blobContainerName = Objects.requireNonNull(blobContainerName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public EventHubCaptureDescriptionDestination build() {
            final var o = new EventHubCaptureDescriptionDestination();
            o.archiveNameFormat = archiveNameFormat;
            o.blobContainerName = blobContainerName;
            o.name = name;
            o.storageAccountId = storageAccountId;
            return o;
        }
    }
}