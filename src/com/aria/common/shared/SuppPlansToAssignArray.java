package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_to_assign_array", propOrder = {
    "suppPlansToAssignRow"
})
public class SuppPlansToAssignArray {

    @XmlElement(name = "supp_plans_to_assign_row")
    protected List<SuppPlansToAssignRow> suppPlansToAssignRow;

    public List<SuppPlansToAssignRow> getSuppPlansToAssignRow() {
        if (this.suppPlansToAssignRow == null) {
            this.suppPlansToAssignRow = new ArrayList<SuppPlansToAssignRow>();
        }
        return this.suppPlansToAssignRow;
    }

}
