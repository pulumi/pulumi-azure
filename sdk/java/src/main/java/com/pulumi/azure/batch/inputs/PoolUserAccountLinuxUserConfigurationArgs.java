// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolUserAccountLinuxUserConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolUserAccountLinuxUserConfigurationArgs Empty = new PoolUserAccountLinuxUserConfigurationArgs();

    /**
     * The user ID of the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     * 
     */
    @Import(name="gid")
    private @Nullable Output<Integer> gid;

    /**
     * @return The user ID of the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     * 
     */
    public Optional<Output<Integer>> gid() {
        return Optional.ofNullable(this.gid);
    }

    /**
     * The SSH private key for the user account. The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool&#39;s enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user&#39;s .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user&#39;s .ssh directory is done).
     * 
     */
    @Import(name="sshPrivateKey")
    private @Nullable Output<String> sshPrivateKey;

    /**
     * @return The SSH private key for the user account. The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool&#39;s enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user&#39;s .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user&#39;s .ssh directory is done).
     * 
     */
    public Optional<Output<String>> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }

    /**
     * The group ID for the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<Integer> uid;

    /**
     * @return The group ID for the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     * 
     */
    public Optional<Output<Integer>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private PoolUserAccountLinuxUserConfigurationArgs() {}

    private PoolUserAccountLinuxUserConfigurationArgs(PoolUserAccountLinuxUserConfigurationArgs $) {
        this.gid = $.gid;
        this.sshPrivateKey = $.sshPrivateKey;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolUserAccountLinuxUserConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolUserAccountLinuxUserConfigurationArgs $;

        public Builder() {
            $ = new PoolUserAccountLinuxUserConfigurationArgs();
        }

        public Builder(PoolUserAccountLinuxUserConfigurationArgs defaults) {
            $ = new PoolUserAccountLinuxUserConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gid The user ID of the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
         * 
         * @return builder
         * 
         */
        public Builder gid(@Nullable Output<Integer> gid) {
            $.gid = gid;
            return this;
        }

        /**
         * @param gid The user ID of the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
         * 
         * @return builder
         * 
         */
        public Builder gid(Integer gid) {
            return gid(Output.of(gid));
        }

        /**
         * @param sshPrivateKey The SSH private key for the user account. The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool&#39;s enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user&#39;s .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user&#39;s .ssh directory is done).
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(@Nullable Output<String> sshPrivateKey) {
            $.sshPrivateKey = sshPrivateKey;
            return this;
        }

        /**
         * @param sshPrivateKey The SSH private key for the user account. The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool&#39;s enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user&#39;s .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user&#39;s .ssh directory is done).
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(String sshPrivateKey) {
            return sshPrivateKey(Output.of(sshPrivateKey));
        }

        /**
         * @param uid The group ID for the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<Integer> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid The group ID for the user account. The `uid` and `gid` properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
         * 
         * @return builder
         * 
         */
        public Builder uid(Integer uid) {
            return uid(Output.of(uid));
        }

        public PoolUserAccountLinuxUserConfigurationArgs build() {
            return $;
        }
    }

}
