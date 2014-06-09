package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_item_id_row", propOrder = {
    "clientItemIds"
    })
public class ClientItemIdRow {

    @XmlElement(name = "client_item_ids")
    protected String clientItemIds;
    public String getClientItemIds() {
        return clientItemIds;
    }

    public void setClientItemIds(String value) {
        this.clientItemIds = value;
    }

    
}
