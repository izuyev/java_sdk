package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "amount",    "reasonCode",    "comments",    "eligiblePlanNo",    "eligibleServiceNo",    "altServiceNoToApply",    "frequencyNo",    "frequencyIntervalMonths",    "initialCreditDate",    "percentAmount",    "percentEvalPlanNo",    "percentEvalServiceNo",    "eligibleServiceTypes",    "clientEligiblePlanId",    "clientEligibleServiceId",    "clientAltServiceIdToApply",    "clientPercentEvalPlanId",    "clientPercentEvalServiceId"})
@XmlRootElement(name = "create_advanced_service_credit")
public class CreateAdvancedServiceCredit {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "amount")
    protected Double amount;
        @XmlElement(name = "reason_code")
    protected Long reasonCode;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "eligible_plan_no")
    protected Long eligiblePlanNo;
        @XmlElement(name = "eligible_service_no")
    protected Long eligibleServiceNo;
        @XmlElement(name = "alt_service_no_to_apply")
    protected Long altServiceNoToApply;
        @XmlElement(name = "frequency_no")
    protected Long frequencyNo;
        @XmlElement(name = "frequency_interval_months")
    protected Long frequencyIntervalMonths;
        @XmlElement(name = "initial_credit_date")
    protected String initialCreditDate;
        @XmlElement(name = "percent_amount")
    protected Double percentAmount;
        @XmlElement(name = "percent_eval_plan_no")
    protected Long percentEvalPlanNo;
        @XmlElement(name = "percent_eval_service_no")
    protected Long percentEvalServiceNo;
        @XmlElement(name = "eligible_service_types")
    protected EligibleServiceTypesArray eligibleServiceTypes;
        @XmlElement(name = "client_eligible_plan_id")
    protected String clientEligiblePlanId;
        @XmlElement(name = "client_eligible_service_id")
    protected String clientEligibleServiceId;
        @XmlElement(name = "client_alt_service_id_to_apply")
    protected String clientAltServiceIdToApply;
        @XmlElement(name = "client_percent_eval_plan_id")
    protected String clientPercentEvalPlanId;
        @XmlElement(name = "client_percent_eval_service_id")
    protected String clientPercentEvalServiceId;
    
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
            public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }
            public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public Long getEligiblePlanNo() {
        return eligiblePlanNo;
    }

    public void setEligiblePlanNo(Long value) {
        this.eligiblePlanNo = value;
    }
            public Long getEligibleServiceNo() {
        return eligibleServiceNo;
    }

    public void setEligibleServiceNo(Long value) {
        this.eligibleServiceNo = value;
    }
            public Long getAltServiceNoToApply() {
        return altServiceNoToApply;
    }

    public void setAltServiceNoToApply(Long value) {
        this.altServiceNoToApply = value;
    }
            public Long getFrequencyNo() {
        return frequencyNo;
    }

    public void setFrequencyNo(Long value) {
        this.frequencyNo = value;
    }
            public Long getFrequencyIntervalMonths() {
        return frequencyIntervalMonths;
    }

    public void setFrequencyIntervalMonths(Long value) {
        this.frequencyIntervalMonths = value;
    }
            public String getInitialCreditDate() {
        return initialCreditDate;
    }

    public void setInitialCreditDate(String value) {
        this.initialCreditDate = value;
    }
            public Double getPercentAmount() {
        return percentAmount;
    }

    public void setPercentAmount(Double value) {
        this.percentAmount = value;
    }
            public Long getPercentEvalPlanNo() {
        return percentEvalPlanNo;
    }

    public void setPercentEvalPlanNo(Long value) {
        this.percentEvalPlanNo = value;
    }
            public Long getPercentEvalServiceNo() {
        return percentEvalServiceNo;
    }

    public void setPercentEvalServiceNo(Long value) {
        this.percentEvalServiceNo = value;
    }
            public EligibleServiceTypesArray getEligibleServiceTypes() {
        return eligibleServiceTypes;
    }

    public void setEligibleServiceTypes(EligibleServiceTypesArray value) {
        this.eligibleServiceTypes = value;
    }
            public String getClientEligiblePlanId() {
        return clientEligiblePlanId;
    }

    public void setClientEligiblePlanId(String value) {
        this.clientEligiblePlanId = value;
    }
            public String getClientEligibleServiceId() {
        return clientEligibleServiceId;
    }

    public void setClientEligibleServiceId(String value) {
        this.clientEligibleServiceId = value;
    }
            public String getClientAltServiceIdToApply() {
        return clientAltServiceIdToApply;
    }

    public void setClientAltServiceIdToApply(String value) {
        this.clientAltServiceIdToApply = value;
    }
            public String getClientPercentEvalPlanId() {
        return clientPercentEvalPlanId;
    }

    public void setClientPercentEvalPlanId(String value) {
        this.clientPercentEvalPlanId = value;
    }
            public String getClientPercentEvalServiceId() {
        return clientPercentEvalServiceId;
    }

    public void setClientPercentEvalServiceId(String value) {
        this.clientPercentEvalServiceId = value;
    }
            
}
