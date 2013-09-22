package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory_item_stock_row", propOrder = {
    "itemNo",
    "clientSku",
    "updateDirective",
    "updateAmount"
    })
public class InventoryItemStockRow {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "update_directive")
    protected Long updateDirective;
    @XmlElement(name = "update_amount")
    protected Double updateAmount;
    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Long getUpdateDirective() {
        return updateDirective;
    }

    public void setUpdateDirective(Long value) {
        this.updateDirective = value;
    }

    public Double getUpdateAmount() {
        return updateAmount;
    }

    public void setUpdateAmount(Double value) {
        this.updateAmount = value;
    }

    
}
