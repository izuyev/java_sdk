package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_surcharge_no_row", propOrder = {
    "a4SurchargeNo"
    })
public class A4SurchargeNoRow {

    @XmlElement(name = "a4_surcharge_no")
    protected Long a4SurchargeNo;
    public Long getA4SurchargeNo() {
        return a4SurchargeNo;
    }

    public void setA4SurchargeNo(Long value) {
        this.a4SurchargeNo = value;
    }

    
}
