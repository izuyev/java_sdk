package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_enable_usage_pooling_plan_no_row", propOrder = {
    "a4EnableUsagePoolingPlanNo",
    "a4ClientEnableUsgPoolPlanId",
    "a4UsageThresholdApplicability"
    })
public class A4EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a4_enable_usage_pooling_plan_no")
    protected Long a4EnableUsagePoolingPlanNo;
    @XmlElement(name = "a4_client_enable_usg_pool_plan_id")
    protected String a4ClientEnableUsgPoolPlanId;
    @XmlElement(name = "a4_usage_threshold_applicability")
    protected String a4UsageThresholdApplicability;
    public Long getA4EnableUsagePoolingPlanNo() {
        return a4EnableUsagePoolingPlanNo;
    }

    public void setA4EnableUsagePoolingPlanNo(Long value) {
        this.a4EnableUsagePoolingPlanNo = value;
    }

    public String getA4ClientEnableUsgPoolPlanId() {
        return a4ClientEnableUsgPoolPlanId;
    }

    public void setA4ClientEnableUsgPoolPlanId(String value) {
        this.a4ClientEnableUsgPoolPlanId = value;
    }

    public String getA4UsageThresholdApplicability() {
        return a4UsageThresholdApplicability;
    }

    public void setA4UsageThresholdApplicability(String value) {
        this.a4UsageThresholdApplicability = value;
    }

    
}
