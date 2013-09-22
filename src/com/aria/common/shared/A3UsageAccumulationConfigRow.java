package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_usage_accumulation_config_row", propOrder = {
    "a3UsageAccumulationPlanNo",
    "a3UsageAccumulationResetMonths"
    })
public class A3UsageAccumulationConfigRow {

    @XmlElement(name = "a3_usage_accumulation_plan_no")
    protected Long a3UsageAccumulationPlanNo;
    @XmlElement(name = "a3_usage_accumulation_reset_months")
    protected Long a3UsageAccumulationResetMonths;
    public Long getA3UsageAccumulationPlanNo() {
        return a3UsageAccumulationPlanNo;
    }

    public void setA3UsageAccumulationPlanNo(Long value) {
        this.a3UsageAccumulationPlanNo = value;
    }

    public Long getA3UsageAccumulationResetMonths() {
        return a3UsageAccumulationResetMonths;
    }

    public void setA3UsageAccumulationResetMonths(Long value) {
        this.a3UsageAccumulationResetMonths = value;
    }

    
}
