package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","paymentTransactionId","reasonCode","totalRefundAmount","refundCheckNumber","comments","doWrite","autoCalcRefund","invoicesToReverse"})
@XmlRootElement(name = "issue_refund_to_acct")
public class IssueRefundToAcct {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "payment_transaction_id")
    protected Long paymentTransactionId;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "total_refund_amount")
    protected Double totalRefundAmount;
    @XmlElement(name = "refund_check_number")
    protected String refundCheckNumber;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "do_write")
    protected String doWrite;
    @XmlElement(name = "auto_calc_refund")
    protected String autoCalcRefund;
    @XmlElement(name = "invoices_to_reverse")
    protected InvoicesToReverseArray invoicesToReverse;
    
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
    
    public Long getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(Long value) {
        this.paymentTransactionId = value;
    }
    
    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }
    
    public Double getTotalRefundAmount() {
        return totalRefundAmount;
    }

    public void setTotalRefundAmount(Double value) {
        this.totalRefundAmount = value;
    }
    
    public String getRefundCheckNumber() {
        return refundCheckNumber;
    }

    public void setRefundCheckNumber(String value) {
        this.refundCheckNumber = value;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
    
    public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
    
    public String getAutoCalcRefund() {
        return autoCalcRefund;
    }

    public void setAutoCalcRefund(String value) {
        this.autoCalcRefund = value;
    }
    
    public InvoicesToReverseArray getInvoicesToReverse() {
        return invoicesToReverse;
    }

    public void setInvoicesToReverse(InvoicesToReverseArray value) {
        this.invoicesToReverse = value;
    }
    
    
}
