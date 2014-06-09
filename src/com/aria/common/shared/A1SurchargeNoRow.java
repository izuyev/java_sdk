package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_surcharge_no_row", propOrder = {
    "a1SurchargeNo"
    })
public class A1SurchargeNoRow {

    @XmlElement(name = "a1_surcharge_no")
    protected Long a1SurchargeNo;
    public Long getA1SurchargeNo() {
        return a1SurchargeNo;
    }

    public void setA1SurchargeNo(Long value) {
        this.a1SurchargeNo = value;
    }

    
}
