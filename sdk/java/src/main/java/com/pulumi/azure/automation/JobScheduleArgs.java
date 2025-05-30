// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    /**
     * The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The UUID identifying the Automation Job Schedule.
     * 
     */
    @Import(name="jobScheduleId")
    private @Nullable Output<String> jobScheduleId;

    /**
     * @return The UUID identifying the Automation Job Schedule.
     * 
     */
    public Optional<Output<String>> jobScheduleId() {
        return Optional.ofNullable(this.jobScheduleId);
    }

    /**
     * A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don&#39;t have this limitation.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don&#39;t have this limitation.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="runOn")
    private @Nullable Output<String> runOn;

    /**
     * @return Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> runOn() {
        return Optional.ofNullable(this.runOn);
    }

    /**
     * The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="runbookName", required=true)
    private Output<String> runbookName;

    /**
     * @return The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> runbookName() {
        return this.runbookName;
    }

    /**
     * The name of the Schedule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scheduleName", required=true)
    private Output<String> scheduleName;

    /**
     * @return The name of the Schedule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scheduleName() {
        return this.scheduleName;
    }

    private JobScheduleArgs() {}

    private JobScheduleArgs(JobScheduleArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.jobScheduleId = $.jobScheduleId;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.runOn = $.runOn;
        this.runbookName = $.runbookName;
        this.scheduleName = $.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobScheduleArgs $;

        public Builder() {
            $ = new JobScheduleArgs();
        }

        public Builder(JobScheduleArgs defaults) {
            $ = new JobScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param jobScheduleId The UUID identifying the Automation Job Schedule.
         * 
         * @return builder
         * 
         */
        public Builder jobScheduleId(@Nullable Output<String> jobScheduleId) {
            $.jobScheduleId = jobScheduleId;
            return this;
        }

        /**
         * @param jobScheduleId The UUID identifying the Automation Job Schedule.
         * 
         * @return builder
         * 
         */
        public Builder jobScheduleId(String jobScheduleId) {
            return jobScheduleId(Output.of(jobScheduleId));
        }

        /**
         * @param parameters A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don&#39;t have this limitation.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don&#39;t have this limitation.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param runOn Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runOn(@Nullable Output<String> runOn) {
            $.runOn = runOn;
            return this;
        }

        /**
         * @param runOn Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runOn(String runOn) {
            return runOn(Output.of(runOn));
        }

        /**
         * @param runbookName The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(Output<String> runbookName) {
            $.runbookName = runbookName;
            return this;
        }

        /**
         * @param runbookName The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(String runbookName) {
            return runbookName(Output.of(runbookName));
        }

        /**
         * @param scheduleName The name of the Schedule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(Output<String> scheduleName) {
            $.scheduleName = scheduleName;
            return this;
        }

        /**
         * @param scheduleName The name of the Schedule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(String scheduleName) {
            return scheduleName(Output.of(scheduleName));
        }

        public JobScheduleArgs build() {
            if ($.automationAccountName == null) {
                throw new MissingRequiredPropertyException("JobScheduleArgs", "automationAccountName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("JobScheduleArgs", "resourceGroupName");
            }
            if ($.runbookName == null) {
                throw new MissingRequiredPropertyException("JobScheduleArgs", "runbookName");
            }
            if ($.scheduleName == null) {
                throw new MissingRequiredPropertyException("JobScheduleArgs", "scheduleName");
            }
            return $;
        }
    }

}
