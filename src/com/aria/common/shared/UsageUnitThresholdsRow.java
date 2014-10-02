package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_unit_thresholds_row", propOrder = {
    "planNo",
    "usageTypeNo",
    "usageTypeCode",
    "thresholdUnits",
    "thresholdLevelNo",
    "thresholdLevelValue"
    })
public class UsageUnitThresholdsRow {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
    @XmlElement(name = "threshold_units")
    protected Double thresholdUnits;
    @XmlElement(name = "threshold_level_no")
    protected Long thresholdLevelNo;
    @XmlElement(name = "threshold_level_value")
    protected Double thresholdLevelValue;
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }

    public Double getThresholdUnits() {
        return thresholdUnits;
    }

    public void setThresholdUnits(Double value) {
        this.thresholdUnits = value;
    }

    public Long getThresholdLevelNo() {
        return thresholdLevelNo;
    }

    public void setThresholdLevelNo(Long value) {
        this.thresholdLevelNo = value;
    }

    public Double getThresholdLevelValue() {
        return thresholdLevelValue;
    }

    public void setThresholdLevelValue(Double value) {
        this.thresholdLevelValue = value;
    }

    
}
