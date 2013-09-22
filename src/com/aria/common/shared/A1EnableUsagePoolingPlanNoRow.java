package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_enable_usage_pooling_plan_no_row", propOrder = {
    "a1EnableUsagePoolingPlanNo"
    })
public class A1EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a1_enable_usage_pooling_plan_no")
    protected Long a1EnableUsagePoolingPlanNo;
    public Long getA1EnableUsagePoolingPlanNo() {
        return a1EnableUsagePoolingPlanNo;
    }

    public void setA1EnableUsagePoolingPlanNo(Long value) {
        this.a1EnableUsagePoolingPlanNo = value;
    }

    
}
