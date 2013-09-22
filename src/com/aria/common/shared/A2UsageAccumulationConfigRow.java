package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_usage_accumulation_config_row", propOrder = {
    "a2UsageAccumulationPlanNo",
    "a2UsageAccumulationResetMonths"
    })
public class A2UsageAccumulationConfigRow {

    @XmlElement(name = "a2_usage_accumulation_plan_no")
    protected Long a2UsageAccumulationPlanNo;
    @XmlElement(name = "a2_usage_accumulation_reset_months")
    protected Long a2UsageAccumulationResetMonths;
    public Long getA2UsageAccumulationPlanNo() {
        return a2UsageAccumulationPlanNo;
    }

    public void setA2UsageAccumulationPlanNo(Long value) {
        this.a2UsageAccumulationPlanNo = value;
    }

    public Long getA2UsageAccumulationResetMonths() {
        return a2UsageAccumulationResetMonths;
    }

    public void setA2UsageAccumulationResetMonths(Long value) {
        this.a2UsageAccumulationResetMonths = value;
    }

    
}
