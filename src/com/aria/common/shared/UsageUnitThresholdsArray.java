package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_unit_thresholds_array", propOrder = {
    "usageUnitThresholdsRow"
})
public class UsageUnitThresholdsArray {

    @XmlElement(name = "usage_unit_thresholds_row")
    protected List<UsageUnitThresholdsRow> usageUnitThresholdsRow;

    public List<UsageUnitThresholdsRow> getUsageUnitThresholdsRow() {
        if (this.usageUnitThresholdsRow == null) {
            this.usageUnitThresholdsRow = new ArrayList<UsageUnitThresholdsRow>();
        }
        return this.usageUnitThresholdsRow;
    }

}
