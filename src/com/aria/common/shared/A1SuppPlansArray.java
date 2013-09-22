package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_plans_array", propOrder = {
    "a1SuppPlansRow"
})
public class A1SuppPlansArray {

    @XmlElement(name = "a1_supp_plans_row")
    protected List<A1SuppPlansRow> a1SuppPlansRow;

    public List<A1SuppPlansRow> getA1SuppPlansRow() {
        if (this.a1SuppPlansRow == null) {
            this.a1SuppPlansRow = new ArrayList<A1SuppPlansRow>();
        }
        return this.a1SuppPlansRow;
    }

}
