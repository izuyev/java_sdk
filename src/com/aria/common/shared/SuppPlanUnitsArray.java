package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_units_array", propOrder = {
    "suppPlanUnitsRow"
})
public class SuppPlanUnitsArray {

    @XmlElement(name = "supp_plan_units_row")
    protected List<SuppPlanUnitsRow> suppPlanUnitsRow;

    public List<SuppPlanUnitsRow> getSuppPlanUnitsRow() {
        if (this.suppPlanUnitsRow == null) {
            this.suppPlanUnitsRow = new ArrayList<SuppPlanUnitsRow>();
        }
        return this.suppPlanUnitsRow;
    }

}
