package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_enable_usage_pooling_plan_no_array", propOrder = {
    "a5EnableUsagePoolingPlanNoRow"
})
public class A5EnableUsagePoolingPlanNoArray {

    @XmlElement(name = "a5_enable_usage_pooling_plan_no_row")
    protected List<A5EnableUsagePoolingPlanNoRow> a5EnableUsagePoolingPlanNoRow;

    public List<A5EnableUsagePoolingPlanNoRow> getA5EnableUsagePoolingPlanNoRow() {
        if (this.a5EnableUsagePoolingPlanNoRow == null) {
            this.a5EnableUsagePoolingPlanNoRow = new ArrayList<A5EnableUsagePoolingPlanNoRow>();
        }
        return this.a5EnableUsagePoolingPlanNoRow;
    }

}
