package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundable_payments_ReturnElement", propOrder = {"paymentTransactionId", "paymentDate", "paymentDescription", "paymentAmount", "paymentRefundedAmount", "paymentRefundableAmount"})
public class RefundablePaymentsReturnElement {

    @XmlElement(name = "payment_transaction_id")
    protected Long paymentTransactionId;
    @XmlElement(name = "payment_date")
    protected String paymentDate;
    @XmlElement(name = "payment_description")
    protected String paymentDescription;
    @XmlElement(name = "payment_amount")
    protected Double paymentAmount;
    @XmlElement(name = "payment_refunded_amount")
    protected Double paymentRefundedAmount;
    @XmlElement(name = "payment_refundable_amount")
    protected Double paymentRefundableAmount;
    
    public Long getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(Long value) {
        this.paymentTransactionId = value;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }

    public Double getPaymentRefundedAmount() {
        return paymentRefundedAmount;
    }

    public void setPaymentRefundedAmount(Double value) {
        this.paymentRefundedAmount = value;
    }

    public Double getPaymentRefundableAmount() {
        return paymentRefundableAmount;
    }

    public void setPaymentRefundableAmount(Double value) {
        this.paymentRefundableAmount = value;
    }

    
}
