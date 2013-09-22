package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_record_ids_row", propOrder = {
    "clientRecordId"
    })
public class ClientRecordIdsRow {

    @XmlElement(name = "client_record_id")
    protected String clientRecordId;
    public String getClientRecordId() {
        return clientRecordId;
    }

    public void setClientRecordId(String value) {
        this.clientRecordId = value;
    }

    
}
