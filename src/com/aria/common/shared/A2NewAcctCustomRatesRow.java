package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_new_acct_custom_rates_row", propOrder = {
    "a2CustomRatePlanNo",
    "a2CustomRateServiceNo",
    "a2CustomRateSeqNo",
    "a2CustomRateFromUnit",
    "a2CustomRateToUnit",
    "a2CustomRatePerUnit"
    })
public class A2NewAcctCustomRatesRow {

    @XmlElement(name = "a2_custom_rate_plan_no")
    protected Long a2CustomRatePlanNo;
    @XmlElement(name = "a2_custom_rate_service_no")
    protected Long a2CustomRateServiceNo;
    @XmlElement(name = "a2_custom_rate_seq_no")
    protected Long a2CustomRateSeqNo;
    @XmlElement(name = "a2_custom_rate_from_unit")
    protected Long a2CustomRateFromUnit;
    @XmlElement(name = "a2_custom_rate_to_unit")
    protected Long a2CustomRateToUnit;
    @XmlElement(name = "a2_custom_rate_per_unit")
    protected Double a2CustomRatePerUnit;
    public Long getA2CustomRatePlanNo() {
        return a2CustomRatePlanNo;
    }

    public void setA2CustomRatePlanNo(Long value) {
        this.a2CustomRatePlanNo = value;
    }

    public Long getA2CustomRateServiceNo() {
        return a2CustomRateServiceNo;
    }

    public void setA2CustomRateServiceNo(Long value) {
        this.a2CustomRateServiceNo = value;
    }

    public Long getA2CustomRateSeqNo() {
        return a2CustomRateSeqNo;
    }

    public void setA2CustomRateSeqNo(Long value) {
        this.a2CustomRateSeqNo = value;
    }

    public Long getA2CustomRateFromUnit() {
        return a2CustomRateFromUnit;
    }

    public void setA2CustomRateFromUnit(Long value) {
        this.a2CustomRateFromUnit = value;
    }

    public Long getA2CustomRateToUnit() {
        return a2CustomRateToUnit;
    }

    public void setA2CustomRateToUnit(Long value) {
        this.a2CustomRateToUnit = value;
    }

    public Double getA2CustomRatePerUnit() {
        return a2CustomRatePerUnit;
    }

    public void setA2CustomRatePerUnit(Double value) {
        this.a2CustomRatePerUnit = value;
    }

    
}
