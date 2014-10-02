package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_item_id_ReturnElement", propOrder = {"clientItemIds"})
public class ClientItemIdReturnElement {

    @XmlElement(name = "client_item_ids")
    protected Long clientItemIds;
    
    public Long getClientItemIds() {
        return clientItemIds;
    }

    public void setClientItemIds(Long value) {
        this.clientItemIds = value;
    }

    
}
