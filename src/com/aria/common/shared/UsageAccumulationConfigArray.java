package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_accumulation_config_array", propOrder = {
    "usageAccumulationConfigRow"
})
public class UsageAccumulationConfigArray {

    @XmlElement(name = "usage_accumulation_config_row")
    protected List<UsageAccumulationConfigRow> usageAccumulationConfigRow;

    public List<UsageAccumulationConfigRow> getUsageAccumulationConfigRow() {
        if (this.usageAccumulationConfigRow == null) {
            this.usageAccumulationConfigRow = new ArrayList<UsageAccumulationConfigRow>();
        }
        return this.usageAccumulationConfigRow;
    }

}
