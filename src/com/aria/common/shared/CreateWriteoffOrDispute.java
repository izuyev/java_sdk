package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","invoiceNo","amount","reasonCode","comments","doDispute","clientReceiptId"})
@XmlRootElement(name = "create_writeoff_or_dispute")
public class CreateWriteoffOrDispute {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "do_dispute")
    protected Long doDispute;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }
    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }
    
    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
    
    public Long getDoDispute() {
        return doDispute;
    }

    public void setDoDispute(Long value) {
        this.doDispute = value;
    }
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
    
    
}
