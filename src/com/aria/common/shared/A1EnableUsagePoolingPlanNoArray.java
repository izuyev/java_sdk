package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_enable_usage_pooling_plan_no_array", propOrder = {
    "a1EnableUsagePoolingPlanNoRow"
})
public class A1EnableUsagePoolingPlanNoArray {

    @XmlElement(name = "a1_enable_usage_pooling_plan_no_row")
    protected List<A1EnableUsagePoolingPlanNoRow> a1EnableUsagePoolingPlanNoRow;

    public List<A1EnableUsagePoolingPlanNoRow> getA1EnableUsagePoolingPlanNoRow() {
        if (this.a1EnableUsagePoolingPlanNoRow == null) {
            this.a1EnableUsagePoolingPlanNoRow = new ArrayList<A1EnableUsagePoolingPlanNoRow>();
        }
        return this.a1EnableUsagePoolingPlanNoRow;
    }

}
