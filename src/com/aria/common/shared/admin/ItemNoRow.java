package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_no_row", propOrder = {
    "itemNos"
    })
public class ItemNoRow {

    @XmlElement(name = "item_nos")
    protected Long itemNos;
    public Long getItemNos() {
        return itemNos;
    }

    public void setItemNos(Long value) {
        this.itemNos = value;
    }

    
}
