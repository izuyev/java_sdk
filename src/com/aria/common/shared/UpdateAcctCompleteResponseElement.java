package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "prorationResultAmount", "collectionErrorCode", "collectionErrorMsg", "parentChildSyncErrorCode", "parentChildSyncErrorMsg", "masterPlanErrorCode", "masterPlanErrorMsg", "masterPlanCollErrorCode", "masterPlanCollErrorMsg", "masterPlanStmtErrorCode", "masterPlanStmtErrorMsg", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "invoiceNo", "cancelledSuppPlans", "thirdPartyErrors"})
@XmlRootElement(name = "update_acct_completeResponseElement")
public class UpdateAcctCompleteResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "proration_result_amount")
    protected Double prorationResultAmount;
    @XmlElement(name = "collection_error_code")
    protected Long collectionErrorCode;
    @XmlElement(name = "collection_error_msg")
    protected String collectionErrorMsg;
    @XmlElement(name = "parent_child_sync_error_code")
    protected Long parentChildSyncErrorCode;
    @XmlElement(name = "parent_child_sync_error_msg")
    protected String parentChildSyncErrorMsg;
    @XmlElement(name = "master_plan_error_code")
    protected Long masterPlanErrorCode;
    @XmlElement(name = "master_plan_error_msg")
    protected String masterPlanErrorMsg;
    @XmlElement(name = "master_plan_coll_error_code")
    protected Long masterPlanCollErrorCode;
    @XmlElement(name = "master_plan_coll_error_msg")
    protected String masterPlanCollErrorMsg;
    @XmlElement(name = "master_plan_stmt_error_code")
    protected Long masterPlanStmtErrorCode;
    @XmlElement(name = "master_plan_stmt_error_msg")
    protected String masterPlanStmtErrorMsg;
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
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "cancelled_supp_plans")
    protected List<CancelledSuppPlansReturnElement> cancelledSuppPlans;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    
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

    public Double getProrationResultAmount() {
        return prorationResultAmount;
    }

    public void setProrationResultAmount(Double value) {
        this.prorationResultAmount = value;
    }

    public Long getCollectionErrorCode() {
        return collectionErrorCode;
    }

    public void setCollectionErrorCode(Long value) {
        this.collectionErrorCode = value;
    }

    public String getCollectionErrorMsg() {
        return collectionErrorMsg;
    }

    public void setCollectionErrorMsg(String value) {
        this.collectionErrorMsg = value;
    }

    public Long getParentChildSyncErrorCode() {
        return parentChildSyncErrorCode;
    }

    public void setParentChildSyncErrorCode(Long value) {
        this.parentChildSyncErrorCode = value;
    }

    public String getParentChildSyncErrorMsg() {
        return parentChildSyncErrorMsg;
    }

    public void setParentChildSyncErrorMsg(String value) {
        this.parentChildSyncErrorMsg = value;
    }

    public Long getMasterPlanErrorCode() {
        return masterPlanErrorCode;
    }

    public void setMasterPlanErrorCode(Long value) {
        this.masterPlanErrorCode = value;
    }

    public String getMasterPlanErrorMsg() {
        return masterPlanErrorMsg;
    }

    public void setMasterPlanErrorMsg(String value) {
        this.masterPlanErrorMsg = value;
    }

    public Long getMasterPlanCollErrorCode() {
        return masterPlanCollErrorCode;
    }

    public void setMasterPlanCollErrorCode(Long value) {
        this.masterPlanCollErrorCode = value;
    }

    public String getMasterPlanCollErrorMsg() {
        return masterPlanCollErrorMsg;
    }

    public void setMasterPlanCollErrorMsg(String value) {
        this.masterPlanCollErrorMsg = value;
    }

    public Long getMasterPlanStmtErrorCode() {
        return masterPlanStmtErrorCode;
    }

    public void setMasterPlanStmtErrorCode(Long value) {
        this.masterPlanStmtErrorCode = value;
    }

    public String getMasterPlanStmtErrorMsg() {
        return masterPlanStmtErrorMsg;
    }

    public void setMasterPlanStmtErrorMsg(String value) {
        this.masterPlanStmtErrorMsg = value;
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

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public List<CancelledSuppPlansReturnElement> getCancelledSuppPlans() {
        if (this.cancelledSuppPlans == null) {
            this.cancelledSuppPlans = new ArrayList<CancelledSuppPlansReturnElement>();
        }
        return this.cancelledSuppPlans;
    }public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
