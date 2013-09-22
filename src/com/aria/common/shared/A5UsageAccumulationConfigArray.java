package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_usage_accumulation_config_array", propOrder = {
    "a5UsageAccumulationConfigRow"
})
public class A5UsageAccumulationConfigArray {

    @XmlElement(name = "a5_usage_accumulation_config_row")
    protected List<A5UsageAccumulationConfigRow> a5UsageAccumulationConfigRow;

    public List<A5UsageAccumulationConfigRow> getA5UsageAccumulationConfigRow() {
        if (this.a5UsageAccumulationConfigRow == null) {
            this.a5UsageAccumulationConfigRow = new ArrayList<A5UsageAccumulationConfigRow>();
        }
        return this.a5UsageAccumulationConfigRow;
    }

}
