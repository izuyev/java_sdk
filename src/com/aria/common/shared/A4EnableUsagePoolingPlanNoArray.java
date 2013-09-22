package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_enable_usage_pooling_plan_no_array", propOrder = {
    "a4EnableUsagePoolingPlanNoRow"
})
public class A4EnableUsagePoolingPlanNoArray {

    @XmlElement(name = "a4_enable_usage_pooling_plan_no_row")
    protected List<A4EnableUsagePoolingPlanNoRow> a4EnableUsagePoolingPlanNoRow;

    public List<A4EnableUsagePoolingPlanNoRow> getA4EnableUsagePoolingPlanNoRow() {
        if (this.a4EnableUsagePoolingPlanNoRow == null) {
            this.a4EnableUsagePoolingPlanNoRow = new ArrayList<A4EnableUsagePoolingPlanNoRow>();
        }
        return this.a4EnableUsagePoolingPlanNoRow;
    }

}
