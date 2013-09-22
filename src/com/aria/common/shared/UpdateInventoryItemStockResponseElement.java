package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "newInventoryItemStock"})
@XmlRootElement(name = "update_inventory_item_stockResponseElement")
public class UpdateInventoryItemStockResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "new_inventory_item_stock")
    protected List<NewInventoryItemStockReturnElement> newInventoryItemStock;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<NewInventoryItemStockReturnElement> getNewInventoryItemStock() {
        if (this.newInventoryItemStock == null) {
            this.newInventoryItemStock = new ArrayList<NewInventoryItemStockReturnElement>();
        }
        return this.newInventoryItemStock;
    }
}
