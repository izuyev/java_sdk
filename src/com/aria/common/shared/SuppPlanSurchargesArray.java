package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_surcharges_array", propOrder = {
    "suppPlanSurchargesRow"
})
public class SuppPlanSurchargesArray {

    @XmlElement(name = "supp_plan_surcharges_row")
    protected List<SuppPlanSurchargesRow> suppPlanSurchargesRow;

    public List<SuppPlanSurchargesRow> getSuppPlanSurchargesRow() {
        if (this.suppPlanSurchargesRow == null) {
            this.suppPlanSurchargesRow = new ArrayList<SuppPlanSurchargesRow>();
        }
        return this.suppPlanSurchargesRow;
    }

}
