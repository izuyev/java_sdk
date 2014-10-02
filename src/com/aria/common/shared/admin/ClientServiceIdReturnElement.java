package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_service_id_ReturnElement", propOrder = {"clientServiceIds"})
public class ClientServiceIdReturnElement {

    @XmlElement(name = "client_service_ids")
    protected Long clientServiceIds;
    
    public Long getClientServiceIds() {
        return clientServiceIds;
    }

    public void setClientServiceIds(Long value) {
        this.clientServiceIds = value;
    }

    
}
