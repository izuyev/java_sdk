package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_field_names_array", propOrder = {
    "a4SuppFieldNamesRow"
})
public class A4SuppFieldNamesArray {

    @XmlElement(name = "a4_supp_field_names_row")
    protected List<A4SuppFieldNamesRow> a4SuppFieldNamesRow;

    public List<A4SuppFieldNamesRow> getA4SuppFieldNamesRow() {
        if (this.a4SuppFieldNamesRow == null) {
            this.a4SuppFieldNamesRow = new ArrayList<A4SuppFieldNamesRow>();
        }
        return this.a4SuppFieldNamesRow;
    }

}
