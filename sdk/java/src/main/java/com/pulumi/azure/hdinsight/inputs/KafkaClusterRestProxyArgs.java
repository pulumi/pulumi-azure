// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class KafkaClusterRestProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterRestProxyArgs Empty = new KafkaClusterRestProxyArgs();

    /**
     * The Azure Active Directory Security Group ID. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="securityGroupId", required=true)
    private Output<String> securityGroupId;

    /**
     * @return The Azure Active Directory Security Group ID. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }

    /**
     * The Azure Active Directory Security Group name. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The `security_group_name` property will be Required in version 3.0 of the AzureRM Provider.
     * 
     */
    @Import(name="securityGroupName", required=true)
    private Output<String> securityGroupName;

    /**
     * @return The Azure Active Directory Security Group name. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The `security_group_name` property will be Required in version 3.0 of the AzureRM Provider.
     * 
     */
    public Output<String> securityGroupName() {
        return this.securityGroupName;
    }

    private KafkaClusterRestProxyArgs() {}

    private KafkaClusterRestProxyArgs(KafkaClusterRestProxyArgs $) {
        this.securityGroupId = $.securityGroupId;
        this.securityGroupName = $.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterRestProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterRestProxyArgs $;

        public Builder() {
            $ = new KafkaClusterRestProxyArgs();
        }

        public Builder(KafkaClusterRestProxyArgs defaults) {
            $ = new KafkaClusterRestProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityGroupId The Azure Active Directory Security Group ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The Azure Active Directory Security Group ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param securityGroupName The Azure Active Directory Security Group name. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The `security_group_name` property will be Required in version 3.0 of the AzureRM Provider.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(Output<String> securityGroupName) {
            $.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * @param securityGroupName The Azure Active Directory Security Group name. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The `security_group_name` property will be Required in version 3.0 of the AzureRM Provider.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(String securityGroupName) {
            return securityGroupName(Output.of(securityGroupName));
        }

        public KafkaClusterRestProxyArgs build() {
            if ($.securityGroupId == null) {
                throw new MissingRequiredPropertyException("KafkaClusterRestProxyArgs", "securityGroupId");
            }
            if ($.securityGroupName == null) {
                throw new MissingRequiredPropertyException("KafkaClusterRestProxyArgs", "securityGroupName");
            }
            return $;
        }
    }

}
