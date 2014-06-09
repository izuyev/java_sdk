package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_nos_array", propOrder = {
    "planNosRow"
})
public class PlanNosArray {

    @XmlElement(name = "plan_nos_row")
    protected List<PlanNosRow> planNosRow;

    public List<PlanNosRow> getPlanNosRow() {
        if (this.planNosRow == null) {
            this.planNosRow = new ArrayList<PlanNosRow>();
        }
        return this.planNosRow;
    }

}
