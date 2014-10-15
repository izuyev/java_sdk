package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_surcharges_row", propOrder = {
    "surchargeNo",
    "rateScheduleNo",
    "surchargeSuppPlanNo"
    })
public class SuppPlanSurchargesRow {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "surcharge_supp_plan_no")
    protected Long surchargeSuppPlanNo;
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    public Long getSurchargeSuppPlanNo() {
        return surchargeSuppPlanNo;
    }

    public void setSurchargeSuppPlanNo(Long value) {
        this.surchargeSuppPlanNo = value;
    }

    
}
