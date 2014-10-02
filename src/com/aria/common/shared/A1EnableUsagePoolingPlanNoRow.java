package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_enable_usage_pooling_plan_no_row", propOrder = {
    "a1EnableUsagePoolingPlanNo",
    "a1ClientEnableUsgPoolPlanId",
    "a1UsageThresholdApplicability"
    })
public class A1EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a1_enable_usage_pooling_plan_no")
    protected Long a1EnableUsagePoolingPlanNo;
    @XmlElement(name = "a1_client_enable_usg_pool_plan_id")
    protected String a1ClientEnableUsgPoolPlanId;
    @XmlElement(name = "a1_usage_threshold_applicability")
    protected String a1UsageThresholdApplicability;
    public Long getA1EnableUsagePoolingPlanNo() {
        return a1EnableUsagePoolingPlanNo;
    }

    public void setA1EnableUsagePoolingPlanNo(Long value) {
        this.a1EnableUsagePoolingPlanNo = value;
    }

    public String getA1ClientEnableUsgPoolPlanId() {
        return a1ClientEnableUsgPoolPlanId;
    }

    public void setA1ClientEnableUsgPoolPlanId(String value) {
        this.a1ClientEnableUsgPoolPlanId = value;
    }

    public String getA1UsageThresholdApplicability() {
        return a1UsageThresholdApplicability;
    }

    public void setA1UsageThresholdApplicability(String value) {
        this.a1UsageThresholdApplicability = value;
    }

    
}
