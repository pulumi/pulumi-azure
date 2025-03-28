// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.SparkClusterRolesHeadNode;
import com.pulumi.azure.hdinsight.outputs.SparkClusterRolesWorkerNode;
import com.pulumi.azure.hdinsight.outputs.SparkClusterRolesZookeeperNode;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class SparkClusterRoles {
    /**
     * @return A `head_node` block as defined above.
     * 
     */
    private SparkClusterRolesHeadNode headNode;
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    private SparkClusterRolesWorkerNode workerNode;
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    private SparkClusterRolesZookeeperNode zookeeperNode;

    private SparkClusterRoles() {}
    /**
     * @return A `head_node` block as defined above.
     * 
     */
    public SparkClusterRolesHeadNode headNode() {
        return this.headNode;
    }
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    public SparkClusterRolesWorkerNode workerNode() {
        return this.workerNode;
    }
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    public SparkClusterRolesZookeeperNode zookeeperNode() {
        return this.zookeeperNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterRoles defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SparkClusterRolesHeadNode headNode;
        private SparkClusterRolesWorkerNode workerNode;
        private SparkClusterRolesZookeeperNode zookeeperNode;
        public Builder() {}
        public Builder(SparkClusterRoles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headNode = defaults.headNode;
    	      this.workerNode = defaults.workerNode;
    	      this.zookeeperNode = defaults.zookeeperNode;
        }

        @CustomType.Setter
        public Builder headNode(SparkClusterRolesHeadNode headNode) {
            if (headNode == null) {
              throw new MissingRequiredPropertyException("SparkClusterRoles", "headNode");
            }
            this.headNode = headNode;
            return this;
        }
        @CustomType.Setter
        public Builder workerNode(SparkClusterRolesWorkerNode workerNode) {
            if (workerNode == null) {
              throw new MissingRequiredPropertyException("SparkClusterRoles", "workerNode");
            }
            this.workerNode = workerNode;
            return this;
        }
        @CustomType.Setter
        public Builder zookeeperNode(SparkClusterRolesZookeeperNode zookeeperNode) {
            if (zookeeperNode == null) {
              throw new MissingRequiredPropertyException("SparkClusterRoles", "zookeeperNode");
            }
            this.zookeeperNode = zookeeperNode;
            return this;
        }
        public SparkClusterRoles build() {
            final var _resultValue = new SparkClusterRoles();
            _resultValue.headNode = headNode;
            _resultValue.workerNode = workerNode;
            _resultValue.zookeeperNode = zookeeperNode;
            return _resultValue;
        }
    }
}
