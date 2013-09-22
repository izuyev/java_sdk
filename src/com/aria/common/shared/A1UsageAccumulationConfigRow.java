package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_usage_accumulation_config_row", propOrder = {
    "a1UsageAccumulationPlanNo",
    "a1UsageAccumulationResetMonths"
    })
public class A1UsageAccumulationConfigRow {

    @XmlElement(name = "a1_usage_accumulation_plan_no")
    protected Long a1UsageAccumulationPlanNo;
    @XmlElement(name = "a1_usage_accumulation_reset_months")
    protected Long a1UsageAccumulationResetMonths;
    public Long getA1UsageAccumulationPlanNo() {
        return a1UsageAccumulationPlanNo;
    }

    public void setA1UsageAccumulationPlanNo(Long value) {
        this.a1UsageAccumulationPlanNo = value;
    }

    public Long getA1UsageAccumulationResetMonths() {
        return a1UsageAccumulationResetMonths;
    }

    public void setA1UsageAccumulationResetMonths(Long value) {
        this.a1UsageAccumulationResetMonths = value;
    }

    
}
