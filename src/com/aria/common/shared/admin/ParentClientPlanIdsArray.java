package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_client_plan_ids_array", propOrder = {
    "parentClientPlanIdsRow"
})
public class ParentClientPlanIdsArray {

    @XmlElement(name = "parent_client_plan_ids_row")
    protected List<ParentClientPlanIdsRow> parentClientPlanIdsRow;

    public List<ParentClientPlanIdsRow> getParentClientPlanIdsRow() {
        if (this.parentClientPlanIdsRow == null) {
            this.parentClientPlanIdsRow = new ArrayList<ParentClientPlanIdsRow>();
        }
        return this.parentClientPlanIdsRow;
    }

}
