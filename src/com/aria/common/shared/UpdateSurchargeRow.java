package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_surcharge_row", propOrder = {
    "surchargeNo",
    "surchargeDirective"
    })
public class UpdateSurchargeRow {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "surcharge_directive")
    protected Long surchargeDirective;
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public Long getSurchargeDirective() {
        return surchargeDirective;
    }

    public void setSurchargeDirective(Long value) {
        this.surchargeDirective = value;
    }

    
}
