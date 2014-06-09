package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_enable_usage_pooling_plan_no_row", propOrder = {
    "a5EnableUsagePoolingPlanNo",
    "a5ClientEnableUsgPoolPlanId"
    })
public class A5EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a5_enable_usage_pooling_plan_no")
    protected Long a5EnableUsagePoolingPlanNo;
    @XmlElement(name = "a5_client_enable_usg_pool_plan_id")
    protected String a5ClientEnableUsgPoolPlanId;
    public Long getA5EnableUsagePoolingPlanNo() {
        return a5EnableUsagePoolingPlanNo;
    }

    public void setA5EnableUsagePoolingPlanNo(Long value) {
        this.a5EnableUsagePoolingPlanNo = value;
    }

    public String getA5ClientEnableUsgPoolPlanId() {
        return a5ClientEnableUsgPoolPlanId;
    }

    public void setA5ClientEnableUsgPoolPlanId(String value) {
        this.a5ClientEnableUsgPoolPlanId = value;
    }

    
}
