package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_surcharge_no_row", propOrder = {
    "a5SurchargeNo",
    "a5RateScheduleNo"
    })
public class A5SurchargeNoRow {

    @XmlElement(name = "a5_surcharge_no")
    protected Long a5SurchargeNo;
    @XmlElement(name = "a5_rate_schedule_no")
    protected Long a5RateScheduleNo;
    public Long getA5SurchargeNo() {
        return a5SurchargeNo;
    }

    public void setA5SurchargeNo(Long value) {
        this.a5SurchargeNo = value;
    }

    public Long getA5RateScheduleNo() {
        return a5RateScheduleNo;
    }

    public void setA5RateScheduleNo(Long value) {
        this.a5RateScheduleNo = value;
    }

    
}
