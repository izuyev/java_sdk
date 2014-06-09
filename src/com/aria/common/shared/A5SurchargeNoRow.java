package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_surcharge_no_row", propOrder = {
    "a5SurchargeNo"
    })
public class A5SurchargeNoRow {

    @XmlElement(name = "a5_surcharge_no")
    protected Long a5SurchargeNo;
    public Long getA5SurchargeNo() {
        return a5SurchargeNo;
    }

    public void setA5SurchargeNo(Long value) {
        this.a5SurchargeNo = value;
    }

    
}
