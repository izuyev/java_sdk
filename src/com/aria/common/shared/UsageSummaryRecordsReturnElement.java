package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_summary_records_ReturnElement", propOrder = {"usageTypeNo", "usageTypeLabel", "billedInd", "totalUnits", "totalValueAmount", "totalValueCurrencyCode", "lastUsageDate"})
public class UsageSummaryRecordsReturnElement {

    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_label")
    protected String usageTypeLabel;
    @XmlElement(name = "billed_ind")
    protected Long billedInd;
    @XmlElement(name = "total_units")
    protected Double totalUnits;
    @XmlElement(name = "total_value_amount")
    protected Double totalValueAmount;
    @XmlElement(name = "total_value_currency_code")
    protected String totalValueCurrencyCode;
    @XmlElement(name = "last_usage_date")
    protected String lastUsageDate;
    
    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeLabel() {
        return usageTypeLabel;
    }

    public void setUsageTypeLabel(String value) {
        this.usageTypeLabel = value;
    }

    public Long getBilledInd() {
        return billedInd;
    }

    public void setBilledInd(Long value) {
        this.billedInd = value;
    }

    public Double getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(Double value) {
        this.totalUnits = value;
    }

    public Double getTotalValueAmount() {
        return totalValueAmount;
    }

    public void setTotalValueAmount(Double value) {
        this.totalValueAmount = value;
    }

    public String getTotalValueCurrencyCode() {
        return totalValueCurrencyCode;
    }

    public void setTotalValueCurrencyCode(String value) {
        this.totalValueCurrencyCode = value;
    }

    public String getLastUsageDate() {
        return lastUsageDate;
    }

    public void setLastUsageDate(String value) {
        this.lastUsageDate = value;
    }

    
}
