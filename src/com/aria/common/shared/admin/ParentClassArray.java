package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_class_array", propOrder = {
    "parentClassRow"
})
public class ParentClassArray {

    @XmlElement(name = "parent_class_row")
    protected List<ParentClassRow> parentClassRow;

    public List<ParentClassRow> getParentClassRow() {
        if (this.parentClassRow == null) {
            this.parentClassRow = new ArrayList<ParentClassRow>();
        }
        return this.parentClassRow;
    }

}
