package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "totalAmount", "openChargeItems"})
@XmlRootElement(name = "get_acct_open_chargesResponseElement")
public class GetAcctOpenChargesResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "total_amount")
    protected Double totalAmount;
    @XmlElement(name = "open_charge_items")
    protected List<OpenChargeItemsReturnElement> openChargeItems;
    
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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    public List<OpenChargeItemsReturnElement> getOpenChargeItems() {
        if (this.openChargeItems == null) {
            this.openChargeItems = new ArrayList<OpenChargeItemsReturnElement>();
        }
        return this.openChargeItems;
    }
}
