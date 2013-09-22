package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disable_usage_pooling_plan_no_array", propOrder = {
    "disableUsagePoolingPlanNoRow"
})
public class DisableUsagePoolingPlanNoArray {

    @XmlElement(name = "disable_usage_pooling_plan_no_row")
    protected List<DisableUsagePoolingPlanNoRow> disableUsagePoolingPlanNoRow;

    public List<DisableUsagePoolingPlanNoRow> getDisableUsagePoolingPlanNoRow() {
        if (this.disableUsagePoolingPlanNoRow == null) {
            this.disableUsagePoolingPlanNoRow = new ArrayList<DisableUsagePoolingPlanNoRow>();
        }
        return this.disableUsagePoolingPlanNoRow;
    }

}
