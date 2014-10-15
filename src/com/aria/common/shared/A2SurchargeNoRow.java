package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_surcharge_no_row", propOrder = {
    "a2SurchargeNo",
    "a2RateScheduleNo"
    })
public class A2SurchargeNoRow {

    @XmlElement(name = "a2_surcharge_no")
    protected Long a2SurchargeNo;
    @XmlElement(name = "a2_rate_schedule_no")
    protected Long a2RateScheduleNo;
    public Long getA2SurchargeNo() {
        return a2SurchargeNo;
    }

    public void setA2SurchargeNo(Long value) {
        this.a2SurchargeNo = value;
    }

    public Long getA2RateScheduleNo() {
        return a2RateScheduleNo;
    }

    public void setA2RateScheduleNo(Long value) {
        this.a2RateScheduleNo = value;
    }

    
}
