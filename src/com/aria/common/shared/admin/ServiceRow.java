package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_row", propOrder = {
    "serviceNo",
    "pricingRule",
    "highWater",
    "billingOption",
    "threshold",
    "tier"
    })
public class ServiceRow {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "pricing_rule")
    protected String pricingRule;
    @XmlElement(name = "high_water")
    protected String highWater;
    @XmlElement(name = "billing_option")
    protected Long billingOption;
    @XmlElement(name = "threshold")
    protected Long threshold;
    @XmlElement(name = "tier")
    protected com.aria.common.shared.admin.TierArray tier;
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getPricingRule() {
        return pricingRule;
    }

    public void setPricingRule(String value) {
        this.pricingRule = value;
    }

    public String getHighWater() {
        return highWater;
    }

    public void setHighWater(String value) {
        this.highWater = value;
    }

    public Long getBillingOption() {
        return billingOption;
    }

    public void setBillingOption(Long value) {
        this.billingOption = value;
    }

    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long value) {
        this.threshold = value;
    }

    public com.aria.common.shared.admin.TierArray getTier() {
        return tier;
    }

    public void setTier(com.aria.common.shared.admin.TierArray value) {
        this.tier = value;
    }

    
}
