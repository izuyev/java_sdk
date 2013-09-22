package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refund_details_ReturnElement", propOrder = {"refundTransactionId", "refundAmount", "createDate", "createUser", "reasonCode", "reasonLabel", "reasonDescription", "refPaymentTransactionId", "refPaymentTransactionType", "refPaymentTransactionDesc", "refPaymentAmount", "refPaymentRefCode", "billSeqNo", "payMethodId", "payMethodName", "ccId", "ccType", "paymentSrcSuffix", "refundCheckNum", "isVoidedInd", "invoiceReversals"})
public class RefundDetailsReturnElement {

    @XmlElement(name = "refund_transaction_id")
    protected Long refundTransactionId;
    @XmlElement(name = "refund_amount")
    protected Double refundAmount;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "create_user")
    protected String createUser;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "reason_label")
    protected String reasonLabel;
    @XmlElement(name = "reason_description")
    protected String reasonDescription;
    @XmlElement(name = "ref_payment_transaction_id")
    protected Long refPaymentTransactionId;
    @XmlElement(name = "ref_payment_transaction_type")
    protected Long refPaymentTransactionType;
    @XmlElement(name = "ref_payment_transaction_desc")
    protected String refPaymentTransactionDesc;
    @XmlElement(name = "ref_payment_amount")
    protected Double refPaymentAmount;
    @XmlElement(name = "ref_payment_ref_code")
    protected String refPaymentRefCode;
    @XmlElement(name = "bill_seq_no")
    protected Long billSeqNo;
    @XmlElement(name = "pay_method_id")
    protected Long payMethodId;
    @XmlElement(name = "pay_method_name")
    protected String payMethodName;
    @XmlElement(name = "cc_id")
    protected Long ccId;
    @XmlElement(name = "cc_type")
    protected String ccType;
    @XmlElement(name = "payment_src_suffix")
    protected String paymentSrcSuffix;
    @XmlElement(name = "refund_check_num")
    protected String refundCheckNum;
    @XmlElement(name = "is_voided_ind")
    protected Long isVoidedInd;
    @XmlElement(name = "invoice_reversals")
    protected List<InvoiceReversalsReturnElement> invoiceReversals;
    
    public Long getRefundTransactionId() {
        return refundTransactionId;
    }

    public void setRefundTransactionId(Long value) {
        this.refundTransactionId = value;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double value) {
        this.refundAmount = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String value) {
        this.createUser = value;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }

    public String getReasonLabel() {
        return reasonLabel;
    }

    public void setReasonLabel(String value) {
        this.reasonLabel = value;
    }

    public String getReasonDescription() {
        return reasonDescription;
    }

    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

    public Long getRefPaymentTransactionId() {
        return refPaymentTransactionId;
    }

    public void setRefPaymentTransactionId(Long value) {
        this.refPaymentTransactionId = value;
    }

    public Long getRefPaymentTransactionType() {
        return refPaymentTransactionType;
    }

    public void setRefPaymentTransactionType(Long value) {
        this.refPaymentTransactionType = value;
    }

    public String getRefPaymentTransactionDesc() {
        return refPaymentTransactionDesc;
    }

    public void setRefPaymentTransactionDesc(String value) {
        this.refPaymentTransactionDesc = value;
    }

    public Double getRefPaymentAmount() {
        return refPaymentAmount;
    }

    public void setRefPaymentAmount(Double value) {
        this.refPaymentAmount = value;
    }

    public String getRefPaymentRefCode() {
        return refPaymentRefCode;
    }

    public void setRefPaymentRefCode(String value) {
        this.refPaymentRefCode = value;
    }

    public Long getBillSeqNo() {
        return billSeqNo;
    }

    public void setBillSeqNo(Long value) {
        this.billSeqNo = value;
    }

    public Long getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Long value) {
        this.payMethodId = value;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
    }

    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long value) {
        this.ccId = value;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String value) {
        this.ccType = value;
    }

    public String getPaymentSrcSuffix() {
        return paymentSrcSuffix;
    }

    public void setPaymentSrcSuffix(String value) {
        this.paymentSrcSuffix = value;
    }

    public String getRefundCheckNum() {
        return refundCheckNum;
    }

    public void setRefundCheckNum(String value) {
        this.refundCheckNum = value;
    }

    public Long getIsVoidedInd() {
        return isVoidedInd;
    }

    public void setIsVoidedInd(Long value) {
        this.isVoidedInd = value;
    }

    public List<InvoiceReversalsReturnElement> getInvoiceReversals() {
        if (this.invoiceReversals == null) {
            this.invoiceReversals = new ArrayList<InvoiceReversalsReturnElement>();
        }
        return this.invoiceReversals;
    }
}
