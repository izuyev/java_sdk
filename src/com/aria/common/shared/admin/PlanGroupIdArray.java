package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_id_array", propOrder = {
    "planGroupIdRow"
})
public class PlanGroupIdArray {

    @XmlElement(name = "plan_group_id_row")
    protected List<PlanGroupIdRow> planGroupIdRow;

    public List<PlanGroupIdRow> getPlanGroupIdRow() {
        if (this.planGroupIdRow == null) {
            this.planGroupIdRow = new ArrayList<PlanGroupIdRow>();
        }
        return this.planGroupIdRow;
    }

}
