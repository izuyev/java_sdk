package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_plan_units_array", propOrder = {
    "a1SuppPlanUnitsRow"
})
public class A1SuppPlanUnitsArray {

    @XmlElement(name = "a1_supp_plan_units_row")
    protected List<A1SuppPlanUnitsRow> a1SuppPlanUnitsRow;

    public List<A1SuppPlanUnitsRow> getA1SuppPlanUnitsRow() {
        if (this.a1SuppPlanUnitsRow == null) {
            this.a1SuppPlanUnitsRow = new ArrayList<A1SuppPlanUnitsRow>();
        }
        return this.a1SuppPlanUnitsRow;
    }

}
