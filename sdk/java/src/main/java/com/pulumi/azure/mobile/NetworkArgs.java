// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * Specifies the Azure Region where the Mobile Network should exist. Changing this forces a new Mobile Network to be created. The possible values are `eastus` and `northeurope`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Mobile Network should exist. Changing this forces a new Mobile Network to be created. The possible values are `eastus` and `northeurope`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Mobile country code (MCC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
     * 
     */
    @Import(name="mobileCountryCode", required=true)
    private Output<String> mobileCountryCode;

    /**
     * @return Mobile country code (MCC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
     * 
     */
    public Output<String> mobileCountryCode() {
        return this.mobileCountryCode;
    }

    /**
     * Mobile network code (MNC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
     * 
     */
    @Import(name="mobileNetworkCode", required=true)
    private Output<String> mobileNetworkCode;

    /**
     * @return Mobile network code (MNC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
     * 
     */
    public Output<String> mobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    /**
     * Specifies the name which should be used for this Mobile Network. Changing this forces a new Mobile Network to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Mobile Network. Changing this forces a new Mobile Network to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Resource Group where the Mobile Network should exist. Changing this forces a new Mobile Network to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Mobile Network should exist. Changing this forces a new Mobile Network to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags which should be assigned to the Mobile Network.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkArgs() {}

    private NetworkArgs(NetworkArgs $) {
        this.location = $.location;
        this.mobileCountryCode = $.mobileCountryCode;
        this.mobileNetworkCode = $.mobileNetworkCode;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkArgs $;

        public Builder() {
            $ = new NetworkArgs();
        }

        public Builder(NetworkArgs defaults) {
            $ = new NetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network should exist. Changing this forces a new Mobile Network to be created. The possible values are `eastus` and `northeurope`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network should exist. Changing this forces a new Mobile Network to be created. The possible values are `eastus` and `northeurope`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mobileCountryCode Mobile country code (MCC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileCountryCode(Output<String> mobileCountryCode) {
            $.mobileCountryCode = mobileCountryCode;
            return this;
        }

        /**
         * @param mobileCountryCode Mobile country code (MCC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            return mobileCountryCode(Output.of(mobileCountryCode));
        }

        /**
         * @param mobileNetworkCode Mobile network code (MNC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkCode(Output<String> mobileNetworkCode) {
            $.mobileNetworkCode = mobileNetworkCode;
            return this;
        }

        /**
         * @param mobileNetworkCode Mobile network code (MNC), defined in https://www.itu.int/rec/T-REC-E.212 . Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkCode(String mobileNetworkCode) {
            return mobileNetworkCode(Output.of(mobileNetworkCode));
        }

        /**
         * @param name Specifies the name which should be used for this Mobile Network. Changing this forces a new Mobile Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Mobile Network. Changing this forces a new Mobile Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Mobile Network should exist. Changing this forces a new Mobile Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Mobile Network should exist. Changing this forces a new Mobile Network to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkArgs build() {
            if ($.mobileCountryCode == null) {
                throw new MissingRequiredPropertyException("NetworkArgs", "mobileCountryCode");
            }
            if ($.mobileNetworkCode == null) {
                throw new MissingRequiredPropertyException("NetworkArgs", "mobileNetworkCode");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("NetworkArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
