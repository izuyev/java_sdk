package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_details_ReturnElement", propOrder = {"paymentId", "processorPaymentId", "acctNo", "userId", "currencyCd", "paymentDate", "amount", "collectionStatusCd", "collectionStatusText", "processorName", "method", "referenceNum", "lastUpdated", "voidingEventNo"})
public class PaymentDetailsReturnElement {

    @XmlElement(name = "payment_id")
    protected Long paymentId;
    @XmlElement(name = "processor_payment_id")
    protected Long processorPaymentId;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "payment_date")
    protected String paymentDate;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "collection_status_cd")
    protected String collectionStatusCd;
    @XmlElement(name = "collection_status_text")
    protected String collectionStatusText;
    @XmlElement(name = "processor_name")
    protected String processorName;
    @XmlElement(name = "method")
    protected String method;
    @XmlElement(name = "reference_num")
    protected String referenceNum;
    @XmlElement(name = "last_updated")
    protected String lastUpdated;
    @XmlElement(name = "voiding_event_no")
    protected Long voidingEventNo;
    
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    public Long getProcessorPaymentId() {
        return processorPaymentId;
    }

    public void setProcessorPaymentId(Long value) {
        this.processorPaymentId = value;
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getCollectionStatusCd() {
        return collectionStatusCd;
    }

    public void setCollectionStatusCd(String value) {
        this.collectionStatusCd = value;
    }

    public String getCollectionStatusText() {
        return collectionStatusText;
    }

    public void setCollectionStatusText(String value) {
        this.collectionStatusText = value;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String value) {
        this.processorName = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String value) {
        this.method = value;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String value) {
        this.referenceNum = value;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    public Long getVoidingEventNo() {
        return voidingEventNo;
    }

    public void setVoidingEventNo(Long value) {
        this.voidingEventNo = value;
    }

    
}
