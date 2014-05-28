package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctNo", "outUserid", "invoicingErrorCode", "invoicingErrorMsg", "invoiceNo", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "outNewAcctPlanContracts", "invoiceChargesBeforeTax", "invoiceTaxCharges", "invoiceChargesAfterTax", "invoiceCreditAmount", "invoiceTotalAmount", "newAcctInvoiceLineItems", "thirdPartyErrors", "sessionId"})
@XmlRootElement(name = "create_acct_completeResponseElement")
public class CreateAcctCompleteResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "out_userid")
    protected String outUserid;
    @XmlElement(name = "invoicing_error_code")
    protected Long invoicingErrorCode;
    @XmlElement(name = "invoicing_error_msg")
    protected String invoicingErrorMsg;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "proc_cvv_response")
    protected String procCvvResponse;
    @XmlElement(name = "proc_avs_response")
    protected String procAvsResponse;
    @XmlElement(name = "proc_cavv_response")
    protected String procCavvResponse;
    @XmlElement(name = "proc_status_code")
    protected String procStatusCode;
    @XmlElement(name = "proc_status_text")
    protected String procStatusText;
    @XmlElement(name = "proc_payment_id")
    protected String procPaymentId;
    @XmlElement(name = "proc_auth_code")
    protected String procAuthCode;
    @XmlElement(name = "proc_merch_comments")
    protected String procMerchComments;
    @XmlElement(name = "out_new_acct_plan_contracts")
    protected List<OutNewAcctPlanContractsReturnElement> outNewAcctPlanContracts;
    @XmlElement(name = "invoice_charges_before_tax")
    protected Double invoiceChargesBeforeTax;
    @XmlElement(name = "invoice_tax_charges")
    protected Double invoiceTaxCharges;
    @XmlElement(name = "invoice_charges_after_tax")
    protected Double invoiceChargesAfterTax;
    @XmlElement(name = "invoice_credit_amount")
    protected Double invoiceCreditAmount;
    @XmlElement(name = "invoice_total_amount")
    protected Double invoiceTotalAmount;
    @XmlElement(name = "new_acct_invoice_line_items")
    protected List<NewAcctInvoiceLineItemsReturnElement> newAcctInvoiceLineItems;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    @XmlElement(name = "session_id")
    protected String sessionId;
    
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getOutUserid() {
        return outUserid;
    }

    public void setOutUserid(String value) {
        this.outUserid = value;
    }

    public Long getInvoicingErrorCode() {
        return invoicingErrorCode;
    }

    public void setInvoicingErrorCode(Long value) {
        this.invoicingErrorCode = value;
    }

    public String getInvoicingErrorMsg() {
        return invoicingErrorMsg;
    }

    public void setInvoicingErrorMsg(String value) {
        this.invoicingErrorMsg = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getProcCvvResponse() {
        return procCvvResponse;
    }

    public void setProcCvvResponse(String value) {
        this.procCvvResponse = value;
    }

    public String getProcAvsResponse() {
        return procAvsResponse;
    }

    public void setProcAvsResponse(String value) {
        this.procAvsResponse = value;
    }

    public String getProcCavvResponse() {
        return procCavvResponse;
    }

    public void setProcCavvResponse(String value) {
        this.procCavvResponse = value;
    }

    public String getProcStatusCode() {
        return procStatusCode;
    }

    public void setProcStatusCode(String value) {
        this.procStatusCode = value;
    }

    public String getProcStatusText() {
        return procStatusText;
    }

    public void setProcStatusText(String value) {
        this.procStatusText = value;
    }

    public String getProcPaymentId() {
        return procPaymentId;
    }

    public void setProcPaymentId(String value) {
        this.procPaymentId = value;
    }

    public String getProcAuthCode() {
        return procAuthCode;
    }

    public void setProcAuthCode(String value) {
        this.procAuthCode = value;
    }

    public String getProcMerchComments() {
        return procMerchComments;
    }

    public void setProcMerchComments(String value) {
        this.procMerchComments = value;
    }

    public List<OutNewAcctPlanContractsReturnElement> getOutNewAcctPlanContracts() {
        if (this.outNewAcctPlanContracts == null) {
            this.outNewAcctPlanContracts = new ArrayList<OutNewAcctPlanContractsReturnElement>();
        }
        return this.outNewAcctPlanContracts;
    }public Double getInvoiceChargesBeforeTax() {
        return invoiceChargesBeforeTax;
    }

    public void setInvoiceChargesBeforeTax(Double value) {
        this.invoiceChargesBeforeTax = value;
    }

    public Double getInvoiceTaxCharges() {
        return invoiceTaxCharges;
    }

    public void setInvoiceTaxCharges(Double value) {
        this.invoiceTaxCharges = value;
    }

    public Double getInvoiceChargesAfterTax() {
        return invoiceChargesAfterTax;
    }

    public void setInvoiceChargesAfterTax(Double value) {
        this.invoiceChargesAfterTax = value;
    }

    public Double getInvoiceCreditAmount() {
        return invoiceCreditAmount;
    }

    public void setInvoiceCreditAmount(Double value) {
        this.invoiceCreditAmount = value;
    }

    public Double getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    public void setInvoiceTotalAmount(Double value) {
        this.invoiceTotalAmount = value;
    }

    public List<NewAcctInvoiceLineItemsReturnElement> getNewAcctInvoiceLineItems() {
        if (this.newAcctInvoiceLineItems == null) {
            this.newAcctInvoiceLineItems = new ArrayList<NewAcctInvoiceLineItemsReturnElement>();
        }
        return this.newAcctInvoiceLineItems;
    }public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String value) {
        this.sessionId = value;
    }

    
}
