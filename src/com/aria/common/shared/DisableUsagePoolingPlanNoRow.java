package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disable_usage_pooling_plan_no_row", propOrder = {
    "disableUsagePoolingPlanNo",
    "clientDisableUsagePoolPlanId"
    })
public class DisableUsagePoolingPlanNoRow {

    @XmlElement(name = "disable_usage_pooling_plan_no")
    protected Long disableUsagePoolingPlanNo;
    @XmlElement(name = "client_disable_usage_pool_plan_id")
    protected String clientDisableUsagePoolPlanId;
    public Long getDisableUsagePoolingPlanNo() {
        return disableUsagePoolingPlanNo;
    }

    public void setDisableUsagePoolingPlanNo(Long value) {
        this.disableUsagePoolingPlanNo = value;
    }

    public String getClientDisableUsagePoolPlanId() {
        return clientDisableUsagePoolPlanId;
    }

    public void setClientDisableUsagePoolPlanId(String value) {
        this.clientDisableUsagePoolPlanId = value;
    }

    
}
