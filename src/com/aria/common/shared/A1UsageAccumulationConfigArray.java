package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_usage_accumulation_config_array", propOrder = {
    "a1UsageAccumulationConfigRow"
})
public class A1UsageAccumulationConfigArray {

    @XmlElement(name = "a1_usage_accumulation_config_row")
    protected List<A1UsageAccumulationConfigRow> a1UsageAccumulationConfigRow;

    public List<A1UsageAccumulationConfigRow> getA1UsageAccumulationConfigRow() {
        if (this.a1UsageAccumulationConfigRow == null) {
            this.a1UsageAccumulationConfigRow = new ArrayList<A1UsageAccumulationConfigRow>();
        }
        return this.a1UsageAccumulationConfigRow;
    }

}
