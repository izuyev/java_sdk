package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_new_acct_custom_rates_row", propOrder = {
    "a5CustomRatePlanNo",
    "a5CustomRateServiceNo",
    "a5CustomRateSeqNo",
    "a5CustomRateFromUnit",
    "a5CustomRateToUnit",
    "a5CustomRatePerUnit",
    "a5ClientCustomRatePlanId",
    "a5ClientCustomRateServiceId"
    })
public class A5NewAcctCustomRatesRow {

    @XmlElement(name = "a5_custom_rate_plan_no")
    protected Long a5CustomRatePlanNo;
    @XmlElement(name = "a5_custom_rate_service_no")
    protected Long a5CustomRateServiceNo;
    @XmlElement(name = "a5_custom_rate_seq_no")
    protected Long a5CustomRateSeqNo;
    @XmlElement(name = "a5_custom_rate_from_unit")
    protected Long a5CustomRateFromUnit;
    @XmlElement(name = "a5_custom_rate_to_unit")
    protected Long a5CustomRateToUnit;
    @XmlElement(name = "a5_custom_rate_per_unit")
    protected Double a5CustomRatePerUnit;
    @XmlElement(name = "a5_client_custom_rate_plan_id")
    protected String a5ClientCustomRatePlanId;
    @XmlElement(name = "a5_client_custom_rate_service_id")
    protected String a5ClientCustomRateServiceId;
    public Long getA5CustomRatePlanNo() {
        return a5CustomRatePlanNo;
    }

    public void setA5CustomRatePlanNo(Long value) {
        this.a5CustomRatePlanNo = value;
    }

    public Long getA5CustomRateServiceNo() {
        return a5CustomRateServiceNo;
    }

    public void setA5CustomRateServiceNo(Long value) {
        this.a5CustomRateServiceNo = value;
    }

    public Long getA5CustomRateSeqNo() {
        return a5CustomRateSeqNo;
    }

    public void setA5CustomRateSeqNo(Long value) {
        this.a5CustomRateSeqNo = value;
    }

    public Long getA5CustomRateFromUnit() {
        return a5CustomRateFromUnit;
    }

    public void setA5CustomRateFromUnit(Long value) {
        this.a5CustomRateFromUnit = value;
    }

    public Long getA5CustomRateToUnit() {
        return a5CustomRateToUnit;
    }

    public void setA5CustomRateToUnit(Long value) {
        this.a5CustomRateToUnit = value;
    }

    public Double getA5CustomRatePerUnit() {
        return a5CustomRatePerUnit;
    }

    public void setA5CustomRatePerUnit(Double value) {
        this.a5CustomRatePerUnit = value;
    }

    public String getA5ClientCustomRatePlanId() {
        return a5ClientCustomRatePlanId;
    }

    public void setA5ClientCustomRatePlanId(String value) {
        this.a5ClientCustomRatePlanId = value;
    }

    public String getA5ClientCustomRateServiceId() {
        return a5ClientCustomRateServiceId;
    }

    public void setA5ClientCustomRateServiceId(String value) {
        this.a5ClientCustomRateServiceId = value;
    }

    
}
