// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.SharedImageGallerySharingCommunityGalleryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedImageGallerySharingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedImageGallerySharingArgs Empty = new SharedImageGallerySharingArgs();

    /**
     * A `community_gallery` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `community_gallery` must be set when `permission` is set to `Community`.
     * 
     */
    @Import(name="communityGallery")
    private @Nullable Output<SharedImageGallerySharingCommunityGalleryArgs> communityGallery;

    /**
     * @return A `community_gallery` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `community_gallery` must be set when `permission` is set to `Community`.
     * 
     */
    public Optional<Output<SharedImageGallerySharingCommunityGalleryArgs>> communityGallery() {
        return Optional.ofNullable(this.communityGallery);
    }

    /**
     * The permission of the Shared Image Gallery when sharing. Possible values are `Community`, `Groups` and `Private`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This requires that the Preview Feature `Microsoft.Compute/CommunityGalleries` is enabled, see [the documentation](https://learn.microsoft.com/azure/virtual-machines/share-gallery-community?tabs=cli) for more information.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return The permission of the Shared Image Gallery when sharing. Possible values are `Community`, `Groups` and `Private`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This requires that the Preview Feature `Microsoft.Compute/CommunityGalleries` is enabled, see [the documentation](https://learn.microsoft.com/azure/virtual-machines/share-gallery-community?tabs=cli) for more information.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    private SharedImageGallerySharingArgs() {}

    private SharedImageGallerySharingArgs(SharedImageGallerySharingArgs $) {
        this.communityGallery = $.communityGallery;
        this.permission = $.permission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedImageGallerySharingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedImageGallerySharingArgs $;

        public Builder() {
            $ = new SharedImageGallerySharingArgs();
        }

        public Builder(SharedImageGallerySharingArgs defaults) {
            $ = new SharedImageGallerySharingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param communityGallery A `community_gallery` block as defined below. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** `community_gallery` must be set when `permission` is set to `Community`.
         * 
         * @return builder
         * 
         */
        public Builder communityGallery(@Nullable Output<SharedImageGallerySharingCommunityGalleryArgs> communityGallery) {
            $.communityGallery = communityGallery;
            return this;
        }

        /**
         * @param communityGallery A `community_gallery` block as defined below. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** `community_gallery` must be set when `permission` is set to `Community`.
         * 
         * @return builder
         * 
         */
        public Builder communityGallery(SharedImageGallerySharingCommunityGalleryArgs communityGallery) {
            return communityGallery(Output.of(communityGallery));
        }

        /**
         * @param permission The permission of the Shared Image Gallery when sharing. Possible values are `Community`, `Groups` and `Private`. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** This requires that the Preview Feature `Microsoft.Compute/CommunityGalleries` is enabled, see [the documentation](https://learn.microsoft.com/azure/virtual-machines/share-gallery-community?tabs=cli) for more information.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission The permission of the Shared Image Gallery when sharing. Possible values are `Community`, `Groups` and `Private`. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** This requires that the Preview Feature `Microsoft.Compute/CommunityGalleries` is enabled, see [the documentation](https://learn.microsoft.com/azure/virtual-machines/share-gallery-community?tabs=cli) for more information.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public SharedImageGallerySharingArgs build() {
            if ($.permission == null) {
                throw new MissingRequiredPropertyException("SharedImageGallerySharingArgs", "permission");
            }
            return $;
        }
    }

}
