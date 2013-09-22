package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_plan_units_array", propOrder = {
    "a4SuppPlanUnitsRow"
})
public class A4SuppPlanUnitsArray {

    @XmlElement(name = "a4_supp_plan_units_row")
    protected List<A4SuppPlanUnitsRow> a4SuppPlanUnitsRow;

    public List<A4SuppPlanUnitsRow> getA4SuppPlanUnitsRow() {
        if (this.a4SuppPlanUnitsRow == null) {
            this.a4SuppPlanUnitsRow = new ArrayList<A4SuppPlanUnitsRow>();
        }
        return this.a4SuppPlanUnitsRow;
    }

}
