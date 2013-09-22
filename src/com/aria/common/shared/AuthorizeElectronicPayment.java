package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","accountNumber","amount","paymentSource","cvv","billSeq","intrackingnumber","inauthvalue","altClientAcctGroupId","trackData1","trackData2"})
@XmlRootElement(name = "authorize_electronic_payment")
public class AuthorizeElectronicPayment {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "account_number")
    protected Long accountNumber;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "payment_source")
    protected Long paymentSource;
    @XmlElement(name = "CVV")
    protected String cvv;
    @XmlElement(name = "bill_seq")
    protected Long billSeq;
    @XmlElement(name = "inTrackingNumber")
    protected String intrackingnumber;
    @XmlElement(name = "inAuthValue")
    protected String inauthvalue;
    @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
    @XmlElement(name = "track_data1")
    protected String trackData1;
    @XmlElement(name = "track_data2")
    protected String trackData2;
    
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

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }
    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }
    
    public Long getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(Long value) {
        this.paymentSource = value;
    }
    
    public String getCVV() {
        return cvv;
    }

    public void setCVV(String value) {
        this.cvv = value;
    }
    
    public Long getBillSeq() {
        return billSeq;
    }

    public void setBillSeq(Long value) {
        this.billSeq = value;
    }
    
    public String getInTrackingNumber() {
        return intrackingnumber;
    }

    public void setInTrackingNumber(String value) {
        this.intrackingnumber = value;
    }
    
    public String getInAuthValue() {
        return inauthvalue;
    }

    public void setInAuthValue(String value) {
        this.inauthvalue = value;
    }
    
    public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
    }
    
    public String getTrackData1() {
        return trackData1;
    }

    public void setTrackData1(String value) {
        this.trackData1 = value;
    }
    
    public String getTrackData2() {
        return trackData2;
    }

    public void setTrackData2(String value) {
        this.trackData2 = value;
    }
    
    
}
