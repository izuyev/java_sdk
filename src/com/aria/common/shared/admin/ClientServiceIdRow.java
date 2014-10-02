package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_service_id_row", propOrder = {
    "clientServiceIds"
    })
public class ClientServiceIdRow {

    @XmlElement(name = "client_service_ids")
    protected String clientServiceIds;
    public String getClientServiceIds() {
        return clientServiceIds;
    }

    public void setClientServiceIds(String value) {
        this.clientServiceIds = value;
    }

    
}
