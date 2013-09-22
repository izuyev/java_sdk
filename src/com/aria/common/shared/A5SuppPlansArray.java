package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_plans_array", propOrder = {
    "a5SuppPlansRow"
})
public class A5SuppPlansArray {

    @XmlElement(name = "a5_supp_plans_row")
    protected List<A5SuppPlansRow> a5SuppPlansRow;

    public List<A5SuppPlansRow> getA5SuppPlansRow() {
        if (this.a5SuppPlansRow == null) {
            this.a5SuppPlansRow = new ArrayList<A5SuppPlansRow>();
        }
        return this.a5SuppPlansRow;
    }

}
