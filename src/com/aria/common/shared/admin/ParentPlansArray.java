package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_plans_array", propOrder = {
    "parentPlansRow"
})
public class ParentPlansArray {

    @XmlElement(name = "parent_plans_row")
    protected List<ParentPlansRow> parentPlansRow;

    public List<ParentPlansRow> getParentPlansRow() {
        if (this.parentPlansRow == null) {
            this.parentPlansRow = new ArrayList<ParentPlansRow>();
        }
        return this.parentPlansRow;
    }

}
