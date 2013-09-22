package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_receipt_ReturnElement", propOrder = {"clientReceiptId", "acctNo", "receiptDate"})
public class ClientReceiptReturnElement {

    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "receipt_date")
    protected String receiptDate;
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String value) {
        this.receiptDate = value;
    }

    
}
