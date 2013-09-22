package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_enable_usage_pooling_plan_no_row", propOrder = {
    "a2EnableUsagePoolingPlanNo"
    })
public class A2EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a2_enable_usage_pooling_plan_no")
    protected Long a2EnableUsagePoolingPlanNo;
    public Long getA2EnableUsagePoolingPlanNo() {
        return a2EnableUsagePoolingPlanNo;
    }

    public void setA2EnableUsagePoolingPlanNo(Long value) {
        this.a2EnableUsagePoolingPlanNo = value;
    }

    
}
