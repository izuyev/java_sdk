package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_plans_array", propOrder = {
    "a3SuppPlansRow"
})
public class A3SuppPlansArray {

    @XmlElement(name = "a3_supp_plans_row")
    protected List<A3SuppPlansRow> a3SuppPlansRow;

    public List<A3SuppPlansRow> getA3SuppPlansRow() {
        if (this.a3SuppPlansRow == null) {
            this.a3SuppPlansRow = new ArrayList<A3SuppPlansRow>();
        }
        return this.a3SuppPlansRow;
    }

}
