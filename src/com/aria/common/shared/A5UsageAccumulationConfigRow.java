package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_usage_accumulation_config_row", propOrder = {
    "a5UsageAccumulationPlanNo",
    "a5UsageAccumulationResetMonths",
    "a5ClientUsgAccumPlanId"
    })
public class A5UsageAccumulationConfigRow {

    @XmlElement(name = "a5_usage_accumulation_plan_no")
    protected Long a5UsageAccumulationPlanNo;
    @XmlElement(name = "a5_usage_accumulation_reset_months")
    protected Long a5UsageAccumulationResetMonths;
    @XmlElement(name = "a5_client_usg_accum_plan_id")
    protected String a5ClientUsgAccumPlanId;
    public Long getA5UsageAccumulationPlanNo() {
        return a5UsageAccumulationPlanNo;
    }

    public void setA5UsageAccumulationPlanNo(Long value) {
        this.a5UsageAccumulationPlanNo = value;
    }

    public Long getA5UsageAccumulationResetMonths() {
        return a5UsageAccumulationResetMonths;
    }

    public void setA5UsageAccumulationResetMonths(Long value) {
        this.a5UsageAccumulationResetMonths = value;
    }

    public String getA5ClientUsgAccumPlanId() {
        return a5ClientUsgAccumPlanId;
    }

    public void setA5ClientUsgAccumPlanId(String value) {
        this.a5ClientUsgAccumPlanId = value;
    }

    
}
