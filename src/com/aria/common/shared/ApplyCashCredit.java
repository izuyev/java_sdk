package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","accountNo","creditAmount","creditReasonCode","comments","specificChargeTransactionId"})
@XmlRootElement(name = "apply_cash_credit")
public class ApplyCashCredit {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "account_no")
    protected Long accountNo;
    @XmlElement(name = "credit_amount")
    protected Double creditAmount;
    @XmlElement(name = "credit_reason_code")
    protected Long creditReasonCode;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "specific_charge_transaction_id")
    protected SpecificChargeTransactionIdArray specificChargeTransactionId;
    
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
    
    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double value) {
        this.creditAmount = value;
    }
    
    public Long getCreditReasonCode() {
        return creditReasonCode;
    }

    public void setCreditReasonCode(Long value) {
        this.creditReasonCode = value;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
    
    public SpecificChargeTransactionIdArray getSpecificChargeTransactionId() {
        return specificChargeTransactionId;
    }

    public void setSpecificChargeTransactionId(SpecificChargeTransactionIdArray value) {
        this.specificChargeTransactionId = value;
    }
    
    
}
