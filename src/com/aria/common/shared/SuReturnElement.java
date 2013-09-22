package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "su_ReturnElement", propOrder = {"standingUsageRecNo", "usageType", "usageUnits", "nextUsageDate", "altDesc", "planNo", "firstUsageDate", "recurringInd", "usageTypeCode"})
public class SuReturnElement {

    @XmlElement(name = "standing_usage_rec_no")
    protected Long standingUsageRecNo;
    @XmlElement(name = "usage_type")
    protected Long usageType;
    @XmlElement(name = "usage_units")
    protected Double usageUnits;
    @XmlElement(name = "next_usage_date")
    protected String nextUsageDate;
    @XmlElement(name = "alt_desc")
    protected String altDesc;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "first_usage_date")
    protected String firstUsageDate;
    @XmlElement(name = "recurring_ind")
    protected Long recurringInd;
    @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
    
    public Long getStandingUsageRecNo() {
        return standingUsageRecNo;
    }

    public void setStandingUsageRecNo(Long value) {
        this.standingUsageRecNo = value;
    }

    public Long getUsageType() {
        return usageType;
    }

    public void setUsageType(Long value) {
        this.usageType = value;
    }

    public Double getUsageUnits() {
        return usageUnits;
    }

    public void setUsageUnits(Double value) {
        this.usageUnits = value;
    }

    public String getNextUsageDate() {
        return nextUsageDate;
    }

    public void setNextUsageDate(String value) {
        this.nextUsageDate = value;
    }

    public String getAltDesc() {
        return altDesc;
    }

    public void setAltDesc(String value) {
        this.altDesc = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getFirstUsageDate() {
        return firstUsageDate;
    }

    public void setFirstUsageDate(String value) {
        this.firstUsageDate = value;
    }

    public Long getRecurringInd() {
        return recurringInd;
    }

    public void setRecurringInd(Long value) {
        this.recurringInd = value;
    }

    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }

    
}
