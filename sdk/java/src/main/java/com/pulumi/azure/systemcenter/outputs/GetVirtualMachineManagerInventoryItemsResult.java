// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.systemcenter.outputs;

import com.pulumi.azure.systemcenter.outputs.GetVirtualMachineManagerInventoryItemsInventoryItem;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualMachineManagerInventoryItemsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return One or more `inventory_items` blocks as defined below.
     * 
     */
    private List<GetVirtualMachineManagerInventoryItemsInventoryItem> inventoryItems;
    private String inventoryType;
    private String systemCenterVirtualMachineManagerServerId;

    private GetVirtualMachineManagerInventoryItemsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return One or more `inventory_items` blocks as defined below.
     * 
     */
    public List<GetVirtualMachineManagerInventoryItemsInventoryItem> inventoryItems() {
        return this.inventoryItems;
    }
    public String inventoryType() {
        return this.inventoryType;
    }
    public String systemCenterVirtualMachineManagerServerId() {
        return this.systemCenterVirtualMachineManagerServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineManagerInventoryItemsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetVirtualMachineManagerInventoryItemsInventoryItem> inventoryItems;
        private String inventoryType;
        private String systemCenterVirtualMachineManagerServerId;
        public Builder() {}
        public Builder(GetVirtualMachineManagerInventoryItemsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inventoryItems = defaults.inventoryItems;
    	      this.inventoryType = defaults.inventoryType;
    	      this.systemCenterVirtualMachineManagerServerId = defaults.systemCenterVirtualMachineManagerServerId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVirtualMachineManagerInventoryItemsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder inventoryItems(List<GetVirtualMachineManagerInventoryItemsInventoryItem> inventoryItems) {
            if (inventoryItems == null) {
              throw new MissingRequiredPropertyException("GetVirtualMachineManagerInventoryItemsResult", "inventoryItems");
            }
            this.inventoryItems = inventoryItems;
            return this;
        }
        public Builder inventoryItems(GetVirtualMachineManagerInventoryItemsInventoryItem... inventoryItems) {
            return inventoryItems(List.of(inventoryItems));
        }
        @CustomType.Setter
        public Builder inventoryType(String inventoryType) {
            if (inventoryType == null) {
              throw new MissingRequiredPropertyException("GetVirtualMachineManagerInventoryItemsResult", "inventoryType");
            }
            this.inventoryType = inventoryType;
            return this;
        }
        @CustomType.Setter
        public Builder systemCenterVirtualMachineManagerServerId(String systemCenterVirtualMachineManagerServerId) {
            if (systemCenterVirtualMachineManagerServerId == null) {
              throw new MissingRequiredPropertyException("GetVirtualMachineManagerInventoryItemsResult", "systemCenterVirtualMachineManagerServerId");
            }
            this.systemCenterVirtualMachineManagerServerId = systemCenterVirtualMachineManagerServerId;
            return this;
        }
        public GetVirtualMachineManagerInventoryItemsResult build() {
            final var _resultValue = new GetVirtualMachineManagerInventoryItemsResult();
            _resultValue.id = id;
            _resultValue.inventoryItems = inventoryItems;
            _resultValue.inventoryType = inventoryType;
            _resultValue.systemCenterVirtualMachineManagerServerId = systemCenterVirtualMachineManagerServerId;
            return _resultValue;
        }
    }
}
