package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "existingSuppPlanNo",    "newSuppPlanNo",    "altRateScheduleNo",    "numPlanUnits",    "couponCode",    "assignmentDirective",    "comments",    "doWrite",    "clientReceiptId",    "offsetMonths",    "autoOffsetMonthsOption",    "altClientAcctGroupId",    "newAcctCustomRates",    "effectiveDate",    "offsetInterval",    "invoiceUnbilledUsage",    "syncMstrBillDatesOverride",    "clientExistingSuppPlanId",    "clientNewSuppPlanId",    "clientAltRateScheduleId"})
@XmlRootElement(name = "replace_supp_plan")
public class ReplaceSuppPlan {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "existing_supp_plan_no")
    protected Long existingSuppPlanNo;
        @XmlElement(name = "new_supp_plan_no")
    protected Long newSuppPlanNo;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "num_plan_units")
    protected Long numPlanUnits;
        @XmlElement(name = "coupon_code")
    protected String couponCode;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "offset_months")
    protected Long offsetMonths;
        @XmlElement(name = "auto_offset_months_option")
    protected Long autoOffsetMonthsOption;
        @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
        @XmlElement(name = "new_acct_custom_rates")
    protected NewAcctCustomRatesArray newAcctCustomRates;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "invoice_unbilled_usage")
    protected String invoiceUnbilledUsage;
        @XmlElement(name = "sync_mstr_bill_dates_override")
    protected Long syncMstrBillDatesOverride;
        @XmlElement(name = "client_existing_supp_plan_id")
    protected String clientExistingSuppPlanId;
        @XmlElement(name = "client_new_supp_plan_id")
    protected String clientNewSuppPlanId;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    
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
            public Long getExistingSuppPlanNo() {
        return existingSuppPlanNo;
    }

    public void setExistingSuppPlanNo(Long value) {
        this.existingSuppPlanNo = value;
    }
            public Long getNewSuppPlanNo() {
        return newSuppPlanNo;
    }

    public void setNewSuppPlanNo(Long value) {
        this.newSuppPlanNo = value;
    }
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public Long getNumPlanUnits() {
        return numPlanUnits;
    }

    public void setNumPlanUnits(Long value) {
        this.numPlanUnits = value;
    }
            public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String value) {
        this.couponCode = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
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
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }
            public Long getAutoOffsetMonthsOption() {
        return autoOffsetMonthsOption;
    }

    public void setAutoOffsetMonthsOption(Long value) {
        this.autoOffsetMonthsOption = value;
    }
            public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
    }
            public NewAcctCustomRatesArray getNewAcctCustomRates() {
        return newAcctCustomRates;
    }

    public void setNewAcctCustomRates(NewAcctCustomRatesArray value) {
        this.newAcctCustomRates = value;
    }
            public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }
            public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }
            public String getInvoiceUnbilledUsage() {
        return invoiceUnbilledUsage;
    }

    public void setInvoiceUnbilledUsage(String value) {
        this.invoiceUnbilledUsage = value;
    }
            public Long getSyncMstrBillDatesOverride() {
        return syncMstrBillDatesOverride;
    }

    public void setSyncMstrBillDatesOverride(Long value) {
        this.syncMstrBillDatesOverride = value;
    }
            public String getClientExistingSuppPlanId() {
        return clientExistingSuppPlanId;
    }

    public void setClientExistingSuppPlanId(String value) {
        this.clientExistingSuppPlanId = value;
    }
            public String getClientNewSuppPlanId() {
        return clientNewSuppPlanId;
    }

    public void setClientNewSuppPlanId(String value) {
        this.clientNewSuppPlanId = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            
}
