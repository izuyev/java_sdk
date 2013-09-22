package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_plan_alt_rate_sched_no_row", propOrder = {
    "a1SuppPlanAltRateSchedNo"
    })
public class A1SuppPlanAltRateSchedNoRow {

    @XmlElement(name = "a1_supp_plan_alt_rate_sched_no")
    protected Long a1SuppPlanAltRateSchedNo;
    public Long getA1SuppPlanAltRateSchedNo() {
        return a1SuppPlanAltRateSchedNo;
    }

    public void setA1SuppPlanAltRateSchedNo(Long value) {
        this.a1SuppPlanAltRateSchedNo = value;
    }

    
}
