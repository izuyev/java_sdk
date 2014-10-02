package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unit_threshold_details_ReturnElement", propOrder = {"planNo", "usageTypeNo", "thresholdDestType", "thresholdBalanceType", "thresholdUnits", "usageUnitsMeasured", "thresholdLevels"})
public class UnitThresholdDetailsReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "threshold_dest_type")
    protected String thresholdDestType;
    @XmlElement(name = "threshold_balance_type")
    protected String thresholdBalanceType;
    @XmlElement(name = "threshold_units")
    protected Double thresholdUnits;
    @XmlElement(name = "usage_units_measured")
    protected Double usageUnitsMeasured;
    @XmlElement(name = "threshold_levels")
    protected List<ThresholdLevelsReturnElement> thresholdLevels;
    
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

    public String getThresholdDestType() {
        return thresholdDestType;
    }

    public void setThresholdDestType(String value) {
        this.thresholdDestType = value;
    }

    public String getThresholdBalanceType() {
        return thresholdBalanceType;
    }

    public void setThresholdBalanceType(String value) {
        this.thresholdBalanceType = value;
    }

    public Double getThresholdUnits() {
        return thresholdUnits;
    }

    public void setThresholdUnits(Double value) {
        this.thresholdUnits = value;
    }

    public Double getUsageUnitsMeasured() {
        return usageUnitsMeasured;
    }

    public void setUsageUnitsMeasured(Double value) {
        this.usageUnitsMeasured = value;
    }

    public List<ThresholdLevelsReturnElement> getThresholdLevels() {
        if (this.thresholdLevels == null) {
            this.thresholdLevels = new ArrayList<ThresholdLevelsReturnElement>();
        }
        return this.thresholdLevels;
    }
}
