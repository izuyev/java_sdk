package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_plan_units_array", propOrder = {
    "a5SuppPlanUnitsRow"
})
public class A5SuppPlanUnitsArray {

    @XmlElement(name = "a5_supp_plan_units_row")
    protected List<A5SuppPlanUnitsRow> a5SuppPlanUnitsRow;

    public List<A5SuppPlanUnitsRow> getA5SuppPlanUnitsRow() {
        if (this.a5SuppPlanUnitsRow == null) {
            this.a5SuppPlanUnitsRow = new ArrayList<A5SuppPlanUnitsRow>();
        }
        return this.a5SuppPlanUnitsRow;
    }

}
