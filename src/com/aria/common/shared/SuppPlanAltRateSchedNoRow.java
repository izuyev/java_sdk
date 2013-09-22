package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_alt_rate_sched_no_row", propOrder = {
    "suppPlanAltRateSchedNo"
    })
public class SuppPlanAltRateSchedNoRow {

    @XmlElement(name = "supp_plan_alt_rate_sched_no")
    protected Long suppPlanAltRateSchedNo;
    public Long getSuppPlanAltRateSchedNo() {
        return suppPlanAltRateSchedNo;
    }

    public void setSuppPlanAltRateSchedNo(Long value) {
        this.suppPlanAltRateSchedNo = value;
    }

    
}
