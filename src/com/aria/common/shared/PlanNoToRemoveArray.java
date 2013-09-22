package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_no_to_remove_array", propOrder = {
    "planNoToRemoveRow"
})
public class PlanNoToRemoveArray {

    @XmlElement(name = "plan_no_to_remove_row")
    protected List<PlanNoToRemoveRow> planNoToRemoveRow;

    public List<PlanNoToRemoveRow> getPlanNoToRemoveRow() {
        if (this.planNoToRemoveRow == null) {
            this.planNoToRemoveRow = new ArrayList<PlanNoToRemoveRow>();
        }
        return this.planNoToRemoveRow;
    }

}
