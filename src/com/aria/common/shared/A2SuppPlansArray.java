package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_plans_array", propOrder = {
    "a2SuppPlansRow"
})
public class A2SuppPlansArray {

    @XmlElement(name = "a2_supp_plans_row")
    protected List<A2SuppPlansRow> a2SuppPlansRow;

    public List<A2SuppPlansRow> getA2SuppPlansRow() {
        if (this.a2SuppPlansRow == null) {
            this.a2SuppPlansRow = new ArrayList<A2SuppPlansRow>();
        }
        return this.a2SuppPlansRow;
    }

}
