package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "userid",    "clientAcctId",    "recurringCreditNo",    "cancelComments"})
@XmlRootElement(name = "cancel_recurring_credits")
public class CancelRecurringCredits {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "userid")
    protected String userid;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "recurring_credit_no")
    protected RecurringCreditNoArray recurringCreditNo;
        @XmlElement(name = "cancel_comments")
    protected String cancelComments;
    
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
            public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public RecurringCreditNoArray getRecurringCreditNo() {
        return recurringCreditNo;
    }

    public void setRecurringCreditNo(RecurringCreditNoArray value) {
        this.recurringCreditNo = value;
    }
            public String getCancelComments() {
        return cancelComments;
    }

    public void setCancelComments(String value) {
        this.cancelComments = value;
    }
            
}
