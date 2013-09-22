package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","accountNo","billingIntervalUnits","timesToBill","billingIntervalType","firstBillDate","standingOrder","clientOrderId","clientReceiptId"})
@XmlRootElement(name = "record_standing_order")
public class RecordStandingOrder {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "account_no")
    protected Long accountNo;
    @XmlElement(name = "billing_interval_units")
    protected Long billingIntervalUnits;
    @XmlElement(name = "times_to_bill")
    protected Long timesToBill;
    @XmlElement(name = "billing_interval_type")
    protected String billingIntervalType;
    @XmlElement(name = "first_bill_date")
    protected String firstBillDate;
    @XmlElement(name = "standing_order")
    protected StandingOrderArray standingOrder;
    @XmlElement(name = "client_order_id")
    protected String clientOrderId;
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
    
    public Long getBillingIntervalUnits() {
        return billingIntervalUnits;
    }

    public void setBillingIntervalUnits(Long value) {
        this.billingIntervalUnits = value;
    }
    
    public Long getTimesToBill() {
        return timesToBill;
    }

    public void setTimesToBill(Long value) {
        this.timesToBill = value;
    }
    
    public String getBillingIntervalType() {
        return billingIntervalType;
    }

    public void setBillingIntervalType(String value) {
        this.billingIntervalType = value;
    }
    
    public String getFirstBillDate() {
        return firstBillDate;
    }

    public void setFirstBillDate(String value) {
        this.firstBillDate = value;
    }
    
    public StandingOrderArray getStandingOrder() {
        return standingOrder;
    }

    public void setStandingOrder(StandingOrderArray value) {
        this.standingOrder = value;
    }
    
    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
    
    
}
