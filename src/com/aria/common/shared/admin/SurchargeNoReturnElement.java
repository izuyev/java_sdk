package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_no_ReturnElement", propOrder = {"surchargeNos"})
public class SurchargeNoReturnElement {

    @XmlElement(name = "surcharge_nos")
    protected Long surchargeNos;
    
    public Long getSurchargeNos() {
        return surchargeNos;
    }

    public void setSurchargeNos(Long value) {
        this.surchargeNos = value;
    }

    
}
