package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "userId",    "startBillDate",    "endBillDate",    "includeVoided"})
@XmlRootElement(name = "get_acct_invoice_history")
public class GetAcctInvoiceHistory {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "user_id")
    protected String userId;
        @XmlElement(name = "start_bill_date")
    protected String startBillDate;
        @XmlElement(name = "end_bill_date")
    protected String endBillDate;
        @XmlElement(name = "include_voided")
    protected String includeVoided;
    
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
            public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }
            public String getStartBillDate() {
        return startBillDate;
    }

    public void setStartBillDate(String value) {
        this.startBillDate = value;
    }
            public String getEndBillDate() {
        return endBillDate;
    }

    public void setEndBillDate(String value) {
        this.endBillDate = value;
    }
            public String getIncludeVoided() {
        return includeVoided;
    }

    public void setIncludeVoided(String value) {
        this.includeVoided = value;
    }
            
}
