package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","masterPlanNo","altRateScheduleNo","numPlanUnits","assignmentDirective","doWrite","clientReceiptId","forceCurrencyChange","autoCancelSuppPlans","offsetMonths","altProrationStartDate","altClientAcctGroupId","newAcctCustomRates","effectiveDate","offsetInterval","invoiceUnbilledUsage","couponCode"})
@XmlRootElement(name = "update_master_plan")
public class UpdateMasterPlan {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "master_plan_no")
    protected Long masterPlanNo;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "num_plan_units")
    protected Long numPlanUnits;
    @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
    @XmlElement(name = "do_write")
    protected String doWrite;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "force_currency_change")
    protected String forceCurrencyChange;
    @XmlElement(name = "auto_cancel_supp_plans")
    protected String autoCancelSuppPlans;
    @XmlElement(name = "offset_months")
    protected Long offsetMonths;
    @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
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
    @XmlElement(name = "coupon_code")
    protected String couponCode;
    
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
    
    public Long getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(Long value) {
        this.masterPlanNo = value;
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
    
    public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
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
    
    public String getForceCurrencyChange() {
        return forceCurrencyChange;
    }

    public void setForceCurrencyChange(String value) {
        this.forceCurrencyChange = value;
    }
    
    public String getAutoCancelSuppPlans() {
        return autoCancelSuppPlans;
    }

    public void setAutoCancelSuppPlans(String value) {
        this.autoCancelSuppPlans = value;
    }
    
    public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }
    
    public String getAltProrationStartDate() {
        return altProrationStartDate;
    }

    public void setAltProrationStartDate(String value) {
        this.altProrationStartDate = value;
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
    
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String value) {
        this.couponCode = value;
    }
    
    
}
