package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_surcharge_no_row", propOrder = {
    "a3SurchargeNo",
    "a3RateScheduleNo"
    })
public class A3SurchargeNoRow {

    @XmlElement(name = "a3_surcharge_no")
    protected Long a3SurchargeNo;
    @XmlElement(name = "a3_rate_schedule_no")
    protected Long a3RateScheduleNo;
    public Long getA3SurchargeNo() {
        return a3SurchargeNo;
    }

    public void setA3SurchargeNo(Long value) {
        this.a3SurchargeNo = value;
    }

    public Long getA3RateScheduleNo() {
        return a3RateScheduleNo;
    }

    public void setA3RateScheduleNo(Long value) {
        this.a3RateScheduleNo = value;
    }

    
}
