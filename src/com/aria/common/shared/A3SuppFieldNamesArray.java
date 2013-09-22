package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_field_names_array", propOrder = {
    "a3SuppFieldNamesRow"
})
public class A3SuppFieldNamesArray {

    @XmlElement(name = "a3_supp_field_names_row")
    protected List<A3SuppFieldNamesRow> a3SuppFieldNamesRow;

    public List<A3SuppFieldNamesRow> getA3SuppFieldNamesRow() {
        if (this.a3SuppFieldNamesRow == null) {
            this.a3SuppFieldNamesRow = new ArrayList<A3SuppFieldNamesRow>();
        }
        return this.a3SuppFieldNamesRow;
    }

}
