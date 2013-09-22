package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_plan_alt_rate_sched_no_row", propOrder = {
    "a3SuppPlanAltRateSchedNo"
    })
public class A3SuppPlanAltRateSchedNoRow {

    @XmlElement(name = "a3_supp_plan_alt_rate_sched_no")
    protected Long a3SuppPlanAltRateSchedNo;
    public Long getA3SuppPlanAltRateSchedNo() {
        return a3SuppPlanAltRateSchedNo;
    }

    public void setA3SuppPlanAltRateSchedNo(Long value) {
        this.a3SuppPlanAltRateSchedNo = value;
    }

    
}
