package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_enable_usage_pooling_plan_no_row", propOrder = {
    "a4EnableUsagePoolingPlanNo"
    })
public class A4EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a4_enable_usage_pooling_plan_no")
    protected Long a4EnableUsagePoolingPlanNo;
    public Long getA4EnableUsagePoolingPlanNo() {
        return a4EnableUsagePoolingPlanNo;
    }

    public void setA4EnableUsagePoolingPlanNo(Long value) {
        this.a4EnableUsagePoolingPlanNo = value;
    }

    
}
