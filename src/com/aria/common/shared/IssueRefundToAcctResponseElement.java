package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "appliedTotalRefundAmount", "appliedTotalReversalAmount", "reversedInvoiceLines"})
@XmlRootElement(name = "issue_refund_to_acctResponseElement")
public class IssueRefundToAcctResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "applied_total_refund_amount")
    protected Double appliedTotalRefundAmount;
    @XmlElement(name = "applied_total_reversal_amount")
    protected Double appliedTotalReversalAmount;
    @XmlElement(name = "reversed_invoice_lines")
    protected List<ReversedInvoiceLinesReturnElement> reversedInvoiceLines;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public Double getAppliedTotalRefundAmount() {
        return appliedTotalRefundAmount;
    }

    public void setAppliedTotalRefundAmount(Double value) {
        this.appliedTotalRefundAmount = value;
    }

    public Double getAppliedTotalReversalAmount() {
        return appliedTotalReversalAmount;
    }

    public void setAppliedTotalReversalAmount(Double value) {
        this.appliedTotalReversalAmount = value;
    }

    public List<ReversedInvoiceLinesReturnElement> getReversedInvoiceLines() {
        if (this.reversedInvoiceLines == null) {
            this.reversedInvoiceLines = new ArrayList<ReversedInvoiceLinesReturnElement>();
        }
        return this.reversedInvoiceLines;
    }
}
