package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "open_charge_items_ReturnElement", propOrder = {"prorationNo", "lineNo", "postingDate", "serviceNo", "serviceName", "units", "ratePerUnit", "amount", "description", "usageTypeNo", "planNo", "planName"})
public class OpenChargeItemsReturnElement {

    @XmlElement(name = "proration_no")
    protected Long prorationNo;
    @XmlElement(name = "line_no")
    protected Long lineNo;
    @XmlElement(name = "posting_date")
    protected String postingDate;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    
    public Long getProrationNo() {
        return prorationNo;
    }

    public void setProrationNo(Long value) {
        this.prorationNo = value;
    }

    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long value) {
        this.lineNo = value;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    
}
