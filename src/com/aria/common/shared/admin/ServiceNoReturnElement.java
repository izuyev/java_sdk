package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_no_ReturnElement", propOrder = {"serviceNos"})
public class ServiceNoReturnElement {

    @XmlElement(name = "service_nos")
    protected Long serviceNos;
    
    public Long getServiceNos() {
        return serviceNos;
    }

    public void setServiceNos(Long value) {
        this.serviceNos = value;
    }

    
}
