package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_receipt_ReturnElement", propOrder = {"clientReceiptId", "receiptDate"})
public class AcctReceiptReturnElement {

    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "receipt_date")
    protected String receiptDate;
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String value) {
        this.receiptDate = value;
    }

    
}
