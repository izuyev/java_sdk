package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_field_names_array", propOrder = {
    "a2SuppFieldNamesRow"
})
public class A2SuppFieldNamesArray {

    @XmlElement(name = "a2_supp_field_names_row")
    protected List<A2SuppFieldNamesRow> a2SuppFieldNamesRow;

    public List<A2SuppFieldNamesRow> getA2SuppFieldNamesRow() {
        if (this.a2SuppFieldNamesRow == null) {
            this.a2SuppFieldNamesRow = new ArrayList<A2SuppFieldNamesRow>();
        }
        return this.a2SuppFieldNamesRow;
    }

}
