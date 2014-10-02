package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "statusCd",    "queueDays",    "queueDate",    "forceBillDateReset",    "comments",    "clientReceiptId",    "altDoDunning",    "statusDegradeDate"})
@XmlRootElement(name = "update_acct_status")
public class UpdateAcctStatus {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "status_cd")
    protected Long statusCd;
        @XmlElement(name = "queue_days")
    protected Long queueDays;
        @XmlElement(name = "queue_date")
    protected String queueDate;
        @XmlElement(name = "force_bill_date_reset")
    protected Long forceBillDateReset;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "alt_do_dunning")
    protected String altDoDunning;
        @XmlElement(name = "status_degrade_date")
    protected String statusDegradeDate;
    
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
            public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }
            public Long getQueueDays() {
        return queueDays;
    }

    public void setQueueDays(Long value) {
        this.queueDays = value;
    }
            public String getQueueDate() {
        return queueDate;
    }

    public void setQueueDate(String value) {
        this.queueDate = value;
    }
            public Long getForceBillDateReset() {
        return forceBillDateReset;
    }

    public void setForceBillDateReset(Long value) {
        this.forceBillDateReset = value;
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
            public String getAltDoDunning() {
        return altDoDunning;
    }

    public void setAltDoDunning(String value) {
        this.altDoDunning = value;
    }
            public String getStatusDegradeDate() {
        return statusDegradeDate;
    }

    public void setStatusDegradeDate(String value) {
        this.statusDegradeDate = value;
    }
            
}
