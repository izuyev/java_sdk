package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child_plans_array", propOrder = {
    "childPlansRow"
})
public class ChildPlansArray {

    @XmlElement(name = "child_plans_row")
    protected List<ChildPlansRow> childPlansRow;

    public List<ChildPlansRow> getChildPlansRow() {
        if (this.childPlansRow == null) {
            this.childPlansRow = new ArrayList<ChildPlansRow>();
        }
        return this.childPlansRow;
    }

}
