package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_usage_accumulation_config_array", propOrder = {
    "a3UsageAccumulationConfigRow"
})
public class A3UsageAccumulationConfigArray {

    @XmlElement(name = "a3_usage_accumulation_config_row")
    protected List<A3UsageAccumulationConfigRow> a3UsageAccumulationConfigRow;

    public List<A3UsageAccumulationConfigRow> getA3UsageAccumulationConfigRow() {
        if (this.a3UsageAccumulationConfigRow == null) {
            this.a3UsageAccumulationConfigRow = new ArrayList<A3UsageAccumulationConfigRow>();
        }
        return this.a3UsageAccumulationConfigRow;
    }

}
