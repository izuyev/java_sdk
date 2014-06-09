package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_usage_accumulation_config_row", propOrder = {
    "a4UsageAccumulationPlanNo",
    "a4UsageAccumulationResetMonths",
    "a4ClientUsgAccumPlanId"
    })
public class A4UsageAccumulationConfigRow {

    @XmlElement(name = "a4_usage_accumulation_plan_no")
    protected Long a4UsageAccumulationPlanNo;
    @XmlElement(name = "a4_usage_accumulation_reset_months")
    protected Long a4UsageAccumulationResetMonths;
    @XmlElement(name = "a4_client_usg_accum_plan_id")
    protected String a4ClientUsgAccumPlanId;
    public Long getA4UsageAccumulationPlanNo() {
        return a4UsageAccumulationPlanNo;
    }

    public void setA4UsageAccumulationPlanNo(Long value) {
        this.a4UsageAccumulationPlanNo = value;
    }

    public Long getA4UsageAccumulationResetMonths() {
        return a4UsageAccumulationResetMonths;
    }

    public void setA4UsageAccumulationResetMonths(Long value) {
        this.a4UsageAccumulationResetMonths = value;
    }

    public String getA4ClientUsgAccumPlanId() {
        return a4ClientUsgAccumPlanId;
    }

    public void setA4ClientUsgAccumPlanId(String value) {
        this.a4ClientUsgAccumPlanId = value;
    }

    
}
