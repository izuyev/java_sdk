package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_plans_array", propOrder = {
    "a4SuppPlansRow"
})
public class A4SuppPlansArray {

    @XmlElement(name = "a4_supp_plans_row")
    protected List<A4SuppPlansRow> a4SuppPlansRow;

    public List<A4SuppPlansRow> getA4SuppPlansRow() {
        if (this.a4SuppPlansRow == null) {
            this.a4SuppPlansRow = new ArrayList<A4SuppPlansRow>();
        }
        return this.a4SuppPlansRow;
    }

}
