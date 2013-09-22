package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stat_hist_ReturnElement", propOrder = {"dateEntered", "acctStatus", "newStatus", "comments", "clientReceiptId"})
public class StatHistReturnElement {

    @XmlElement(name = "date_entered")
    protected String dateEntered;
    @XmlElement(name = "acct_status")
    protected String acctStatus;
    @XmlElement(name = "new_status")
    protected String newStatus;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String value) {
        this.dateEntered = value;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String value) {
        this.acctStatus = value;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String value) {
        this.newStatus = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    
}
