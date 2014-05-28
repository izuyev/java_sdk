package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "a1ErrorCode", "a1ErrorMsg", "a1AcctNo", "a1OutUserid", "a1OutClientAcctId", "a1InvoicingErrorCode", "a1InvoicingErrorMsg", "a1InvoiceNo", "a1ProcCvvResponse", "a1ProcAvsResponse", "a1ProcCavvResponse", "a1ProcStatusCode", "a1ProcStatusText", "a1ProcPaymentId", "a1ProcAuthCode", "a1ProcMerchComments", "a1OutNewAcctPlanContracts", "a1InvoiceChargesBeforeTax", "a1InvoiceTaxCharges", "a1InvoiceChargesAfterTax", "a1InvoiceCreditAmount", "a1InvoiceTotalAmount", "a1NewAcctInvoiceLineItems", "a1ThirdPartyErrors", "a1SessionId", "a2ErrorCode", "a2ErrorMsg", "a2AcctNo", "a2OutUserid", "a2OutClientAcctId", "a2InvoicingErrorCode", "a2InvoicingErrorMsg", "a2InvoiceNo", "a2ProcCvvResponse", "a2ProcAvsResponse", "a2ProcCavvResponse", "a2ProcStatusCode", "a2ProcStatusText", "a2ProcPaymentId", "a2ProcAuthCode", "a2ProcMerchComments", "a2OutNewAcctPlanContracts", "a2InvoiceChargesBeforeTax", "a2InvoiceTaxCharges", "a2InvoiceChargesAfterTax", "a2InvoiceCreditAmount", "a2InvoiceTotalAmount", "a2NewAcctInvoiceLineItems", "a2ThirdPartyErrors", "a2SessionId", "a3ErrorCode", "a3ErrorMsg", "a3AcctNo", "a3OutUserid", "a3OutClientAcctId", "a3InvoicingErrorCode", "a3InvoicingErrorMsg", "a3InvoiceNo", "a3ProcCvvResponse", "a3ProcAvsResponse", "a3ProcCavvResponse", "a3ProcStatusCode", "a3ProcStatusText", "a3ProcPaymentId", "a3ProcAuthCode", "a3ProcMerchComments", "a3OutNewAcctPlanContracts", "a3InvoiceChargesBeforeTax", "a3InvoiceTaxCharges", "a3InvoiceChargesAfterTax", "a3InvoiceCreditAmount", "a3InvoiceTotalAmount", "a3NewAcctInvoiceLineItems", "a3ThirdPartyErrors", "a3SessionId", "a4ErrorCode", "a4ErrorMsg", "a4AcctNo", "a4OutUserid", "a4OutClientAcctId", "a4InvoicingErrorCode", "a4InvoicingErrorMsg", "a4InvoiceNo", "a4ProcCvvResponse", "a4ProcAvsResponse", "a4ProcCavvResponse", "a4ProcStatusCode", "a4ProcStatusText", "a4ProcPaymentId", "a4ProcAuthCode", "a4ProcMerchComments", "a4OutNewAcctPlanContracts", "a4InvoiceChargesBeforeTax", "a4InvoiceTaxCharges", "a4InvoiceChargesAfterTax", "a4InvoiceCreditAmount", "a4InvoiceTotalAmount", "a4NewAcctInvoiceLineItems", "a4ThirdPartyErrors", "a4SessionId", "a5ErrorCode", "a5ErrorMsg", "a5AcctNo", "a5OutUserid", "a5OutClientAcctId", "a5InvoicingErrorCode", "a5InvoicingErrorMsg", "a5InvoiceNo", "a5ProcCvvResponse", "a5ProcAvsResponse", "a5ProcCavvResponse", "a5ProcStatusCode", "a5ProcStatusText", "a5ProcPaymentId", "a5ProcAuthCode", "a5ProcMerchComments", "a5OutNewAcctPlanContracts", "a5InvoiceChargesBeforeTax", "a5InvoiceTaxCharges", "a5InvoiceChargesAfterTax", "a5InvoiceCreditAmount", "a5InvoiceTotalAmount", "a5NewAcctInvoiceLineItems", "a5ThirdPartyErrors", "a5SessionId"})
@XmlRootElement(name = "create_acct_hierarchyResponseElement")
public class CreateAcctHierarchyResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "a1_error_code")
    protected Long a1ErrorCode;
    @XmlElement(name = "a1_error_msg")
    protected String a1ErrorMsg;
    @XmlElement(name = "a1_acct_no")
    protected Long a1AcctNo;
    @XmlElement(name = "a1_out_userid")
    protected String a1OutUserid;
    @XmlElement(name = "a1_out_client_acct_id")
    protected String a1OutClientAcctId;
    @XmlElement(name = "a1_invoicing_error_code")
    protected Long a1InvoicingErrorCode;
    @XmlElement(name = "a1_invoicing_error_msg")
    protected String a1InvoicingErrorMsg;
    @XmlElement(name = "a1_invoice_no")
    protected Long a1InvoiceNo;
    @XmlElement(name = "a1_proc_cvv_response")
    protected String a1ProcCvvResponse;
    @XmlElement(name = "a1_proc_avs_response")
    protected String a1ProcAvsResponse;
    @XmlElement(name = "a1_proc_cavv_response")
    protected String a1ProcCavvResponse;
    @XmlElement(name = "a1_proc_status_code")
    protected String a1ProcStatusCode;
    @XmlElement(name = "a1_proc_status_text")
    protected String a1ProcStatusText;
    @XmlElement(name = "a1_proc_payment_id")
    protected String a1ProcPaymentId;
    @XmlElement(name = "a1_proc_auth_code")
    protected String a1ProcAuthCode;
    @XmlElement(name = "a1_proc_merch_comments")
    protected String a1ProcMerchComments;
    @XmlElement(name = "a1_out_new_acct_plan_contracts")
    protected List<A1OutNewAcctPlanContractsReturnElement> a1OutNewAcctPlanContracts;
    @XmlElement(name = "a1_invoice_charges_before_tax")
    protected Double a1InvoiceChargesBeforeTax;
    @XmlElement(name = "a1_invoice_tax_charges")
    protected Double a1InvoiceTaxCharges;
    @XmlElement(name = "a1_invoice_charges_after_tax")
    protected Double a1InvoiceChargesAfterTax;
    @XmlElement(name = "a1_invoice_credit_amount")
    protected Double a1InvoiceCreditAmount;
    @XmlElement(name = "a1_invoice_total_amount")
    protected Double a1InvoiceTotalAmount;
    @XmlElement(name = "a1_new_acct_invoice_line_items")
    protected List<A1NewAcctInvoiceLineItemsReturnElement> a1NewAcctInvoiceLineItems;
    @XmlElement(name = "a1_third_party_errors")
    protected List<A1ThirdPartyErrorsReturnElement> a1ThirdPartyErrors;
    @XmlElement(name = "a1_session_id")
    protected String a1SessionId;
    @XmlElement(name = "a2_error_code")
    protected Long a2ErrorCode;
    @XmlElement(name = "a2_error_msg")
    protected String a2ErrorMsg;
    @XmlElement(name = "a2_acct_no")
    protected Long a2AcctNo;
    @XmlElement(name = "a2_out_userid")
    protected String a2OutUserid;
    @XmlElement(name = "a2_out_client_acct_id")
    protected String a2OutClientAcctId;
    @XmlElement(name = "a2_invoicing_error_code")
    protected Long a2InvoicingErrorCode;
    @XmlElement(name = "a2_invoicing_error_msg")
    protected String a2InvoicingErrorMsg;
    @XmlElement(name = "a2_invoice_no")
    protected Long a2InvoiceNo;
    @XmlElement(name = "a2_proc_cvv_response")
    protected String a2ProcCvvResponse;
    @XmlElement(name = "a2_proc_avs_response")
    protected String a2ProcAvsResponse;
    @XmlElement(name = "a2_proc_cavv_response")
    protected String a2ProcCavvResponse;
    @XmlElement(name = "a2_proc_status_code")
    protected String a2ProcStatusCode;
    @XmlElement(name = "a2_proc_status_text")
    protected String a2ProcStatusText;
    @XmlElement(name = "a2_proc_payment_id")
    protected String a2ProcPaymentId;
    @XmlElement(name = "a2_proc_auth_code")
    protected String a2ProcAuthCode;
    @XmlElement(name = "a2_proc_merch_comments")
    protected String a2ProcMerchComments;
    @XmlElement(name = "a2_out_new_acct_plan_contracts")
    protected List<A2OutNewAcctPlanContractsReturnElement> a2OutNewAcctPlanContracts;
    @XmlElement(name = "a2_invoice_charges_before_tax")
    protected Double a2InvoiceChargesBeforeTax;
    @XmlElement(name = "a2_invoice_tax_charges")
    protected Double a2InvoiceTaxCharges;
    @XmlElement(name = "a2_invoice_charges_after_tax")
    protected Double a2InvoiceChargesAfterTax;
    @XmlElement(name = "a2_invoice_credit_amount")
    protected Double a2InvoiceCreditAmount;
    @XmlElement(name = "a2_invoice_total_amount")
    protected Double a2InvoiceTotalAmount;
    @XmlElement(name = "a2_new_acct_invoice_line_items")
    protected List<A2NewAcctInvoiceLineItemsReturnElement> a2NewAcctInvoiceLineItems;
    @XmlElement(name = "a2_third_party_errors")
    protected List<A2ThirdPartyErrorsReturnElement> a2ThirdPartyErrors;
    @XmlElement(name = "a2_session_id")
    protected String a2SessionId;
    @XmlElement(name = "a3_error_code")
    protected Long a3ErrorCode;
    @XmlElement(name = "a3_error_msg")
    protected String a3ErrorMsg;
    @XmlElement(name = "a3_acct_no")
    protected Long a3AcctNo;
    @XmlElement(name = "a3_out_userid")
    protected String a3OutUserid;
    @XmlElement(name = "a3_out_client_acct_id")
    protected String a3OutClientAcctId;
    @XmlElement(name = "a3_invoicing_error_code")
    protected Long a3InvoicingErrorCode;
    @XmlElement(name = "a3_invoicing_error_msg")
    protected String a3InvoicingErrorMsg;
    @XmlElement(name = "a3_invoice_no")
    protected Long a3InvoiceNo;
    @XmlElement(name = "a3_proc_cvv_response")
    protected String a3ProcCvvResponse;
    @XmlElement(name = "a3_proc_avs_response")
    protected String a3ProcAvsResponse;
    @XmlElement(name = "a3_proc_cavv_response")
    protected String a3ProcCavvResponse;
    @XmlElement(name = "a3_proc_status_code")
    protected String a3ProcStatusCode;
    @XmlElement(name = "a3_proc_status_text")
    protected String a3ProcStatusText;
    @XmlElement(name = "a3_proc_payment_id")
    protected String a3ProcPaymentId;
    @XmlElement(name = "a3_proc_auth_code")
    protected String a3ProcAuthCode;
    @XmlElement(name = "a3_proc_merch_comments")
    protected String a3ProcMerchComments;
    @XmlElement(name = "a3_out_new_acct_plan_contracts")
    protected List<A3OutNewAcctPlanContractsReturnElement> a3OutNewAcctPlanContracts;
    @XmlElement(name = "a3_invoice_charges_before_tax")
    protected Double a3InvoiceChargesBeforeTax;
    @XmlElement(name = "a3_invoice_tax_charges")
    protected Double a3InvoiceTaxCharges;
    @XmlElement(name = "a3_invoice_charges_after_tax")
    protected Double a3InvoiceChargesAfterTax;
    @XmlElement(name = "a3_invoice_credit_amount")
    protected Double a3InvoiceCreditAmount;
    @XmlElement(name = "a3_invoice_total_amount")
    protected Double a3InvoiceTotalAmount;
    @XmlElement(name = "a3_new_acct_invoice_line_items")
    protected List<A3NewAcctInvoiceLineItemsReturnElement> a3NewAcctInvoiceLineItems;
    @XmlElement(name = "a3_third_party_errors")
    protected List<A3ThirdPartyErrorsReturnElement> a3ThirdPartyErrors;
    @XmlElement(name = "a3_session_id")
    protected String a3SessionId;
    @XmlElement(name = "a4_error_code")
    protected Long a4ErrorCode;
    @XmlElement(name = "a4_error_msg")
    protected String a4ErrorMsg;
    @XmlElement(name = "a4_acct_no")
    protected Long a4AcctNo;
    @XmlElement(name = "a4_out_userid")
    protected String a4OutUserid;
    @XmlElement(name = "a4_out_client_acct_id")
    protected String a4OutClientAcctId;
    @XmlElement(name = "a4_invoicing_error_code")
    protected Long a4InvoicingErrorCode;
    @XmlElement(name = "a4_invoicing_error_msg")
    protected String a4InvoicingErrorMsg;
    @XmlElement(name = "a4_invoice_no")
    protected Long a4InvoiceNo;
    @XmlElement(name = "a4_proc_cvv_response")
    protected String a4ProcCvvResponse;
    @XmlElement(name = "a4_proc_avs_response")
    protected String a4ProcAvsResponse;
    @XmlElement(name = "a4_proc_cavv_response")
    protected String a4ProcCavvResponse;
    @XmlElement(name = "a4_proc_status_code")
    protected String a4ProcStatusCode;
    @XmlElement(name = "a4_proc_status_text")
    protected String a4ProcStatusText;
    @XmlElement(name = "a4_proc_payment_id")
    protected String a4ProcPaymentId;
    @XmlElement(name = "a4_proc_auth_code")
    protected String a4ProcAuthCode;
    @XmlElement(name = "a4_proc_merch_comments")
    protected String a4ProcMerchComments;
    @XmlElement(name = "a4_out_new_acct_plan_contracts")
    protected List<A4OutNewAcctPlanContractsReturnElement> a4OutNewAcctPlanContracts;
    @XmlElement(name = "a4_invoice_charges_before_tax")
    protected Double a4InvoiceChargesBeforeTax;
    @XmlElement(name = "a4_invoice_tax_charges")
    protected Double a4InvoiceTaxCharges;
    @XmlElement(name = "a4_invoice_charges_after_tax")
    protected Double a4InvoiceChargesAfterTax;
    @XmlElement(name = "a4_invoice_credit_amount")
    protected Double a4InvoiceCreditAmount;
    @XmlElement(name = "a4_invoice_total_amount")
    protected Double a4InvoiceTotalAmount;
    @XmlElement(name = "a4_new_acct_invoice_line_items")
    protected List<A4NewAcctInvoiceLineItemsReturnElement> a4NewAcctInvoiceLineItems;
    @XmlElement(name = "a4_third_party_errors")
    protected List<A4ThirdPartyErrorsReturnElement> a4ThirdPartyErrors;
    @XmlElement(name = "a4_session_id")
    protected String a4SessionId;
    @XmlElement(name = "a5_error_code")
    protected Long a5ErrorCode;
    @XmlElement(name = "a5_error_msg")
    protected String a5ErrorMsg;
    @XmlElement(name = "a5_acct_no")
    protected Long a5AcctNo;
    @XmlElement(name = "a5_out_userid")
    protected String a5OutUserid;
    @XmlElement(name = "a5_out_client_acct_id")
    protected String a5OutClientAcctId;
    @XmlElement(name = "a5_invoicing_error_code")
    protected Long a5InvoicingErrorCode;
    @XmlElement(name = "a5_invoicing_error_msg")
    protected String a5InvoicingErrorMsg;
    @XmlElement(name = "a5_invoice_no")
    protected Long a5InvoiceNo;
    @XmlElement(name = "a5_proc_cvv_response")
    protected String a5ProcCvvResponse;
    @XmlElement(name = "a5_proc_avs_response")
    protected String a5ProcAvsResponse;
    @XmlElement(name = "a5_proc_cavv_response")
    protected String a5ProcCavvResponse;
    @XmlElement(name = "a5_proc_status_code")
    protected String a5ProcStatusCode;
    @XmlElement(name = "a5_proc_status_text")
    protected String a5ProcStatusText;
    @XmlElement(name = "a5_proc_payment_id")
    protected String a5ProcPaymentId;
    @XmlElement(name = "a5_proc_auth_code")
    protected String a5ProcAuthCode;
    @XmlElement(name = "a5_proc_merch_comments")
    protected String a5ProcMerchComments;
    @XmlElement(name = "a5_out_new_acct_plan_contracts")
    protected List<A5OutNewAcctPlanContractsReturnElement> a5OutNewAcctPlanContracts;
    @XmlElement(name = "a5_invoice_charges_before_tax")
    protected Double a5InvoiceChargesBeforeTax;
    @XmlElement(name = "a5_invoice_tax_charges")
    protected Double a5InvoiceTaxCharges;
    @XmlElement(name = "a5_invoice_charges_after_tax")
    protected Double a5InvoiceChargesAfterTax;
    @XmlElement(name = "a5_invoice_credit_amount")
    protected Double a5InvoiceCreditAmount;
    @XmlElement(name = "a5_invoice_total_amount")
    protected Double a5InvoiceTotalAmount;
    @XmlElement(name = "a5_new_acct_invoice_line_items")
    protected List<A5NewAcctInvoiceLineItemsReturnElement> a5NewAcctInvoiceLineItems;
    @XmlElement(name = "a5_third_party_errors")
    protected List<A5ThirdPartyErrorsReturnElement> a5ThirdPartyErrors;
    @XmlElement(name = "a5_session_id")
    protected String a5SessionId;
    
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

    public Long getA1ErrorCode() {
        return a1ErrorCode;
    }

    public void setA1ErrorCode(Long value) {
        this.a1ErrorCode = value;
    }

    public String getA1ErrorMsg() {
        return a1ErrorMsg;
    }

    public void setA1ErrorMsg(String value) {
        this.a1ErrorMsg = value;
    }

    public Long getA1AcctNo() {
        return a1AcctNo;
    }

    public void setA1AcctNo(Long value) {
        this.a1AcctNo = value;
    }

    public String getA1OutUserid() {
        return a1OutUserid;
    }

    public void setA1OutUserid(String value) {
        this.a1OutUserid = value;
    }

    public String getA1OutClientAcctId() {
        return a1OutClientAcctId;
    }

    public void setA1OutClientAcctId(String value) {
        this.a1OutClientAcctId = value;
    }

    public Long getA1InvoicingErrorCode() {
        return a1InvoicingErrorCode;
    }

    public void setA1InvoicingErrorCode(Long value) {
        this.a1InvoicingErrorCode = value;
    }

    public String getA1InvoicingErrorMsg() {
        return a1InvoicingErrorMsg;
    }

    public void setA1InvoicingErrorMsg(String value) {
        this.a1InvoicingErrorMsg = value;
    }

    public Long getA1InvoiceNo() {
        return a1InvoiceNo;
    }

    public void setA1InvoiceNo(Long value) {
        this.a1InvoiceNo = value;
    }

    public String getA1ProcCvvResponse() {
        return a1ProcCvvResponse;
    }

    public void setA1ProcCvvResponse(String value) {
        this.a1ProcCvvResponse = value;
    }

    public String getA1ProcAvsResponse() {
        return a1ProcAvsResponse;
    }

    public void setA1ProcAvsResponse(String value) {
        this.a1ProcAvsResponse = value;
    }

    public String getA1ProcCavvResponse() {
        return a1ProcCavvResponse;
    }

    public void setA1ProcCavvResponse(String value) {
        this.a1ProcCavvResponse = value;
    }

    public String getA1ProcStatusCode() {
        return a1ProcStatusCode;
    }

    public void setA1ProcStatusCode(String value) {
        this.a1ProcStatusCode = value;
    }

    public String getA1ProcStatusText() {
        return a1ProcStatusText;
    }

    public void setA1ProcStatusText(String value) {
        this.a1ProcStatusText = value;
    }

    public String getA1ProcPaymentId() {
        return a1ProcPaymentId;
    }

    public void setA1ProcPaymentId(String value) {
        this.a1ProcPaymentId = value;
    }

    public String getA1ProcAuthCode() {
        return a1ProcAuthCode;
    }

    public void setA1ProcAuthCode(String value) {
        this.a1ProcAuthCode = value;
    }

    public String getA1ProcMerchComments() {
        return a1ProcMerchComments;
    }

    public void setA1ProcMerchComments(String value) {
        this.a1ProcMerchComments = value;
    }

    public List<A1OutNewAcctPlanContractsReturnElement> getA1OutNewAcctPlanContracts() {
        if (this.a1OutNewAcctPlanContracts == null) {
            this.a1OutNewAcctPlanContracts = new ArrayList<A1OutNewAcctPlanContractsReturnElement>();
        }
        return this.a1OutNewAcctPlanContracts;
    }public Double getA1InvoiceChargesBeforeTax() {
        return a1InvoiceChargesBeforeTax;
    }

    public void setA1InvoiceChargesBeforeTax(Double value) {
        this.a1InvoiceChargesBeforeTax = value;
    }

    public Double getA1InvoiceTaxCharges() {
        return a1InvoiceTaxCharges;
    }

    public void setA1InvoiceTaxCharges(Double value) {
        this.a1InvoiceTaxCharges = value;
    }

    public Double getA1InvoiceChargesAfterTax() {
        return a1InvoiceChargesAfterTax;
    }

    public void setA1InvoiceChargesAfterTax(Double value) {
        this.a1InvoiceChargesAfterTax = value;
    }

    public Double getA1InvoiceCreditAmount() {
        return a1InvoiceCreditAmount;
    }

    public void setA1InvoiceCreditAmount(Double value) {
        this.a1InvoiceCreditAmount = value;
    }

    public Double getA1InvoiceTotalAmount() {
        return a1InvoiceTotalAmount;
    }

    public void setA1InvoiceTotalAmount(Double value) {
        this.a1InvoiceTotalAmount = value;
    }

    public List<A1NewAcctInvoiceLineItemsReturnElement> getA1NewAcctInvoiceLineItems() {
        if (this.a1NewAcctInvoiceLineItems == null) {
            this.a1NewAcctInvoiceLineItems = new ArrayList<A1NewAcctInvoiceLineItemsReturnElement>();
        }
        return this.a1NewAcctInvoiceLineItems;
    }public List<A1ThirdPartyErrorsReturnElement> getA1ThirdPartyErrors() {
        if (this.a1ThirdPartyErrors == null) {
            this.a1ThirdPartyErrors = new ArrayList<A1ThirdPartyErrorsReturnElement>();
        }
        return this.a1ThirdPartyErrors;
    }public String getA1SessionId() {
        return a1SessionId;
    }

    public void setA1SessionId(String value) {
        this.a1SessionId = value;
    }

    public Long getA2ErrorCode() {
        return a2ErrorCode;
    }

    public void setA2ErrorCode(Long value) {
        this.a2ErrorCode = value;
    }

    public String getA2ErrorMsg() {
        return a2ErrorMsg;
    }

    public void setA2ErrorMsg(String value) {
        this.a2ErrorMsg = value;
    }

    public Long getA2AcctNo() {
        return a2AcctNo;
    }

    public void setA2AcctNo(Long value) {
        this.a2AcctNo = value;
    }

    public String getA2OutUserid() {
        return a2OutUserid;
    }

    public void setA2OutUserid(String value) {
        this.a2OutUserid = value;
    }

    public String getA2OutClientAcctId() {
        return a2OutClientAcctId;
    }

    public void setA2OutClientAcctId(String value) {
        this.a2OutClientAcctId = value;
    }

    public Long getA2InvoicingErrorCode() {
        return a2InvoicingErrorCode;
    }

    public void setA2InvoicingErrorCode(Long value) {
        this.a2InvoicingErrorCode = value;
    }

    public String getA2InvoicingErrorMsg() {
        return a2InvoicingErrorMsg;
    }

    public void setA2InvoicingErrorMsg(String value) {
        this.a2InvoicingErrorMsg = value;
    }

    public Long getA2InvoiceNo() {
        return a2InvoiceNo;
    }

    public void setA2InvoiceNo(Long value) {
        this.a2InvoiceNo = value;
    }

    public String getA2ProcCvvResponse() {
        return a2ProcCvvResponse;
    }

    public void setA2ProcCvvResponse(String value) {
        this.a2ProcCvvResponse = value;
    }

    public String getA2ProcAvsResponse() {
        return a2ProcAvsResponse;
    }

    public void setA2ProcAvsResponse(String value) {
        this.a2ProcAvsResponse = value;
    }

    public String getA2ProcCavvResponse() {
        return a2ProcCavvResponse;
    }

    public void setA2ProcCavvResponse(String value) {
        this.a2ProcCavvResponse = value;
    }

    public String getA2ProcStatusCode() {
        return a2ProcStatusCode;
    }

    public void setA2ProcStatusCode(String value) {
        this.a2ProcStatusCode = value;
    }

    public String getA2ProcStatusText() {
        return a2ProcStatusText;
    }

    public void setA2ProcStatusText(String value) {
        this.a2ProcStatusText = value;
    }

    public String getA2ProcPaymentId() {
        return a2ProcPaymentId;
    }

    public void setA2ProcPaymentId(String value) {
        this.a2ProcPaymentId = value;
    }

    public String getA2ProcAuthCode() {
        return a2ProcAuthCode;
    }

    public void setA2ProcAuthCode(String value) {
        this.a2ProcAuthCode = value;
    }

    public String getA2ProcMerchComments() {
        return a2ProcMerchComments;
    }

    public void setA2ProcMerchComments(String value) {
        this.a2ProcMerchComments = value;
    }

    public List<A2OutNewAcctPlanContractsReturnElement> getA2OutNewAcctPlanContracts() {
        if (this.a2OutNewAcctPlanContracts == null) {
            this.a2OutNewAcctPlanContracts = new ArrayList<A2OutNewAcctPlanContractsReturnElement>();
        }
        return this.a2OutNewAcctPlanContracts;
    }public Double getA2InvoiceChargesBeforeTax() {
        return a2InvoiceChargesBeforeTax;
    }

    public void setA2InvoiceChargesBeforeTax(Double value) {
        this.a2InvoiceChargesBeforeTax = value;
    }

    public Double getA2InvoiceTaxCharges() {
        return a2InvoiceTaxCharges;
    }

    public void setA2InvoiceTaxCharges(Double value) {
        this.a2InvoiceTaxCharges = value;
    }

    public Double getA2InvoiceChargesAfterTax() {
        return a2InvoiceChargesAfterTax;
    }

    public void setA2InvoiceChargesAfterTax(Double value) {
        this.a2InvoiceChargesAfterTax = value;
    }

    public Double getA2InvoiceCreditAmount() {
        return a2InvoiceCreditAmount;
    }

    public void setA2InvoiceCreditAmount(Double value) {
        this.a2InvoiceCreditAmount = value;
    }

    public Double getA2InvoiceTotalAmount() {
        return a2InvoiceTotalAmount;
    }

    public void setA2InvoiceTotalAmount(Double value) {
        this.a2InvoiceTotalAmount = value;
    }

    public List<A2NewAcctInvoiceLineItemsReturnElement> getA2NewAcctInvoiceLineItems() {
        if (this.a2NewAcctInvoiceLineItems == null) {
            this.a2NewAcctInvoiceLineItems = new ArrayList<A2NewAcctInvoiceLineItemsReturnElement>();
        }
        return this.a2NewAcctInvoiceLineItems;
    }public List<A2ThirdPartyErrorsReturnElement> getA2ThirdPartyErrors() {
        if (this.a2ThirdPartyErrors == null) {
            this.a2ThirdPartyErrors = new ArrayList<A2ThirdPartyErrorsReturnElement>();
        }
        return this.a2ThirdPartyErrors;
    }public String getA2SessionId() {
        return a2SessionId;
    }

    public void setA2SessionId(String value) {
        this.a2SessionId = value;
    }

    public Long getA3ErrorCode() {
        return a3ErrorCode;
    }

    public void setA3ErrorCode(Long value) {
        this.a3ErrorCode = value;
    }

    public String getA3ErrorMsg() {
        return a3ErrorMsg;
    }

    public void setA3ErrorMsg(String value) {
        this.a3ErrorMsg = value;
    }

    public Long getA3AcctNo() {
        return a3AcctNo;
    }

    public void setA3AcctNo(Long value) {
        this.a3AcctNo = value;
    }

    public String getA3OutUserid() {
        return a3OutUserid;
    }

    public void setA3OutUserid(String value) {
        this.a3OutUserid = value;
    }

    public String getA3OutClientAcctId() {
        return a3OutClientAcctId;
    }

    public void setA3OutClientAcctId(String value) {
        this.a3OutClientAcctId = value;
    }

    public Long getA3InvoicingErrorCode() {
        return a3InvoicingErrorCode;
    }

    public void setA3InvoicingErrorCode(Long value) {
        this.a3InvoicingErrorCode = value;
    }

    public String getA3InvoicingErrorMsg() {
        return a3InvoicingErrorMsg;
    }

    public void setA3InvoicingErrorMsg(String value) {
        this.a3InvoicingErrorMsg = value;
    }

    public Long getA3InvoiceNo() {
        return a3InvoiceNo;
    }

    public void setA3InvoiceNo(Long value) {
        this.a3InvoiceNo = value;
    }

    public String getA3ProcCvvResponse() {
        return a3ProcCvvResponse;
    }

    public void setA3ProcCvvResponse(String value) {
        this.a3ProcCvvResponse = value;
    }

    public String getA3ProcAvsResponse() {
        return a3ProcAvsResponse;
    }

    public void setA3ProcAvsResponse(String value) {
        this.a3ProcAvsResponse = value;
    }

    public String getA3ProcCavvResponse() {
        return a3ProcCavvResponse;
    }

    public void setA3ProcCavvResponse(String value) {
        this.a3ProcCavvResponse = value;
    }

    public String getA3ProcStatusCode() {
        return a3ProcStatusCode;
    }

    public void setA3ProcStatusCode(String value) {
        this.a3ProcStatusCode = value;
    }

    public String getA3ProcStatusText() {
        return a3ProcStatusText;
    }

    public void setA3ProcStatusText(String value) {
        this.a3ProcStatusText = value;
    }

    public String getA3ProcPaymentId() {
        return a3ProcPaymentId;
    }

    public void setA3ProcPaymentId(String value) {
        this.a3ProcPaymentId = value;
    }

    public String getA3ProcAuthCode() {
        return a3ProcAuthCode;
    }

    public void setA3ProcAuthCode(String value) {
        this.a3ProcAuthCode = value;
    }

    public String getA3ProcMerchComments() {
        return a3ProcMerchComments;
    }

    public void setA3ProcMerchComments(String value) {
        this.a3ProcMerchComments = value;
    }

    public List<A3OutNewAcctPlanContractsReturnElement> getA3OutNewAcctPlanContracts() {
        if (this.a3OutNewAcctPlanContracts == null) {
            this.a3OutNewAcctPlanContracts = new ArrayList<A3OutNewAcctPlanContractsReturnElement>();
        }
        return this.a3OutNewAcctPlanContracts;
    }public Double getA3InvoiceChargesBeforeTax() {
        return a3InvoiceChargesBeforeTax;
    }

    public void setA3InvoiceChargesBeforeTax(Double value) {
        this.a3InvoiceChargesBeforeTax = value;
    }

    public Double getA3InvoiceTaxCharges() {
        return a3InvoiceTaxCharges;
    }

    public void setA3InvoiceTaxCharges(Double value) {
        this.a3InvoiceTaxCharges = value;
    }

    public Double getA3InvoiceChargesAfterTax() {
        return a3InvoiceChargesAfterTax;
    }

    public void setA3InvoiceChargesAfterTax(Double value) {
        this.a3InvoiceChargesAfterTax = value;
    }

    public Double getA3InvoiceCreditAmount() {
        return a3InvoiceCreditAmount;
    }

    public void setA3InvoiceCreditAmount(Double value) {
        this.a3InvoiceCreditAmount = value;
    }

    public Double getA3InvoiceTotalAmount() {
        return a3InvoiceTotalAmount;
    }

    public void setA3InvoiceTotalAmount(Double value) {
        this.a3InvoiceTotalAmount = value;
    }

    public List<A3NewAcctInvoiceLineItemsReturnElement> getA3NewAcctInvoiceLineItems() {
        if (this.a3NewAcctInvoiceLineItems == null) {
            this.a3NewAcctInvoiceLineItems = new ArrayList<A3NewAcctInvoiceLineItemsReturnElement>();
        }
        return this.a3NewAcctInvoiceLineItems;
    }public List<A3ThirdPartyErrorsReturnElement> getA3ThirdPartyErrors() {
        if (this.a3ThirdPartyErrors == null) {
            this.a3ThirdPartyErrors = new ArrayList<A3ThirdPartyErrorsReturnElement>();
        }
        return this.a3ThirdPartyErrors;
    }public String getA3SessionId() {
        return a3SessionId;
    }

    public void setA3SessionId(String value) {
        this.a3SessionId = value;
    }

    public Long getA4ErrorCode() {
        return a4ErrorCode;
    }

    public void setA4ErrorCode(Long value) {
        this.a4ErrorCode = value;
    }

    public String getA4ErrorMsg() {
        return a4ErrorMsg;
    }

    public void setA4ErrorMsg(String value) {
        this.a4ErrorMsg = value;
    }

    public Long getA4AcctNo() {
        return a4AcctNo;
    }

    public void setA4AcctNo(Long value) {
        this.a4AcctNo = value;
    }

    public String getA4OutUserid() {
        return a4OutUserid;
    }

    public void setA4OutUserid(String value) {
        this.a4OutUserid = value;
    }

    public String getA4OutClientAcctId() {
        return a4OutClientAcctId;
    }

    public void setA4OutClientAcctId(String value) {
        this.a4OutClientAcctId = value;
    }

    public Long getA4InvoicingErrorCode() {
        return a4InvoicingErrorCode;
    }

    public void setA4InvoicingErrorCode(Long value) {
        this.a4InvoicingErrorCode = value;
    }

    public String getA4InvoicingErrorMsg() {
        return a4InvoicingErrorMsg;
    }

    public void setA4InvoicingErrorMsg(String value) {
        this.a4InvoicingErrorMsg = value;
    }

    public Long getA4InvoiceNo() {
        return a4InvoiceNo;
    }

    public void setA4InvoiceNo(Long value) {
        this.a4InvoiceNo = value;
    }

    public String getA4ProcCvvResponse() {
        return a4ProcCvvResponse;
    }

    public void setA4ProcCvvResponse(String value) {
        this.a4ProcCvvResponse = value;
    }

    public String getA4ProcAvsResponse() {
        return a4ProcAvsResponse;
    }

    public void setA4ProcAvsResponse(String value) {
        this.a4ProcAvsResponse = value;
    }

    public String getA4ProcCavvResponse() {
        return a4ProcCavvResponse;
    }

    public void setA4ProcCavvResponse(String value) {
        this.a4ProcCavvResponse = value;
    }

    public String getA4ProcStatusCode() {
        return a4ProcStatusCode;
    }

    public void setA4ProcStatusCode(String value) {
        this.a4ProcStatusCode = value;
    }

    public String getA4ProcStatusText() {
        return a4ProcStatusText;
    }

    public void setA4ProcStatusText(String value) {
        this.a4ProcStatusText = value;
    }

    public String getA4ProcPaymentId() {
        return a4ProcPaymentId;
    }

    public void setA4ProcPaymentId(String value) {
        this.a4ProcPaymentId = value;
    }

    public String getA4ProcAuthCode() {
        return a4ProcAuthCode;
    }

    public void setA4ProcAuthCode(String value) {
        this.a4ProcAuthCode = value;
    }

    public String getA4ProcMerchComments() {
        return a4ProcMerchComments;
    }

    public void setA4ProcMerchComments(String value) {
        this.a4ProcMerchComments = value;
    }

    public List<A4OutNewAcctPlanContractsReturnElement> getA4OutNewAcctPlanContracts() {
        if (this.a4OutNewAcctPlanContracts == null) {
            this.a4OutNewAcctPlanContracts = new ArrayList<A4OutNewAcctPlanContractsReturnElement>();
        }
        return this.a4OutNewAcctPlanContracts;
    }public Double getA4InvoiceChargesBeforeTax() {
        return a4InvoiceChargesBeforeTax;
    }

    public void setA4InvoiceChargesBeforeTax(Double value) {
        this.a4InvoiceChargesBeforeTax = value;
    }

    public Double getA4InvoiceTaxCharges() {
        return a4InvoiceTaxCharges;
    }

    public void setA4InvoiceTaxCharges(Double value) {
        this.a4InvoiceTaxCharges = value;
    }

    public Double getA4InvoiceChargesAfterTax() {
        return a4InvoiceChargesAfterTax;
    }

    public void setA4InvoiceChargesAfterTax(Double value) {
        this.a4InvoiceChargesAfterTax = value;
    }

    public Double getA4InvoiceCreditAmount() {
        return a4InvoiceCreditAmount;
    }

    public void setA4InvoiceCreditAmount(Double value) {
        this.a4InvoiceCreditAmount = value;
    }

    public Double getA4InvoiceTotalAmount() {
        return a4InvoiceTotalAmount;
    }

    public void setA4InvoiceTotalAmount(Double value) {
        this.a4InvoiceTotalAmount = value;
    }

    public List<A4NewAcctInvoiceLineItemsReturnElement> getA4NewAcctInvoiceLineItems() {
        if (this.a4NewAcctInvoiceLineItems == null) {
            this.a4NewAcctInvoiceLineItems = new ArrayList<A4NewAcctInvoiceLineItemsReturnElement>();
        }
        return this.a4NewAcctInvoiceLineItems;
    }public List<A4ThirdPartyErrorsReturnElement> getA4ThirdPartyErrors() {
        if (this.a4ThirdPartyErrors == null) {
            this.a4ThirdPartyErrors = new ArrayList<A4ThirdPartyErrorsReturnElement>();
        }
        return this.a4ThirdPartyErrors;
    }public String getA4SessionId() {
        return a4SessionId;
    }

    public void setA4SessionId(String value) {
        this.a4SessionId = value;
    }

    public Long getA5ErrorCode() {
        return a5ErrorCode;
    }

    public void setA5ErrorCode(Long value) {
        this.a5ErrorCode = value;
    }

    public String getA5ErrorMsg() {
        return a5ErrorMsg;
    }

    public void setA5ErrorMsg(String value) {
        this.a5ErrorMsg = value;
    }

    public Long getA5AcctNo() {
        return a5AcctNo;
    }

    public void setA5AcctNo(Long value) {
        this.a5AcctNo = value;
    }

    public String getA5OutUserid() {
        return a5OutUserid;
    }

    public void setA5OutUserid(String value) {
        this.a5OutUserid = value;
    }

    public String getA5OutClientAcctId() {
        return a5OutClientAcctId;
    }

    public void setA5OutClientAcctId(String value) {
        this.a5OutClientAcctId = value;
    }

    public Long getA5InvoicingErrorCode() {
        return a5InvoicingErrorCode;
    }

    public void setA5InvoicingErrorCode(Long value) {
        this.a5InvoicingErrorCode = value;
    }

    public String getA5InvoicingErrorMsg() {
        return a5InvoicingErrorMsg;
    }

    public void setA5InvoicingErrorMsg(String value) {
        this.a5InvoicingErrorMsg = value;
    }

    public Long getA5InvoiceNo() {
        return a5InvoiceNo;
    }

    public void setA5InvoiceNo(Long value) {
        this.a5InvoiceNo = value;
    }

    public String getA5ProcCvvResponse() {
        return a5ProcCvvResponse;
    }

    public void setA5ProcCvvResponse(String value) {
        this.a5ProcCvvResponse = value;
    }

    public String getA5ProcAvsResponse() {
        return a5ProcAvsResponse;
    }

    public void setA5ProcAvsResponse(String value) {
        this.a5ProcAvsResponse = value;
    }

    public String getA5ProcCavvResponse() {
        return a5ProcCavvResponse;
    }

    public void setA5ProcCavvResponse(String value) {
        this.a5ProcCavvResponse = value;
    }

    public String getA5ProcStatusCode() {
        return a5ProcStatusCode;
    }

    public void setA5ProcStatusCode(String value) {
        this.a5ProcStatusCode = value;
    }

    public String getA5ProcStatusText() {
        return a5ProcStatusText;
    }

    public void setA5ProcStatusText(String value) {
        this.a5ProcStatusText = value;
    }

    public String getA5ProcPaymentId() {
        return a5ProcPaymentId;
    }

    public void setA5ProcPaymentId(String value) {
        this.a5ProcPaymentId = value;
    }

    public String getA5ProcAuthCode() {
        return a5ProcAuthCode;
    }

    public void setA5ProcAuthCode(String value) {
        this.a5ProcAuthCode = value;
    }

    public String getA5ProcMerchComments() {
        return a5ProcMerchComments;
    }

    public void setA5ProcMerchComments(String value) {
        this.a5ProcMerchComments = value;
    }

    public List<A5OutNewAcctPlanContractsReturnElement> getA5OutNewAcctPlanContracts() {
        if (this.a5OutNewAcctPlanContracts == null) {
            this.a5OutNewAcctPlanContracts = new ArrayList<A5OutNewAcctPlanContractsReturnElement>();
        }
        return this.a5OutNewAcctPlanContracts;
    }public Double getA5InvoiceChargesBeforeTax() {
        return a5InvoiceChargesBeforeTax;
    }

    public void setA5InvoiceChargesBeforeTax(Double value) {
        this.a5InvoiceChargesBeforeTax = value;
    }

    public Double getA5InvoiceTaxCharges() {
        return a5InvoiceTaxCharges;
    }

    public void setA5InvoiceTaxCharges(Double value) {
        this.a5InvoiceTaxCharges = value;
    }

    public Double getA5InvoiceChargesAfterTax() {
        return a5InvoiceChargesAfterTax;
    }

    public void setA5InvoiceChargesAfterTax(Double value) {
        this.a5InvoiceChargesAfterTax = value;
    }

    public Double getA5InvoiceCreditAmount() {
        return a5InvoiceCreditAmount;
    }

    public void setA5InvoiceCreditAmount(Double value) {
        this.a5InvoiceCreditAmount = value;
    }

    public Double getA5InvoiceTotalAmount() {
        return a5InvoiceTotalAmount;
    }

    public void setA5InvoiceTotalAmount(Double value) {
        this.a5InvoiceTotalAmount = value;
    }

    public List<A5NewAcctInvoiceLineItemsReturnElement> getA5NewAcctInvoiceLineItems() {
        if (this.a5NewAcctInvoiceLineItems == null) {
            this.a5NewAcctInvoiceLineItems = new ArrayList<A5NewAcctInvoiceLineItemsReturnElement>();
        }
        return this.a5NewAcctInvoiceLineItems;
    }public List<A5ThirdPartyErrorsReturnElement> getA5ThirdPartyErrors() {
        if (this.a5ThirdPartyErrors == null) {
            this.a5ThirdPartyErrors = new ArrayList<A5ThirdPartyErrorsReturnElement>();
        }
        return this.a5ThirdPartyErrors;
    }public String getA5SessionId() {
        return a5SessionId;
    }

    public void setA5SessionId(String value) {
        this.a5SessionId = value;
    }

    
}
