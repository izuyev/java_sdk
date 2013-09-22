package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enable_usage_pooling_plan_no_row", propOrder = {
    "enableUsagePoolingPlanNo"
    })
public class EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "enable_usage_pooling_plan_no")
    protected Long enableUsagePoolingPlanNo;
    public Long getEnableUsagePoolingPlanNo() {
        return enableUsagePoolingPlanNo;
    }

    public void setEnableUsagePoolingPlanNo(Long value) {
        this.enableUsagePoolingPlanNo = value;
    }

    
}
