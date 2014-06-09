package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusion_plans_array", propOrder = {
    "exclusionPlansRow"
})
public class ExclusionPlansArray {

    @XmlElement(name = "exclusion_plans_row")
    protected List<ExclusionPlansRow> exclusionPlansRow;

    public List<ExclusionPlansRow> getExclusionPlansRow() {
        if (this.exclusionPlansRow == null) {
            this.exclusionPlansRow = new ArrayList<ExclusionPlansRow>();
        }
        return this.exclusionPlansRow;
    }

}
