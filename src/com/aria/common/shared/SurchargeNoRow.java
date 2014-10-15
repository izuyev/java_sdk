package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_no_row", propOrder = {
    "surchargeNo",
    "rateScheduleNo"
    })
public class SurchargeNoRow {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
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

    
}
