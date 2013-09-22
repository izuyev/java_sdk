package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_array", propOrder = {
    "suppPlansRow"
})
public class SuppPlansArray {

    @XmlElement(name = "supp_plans_row")
    protected List<SuppPlansRow> suppPlansRow;

    public List<SuppPlansRow> getSuppPlansRow() {
        if (this.suppPlansRow == null) {
            this.suppPlansRow = new ArrayList<SuppPlansRow>();
        }
        return this.suppPlansRow;
    }

}
