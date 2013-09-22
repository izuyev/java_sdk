package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enable_usage_pooling_plan_no_array", propOrder = {
    "enableUsagePoolingPlanNoRow"
})
public class EnableUsagePoolingPlanNoArray {

    @XmlElement(name = "enable_usage_pooling_plan_no_row")
    protected List<EnableUsagePoolingPlanNoRow> enableUsagePoolingPlanNoRow;

    public List<EnableUsagePoolingPlanNoRow> getEnableUsagePoolingPlanNoRow() {
        if (this.enableUsagePoolingPlanNoRow == null) {
            this.enableUsagePoolingPlanNoRow = new ArrayList<EnableUsagePoolingPlanNoRow>();
        }
        return this.enableUsagePoolingPlanNoRow;
    }

}
