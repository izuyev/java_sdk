package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_new_acct_custom_rates_row", propOrder = {
    "a1CustomRatePlanNo",
    "a1CustomRateServiceNo",
    "a1CustomRateSeqNo",
    "a1CustomRateFromUnit",
    "a1CustomRateToUnit",
    "a1CustomRatePerUnit"
    })
public class A1NewAcctCustomRatesRow {

    @XmlElement(name = "a1_custom_rate_plan_no")
    protected Long a1CustomRatePlanNo;
    @XmlElement(name = "a1_custom_rate_service_no")
    protected Long a1CustomRateServiceNo;
    @XmlElement(name = "a1_custom_rate_seq_no")
    protected Long a1CustomRateSeqNo;
    @XmlElement(name = "a1_custom_rate_from_unit")
    protected Long a1CustomRateFromUnit;
    @XmlElement(name = "a1_custom_rate_to_unit")
    protected Long a1CustomRateToUnit;
    @XmlElement(name = "a1_custom_rate_per_unit")
    protected Double a1CustomRatePerUnit;
    public Long getA1CustomRatePlanNo() {
        return a1CustomRatePlanNo;
    }

    public void setA1CustomRatePlanNo(Long value) {
        this.a1CustomRatePlanNo = value;
    }

    public Long getA1CustomRateServiceNo() {
        return a1CustomRateServiceNo;
    }

    public void setA1CustomRateServiceNo(Long value) {
        this.a1CustomRateServiceNo = value;
    }

    public Long getA1CustomRateSeqNo() {
        return a1CustomRateSeqNo;
    }

    public void setA1CustomRateSeqNo(Long value) {
        this.a1CustomRateSeqNo = value;
    }

    public Long getA1CustomRateFromUnit() {
        return a1CustomRateFromUnit;
    }

    public void setA1CustomRateFromUnit(Long value) {
        this.a1CustomRateFromUnit = value;
    }

    public Long getA1CustomRateToUnit() {
        return a1CustomRateToUnit;
    }

    public void setA1CustomRateToUnit(Long value) {
        this.a1CustomRateToUnit = value;
    }

    public Double getA1CustomRatePerUnit() {
        return a1CustomRatePerUnit;
    }

    public void setA1CustomRatePerUnit(Double value) {
        this.a1CustomRatePerUnit = value;
    }

    
}
