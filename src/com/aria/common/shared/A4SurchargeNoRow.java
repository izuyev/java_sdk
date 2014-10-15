package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_surcharge_no_row", propOrder = {
    "a4SurchargeNo",
    "a4RateScheduleNo"
    })
public class A4SurchargeNoRow {

    @XmlElement(name = "a4_surcharge_no")
    protected Long a4SurchargeNo;
    @XmlElement(name = "a4_rate_schedule_no")
    protected Long a4RateScheduleNo;
    public Long getA4SurchargeNo() {
        return a4SurchargeNo;
    }

    public void setA4SurchargeNo(Long value) {
        this.a4SurchargeNo = value;
    }

    public Long getA4RateScheduleNo() {
        return a4RateScheduleNo;
    }

    public void setA4RateScheduleNo(Long value) {
        this.a4RateScheduleNo = value;
    }

    
}
