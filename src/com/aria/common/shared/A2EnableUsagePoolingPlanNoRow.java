package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_enable_usage_pooling_plan_no_row", propOrder = {
    "a2EnableUsagePoolingPlanNo",
    "a2ClientEnableUsgPoolPlanId"
    })
public class A2EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a2_enable_usage_pooling_plan_no")
    protected Long a2EnableUsagePoolingPlanNo;
    @XmlElement(name = "a2_client_enable_usg_pool_plan_id")
    protected String a2ClientEnableUsgPoolPlanId;
    public Long getA2EnableUsagePoolingPlanNo() {
        return a2EnableUsagePoolingPlanNo;
    }

    public void setA2EnableUsagePoolingPlanNo(Long value) {
        this.a2EnableUsagePoolingPlanNo = value;
    }

    public String getA2ClientEnableUsgPoolPlanId() {
        return a2ClientEnableUsgPoolPlanId;
    }

    public void setA2ClientEnableUsgPoolPlanId(String value) {
        this.a2ClientEnableUsgPoolPlanId = value;
    }

    
}
