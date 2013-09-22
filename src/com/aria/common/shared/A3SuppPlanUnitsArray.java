package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_plan_units_array", propOrder = {
    "a3SuppPlanUnitsRow"
})
public class A3SuppPlanUnitsArray {

    @XmlElement(name = "a3_supp_plan_units_row")
    protected List<A3SuppPlanUnitsRow> a3SuppPlanUnitsRow;

    public List<A3SuppPlanUnitsRow> getA3SuppPlanUnitsRow() {
        if (this.a3SuppPlanUnitsRow == null) {
            this.a3SuppPlanUnitsRow = new ArrayList<A3SuppPlanUnitsRow>();
        }
        return this.a3SuppPlanUnitsRow;
    }

}
