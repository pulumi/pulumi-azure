// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DicomServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final DicomServiceIdentityArgs Empty = new DicomServiceIdentityArgs();

    /**
     * A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The type of identity used for the Healthcare DICOM service. Possible values are `SystemAssigned` and `UserAssigned`. If `UserAssigned` is set, an `identity_ids` must be set as well.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of identity used for the Healthcare DICOM service. Possible values are `SystemAssigned` and `UserAssigned`. If `UserAssigned` is set, an `identity_ids` must be set as well.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DicomServiceIdentityArgs() {}

    private DicomServiceIdentityArgs(DicomServiceIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DicomServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomServiceIdentityArgs $;

        public Builder() {
            $ = new DicomServiceIdentityArgs();
        }

        public Builder(DicomServiceIdentityArgs defaults) {
            $ = new DicomServiceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds A list of User Assigned Identity IDs which should be assigned to this Healthcare DICOM service.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type The type of identity used for the Healthcare DICOM service. Possible values are `SystemAssigned` and `UserAssigned`. If `UserAssigned` is set, an `identity_ids` must be set as well.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of identity used for the Healthcare DICOM service. Possible values are `SystemAssigned` and `UserAssigned`. If `UserAssigned` is set, an `identity_ids` must be set as well.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DicomServiceIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}