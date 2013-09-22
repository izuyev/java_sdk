package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_enable_usage_pooling_plan_no_array", propOrder = {
    "a3EnableUsagePoolingPlanNoRow"
})
public class A3EnableUsagePoolingPlanNoArray {

    @XmlElement(name = "a3_enable_usage_pooling_plan_no_row")
    protected List<A3EnableUsagePoolingPlanNoRow> a3EnableUsagePoolingPlanNoRow;

    public List<A3EnableUsagePoolingPlanNoRow> getA3EnableUsagePoolingPlanNoRow() {
        if (this.a3EnableUsagePoolingPlanNoRow == null) {
            this.a3EnableUsagePoolingPlanNoRow = new ArrayList<A3EnableUsagePoolingPlanNoRow>();
        }
        return this.a3EnableUsagePoolingPlanNoRow;
    }

}
