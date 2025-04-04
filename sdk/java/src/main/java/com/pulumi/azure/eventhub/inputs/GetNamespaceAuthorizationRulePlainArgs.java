// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceAuthorizationRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceAuthorizationRulePlainArgs Empty = new GetNamespaceAuthorizationRulePlainArgs();

    /**
     * The name of the EventHub Authorization Rule resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the EventHub Authorization Rule resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the EventHub Namespace.
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return Specifies the name of the EventHub Namespace.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the resource group in which the EventHub Namespace exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Namespace exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNamespaceAuthorizationRulePlainArgs() {}

    private GetNamespaceAuthorizationRulePlainArgs(GetNamespaceAuthorizationRulePlainArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceAuthorizationRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceAuthorizationRulePlainArgs $;

        public Builder() {
            $ = new GetNamespaceAuthorizationRulePlainArgs();
        }

        public Builder(GetNamespaceAuthorizationRulePlainArgs defaults) {
            $ = new GetNamespaceAuthorizationRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the EventHub Authorization Rule resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the EventHub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventHub Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNamespaceAuthorizationRulePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNamespaceAuthorizationRulePlainArgs", "name");
            }
            if ($.namespaceName == null) {
                throw new MissingRequiredPropertyException("GetNamespaceAuthorizationRulePlainArgs", "namespaceName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetNamespaceAuthorizationRulePlainArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
