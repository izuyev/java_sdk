package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_enable_usage_pooling_plan_no_row", propOrder = {
    "a3EnableUsagePoolingPlanNo",
    "a3ClientEnableUsgPoolPlanId",
    "a3UsageThresholdApplicability"
    })
public class A3EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a3_enable_usage_pooling_plan_no")
    protected Long a3EnableUsagePoolingPlanNo;
    @XmlElement(name = "a3_client_enable_usg_pool_plan_id")
    protected String a3ClientEnableUsgPoolPlanId;
    @XmlElement(name = "a3_usage_threshold_applicability")
    protected String a3UsageThresholdApplicability;
    public Long getA3EnableUsagePoolingPlanNo() {
        return a3EnableUsagePoolingPlanNo;
    }

    public void setA3EnableUsagePoolingPlanNo(Long value) {
        this.a3EnableUsagePoolingPlanNo = value;
    }

    public String getA3ClientEnableUsgPoolPlanId() {
        return a3ClientEnableUsgPoolPlanId;
    }

    public void setA3ClientEnableUsgPoolPlanId(String value) {
        this.a3ClientEnableUsgPoolPlanId = value;
    }

    public String getA3UsageThresholdApplicability() {
        return a3UsageThresholdApplicability;
    }

    public void setA3UsageThresholdApplicability(String value) {
        this.a3UsageThresholdApplicability = value;
    }

    
}
