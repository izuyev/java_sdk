package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "services_ReturnElement", propOrder = {"serviceNo", "clientServiceId"})
public class ServicesReturnElement {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected Long clientServiceId;
    
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public Long getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(Long value) {
        this.clientServiceId = value;
    }

    
}
