package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_plan_units_array", propOrder = {
    "a2SuppPlanUnitsRow"
})
public class A2SuppPlanUnitsArray {

    @XmlElement(name = "a2_supp_plan_units_row")
    protected List<A2SuppPlanUnitsRow> a2SuppPlanUnitsRow;

    public List<A2SuppPlanUnitsRow> getA2SuppPlanUnitsRow() {
        if (this.a2SuppPlanUnitsRow == null) {
            this.a2SuppPlanUnitsRow = new ArrayList<A2SuppPlanUnitsRow>();
        }
        return this.a2SuppPlanUnitsRow;
    }

}
