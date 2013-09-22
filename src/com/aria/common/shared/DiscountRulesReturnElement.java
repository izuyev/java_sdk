package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_rules_ReturnElement", propOrder = {"ruleNo", "clientRuleId", "ruleName", "scopeNo", "description", "flatPercentInd", "currencyCd", "amount", "inlineOffsetInd", "durationTypeInd", "maxApplicableMonths", "maxApplicationsPerAcct", "extDescription", "altServiceNo2Apply", "discountBundleNo"})
public class DiscountRulesReturnElement {

    @XmlElement(name = "rule_no")
    protected Long ruleNo;
    @XmlElement(name = "client_rule_id")
    protected String clientRuleId;
    @XmlElement(name = "rule_name")
    protected String ruleName;
    @XmlElement(name = "scope_no")
    protected Long scopeNo;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "flat_percent_ind")
    protected String flatPercentInd;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "inline_offset_ind")
    protected String inlineOffsetInd;
    @XmlElement(name = "duration_type_ind")
    protected String durationTypeInd;
    @XmlElement(name = "max_applicable_months")
    protected Long maxApplicableMonths;
    @XmlElement(name = "max_applications_per_acct")
    protected Long maxApplicationsPerAcct;
    @XmlElement(name = "ext_description")
    protected String extDescription;
    @XmlElement(name = "alt_service_no_2_apply")
    protected Long altServiceNo2Apply;
    @XmlElement(name = "discount_bundle_no")
    protected List<DiscountBundleNoReturnElement> discountBundleNo;
    
    public Long getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(Long value) {
        this.ruleNo = value;
    }

    public String getClientRuleId() {
        return clientRuleId;
    }

    public void setClientRuleId(String value) {
        this.clientRuleId = value;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String value) {
        this.ruleName = value;
    }

    public Long getScopeNo() {
        return scopeNo;
    }

    public void setScopeNo(Long value) {
        this.scopeNo = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getFlatPercentInd() {
        return flatPercentInd;
    }

    public void setFlatPercentInd(String value) {
        this.flatPercentInd = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getInlineOffsetInd() {
        return inlineOffsetInd;
    }

    public void setInlineOffsetInd(String value) {
        this.inlineOffsetInd = value;
    }

    public String getDurationTypeInd() {
        return durationTypeInd;
    }

    public void setDurationTypeInd(String value) {
        this.durationTypeInd = value;
    }

    public Long getMaxApplicableMonths() {
        return maxApplicableMonths;
    }

    public void setMaxApplicableMonths(Long value) {
        this.maxApplicableMonths = value;
    }

    public Long getMaxApplicationsPerAcct() {
        return maxApplicationsPerAcct;
    }

    public void setMaxApplicationsPerAcct(Long value) {
        this.maxApplicationsPerAcct = value;
    }

    public String getExtDescription() {
        return extDescription;
    }

    public void setExtDescription(String value) {
        this.extDescription = value;
    }

    public Long getAltServiceNo2Apply() {
        return altServiceNo2Apply;
    }

    public void setAltServiceNo2Apply(Long value) {
        this.altServiceNo2Apply = value;
    }

    public List<DiscountBundleNoReturnElement> getDiscountBundleNo() {
        if (this.discountBundleNo == null) {
            this.discountBundleNo = new ArrayList<DiscountBundleNoReturnElement>();
        }
        return this.discountBundleNo;
    }
}
