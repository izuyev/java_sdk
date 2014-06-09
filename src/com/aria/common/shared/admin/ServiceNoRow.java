package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_no_row", propOrder = {
    "serviceNos"
    })
public class ServiceNoRow {

    @XmlElement(name = "service_nos")
    protected Long serviceNos;
    public Long getServiceNos() {
        return serviceNos;
    }

    public void setServiceNos(Long value) {
        this.serviceNos = value;
    }

    
}
