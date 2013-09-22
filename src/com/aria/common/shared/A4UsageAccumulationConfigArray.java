package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_usage_accumulation_config_array", propOrder = {
    "a4UsageAccumulationConfigRow"
})
public class A4UsageAccumulationConfigArray {

    @XmlElement(name = "a4_usage_accumulation_config_row")
    protected List<A4UsageAccumulationConfigRow> a4UsageAccumulationConfigRow;

    public List<A4UsageAccumulationConfigRow> getA4UsageAccumulationConfigRow() {
        if (this.a4UsageAccumulationConfigRow == null) {
            this.a4UsageAccumulationConfigRow = new ArrayList<A4UsageAccumulationConfigRow>();
        }
        return this.a4UsageAccumulationConfigRow;
    }

}
