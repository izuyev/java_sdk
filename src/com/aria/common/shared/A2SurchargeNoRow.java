package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_surcharge_no_row", propOrder = {
    "a2SurchargeNo"
    })
public class A2SurchargeNoRow {

    @XmlElement(name = "a2_surcharge_no")
    protected Long a2SurchargeNo;
    public Long getA2SurchargeNo() {
        return a2SurchargeNo;
    }

    public void setA2SurchargeNo(Long value) {
        this.a2SurchargeNo = value;
    }

    
}
