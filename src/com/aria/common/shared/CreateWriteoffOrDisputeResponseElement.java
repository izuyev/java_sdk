package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "recNo", "createdBy", "amount", "invoiceNo", "invoiceDate", "invoiceAmt", "disputeCreationDate", "disputeExpDate", "comments", "reasonCode", "secondaryReasonCode", "disputeInd", "canUnsettle"})
@XmlRootElement(name = "create_writeoff_or_disputeResponseElement")
public class CreateWriteoffOrDisputeResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "rec_no")
    protected Long recNo;
    @XmlElement(name = "created_by")
    protected String createdBy;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_date")
    protected String invoiceDate;
    @XmlElement(name = "invoice_amt")
    protected Double invoiceAmt;
    @XmlElement(name = "dispute_creation_date")
    protected String disputeCreationDate;
    @XmlElement(name = "dispute_exp_date")
    protected String disputeExpDate;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "secondary_reason_code")
    protected Long secondaryReasonCode;
    @XmlElement(name = "dispute_ind")
    protected Long disputeInd;
    @XmlElement(name = "can_unsettle")
    protected String canUnsettle;
    
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

    public Long getRecNo() {
        return recNo;
    }

    public void setRecNo(Long value) {
        this.recNo = value;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    public Double getInvoiceAmt() {
        return invoiceAmt;
    }

    public void setInvoiceAmt(Double value) {
        this.invoiceAmt = value;
    }

    public String getDisputeCreationDate() {
        return disputeCreationDate;
    }

    public void setDisputeCreationDate(String value) {
        this.disputeCreationDate = value;
    }

    public String getDisputeExpDate() {
        return disputeExpDate;
    }

    public void setDisputeExpDate(String value) {
        this.disputeExpDate = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }

    public Long getSecondaryReasonCode() {
        return secondaryReasonCode;
    }

    public void setSecondaryReasonCode(Long value) {
        this.secondaryReasonCode = value;
    }

    public Long getDisputeInd() {
        return disputeInd;
    }

    public void setDisputeInd(Long value) {
        this.disputeInd = value;
    }

    public String getCanUnsettle() {
        return canUnsettle;
    }

    public void setCanUnsettle(String value) {
        this.canUnsettle = value;
    }

    
}
