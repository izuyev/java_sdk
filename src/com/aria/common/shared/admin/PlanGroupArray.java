package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_array", propOrder = {
    "planGroupRow"
})
public class PlanGroupArray {

    @XmlElement(name = "plan_group_row")
    protected List<PlanGroupRow> planGroupRow;

    public List<PlanGroupRow> getPlanGroupRow() {
        if (this.planGroupRow == null) {
            this.planGroupRow = new ArrayList<PlanGroupRow>();
        }
        return this.planGroupRow;
    }

}
