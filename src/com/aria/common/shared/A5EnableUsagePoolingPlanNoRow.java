package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_enable_usage_pooling_plan_no_row", propOrder = {
    "a5EnableUsagePoolingPlanNo"
    })
public class A5EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a5_enable_usage_pooling_plan_no")
    protected Long a5EnableUsagePoolingPlanNo;
    public Long getA5EnableUsagePoolingPlanNo() {
        return a5EnableUsagePoolingPlanNo;
    }

    public void setA5EnableUsagePoolingPlanNo(Long value) {
        this.a5EnableUsagePoolingPlanNo = value;
    }

    
}
