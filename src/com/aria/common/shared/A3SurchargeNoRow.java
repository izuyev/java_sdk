package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_surcharge_no_row", propOrder = {
    "a3SurchargeNo"
    })
public class A3SurchargeNoRow {

    @XmlElement(name = "a3_surcharge_no")
    protected Long a3SurchargeNo;
    public Long getA3SurchargeNo() {
        return a3SurchargeNo;
    }

    public void setA3SurchargeNo(Long value) {
        this.a3SurchargeNo = value;
    }

    
}
