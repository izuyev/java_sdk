package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plans_ReturnElement", propOrder = {"planNo", "planName", "billingInterval", "suppPlanInd", "billingInd", "noDisplayInd", "serviceNo", "serviceDesc", "rolloverMonths", "rolloverPlanNo", "earlyCancelFee", "earlyCancelMinMonths", "suspensionPeriod", "newAcctStatusCd", "rolloverAcctStatusCd", "rolloverAcctStatusDays", "initFreeMonths", "plan2AssignOnSusp", "daysTillSuspend", "rateSeqNo", "fromUnit", "toUnit", "ratePerUnit", "monthlyFee", "currencyCd", "planDesc"})
public class ClientPlansReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "billing_interval")
    protected Long billingInterval;
    @XmlElement(name = "supp_plan_ind")
    protected Long suppPlanInd;
    @XmlElement(name = "billing_ind")
    protected Long billingInd;
    @XmlElement(name = "no_display_ind")
    protected Long noDisplayInd;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_desc")
    protected String serviceDesc;
    @XmlElement(name = "rollover_months")
    protected Long rolloverMonths;
    @XmlElement(name = "rollover_plan_no")
    protected Long rolloverPlanNo;
    @XmlElement(name = "early_cancel_fee")
    protected Double earlyCancelFee;
    @XmlElement(name = "early_cancel_min_months")
    protected Long earlyCancelMinMonths;
    @XmlElement(name = "suspension_period")
    protected Long suspensionPeriod;
    @XmlElement(name = "new_acct_status_cd")
    protected Long newAcctStatusCd;
    @XmlElement(name = "rollover_acct_status_cd")
    protected Long rolloverAcctStatusCd;
    @XmlElement(name = "rollover_acct_status_days")
    protected Long rolloverAcctStatusDays;
    @XmlElement(name = "init_free_months")
    protected Long initFreeMonths;
    @XmlElement(name = "plan_2_assign_on_susp")
    protected Long plan2AssignOnSusp;
    @XmlElement(name = "days_till_suspend")
    protected Long daysTillSuspend;
    @XmlElement(name = "rate_seq_no")
    protected Long rateSeqNo;
    @XmlElement(name = "from_unit")
    protected Double fromUnit;
    @XmlElement(name = "to_unit")
    protected Double toUnit;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "monthly_fee")
    protected Double monthlyFee;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public Long getBillingInterval() {
        return billingInterval;
    }

    public void setBillingInterval(Long value) {
        this.billingInterval = value;
    }

    public Long getSuppPlanInd() {
        return suppPlanInd;
    }

    public void setSuppPlanInd(Long value) {
        this.suppPlanInd = value;
    }

    public Long getBillingInd() {
        return billingInd;
    }

    public void setBillingInd(Long value) {
        this.billingInd = value;
    }

    public Long getNoDisplayInd() {
        return noDisplayInd;
    }

    public void setNoDisplayInd(Long value) {
        this.noDisplayInd = value;
    }

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String value) {
        this.serviceDesc = value;
    }

    public Long getRolloverMonths() {
        return rolloverMonths;
    }

    public void setRolloverMonths(Long value) {
        this.rolloverMonths = value;
    }

    public Long getRolloverPlanNo() {
        return rolloverPlanNo;
    }

    public void setRolloverPlanNo(Long value) {
        this.rolloverPlanNo = value;
    }

    public Double getEarlyCancelFee() {
        return earlyCancelFee;
    }

    public void setEarlyCancelFee(Double value) {
        this.earlyCancelFee = value;
    }

    public Long getEarlyCancelMinMonths() {
        return earlyCancelMinMonths;
    }

    public void setEarlyCancelMinMonths(Long value) {
        this.earlyCancelMinMonths = value;
    }

    public Long getSuspensionPeriod() {
        return suspensionPeriod;
    }

    public void setSuspensionPeriod(Long value) {
        this.suspensionPeriod = value;
    }

    public Long getNewAcctStatusCd() {
        return newAcctStatusCd;
    }

    public void setNewAcctStatusCd(Long value) {
        this.newAcctStatusCd = value;
    }

    public Long getRolloverAcctStatusCd() {
        return rolloverAcctStatusCd;
    }

    public void setRolloverAcctStatusCd(Long value) {
        this.rolloverAcctStatusCd = value;
    }

    public Long getRolloverAcctStatusDays() {
        return rolloverAcctStatusDays;
    }

    public void setRolloverAcctStatusDays(Long value) {
        this.rolloverAcctStatusDays = value;
    }

    public Long getInitFreeMonths() {
        return initFreeMonths;
    }

    public void setInitFreeMonths(Long value) {
        this.initFreeMonths = value;
    }

    public Long getPlan2AssignOnSusp() {
        return plan2AssignOnSusp;
    }

    public void setPlan2AssignOnSusp(Long value) {
        this.plan2AssignOnSusp = value;
    }

    public Long getDaysTillSuspend() {
        return daysTillSuspend;
    }

    public void setDaysTillSuspend(Long value) {
        this.daysTillSuspend = value;
    }

    public Long getRateSeqNo() {
        return rateSeqNo;
    }

    public void setRateSeqNo(Long value) {
        this.rateSeqNo = value;
    }

    public Double getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(Double value) {
        this.fromUnit = value;
    }

    public Double getToUnit() {
        return toUnit;
    }

    public void setToUnit(Double value) {
        this.toUnit = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double value) {
        this.monthlyFee = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getPlanDesc() {
        return planDesc;
    }

    public void setPlanDesc(String value) {
        this.planDesc = value;
    }

    
}
