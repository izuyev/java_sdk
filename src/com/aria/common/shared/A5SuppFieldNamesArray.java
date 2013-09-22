package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_field_names_array", propOrder = {
    "a5SuppFieldNamesRow"
})
public class A5SuppFieldNamesArray {

    @XmlElement(name = "a5_supp_field_names_row")
    protected List<A5SuppFieldNamesRow> a5SuppFieldNamesRow;

    public List<A5SuppFieldNamesRow> getA5SuppFieldNamesRow() {
        if (this.a5SuppFieldNamesRow == null) {
            this.a5SuppFieldNamesRow = new ArrayList<A5SuppFieldNamesRow>();
        }
        return this.a5SuppFieldNamesRow;
    }

}
