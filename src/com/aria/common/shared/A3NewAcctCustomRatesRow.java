package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_new_acct_custom_rates_row", propOrder = {
    "a3CustomRatePlanNo",
    "a3CustomRateServiceNo",
    "a3CustomRateSeqNo",
    "a3CustomRateFromUnit",
    "a3CustomRateToUnit",
    "a3CustomRatePerUnit"
    })
public class A3NewAcctCustomRatesRow {

    @XmlElement(name = "a3_custom_rate_plan_no")
    protected Long a3CustomRatePlanNo;
    @XmlElement(name = "a3_custom_rate_service_no")
    protected Long a3CustomRateServiceNo;
    @XmlElement(name = "a3_custom_rate_seq_no")
    protected Long a3CustomRateSeqNo;
    @XmlElement(name = "a3_custom_rate_from_unit")
    protected Long a3CustomRateFromUnit;
    @XmlElement(name = "a3_custom_rate_to_unit")
    protected Long a3CustomRateToUnit;
    @XmlElement(name = "a3_custom_rate_per_unit")
    protected Double a3CustomRatePerUnit;
    public Long getA3CustomRatePlanNo() {
        return a3CustomRatePlanNo;
    }

    public void setA3CustomRatePlanNo(Long value) {
        this.a3CustomRatePlanNo = value;
    }

    public Long getA3CustomRateServiceNo() {
        return a3CustomRateServiceNo;
    }

    public void setA3CustomRateServiceNo(Long value) {
        this.a3CustomRateServiceNo = value;
    }

    public Long getA3CustomRateSeqNo() {
        return a3CustomRateSeqNo;
    }

    public void setA3CustomRateSeqNo(Long value) {
        this.a3CustomRateSeqNo = value;
    }

    public Long getA3CustomRateFromUnit() {
        return a3CustomRateFromUnit;
    }

    public void setA3CustomRateFromUnit(Long value) {
        this.a3CustomRateFromUnit = value;
    }

    public Long getA3CustomRateToUnit() {
        return a3CustomRateToUnit;
    }

    public void setA3CustomRateToUnit(Long value) {
        this.a3CustomRateToUnit = value;
    }

    public Double getA3CustomRatePerUnit() {
        return a3CustomRatePerUnit;
    }

    public void setA3CustomRatePerUnit(Double value) {
        this.a3CustomRatePerUnit = value;
    }

    
}
