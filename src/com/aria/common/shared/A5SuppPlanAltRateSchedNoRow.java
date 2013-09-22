package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_plan_alt_rate_sched_no_row", propOrder = {
    "a5SuppPlanAltRateSchedNo"
    })
public class A5SuppPlanAltRateSchedNoRow {

    @XmlElement(name = "a5_supp_plan_alt_rate_sched_no")
    protected Long a5SuppPlanAltRateSchedNo;
    public Long getA5SuppPlanAltRateSchedNo() {
        return a5SuppPlanAltRateSchedNo;
    }

    public void setA5SuppPlanAltRateSchedNo(Long value) {
        this.a5SuppPlanAltRateSchedNo = value;
    }

    
}
