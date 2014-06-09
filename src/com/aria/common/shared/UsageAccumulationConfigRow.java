package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_accumulation_config_row", propOrder = {
    "usageAccumulationPlanNo",
    "usageAccumulationResetMonths",
    "clientUsageAccumulationPlanId"
    })
public class UsageAccumulationConfigRow {

    @XmlElement(name = "usage_accumulation_plan_no")
    protected Long usageAccumulationPlanNo;
    @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
    @XmlElement(name = "client_usage_accumulation_plan_id")
    protected String clientUsageAccumulationPlanId;
    public Long getUsageAccumulationPlanNo() {
        return usageAccumulationPlanNo;
    }

    public void setUsageAccumulationPlanNo(Long value) {
        this.usageAccumulationPlanNo = value;
    }

    public Long getUsageAccumulationResetMonths() {
        return usageAccumulationResetMonths;
    }

    public void setUsageAccumulationResetMonths(Long value) {
        this.usageAccumulationResetMonths = value;
    }

    public String getClientUsageAccumulationPlanId() {
        return clientUsageAccumulationPlanId;
    }

    public void setClientUsageAccumulationPlanId(String value) {
        this.clientUsageAccumulationPlanId = value;
    }

    
}
