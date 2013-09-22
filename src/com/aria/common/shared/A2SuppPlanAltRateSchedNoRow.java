package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_plan_alt_rate_sched_no_row", propOrder = {
    "a2SuppPlanAltRateSchedNo"
    })
public class A2SuppPlanAltRateSchedNoRow {

    @XmlElement(name = "a2_supp_plan_alt_rate_sched_no")
    protected Long a2SuppPlanAltRateSchedNo;
    public Long getA2SuppPlanAltRateSchedNo() {
        return a2SuppPlanAltRateSchedNo;
    }

    public void setA2SuppPlanAltRateSchedNo(Long value) {
        this.a2SuppPlanAltRateSchedNo = value;
    }

    
}
