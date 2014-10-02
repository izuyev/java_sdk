package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threshold_levels_ReturnElement", propOrder = {"levelNo", "thresholdValue", "deltaUsageUnitsBal", "deltaUsageUnitsSign"})
public class ThresholdLevelsReturnElement {

    @XmlElement(name = "level_no")
    protected Long levelNo;
    @XmlElement(name = "threshold_value")
    protected Double thresholdValue;
    @XmlElement(name = "delta_usage_units_bal")
    protected Double deltaUsageUnitsBal;
    @XmlElement(name = "delta_usage_units_sign")
    protected String deltaUsageUnitsSign;
    
    public Long getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(Long value) {
        this.levelNo = value;
    }

    public Double getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(Double value) {
        this.thresholdValue = value;
    }

    public Double getDeltaUsageUnitsBal() {
        return deltaUsageUnitsBal;
    }

    public void setDeltaUsageUnitsBal(Double value) {
        this.deltaUsageUnitsBal = value;
    }

    public String getDeltaUsageUnitsSign() {
        return deltaUsageUnitsSign;
    }

    public void setDeltaUsageUnitsSign(String value) {
        this.deltaUsageUnitsSign = value;
    }

    
}
