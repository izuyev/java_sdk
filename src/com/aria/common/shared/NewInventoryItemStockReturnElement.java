package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_inventory_item_stock_ReturnElement", propOrder = {"outItemNo", "outClientSku", "newStockLevel"})
public class NewInventoryItemStockReturnElement {

    @XmlElement(name = "out_item_no")
    protected Long outItemNo;
    @XmlElement(name = "out_client_sku")
    protected String outClientSku;
    @XmlElement(name = "new_stock_level")
    protected Double newStockLevel;
    
    public Long getOutItemNo() {
        return outItemNo;
    }

    public void setOutItemNo(Long value) {
        this.outItemNo = value;
    }

    public String getOutClientSku() {
        return outClientSku;
    }

    public void setOutClientSku(String value) {
        this.outClientSku = value;
    }

    public Double getNewStockLevel() {
        return newStockLevel;
    }

    public void setNewStockLevel(Double value) {
        this.newStockLevel = value;
    }

    
}
