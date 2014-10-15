package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "suppPlanNo",    "altRateScheduleNo",    "numPlanUnits",    "couponCode",    "assignmentDirective",    "comments",    "doWrite",    "clientReceiptId",    "newAcctCustomRates",    "effectiveDate",    "offsetInterval",    "clientPlanId",    "clientAltRateScheduleId",    "surchargeNo"})
@XmlRootElement(name = "modify_supp_plan")
public class ModifySuppPlan {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
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
        @XmlElement(name = "new_acct_custom_rates")
    protected NewAcctCustomRatesArray newAcctCustomRates;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
        @XmlElement(name = "surcharge_no")
    protected SurchargeNoArray surchargeNo;
    
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
            public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
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
            public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            public SurchargeNoArray getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(SurchargeNoArray value) {
        this.surchargeNo = value;
    }
            
}
