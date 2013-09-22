package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_no_array", propOrder = {
    "planNoRow"
})
public class PlanNoArray {

    @XmlElement(name = "plan_no_row")
    protected List<PlanNoRow> planNoRow;

    public List<PlanNoRow> getPlanNoRow() {
        if (this.planNoRow == null) {
            this.planNoRow = new ArrayList<PlanNoRow>();
        }
        return this.planNoRow;
    }

}
