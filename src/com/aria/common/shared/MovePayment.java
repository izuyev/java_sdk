package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","accountNo","paymentId","specificChargeTransactionId"})
@XmlRootElement(name = "move_payment")
public class MovePayment {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "account_no")
    protected Long accountNo;
    @XmlElement(name = "payment_id")
    protected Long paymentId;
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
    
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long value) {
        this.paymentId = value;
    }
    
    public SpecificChargeTransactionIdArray getSpecificChargeTransactionId() {
        return specificChargeTransactionId;
    }

    public void setSpecificChargeTransactionId(SpecificChargeTransactionIdArray value) {
        this.specificChargeTransactionId = value;
    }
    
    
}
