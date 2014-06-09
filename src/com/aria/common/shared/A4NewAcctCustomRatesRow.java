package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_new_acct_custom_rates_row", propOrder = {
    "a4CustomRatePlanNo",
    "a4CustomRateServiceNo",
    "a4CustomRateSeqNo",
    "a4CustomRateFromUnit",
    "a4CustomRateToUnit",
    "a4CustomRatePerUnit",
    "a4ClientCustomRatePlanId",
    "a4ClientCustomRateServiceId"
    })
public class A4NewAcctCustomRatesRow {

    @XmlElement(name = "a4_custom_rate_plan_no")
    protected Long a4CustomRatePlanNo;
    @XmlElement(name = "a4_custom_rate_service_no")
    protected Long a4CustomRateServiceNo;
    @XmlElement(name = "a4_custom_rate_seq_no")
    protected Long a4CustomRateSeqNo;
    @XmlElement(name = "a4_custom_rate_from_unit")
    protected Long a4CustomRateFromUnit;
    @XmlElement(name = "a4_custom_rate_to_unit")
    protected Long a4CustomRateToUnit;
    @XmlElement(name = "a4_custom_rate_per_unit")
    protected Double a4CustomRatePerUnit;
    @XmlElement(name = "a4_client_custom_rate_plan_id")
    protected String a4ClientCustomRatePlanId;
    @XmlElement(name = "a4_client_custom_rate_service_id")
    protected String a4ClientCustomRateServiceId;
    public Long getA4CustomRatePlanNo() {
        return a4CustomRatePlanNo;
    }

    public void setA4CustomRatePlanNo(Long value) {
        this.a4CustomRatePlanNo = value;
    }

    public Long getA4CustomRateServiceNo() {
        return a4CustomRateServiceNo;
    }

    public void setA4CustomRateServiceNo(Long value) {
        this.a4CustomRateServiceNo = value;
    }

    public Long getA4CustomRateSeqNo() {
        return a4CustomRateSeqNo;
    }

    public void setA4CustomRateSeqNo(Long value) {
        this.a4CustomRateSeqNo = value;
    }

    public Long getA4CustomRateFromUnit() {
        return a4CustomRateFromUnit;
    }

    public void setA4CustomRateFromUnit(Long value) {
        this.a4CustomRateFromUnit = value;
    }

    public Long getA4CustomRateToUnit() {
        return a4CustomRateToUnit;
    }

    public void setA4CustomRateToUnit(Long value) {
        this.a4CustomRateToUnit = value;
    }

    public Double getA4CustomRatePerUnit() {
        return a4CustomRatePerUnit;
    }

    public void setA4CustomRatePerUnit(Double value) {
        this.a4CustomRatePerUnit = value;
    }

    public String getA4ClientCustomRatePlanId() {
        return a4ClientCustomRatePlanId;
    }

    public void setA4ClientCustomRatePlanId(String value) {
        this.a4ClientCustomRatePlanId = value;
    }

    public String getA4ClientCustomRateServiceId() {
        return a4ClientCustomRateServiceId;
    }

    public void setA4ClientCustomRateServiceId(String value) {
        this.a4ClientCustomRateServiceId = value;
    }

    
}
