package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_enable_usage_pooling_plan_no_array", propOrder = {
    "a2EnableUsagePoolingPlanNoRow"
})
public class A2EnableUsagePoolingPlanNoArray {

    @XmlElement(name = "a2_enable_usage_pooling_plan_no_row")
    protected List<A2EnableUsagePoolingPlanNoRow> a2EnableUsagePoolingPlanNoRow;

    public List<A2EnableUsagePoolingPlanNoRow> getA2EnableUsagePoolingPlanNoRow() {
        if (this.a2EnableUsagePoolingPlanNoRow == null) {
            this.a2EnableUsagePoolingPlanNoRow = new ArrayList<A2EnableUsagePoolingPlanNoRow>();
        }
        return this.a2EnableUsagePoolingPlanNoRow;
    }

}
