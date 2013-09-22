package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disable_usage_pooling_plan_no_row", propOrder = {
    "disableUsagePoolingPlanNo"
    })
public class DisableUsagePoolingPlanNoRow {

    @XmlElement(name = "disable_usage_pooling_plan_no")
    protected Long disableUsagePoolingPlanNo;
    public Long getDisableUsagePoolingPlanNo() {
        return disableUsagePoolingPlanNo;
    }

    public void setDisableUsagePoolingPlanNo(Long value) {
        this.disableUsagePoolingPlanNo = value;
    }

    
}
