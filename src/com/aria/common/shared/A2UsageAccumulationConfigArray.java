package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_usage_accumulation_config_array", propOrder = {
    "a2UsageAccumulationConfigRow"
})
public class A2UsageAccumulationConfigArray {

    @XmlElement(name = "a2_usage_accumulation_config_row")
    protected List<A2UsageAccumulationConfigRow> a2UsageAccumulationConfigRow;

    public List<A2UsageAccumulationConfigRow> getA2UsageAccumulationConfigRow() {
        if (this.a2UsageAccumulationConfigRow == null) {
            this.a2UsageAccumulationConfigRow = new ArrayList<A2UsageAccumulationConfigRow>();
        }
        return this.a2UsageAccumulationConfigRow;
    }

}
