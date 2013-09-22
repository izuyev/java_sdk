package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_history_ReturnElement", propOrder = {"transactionId", "paymentSource", "paymentStatus", "paymentDate", "paymentTransType", "paymentCurrency", "paymentAmount", "paymentAmountLeftToApply", "voidingEventNo", "voidableFlag", "paymentApplicationDetails"})
public class PaymentHistoryReturnElement {

    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "payment_source")
    protected String paymentSource;
    @XmlElement(name = "payment_status")
    protected String paymentStatus;
    @XmlElement(name = "payment_date")
    protected String paymentDate;
    @XmlElement(name = "payment_trans_type")
    protected Long paymentTransType;
    @XmlElement(name = "payment_currency")
    protected String paymentCurrency;
    @XmlElement(name = "payment_amount")
    protected Double paymentAmount;
    @XmlElement(name = "payment_amount_left_to_apply")
    protected Double paymentAmountLeftToApply;
    @XmlElement(name = "voiding_event_no")
    protected Long voidingEventNo;
    @XmlElement(name = "voidable_flag")
    protected Long voidableFlag;
    @XmlElement(name = "payment_application_details")
    protected List<PaymentApplicationDetailsReturnElement> paymentApplicationDetails;
    
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public String getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(String value) {
        this.paymentSource = value;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    public Long getPaymentTransType() {
        return paymentTransType;
    }

    public void setPaymentTransType(Long value) {
        this.paymentTransType = value;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String value) {
        this.paymentCurrency = value;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }

    public Double getPaymentAmountLeftToApply() {
        return paymentAmountLeftToApply;
    }

    public void setPaymentAmountLeftToApply(Double value) {
        this.paymentAmountLeftToApply = value;
    }

    public Long getVoidingEventNo() {
        return voidingEventNo;
    }

    public void setVoidingEventNo(Long value) {
        this.voidingEventNo = value;
    }

    public Long getVoidableFlag() {
        return voidableFlag;
    }

    public void setVoidableFlag(Long value) {
        this.voidableFlag = value;
    }

    public List<PaymentApplicationDetailsReturnElement> getPaymentApplicationDetails() {
        if (this.paymentApplicationDetails == null) {
            this.paymentApplicationDetails = new ArrayList<PaymentApplicationDetailsReturnElement>();
        }
        return this.paymentApplicationDetails;
    }
}
