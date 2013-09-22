package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_plan_alt_rate_sched_no_row", propOrder = {
    "a4SuppPlanAltRateSchedNo"
    })
public class A4SuppPlanAltRateSchedNoRow {

    @XmlElement(name = "a4_supp_plan_alt_rate_sched_no")
    protected Long a4SuppPlanAltRateSchedNo;
    public Long getA4SuppPlanAltRateSchedNo() {
        return a4SuppPlanAltRateSchedNo;
    }

    public void setA4SuppPlanAltRateSchedNo(Long value) {
        this.a4SuppPlanAltRateSchedNo = value;
    }

    
}
