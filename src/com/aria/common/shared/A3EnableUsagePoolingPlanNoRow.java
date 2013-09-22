package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_enable_usage_pooling_plan_no_row", propOrder = {
    "a3EnableUsagePoolingPlanNo"
    })
public class A3EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "a3_enable_usage_pooling_plan_no")
    protected Long a3EnableUsagePoolingPlanNo;
    public Long getA3EnableUsagePoolingPlanNo() {
        return a3EnableUsagePoolingPlanNo;
    }

    public void setA3EnableUsagePoolingPlanNo(Long value) {
        this.a3EnableUsagePoolingPlanNo = value;
    }

    
}
