package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_templates_ReturnElement", propOrder = {"creditTemplateNo", "templateName", "flatAmount", "percentAmount", "percentEvalPlanNo", "percentEvalServiceNo", "currencyCd", "eligiblePlanNo", "eligibleServiceNo", "altServiceNo2Apply", "numCreditsRequired", "creditIntervalMonths", "eligibleServiceTypes"})
public class CreditTemplatesReturnElement {

    @XmlElement(name = "credit_template_no")
    protected Long creditTemplateNo;
    @XmlElement(name = "template_name")
    protected String templateName;
    @XmlElement(name = "flat_amount")
    protected Double flatAmount;
    @XmlElement(name = "percent_amount")
    protected Double percentAmount;
    @XmlElement(name = "percent_eval_plan_no")
    protected Long percentEvalPlanNo;
    @XmlElement(name = "percent_eval_service_no")
    protected Long percentEvalServiceNo;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "eligible_plan_no")
    protected Long eligiblePlanNo;
    @XmlElement(name = "eligible_service_no")
    protected Long eligibleServiceNo;
    @XmlElement(name = "alt_service_no_2_apply")
    protected Long altServiceNo2Apply;
    @XmlElement(name = "num_credits_required")
    protected Double numCreditsRequired;
    @XmlElement(name = "credit_interval_months")
    protected Long creditIntervalMonths;
    @XmlElement(name = "eligible_service_types")
    protected List<EligibleServiceTypesReturnElement> eligibleServiceTypes;
    
    public Long getCreditTemplateNo() {
        return creditTemplateNo;
    }

    public void setCreditTemplateNo(Long value) {
        this.creditTemplateNo = value;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String value) {
        this.templateName = value;
    }

    public Double getFlatAmount() {
        return flatAmount;
    }

    public void setFlatAmount(Double value) {
        this.flatAmount = value;
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
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

    public Long getAltServiceNo2Apply() {
        return altServiceNo2Apply;
    }

    public void setAltServiceNo2Apply(Long value) {
        this.altServiceNo2Apply = value;
    }

    public Double getNumCreditsRequired() {
        return numCreditsRequired;
    }

    public void setNumCreditsRequired(Double value) {
        this.numCreditsRequired = value;
    }

    public Long getCreditIntervalMonths() {
        return creditIntervalMonths;
    }

    public void setCreditIntervalMonths(Long value) {
        this.creditIntervalMonths = value;
    }

    public List<EligibleServiceTypesReturnElement> getEligibleServiceTypes() {
        if (this.eligibleServiceTypes == null) {
            this.eligibleServiceTypes = new ArrayList<EligibleServiceTypesReturnElement>();
        }
        return this.eligibleServiceTypes;
    }
}
