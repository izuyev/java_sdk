package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refund_information_ReturnElement", propOrder = {"ariaEventNo", "acctNo", "userId", "refundAmount", "createDate", "createUser", "refundReasonCode", "refundReasonLabel", "refundReasonDescription", "currencyCd", "ariaStatementNo", "refPaymentEventNo", "refPaymentTransactionType", "refPaymentTransactionDesc", "refPaymentAmount", "refundTransactionType", "refundTransactionDesc", "refundCheckNum", "refundBillSeqNo", "refundPayMethodId", "refundPayMethodName", "refundCcId", "refundCcType", "refundPaymentSrcSuffix", "refundIsVoidedInd"})
public class RefundInformationReturnElement {

    @XmlElement(name = "aria_event_no")
    protected Long ariaEventNo;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "refund_amount")
    protected Double refundAmount;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "create_user")
    protected String createUser;
    @XmlElement(name = "refund_reason_code")
    protected Long refundReasonCode;
    @XmlElement(name = "refund_reason_label")
    protected String refundReasonLabel;
    @XmlElement(name = "refund_reason_description")
    protected String refundReasonDescription;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "aria_statement_no")
    protected Long ariaStatementNo;
    @XmlElement(name = "ref_payment_event_no")
    protected Long refPaymentEventNo;
    @XmlElement(name = "ref_payment_transaction_type")
    protected Long refPaymentTransactionType;
    @XmlElement(name = "ref_payment_transaction_desc")
    protected String refPaymentTransactionDesc;
    @XmlElement(name = "ref_payment_amount")
    protected Double refPaymentAmount;
    @XmlElement(name = "refund_transaction_type")
    protected Long refundTransactionType;
    @XmlElement(name = "refund_transaction_desc")
    protected String refundTransactionDesc;
    @XmlElement(name = "refund_check_num")
    protected String refundCheckNum;
    @XmlElement(name = "refund_bill_seq_no")
    protected Long refundBillSeqNo;
    @XmlElement(name = "refund_pay_method_id")
    protected Long refundPayMethodId;
    @XmlElement(name = "refund_pay_method_name")
    protected String refundPayMethodName;
    @XmlElement(name = "refund_cc_id")
    protected Long refundCcId;
    @XmlElement(name = "refund_cc_type")
    protected String refundCcType;
    @XmlElement(name = "refund_payment_src_suffix")
    protected String refundPaymentSrcSuffix;
    @XmlElement(name = "refund_is_voided_ind")
    protected Long refundIsVoidedInd;
    
    public Long getAriaEventNo() {
        return ariaEventNo;
    }

    public void setAriaEventNo(Long value) {
        this.ariaEventNo = value;
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

    public Long getRefundReasonCode() {
        return refundReasonCode;
    }

    public void setRefundReasonCode(Long value) {
        this.refundReasonCode = value;
    }

    public String getRefundReasonLabel() {
        return refundReasonLabel;
    }

    public void setRefundReasonLabel(String value) {
        this.refundReasonLabel = value;
    }

    public String getRefundReasonDescription() {
        return refundReasonDescription;
    }

    public void setRefundReasonDescription(String value) {
        this.refundReasonDescription = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Long getAriaStatementNo() {
        return ariaStatementNo;
    }

    public void setAriaStatementNo(Long value) {
        this.ariaStatementNo = value;
    }

    public Long getRefPaymentEventNo() {
        return refPaymentEventNo;
    }

    public void setRefPaymentEventNo(Long value) {
        this.refPaymentEventNo = value;
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

    public Long getRefundTransactionType() {
        return refundTransactionType;
    }

    public void setRefundTransactionType(Long value) {
        this.refundTransactionType = value;
    }

    public String getRefundTransactionDesc() {
        return refundTransactionDesc;
    }

    public void setRefundTransactionDesc(String value) {
        this.refundTransactionDesc = value;
    }

    public String getRefundCheckNum() {
        return refundCheckNum;
    }

    public void setRefundCheckNum(String value) {
        this.refundCheckNum = value;
    }

    public Long getRefundBillSeqNo() {
        return refundBillSeqNo;
    }

    public void setRefundBillSeqNo(Long value) {
        this.refundBillSeqNo = value;
    }

    public Long getRefundPayMethodId() {
        return refundPayMethodId;
    }

    public void setRefundPayMethodId(Long value) {
        this.refundPayMethodId = value;
    }

    public String getRefundPayMethodName() {
        return refundPayMethodName;
    }

    public void setRefundPayMethodName(String value) {
        this.refundPayMethodName = value;
    }

    public Long getRefundCcId() {
        return refundCcId;
    }

    public void setRefundCcId(Long value) {
        this.refundCcId = value;
    }

    public String getRefundCcType() {
        return refundCcType;
    }

    public void setRefundCcType(String value) {
        this.refundCcType = value;
    }

    public String getRefundPaymentSrcSuffix() {
        return refundPaymentSrcSuffix;
    }

    public void setRefundPaymentSrcSuffix(String value) {
        this.refundPaymentSrcSuffix = value;
    }

    public Long getRefundIsVoidedInd() {
        return refundIsVoidedInd;
    }

    public void setRefundIsVoidedInd(Long value) {
        this.refundIsVoidedInd = value;
    }

    
}
